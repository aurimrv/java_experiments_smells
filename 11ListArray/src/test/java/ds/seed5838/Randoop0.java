package ds.seed5838;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0001");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0002");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0003");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0004");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0005");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0006");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0007");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0008");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0009");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0010");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0011");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0012");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        boolean boolean17 = lista12.vazia();
        lista12.ultimo = '#';
        java.lang.Object[] objArray20 = lista12.item;
        lista0.insere((java.lang.Object) objArray20);
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0013");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0014");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.insere((java.lang.Object) objArray12);
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0015");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        int int20 = lista0.ultimo;
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0016");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.pos = (-1);
        lista0.imprime();
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0017");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0018");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        lista3.primeiro = 'a';
        int int12 = lista3.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0019");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        int int15 = lista0.ultimo;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0020");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0021");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0022");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0023");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0024");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.imprime();
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0025");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0026");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass23 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0027");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.imprime();
        int int17 = lista13.ultimo;
        boolean boolean18 = lista13.vazia();
        boolean boolean19 = lista13.vazia();
        java.lang.Object[] objArray20 = lista13.item;
        lista13.imprime();
        java.lang.Object[] objArray22 = lista13.item;
        java.lang.Object[] objArray23 = lista13.item;
        lista0.insere((java.lang.Object) objArray23);
        java.lang.Class<?> wildcardClass25 = objArray23.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0028");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Class<?> wildcardClass10 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0029");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        lista0.ultimo = (-1);
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0030");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        boolean boolean10 = lista0.vazia();
        lista0.primeiro = 0;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0031");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        int int13 = lista0.ultimo;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0032");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista17.item = objArray22;
        java.lang.Class<?> wildcardClass24 = lista17.getClass();
        lista0.insere((java.lang.Object) lista17);
        int int26 = lista17.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0033");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0034");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0035");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        boolean boolean17 = lista12.vazia();
        lista12.ultimo = '#';
        java.lang.Object[] objArray20 = lista12.item;
        lista0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0036");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        int int17 = lista0.pos;
        lista0.primeiro = (-1);
        boolean boolean20 = lista0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0037");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0038");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        lista11.ultimo = ' ';
        lista11.ultimo = (short) 10;
        lista0.insere((java.lang.Object) (short) 10);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0039");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100.0d, (byte) 100, lista11, 1L };
        lista0.item = objArray13;
        int int15 = lista0.pos;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0040");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0041");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0042");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray20 = lista7.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0]");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0043");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        lista3.ultimo = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0044");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.primeiro = (byte) 10;
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0045");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.imprime();
        int int12 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0046");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        lista6.pos = (byte) 0;
        int int12 = lista6.pos;
        java.lang.Object[] objArray13 = lista6.item;
        lista0.item = objArray13;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0047");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        int int9 = lista3.primeiro;
        lista3.ultimo = 0;
        lista3.primeiro = 0;
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass14);
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0048");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0049");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        lista18.insere((java.lang.Object) 0L);
        lista18.ultimo = '#';
        lista18.pos = 10;
        ds.Lista lista27 = new ds.Lista();
        lista27.pos = 10;
        lista27.pos = (byte) 100;
        int int32 = lista27.pos;
        lista27.pos = (byte) 100;
        int int35 = lista27.pos;
        lista18.insere((java.lang.Object) int35);
        lista0.insere((java.lang.Object) int35);
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        lista38.ultimo = 0;
        java.lang.Object[] objArray47 = lista38.item;
        lista0.insere((java.lang.Object) objArray47);
        java.lang.Class<?> wildcardClass49 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0050");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        int int11 = lista0.pos;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0051");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        lista9.pos = 100;
        lista9.pos = (byte) 0;
        lista6.insere((java.lang.Object) (byte) 0);
        lista6.primeiro = 'a';
        lista0.insere((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0052");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.imprime();
        int int17 = lista13.ultimo;
        boolean boolean18 = lista13.vazia();
        boolean boolean19 = lista13.vazia();
        java.lang.Object[] objArray20 = lista13.item;
        lista13.imprime();
        java.lang.Object[] objArray22 = lista13.item;
        java.lang.Object[] objArray23 = lista13.item;
        lista0.insere((java.lang.Object) objArray23);
        lista0.ultimo = 100;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0053");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        lista0.primeiro = (short) -1;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0054");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        int int10 = lista0.primeiro;
        int int11 = lista0.primeiro;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0055");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        boolean boolean17 = lista12.vazia();
        lista12.ultimo = '#';
        java.lang.Object[] objArray20 = lista12.item;
        lista0.insere((java.lang.Object) objArray20);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0056");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        int int12 = lista0.ultimo;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0057");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.primeiro;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0058");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Class<?> wildcardClass20 = objArray18.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0059");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Class<?> wildcardClass16 = objArray15.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0060");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        int int8 = lista4.ultimo;
        int int9 = lista4.ultimo;
        java.lang.Class<?> wildcardClass10 = lista4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0061");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.pos = (byte) 100;
        int int13 = lista8.pos;
        lista8.pos = (byte) 100;
        lista8.pos = 100;
        lista8.pos = (byte) 0;
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        lista20.pos = (byte) 100;
        java.lang.Object[] objArray25 = lista20.item;
        lista8.item = objArray25;
        int int27 = lista8.pos;
        lista0.insere((java.lang.Object) int27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0062");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.imprime();
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0063");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass20 = lista7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0064");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.pos;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0065");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0066");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.primeiro;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0067");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0068");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0069");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        lista0.ultimo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0070");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100.0d, (byte) 100, lista11, 1L };
        lista0.item = objArray13;
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0071");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0072");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        int int13 = lista0.ultimo;
        int int14 = lista0.pos;
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0073");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.pos = 0;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0074");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.imprime();
        lista7.primeiro = (short) 0;
        java.lang.Object[] objArray13 = lista7.item;
        java.lang.Object[] objArray14 = lista7.item;
        lista0.item = objArray14;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0075");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        int int9 = lista3.primeiro;
        lista3.ultimo = 0;
        lista3.primeiro = 0;
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass14);
        java.lang.Object[] objArray16 = lista0.item;
        boolean boolean17 = lista0.vazia();
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0076");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        lista14.pos = 100;
        lista14.pos = (byte) 0;
        int int26 = lista14.pos;
        lista14.primeiro = '#';
        int int29 = lista14.primeiro;
        lista0.insere((java.lang.Object) int29);
        lista0.ultimo = '#';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0077");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.primeiro;
        int int9 = lista0.primeiro;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0078");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0079");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.pos;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0080");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0081");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        int int8 = lista4.ultimo;
        int int9 = lista4.ultimo;
        int int10 = lista4.ultimo;
        lista4.ultimo = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0082");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        lista0.ultimo = (short) -1;
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0083");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = 0;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0084");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (short) 100;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0085");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        boolean boolean18 = lista0.vazia();
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0086");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0087");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.pos;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0088");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0089");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        java.lang.Object obj8 = null;
        lista0.insere(obj8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0090");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        int int26 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0091");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        lista16.primeiro = (byte) -1;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0092");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0093");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        lista9.primeiro = (short) 0;
        java.lang.Object[] objArray15 = lista9.item;
        java.lang.Object[] objArray16 = lista9.item;
        lista0.item = objArray16;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0094");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.imprime();
        int int33 = lista29.ultimo;
        boolean boolean34 = lista29.vazia();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        lista35.imprime();
        boolean boolean38 = lista35.vazia();
        int int39 = lista35.primeiro;
        java.lang.Object[] objArray40 = lista35.item;
        lista29.item = objArray40;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0095");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.primeiro;
        java.lang.Object[] objArray14 = lista9.item;
        lista0.insere((java.lang.Object) objArray14);
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0096");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0097");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        boolean boolean16 = lista13.vazia();
        lista13.pos = (byte) 0;
        int int19 = lista13.pos;
        lista13.imprime();
        java.lang.Object[] objArray21 = lista13.item;
        lista0.item = objArray21;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0098");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0099");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.pos = ' ';
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        java.lang.Object[] objArray29 = lista24.item;
        lista12.item = objArray29;
        lista0.item = objArray29;
        lista0.primeiro = 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0100");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        lista18.insere((java.lang.Object) 0L);
        lista18.ultimo = '#';
        lista18.pos = 10;
        ds.Lista lista27 = new ds.Lista();
        lista27.pos = 10;
        lista27.pos = (byte) 100;
        int int32 = lista27.pos;
        lista27.pos = (byte) 100;
        int int35 = lista27.pos;
        lista18.insere((java.lang.Object) int35);
        lista0.insere((java.lang.Object) int35);
        int int38 = lista0.pos;
        java.lang.Class<?> wildcardClass39 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0101");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        lista6.ultimo = 32;
        lista6.pos = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0102");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.primeiro;
        boolean boolean13 = lista3.vazia();
        lista3.pos = ' ';
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0103");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0104");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        int int20 = lista0.pos;
        int int21 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0105");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        boolean boolean3 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0106");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.primeiro;
        lista0.primeiro = (-1);
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0107");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.primeiro;
        lista0.primeiro = (-1);
        lista0.pos = (short) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0108");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0109");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0110");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray4 = lista0.item;
        boolean boolean5 = lista0.vazia();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0111");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        int int17 = lista0.pos;
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0112");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        boolean boolean13 = lista3.vazia();
        int int14 = lista3.pos;
        lista0.insere((java.lang.Object) int14);
        int int16 = lista0.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.imprime();
        int int21 = lista17.ultimo;
        boolean boolean22 = lista17.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        boolean boolean26 = lista23.vazia();
        int int27 = lista23.primeiro;
        java.lang.Object[] objArray28 = lista23.item;
        lista17.item = objArray28;
        java.lang.Object[] objArray30 = lista17.item;
        lista0.item = objArray30;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0113");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        boolean boolean23 = lista20.vazia();
        lista20.pos = (byte) 0;
        int int26 = lista20.pos;
        lista20.ultimo = (short) 10;
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.imprime();
        boolean boolean32 = lista29.vazia();
        int int33 = lista29.primeiro;
        java.lang.Object[] objArray34 = lista29.item;
        lista20.insere((java.lang.Object) objArray34);
        lista7.insere((java.lang.Object) objArray34);
        java.lang.Object[] objArray37 = lista7.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0114");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.primeiro = 'a';
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0115");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.primeiro;
        lista0.primeiro = (-1);
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0116");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.primeiro = (byte) 10;
        java.lang.Object[] objArray21 = lista0.item;
        int int22 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0117");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.primeiro = (byte) 10;
        java.lang.Object[] objArray21 = lista0.item;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0118");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        int int21 = lista0.ultimo;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0119");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.pos = (short) 10;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0120");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.ultimo = 35;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0121");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        lista0.primeiro = 'a';
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0122");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        lista0.pos = 10;
        int int22 = lista0.ultimo;
        int int23 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0123");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        lista3.ultimo = 0;
        int int25 = lista3.primeiro;
        boolean boolean26 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0124");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0125");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.ultimo = (short) -1;
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        lista12.imprime();
        boolean boolean15 = lista12.vazia();
        lista12.pos = (byte) 0;
        int int18 = lista12.pos;
        lista12.imprime();
        java.lang.Object[] objArray20 = lista12.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0126");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = 10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0127");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.pos;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0128");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.pos = 10;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0129");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        int int21 = lista0.ultimo;
        lista0.imprime();
        boolean boolean23 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0130");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0131");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = 35;
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0132");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.ultimo;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0133");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        lista0.ultimo = (-1);
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista12.ultimo = (byte) 10;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        lista30.insere((java.lang.Object) 0L);
        lista30.ultimo = '#';
        lista30.pos = 10;
        ds.Lista lista39 = new ds.Lista();
        lista39.pos = 10;
        lista39.pos = (byte) 100;
        int int44 = lista39.pos;
        lista39.pos = (byte) 100;
        int int47 = lista39.pos;
        lista30.insere((java.lang.Object) int47);
        lista12.insere((java.lang.Object) int47);
        ds.Lista lista50 = new ds.Lista();
        lista50.pos = 10;
        lista50.pos = (byte) 100;
        int int55 = lista50.pos;
        int int56 = lista50.primeiro;
        lista50.ultimo = 0;
        java.lang.Object[] objArray59 = lista50.item;
        lista12.insere((java.lang.Object) objArray59);
        lista0.item = objArray59;
        lista0.imprime();
        lista0.pos = 101;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0134");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        boolean boolean18 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        boolean boolean21 = lista0.vazia();
        boolean boolean22 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0135");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0136");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0137");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        lista0.ultimo = 'a';
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0138");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        lista4.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0139");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = 0;
        lista0.primeiro = (byte) -1;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        int int20 = lista14.ultimo;
        lista0.insere((java.lang.Object) lista14);
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0140");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0141");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        lista6.pos = (byte) 0;
        int int12 = lista6.pos;
        lista6.imprime();
        java.lang.Object[] objArray14 = lista6.item;
        lista0.insere((java.lang.Object) objArray14);
        int int16 = lista0.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.imprime();
        int int21 = lista17.ultimo;
        boolean boolean22 = lista17.vazia();
        boolean boolean23 = lista17.vazia();
        java.lang.Object[] objArray24 = lista17.item;
        lista17.imprime();
        java.lang.Object[] objArray26 = lista17.item;
        lista17.pos = '#';
        int int29 = lista17.pos;
        lista0.insere((java.lang.Object) int29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0142");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        lista10.pos = (byte) 100;
        lista10.primeiro = (short) 1;
        lista10.pos = 1;
        lista10.imprime();
        lista10.pos = (byte) 1;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.ultimo;
        lista22.primeiro = (short) 10;
        lista22.primeiro = 'a';
        boolean boolean28 = lista22.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        int int34 = lista29.pos;
        lista29.pos = (byte) 100;
        lista29.pos = 100;
        lista29.pos = (byte) 0;
        int int41 = lista29.pos;
        boolean boolean42 = lista29.vazia();
        lista29.primeiro = (short) 1;
        lista29.ultimo = (byte) 10;
        boolean boolean47 = lista29.vazia();
        java.lang.Object[] objArray48 = lista29.item;
        lista22.item = objArray48;
        lista10.item = objArray48;
        lista0.item = objArray48;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0143");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        int int21 = lista0.ultimo;
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0144");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.primeiro;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0145");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        int int12 = lista0.ultimo;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0146");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = 0;
        lista0.ultimo = (byte) 100;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0147");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        lista0.pos = 100;
        java.lang.Object[] objArray15 = lista0.item;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0148");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.primeiro = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = 10;
        lista19.imprime();
        int int23 = lista19.ultimo;
        boolean boolean24 = lista19.vazia();
        boolean boolean25 = lista19.vazia();
        java.lang.Object[] objArray26 = lista19.item;
        lista19.imprime();
        java.lang.Object[] objArray28 = lista19.item;
        java.lang.Object[] objArray29 = lista19.item;
        lista19.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        lista31.imprime();
        boolean boolean34 = lista31.vazia();
        int int35 = lista31.primeiro;
        java.lang.Object[] objArray36 = lista31.item;
        lista31.ultimo = 10;
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        boolean boolean42 = lista39.vazia();
        int int43 = lista39.primeiro;
        java.lang.Object[] objArray44 = lista39.item;
        lista31.item = objArray44;
        java.lang.Object[] objArray46 = lista31.item;
        lista19.item = objArray46;
        lista0.item = objArray46;
        java.lang.Class<?> wildcardClass49 = objArray46.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0149");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        int int12 = lista7.pos;
        lista7.pos = (byte) 100;
        lista7.pos = 100;
        lista7.pos = (byte) 0;
        int int19 = lista7.pos;
        boolean boolean20 = lista7.vazia();
        java.lang.Object[] objArray21 = lista7.item;
        lista0.item = objArray21;
        int int23 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0150");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.pos;
        int int14 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0151");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        lista0.pos = (short) 10;
        lista0.imprime();
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0152");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        java.lang.Class<?> wildcardClass12 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0153");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        int int17 = lista9.pos;
        lista0.insere((java.lang.Object) int17);
        java.lang.Object obj19 = null;
        lista0.insere(obj19);
        java.lang.Object[] objArray21 = lista0.item;
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0154");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        int int13 = lista9.ultimo;
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista9.imprime();
        java.lang.Object[] objArray18 = lista9.item;
        java.lang.Object[] objArray19 = lista9.item;
        lista0.insere((java.lang.Object) objArray19);
        int int21 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0155");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.primeiro = (byte) 10;
        int int21 = lista0.primeiro;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0156");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = 0;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0157");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.ultimo;
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0158");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.pos = 0;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        lista8.pos = (byte) 1;
        lista0.insere((java.lang.Object) lista8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0159");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0160");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.pos = (short) 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        int int23 = lista16.pos;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.ultimo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { int25 };
        lista16.item = objArray26;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        boolean boolean33 = lista28.vazia();
        lista28.ultimo = '#';
        java.lang.Object[] objArray36 = lista28.item;
        lista16.insere((java.lang.Object) objArray36);
        lista0.item = objArray36;
        ds.Lista lista39 = new ds.Lista();
        lista39.pos = 10;
        lista39.pos = (byte) 100;
        java.lang.Object[] objArray44 = lista39.item;
        lista39.primeiro = 35;
        java.lang.Object[] objArray47 = lista39.item;
        lista0.insere((java.lang.Object) objArray47);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0161");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0162");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.insere((java.lang.Object) objArray12);
        lista0.imprime();
        int int15 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0163");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0164");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        lista10.pos = (byte) 100;
        boolean boolean15 = lista10.vazia();
        lista10.ultimo = '#';
        lista10.ultimo = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.pos = (byte) 100;
        int int28 = lista23.pos;
        int int29 = lista23.primeiro;
        lista23.ultimo = 0;
        lista23.primeiro = 0;
        java.lang.Class<?> wildcardClass34 = lista23.getClass();
        lista20.insere((java.lang.Object) wildcardClass34);
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        lista36.imprime();
        boolean boolean39 = lista36.vazia();
        int int40 = lista36.primeiro;
        java.lang.Object[] objArray41 = lista36.item;
        lista36.ultimo = 10;
        ds.Lista lista44 = new ds.Lista();
        lista44.imprime();
        lista44.imprime();
        boolean boolean47 = lista44.vazia();
        int int48 = lista44.primeiro;
        java.lang.Object[] objArray49 = lista44.item;
        lista36.item = objArray49;
        lista20.item = objArray49;
        lista10.item = objArray49;
        lista9.insere((java.lang.Object) objArray49);
        lista0.item = objArray49;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0165");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = 1;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        boolean boolean16 = lista13.vazia();
        int int17 = lista13.primeiro;
        java.lang.Object[] objArray18 = lista13.item;
        lista13.ultimo = 10;
        boolean boolean21 = lista13.vazia();
        java.lang.Object[] objArray22 = lista13.item;
        lista0.item = objArray22;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0166");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 1;
        lista0.ultimo = (short) 0;
        lista0.ultimo = '#';
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0167");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        int int20 = lista7.ultimo;
        int int21 = lista7.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0168");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        int int18 = lista0.pos;
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Class<?> wildcardClass20 = objArray19.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0169");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0170");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        int int9 = lista3.primeiro;
        lista3.ultimo = 0;
        lista3.primeiro = 0;
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass14);
        java.lang.Object[] objArray16 = lista0.item;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0171");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0172");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        lista0.ultimo = 'a';
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        lista10.pos = (byte) 100;
        int int15 = lista10.pos;
        lista10.pos = (byte) 100;
        lista10.pos = 100;
        lista10.pos = (byte) 0;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.pos = (byte) 100;
        java.lang.Object[] objArray27 = lista22.item;
        lista10.item = objArray27;
        lista0.item = objArray27;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0173");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.imprime();
        int int10 = lista6.ultimo;
        int int11 = lista6.primeiro;
        lista6.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        lista15.imprime();
        boolean boolean18 = lista15.vazia();
        int int19 = lista15.primeiro;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        lista20.insere((java.lang.Object) 0L);
        int int25 = lista20.primeiro;
        lista20.primeiro = (-1);
        lista15.insere((java.lang.Object) (-1));
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.imprime();
        lista29.insere((java.lang.Object) 0L);
        boolean boolean34 = lista29.vazia();
        int int35 = lista29.primeiro;
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        lista36.imprime();
        boolean boolean39 = lista36.vazia();
        int int40 = lista36.primeiro;
        java.lang.Object[] objArray41 = lista36.item;
        lista29.insere((java.lang.Object) objArray41);
        lista15.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.pos = (byte) 100;
        int int49 = lista44.pos;
        int int50 = lista44.primeiro;
        lista44.ultimo = 0;
        lista44.primeiro = 0;
        ds.Lista lista55 = new ds.Lista();
        lista55.pos = 10;
        lista55.pos = (byte) 100;
        int int60 = lista55.pos;
        java.lang.Object[] objArray65 = new java.lang.Object[] { (byte) 1, "hi!", true, 1.0f };
        lista55.item = objArray65;
        java.lang.Object[] objArray68 = new java.lang.Object[] { 0L, lista15, 0, lista55, 10.0d };
        lista6.item = objArray68;
        lista0.item = objArray68;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0174");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        lista0.ultimo = '#';
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0175");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0176");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.pos = 10;
        lista18.pos = (byte) 100;
        lista18.primeiro = (short) 1;
        lista18.pos = 1;
        lista18.primeiro = (short) 10;
        lista18.primeiro = ' ';
        java.lang.Object[] objArray31 = lista18.item;
        lista18.pos = (short) 0;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        lista34.primeiro = (short) 1;
        int int41 = lista34.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.ultimo;
        java.lang.Object[] objArray44 = new java.lang.Object[] { int43 };
        lista34.item = objArray44;
        ds.Lista lista46 = new ds.Lista();
        lista46.pos = 10;
        lista46.pos = (byte) 100;
        boolean boolean51 = lista46.vazia();
        lista46.ultimo = '#';
        java.lang.Object[] objArray54 = lista46.item;
        lista34.insere((java.lang.Object) objArray54);
        lista18.item = objArray54;
        lista0.item = objArray54;
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0177");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        lista0.pos = 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        int int19 = lista14.primeiro;
        lista14.primeiro = (-1);
        lista9.insere((java.lang.Object) (-1));
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        lista23.insere((java.lang.Object) 0L);
        boolean boolean28 = lista23.vazia();
        int int29 = lista23.primeiro;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        boolean boolean33 = lista30.vazia();
        int int34 = lista30.primeiro;
        java.lang.Object[] objArray35 = lista30.item;
        lista23.insere((java.lang.Object) objArray35);
        lista9.item = objArray35;
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        lista38.ultimo = 0;
        lista38.primeiro = 0;
        ds.Lista lista49 = new ds.Lista();
        lista49.pos = 10;
        lista49.pos = (byte) 100;
        int int54 = lista49.pos;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (byte) 1, "hi!", true, 1.0f };
        lista49.item = objArray59;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 0L, lista9, 0, lista49, 10.0d };
        lista0.item = objArray62;
        lista0.ultimo = 0;
        int int66 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0178");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        lista0.primeiro = '#';
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0179");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.insere((java.lang.Object) objArray12);
        lista0.imprime();
        int int15 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        boolean boolean18 = lista0.vazia();
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0180");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        java.lang.Object[] objArray8 = lista4.item;
        lista4.ultimo = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0181");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 100.0d, (byte) 100, lista18, 1L };
        lista7.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        lista0.insere((java.lang.Object) objArray20);
        lista0.pos = (byte) 100;
        int int26 = lista0.pos;
        boolean boolean27 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0182");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        lista0.ultimo = 1;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        int int31 = lista25.primeiro;
        lista25.ultimo = 0;
        lista25.primeiro = 0;
        lista25.pos = (short) 10;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        lista38.imprime();
        boolean boolean41 = lista38.vazia();
        int int42 = lista38.primeiro;
        java.lang.Object[] objArray43 = lista38.item;
        lista38.ultimo = 10;
        java.lang.Object[] objArray46 = lista38.item;
        lista25.item = objArray46;
        lista0.item = objArray46;
        ds.Lista lista49 = new ds.Lista();
        lista49.pos = 10;
        lista49.pos = (byte) 100;
        lista49.primeiro = (short) 1;
        int int56 = lista49.pos;
        int int57 = lista49.primeiro;
        java.lang.Object[] objArray58 = lista49.item;
        lista0.item = objArray58;
        ds.Lista lista60 = new ds.Lista();
        lista60.pos = 10;
        lista60.pos = (byte) 100;
        lista60.primeiro = (short) 1;
        lista60.pos = 1;
        lista60.primeiro = (short) 10;
        lista60.primeiro = ' ';
        lista60.pos = 100;
        java.lang.Object[] objArray75 = lista60.item;
        lista60.primeiro = '#';
        ds.Lista lista78 = new ds.Lista();
        lista78.pos = 10;
        lista78.pos = (byte) 100;
        lista78.primeiro = (short) 1;
        int int85 = lista78.pos;
        lista78.pos = '#';
        lista78.imprime();
        boolean boolean89 = lista78.vazia();
        int int90 = lista78.ultimo;
        java.lang.Object[] objArray91 = lista78.item;
        lista60.item = objArray91;
        lista0.item = objArray91;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0183");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0184");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0185");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        lista21.pos = (byte) 0;
        int int27 = lista21.ultimo;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        lista28.primeiro = (short) 1;
        int int35 = lista28.pos;
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.ultimo;
        java.lang.Object[] objArray38 = new java.lang.Object[] { int37 };
        lista28.item = objArray38;
        lista21.insere((java.lang.Object) lista28);
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        lista41.imprime();
        boolean boolean44 = lista41.vazia();
        lista41.pos = (byte) 0;
        int int47 = lista41.pos;
        lista41.ultimo = (short) 10;
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        lista50.imprime();
        boolean boolean53 = lista50.vazia();
        int int54 = lista50.primeiro;
        java.lang.Object[] objArray55 = lista50.item;
        lista41.insere((java.lang.Object) objArray55);
        lista28.insere((java.lang.Object) objArray55);
        ds.Lista lista58 = new ds.Lista();
        lista58.pos = 10;
        lista58.imprime();
        int int62 = lista58.ultimo;
        boolean boolean63 = lista58.vazia();
        boolean boolean64 = lista58.vazia();
        java.lang.Object[] objArray65 = lista58.item;
        lista58.imprime();
        java.lang.Object[] objArray67 = lista58.item;
        lista28.item = objArray67;
        lista0.insere((java.lang.Object) objArray67);
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0186");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0187");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        lista0.pos = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.primeiro;
        java.lang.Object[] objArray14 = lista9.item;
        lista9.ultimo = 10;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        lista17.imprime();
        boolean boolean20 = lista17.vazia();
        int int21 = lista17.primeiro;
        java.lang.Object[] objArray22 = lista17.item;
        lista9.item = objArray22;
        int int24 = lista9.primeiro;
        java.lang.Object[] objArray25 = lista9.item;
        lista0.item = objArray25;
        java.lang.Class<?> wildcardClass27 = objArray25.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0188");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.primeiro = (byte) 10;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray23 = lista21.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista21.item = objArray26;
        lista0.item = objArray26;
        java.lang.Class<?> wildcardClass29 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0189");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        boolean boolean18 = lista0.vazia();
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Class<?> wildcardClass20 = objArray19.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0190");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        lista8.pos = (byte) 0;
        int int14 = lista8.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100.0d, (byte) 100, lista26, 1L };
        lista15.item = objArray28;
        java.lang.Class<?> wildcardClass30 = objArray28.getClass();
        lista8.insere((java.lang.Object) objArray28);
        lista0.insere((java.lang.Object) lista8);
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0191");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        lista0.ultimo = '#';
        lista0.pos = (-1);
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0192");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0193");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        int int17 = lista9.pos;
        lista0.insere((java.lang.Object) int17);
        java.lang.Object obj19 = null;
        lista0.insere(obj19);
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray23 = lista21.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista21.item = objArray26;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        int int33 = lista28.pos;
        lista28.pos = (byte) 100;
        lista28.pos = 100;
        lista28.pos = (byte) 0;
        int int40 = lista28.pos;
        boolean boolean41 = lista28.vazia();
        java.lang.Object[] objArray42 = lista28.item;
        lista21.item = objArray42;
        lista0.item = objArray42;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0194");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0195");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0196");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0197");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        lista18.insere((java.lang.Object) 0L);
        lista18.ultimo = '#';
        lista18.pos = 10;
        ds.Lista lista27 = new ds.Lista();
        lista27.pos = 10;
        lista27.pos = (byte) 100;
        int int32 = lista27.pos;
        lista27.pos = (byte) 100;
        int int35 = lista27.pos;
        lista18.insere((java.lang.Object) int35);
        lista0.insere((java.lang.Object) int35);
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        lista38.ultimo = 0;
        java.lang.Object[] objArray47 = lista38.item;
        lista0.insere((java.lang.Object) objArray47);
        int int49 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 12 + "'", int49 == 12);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0198");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray26 = lista6.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0199");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.imprime();
        lista0.primeiro = '#';
        lista0.pos = ' ';
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0200");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        lista0.pos = (byte) -1;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        lista12.primeiro = (short) 1;
        int int19 = lista12.ultimo;
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        lista20.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        lista24.primeiro = (short) 1;
        int int31 = lista24.pos;
        int int32 = lista24.pos;
        int int33 = lista24.ultimo;
        lista20.insere((java.lang.Object) int33);
        java.lang.Object[] objArray35 = lista20.item;
        lista12.item = objArray35;
        lista0.insere((java.lang.Object) objArray35);
        lista0.pos = 'a';
        int int40 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0201");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100.0d, (byte) 100, lista11, 1L };
        lista0.item = objArray13;
        int int15 = lista0.pos;
        int int16 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0202");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        lista21.pos = (byte) 0;
        int int27 = lista21.ultimo;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        lista28.primeiro = (short) 1;
        int int35 = lista28.pos;
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.ultimo;
        java.lang.Object[] objArray38 = new java.lang.Object[] { int37 };
        lista28.item = objArray38;
        lista21.insere((java.lang.Object) lista28);
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        lista41.imprime();
        boolean boolean44 = lista41.vazia();
        lista41.pos = (byte) 0;
        int int47 = lista41.pos;
        lista41.ultimo = (short) 10;
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        lista50.imprime();
        boolean boolean53 = lista50.vazia();
        int int54 = lista50.primeiro;
        java.lang.Object[] objArray55 = lista50.item;
        lista41.insere((java.lang.Object) objArray55);
        lista28.insere((java.lang.Object) objArray55);
        ds.Lista lista58 = new ds.Lista();
        lista58.pos = 10;
        lista58.imprime();
        int int62 = lista58.ultimo;
        boolean boolean63 = lista58.vazia();
        boolean boolean64 = lista58.vazia();
        java.lang.Object[] objArray65 = lista58.item;
        lista58.imprime();
        java.lang.Object[] objArray67 = lista58.item;
        lista28.item = objArray67;
        lista0.insere((java.lang.Object) objArray67);
        java.lang.Class<?> wildcardClass70 = objArray67.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0203");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.ultimo;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        java.lang.Object[] objArray16 = lista13.item;
        lista13.pos = (short) 0;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        java.lang.Object[] objArray21 = null;
        lista0.item = objArray21;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0204");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.pos = 0;
        int int7 = lista0.ultimo;
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0205");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        lista3.ultimo = 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0206");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        lista0.primeiro = 10;
        lista0.primeiro = (short) 0;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0207");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = 0;
        lista0.ultimo = (byte) 100;
        lista0.pos = 10;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0208");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        boolean boolean23 = lista20.vazia();
        lista20.pos = (byte) 0;
        int int26 = lista20.pos;
        lista20.ultimo = (short) 10;
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.imprime();
        boolean boolean32 = lista29.vazia();
        int int33 = lista29.primeiro;
        java.lang.Object[] objArray34 = lista29.item;
        lista20.insere((java.lang.Object) objArray34);
        lista7.insere((java.lang.Object) objArray34);
        lista7.primeiro = 100;
        java.lang.Object[] objArray39 = lista7.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0209");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        lista0.pos = 12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0210");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0211");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0212");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.primeiro;
        java.lang.Object[] objArray14 = lista9.item;
        lista0.insere((java.lang.Object) objArray14);
        lista0.ultimo = (byte) -1;
        lista0.primeiro = 1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0213");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.primeiro = (byte) 10;
        int int21 = lista0.primeiro;
        lista0.primeiro = (short) 100;
        int int24 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0214");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.pos = 0;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista7.ultimo = 10;
        boolean boolean15 = lista7.vazia();
        lista0.insere((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0215");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.ultimo;
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0216");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray4 = lista0.item;
        java.lang.Object[] objArray5 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0217");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0218");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        lista0.ultimo = '#';
        java.lang.Object[] objArray19 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0219");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        int int20 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0220");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        lista16.ultimo = '#';
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        lista31.imprime();
        lista31.insere((java.lang.Object) 0L);
        int int36 = lista31.primeiro;
        lista28.insere((java.lang.Object) lista31);
        java.lang.Object[] objArray38 = lista31.item;
        int int39 = lista31.ultimo;
        int int40 = lista31.primeiro;
        java.lang.Object[] objArray41 = lista31.item;
        lista16.item = objArray41;
        java.lang.Class<?> wildcardClass43 = objArray41.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0221");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        lista9.primeiro = (short) 1;
        int int16 = lista9.pos;
        lista9.pos = '#';
        int int19 = lista9.pos;
        lista0.insere((java.lang.Object) int19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0222");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0223");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        int int12 = lista0.ultimo;
        lista0.ultimo = 35;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0224");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        boolean boolean17 = lista12.vazia();
        lista12.ultimo = '#';
        java.lang.Object[] objArray20 = lista12.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.ultimo = (byte) 100;
        int int24 = lista0.primeiro;
        java.lang.Object[] objArray25 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0225");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        lista10.imprime();
        lista10.insere((java.lang.Object) 0L);
        int int15 = lista10.primeiro;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = 10;
        lista19.pos = (byte) 100;
        int int24 = lista19.pos;
        lista19.pos = (byte) 100;
        lista19.pos = 100;
        lista19.pos = (byte) 0;
        lista16.insere((java.lang.Object) (byte) 0);
        lista16.primeiro = 'a';
        lista10.insere((java.lang.Object) 'a');
        lista10.pos = (byte) -1;
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0226");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0227");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0228");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = (short) 0;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0229");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        lista0.primeiro = (byte) 1;
        int int9 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0230");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        int int17 = lista0.pos;
        lista0.primeiro = (-1);
        lista0.pos = ' ';
        lista0.ultimo = 37;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0231");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        lista0.ultimo = (-1);
        int int11 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0232");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        int int17 = lista9.pos;
        lista0.insere((java.lang.Object) int17);
        java.lang.Object obj19 = null;
        lista0.insere(obj19);
        int int21 = lista0.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0233");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        int int18 = lista0.pos;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        lista0.pos = 32;
        int int23 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0234");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.imprime();
        lista7.primeiro = (short) 0;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        boolean boolean16 = lista13.vazia();
        lista13.pos = (byte) 0;
        int int19 = lista13.pos;
        java.lang.Object[] objArray20 = lista13.item;
        lista7.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        lista0.insere((java.lang.Object) wildcardClass22);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0235");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        int int13 = lista0.ultimo;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0236");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        lista11.pos = (byte) 100;
        lista11.pos = 100;
        lista11.pos = (byte) 0;
        int int23 = lista11.pos;
        boolean boolean24 = lista11.vazia();
        lista11.primeiro = (short) 1;
        lista11.ultimo = (byte) 10;
        boolean boolean29 = lista11.vazia();
        java.lang.Object[] objArray30 = lista11.item;
        lista0.insere((java.lang.Object) lista11);
        lista0.ultimo = '#';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0237");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        int int22 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0238");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        lista7.pos = '#';
        lista7.imprime();
        boolean boolean18 = lista7.vazia();
        int int19 = lista7.ultimo;
        java.lang.Object[] objArray20 = lista7.item;
        lista0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0239");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.imprime();
        lista0.pos = (byte) 1;
        int int12 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0240");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0241");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        lista0.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        lista33.imprime();
        boolean boolean36 = lista33.vazia();
        lista33.pos = (byte) 0;
        int int39 = lista33.ultimo;
        lista0.insere((java.lang.Object) int39);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0242");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0243");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        boolean boolean13 = lista3.vazia();
        int int14 = lista3.pos;
        lista0.insere((java.lang.Object) int14);
        lista0.ultimo = 0;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0244");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.pos = 97;
        int int17 = lista0.ultimo;
        lista0.primeiro = 12;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0245");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        boolean boolean26 = lista0.vazia();
        lista0.pos = '#';
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0246");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 32;
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0247");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        lista0.pos = 100;
        java.lang.Object[] objArray15 = lista0.item;
        lista0.primeiro = '#';
        ds.Lista lista18 = new ds.Lista();
        lista18.pos = 10;
        lista18.pos = (byte) 100;
        lista18.primeiro = (short) 1;
        int int25 = lista18.pos;
        lista18.pos = '#';
        lista18.imprime();
        boolean boolean29 = lista18.vazia();
        int int30 = lista18.ultimo;
        java.lang.Object[] objArray31 = lista18.item;
        lista0.item = objArray31;
        java.lang.Class<?> wildcardClass33 = objArray31.getClass();
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0248");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        lista3.primeiro = 'a';
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        boolean boolean26 = lista23.vazia();
        lista23.pos = (byte) 0;
        int int29 = lista23.pos;
        ds.Lista lista30 = new ds.Lista();
        lista30.pos = 10;
        lista30.pos = (byte) 100;
        lista30.primeiro = (short) 1;
        int int37 = lista30.pos;
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.ultimo;
        java.lang.Object[] objArray40 = new java.lang.Object[] { int39 };
        lista30.item = objArray40;
        lista30.imprime();
        lista30.primeiro = (short) 1;
        ds.Lista lista45 = new ds.Lista();
        lista45.pos = 10;
        lista45.pos = (byte) 100;
        int int50 = lista45.pos;
        int int51 = lista45.primeiro;
        lista45.ultimo = 0;
        lista45.primeiro = 0;
        lista45.pos = (short) 10;
        ds.Lista lista58 = new ds.Lista();
        lista58.pos = 10;
        lista58.pos = (byte) 100;
        java.lang.Object[] objArray63 = lista58.item;
        lista45.item = objArray63;
        lista30.item = objArray63;
        lista23.item = objArray63;
        lista12.item = objArray63;
        lista3.item = objArray63;
        int int69 = lista3.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 97 + "'", int69 == 97);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0249");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        int int12 = lista8.primeiro;
        java.lang.Object[] objArray13 = lista8.item;
        lista0.item = objArray13;
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        int int21 = lista16.primeiro;
        lista16.pos = (-1);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.ultimo;
        lista24.pos = (short) -1;
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        java.lang.Object[] objArray30 = lista28.item;
        lista24.insere((java.lang.Object) lista28);
        java.lang.Object[] objArray32 = lista28.item;
        lista16.item = objArray32;
        lista0.item = objArray32;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0250");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0251");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        boolean boolean13 = lista3.vazia();
        int int14 = lista3.pos;
        lista0.insere((java.lang.Object) int14);
        int int16 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0252");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0253");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        lista3.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0254");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        lista0.ultimo = (byte) 1;
        boolean boolean28 = lista0.vazia();
        boolean boolean29 = lista0.vazia();
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0255");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        boolean boolean11 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0256");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0257");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.ultimo;
        java.lang.Object[] objArray13 = lista3.item;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0258");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        int int12 = lista8.primeiro;
        java.lang.Object[] objArray13 = lista8.item;
        lista0.item = objArray13;
        int int15 = lista0.primeiro;
        int int16 = lista0.pos;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0259");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        lista0.ultimo = (short) 10;
        lista0.pos = (-1);
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0260");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0261");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.insere((java.lang.Object) objArray12);
        lista0.imprime();
        int int15 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        int int18 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0262");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0263");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        java.lang.Object[] objArray4 = lista0.item;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0264");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.ultimo;
        int int11 = lista0.pos;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0265");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.pos;
        boolean boolean18 = lista0.vazia();
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0266");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.primeiro;
        lista0.pos = (-1);
        java.lang.Object[] objArray8 = null;
        lista0.item = objArray8;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0267");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        int int12 = lista0.ultimo;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0268");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        lista12.primeiro = (short) 1;
        int int19 = lista12.pos;
        lista12.pos = '#';
        lista12.imprime();
        int int23 = lista12.primeiro;
        lista12.primeiro = (byte) 1;
        lista0.insere((java.lang.Object) lista12);
        lista0.ultimo = 1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0269");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        lista0.imprime();
        lista0.pos = 10;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        int int12 = lista7.pos;
        int int13 = lista7.primeiro;
        lista7.ultimo = 0;
        lista7.pos = (-1);
        int int18 = lista7.primeiro;
        lista0.insere((java.lang.Object) int18);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0270");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.pos = 97;
        int int17 = lista0.ultimo;
        boolean boolean18 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0271");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0272");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0273");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        lista8.pos = (byte) 0;
        int int14 = lista8.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100.0d, (byte) 100, lista26, 1L };
        lista15.item = objArray28;
        java.lang.Class<?> wildcardClass30 = objArray28.getClass();
        lista8.insere((java.lang.Object) objArray28);
        lista0.insere((java.lang.Object) lista8);
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0274");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.imprime();
        lista0.pos = (byte) 1;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0275");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        boolean boolean16 = lista13.vazia();
        int int17 = lista13.primeiro;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        lista18.insere((java.lang.Object) 0L);
        int int23 = lista18.primeiro;
        lista18.primeiro = (-1);
        lista13.insere((java.lang.Object) (-1));
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        lista27.imprime();
        lista27.insere((java.lang.Object) 0L);
        boolean boolean32 = lista27.vazia();
        int int33 = lista27.primeiro;
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        lista34.imprime();
        boolean boolean37 = lista34.vazia();
        int int38 = lista34.primeiro;
        java.lang.Object[] objArray39 = lista34.item;
        lista27.insere((java.lang.Object) objArray39);
        lista13.item = objArray39;
        lista0.item = objArray39;
        int int43 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0276");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        int int10 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0277");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.ultimo;
        lista0.insere((java.lang.Object) (-1.0f));
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray14 = lista0.item;
        int int15 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0278");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        int int8 = lista0.pos;
        lista0.ultimo = ' ';
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0279");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0280");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista5 = new ds.Lista();
        lista5.pos = 10;
        lista5.pos = (byte) 100;
        lista5.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        java.lang.Object[] objArray14 = lista11.item;
        lista5.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0281");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.pos;
        boolean boolean18 = lista0.vazia();
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0282");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        lista0.ultimo = (-1);
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista12.ultimo = (byte) 10;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        lista30.insere((java.lang.Object) 0L);
        lista30.ultimo = '#';
        lista30.pos = 10;
        ds.Lista lista39 = new ds.Lista();
        lista39.pos = 10;
        lista39.pos = (byte) 100;
        int int44 = lista39.pos;
        lista39.pos = (byte) 100;
        int int47 = lista39.pos;
        lista30.insere((java.lang.Object) int47);
        lista12.insere((java.lang.Object) int47);
        ds.Lista lista50 = new ds.Lista();
        lista50.pos = 10;
        lista50.pos = (byte) 100;
        int int55 = lista50.pos;
        int int56 = lista50.primeiro;
        lista50.ultimo = 0;
        java.lang.Object[] objArray59 = lista50.item;
        lista12.insere((java.lang.Object) objArray59);
        lista0.item = objArray59;
        ds.Lista lista62 = new ds.Lista();
        lista62.pos = 10;
        lista62.pos = (byte) 100;
        lista62.primeiro = (short) 1;
        int int69 = lista62.pos;
        lista62.pos = '#';
        lista62.imprime();
        boolean boolean73 = lista62.vazia();
        ds.Lista lista74 = new ds.Lista();
        lista74.pos = 10;
        lista74.pos = (byte) 100;
        boolean boolean79 = lista74.vazia();
        lista74.ultimo = '#';
        java.lang.Object[] objArray82 = lista74.item;
        lista62.item = objArray82;
        lista0.item = objArray82;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray82);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0283");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        lista0.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0284");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0285");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        lista0.imprime();
        int int13 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0286");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista17.item = objArray22;
        java.lang.Class<?> wildcardClass24 = lista17.getClass();
        lista0.insere((java.lang.Object) lista17);
        java.lang.Object[] objArray26 = lista17.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0287");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        lista0.pos = 100;
        boolean boolean15 = lista0.vazia();
        lista0.primeiro = 0;
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0288");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        int int17 = lista3.primeiro;
        lista3.ultimo = 12;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0289");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        lista7.pos = '#';
        lista7.imprime();
        boolean boolean18 = lista7.vazia();
        int int19 = lista7.ultimo;
        java.lang.Object[] objArray20 = lista7.item;
        lista0.item = objArray20;
        int int22 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0290");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0291");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100.0d, (byte) 100, lista11, 1L };
        lista0.item = objArray13;
        int int15 = lista0.ultimo;
        lista0.ultimo = 35;
        lista0.pos = ' ';
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0292");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.imprime();
        int int30 = lista26.ultimo;
        lista6.insere((java.lang.Object) int30);
        int int32 = lista6.pos;
        lista6.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0293");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        java.lang.Object[] objArray5 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0294");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0295");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        int int20 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0296");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0297");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = 100;
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0298");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        int int17 = lista9.pos;
        lista0.insere((java.lang.Object) int17);
        int int19 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0299");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        lista7.pos = (byte) 0;
        int int13 = lista7.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        boolean boolean17 = lista14.vazia();
        int int18 = lista14.primeiro;
        java.lang.Object[] objArray19 = lista14.item;
        lista7.insere((java.lang.Object) objArray19);
        lista0.item = objArray19;
        lista0.ultimo = 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0300");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0301");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 'a';
        int int9 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0302");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100.0d, (byte) 100, lista11, 1L };
        lista0.item = objArray13;
        lista0.ultimo = ' ';
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0303");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        lista0.ultimo = 'a';
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0304");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.imprime();
        int int17 = lista13.ultimo;
        boolean boolean18 = lista13.vazia();
        boolean boolean19 = lista13.vazia();
        java.lang.Object[] objArray20 = lista13.item;
        lista13.imprime();
        java.lang.Object[] objArray22 = lista13.item;
        java.lang.Object[] objArray23 = lista13.item;
        lista0.insere((java.lang.Object) objArray23);
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        lista25.primeiro = (short) 1;
        lista25.pos = 1;
        lista25.primeiro = (short) 10;
        ds.Lista lista36 = new ds.Lista();
        lista36.pos = 10;
        lista36.pos = (byte) 100;
        lista36.primeiro = (short) 1;
        int int43 = lista36.pos;
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.ultimo;
        java.lang.Object[] objArray46 = new java.lang.Object[] { int45 };
        lista36.item = objArray46;
        lista25.item = objArray46;
        lista0.item = objArray46;
        ds.Lista lista50 = new ds.Lista();
        lista50.pos = 10;
        lista50.pos = (byte) 100;
        int int55 = lista50.pos;
        lista50.pos = (byte) 100;
        lista50.ultimo = (byte) 0;
        int int60 = lista50.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista50);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0305");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = (short) 0;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0306");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0307");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.ultimo;
        lista0.insere((java.lang.Object) (-1.0f));
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 10;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        boolean boolean17 = lista14.vazia();
        lista14.pos = (byte) 0;
        int int20 = lista14.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        int int25 = lista21.primeiro;
        java.lang.Object[] objArray26 = lista21.item;
        lista14.insere((java.lang.Object) objArray26);
        lista14.imprime();
        java.lang.Class<?> wildcardClass29 = lista14.getClass();
        lista0.insere((java.lang.Object) lista14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0308");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        java.lang.Object[] objArray33 = lista0.item;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        lista34.primeiro = (short) 1;
        lista34.pos = 1;
        lista34.primeiro = (short) 10;
        lista34.primeiro = ' ';
        java.lang.Object[] objArray47 = lista34.item;
        lista0.item = objArray47;
        java.lang.Class<?> wildcardClass49 = objArray47.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0309");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0310");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.imprime();
        int int29 = lista25.ultimo;
        boolean boolean30 = lista25.vazia();
        boolean boolean31 = lista25.vazia();
        java.lang.Object[] objArray32 = lista25.item;
        lista25.imprime();
        java.lang.Object[] objArray34 = lista25.item;
        java.lang.Object[] objArray35 = lista25.item;
        lista12.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        int int38 = lista0.primeiro;
        lista0.imprime();
        java.lang.Class<?> wildcardClass40 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0311");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.primeiro;
        lista0.primeiro = (-1);
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.ultimo;
        int int11 = lista9.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        boolean boolean22 = lista12.vazia();
        int int23 = lista12.pos;
        lista9.insere((java.lang.Object) int23);
        lista9.pos = (short) 0;
        lista0.insere((java.lang.Object) lista9);
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0312");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        int int12 = lista7.pos;
        lista7.pos = (byte) 100;
        lista7.pos = 100;
        lista7.pos = (byte) 0;
        int int19 = lista7.pos;
        boolean boolean20 = lista7.vazia();
        java.lang.Object[] objArray21 = lista7.item;
        lista0.item = objArray21;
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0313");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0314");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        lista26.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        int int34 = lista29.pos;
        lista29.pos = (byte) 100;
        lista29.pos = 100;
        lista29.pos = (byte) 0;
        lista26.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass42 = lista26.getClass();
        lista16.insere((java.lang.Object) lista26);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0315");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        lista0.ultimo = (short) -1;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        lista34.primeiro = (short) 1;
        int int41 = lista34.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.ultimo;
        java.lang.Object[] objArray44 = new java.lang.Object[] { int43 };
        lista34.item = objArray44;
        lista34.imprime();
        lista34.primeiro = '#';
        lista34.pos = ' ';
        ds.Lista lista51 = new ds.Lista();
        lista51.pos = 10;
        java.lang.Object[] objArray54 = lista51.item;
        int int55 = lista51.ultimo;
        lista51.imprime();
        lista51.pos = 101;
        lista34.insere((java.lang.Object) lista51);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0316");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        boolean boolean18 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        lista21.primeiro = (short) 1;
        lista21.pos = 1;
        lista21.primeiro = (short) 10;
        lista21.primeiro = ' ';
        java.lang.Object[] objArray34 = lista21.item;
        lista21.imprime();
        java.lang.Object[] objArray36 = lista21.item;
        java.lang.Object[] objArray37 = lista21.item;
        lista0.item = objArray37;
        java.lang.Class<?> wildcardClass39 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0317");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.insere((java.lang.Object) objArray12);
        lista0.imprime();
        int int15 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        int int18 = lista0.primeiro;
        int int19 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0318");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        lista0.ultimo = '#';
        lista0.pos = (-1);
        int int21 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0319");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        java.lang.Object[] objArray30 = lista25.item;
        lista12.item = objArray30;
        java.lang.Object[] objArray32 = lista12.item;
        lista3.insere((java.lang.Object) objArray32);
        int int34 = lista3.primeiro;
        boolean boolean35 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0320");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        boolean boolean8 = lista0.vazia();
        lista0.ultimo = 35;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0321");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.imprime();
        int int17 = lista13.ultimo;
        boolean boolean18 = lista13.vazia();
        boolean boolean19 = lista13.vazia();
        java.lang.Object[] objArray20 = lista13.item;
        lista13.imprime();
        java.lang.Object[] objArray22 = lista13.item;
        java.lang.Object[] objArray23 = lista13.item;
        lista0.insere((java.lang.Object) objArray23);
        lista0.ultimo = 100;
        java.lang.Object[] objArray27 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0322");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        lista11.pos = (byte) 100;
        lista11.pos = 100;
        lista11.pos = (byte) 0;
        int int23 = lista11.pos;
        boolean boolean24 = lista11.vazia();
        lista11.primeiro = (short) 1;
        lista11.ultimo = (byte) 10;
        lista11.pos = 32;
        lista0.insere((java.lang.Object) 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0323");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        int int8 = lista4.ultimo;
        lista4.pos = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0324");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.ultimo;
        lista0.insere((java.lang.Object) (-1.0f));
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        boolean boolean20 = lista15.vazia();
        boolean boolean21 = lista15.vazia();
        int int22 = lista15.ultimo;
        int int23 = lista15.pos;
        lista0.insere((java.lang.Object) int23);
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0325");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        int int20 = lista0.pos;
        lista0.imprime();
        int int22 = lista0.primeiro;
        java.lang.Object[] objArray23 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0326");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        int int10 = lista0.primeiro;
        lista0.primeiro = (short) 100;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista16.imprime();
        lista16.insere((java.lang.Object) 0L);
        int int21 = lista16.primeiro;
        lista13.insere((java.lang.Object) lista16);
        java.lang.Object[] objArray23 = lista16.item;
        lista0.item = objArray23;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0327");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        int int26 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0328");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        boolean boolean16 = lista11.vazia();
        lista11.ultimo = (byte) 10;
        lista11.pos = 32;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        int int25 = lista21.primeiro;
        java.lang.Object[] objArray26 = lista21.item;
        lista21.ultimo = 10;
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.imprime();
        boolean boolean32 = lista29.vazia();
        int int33 = lista29.primeiro;
        java.lang.Object[] objArray34 = lista29.item;
        lista21.item = objArray34;
        java.lang.Object[] objArray36 = lista21.item;
        lista11.item = objArray36;
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0329");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        lista8.pos = (byte) 0;
        int int14 = lista8.ultimo;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        lista15.imprime();
        boolean boolean18 = lista15.vazia();
        int int19 = lista15.primeiro;
        java.lang.Object[] objArray20 = lista15.item;
        lista8.insere((java.lang.Object) objArray20);
        lista8.imprime();
        boolean boolean23 = lista8.vazia();
        lista0.insere((java.lang.Object) lista8);
        lista8.pos = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0330");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        int int14 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0331");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        int int8 = lista4.ultimo;
        int int9 = lista4.ultimo;
        int int10 = lista4.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        lista11.primeiro = (short) 1;
        lista11.pos = 1;
        lista11.primeiro = (short) 10;
        lista11.primeiro = ' ';
        lista11.pos = 100;
        java.lang.Object[] objArray26 = lista11.item;
        lista11.primeiro = '#';
        lista4.insere((java.lang.Object) lista11);
        lista4.ultimo = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0332");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        boolean boolean17 = lista3.vazia();
        boolean boolean18 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0333");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        lista12.primeiro = (short) 1;
        int int19 = lista12.pos;
        lista12.pos = '#';
        lista12.imprime();
        int int23 = lista12.primeiro;
        lista12.primeiro = (byte) 1;
        lista0.insere((java.lang.Object) lista12);
        lista0.imprime();
        int int28 = lista0.ultimo;
        lista0.pos = 2;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0334");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0335");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0336");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.imprime();
        lista0.primeiro = '#';
        lista0.pos = ' ';
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        java.lang.Object[] objArray20 = lista17.item;
        int int21 = lista17.ultimo;
        lista17.imprime();
        lista17.pos = 101;
        lista0.insere((java.lang.Object) lista17);
        java.lang.Object[] objArray26 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0337");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.primeiro;
        java.lang.Object[] objArray13 = lista3.item;
        lista3.ultimo = (short) 10;
        lista3.pos = ' ';
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0338");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        lista0.imprime();
        lista0.pos = 10;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0339");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        boolean boolean23 = lista3.vazia();
        lista3.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0340");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0341");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        lista0.primeiro = ' ';
        lista0.primeiro = 32;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0342");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        int int17 = lista9.pos;
        lista0.insere((java.lang.Object) int17);
        java.lang.Object obj19 = null;
        lista0.insere(obj19);
        java.lang.Object[] objArray21 = lista0.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0343");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.ultimo;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        java.lang.Object[] objArray16 = lista13.item;
        lista13.pos = (short) 0;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.pos = (byte) 100;
        int int27 = lista22.pos;
        lista22.pos = (byte) 100;
        lista22.pos = 100;
        boolean boolean32 = lista22.vazia();
        int int33 = lista22.pos;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        int int39 = lista34.pos;
        int int40 = lista34.primeiro;
        lista34.ultimo = 0;
        lista34.primeiro = 0;
        lista34.pos = (short) 10;
        ds.Lista lista47 = new ds.Lista();
        lista47.pos = 10;
        lista47.imprime();
        int int51 = lista47.ultimo;
        boolean boolean52 = lista47.vazia();
        boolean boolean53 = lista47.vazia();
        java.lang.Object[] objArray54 = lista47.item;
        lista47.imprime();
        java.lang.Object[] objArray56 = lista47.item;
        java.lang.Object[] objArray57 = lista47.item;
        lista34.insere((java.lang.Object) objArray57);
        lista22.item = objArray57;
        int int60 = lista22.primeiro;
        lista0.insere((java.lang.Object) int60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0344");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        int int17 = lista11.primeiro;
        lista11.ultimo = 0;
        lista11.primeiro = 0;
        lista11.pos = (short) 10;
        boolean boolean24 = lista11.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        lista25.pos = (byte) 100;
        ds.Lista lista33 = new ds.Lista();
        lista33.pos = 10;
        lista33.imprime();
        lista33.primeiro = (short) 0;
        java.lang.Object[] objArray39 = lista33.item;
        java.lang.Object[] objArray40 = lista33.item;
        lista25.item = objArray40;
        lista11.item = objArray40;
        int int43 = lista11.primeiro;
        java.lang.Object[] objArray44 = lista11.item;
        lista0.item = objArray44;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0345");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0346");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        int int15 = lista0.ultimo;
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0347");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        lista0.pos = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista8.pos = (short) 100;
        int int13 = lista8.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        boolean boolean17 = lista14.vazia();
        lista14.pos = (byte) 0;
        int int20 = lista14.pos;
        lista14.imprime();
        java.lang.Object[] objArray22 = lista14.item;
        lista8.insere((java.lang.Object) objArray22);
        lista0.item = objArray22;
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0348");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.pos = (-1);
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        java.lang.Object[] objArray30 = lista25.item;
        lista12.item = objArray30;
        lista0.item = objArray30;
        java.lang.Class<?> wildcardClass33 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0349");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        lista6.pos = (byte) 0;
        int int12 = lista6.pos;
        lista6.imprime();
        java.lang.Object[] objArray14 = lista6.item;
        lista0.insere((java.lang.Object) objArray14);
        int int16 = lista0.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        lista17.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        lista20.insere((java.lang.Object) 0L);
        int int25 = lista20.primeiro;
        lista17.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray27 = lista20.item;
        int int28 = lista20.ultimo;
        int int29 = lista20.primeiro;
        java.lang.Object[] objArray30 = lista20.item;
        lista20.ultimo = (short) 10;
        lista0.insere((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0350");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        int int9 = lista0.primeiro;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0351");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0352");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 100.0d, (byte) 100, lista18, 1L };
        lista7.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        lista0.insere((java.lang.Object) objArray20);
        int int24 = lista0.ultimo;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0353");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0354");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        java.lang.Object[] objArray8 = lista4.item;
        boolean boolean9 = lista4.vazia();
        lista4.insere((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0355");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 100.0d, (byte) 100, lista18, 1L };
        lista7.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        lista0.insere((java.lang.Object) objArray20);
        lista0.pos = (byte) 100;
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0356");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista17.item = objArray22;
        java.lang.Class<?> wildcardClass24 = lista17.getClass();
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.imprime();
        int int30 = lista26.ultimo;
        boolean boolean31 = lista26.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista32.imprime();
        boolean boolean35 = lista32.vazia();
        int int36 = lista32.primeiro;
        java.lang.Object[] objArray37 = lista32.item;
        lista26.item = objArray37;
        lista0.insere((java.lang.Object) lista26);
        lista26.pos = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0357");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        lista0.pos = (byte) 10;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0358");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        lista16.ultimo = '#';
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        lista31.imprime();
        lista31.insere((java.lang.Object) 0L);
        int int36 = lista31.primeiro;
        lista28.insere((java.lang.Object) lista31);
        java.lang.Object[] objArray38 = lista31.item;
        int int39 = lista31.ultimo;
        int int40 = lista31.primeiro;
        java.lang.Object[] objArray41 = lista31.item;
        lista16.item = objArray41;
        java.lang.Object[] objArray43 = null;
        lista16.item = objArray43;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0359");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        int int18 = lista13.pos;
        lista13.pos = (byte) 100;
        lista13.pos = 100;
        java.lang.Object[] objArray23 = lista13.item;
        lista0.item = objArray23;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0360");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        lista3.primeiro = 'a';
        lista3.imprime();
        boolean boolean13 = lista3.vazia();
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0361");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        int int17 = lista0.pos;
        lista0.primeiro = (-1);
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        java.lang.Object[] objArray26 = lista21.item;
        lista21.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        lista28.primeiro = (short) 1;
        int int35 = lista28.pos;
        lista28.pos = '#';
        lista28.imprime();
        boolean boolean39 = lista28.vazia();
        int int40 = lista28.ultimo;
        java.lang.Object[] objArray41 = lista28.item;
        lista21.item = objArray41;
        lista0.item = objArray41;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 100;
        int int48 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0362");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        lista0.pos = 0;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0363");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        int int33 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0364");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        lista0.primeiro = 35;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0365");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        lista0.ultimo = 0;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0366");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        lista0.pos = 35;
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0367");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        lista0.ultimo = (byte) 1;
        boolean boolean28 = lista0.vazia();
        boolean boolean29 = lista0.vazia();
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0368");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = (byte) 0;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0369");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0370");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        lista0.ultimo = 'a';
        int int19 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0371");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = 0;
        lista0.ultimo = (byte) 0;
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0372");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista5 = new ds.Lista();
        lista5.pos = 10;
        lista5.pos = (byte) 100;
        lista5.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        java.lang.Object[] objArray14 = lista11.item;
        lista5.item = objArray14;
        lista0.item = objArray14;
        lista0.ultimo = 35;
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0373");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0374");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        int int13 = lista9.ultimo;
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista9.imprime();
        java.lang.Object[] objArray18 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista0.primeiro;
        int int21 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0375");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        lista14.pos = 100;
        lista14.pos = (byte) 0;
        int int26 = lista14.pos;
        lista14.primeiro = '#';
        int int29 = lista14.primeiro;
        lista0.insere((java.lang.Object) int29);
        boolean boolean31 = lista0.vazia();
        lista0.primeiro = 32;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0376");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        lista0.ultimo = 97;
        int int18 = lista0.primeiro;
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0377");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0378");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.imprime();
        int int15 = lista11.ultimo;
        boolean boolean16 = lista11.vazia();
        boolean boolean17 = lista11.vazia();
        java.lang.Object[] objArray18 = lista11.item;
        lista11.imprime();
        lista11.primeiro = 0;
        java.lang.Object[] objArray22 = null;
        lista11.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0379");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        lista3.ultimo = 0;
        int int25 = lista3.primeiro;
        int int26 = lista3.primeiro;
        lista3.primeiro = 0;
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0380");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.imprime();
        int int29 = lista25.ultimo;
        boolean boolean30 = lista25.vazia();
        boolean boolean31 = lista25.vazia();
        java.lang.Object[] objArray32 = lista25.item;
        lista25.imprime();
        java.lang.Object[] objArray34 = lista25.item;
        java.lang.Object[] objArray35 = lista25.item;
        lista12.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        int int38 = lista0.primeiro;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0381");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = 0;
        lista0.primeiro = (byte) -1;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        int int20 = lista14.ultimo;
        lista0.insere((java.lang.Object) lista14);
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0382");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.imprime();
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0383");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        int int20 = lista14.primeiro;
        lista14.insere((java.lang.Object) 100.0f);
        lista14.ultimo = (-1);
        int int25 = lista14.ultimo;
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.pos = (byte) 100;
        int int31 = lista26.pos;
        lista26.pos = (byte) 100;
        lista26.pos = 100;
        lista26.pos = (byte) 0;
        int int38 = lista26.pos;
        boolean boolean39 = lista26.vazia();
        lista26.primeiro = (short) 1;
        lista26.ultimo = (byte) 10;
        ds.Lista lista44 = new ds.Lista();
        lista44.imprime();
        lista44.imprime();
        lista44.insere((java.lang.Object) 0L);
        lista44.ultimo = '#';
        lista44.pos = 10;
        ds.Lista lista53 = new ds.Lista();
        lista53.pos = 10;
        lista53.pos = (byte) 100;
        int int58 = lista53.pos;
        lista53.pos = (byte) 100;
        int int61 = lista53.pos;
        lista44.insere((java.lang.Object) int61);
        lista26.insere((java.lang.Object) int61);
        ds.Lista lista64 = new ds.Lista();
        lista64.pos = 10;
        lista64.pos = (byte) 100;
        int int69 = lista64.pos;
        int int70 = lista64.primeiro;
        lista64.ultimo = 0;
        java.lang.Object[] objArray73 = lista64.item;
        lista26.insere((java.lang.Object) objArray73);
        lista14.item = objArray73;
        lista0.item = objArray73;
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0384");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        int int9 = lista0.ultimo;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0385");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        lista8.pos = (byte) 0;
        int int14 = lista8.ultimo;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        lista15.imprime();
        boolean boolean18 = lista15.vazia();
        int int19 = lista15.primeiro;
        java.lang.Object[] objArray20 = lista15.item;
        lista8.insere((java.lang.Object) objArray20);
        lista8.imprime();
        boolean boolean23 = lista8.vazia();
        lista0.insere((java.lang.Object) lista8);
        lista8.pos = (short) 1;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        lista27.imprime();
        lista27.pos = (short) 100;
        int int32 = lista27.pos;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        lista33.imprime();
        lista33.insere((java.lang.Object) 0L);
        lista33.ultimo = '#';
        lista33.pos = 10;
        ds.Lista lista42 = new ds.Lista();
        lista42.pos = 10;
        lista42.pos = (byte) 100;
        int int47 = lista42.pos;
        lista42.pos = (byte) 100;
        int int50 = lista42.pos;
        lista33.insere((java.lang.Object) int50);
        lista27.insere((java.lang.Object) lista33);
        lista27.ultimo = (byte) 1;
        boolean boolean55 = lista27.vazia();
        lista27.pos = 32;
        lista8.insere((java.lang.Object) 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0386");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.primeiro = 97;
        lista0.ultimo = 101;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0387");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = objArray15.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0388");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = '#';
        lista0.ultimo = (short) 10;
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        int int18 = lista13.pos;
        int int19 = lista13.primeiro;
        lista13.ultimo = 0;
        lista13.primeiro = 0;
        java.lang.Class<?> wildcardClass24 = lista13.getClass();
        lista10.insere((java.lang.Object) wildcardClass24);
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        lista26.imprime();
        boolean boolean29 = lista26.vazia();
        int int30 = lista26.primeiro;
        java.lang.Object[] objArray31 = lista26.item;
        lista26.ultimo = 10;
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        lista34.imprime();
        boolean boolean37 = lista34.vazia();
        int int38 = lista34.primeiro;
        java.lang.Object[] objArray39 = lista34.item;
        lista26.item = objArray39;
        lista10.item = objArray39;
        lista0.item = objArray39;
        ds.Lista lista43 = new ds.Lista();
        lista43.imprime();
        lista43.imprime();
        lista43.insere((java.lang.Object) 0L);
        boolean boolean48 = lista43.vazia();
        int int49 = lista43.primeiro;
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        lista50.imprime();
        boolean boolean53 = lista50.vazia();
        int int54 = lista50.primeiro;
        java.lang.Object[] objArray55 = lista50.item;
        lista43.insere((java.lang.Object) objArray55);
        lista0.item = objArray55;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0389");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0390");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        int int15 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0391");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        int int11 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0392");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        int int10 = lista6.primeiro;
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        java.lang.Object[] objArray13 = lista0.item;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0393");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (byte) 100;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0394");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        lista0.ultimo = (short) 0;
        boolean boolean16 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0395");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0396");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0397");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        int int13 = lista9.ultimo;
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista9.imprime();
        java.lang.Object[] objArray18 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        lista9.ultimo = 1;
        boolean boolean22 = lista9.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0398");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.primeiro;
        int int16 = lista0.primeiro;
        java.lang.Object[] objArray17 = lista0.item;
        boolean boolean18 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0399");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.pos = (-1);
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        java.lang.Object[] objArray30 = lista25.item;
        lista12.item = objArray30;
        lista0.item = objArray30;
        ds.Lista lista33 = new ds.Lista();
        lista33.pos = 10;
        lista33.pos = (byte) 100;
        int int38 = lista33.pos;
        int int39 = lista33.primeiro;
        lista33.ultimo = 0;
        lista33.primeiro = 0;
        lista33.pos = (short) 10;
        ds.Lista lista46 = new ds.Lista();
        lista46.pos = 10;
        lista46.pos = (byte) 100;
        java.lang.Object[] objArray51 = lista46.item;
        lista33.item = objArray51;
        java.lang.Object[] objArray53 = lista33.item;
        int int54 = lista33.ultimo;
        lista33.pos = (short) 1;
        java.lang.Object[] objArray57 = lista33.item;
        lista0.item = objArray57;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0400");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.pos;
        java.lang.Object[] objArray16 = lista0.item;
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0401");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0402");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        int int13 = lista9.ultimo;
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista9.imprime();
        java.lang.Object[] objArray18 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        boolean boolean20 = lista9.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0403");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0404");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.pos;
        lista0.imprime();
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0405");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = '#';
        int int8 = lista0.pos;
        int int9 = lista0.primeiro;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0406");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.pos = 10;
        lista18.imprime();
        lista18.imprime();
        boolean boolean23 = lista18.vazia();
        lista18.primeiro = (short) 100;
        int int26 = lista18.ultimo;
        java.lang.Object[] objArray27 = lista18.item;
        lista0.insere((java.lang.Object) lista18);
        int int29 = lista18.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0407");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        lista0.pos = 0;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0408");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        int int10 = lista6.primeiro;
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 100;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0409");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        lista0.pos = (short) 100;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        lista17.primeiro = (short) 1;
        int int24 = lista17.pos;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.ultimo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { int26 };
        lista17.item = objArray27;
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        int int34 = lista29.pos;
        lista29.pos = (byte) 100;
        lista29.pos = 100;
        lista29.pos = (byte) 0;
        int int41 = lista29.pos;
        boolean boolean42 = lista29.vazia();
        lista29.primeiro = (short) 1;
        lista17.insere((java.lang.Object) lista29);
        ds.Lista lista46 = new ds.Lista();
        lista46.pos = 10;
        lista46.pos = (byte) 100;
        int int51 = lista46.pos;
        int int52 = lista46.primeiro;
        lista46.ultimo = 0;
        lista46.primeiro = 0;
        lista46.pos = (short) 10;
        ds.Lista lista59 = new ds.Lista();
        lista59.imprime();
        lista59.imprime();
        boolean boolean62 = lista59.vazia();
        int int63 = lista59.primeiro;
        java.lang.Object[] objArray64 = lista59.item;
        lista59.ultimo = 10;
        java.lang.Object[] objArray67 = lista59.item;
        lista46.item = objArray67;
        lista29.item = objArray67;
        lista0.item = objArray67;
        lista0.pos = (short) 100;
        int int73 = lista0.primeiro;
        int int74 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 35 + "'", int73 == 35);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 35 + "'", int74 == 35);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0410");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        boolean boolean16 = lista13.vazia();
        int int17 = lista13.primeiro;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        lista18.insere((java.lang.Object) 0L);
        int int23 = lista18.primeiro;
        lista18.primeiro = (-1);
        lista13.insere((java.lang.Object) (-1));
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        lista27.imprime();
        lista27.insere((java.lang.Object) 0L);
        boolean boolean32 = lista27.vazia();
        int int33 = lista27.primeiro;
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        lista34.imprime();
        boolean boolean37 = lista34.vazia();
        int int38 = lista34.primeiro;
        java.lang.Object[] objArray39 = lista34.item;
        lista27.insere((java.lang.Object) objArray39);
        lista13.item = objArray39;
        lista0.item = objArray39;
        int int43 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0411");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.insere((java.lang.Object) objArray12);
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.primeiro;
        lista15.ultimo = 0;
        lista0.insere((java.lang.Object) lista15);
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0412");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        lista0.primeiro = 'a';
        lista0.primeiro = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0413");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        lista0.primeiro = 'a';
        boolean boolean6 = lista0.vazia();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0414");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        lista0.pos = (byte) 1;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0415");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        lista20.insere((java.lang.Object) 0L);
        lista20.ultimo = '#';
        lista20.pos = 10;
        int int29 = lista20.primeiro;
        lista20.pos = 0;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0416");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        int int11 = lista0.pos;
        int int12 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0417");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        int int13 = lista9.ultimo;
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista9.imprime();
        java.lang.Object[] objArray18 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0418");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        lista0.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        boolean boolean26 = lista21.vazia();
        lista21.ultimo = (byte) 10;
        lista21.primeiro = (short) 10;
        java.lang.Object[] objArray31 = lista21.item;
        lista0.insere((java.lang.Object) objArray31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0419");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        lista0.primeiro = 'a';
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        int int12 = lista7.pos;
        lista7.pos = (byte) 100;
        lista7.pos = 100;
        lista7.pos = (byte) 0;
        int int19 = lista7.pos;
        boolean boolean20 = lista7.vazia();
        lista7.primeiro = (short) 1;
        lista7.ultimo = (byte) 10;
        boolean boolean25 = lista7.vazia();
        java.lang.Object[] objArray26 = lista7.item;
        lista0.item = objArray26;
        int int28 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0420");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        boolean boolean13 = lista3.vazia();
        int int14 = lista3.pos;
        lista0.insere((java.lang.Object) int14);
        int int16 = lista0.primeiro;
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0421");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.pos;
        int int18 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0422");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        lista0.pos = (byte) -1;
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0423");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        int int12 = lista8.primeiro;
        java.lang.Object[] objArray13 = lista8.item;
        lista0.item = objArray13;
        int int15 = lista0.primeiro;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.pos = 100;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = 10;
        lista19.imprime();
        lista19.primeiro = (short) 0;
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        lista25.imprime();
        boolean boolean28 = lista25.vazia();
        lista25.pos = (byte) 0;
        int int31 = lista25.pos;
        java.lang.Object[] objArray32 = lista25.item;
        lista19.item = objArray32;
        lista0.insere((java.lang.Object) lista19);
        lista19.ultimo = 2;
        ds.Lista lista37 = new ds.Lista();
        lista37.pos = 10;
        lista37.pos = (byte) 100;
        lista37.primeiro = (short) 1;
        int int44 = lista37.pos;
        lista37.pos = '#';
        lista37.imprime();
        int int48 = lista37.primeiro;
        lista37.primeiro = (byte) 1;
        int int51 = lista37.ultimo;
        java.lang.Object[] objArray52 = lista37.item;
        lista19.item = objArray52;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0424");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        lista3.primeiro = 'a';
        lista3.imprime();
        lista3.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0425");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        lista0.pos = 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        int int19 = lista14.primeiro;
        lista14.primeiro = (-1);
        lista9.insere((java.lang.Object) (-1));
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        lista23.insere((java.lang.Object) 0L);
        boolean boolean28 = lista23.vazia();
        int int29 = lista23.primeiro;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        boolean boolean33 = lista30.vazia();
        int int34 = lista30.primeiro;
        java.lang.Object[] objArray35 = lista30.item;
        lista23.insere((java.lang.Object) objArray35);
        lista9.item = objArray35;
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        lista38.ultimo = 0;
        lista38.primeiro = 0;
        ds.Lista lista49 = new ds.Lista();
        lista49.pos = 10;
        lista49.pos = (byte) 100;
        int int54 = lista49.pos;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (byte) 1, "hi!", true, 1.0f };
        lista49.item = objArray59;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 0L, lista9, 0, lista49, 10.0d };
        lista0.item = objArray62;
        lista0.ultimo = 0;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0426");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = '#';
        int int8 = lista0.pos;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0427");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        lista0.primeiro = ' ';
        lista0.primeiro = 32;
        lista0.primeiro = 1;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0428");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        lista0.imprime();
        lista0.pos = 10;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.pos = (byte) 100;
        int int13 = lista8.pos;
        lista8.pos = (byte) 100;
        lista8.pos = 100;
        lista8.pos = (byte) 0;
        int int20 = lista8.pos;
        lista8.primeiro = '#';
        boolean boolean23 = lista8.vazia();
        lista0.insere((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0429");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        lista0.pos = (byte) 1;
        lista0.imprime();
        int int10 = lista0.ultimo;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0430");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.ultimo;
        int int15 = lista3.primeiro;
        lista3.pos = (short) 10;
        boolean boolean18 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0431");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        lista7.pos = '#';
        lista7.imprime();
        boolean boolean18 = lista7.vazia();
        int int19 = lista7.ultimo;
        java.lang.Object[] objArray20 = lista7.item;
        lista0.item = objArray20;
        boolean boolean22 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0432");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        int int18 = lista0.pos;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0433");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 100.0d, (byte) 100, lista18, 1L };
        lista7.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        lista0.insere((java.lang.Object) objArray20);
        lista0.pos = (byte) 100;
        int int26 = lista0.pos;
        int int27 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0434");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        lista0.pos = 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        int int19 = lista14.primeiro;
        lista14.primeiro = (-1);
        lista9.insere((java.lang.Object) (-1));
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        lista23.insere((java.lang.Object) 0L);
        boolean boolean28 = lista23.vazia();
        int int29 = lista23.primeiro;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        boolean boolean33 = lista30.vazia();
        int int34 = lista30.primeiro;
        java.lang.Object[] objArray35 = lista30.item;
        lista23.insere((java.lang.Object) objArray35);
        lista9.item = objArray35;
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        lista38.ultimo = 0;
        lista38.primeiro = 0;
        ds.Lista lista49 = new ds.Lista();
        lista49.pos = 10;
        lista49.pos = (byte) 100;
        int int54 = lista49.pos;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (byte) 1, "hi!", true, 1.0f };
        lista49.item = objArray59;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 0L, lista9, 0, lista49, 10.0d };
        lista0.item = objArray62;
        int int64 = lista0.pos;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0435");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        lista0.ultimo = 1;
        java.lang.Object[] objArray25 = lista0.item;
        int int26 = lista0.pos;
        java.lang.Object[] objArray27 = lista0.item;
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0436");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        lista3.primeiro = 'a';
        lista3.imprime();
        boolean boolean13 = lista3.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        lista14.primeiro = (short) 1;
        int int21 = lista14.pos;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.ultimo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { int23 };
        lista14.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.pos = (byte) 100;
        boolean boolean31 = lista26.vazia();
        lista26.ultimo = '#';
        java.lang.Object[] objArray34 = lista26.item;
        lista14.insere((java.lang.Object) objArray34);
        lista3.insere((java.lang.Object) objArray34);
        java.lang.Class<?> wildcardClass37 = objArray34.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0437");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.ultimo = (short) 0;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0438");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0439");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        java.lang.Object[] objArray13 = lista10.item;
        lista10.pos = (short) 0;
        java.lang.Object[] objArray16 = lista10.item;
        lista0.item = objArray16;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0440");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        int int13 = lista9.ultimo;
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista9.imprime();
        java.lang.Object[] objArray18 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        lista0.primeiro = (byte) 100;
        int int22 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0441");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = 0;
        lista0.pos = 12;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0442");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        lista15.primeiro = (short) 10;
        java.lang.Object[] objArray19 = lista15.item;
        lista0.item = objArray19;
        int int21 = lista0.ultimo;
        int int22 = lista0.primeiro;
        boolean boolean23 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0443");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        int int5 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0444");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        boolean boolean23 = lista3.vazia();
        java.lang.Object[] objArray24 = lista3.item;
        lista3.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0445");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.ultimo;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0446");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        lista9.pos = (short) 100;
        int int14 = lista9.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        lista15.imprime();
        lista15.insere((java.lang.Object) 0L);
        lista15.ultimo = '#';
        lista15.pos = 10;
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        int int29 = lista24.pos;
        lista24.pos = (byte) 100;
        int int32 = lista24.pos;
        lista15.insere((java.lang.Object) int32);
        lista9.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista9);
        java.lang.Object[] objArray36 = lista9.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0447");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.ultimo;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0448");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        int int23 = lista0.primeiro;
        int int24 = lista0.ultimo;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        lista25.pos = (byte) 100;
        lista25.pos = 100;
        lista25.pos = (byte) 0;
        ds.Lista lista37 = new ds.Lista();
        lista37.pos = 10;
        lista37.pos = (byte) 100;
        java.lang.Object[] objArray42 = lista37.item;
        lista25.item = objArray42;
        int int44 = lista25.pos;
        lista0.insere((java.lang.Object) int44);
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0449");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.pos;
        int int14 = lista0.primeiro;
        java.lang.Object obj15 = null;
        lista0.insere(obj15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0450");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0451");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0452");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        boolean boolean18 = lista0.vazia();
        java.lang.Object[] objArray19 = lista0.item;
        int int20 = lista0.primeiro;
        lista0.ultimo = (byte) 100;
        int int23 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0453");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray4 = lista0.item;
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0454");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.primeiro;
        lista0.ultimo = 0;
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0455");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        int int14 = lista0.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.imprime();
        lista15.primeiro = (short) 0;
        java.lang.Object[] objArray21 = lista15.item;
        lista15.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        int int25 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0456");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0457");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass26 = lista16.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0458");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        java.lang.Object[] objArray14 = lista0.item;
        int int15 = lista0.primeiro;
        int int16 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0459");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.pos = 97;
        int int17 = lista0.primeiro;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0460");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = 0;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 12;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0461");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.imprime();
        int int30 = lista26.ultimo;
        lista6.insere((java.lang.Object) int30);
        int int32 = lista6.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0462");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        int int10 = lista0.primeiro;
        int int11 = lista0.pos;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0463");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.ultimo = (short) -1;
        int int14 = lista0.primeiro;
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0]");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0464");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        int int10 = lista6.primeiro;
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0465");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        int int10 = lista0.primeiro;
        lista0.primeiro = (short) 100;
        lista0.pos = (-1);
        lista0.ultimo = 0;
        boolean boolean17 = lista0.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        boolean boolean21 = lista18.vazia();
        int int22 = lista18.primeiro;
        java.lang.Object[] objArray23 = lista18.item;
        lista18.ultimo = 10;
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        lista26.imprime();
        boolean boolean29 = lista26.vazia();
        int int30 = lista26.primeiro;
        java.lang.Object[] objArray31 = lista26.item;
        lista18.item = objArray31;
        lista0.insere((java.lang.Object) objArray31);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0466");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        int int11 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0467");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = '#';
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        int int12 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0468");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0469");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        lista0.pos = 35;
        java.lang.Object[] objArray19 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0470");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        boolean boolean19 = lista14.vazia();
        int int20 = lista14.primeiro;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        int int25 = lista21.primeiro;
        java.lang.Object[] objArray26 = lista21.item;
        lista14.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        int int29 = lista0.primeiro;
        java.lang.Object[] objArray30 = lista0.item;
        java.lang.Class<?> wildcardClass31 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0471");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = (byte) 10;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0472");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista0.pos;
        int int11 = lista0.ultimo;
        lista0.pos = 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0473");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.ultimo = (short) -1;
        lista0.pos = 97;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0474");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.pos = 10;
        lista1.pos = (byte) 100;
        boolean boolean6 = lista1.vazia();
        lista1.ultimo = '#';
        lista1.ultimo = (short) 10;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        int int20 = lista14.primeiro;
        lista14.ultimo = 0;
        lista14.primeiro = 0;
        java.lang.Class<?> wildcardClass25 = lista14.getClass();
        lista11.insere((java.lang.Object) wildcardClass25);
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        lista27.imprime();
        boolean boolean30 = lista27.vazia();
        int int31 = lista27.primeiro;
        java.lang.Object[] objArray32 = lista27.item;
        lista27.ultimo = 10;
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        lista35.imprime();
        boolean boolean38 = lista35.vazia();
        int int39 = lista35.primeiro;
        java.lang.Object[] objArray40 = lista35.item;
        lista27.item = objArray40;
        lista11.item = objArray40;
        lista1.item = objArray40;
        lista0.insere((java.lang.Object) objArray40);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0475");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0476");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0477");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        lista11.primeiro = (short) 1;
        int int18 = lista11.pos;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.ultimo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { int20 };
        lista11.item = objArray21;
        lista0.item = objArray21;
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0478");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        java.lang.Object[] objArray12 = lista0.item;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        boolean boolean16 = lista13.vazia();
        lista13.pos = (byte) 0;
        int int19 = lista13.pos;
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        lista20.pos = (byte) 100;
        lista20.primeiro = (short) 1;
        int int27 = lista20.pos;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.ultimo;
        java.lang.Object[] objArray30 = new java.lang.Object[] { int29 };
        lista20.item = objArray30;
        lista20.imprime();
        lista20.primeiro = (short) 1;
        ds.Lista lista35 = new ds.Lista();
        lista35.pos = 10;
        lista35.pos = (byte) 100;
        int int40 = lista35.pos;
        int int41 = lista35.primeiro;
        lista35.ultimo = 0;
        lista35.primeiro = 0;
        lista35.pos = (short) 10;
        ds.Lista lista48 = new ds.Lista();
        lista48.pos = 10;
        lista48.pos = (byte) 100;
        java.lang.Object[] objArray53 = lista48.item;
        lista35.item = objArray53;
        lista20.item = objArray53;
        lista13.item = objArray53;
        lista0.item = objArray53;
        int int58 = lista0.ultimo;
        java.lang.Class<?> wildcardClass59 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0479");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        int int20 = lista0.pos;
        lista0.imprime();
        int int22 = lista0.primeiro;
        int int23 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0480");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.ultimo = (short) 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        int int23 = lista16.pos;
        lista16.primeiro = 100;
        int int26 = lista16.primeiro;
        lista0.insere((java.lang.Object) int26);
        java.lang.Object[] objArray28 = null;
        lista0.item = objArray28;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0481");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        lista0.pos = (short) 100;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        lista17.primeiro = (short) 1;
        int int24 = lista17.pos;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.ultimo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { int26 };
        lista17.item = objArray27;
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        int int34 = lista29.pos;
        lista29.pos = (byte) 100;
        lista29.pos = 100;
        lista29.pos = (byte) 0;
        int int41 = lista29.pos;
        boolean boolean42 = lista29.vazia();
        lista29.primeiro = (short) 1;
        lista17.insere((java.lang.Object) lista29);
        ds.Lista lista46 = new ds.Lista();
        lista46.pos = 10;
        lista46.pos = (byte) 100;
        int int51 = lista46.pos;
        int int52 = lista46.primeiro;
        lista46.ultimo = 0;
        lista46.primeiro = 0;
        lista46.pos = (short) 10;
        ds.Lista lista59 = new ds.Lista();
        lista59.imprime();
        lista59.imprime();
        boolean boolean62 = lista59.vazia();
        int int63 = lista59.primeiro;
        java.lang.Object[] objArray64 = lista59.item;
        lista59.ultimo = 10;
        java.lang.Object[] objArray67 = lista59.item;
        lista46.item = objArray67;
        lista29.item = objArray67;
        lista0.item = objArray67;
        lista0.pos = (short) 100;
        int int73 = lista0.primeiro;
        int int74 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 35 + "'", int73 == 35);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0482");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) 0L);
        int int14 = lista9.primeiro;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        lista15.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.pos = 10;
        lista18.pos = (byte) 100;
        int int23 = lista18.pos;
        lista18.pos = (byte) 100;
        lista18.pos = 100;
        lista18.pos = (byte) 0;
        lista15.insere((java.lang.Object) (byte) 0);
        lista15.primeiro = 'a';
        lista9.insere((java.lang.Object) 'a');
        lista9.pos = (short) -1;
        lista0.insere((java.lang.Object) lista9);
        java.lang.Class<?> wildcardClass37 = lista9.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0483");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0484");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        int int9 = lista3.primeiro;
        lista3.ultimo = 0;
        lista3.primeiro = 0;
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass14);
        java.lang.Object[] objArray16 = lista0.item;
        boolean boolean17 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        lista20.pos = (byte) 100;
        boolean boolean25 = lista20.vazia();
        lista20.ultimo = '#';
        lista20.ultimo = (short) 10;
        ds.Lista lista30 = new ds.Lista();
        lista30.pos = 10;
        ds.Lista lista33 = new ds.Lista();
        lista33.pos = 10;
        lista33.pos = (byte) 100;
        int int38 = lista33.pos;
        int int39 = lista33.primeiro;
        lista33.ultimo = 0;
        lista33.primeiro = 0;
        java.lang.Class<?> wildcardClass44 = lista33.getClass();
        lista30.insere((java.lang.Object) wildcardClass44);
        ds.Lista lista46 = new ds.Lista();
        lista46.imprime();
        lista46.imprime();
        boolean boolean49 = lista46.vazia();
        int int50 = lista46.primeiro;
        java.lang.Object[] objArray51 = lista46.item;
        lista46.ultimo = 10;
        ds.Lista lista54 = new ds.Lista();
        lista54.imprime();
        lista54.imprime();
        boolean boolean57 = lista54.vazia();
        int int58 = lista54.primeiro;
        java.lang.Object[] objArray59 = lista54.item;
        lista46.item = objArray59;
        lista30.item = objArray59;
        lista20.item = objArray59;
        lista19.insere((java.lang.Object) objArray59);
        lista0.item = objArray59;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0485");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0486");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.imprime();
        lista0.pos = (byte) 10;
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0487");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object obj2 = null;
        lista0.insere(obj2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0488");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.ultimo = 97;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0489");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0490");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0491");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        lista0.ultimo = 'a';
        int int19 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0492");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        lista12.primeiro = (short) 1;
        int int19 = lista12.pos;
        int int20 = lista12.pos;
        int int21 = lista12.ultimo;
        lista8.insere((java.lang.Object) int21);
        java.lang.Object[] objArray23 = lista8.item;
        lista0.item = objArray23;
        java.lang.Class<?> wildcardClass25 = objArray23.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0493");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = '#';
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0494");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        int int13 = lista9.ultimo;
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista9.imprime();
        java.lang.Object[] objArray18 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0495");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.pos;
        lista0.pos = (short) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0496");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.ultimo = (short) 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        int int23 = lista16.pos;
        lista16.primeiro = 100;
        int int26 = lista16.primeiro;
        lista0.insere((java.lang.Object) int26);
        int int28 = lista0.ultimo;
        int int29 = lista0.primeiro;
        int int30 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0497");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        int int9 = lista0.primeiro;
        lista0.pos = 0;
        int int12 = lista0.primeiro;
        int int13 = lista0.pos;
        int int14 = lista0.primeiro;
        int int15 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0498");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        lista0.ultimo = 100;
        int int13 = lista0.pos;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0499");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = (short) 0;
        int int6 = lista0.pos;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0500");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        int int18 = lista0.pos;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        int int21 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }
}

