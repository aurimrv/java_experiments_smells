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
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila4.item = objArray8;
        fila2.item = objArray8;
        fila0.item = objArray8;
        java.lang.Class<?> wildcardClass12 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = (short) 100;
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        fila9.item = objArray13;
        java.lang.Object[] objArray15 = fila9.item;
        fila9.frente = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        int int10 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        int int18 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        int int10 = fila8.frente;
        int int11 = fila8.frente;
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        fila0.frente = (short) 100;
        fila0.frente = (byte) 100;
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        boolean boolean8 = fila6.vazia();
        boolean boolean9 = fila6.vazia();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        fila12.item = objArray16;
        fila10.item = objArray16;
        fila10.tras = (short) -1;
        fila6.enfileira((java.lang.Object) (short) -1);
        fila6.tras = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        fila11.item = objArray15;
        fila9.item = objArray15;
        fila0.item = objArray15;
        fila0.tras = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) -1;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.tras = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        int int12 = fila10.frente;
        int int13 = fila10.frente;
        boolean boolean14 = fila10.vazia();
        int int15 = fila10.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.enfileira((java.lang.Object) 1.0d);
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila16.item = objArray20;
        fila14.item = objArray20;
        fila8.item = objArray20;
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        fila24.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        fila32.item = objArray36;
        fila30.item = objArray36;
        fila24.item = objArray36;
        fila8.item = objArray36;
        fila0.item = objArray36;
        fila0.tras = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.tras = 0;
        int int14 = fila10.tras;
        fila10.frente = (byte) 1;
        int int17 = fila10.tras;
        int int18 = fila10.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.enfileira((java.lang.Object) 1.0d);
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila16.item = objArray20;
        fila14.item = objArray20;
        fila8.item = objArray20;
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        fila24.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        fila32.item = objArray36;
        fila30.item = objArray36;
        fila24.item = objArray36;
        fila8.item = objArray36;
        fila0.item = objArray36;
        fila0.tras = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        fila0.frente = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = 10;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.imprime();
        java.lang.Object[] objArray8 = fila5.item;
        java.lang.Object[] objArray9 = fila5.item;
        fila0.enfileira((java.lang.Object) fila5);
        fila0.frente = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila4.item = objArray8;
        fila2.item = objArray8;
        fila0.item = objArray8;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.tras = 0;
        boolean boolean12 = fila8.vazia();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { fila13 };
        fila8.item = objArray14;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        java.lang.Object[] objArray6 = fila4.item;
        fila4.frente = 10;
        fila4.tras = (byte) 1;
        fila0.enfileira((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        fila9.item = objArray13;
        fila7.item = objArray13;
        boolean boolean16 = fila7.vazia();
        int int17 = fila7.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila4.item = objArray8;
        fila2.item = objArray8;
        fila0.item = objArray8;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.imprime();
        java.lang.Object[] objArray15 = fila12.item;
        java.lang.Object[] objArray16 = fila12.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.frente = '#';
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        fila7.item = objArray11;
        fila4.item = objArray11;
        fila0.item = objArray11;
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        fila0.tras = 100;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.imprime();
        int int9 = fila6.tras;
        int int10 = fila6.tras;
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.imprime();
        java.lang.Object[] objArray21 = fila18.item;
        fila0.item = objArray21;
        fila0.imprime();
        int int24 = fila0.tras;
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        fila0.tras = 100;
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        int int11 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        int int5 = fila3.frente;
        fila3.enfileira((java.lang.Object) 1);
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        int int14 = fila8.frente;
        java.lang.Object[] objArray15 = fila8.item;
        fila3.item = objArray15;
        fila0.item = objArray15;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        fila11.item = objArray15;
        fila9.item = objArray15;
        fila0.item = objArray15;
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        int int5 = fila3.frente;
        fila0.enfileira((java.lang.Object) int5);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.frente = 35;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.tras = 0;
        boolean boolean11 = fila7.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = new java.lang.Object[] { fila12 };
        fila7.item = objArray13;
        fila3.item = objArray13;
        fila0.enfileira((java.lang.Object) fila3);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        int int10 = fila0.tras;
        fila0.imprime();
        int int12 = fila0.frente;
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.frente;
        fila14.tras = (short) 10;
        fila14.tras = 100;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.imprime();
        int int23 = fila20.tras;
        int int24 = fila20.tras;
        java.lang.Object[] objArray25 = fila20.item;
        fila14.item = objArray25;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.tras = 0;
        int int12 = fila8.tras;
        fila8.frente = (byte) 1;
        int int15 = fila8.tras;
        int int16 = fila8.frente;
        int int17 = fila8.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = null;
        fila0.item = objArray8;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object[] objArray3 = null;
        fila0.item = objArray3;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = (short) 100;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.tras = 0;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila16.item = objArray20;
        fila13.item = objArray20;
        fila9.item = objArray20;
        fila0.item = objArray20;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        fila0.frente = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) fila16);
        fila16.frente = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        fila0.tras = 100;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.imprime();
        int int9 = fila6.tras;
        int int10 = fila6.tras;
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        int int13 = fila0.frente;
        fila0.frente = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.frente = 35;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.tras = 0;
        boolean boolean8 = fila4.vazia();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { fila9 };
        fila4.item = objArray10;
        fila0.item = objArray10;
        java.lang.Class<?> wildcardClass13 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        int int7 = fila0.tras;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.enfileira((java.lang.Object) 1.0d);
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        fila0.tras = '#';
        int int9 = fila0.frente;
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        boolean boolean11 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        int int10 = fila0.tras;
        fila0.imprime();
        int int12 = fila0.frente;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila16.item = objArray20;
        fila13.item = objArray20;
        boolean boolean23 = fila13.vazia();
        fila13.imprime();
        fila13.frente = 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.tras = (short) 1;
        fila0.frente = 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        int int12 = fila10.frente;
        int int13 = fila10.frente;
        boolean boolean14 = fila10.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        int int17 = fila15.frente;
        int int18 = fila15.frente;
        boolean boolean19 = fila15.vazia();
        fila10.enfileira((java.lang.Object) fila15);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        java.lang.Object[] objArray7 = fila4.item;
        fila4.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        fila12.item = objArray16;
        fila10.item = objArray16;
        fila4.enfileira((java.lang.Object) fila10);
        int int20 = fila10.frente;
        fila0.enfileira((java.lang.Object) int20);
        int int22 = fila0.tras;
        fila0.frente = '4';
        fila0.frente = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.frente = 10;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        fila10.item = objArray14;
        fila8.item = objArray14;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        fila19.item = objArray23;
        fila17.item = objArray23;
        fila8.item = objArray23;
        fila0.item = objArray23;
        java.lang.Class<?> wildcardClass28 = objArray23.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        fila10.item = objArray14;
        fila8.item = objArray14;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        fila19.item = objArray23;
        fila17.item = objArray23;
        fila8.item = objArray23;
        fila0.item = objArray23;
        int int28 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.tras = (short) 1;
        fila0.frente = 10;
        int int16 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.enfileira((java.lang.Object) 1.0d);
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila16.item = objArray20;
        fila14.item = objArray20;
        fila8.item = objArray20;
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        fila24.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        fila32.item = objArray36;
        fila30.item = objArray36;
        fila24.item = objArray36;
        fila8.item = objArray36;
        fila0.item = objArray36;
        fila0.frente = (-1);
        java.lang.Class<?> wildcardClass44 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        fila0.frente = (byte) -1;
        fila0.imprime();
        fila0.frente = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        int int7 = fila0.tras;
        fila0.tras = 0;
        int int10 = fila0.frente;
        fila0.tras = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.frente = (byte) 1;
        int int18 = fila0.frente;
        fila0.frente = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        fila0.frente = (byte) -1;
        fila0.frente = '4';
        java.lang.Object[] objArray15 = fila0.item;
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        fila0.frente = (short) -1;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        fila5.item = objArray9;
        int int11 = fila5.frente;
        java.lang.Object[] objArray12 = fila5.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.imprime();
        int int17 = fila14.frente;
        fila14.tras = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        fila0.tras = 100;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.imprime();
        int int9 = fila6.tras;
        int int10 = fila6.tras;
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        int int13 = fila0.frente;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.frente = '#';
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.tras = 0;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.imprime();
        java.lang.Object[] objArray15 = fila12.item;
        fila12.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        fila20.item = objArray24;
        fila18.item = objArray24;
        fila12.enfileira((java.lang.Object) fila18);
        int int28 = fila18.frente;
        fila8.enfileira((java.lang.Object) int28);
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.imprime();
        java.lang.Object[] objArray33 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 0);
        int int36 = fila30.frente;
        fila30.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        int int40 = fila38.frente;
        int int41 = fila38.frente;
        java.lang.Object[] objArray42 = fila38.item;
        fila30.item = objArray42;
        fila8.item = objArray42;
        fila0.item = objArray42;
        java.lang.Class<?> wildcardClass46 = objArray42.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.enfileira((java.lang.Object) fila6);
        int int16 = fila6.frente;
        java.lang.Class<?> wildcardClass17 = fila6.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (byte) 1;
        fila0.frente = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        fila0.frente = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.imprime();
        java.lang.Object[] objArray15 = fila12.item;
        fila12.enfileira((java.lang.Object) (byte) 0);
        int int18 = fila12.frente;
        fila12.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        java.lang.Object[] objArray24 = fila20.item;
        fila12.item = objArray24;
        fila0.item = objArray24;
        java.lang.Class<?> wildcardClass27 = objArray24.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = (byte) 100;
        int int12 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        fila0.tras = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        java.lang.Object[] objArray5 = fila3.item;
        fila0.item = objArray5;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        fila0.tras = 100;
        int int13 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.frente;
        fila0.imprime();
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        int int6 = fila0.frente;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = null;
        fila0.item = objArray8;
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        fila0.frente = (short) -1;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.frente;
        fila0.tras = (-1);
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.imprime();
        java.lang.Object[] objArray15 = fila12.item;
        fila12.enfileira((java.lang.Object) (byte) 0);
        int int18 = fila12.frente;
        fila12.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        java.lang.Object[] objArray24 = fila20.item;
        fila12.item = objArray24;
        fila0.item = objArray24;
        int int27 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        fila0.frente = 10;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.imprime();
        java.lang.Object[] objArray17 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        fila22.item = objArray26;
        fila20.item = objArray26;
        fila14.enfileira((java.lang.Object) fila20);
        int int30 = fila20.frente;
        java.lang.Object[] objArray31 = fila20.item;
        fila0.item = objArray31;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.frente = (byte) 1;
        fila0.tras = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.tras = 0;
        boolean boolean13 = fila9.vazia();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { fila14 };
        fila9.item = objArray15;
        int int17 = fila9.frente;
        fila9.imprime();
        int int19 = fila9.frente;
        java.lang.Object[] objArray20 = fila9.item;
        java.lang.Object[] objArray21 = fila9.item;
        fila0.item = objArray21;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        fila7.item = objArray11;
        fila4.item = objArray11;
        fila0.item = objArray11;
        fila0.frente = (-1);
        java.lang.Object[] objArray17 = null;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.imprime();
        java.lang.Object[] objArray22 = fila19.item;
        fila19.enfileira((java.lang.Object) (byte) 0);
        int int25 = fila19.frente;
        fila19.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        int int29 = fila27.frente;
        int int30 = fila27.frente;
        java.lang.Object[] objArray31 = fila27.item;
        fila19.item = objArray31;
        fila0.item = objArray31;
        java.lang.Object[] objArray34 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        boolean boolean18 = fila0.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        fila19.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        fila27.item = objArray31;
        fila25.item = objArray31;
        fila19.item = objArray31;
        fila19.tras = (short) 0;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.imprime();
        java.lang.Object[] objArray40 = fila37.item;
        fila19.item = objArray40;
        fila0.item = objArray40;
        java.lang.Class<?> wildcardClass43 = objArray40.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        java.lang.Object[] objArray7 = fila5.item;
        fila0.enfileira((java.lang.Object) fila5);
        fila0.tras = (short) 100;
        int int11 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        fila0.frente = (short) 100;
        fila0.tras = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object[] objArray11 = fila5.item;
        fila5.tras = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        int int6 = fila0.frente;
        fila0.imprime();
        int int8 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        java.lang.Class<?> wildcardClass9 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        boolean boolean9 = fila0.vazia();
        int int10 = fila0.frente;
        fila0.tras = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        int int11 = fila0.tras;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.tras = (short) 1;
        fila0.frente = 10;
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        int int18 = fila16.frente;
        int int19 = fila16.frente;
        java.lang.Object[] objArray20 = fila16.item;
        fila16.enfileira((java.lang.Object) 1.0d);
        boolean boolean23 = fila16.vazia();
        boolean boolean24 = fila16.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object[] objArray11 = null;
        fila5.item = objArray11;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.frente = 35;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.tras = 0;
        boolean boolean16 = fila12.vazia();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = new java.lang.Object[] { fila17 };
        fila12.item = objArray18;
        fila8.item = objArray18;
        fila0.item = objArray18;
        boolean boolean22 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        fila0.frente = (byte) -1;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        int int10 = fila0.frente;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        fila0.frente = (byte) -1;
        fila0.imprime();
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        fila0.imprime();
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.imprime();
        java.lang.Object[] objArray11 = fila8.item;
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.frente = '#';
        boolean boolean5 = fila0.vazia();
        fila0.tras = (short) 100;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = fila0.item;
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        int int12 = fila10.frente;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.item = objArray14;
        fila0.tras = (short) 100;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.imprime();
        java.lang.Object[] objArray21 = fila18.item;
        fila18.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray30 = new java.lang.Object[] {};
        fila26.item = objArray30;
        fila24.item = objArray30;
        fila18.enfileira((java.lang.Object) fila24);
        int int34 = fila24.frente;
        java.lang.Object[] objArray35 = fila24.item;
        fila0.item = objArray35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (byte) 1;
        fila0.tras = '4';
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        int int16 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        fila0.frente = (short) 10;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.imprime();
        java.lang.Object[] objArray13 = fila10.item;
        fila10.enfileira((java.lang.Object) (byte) 0);
        int int16 = fila10.frente;
        fila10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        int int10 = fila0.tras;
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        fila0.tras = '#';
        int int9 = fila0.frente;
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        fila13.item = objArray17;
        fila11.item = objArray17;
        int int20 = fila11.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila11.item = objArray22;
        fila0.item = objArray22;
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.imprime();
        java.lang.Object[] objArray15 = fila12.item;
        fila12.enfileira((java.lang.Object) (byte) 0);
        int int18 = fila12.frente;
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass21 = fila12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.tras = (short) 1;
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        int int11 = fila9.frente;
        fila9.enfileira((java.lang.Object) 1);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila14.item = objArray18;
        int int20 = fila14.frente;
        java.lang.Object[] objArray21 = fila14.item;
        fila9.item = objArray21;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.tras = 0;
        boolean boolean27 = fila23.vazia();
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = new java.lang.Object[] { fila28 };
        fila23.item = objArray29;
        fila9.item = objArray29;
        fila0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.frente = '#';
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.frente = '#';
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.tras = 0;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.imprime();
        java.lang.Object[] objArray15 = fila12.item;
        fila12.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        fila20.item = objArray24;
        fila18.item = objArray24;
        fila12.enfileira((java.lang.Object) fila18);
        int int28 = fila18.frente;
        fila8.enfileira((java.lang.Object) int28);
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.imprime();
        java.lang.Object[] objArray33 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 0);
        int int36 = fila30.frente;
        fila30.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        int int40 = fila38.frente;
        int int41 = fila38.frente;
        java.lang.Object[] objArray42 = fila38.item;
        fila30.item = objArray42;
        fila8.item = objArray42;
        fila0.item = objArray42;
        java.lang.Class<?> wildcardClass46 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        fila0.tras = 100;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.imprime();
        int int16 = fila13.tras;
        int int17 = fila13.tras;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.enfileira((java.lang.Object) objArray18);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        java.lang.Object[] objArray7 = fila4.item;
        fila4.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        fila12.item = objArray16;
        fila10.item = objArray16;
        fila4.enfileira((java.lang.Object) fila10);
        int int20 = fila10.frente;
        fila0.enfileira((java.lang.Object) int20);
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        boolean boolean24 = fila22.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        fila25.item = objArray29;
        fila22.item = objArray29;
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        int int34 = fila32.frente;
        int int35 = fila32.frente;
        java.lang.Object[] objArray36 = fila32.item;
        fila22.item = objArray36;
        fila0.item = objArray36;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        fila0.tras = '#';
        int int9 = fila0.frente;
        fila0.tras = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.tras = (short) 1;
        java.lang.Object obj9 = fila0.desenfileira();
        int int10 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.frente = 10;
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        java.lang.Object[] objArray9 = fila5.item;
        fila5.enfileira((java.lang.Object) 1.0d);
        int int12 = fila5.tras;
        fila0.enfileira((java.lang.Object) int12);
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.tras = 0;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.imprime();
        java.lang.Object[] objArray22 = fila19.item;
        fila19.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        fila27.item = objArray31;
        fila25.item = objArray31;
        fila19.enfileira((java.lang.Object) fila25);
        int int35 = fila25.frente;
        fila15.enfileira((java.lang.Object) int35);
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.imprime();
        java.lang.Object[] objArray40 = fila37.item;
        fila37.enfileira((java.lang.Object) (byte) 0);
        int int43 = fila37.frente;
        fila37.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        int int47 = fila45.frente;
        int int48 = fila45.frente;
        java.lang.Object[] objArray49 = fila45.item;
        fila37.item = objArray49;
        fila15.item = objArray49;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila53 = new ds.Fila();
        java.lang.Object[] objArray54 = fila53.item;
        java.lang.Object[] objArray55 = fila53.item;
        fila0.enfileira((java.lang.Object) objArray55);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.imprime();
        java.lang.Object[] objArray9 = fila6.item;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila14.item = objArray18;
        fila12.item = objArray18;
        fila6.enfileira((java.lang.Object) fila12);
        fila12.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass25 = fila12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int16 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        boolean boolean11 = fila0.vazia();
        fila0.tras = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) 1;
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.frente = 35;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.tras = 0;
        boolean boolean16 = fila12.vazia();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = new java.lang.Object[] { fila17 };
        fila12.item = objArray18;
        fila8.item = objArray18;
        fila0.item = objArray18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object[] objArray21 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        boolean boolean18 = fila0.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        fila19.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        fila27.item = objArray31;
        fila25.item = objArray31;
        fila19.item = objArray31;
        fila19.tras = (short) 0;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.imprime();
        java.lang.Object[] objArray40 = fila37.item;
        fila19.item = objArray40;
        fila0.item = objArray40;
        fila0.tras = 10;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        fila0.frente = (byte) -1;
        fila0.frente = '4';
        java.lang.Object[] objArray15 = fila0.item;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        fila19.item = objArray23;
        fila16.item = objArray23;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.imprime();
        java.lang.Object[] objArray21 = fila18.item;
        fila0.item = objArray21;
        boolean boolean23 = fila0.vazia();
        fila0.frente = ' ';
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.frente = '#';
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.frente = '#';
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.imprime();
        java.lang.Object[] objArray11 = fila8.item;
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.imprime();
        java.lang.Object[] objArray21 = fila18.item;
        fila0.item = objArray21;
        fila0.imprime();
        int int24 = fila0.tras;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        fila27.item = objArray31;
        fila25.item = objArray31;
        fila0.item = objArray31;
        int int35 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        fila10.item = objArray14;
        int int16 = fila10.frente;
        java.lang.Object[] objArray17 = fila10.item;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        fila20.item = objArray24;
        fila18.item = objArray24;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        fila29.item = objArray33;
        fila27.item = objArray33;
        fila18.item = objArray33;
        fila10.item = objArray33;
        int int38 = fila10.frente;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.frente;
        fila39.tras = (short) 10;
        java.lang.Object[] objArray43 = fila39.item;
        int int44 = fila39.tras;
        java.lang.Object[] objArray45 = fila39.item;
        fila10.item = objArray45;
        fila0.item = objArray45;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        fila7.item = objArray11;
        fila4.item = objArray11;
        fila0.item = objArray11;
        fila0.frente = (-1);
        java.lang.Object[] objArray17 = null;
        fila0.item = objArray17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.frente = (byte) 1;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object[] objArray16 = fila0.item;
        boolean boolean17 = fila0.vazia();
        int int18 = fila0.frente;
        fila0.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        int int6 = fila0.frente;
        fila0.frente = (byte) 0;
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.tras = (short) 10;
        java.lang.Object[] objArray14 = fila10.item;
        int int15 = fila10.tras;
        java.lang.Object[] objArray16 = fila10.item;
        fila0.item = objArray16;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (short) 10;
        java.lang.Object[] objArray25 = fila21.item;
        int int26 = fila21.tras;
        java.lang.Object[] objArray27 = fila21.item;
        fila16.item = objArray27;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        boolean boolean12 = fila0.vazia();
        int int13 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        fila7.item = objArray11;
        fila4.item = objArray11;
        fila0.item = objArray11;
        java.lang.Class<?> wildcardClass15 = objArray11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        java.lang.Object[] objArray7 = fila5.item;
        fila0.enfileira((java.lang.Object) fila5);
        fila0.frente = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.tras = ' ';
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 35;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        boolean boolean8 = fila6.vazia();
        fila6.frente = '#';
        int int11 = fila6.frente;
        java.lang.Object[] objArray12 = fila6.item;
        fila0.item = objArray12;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        java.lang.Object[] objArray5 = fila3.item;
        fila0.item = objArray5;
        int int7 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int6 = fila0.frente;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.tras = 0;
        int int12 = fila8.tras;
        fila8.frente = (byte) 1;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.imprime();
        java.lang.Object[] objArray18 = fila15.item;
        fila8.item = objArray18;
        java.lang.Object[] objArray20 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila4.item = objArray8;
        fila2.item = objArray8;
        fila0.item = objArray8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        java.lang.Object[] objArray7 = fila4.item;
        fila4.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        fila12.item = objArray16;
        fila10.item = objArray16;
        fila4.enfileira((java.lang.Object) fila10);
        int int20 = fila10.frente;
        fila0.enfileira((java.lang.Object) int20);
        int int22 = fila0.tras;
        fila0.tras = 0;
        fila0.frente = (short) -1;
        java.lang.Object obj27 = null;
        fila0.enfileira(obj27);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        fila0.imprime();
        fila0.frente = 35;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        fila0.imprime();
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.tras = (short) 1;
        boolean boolean14 = fila0.vazia();
        int int15 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.frente;
        fila0.imprime();
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        int int6 = fila0.tras;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (byte) 1;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int6 = fila0.frente;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        int int10 = fila8.frente;
        int int11 = fila8.frente;
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        java.lang.Class<?> wildcardClass14 = objArray12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = (byte) 100;
        fila0.frente = ' ';
        int int14 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.frente = 10;
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        java.lang.Object[] objArray9 = fila5.item;
        fila5.enfileira((java.lang.Object) 1.0d);
        int int12 = fila5.tras;
        fila0.enfileira((java.lang.Object) int12);
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.tras = 0;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.imprime();
        java.lang.Object[] objArray22 = fila19.item;
        fila19.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        fila27.item = objArray31;
        fila25.item = objArray31;
        fila19.enfileira((java.lang.Object) fila25);
        int int35 = fila25.frente;
        fila15.enfileira((java.lang.Object) int35);
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.imprime();
        java.lang.Object[] objArray40 = fila37.item;
        fila37.enfileira((java.lang.Object) (byte) 0);
        int int43 = fila37.frente;
        fila37.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        int int47 = fila45.frente;
        int int48 = fila45.frente;
        java.lang.Object[] objArray49 = fila45.item;
        fila37.item = objArray49;
        fila15.item = objArray49;
        fila0.enfileira((java.lang.Object) fila15);
        fila0.frente = (-1);
        fila0.tras = (-1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.tras = (short) 1;
        fila0.frente = 10;
        fila0.tras = (short) 100;
        int int18 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        fila0.imprime();
        int int4 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        fila0.frente = (short) 100;
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        fila9.item = objArray13;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        fila17.item = objArray21;
        fila15.item = objArray21;
        fila9.item = objArray21;
        fila0.item = objArray21;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = (byte) 100;
        int int12 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.frente = (byte) 1;
        int int18 = fila0.frente;
        fila0.frente = (byte) 1;
        boolean boolean21 = fila0.vazia();
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.tras = 0;
        fila22.imprime();
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.frente;
        java.lang.Object[] objArray29 = fila27.item;
        fila22.enfileira((java.lang.Object) fila27);
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.tras = 0;
        fila31.imprime();
        fila27.enfileira((java.lang.Object) fila31);
        java.lang.Object[] objArray37 = fila27.item;
        int int38 = fila27.frente;
        fila0.enfileira((java.lang.Object) fila27);
        fila27.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 35;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        fila0.frente = (short) -1;
        int int7 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        fila0.frente = (short) 10;
        fila0.tras = 1;
        fila0.frente = 100;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        int int5 = fila0.tras;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.imprime();
        int int11 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.tras = (short) 1;
        fila0.tras = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.tras = 0;
        int int8 = fila4.tras;
        fila4.frente = (byte) 1;
        fila4.tras = '#';
        int int13 = fila4.frente;
        boolean boolean14 = fila4.vazia();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        fila17.item = objArray21;
        fila15.item = objArray21;
        int int24 = fila15.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila15.item = objArray26;
        fila4.item = objArray26;
        fila0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (byte) 1;
        int int7 = fila0.frente;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.imprime();
        java.lang.Object[] objArray10 = fila7.item;
        fila0.item = objArray10;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        int int11 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.imprime();
        java.lang.Object[] objArray9 = fila6.item;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila14.item = objArray18;
        fila12.item = objArray18;
        fila6.enfileira((java.lang.Object) fila12);
        fila12.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) fila12);
        boolean boolean25 = fila12.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        int int5 = fila0.tras;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.imprime();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        java.lang.Object[] objArray4 = fila2.item;
        fila2.frente = 10;
        fila2.tras = (byte) 1;
        int int9 = fila2.frente;
        fila0.enfileira((java.lang.Object) fila2);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        fila0.frente = (short) 10;
        fila0.tras = 1;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.frente = 35;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.tras = 0;
        boolean boolean8 = fila4.vazia();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { fila9 };
        fila4.item = objArray10;
        fila0.item = objArray10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.tras = (byte) -1;
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        fila18.item = objArray22;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        boolean boolean26 = fila24.vazia();
        fila24.frente = '#';
        int int29 = fila24.frente;
        java.lang.Object[] objArray30 = fila24.item;
        java.lang.Object[] objArray31 = fila24.item;
        fila18.item = objArray31;
        fila0.item = objArray31;
        java.lang.Object obj34 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        fila5.item = objArray9;
        int int11 = fila5.frente;
        java.lang.Object[] objArray12 = fila5.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.imprime();
        java.lang.Object[] objArray17 = fila14.item;
        fila14.tras = 35;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        boolean boolean22 = fila20.vazia();
        fila20.frente = '#';
        int int25 = fila20.frente;
        java.lang.Object[] objArray26 = fila20.item;
        fila14.item = objArray26;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.frente;
        fila28.tras = (short) 10;
        java.lang.Object[] objArray32 = fila28.item;
        int int33 = fila28.tras;
        java.lang.Object[] objArray34 = fila28.item;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.frente;
        fila35.tras = (short) 10;
        java.lang.Object[] objArray39 = fila35.item;
        int int40 = fila35.tras;
        java.lang.Object[] objArray41 = fila35.item;
        fila28.item = objArray41;
        fila14.enfileira((java.lang.Object) fila28);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        int int9 = fila0.frente;
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        fila5.tras = (byte) 100;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.tras = (short) 10;
        java.lang.Object[] objArray17 = fila13.item;
        fila5.item = objArray17;
        fila5.frente = 100;
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        java.lang.Object[] objArray23 = fila21.item;
        fila21.frente = 10;
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        int int28 = fila26.frente;
        int int29 = fila26.frente;
        java.lang.Object[] objArray30 = fila26.item;
        fila26.enfileira((java.lang.Object) 1.0d);
        int int33 = fila26.tras;
        fila21.enfileira((java.lang.Object) int33);
        int int35 = fila21.frente;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila36.tras = 0;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila40.imprime();
        java.lang.Object[] objArray43 = fila40.item;
        fila40.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila46 = new ds.Fila();
        java.lang.Object[] objArray47 = fila46.item;
        ds.Fila fila48 = new ds.Fila();
        fila48.imprime();
        fila48.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        fila48.item = objArray52;
        fila46.item = objArray52;
        fila40.enfileira((java.lang.Object) fila46);
        int int56 = fila46.frente;
        fila36.enfileira((java.lang.Object) int56);
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray59 = fila58.item;
        fila58.imprime();
        java.lang.Object[] objArray61 = fila58.item;
        fila58.enfileira((java.lang.Object) (byte) 0);
        int int64 = fila58.frente;
        fila58.imprime();
        ds.Fila fila66 = new ds.Fila();
        fila66.imprime();
        int int68 = fila66.frente;
        int int69 = fila66.frente;
        java.lang.Object[] objArray70 = fila66.item;
        fila58.item = objArray70;
        fila36.item = objArray70;
        fila21.enfileira((java.lang.Object) fila36);
        ds.Fila fila74 = new ds.Fila();
        fila74.imprime();
        int int76 = fila74.frente;
        int int77 = fila74.frente;
        java.lang.Object[] objArray78 = fila74.item;
        fila74.enfileira((java.lang.Object) 1.0d);
        boolean boolean81 = fila74.vazia();
        fila36.enfileira((java.lang.Object) boolean81);
        fila5.enfileira((java.lang.Object) fila36);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.tras = 0;
        int int8 = fila4.tras;
        fila4.frente = (byte) 1;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.imprime();
        java.lang.Object[] objArray14 = fila11.item;
        fila4.item = objArray14;
        java.lang.Object[] objArray16 = fila4.item;
        fila0.enfileira((java.lang.Object) objArray16);
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.frente = (byte) 1;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.enfileira((java.lang.Object) fila6);
        int int16 = fila6.frente;
        java.lang.Object[] objArray17 = fila6.item;
        java.lang.Object[] objArray18 = null;
        fila6.item = objArray18;
        boolean boolean20 = fila6.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        int int3 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        fila5.imprime();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        java.lang.Object[] objArray12 = fila10.item;
        fila5.enfileira((java.lang.Object) fila10);
        fila5.tras = (short) 100;
        int int16 = fila5.frente;
        fila0.enfileira((java.lang.Object) fila5);
        int int18 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = (short) -1;
        int int12 = fila0.frente;
        int int13 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        java.lang.Object[] objArray10 = fila0.item;
        fila0.frente = (short) 10;
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.tras = (short) 1;
        fila0.frente = 10;
        fila0.tras = (short) 100;
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        int int5 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        fila5.item = objArray9;
        int int11 = fila5.frente;
        java.lang.Object[] objArray12 = fila5.item;
        fila0.item = objArray12;
        fila0.frente = 100;
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 35;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        fila0.tras = '#';
        int int9 = fila0.frente;
        fila0.frente = 0;
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.imprime();
        java.lang.Object[] objArray10 = fila7.item;
        fila0.item = objArray10;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        int int15 = fila13.frente;
        int int16 = fila13.frente;
        java.lang.Object[] objArray17 = fila13.item;
        fila13.enfileira((java.lang.Object) 1.0d);
        int int20 = fila13.tras;
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        fila21.item = objArray25;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        fila29.item = objArray33;
        fila27.item = objArray33;
        fila21.item = objArray33;
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        fila37.item = objArray41;
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object[] objArray44 = fila43.item;
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        fila45.item = objArray49;
        fila43.item = objArray49;
        fila37.item = objArray49;
        fila21.item = objArray49;
        fila13.item = objArray49;
        fila0.item = objArray49;
        java.lang.Class<?> wildcardClass56 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        fila0.frente = (byte) -1;
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.imprime();
        java.lang.Object[] objArray17 = fila14.item;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.tras = 0;
        int int22 = fila18.tras;
        fila18.frente = (byte) 1;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.imprime();
        java.lang.Object[] objArray28 = fila25.item;
        fila18.item = objArray28;
        java.lang.Object[] objArray30 = fila18.item;
        fila14.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        boolean boolean33 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        fila0.frente = (short) -1;
        fila0.frente = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        fila7.item = objArray11;
        fila5.item = objArray11;
        int int14 = fila5.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila5.item = objArray16;
        fila5.tras = (-1);
        fila0.enfileira((java.lang.Object) fila5);
        int int21 = fila5.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        java.lang.Object[] objArray2 = fila0.item;
        int int3 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        fila12.item = objArray16;
        fila10.item = objArray16;
        int int19 = fila10.frente;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila10.item = objArray21;
        fila0.item = objArray21;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        fila0.tras = 100;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.imprime();
        int int9 = fila6.tras;
        int int10 = fila6.tras;
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        fila0.tras = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        boolean boolean9 = fila0.vazia();
        fila0.tras = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.frente = 10;
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        java.lang.Object[] objArray9 = fila5.item;
        fila5.enfileira((java.lang.Object) 1.0d);
        int int12 = fila5.tras;
        fila0.enfileira((java.lang.Object) int12);
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.tras = 0;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.imprime();
        java.lang.Object[] objArray22 = fila19.item;
        fila19.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        fila27.item = objArray31;
        fila25.item = objArray31;
        fila19.enfileira((java.lang.Object) fila25);
        int int35 = fila25.frente;
        fila15.enfileira((java.lang.Object) int35);
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.imprime();
        java.lang.Object[] objArray40 = fila37.item;
        fila37.enfileira((java.lang.Object) (byte) 0);
        int int43 = fila37.frente;
        fila37.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        int int47 = fila45.frente;
        int int48 = fila45.frente;
        java.lang.Object[] objArray49 = fila45.item;
        fila37.item = objArray49;
        fila15.item = objArray49;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila53 = new ds.Fila();
        fila53.imprime();
        int int55 = fila53.frente;
        int int56 = fila53.frente;
        java.lang.Object[] objArray57 = fila53.item;
        fila53.enfileira((java.lang.Object) 1.0d);
        boolean boolean60 = fila53.vazia();
        fila15.enfileira((java.lang.Object) boolean60);
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila62.tras = 0;
        boolean boolean66 = fila62.vazia();
        ds.Fila fila67 = new ds.Fila();
        java.lang.Object[] objArray68 = new java.lang.Object[] { fila67 };
        fila62.item = objArray68;
        int int70 = fila62.frente;
        fila62.imprime();
        fila62.imprime();
        int int73 = fila62.frente;
        fila15.enfileira((java.lang.Object) fila62);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        fila7.item = objArray11;
        fila4.item = objArray11;
        fila0.item = objArray11;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila0.item = objArray7;
        int int9 = fila0.frente;
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        fila13.item = objArray17;
        fila11.item = objArray17;
        fila11.tras = (short) -1;
        fila11.frente = (byte) -1;
        fila11.frente = '4';
        java.lang.Object[] objArray26 = fila11.item;
        fila0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.frente = 10;
        int int5 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 35;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.tras = 0;
        int int11 = fila7.tras;
        fila7.frente = (byte) 1;
        fila7.tras = '#';
        fila0.enfileira((java.lang.Object) '#');
        java.lang.Object obj17 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        fila0.frente = (short) -1;
        int int7 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.imprime();
        java.lang.Object[] objArray15 = fila12.item;
        fila12.enfileira((java.lang.Object) (byte) 0);
        int int18 = fila12.frente;
        fila12.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        java.lang.Object[] objArray24 = fila20.item;
        fila12.item = objArray24;
        fila0.item = objArray24;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        fila29.item = objArray33;
        fila27.item = objArray33;
        fila27.tras = (short) -1;
        fila27.frente = (byte) -1;
        fila27.frente = '4';
        java.lang.Object[] objArray42 = fila27.item;
        fila0.enfileira((java.lang.Object) fila27);
        int int44 = fila27.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        fila10.item = objArray14;
        fila8.item = objArray14;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        fila19.item = objArray23;
        fila17.item = objArray23;
        fila8.item = objArray23;
        fila0.item = objArray23;
        int int28 = fila0.frente;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.tras = (short) 10;
        java.lang.Object[] objArray33 = fila29.item;
        int int34 = fila29.tras;
        java.lang.Object[] objArray35 = fila29.item;
        fila0.item = objArray35;
        boolean boolean37 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.frente = 35;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.tras = 0;
        boolean boolean8 = fila4.vazia();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { fila9 };
        fila4.item = objArray10;
        fila0.item = objArray10;
        int int13 = fila0.frente;
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.tras = (short) 1;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (short) 10;
        java.lang.Object[] objArray10 = fila6.item;
        int int11 = fila6.tras;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila6.item = objArray13;
        fila0.item = objArray13;
        int int16 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.frente = '#';
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        int int8 = fila0.tras;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1 + "'", obj5, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        java.lang.Object[] objArray7 = fila5.item;
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.tras = 0;
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        int int15 = fila5.tras;
        fila5.imprime();
        fila5.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        int int12 = fila10.frente;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.item = objArray14;
        fila0.tras = (short) 0;
        fila0.tras = '4';
        boolean boolean20 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.tras = (byte) -1;
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        fila18.item = objArray22;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        boolean boolean26 = fila24.vazia();
        fila24.frente = '#';
        int int29 = fila24.frente;
        java.lang.Object[] objArray30 = fila24.item;
        java.lang.Object[] objArray31 = fila24.item;
        fila18.item = objArray31;
        fila0.item = objArray31;
        fila0.tras = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        int int12 = fila10.frente;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.item = objArray14;
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.enfileira((java.lang.Object) fila6);
        fila6.frente = (byte) 100;
        java.lang.Object[] objArray18 = fila6.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = (byte) 100;
        fila0.frente = ' ';
        int int14 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.frente = (byte) 1;
        int int18 = fila0.frente;
        fila0.frente = (byte) 1;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        fila0.frente = ' ';
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        fila0.frente = (byte) -1;
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.imprime();
        java.lang.Object[] objArray21 = fila18.item;
        fila0.item = objArray21;
        fila0.imprime();
        int int24 = fila0.tras;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        fila27.item = objArray31;
        fila25.item = objArray31;
        fila0.item = objArray31;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Object[] objArray13 = fila11.item;
        fila11.frente = 10;
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        int int18 = fila16.frente;
        int int19 = fila16.frente;
        java.lang.Object[] objArray20 = fila16.item;
        fila16.enfileira((java.lang.Object) 1.0d);
        int int23 = fila16.tras;
        fila11.enfileira((java.lang.Object) int23);
        fila0.enfileira((java.lang.Object) fila11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        int int5 = fila0.tras;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.imprime();
        fila0.tras = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.imprime();
        java.lang.Object[] objArray10 = fila7.item;
        fila0.item = objArray10;
        int int12 = fila0.frente;
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.enfileira((java.lang.Object) 1.0d);
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila16.item = objArray20;
        fila14.item = objArray20;
        fila8.item = objArray20;
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        fila24.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        fila32.item = objArray36;
        fila30.item = objArray36;
        fila24.item = objArray36;
        fila8.item = objArray36;
        fila0.item = objArray36;
        fila0.tras = (short) 100;
        java.lang.Object[] objArray44 = fila0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) 1;
        int int9 = fila0.frente;
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        int int5 = fila0.tras;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.imprime();
        fila0.frente = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        fila0.tras = (short) 1;
        fila0.frente = 10;
        java.lang.Object[] objArray16 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        fila0.frente = (short) 100;
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        fila9.item = objArray13;
        java.lang.Object[] objArray15 = fila9.item;
        fila9.frente = (short) 100;
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.tras;
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = (short) 100;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.imprime();
        java.lang.Object[] objArray10 = fila7.item;
        fila0.item = objArray10;
        int int12 = fila0.frente;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.tras = 0;
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { fila18 };
        fila13.item = objArray19;
        int int21 = fila13.frente;
        fila13.imprime();
        int int23 = fila13.frente;
        java.lang.Object[] objArray24 = fila13.item;
        fila0.item = objArray24;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        fila7.item = objArray11;
        fila4.item = objArray11;
        fila0.item = objArray11;
        fila0.frente = (-1);
        java.lang.Object[] objArray17 = null;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.imprime();
        java.lang.Object[] objArray22 = fila19.item;
        fila19.enfileira((java.lang.Object) (byte) 0);
        int int25 = fila19.frente;
        fila19.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        int int29 = fila27.frente;
        int int30 = fila27.frente;
        java.lang.Object[] objArray31 = fila27.item;
        fila19.item = objArray31;
        fila0.item = objArray31;
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila34.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        fila34.item = objArray38;
        int int40 = fila34.frente;
        java.lang.Object[] objArray41 = fila34.item;
        fila0.item = objArray41;
        int int43 = fila0.tras;
        java.lang.Object[] objArray44 = null;
        fila0.item = objArray44;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = (short) -1;
        int int12 = fila0.frente;
        java.lang.Object[] objArray13 = fila0.item;
        int int14 = fila0.frente;
        fila0.tras = (byte) 10;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.tras;
        fila0.tras = '#';
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        fila0.frente = (short) -1;
        int int7 = fila0.frente;
        fila0.frente = (short) 10;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.imprime();
        java.lang.Object[] objArray13 = fila10.item;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.item = objArray14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.frente = (byte) 1;
        int int18 = fila0.frente;
        fila0.frente = (byte) 1;
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.frente = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj21 = fila16.desenfileira();
        int int22 = fila16.frente;
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        int int25 = fila23.frente;
        int int26 = fila23.frente;
        boolean boolean27 = fila23.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        int int30 = fila28.frente;
        int int31 = fila28.frente;
        boolean boolean32 = fila28.vazia();
        fila23.enfileira((java.lang.Object) fila28);
        int int34 = fila23.tras;
        fila16.enfileira((java.lang.Object) int34);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        fila7.item = objArray11;
        fila4.item = objArray11;
        fila0.item = objArray11;
        fila0.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila0.item = objArray7;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        int int12 = fila10.frente;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        java.lang.Object[] objArray15 = fila10.item;
        fila0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        int int6 = fila0.frente;
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        fila0.tras = '#';
        int int9 = fila0.frente;
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.frente = 35;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.tras = 0;
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { fila20 };
        fila15.item = objArray21;
        fila11.item = objArray21;
        fila0.item = objArray21;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        fila0.tras = 0;
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        java.lang.Object[] objArray14 = fila12.item;
        fila12.frente = 10;
        fila12.tras = (byte) 1;
        java.lang.Object[] objArray19 = fila12.item;
        fila0.item = objArray19;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.frente = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.frente = (byte) 1;
        int int18 = fila0.frente;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.tras = 0;
        boolean boolean23 = fila19.vazia();
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila24 };
        fila19.item = objArray25;
        int int27 = fila19.frente;
        fila19.imprime();
        java.lang.Object[] objArray29 = fila19.item;
        fila19.frente = (short) 10;
        int int32 = fila19.tras;
        fila0.enfileira((java.lang.Object) int32);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.imprime();
        java.lang.Object[] objArray21 = fila18.item;
        fila0.item = objArray21;
        fila0.imprime();
        int int24 = fila0.tras;
        int int25 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray7 = fila0.item;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.imprime();
        java.lang.Object[] objArray21 = fila18.item;
        fila0.item = objArray21;
        fila0.imprime();
        int int24 = fila0.tras;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        fila27.item = objArray31;
        fila25.item = objArray31;
        fila0.item = objArray31;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila35.imprime();
        int int38 = fila35.frente;
        java.lang.Object[] objArray39 = fila35.item;
        int int40 = fila35.tras;
        fila35.tras = 'a';
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = (short) -1;
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.enfileira((java.lang.Object) 1);
        fila0.frente = (short) -1;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.imprime();
        java.lang.Object[] objArray11 = fila8.item;
        java.lang.Object[] objArray12 = fila8.item;
        fila8.imprime();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.tras = 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        fila21.item = objArray25;
        fila18.item = objArray25;
        fila14.item = objArray25;
        fila8.item = objArray25;
        fila0.item = objArray25;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        boolean boolean4 = fila2.vazia();
        fila2.frente = '#';
        int int7 = fila2.frente;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.enfileira((java.lang.Object) objArray8);
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.imprime();
        java.lang.Object[] objArray13 = fila10.item;
        fila10.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        fila18.item = objArray22;
        fila16.item = objArray22;
        fila10.enfileira((java.lang.Object) fila16);
        int int26 = fila16.frente;
        java.lang.Object[] objArray27 = fila16.item;
        fila0.item = objArray27;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        fila2.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        int int10 = fila0.tras;
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object[] objArray13 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        fila9.item = objArray13;
        fila6.item = objArray13;
        fila6.tras = 0;
        fila6.tras = (short) 1;
        boolean boolean20 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        boolean boolean24 = fila22.vazia();
        boolean boolean25 = fila22.vazia();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        fila28.item = objArray32;
        fila26.item = objArray32;
        fila26.tras = (short) -1;
        fila22.enfileira((java.lang.Object) (short) -1);
        fila22.frente = (byte) 1;
        int int40 = fila22.frente;
        fila0.enfileira((java.lang.Object) fila22);
        java.lang.Object[] objArray42 = fila22.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.imprime();
        java.lang.Object[] objArray9 = fila6.item;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila14.item = objArray18;
        fila12.item = objArray18;
        fila6.enfileira((java.lang.Object) fila12);
        fila12.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.tras = 0;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.imprime();
        java.lang.Object[] objArray32 = fila29.item;
        fila29.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        fila37.item = objArray41;
        fila35.item = objArray41;
        fila29.enfileira((java.lang.Object) fila35);
        int int45 = fila35.frente;
        fila25.enfileira((java.lang.Object) int45);
        ds.Fila fila47 = new ds.Fila();
        java.lang.Object[] objArray48 = fila47.item;
        fila47.imprime();
        java.lang.Object[] objArray50 = fila47.item;
        fila47.enfileira((java.lang.Object) (byte) 0);
        int int53 = fila47.frente;
        fila47.imprime();
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        int int57 = fila55.frente;
        int int58 = fila55.frente;
        java.lang.Object[] objArray59 = fila55.item;
        fila47.item = objArray59;
        fila25.item = objArray59;
        fila12.item = objArray59;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        fila0.tras = '#';
        int int9 = fila0.frente;
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        java.lang.Object[] objArray7 = fila4.item;
        fila4.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        fila12.item = objArray16;
        fila10.item = objArray16;
        fila4.enfileira((java.lang.Object) fila10);
        int int20 = fila10.frente;
        fila0.enfileira((java.lang.Object) int20);
        int int22 = fila0.tras;
        fila0.tras = 0;
        fila0.frente = (short) -1;
        fila0.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        fila3.item = objArray7;
        fila0.item = objArray7;
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        fila0.frente = 10;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray16 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.imprime();
        java.lang.Object[] objArray15 = fila12.item;
        fila12.enfileira((java.lang.Object) (byte) 0);
        int int18 = fila12.frente;
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        fila21.item = objArray25;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        fila29.item = objArray33;
        fila27.item = objArray33;
        fila21.item = objArray33;
        fila21.tras = (short) 0;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.imprime();
        java.lang.Object[] objArray42 = fila39.item;
        fila21.item = objArray42;
        fila21.imprime();
        int int45 = fila21.tras;
        ds.Fila fila46 = new ds.Fila();
        java.lang.Object[] objArray47 = fila46.item;
        ds.Fila fila48 = new ds.Fila();
        fila48.imprime();
        fila48.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        fila48.item = objArray52;
        fila46.item = objArray52;
        fila21.item = objArray52;
        fila12.item = objArray52;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        fila0.tras = 100;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.imprime();
        int int9 = fila6.tras;
        int int10 = fila6.tras;
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        int int13 = fila0.frente;
        fila0.frente = (short) -1;
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        int int18 = fila16.frente;
        int int19 = fila16.frente;
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        int int23 = fila21.frente;
        int int24 = fila21.frente;
        boolean boolean25 = fila21.vazia();
        fila16.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray27 = fila16.item;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila28.imprime();
        java.lang.Object[] objArray31 = fila28.item;
        fila28.enfileira((java.lang.Object) (byte) 0);
        int int34 = fila28.frente;
        fila28.imprime();
        fila16.enfileira((java.lang.Object) fila28);
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        int int5 = fila0.tras;
        fila0.tras = (byte) 0;
        fila0.frente = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { fila5 };
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.imprime();
        java.lang.Object[] objArray10 = fila0.item;
        fila0.frente = (short) 10;
        int int13 = fila0.tras;
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila14.item = objArray18;
        int int20 = fila14.frente;
        java.lang.Object[] objArray21 = fila14.item;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        fila24.item = objArray28;
        fila22.item = objArray28;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila33.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        fila33.item = objArray37;
        fila31.item = objArray37;
        fila22.item = objArray37;
        fila14.item = objArray37;
        fila0.item = objArray37;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 35;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        int int8 = fila0.tras;
        int int9 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        int int11 = fila0.tras;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.tras = 0;
        fila12.imprime();
        int int17 = fila12.tras;
        fila12.tras = (byte) 0;
        java.lang.Object[] objArray20 = fila12.item;
        java.lang.Object[] objArray21 = fila12.item;
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        int int13 = fila4.frente;
        int int14 = fila4.tras;
        fila4.imprime();
        int int16 = fila4.frente;
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        int int20 = fila0.tras;
        fila0.frente = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.frente = (byte) 1;
        int int18 = fila0.frente;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        fila21.item = objArray25;
        fila19.item = objArray25;
        fila19.tras = (short) -1;
        boolean boolean30 = fila19.vazia();
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass32 = fila19.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.enfileira((java.lang.Object) 1.0d);
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila16.item = objArray20;
        fila14.item = objArray20;
        fila8.item = objArray20;
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        fila24.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        fila32.item = objArray36;
        fila30.item = objArray36;
        fila24.item = objArray36;
        fila8.item = objArray36;
        fila0.item = objArray36;
        fila0.frente = (-1);
        int int44 = fila0.frente;
        java.lang.Class<?> wildcardClass45 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        fila5.tras = (byte) 100;
        int int13 = fila5.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila4.item = objArray10;
        fila4.tras = (short) -1;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.frente = (byte) 1;
        int int18 = fila0.frente;
        fila0.frente = (byte) 1;
        boolean boolean21 = fila0.vazia();
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.tras = 0;
        fila22.imprime();
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.frente;
        java.lang.Object[] objArray29 = fila27.item;
        fila22.enfileira((java.lang.Object) fila27);
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.tras = 0;
        fila31.imprime();
        fila27.enfileira((java.lang.Object) fila31);
        java.lang.Object[] objArray37 = fila27.item;
        int int38 = fila27.frente;
        fila0.enfileira((java.lang.Object) fila27);
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        int int42 = fila40.frente;
        int int43 = fila40.tras;
        fila40.imprime();
        boolean boolean45 = fila40.vazia();
        fila0.enfileira((java.lang.Object) fila40);
        fila40.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.tras;
        int int10 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.tras = 0;
        int int11 = fila7.tras;
        fila7.frente = (byte) 1;
        int int14 = fila7.tras;
        int int15 = fila7.frente;
        java.lang.Class<?> wildcardClass16 = fila7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        java.lang.Object[] objArray7 = fila4.item;
        fila4.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        fila12.item = objArray16;
        fila10.item = objArray16;
        fila4.enfileira((java.lang.Object) fila10);
        int int20 = fila10.frente;
        fila0.enfileira((java.lang.Object) int20);
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.imprime();
        java.lang.Object[] objArray25 = fila22.item;
        fila22.enfileira((java.lang.Object) (byte) 0);
        int int28 = fila22.frente;
        fila22.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        int int32 = fila30.frente;
        int int33 = fila30.frente;
        java.lang.Object[] objArray34 = fila30.item;
        fila22.item = objArray34;
        fila0.item = objArray34;
        boolean boolean37 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        fila8.item = objArray12;
        fila6.item = objArray12;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        fila17.item = objArray21;
        fila15.item = objArray21;
        fila6.item = objArray21;
        fila0.item = objArray21;
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray30 = new java.lang.Object[] {};
        fila26.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila34.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        fila34.item = objArray38;
        fila32.item = objArray38;
        fila26.item = objArray38;
        ds.Fila fila42 = new ds.Fila();
        fila42.imprime();
        fila42.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray46 = new java.lang.Object[] {};
        fila42.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        fila50.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        fila50.item = objArray54;
        fila48.item = objArray54;
        fila42.item = objArray54;
        fila26.item = objArray54;
        boolean boolean59 = fila26.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) boolean59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        fila7.item = objArray11;
        fila4.item = objArray11;
        fila0.item = objArray11;
        fila0.frente = (-1);
        java.lang.Object[] objArray17 = null;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.imprime();
        java.lang.Object[] objArray22 = fila19.item;
        fila19.enfileira((java.lang.Object) (byte) 0);
        int int25 = fila19.frente;
        fila19.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        int int29 = fila27.frente;
        int int30 = fila27.frente;
        java.lang.Object[] objArray31 = fila27.item;
        fila19.item = objArray31;
        fila0.item = objArray31;
        fila0.tras = 32;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila36.imprime();
        int int39 = fila36.tras;
        int int40 = fila36.tras;
        int int41 = fila36.tras;
        ds.Fila fila42 = new ds.Fila();
        int int43 = fila42.frente;
        fila42.tras = (short) 10;
        java.lang.Object[] objArray46 = fila42.item;
        int int47 = fila42.tras;
        fila36.enfileira((java.lang.Object) fila42);
        fila0.enfileira((java.lang.Object) fila42);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
    }
}

