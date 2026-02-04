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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.enfileira((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        java.lang.Class<?> wildcardClass10 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1L) + "'", obj3, (-1L));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        java.lang.Object obj14 = fila0.desenfileira();
        int int15 = fila0.frente;
        int int16 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        java.lang.Object obj3 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100 + "'", obj3, 100);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (-1L));
        fila9.imprime();
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila0.item = objArray14;
        fila0.frente = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (-1L));
        int int7 = fila4.tras;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        fila8.item = objArray18;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.enfileira((java.lang.Object) 10.0f);
        int int26 = fila22.tras;
        int int27 = fila22.tras;
        fila22.tras = (byte) 100;
        java.lang.Class<?> wildcardClass30 = fila22.getClass();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila31.item = objArray42;
        int int44 = fila31.tras;
        int int45 = fila31.tras;
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (-1L));
        fila47.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila47.item = objArray55;
        int int57 = fila47.frente;
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1), wildcardClass30, fila31, (byte) 0, int57 };
        fila8.item = objArray58;
        fila4.item = objArray58;
        fila0.item = objArray58;
        java.lang.Class<?> wildcardClass62 = objArray58.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        boolean boolean10 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        fila0.frente = (byte) 10;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 2;
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        int int4 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) 10.0f);
        int int18 = fila14.tras;
        int int19 = fila14.tras;
        fila14.tras = (byte) 100;
        java.lang.Class<?> wildcardClass22 = fila14.getClass();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        fila23.imprime();
        java.lang.Object[] objArray31 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila23.item = objArray31;
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila23.item = objArray34;
        int int36 = fila23.tras;
        int int37 = fila23.tras;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        int int49 = fila39.frente;
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-1), wildcardClass22, fila23, (byte) 0, int49 };
        fila0.item = objArray50;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        int int11 = fila0.frente;
        fila0.frente = (byte) 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0f + "'", obj7, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.enfileira((java.lang.Object) 10.0f);
        int int10 = fila6.tras;
        int int11 = fila6.tras;
        java.lang.Object[] objArray12 = fila6.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (-1L));
        int int7 = fila4.tras;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        fila8.item = objArray18;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.enfileira((java.lang.Object) 10.0f);
        int int26 = fila22.tras;
        int int27 = fila22.tras;
        fila22.tras = (byte) 100;
        java.lang.Class<?> wildcardClass30 = fila22.getClass();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila31.item = objArray42;
        int int44 = fila31.tras;
        int int45 = fila31.tras;
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (-1L));
        fila47.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila47.item = objArray55;
        int int57 = fila47.frente;
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1), wildcardClass30, fila31, (byte) 0, int57 };
        fila8.item = objArray58;
        fila4.item = objArray58;
        fila0.item = objArray58;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (byte) 1;
        fila0.tras = (byte) 100;
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.enfileira((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean12 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        java.lang.Class<?> wildcardClass13 = objArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1));
        int int8 = fila0.tras;
        int int9 = fila0.frente;
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1L) + "'", obj5, (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object[] objArray9 = fila0.item;
        fila0.frente = (short) 100;
        fila0.frente = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        fila0.tras = 'a';
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.tras = (short) 0;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        fila0.tras = 'a';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        java.lang.Object obj17 = fila0.desenfileira();
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        int int17 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj13 = fila9.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        int int24 = fila14.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila14.enfileira((java.lang.Object) objArray26);
        fila14.enfileira((java.lang.Object) '#');
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        int int33 = fila30.tras;
        java.lang.Object[] objArray34 = fila30.item;
        fila14.item = objArray34;
        fila9.enfileira((java.lang.Object) objArray34);
        fila3.enfileira((java.lang.Object) objArray34);
        java.lang.Class<?> wildcardClass38 = fila3.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        java.lang.Object[] objArray15 = fila13.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100);
        fila16.frente = (short) 0;
        fila13.enfileira((java.lang.Object) fila16);
        java.lang.Object[] objArray22 = fila13.item;
        fila0.item = objArray22;
        java.lang.Object obj24 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        int int24 = fila14.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila14.enfileira((java.lang.Object) objArray26);
        fila14.enfileira((java.lang.Object) '#');
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        int int33 = fila30.tras;
        java.lang.Object[] objArray34 = fila30.item;
        fila14.item = objArray34;
        fila14.tras = 0;
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (-1L));
        int int41 = fila38.tras;
        java.lang.Class<?> wildcardClass42 = fila38.getClass();
        fila14.enfileira((java.lang.Object) fila38);
        fila0.enfileira((java.lang.Object) fila38);
        java.lang.Object obj45 = fila38.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1L) + "'", obj45, (-1L));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        fila9.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1L) + "'", obj5, (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        fila3.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        fila11.item = objArray21;
        java.lang.Object[] objArray24 = fila11.item;
        fila3.enfileira((java.lang.Object) objArray24);
        fila3.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.tras = 2;
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        int int30 = fila20.frente;
        fila15.enfileira((java.lang.Object) fila20);
        java.lang.Class<?> wildcardClass32 = fila15.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj6 = fila2.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        fila7.enfileira((java.lang.Object) '#');
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        int int26 = fila23.tras;
        java.lang.Object[] objArray27 = fila23.item;
        fila7.item = objArray27;
        fila2.enfileira((java.lang.Object) objArray27);
        fila0.item = objArray27;
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila31.item = objArray42;
        int int44 = fila31.tras;
        int int45 = fila31.tras;
        java.lang.Class<?> wildcardClass46 = fila31.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass46);
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) (-1L));
        fila48.imprime();
        java.lang.Object[] objArray56 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila48.item = objArray56;
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray59 = fila58.item;
        fila48.item = objArray59;
        int int61 = fila48.tras;
        int int62 = fila48.frente;
        int int63 = fila48.frente;
        java.lang.Object obj64 = fila48.desenfileira();
        ds.Fila fila65 = new ds.Fila();
        fila65.enfileira((java.lang.Object) (-1L));
        fila65.imprime();
        java.lang.Object[] objArray73 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila65.item = objArray73;
        fila48.enfileira((java.lang.Object) objArray73);
        fila0.item = objArray73;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        fila5.item = objArray15;
        boolean boolean18 = fila5.vazia();
        fila5.frente = (byte) -1;
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object[] objArray22 = fila5.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila5.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (-1L));
        int int7 = fila4.tras;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        fila8.item = objArray18;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.enfileira((java.lang.Object) 10.0f);
        int int26 = fila22.tras;
        int int27 = fila22.tras;
        fila22.tras = (byte) 100;
        java.lang.Class<?> wildcardClass30 = fila22.getClass();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila31.item = objArray42;
        int int44 = fila31.tras;
        int int45 = fila31.tras;
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (-1L));
        fila47.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila47.item = objArray55;
        int int57 = fila47.frente;
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1), wildcardClass30, fila31, (byte) 0, int57 };
        fila8.item = objArray58;
        fila4.item = objArray58;
        fila0.item = objArray58;
        java.lang.Class<?> wildcardClass62 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        int int16 = fila0.frente;
        java.lang.Object[] objArray17 = fila0.item;
        fila0.frente = '#';
        java.lang.Object[] objArray20 = null;
        fila0.item = objArray20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = ' ';
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        fila0.tras = 32;
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila25.item = objArray33;
        int int35 = fila25.frente;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila25.enfileira((java.lang.Object) objArray37);
        fila25.enfileira((java.lang.Object) '#');
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (-1L));
        int int44 = fila41.tras;
        java.lang.Object[] objArray45 = fila41.item;
        fila25.item = objArray45;
        fila20.enfileira((java.lang.Object) objArray45);
        fila18.item = objArray45;
        int int49 = fila18.tras;
        fila0.enfileira((java.lang.Object) int49);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0f + "'", obj24, 10.0f);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (byte) 1;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.enfileira((java.lang.Object) 10.0f);
        int int7 = fila3.tras;
        int int8 = fila3.tras;
        fila3.tras = (byte) 100;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100);
        java.lang.Object obj14 = fila11.desenfileira();
        fila3.enfileira((java.lang.Object) fila11);
        fila3.tras = ' ';
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100 + "'", obj14, 100);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        int int14 = fila9.tras;
        fila9.tras = (byte) 100;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        java.lang.Object obj20 = fila17.desenfileira();
        fila9.enfileira((java.lang.Object) fila17);
        fila9.tras = ' ';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.tras = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        fila3.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        fila11.item = objArray21;
        java.lang.Object[] objArray24 = fila11.item;
        fila3.enfileira((java.lang.Object) objArray24);
        java.lang.Class<?> wildcardClass26 = fila3.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) 10.0f);
        int int15 = fila11.tras;
        int int16 = fila11.tras;
        fila11.tras = (byte) 100;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100);
        java.lang.Object obj22 = fila19.desenfileira();
        fila11.enfileira((java.lang.Object) fila19);
        fila11.tras = ' ';
        int int26 = fila11.tras;
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        fila27.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila27.item = objArray35;
        int int37 = fila27.frente;
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray39 = fila38.item;
        fila27.enfileira((java.lang.Object) objArray39);
        fila27.enfileira((java.lang.Object) '#');
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (-1L));
        int int46 = fila43.tras;
        java.lang.Object[] objArray47 = fila43.item;
        fila27.item = objArray47;
        java.lang.Object[] objArray49 = fila27.item;
        fila11.enfileira((java.lang.Object) objArray49);
        fila0.item = objArray49;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100 + "'", obj22, 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        java.lang.Object[] objArray13 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        int int4 = fila0.tras;
        fila0.tras = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        int int27 = fila24.tras;
        java.lang.Class<?> wildcardClass28 = fila24.getClass();
        fila0.enfileira((java.lang.Object) fila24);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        fila30.imprime();
        java.lang.Object[] objArray38 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila30.item = objArray38;
        int int40 = fila30.frente;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila30.enfileira((java.lang.Object) objArray42);
        fila30.enfileira((java.lang.Object) '#');
        int int46 = fila30.frente;
        java.lang.Object[] objArray47 = fila30.item;
        fila0.item = objArray47;
        int int49 = fila0.tras;
        java.lang.Class<?> wildcardClass50 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        int int30 = fila20.frente;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila20.enfileira((java.lang.Object) objArray32);
        fila20.enfileira((java.lang.Object) '#');
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (-1L));
        int int39 = fila36.tras;
        java.lang.Object[] objArray40 = fila36.item;
        fila20.item = objArray40;
        java.lang.Object[] objArray42 = fila20.item;
        fila15.item = objArray42;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        int int14 = fila9.tras;
        fila9.tras = (byte) 100;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        java.lang.Object obj20 = fila17.desenfileira();
        fila9.enfileira((java.lang.Object) fila17);
        fila9.tras = ' ';
        fila0.enfileira((java.lang.Object) fila9);
        int int25 = fila9.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        fila5.item = objArray15;
        boolean boolean18 = fila5.vazia();
        fila5.frente = (byte) -1;
        fila0.enfileira((java.lang.Object) fila5);
        fila0.tras = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        fila0.frente = 101;
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        boolean boolean17 = fila0.vazia();
        int int18 = fila0.frente;
        int int19 = fila0.tras;
        boolean boolean20 = fila0.vazia();
        fila0.enfileira((java.lang.Object) true);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        fila7.enfileira((java.lang.Object) '#');
        int int23 = fila7.frente;
        java.lang.Object[] objArray24 = fila7.item;
        fila0.enfileira((java.lang.Object) objArray24);
        boolean boolean26 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (-1L));
        fila9.imprime();
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila0.item = objArray14;
        fila0.frente = (short) 1;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        java.lang.Object[] objArray20 = fila18.item;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        fila21.frente = (short) 0;
        fila18.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        fila18.enfileira((java.lang.Object) (-1L));
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila33.enfileira((java.lang.Object) 10.0f);
        int int37 = fila33.tras;
        int int38 = fila33.tras;
        java.lang.Object[] objArray39 = fila33.item;
        fila31.item = objArray39;
        fila18.item = objArray39;
        fila0.item = objArray39;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        java.lang.Object obj17 = fila0.desenfileira();
        int int18 = fila0.frente;
        java.lang.Object[] objArray19 = fila0.item;
        int int20 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray11 = fila8.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        int int23 = fila13.frente;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila13.enfileira((java.lang.Object) objArray25);
        fila13.tras = (short) 1;
        fila13.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila13);
        int int32 = fila13.frente;
        java.lang.Class<?> wildcardClass33 = fila13.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, 100.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, 100.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.tras = 10;
        fila0.frente = 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        fila0.enfileira((java.lang.Object) objArray47);
        java.lang.Class<?> wildcardClass50 = objArray47.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        fila0.frente = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        fila3.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        fila11.item = objArray21;
        java.lang.Object[] objArray24 = fila11.item;
        fila3.enfileira((java.lang.Object) objArray24);
        int int26 = fila3.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.tras = (short) -1;
        int int11 = fila7.frente;
        java.lang.Object obj12 = fila7.desenfileira();
        fila0.enfileira((java.lang.Object) fila7);
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        int int20 = fila15.tras;
        fila0.enfileira((java.lang.Object) int20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = ' ';
        fila0.tras = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100);
        java.lang.Object obj35 = fila32.desenfileira();
        fila24.enfileira((java.lang.Object) fila32);
        fila24.tras = ' ';
        int int39 = fila24.tras;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila24.item = objArray60;
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        fila63.imprime();
        java.lang.Object[] objArray71 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila63.item = objArray71;
        fila24.enfileira((java.lang.Object) objArray71);
        fila0.enfileira((java.lang.Object) objArray71);
        int int75 = fila0.frente;
        java.lang.Object[] objArray76 = fila0.item;
        java.lang.Object[] objArray77 = fila0.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100 + "'", obj35, 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        fila0.frente = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        boolean boolean15 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Object[] objArray14 = fila0.item;
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        int int15 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        fila0.frente = '#';
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj6 = fila2.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        fila7.enfileira((java.lang.Object) '#');
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        int int26 = fila23.tras;
        java.lang.Object[] objArray27 = fila23.item;
        fila7.item = objArray27;
        fila2.enfileira((java.lang.Object) objArray27);
        fila0.item = objArray27;
        int int31 = fila0.frente;
        boolean boolean32 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        int int14 = fila9.tras;
        fila9.tras = (byte) 100;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        java.lang.Object obj20 = fila17.desenfileira();
        fila9.enfileira((java.lang.Object) fila17);
        fila9.tras = ' ';
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj25 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0f + "'", obj25, 10.0f);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (-1L));
        fila9.imprime();
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila0.item = objArray14;
        fila0.frente = (byte) 10;
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = (-1);
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        java.lang.Object[] objArray9 = fila7.item;
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100);
        fila10.frente = (short) 0;
        fila7.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        java.lang.Object[] objArray21 = fila16.item;
        fila7.item = objArray21;
        fila0.enfileira((java.lang.Object) objArray21);
        java.lang.Class<?> wildcardClass24 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        fila3.frente = 0;
        boolean boolean18 = fila3.vazia();
        java.lang.Class<?> wildcardClass19 = fila3.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100);
        java.lang.Object obj35 = fila32.desenfileira();
        fila24.enfileira((java.lang.Object) fila32);
        fila24.tras = ' ';
        int int39 = fila24.tras;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila24.item = objArray60;
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        fila63.imprime();
        java.lang.Object[] objArray71 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila63.item = objArray71;
        fila24.enfileira((java.lang.Object) objArray71);
        fila0.enfileira((java.lang.Object) objArray71);
        ds.Fila fila75 = new ds.Fila();
        java.lang.Object[] objArray76 = fila75.item;
        fila75.enfileira((java.lang.Object) 10.0f);
        int int79 = fila75.tras;
        int int80 = fila75.tras;
        java.lang.Object[] objArray81 = fila75.item;
        fila0.item = objArray81;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100 + "'", obj35, 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.enfileira((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        fila12.item = objArray22;
        boolean boolean25 = fila12.vazia();
        java.lang.Class<?> wildcardClass26 = fila12.getClass();
        fila6.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        fila0.frente = 100;
        fila0.tras = (-1);
        int int20 = fila0.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) 10.0f);
        int int25 = fila21.tras;
        int int26 = fila21.tras;
        java.lang.Object[] objArray27 = fila21.item;
        fila21.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (-1L));
        int int7 = fila4.tras;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        fila8.item = objArray18;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.enfileira((java.lang.Object) 10.0f);
        int int26 = fila22.tras;
        int int27 = fila22.tras;
        fila22.tras = (byte) 100;
        java.lang.Class<?> wildcardClass30 = fila22.getClass();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila31.item = objArray42;
        int int44 = fila31.tras;
        int int45 = fila31.tras;
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (-1L));
        fila47.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila47.item = objArray55;
        int int57 = fila47.frente;
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1), wildcardClass30, fila31, (byte) 0, int57 };
        fila8.item = objArray58;
        fila4.item = objArray58;
        fila0.item = objArray58;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        java.lang.Object[] objArray26 = fila24.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100);
        fila27.frente = (short) 0;
        fila24.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila33.enfileira((java.lang.Object) 10.0f);
        int int37 = fila33.tras;
        fila33.frente = (-1);
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        java.lang.Object[] objArray42 = fila40.item;
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100);
        fila43.frente = (short) 0;
        fila40.enfileira((java.lang.Object) fila43);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (-1L));
        fila49.imprime();
        boolean boolean53 = fila49.vazia();
        java.lang.Object[] objArray54 = fila49.item;
        fila40.item = objArray54;
        fila33.enfileira((java.lang.Object) objArray54);
        fila24.item = objArray54;
        fila0.item = objArray54;
        java.lang.Class<?> wildcardClass59 = objArray54.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (-1L));
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = null;
        fila11.enfileira(obj16);
        int int18 = fila11.frente;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray22 = fila19.item;
        fila11.item = objArray22;
        int int24 = fila11.tras;
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        java.lang.Object obj30 = null;
        fila25.enfileira(obj30);
        int int32 = fila25.frente;
        boolean boolean33 = fila25.vazia();
        java.lang.Object[] objArray34 = fila25.item;
        fila11.item = objArray34;
        fila0.item = objArray34;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        java.lang.Object[] objArray15 = fila13.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100);
        fila16.frente = (short) 0;
        fila13.enfileira((java.lang.Object) fila16);
        java.lang.Object[] objArray22 = fila13.item;
        fila0.item = objArray22;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.tras = 2;
        java.lang.Object obj20 = fila15.desenfileira();
        int int21 = fila15.frente;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object obj13 = fila0.desenfileira();
        int int14 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        int int14 = fila9.tras;
        fila9.tras = (byte) 100;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        java.lang.Object obj20 = fila17.desenfileira();
        fila9.enfileira((java.lang.Object) fila17);
        fila9.tras = ' ';
        fila0.enfileira((java.lang.Object) fila9);
        int int25 = fila9.tras;
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.enfileira((java.lang.Object) 10.0f);
        int int30 = fila26.tras;
        int int31 = fila26.tras;
        java.lang.Object[] objArray32 = fila26.item;
        fila9.item = objArray32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.frente = 100;
        int int16 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        boolean boolean16 = fila0.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila17.item = objArray28;
        int int30 = fila17.tras;
        int int31 = fila17.frente;
        int int32 = fila17.frente;
        fila0.enfileira((java.lang.Object) int32);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj13 = fila9.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        int int24 = fila14.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila14.enfileira((java.lang.Object) objArray26);
        fila14.enfileira((java.lang.Object) '#');
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        int int33 = fila30.tras;
        java.lang.Object[] objArray34 = fila30.item;
        fila14.item = objArray34;
        fila9.enfileira((java.lang.Object) objArray34);
        fila3.enfileira((java.lang.Object) objArray34);
        fila3.frente = 'a';
        fila3.frente = (short) -1;
        java.lang.Object[] objArray42 = fila3.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        fila9.frente = (-1);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        java.lang.Object[] objArray18 = fila16.item;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100);
        fila19.frente = (short) 0;
        fila16.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila16.item = objArray30;
        fila9.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        int int34 = fila0.tras;
        boolean boolean35 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) 10.0f);
        int int9 = fila5.tras;
        int int10 = fila5.tras;
        fila5.tras = (byte) 100;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100);
        java.lang.Object obj16 = fila13.desenfileira();
        fila5.enfileira((java.lang.Object) fila13);
        fila5.tras = ' ';
        int int20 = fila5.tras;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.tras = (short) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila5.item = objArray25;
        fila0.item = objArray25;
        java.lang.Object[] objArray28 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.imprime();
        fila0.frente = (byte) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray11 = fila8.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        boolean boolean18 = fila14.vazia();
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        int int21 = fila14.frente;
        boolean boolean22 = fila14.vazia();
        java.lang.Object[] objArray23 = fila14.item;
        fila0.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila25.item = objArray33;
        fila25.tras = 0;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        java.lang.Object[] objArray39 = fila37.item;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila37.item = objArray60;
        fila25.item = objArray60;
        fila0.item = objArray60;
        int int65 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int5 = fila0.tras;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila7.item = objArray18;
        fila0.item = objArray18;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) 10.0f);
        int int25 = fila21.tras;
        int int26 = fila21.tras;
        fila21.tras = (byte) 100;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100);
        java.lang.Object obj32 = fila29.desenfileira();
        fila21.enfileira((java.lang.Object) fila29);
        fila21.tras = ' ';
        int int36 = fila21.tras;
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        fila37.imprime();
        java.lang.Object[] objArray45 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila37.item = objArray45;
        int int47 = fila37.frente;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        fila37.enfileira((java.lang.Object) objArray49);
        fila37.enfileira((java.lang.Object) '#');
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (-1L));
        int int56 = fila53.tras;
        java.lang.Object[] objArray57 = fila53.item;
        fila37.item = objArray57;
        fila21.item = objArray57;
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) (-1L));
        fila60.imprime();
        java.lang.Object[] objArray68 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila60.item = objArray68;
        fila21.enfileira((java.lang.Object) objArray68);
        fila0.item = objArray68;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100 + "'", obj32, 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.frente = (byte) -1;
        fila0.frente = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.tras = 2;
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        int int30 = fila20.frente;
        fila15.enfileira((java.lang.Object) fila20);
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.enfileira((java.lang.Object) 10.0f);
        int int36 = fila32.tras;
        int int37 = fila32.tras;
        java.lang.Object[] objArray38 = fila32.item;
        fila20.item = objArray38;
        int int40 = fila20.tras;
        java.lang.Class<?> wildcardClass41 = fila20.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object obj13 = fila0.desenfileira();
        int int14 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.tras;
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        java.lang.Object[] objArray38 = fila16.item;
        fila0.enfileira((java.lang.Object) objArray38);
        java.lang.Object[] objArray40 = null;
        fila0.item = objArray40;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray11 = fila8.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        boolean boolean18 = fila14.vazia();
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        int int21 = fila14.frente;
        boolean boolean22 = fila14.vazia();
        java.lang.Object[] objArray23 = fila14.item;
        fila0.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila25.item = objArray33;
        fila25.tras = 0;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        java.lang.Object[] objArray39 = fila37.item;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila37.item = objArray60;
        fila25.item = objArray60;
        fila0.item = objArray60;
        fila0.frente = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.tras = (short) 0;
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (-1L));
        int int15 = fila12.tras;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (-1L));
        fila18.imprime();
        java.lang.Object[] objArray26 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila18.item = objArray26;
        fila16.item = objArray26;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.enfileira((java.lang.Object) 10.0f);
        int int34 = fila30.tras;
        int int35 = fila30.tras;
        fila30.tras = (byte) 100;
        java.lang.Class<?> wildcardClass38 = fila30.getClass();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray50 = fila49.item;
        fila39.item = objArray50;
        int int52 = fila39.tras;
        int int53 = fila39.tras;
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (-1L));
        fila55.imprime();
        java.lang.Object[] objArray63 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila55.item = objArray63;
        int int65 = fila55.frente;
        java.lang.Object[] objArray66 = new java.lang.Object[] { (-1), wildcardClass38, fila39, (byte) 0, int65 };
        fila16.item = objArray66;
        fila12.item = objArray66;
        fila8.item = objArray66;
        fila0.item = objArray66;
        java.lang.Class<?> wildcardClass71 = objArray66.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (-1L));
        fila9.imprime();
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila0.item = objArray14;
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        int int20 = fila13.tras;
        fila13.frente = (byte) 0;
        boolean boolean23 = fila13.vazia();
        int int24 = fila13.frente;
        fila13.imprime();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        java.lang.Object[] objArray28 = fila26.item;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100);
        fila29.frente = (short) 0;
        fila26.enfileira((java.lang.Object) fila29);
        java.lang.Object[] objArray35 = fila26.item;
        fila13.item = objArray35;
        fila0.enfileira((java.lang.Object) objArray35);
        java.lang.Class<?> wildcardClass38 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) 10.0f);
        int int9 = fila5.tras;
        int int10 = fila5.tras;
        fila5.tras = (byte) 100;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100);
        java.lang.Object obj16 = fila13.desenfileira();
        fila5.enfileira((java.lang.Object) fila13);
        fila5.tras = ' ';
        int int20 = fila5.tras;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila21.item = objArray29;
        int int31 = fila21.frente;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila21.enfileira((java.lang.Object) objArray33);
        fila21.enfileira((java.lang.Object) '#');
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        int int40 = fila37.tras;
        java.lang.Object[] objArray41 = fila37.item;
        fila21.item = objArray41;
        fila5.item = objArray41;
        ds.Fila fila44 = new ds.Fila();
        java.lang.Object[] objArray45 = fila44.item;
        java.lang.Object[] objArray46 = fila44.item;
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 100);
        fila47.frente = (short) 0;
        fila44.enfileira((java.lang.Object) fila47);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (-1L));
        fila53.imprime();
        boolean boolean57 = fila53.vazia();
        java.lang.Object[] objArray58 = fila53.item;
        fila44.item = objArray58;
        fila5.enfileira((java.lang.Object) objArray58);
        fila0.item = objArray58;
        int int62 = fila0.tras;
        fila0.tras = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj18 = fila15.desenfileira();
        java.lang.Object[] objArray19 = fila15.item;
        fila9.item = objArray19;
        java.lang.Class<?> wildcardClass21 = fila9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        fila0.enfileira((java.lang.Object) objArray47);
        boolean boolean50 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        fila0.enfileira((java.lang.Object) objArray25);
        int int28 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        int int11 = fila0.frente;
        java.lang.Object obj12 = fila0.desenfileira();
        int int13 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        int int27 = fila24.tras;
        java.lang.Class<?> wildcardClass28 = fila24.getClass();
        fila0.enfileira((java.lang.Object) fila24);
        int int30 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) 10.0f);
        int int9 = fila5.tras;
        int int10 = fila5.tras;
        fila5.tras = (byte) 100;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100);
        java.lang.Object obj16 = fila13.desenfileira();
        fila5.enfileira((java.lang.Object) fila13);
        fila5.tras = ' ';
        int int20 = fila5.tras;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.tras = (short) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila5.item = objArray25;
        fila0.item = objArray25;
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        int int14 = fila9.tras;
        fila9.tras = (byte) 100;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        java.lang.Object obj20 = fila17.desenfileira();
        fila9.enfileira((java.lang.Object) fila17);
        fila9.tras = ' ';
        int int24 = fila9.tras;
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila25.item = objArray33;
        int int35 = fila25.frente;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila25.enfileira((java.lang.Object) objArray37);
        fila25.enfileira((java.lang.Object) '#');
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (-1L));
        int int44 = fila41.tras;
        java.lang.Object[] objArray45 = fila41.item;
        fila25.item = objArray45;
        fila9.item = objArray45;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        java.lang.Object[] objArray50 = fila48.item;
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100);
        fila51.frente = (short) 0;
        fila48.enfileira((java.lang.Object) fila51);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) (-1L));
        fila57.imprime();
        boolean boolean61 = fila57.vazia();
        java.lang.Object[] objArray62 = fila57.item;
        fila48.item = objArray62;
        fila9.enfileira((java.lang.Object) objArray62);
        fila0.enfileira((java.lang.Object) objArray62);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        java.lang.Object obj24 = fila21.desenfileira();
        fila13.enfileira((java.lang.Object) fila21);
        fila13.tras = ' ';
        int int28 = fila13.tras;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        int int39 = fila29.frente;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila29.enfileira((java.lang.Object) objArray41);
        fila29.enfileira((java.lang.Object) '#');
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Object[] objArray49 = fila45.item;
        fila29.item = objArray49;
        fila13.item = objArray49;
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (-1L));
        fila52.imprime();
        java.lang.Object[] objArray60 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila52.item = objArray60;
        fila13.enfileira((java.lang.Object) objArray60);
        fila8.enfileira((java.lang.Object) fila13);
        fila13.tras = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100 + "'", obj24, 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        fila0.enfileira((java.lang.Object) objArray25);
        java.lang.Object[] objArray28 = fila0.item;
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass8);
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.tras;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        java.lang.Object[] objArray15 = fila13.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100);
        fila16.frente = (short) 0;
        fila13.enfileira((java.lang.Object) fila16);
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.enfileira((java.lang.Object) 10.0f);
        int int26 = fila22.tras;
        fila22.frente = (-1);
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        java.lang.Object[] objArray31 = fila29.item;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100);
        fila32.frente = (short) 0;
        fila29.enfileira((java.lang.Object) fila32);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (-1L));
        fila38.imprime();
        boolean boolean42 = fila38.vazia();
        java.lang.Object[] objArray43 = fila38.item;
        fila29.item = objArray43;
        fila22.enfileira((java.lang.Object) objArray43);
        fila13.item = objArray43;
        fila0.item = objArray43;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        fila24.imprime();
        boolean boolean28 = fila24.vazia();
        boolean boolean29 = fila24.vazia();
        boolean boolean30 = fila24.vazia();
        java.lang.Object[] objArray31 = fila24.item;
        fila0.item = objArray31;
        java.lang.Class<?> wildcardClass33 = objArray31.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 2;
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) 10.0f);
        int int9 = fila5.tras;
        int int10 = fila5.tras;
        fila5.tras = (byte) 100;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100);
        java.lang.Object obj16 = fila13.desenfileira();
        fila5.enfileira((java.lang.Object) fila13);
        fila5.tras = ' ';
        int int20 = fila5.tras;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.tras = (short) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila5.item = objArray25;
        fila0.item = objArray25;
        java.lang.Class<?> wildcardClass28 = objArray25.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        int int24 = fila14.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila14.enfileira((java.lang.Object) objArray26);
        fila14.enfileira((java.lang.Object) '#');
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        int int33 = fila30.tras;
        java.lang.Object[] objArray34 = fila30.item;
        fila14.item = objArray34;
        fila14.tras = 0;
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (-1L));
        int int41 = fila38.tras;
        java.lang.Class<?> wildcardClass42 = fila38.getClass();
        fila14.enfileira((java.lang.Object) fila38);
        fila0.enfileira((java.lang.Object) fila38);
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.tras;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.tras = (short) -1;
        int int11 = fila7.frente;
        java.lang.Object obj12 = fila7.desenfileira();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.tras = 2;
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj6 = fila2.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        fila7.enfileira((java.lang.Object) '#');
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        int int26 = fila23.tras;
        java.lang.Object[] objArray27 = fila23.item;
        fila7.item = objArray27;
        fila2.enfileira((java.lang.Object) objArray27);
        fila0.item = objArray27;
        int int31 = fila0.tras;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        fila32.imprime();
        boolean boolean36 = fila32.vazia();
        java.lang.Object[] objArray37 = fila32.item;
        int int38 = fila32.tras;
        fila0.enfileira((java.lang.Object) int38);
        boolean boolean40 = fila0.vazia();
        int int41 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        java.lang.Object obj16 = fila3.desenfileira();
        int int17 = fila3.frente;
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (-1L));
        int int21 = fila18.tras;
        java.lang.Object[] objArray22 = fila18.item;
        fila3.enfileira((java.lang.Object) objArray22);
        java.lang.Class<?> wildcardClass24 = objArray22.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.tras = 2;
        java.lang.Object obj20 = fila15.desenfileira();
        fila15.frente = 0;
        java.lang.Class<?> wildcardClass23 = fila15.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100);
        java.lang.Object obj35 = fila32.desenfileira();
        fila24.enfileira((java.lang.Object) fila32);
        fila24.tras = ' ';
        int int39 = fila24.tras;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila24.item = objArray60;
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        fila63.imprime();
        java.lang.Object[] objArray71 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila63.item = objArray71;
        fila24.enfileira((java.lang.Object) objArray71);
        fila0.enfileira((java.lang.Object) objArray71);
        java.lang.Class<?> wildcardClass75 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100 + "'", obj35, 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        fila0.frente = 35;
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) 10.0f);
        int int9 = fila5.tras;
        int int10 = fila5.tras;
        fila5.tras = (byte) 100;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100);
        java.lang.Object obj16 = fila13.desenfileira();
        fila5.enfileira((java.lang.Object) fila13);
        fila5.tras = ' ';
        int int20 = fila5.tras;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.tras = (short) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila5.item = objArray25;
        fila0.item = objArray25;
        java.lang.Object obj28 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        fila5.item = objArray15;
        boolean boolean18 = fila5.vazia();
        fila5.frente = (byte) -1;
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object[] objArray22 = fila5.item;
        int int23 = fila5.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila5.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        java.lang.Object[] objArray39 = fila0.item;
        boolean boolean40 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        java.lang.Object obj14 = fila0.desenfileira();
        int int15 = fila0.frente;
        fila0.frente = 35;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        int int27 = fila24.tras;
        java.lang.Class<?> wildcardClass28 = fila24.getClass();
        fila0.enfileira((java.lang.Object) fila24);
        int int30 = fila0.frente;
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        fila15.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        java.lang.Object obj39 = fila29.desenfileira();
        java.lang.Object[] objArray40 = fila29.item;
        fila0.item = objArray40;
        int int42 = fila0.frente;
        int int43 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '#' + "'", obj39, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        int int10 = fila0.tras;
        int int11 = fila0.tras;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        fila12.item = objArray22;
        boolean boolean25 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        fila27.item = objArray37;
        fila12.item = objArray37;
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (-1L));
        fila41.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila41.item = objArray49;
        java.lang.Object obj51 = fila41.desenfileira();
        java.lang.Object[] objArray52 = fila41.item;
        fila12.item = objArray52;
        fila0.item = objArray52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + '#' + "'", obj51, '#');
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        fila0.frente = (byte) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        java.lang.Object[] objArray14 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100);
        fila15.frente = (short) 0;
        fila12.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj25 = fila21.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (-1L));
        fila26.imprime();
        java.lang.Object[] objArray34 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila26.item = objArray34;
        int int36 = fila26.frente;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila26.enfileira((java.lang.Object) objArray38);
        fila26.enfileira((java.lang.Object) '#');
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) (-1L));
        int int45 = fila42.tras;
        java.lang.Object[] objArray46 = fila42.item;
        fila26.item = objArray46;
        fila21.enfileira((java.lang.Object) objArray46);
        fila15.enfileira((java.lang.Object) objArray46);
        fila0.enfileira((java.lang.Object) objArray46);
        java.lang.Object[] objArray51 = fila0.item;
        java.lang.Class<?> wildcardClass52 = objArray51.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0f + "'", obj25, 10.0f);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        fila7.imprime();
        int int12 = fila7.frente;
        java.lang.Object[] objArray13 = fila7.item;
        boolean boolean14 = fila7.vazia();
        java.lang.Object[] objArray15 = fila7.item;
        fila0.item = objArray15;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (-1L));
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass15 = fila6.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        boolean boolean18 = fila14.vazia();
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        int int21 = fila14.frente;
        boolean boolean22 = fila14.vazia();
        int int23 = fila14.frente;
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj25 = fila14.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.tras = (short) 0;
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        int int26 = fila23.tras;
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        fila27.item = objArray37;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila41.enfileira((java.lang.Object) 10.0f);
        int int45 = fila41.tras;
        int int46 = fila41.tras;
        fila41.tras = (byte) 100;
        java.lang.Class<?> wildcardClass49 = fila41.getClass();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) (-1L));
        fila50.imprime();
        java.lang.Object[] objArray58 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila50.item = objArray58;
        ds.Fila fila60 = new ds.Fila();
        java.lang.Object[] objArray61 = fila60.item;
        fila50.item = objArray61;
        int int63 = fila50.tras;
        int int64 = fila50.tras;
        ds.Fila fila66 = new ds.Fila();
        fila66.enfileira((java.lang.Object) (-1L));
        fila66.imprime();
        java.lang.Object[] objArray74 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila66.item = objArray74;
        int int76 = fila66.frente;
        java.lang.Object[] objArray77 = new java.lang.Object[] { (-1), wildcardClass49, fila50, (byte) 0, int76 };
        fila27.item = objArray77;
        fila23.item = objArray77;
        fila19.item = objArray77;
        java.lang.Object[] objArray81 = fila19.item;
        fila15.item = objArray81;
        java.lang.Class<?> wildcardClass83 = objArray81.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        fila3.frente = 0;
        int int18 = fila3.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        java.lang.Object[] objArray16 = fila14.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        fila17.frente = (short) 0;
        fila14.enfileira((java.lang.Object) fila17);
        int int23 = fila17.tras;
        boolean boolean24 = fila17.vazia();
        int int25 = fila17.frente;
        boolean boolean26 = fila17.vazia();
        fila17.imprime();
        fila17.tras = '#';
        java.lang.Object obj30 = fila17.desenfileira();
        int int31 = fila17.frente;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila17.enfileira((java.lang.Object) objArray36);
        fila0.item = objArray36;
        java.lang.Class<?> wildcardClass39 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100 + "'", obj30, 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        fila0.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila0.frente = 1;
        int int20 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        int int8 = fila0.tras;
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.tras = (short) 0;
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        int int26 = fila23.tras;
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        fila27.item = objArray37;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila41.enfileira((java.lang.Object) 10.0f);
        int int45 = fila41.tras;
        int int46 = fila41.tras;
        fila41.tras = (byte) 100;
        java.lang.Class<?> wildcardClass49 = fila41.getClass();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) (-1L));
        fila50.imprime();
        java.lang.Object[] objArray58 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila50.item = objArray58;
        ds.Fila fila60 = new ds.Fila();
        java.lang.Object[] objArray61 = fila60.item;
        fila50.item = objArray61;
        int int63 = fila50.tras;
        int int64 = fila50.tras;
        ds.Fila fila66 = new ds.Fila();
        fila66.enfileira((java.lang.Object) (-1L));
        fila66.imprime();
        java.lang.Object[] objArray74 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila66.item = objArray74;
        int int76 = fila66.frente;
        java.lang.Object[] objArray77 = new java.lang.Object[] { (-1), wildcardClass49, fila50, (byte) 0, int76 };
        fila27.item = objArray77;
        fila23.item = objArray77;
        fila19.item = objArray77;
        java.lang.Object[] objArray81 = fila19.item;
        fila15.item = objArray81;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        fila0.frente = 100;
        fila0.tras = (-1);
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = (short) 100;
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        java.lang.Object obj17 = fila0.desenfileira();
        int int18 = fila0.tras;
        fila0.tras = (short) 1;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        java.lang.Object[] objArray10 = fila8.item;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100);
        fila11.frente = (short) 0;
        fila8.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        fila17.imprime();
        fila8.enfileira((java.lang.Object) fila17);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (-1L));
        fila22.imprime();
        java.lang.Object[] objArray30 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila22.item = objArray30;
        int int32 = fila22.frente;
        java.lang.Object[] objArray33 = fila22.item;
        java.lang.Object[] objArray34 = fila22.item;
        java.lang.Object obj35 = fila22.desenfileira();
        boolean boolean36 = fila22.vazia();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        fila37.item = objArray47;
        boolean boolean50 = fila37.vazia();
        fila37.imprime();
        int int52 = fila37.tras;
        java.lang.Object[] objArray53 = fila37.item;
        fila22.item = objArray53;
        fila17.item = objArray53;
        fila0.item = objArray53;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        fila0.frente = 32;
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.tras = '#';
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        fila0.enfileira((java.lang.Object) objArray47);
        fila0.frente = 0;
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (-1L));
        fila52.imprime();
        java.lang.Object[] objArray60 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila52.item = objArray60;
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila52.item = objArray63;
        java.lang.Object[] objArray65 = fila52.item;
        java.lang.Object[] objArray66 = fila52.item;
        java.lang.Object[] objArray67 = fila52.item;
        fila0.item = objArray67;
        java.lang.Object obj69 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        fila0.frente = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        fila7.enfileira((java.lang.Object) '#');
        int int23 = fila7.frente;
        java.lang.Object[] objArray24 = fila7.item;
        fila0.enfileira((java.lang.Object) objArray24);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.tras;
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        java.lang.Object[] objArray22 = fila0.item;
        boolean boolean23 = fila0.vazia();
        int int24 = fila0.tras;
        boolean boolean25 = fila0.vazia();
        java.lang.Object obj26 = null;
        fila0.enfileira(obj26);
        int int28 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        fila0.frente = (byte) -1;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila15.item = objArray23;
        int int25 = fila15.frente;
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila15.enfileira((java.lang.Object) objArray27);
        fila15.enfileira((java.lang.Object) '#');
        int int31 = fila15.frente;
        java.lang.Object[] objArray32 = fila15.item;
        fila0.item = objArray32;
        int int34 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.tras = (short) 0;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        boolean boolean22 = fila0.vazia();
        int int23 = fila0.tras;
        int int24 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        java.lang.Object obj14 = fila0.desenfileira();
        int int15 = fila0.frente;
        fila0.tras = (byte) 100;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) 10.0f);
        int int22 = fila18.tras;
        int int23 = fila18.tras;
        fila18.tras = (byte) 100;
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100);
        java.lang.Object obj29 = fila26.desenfileira();
        fila18.enfileira((java.lang.Object) fila26);
        fila18.tras = ' ';
        int int33 = fila18.tras;
        int int34 = fila18.frente;
        java.lang.Object obj35 = fila18.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100 + "'", obj29, 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10.0f + "'", obj35, 10.0f);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (-1L));
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        int int12 = fila5.tras;
        int int13 = fila5.frente;
        fila0.enfileira((java.lang.Object) fila5);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.tras = (short) 1;
        fila0.tras = (short) 10;
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) 10.0f);
        int int12 = fila8.tras;
        int int13 = fila8.tras;
        fila8.tras = (byte) 100;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        int int18 = fila16.frente;
        fila8.enfileira((java.lang.Object) int18);
        int int20 = fila8.tras;
        ds.Fila fila21 = new ds.Fila();
        fila21.frente = 2;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj28 = fila24.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        fila29.item = objArray39;
        boolean boolean42 = fila29.vazia();
        fila29.frente = (byte) -1;
        fila24.enfileira((java.lang.Object) fila29);
        java.lang.Object[] objArray46 = fila29.item;
        fila21.item = objArray46;
        fila8.item = objArray46;
        fila0.item = objArray46;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 10.0f + "'", obj28, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        java.lang.Object[] objArray14 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100);
        fila15.frente = (short) 0;
        fila12.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        fila21.imprime();
        fila12.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj30 = fila27.desenfileira();
        java.lang.Object[] objArray31 = fila27.item;
        fila21.item = objArray31;
        fila0.item = objArray31;
        java.lang.Object[] objArray34 = fila0.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        fila9.frente = (-1);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        java.lang.Object[] objArray18 = fila16.item;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100);
        fila19.frente = (short) 0;
        fila16.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila16.item = objArray30;
        fila9.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        fila34.enfileira((java.lang.Object) 10.0f);
        int int38 = fila34.tras;
        fila34.frente = 0;
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        fila34.enfileira((java.lang.Object) wildcardClass42);
        boolean boolean44 = fila34.vazia();
        fila0.enfileira((java.lang.Object) boolean44);
        java.lang.Object obj46 = fila0.desenfileira();
        fila0.tras = '#';
        java.lang.Object[] objArray49 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1L) + "'", obj46, (-1L));
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        java.lang.Object[] objArray16 = fila14.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        fila17.frente = (short) 0;
        fila14.enfileira((java.lang.Object) fila17);
        int int23 = fila17.tras;
        fila17.imprime();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        fila27.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila27.item = objArray35;
        fila25.item = objArray35;
        java.lang.Object[] objArray38 = fila25.item;
        fila17.enfileira((java.lang.Object) objArray38);
        fila0.item = objArray38;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.tras = (short) 0;
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (-1L));
        int int9 = fila6.tras;
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (-1L));
        fila12.imprime();
        java.lang.Object[] objArray20 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila12.item = objArray20;
        fila10.item = objArray20;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        java.lang.Class<?> wildcardClass32 = fila24.getClass();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (-1L));
        fila33.imprime();
        java.lang.Object[] objArray41 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila33.item = objArray41;
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object[] objArray44 = fila43.item;
        fila33.item = objArray44;
        int int46 = fila33.tras;
        int int47 = fila33.tras;
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (-1L));
        fila49.imprime();
        java.lang.Object[] objArray57 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila49.item = objArray57;
        int int59 = fila49.frente;
        java.lang.Object[] objArray60 = new java.lang.Object[] { (-1), wildcardClass32, fila33, (byte) 0, int59 };
        fila10.item = objArray60;
        fila6.item = objArray60;
        fila2.item = objArray60;
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Class<?> wildcardClass65 = fila2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        fila3.frente = (byte) -1;
        fila3.tras = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        java.lang.Class<?> wildcardClass39 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.imprime();
        int int15 = fila0.frente;
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        int int27 = fila24.tras;
        java.lang.Class<?> wildcardClass28 = fila24.getClass();
        fila0.enfileira((java.lang.Object) fila24);
        java.lang.Object obj30 = fila24.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.frente = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.imprime();
        int int7 = fila0.frente;
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object[] objArray18 = fila0.item;
        int int19 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        int int13 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        int int16 = fila0.frente;
        fila0.frente = 1;
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) 10.0f);
        int int21 = fila17.tras;
        int int22 = fila17.tras;
        java.lang.Object[] objArray23 = fila17.item;
        fila15.item = objArray23;
        fila0.enfileira((java.lang.Object) fila15);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.tras = (short) 1;
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, 100.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, 100.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        java.lang.Object[] objArray21 = fila19.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        fila22.frente = (short) 0;
        fila19.enfileira((java.lang.Object) fila22);
        fila15.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass29 = fila22.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass8);
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.frente;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        int int23 = fila21.frente;
        fila13.enfileira((java.lang.Object) int23);
        int int25 = fila13.tras;
        ds.Fila fila26 = new ds.Fila();
        fila26.frente = 2;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj33 = fila29.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (-1L));
        fila36.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila36.item = objArray44;
        fila34.item = objArray44;
        boolean boolean47 = fila34.vazia();
        fila34.frente = (byte) -1;
        fila29.enfileira((java.lang.Object) fila34);
        java.lang.Object[] objArray51 = fila34.item;
        fila26.item = objArray51;
        fila13.item = objArray51;
        fila0.item = objArray51;
        java.lang.Object obj55 = fila0.desenfileira();
        java.lang.Object[] objArray56 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10.0f + "'", obj33, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (-1.0f) + "'", obj55, (-1.0f));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object[] objArray18 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        java.lang.Object[] objArray20 = fila18.item;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        fila21.frente = (short) 0;
        fila18.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100);
        fila27.imprime();
        fila18.enfileira((java.lang.Object) fila27);
        fila27.imprime();
        fila15.enfileira((java.lang.Object) fila27);
        fila27.frente = 0;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray11 = fila8.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        int int14 = fila0.tras;
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj8 = fila4.desenfileira();
        fila0.enfileira(obj8);
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        java.lang.Object obj24 = fila21.desenfileira();
        fila13.enfileira((java.lang.Object) fila21);
        fila13.tras = ' ';
        int int28 = fila13.tras;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        int int39 = fila29.frente;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila29.enfileira((java.lang.Object) objArray41);
        fila29.enfileira((java.lang.Object) '#');
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Object[] objArray49 = fila45.item;
        fila29.item = objArray49;
        fila13.item = objArray49;
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (-1L));
        fila52.imprime();
        java.lang.Object[] objArray60 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila52.item = objArray60;
        fila13.enfileira((java.lang.Object) objArray60);
        fila3.item = objArray60;
        int int64 = fila3.frente;
        ds.Fila fila65 = new ds.Fila();
        java.lang.Object[] objArray66 = fila65.item;
        fila65.enfileira((java.lang.Object) 10.0f);
        int int69 = fila65.tras;
        int int70 = fila65.tras;
        fila65.tras = (byte) 100;
        int int73 = fila65.frente;
        fila65.tras = (byte) 0;
        fila65.enfileira((java.lang.Object) 10.0f);
        fila3.enfileira((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100 + "'", obj24, 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[#, 10.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[#, 10.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass8);
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.frente;
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class java.lang.Object");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila21.item = objArray29;
        int int31 = fila21.frente;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila21.enfileira((java.lang.Object) objArray33);
        fila21.enfileira((java.lang.Object) '#');
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        int int40 = fila37.tras;
        java.lang.Object[] objArray41 = fila37.item;
        fila21.item = objArray41;
        fila21.tras = 0;
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Class<?> wildcardClass49 = fila45.getClass();
        fila21.enfileira((java.lang.Object) fila45);
        fila7.enfileira((java.lang.Object) fila45);
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila53 = new ds.Fila();
        java.lang.Object[] objArray54 = fila53.item;
        fila53.enfileira((java.lang.Object) 10.0f);
        int int57 = fila53.tras;
        java.lang.Class<?> wildcardClass58 = fila53.getClass();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (-1L));
        fila59.imprime();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        ds.Fila fila66 = new ds.Fila();
        java.lang.Object[] objArray67 = fila66.item;
        fila66.enfileira((java.lang.Object) 10.0f);
        int int70 = fila66.tras;
        int int71 = fila66.tras;
        fila66.tras = (byte) 100;
        ds.Fila fila74 = new ds.Fila();
        fila74.enfileira((java.lang.Object) 100);
        java.lang.Object obj77 = fila74.desenfileira();
        fila66.enfileira((java.lang.Object) fila74);
        fila66.tras = ' ';
        int int81 = fila66.tras;
        ds.Fila fila82 = new ds.Fila();
        java.lang.Object[] objArray83 = fila82.item;
        fila82.tras = (short) 0;
        java.lang.Object[] objArray86 = fila82.item;
        fila66.item = objArray86;
        java.lang.Class<?> wildcardClass88 = objArray86.getClass();
        ds.Fila fila89 = new ds.Fila();
        fila89.enfileira((java.lang.Object) (-1L));
        fila89.imprime();
        fila89.imprime();
        int int94 = fila89.frente;
        fila89.imprime();
        java.lang.Object[] objArray96 = new java.lang.Object[] { fila53, fila59, objArray86, fila89 };
        fila7.item = objArray86;
        java.lang.Object[] objArray98 = fila7.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (-1L) + "'", obj65, (-1L));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 100 + "'", obj77, 100);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 32 + "'", int81 == 32);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertNotNull(objArray98);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.imprime();
        int int7 = fila0.frente;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.tras = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.imprime();
        fila0.tras = 0;
        fila0.enfileira((java.lang.Object) "");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        java.lang.Object[] objArray11 = fila0.item;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) (-1L));
        fila3.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila3.item = objArray11;
        fila3.tras = 0;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        java.lang.Object[] objArray17 = fila15.item;
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (-1L));
        fila18.imprime();
        java.lang.Object[] objArray26 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila18.item = objArray26;
        int int28 = fila18.frente;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila18.enfileira((java.lang.Object) objArray30);
        fila18.enfileira((java.lang.Object) '#');
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (-1L));
        int int37 = fila34.tras;
        java.lang.Object[] objArray38 = fila34.item;
        fila18.item = objArray38;
        fila15.item = objArray38;
        fila3.item = objArray38;
        fila0.item = objArray38;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        int int16 = fila0.frente;
        java.lang.Object[] objArray17 = fila0.item;
        fila0.frente = '#';
        java.lang.Object[] objArray20 = null;
        fila0.item = objArray20;
        fila0.frente = (short) 1;
        boolean boolean24 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        java.lang.Object obj17 = fila0.desenfileira();
        int int18 = fila0.tras;
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean9 = fila3.vazia();
        int int10 = fila3.tras;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (-1L));
        fila11.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila11.item = objArray19;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila11.item = objArray22;
        fila3.item = objArray22;
        int int25 = fila3.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila21.item = objArray29;
        int int31 = fila21.frente;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila21.enfileira((java.lang.Object) objArray33);
        fila21.enfileira((java.lang.Object) '#');
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        int int40 = fila37.tras;
        java.lang.Object[] objArray41 = fila37.item;
        fila21.item = objArray41;
        fila21.tras = 0;
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Class<?> wildcardClass49 = fila45.getClass();
        fila21.enfileira((java.lang.Object) fila45);
        fila7.enfileira((java.lang.Object) fila45);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.tras = 2;
        int int55 = fila0.frente;
        boolean boolean56 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.tras;
        fila0.frente = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        fila0.frente = (short) 0;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        fila0.frente = 0;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.tras;
        fila0.tras = 'a';
        fila0.tras = (short) 0;
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        int int27 = fila24.tras;
        java.lang.Class<?> wildcardClass28 = fila24.getClass();
        fila0.enfileira((java.lang.Object) fila24);
        fila24.tras = 33;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100);
        java.lang.Object obj35 = fila32.desenfileira();
        fila24.enfileira((java.lang.Object) fila32);
        fila24.tras = ' ';
        int int39 = fila24.tras;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila24.item = objArray60;
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        fila63.imprime();
        java.lang.Object[] objArray71 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila63.item = objArray71;
        fila24.enfileira((java.lang.Object) objArray71);
        fila0.enfileira((java.lang.Object) objArray71);
        java.lang.Object obj75 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100 + "'", obj35, 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + (-1L) + "'", obj75, (-1L));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        fila15.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        java.lang.Object obj39 = fila29.desenfileira();
        java.lang.Object[] objArray40 = fila29.item;
        fila0.item = objArray40;
        fila0.tras = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '#' + "'", obj39, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        fila3.frente = (byte) -1;
        int int14 = fila3.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        fila5.item = objArray15;
        boolean boolean18 = fila5.vazia();
        fila5.frente = (byte) -1;
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean22 = fila0.vazia();
        java.lang.Object obj23 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        java.lang.Object obj14 = fila0.desenfileira();
        int int15 = fila0.frente;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        boolean boolean21 = fila16.vazia();
        java.lang.Object obj22 = fila16.desenfileira();
        int int23 = fila16.tras;
        fila16.frente = (byte) 0;
        boolean boolean26 = fila16.vazia();
        int int27 = fila16.frente;
        fila16.imprime();
        fila16.frente = (byte) -1;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.enfileira((java.lang.Object) 10.0f);
        int int35 = fila31.tras;
        int int36 = fila31.tras;
        fila31.tras = (byte) 100;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 100);
        java.lang.Object obj42 = fila39.desenfileira();
        fila31.enfileira((java.lang.Object) fila39);
        fila31.tras = ' ';
        int int46 = fila31.tras;
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (-1L));
        fila47.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila47.item = objArray55;
        int int57 = fila47.frente;
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray59 = fila58.item;
        fila47.enfileira((java.lang.Object) objArray59);
        fila47.enfileira((java.lang.Object) '#');
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        int int66 = fila63.tras;
        java.lang.Object[] objArray67 = fila63.item;
        fila47.item = objArray67;
        java.lang.Object[] objArray69 = fila47.item;
        fila31.enfileira((java.lang.Object) objArray69);
        fila16.item = objArray69;
        fila0.item = objArray69;
        ds.Fila fila73 = new ds.Fila();
        java.lang.Object[] objArray74 = fila73.item;
        fila73.tras = (short) 0;
        java.lang.Object[] objArray77 = fila73.item;
        ds.Fila fila78 = new ds.Fila();
        fila78.enfileira((java.lang.Object) (-1L));
        fila78.imprime();
        java.lang.Object[] objArray86 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila78.item = objArray86;
        ds.Fila fila88 = new ds.Fila();
        java.lang.Object[] objArray89 = fila88.item;
        fila78.item = objArray89;
        java.lang.Object[] objArray91 = fila78.item;
        java.lang.Object[] objArray92 = fila78.item;
        java.lang.Object[] objArray93 = fila78.item;
        fila73.item = objArray93;
        fila73.frente = (short) -1;
        fila0.enfileira((java.lang.Object) fila73);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1L) + "'", obj22, (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100 + "'", obj42, 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertNotNull(objArray93);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        fila0.frente = 10;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.tras = (short) 1;
        java.lang.Object[] objArray16 = fila0.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.tras = 33;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (-1L));
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = null;
        fila11.enfileira(obj16);
        int int18 = fila11.frente;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray22 = fila19.item;
        fila11.item = objArray22;
        int int24 = fila11.tras;
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        java.lang.Object obj30 = null;
        fila25.enfileira(obj30);
        int int32 = fila25.frente;
        boolean boolean33 = fila25.vazia();
        java.lang.Object[] objArray34 = fila25.item;
        fila11.item = objArray34;
        fila0.enfileira((java.lang.Object) objArray34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        java.lang.Object[] objArray21 = fila19.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        fila22.frente = (short) 0;
        fila19.enfileira((java.lang.Object) fila22);
        fila15.enfileira((java.lang.Object) fila22);
        int int29 = fila15.tras;
        java.lang.Class<?> wildcardClass30 = fila15.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        fila0.frente = (byte) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        java.lang.Object[] objArray14 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100);
        fila15.frente = (short) 0;
        fila12.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj25 = fila21.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (-1L));
        fila26.imprime();
        java.lang.Object[] objArray34 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila26.item = objArray34;
        int int36 = fila26.frente;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila26.enfileira((java.lang.Object) objArray38);
        fila26.enfileira((java.lang.Object) '#');
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) (-1L));
        int int45 = fila42.tras;
        java.lang.Object[] objArray46 = fila42.item;
        fila26.item = objArray46;
        fila21.enfileira((java.lang.Object) objArray46);
        fila15.enfileira((java.lang.Object) objArray46);
        fila0.enfileira((java.lang.Object) objArray46);
        java.lang.Object[] objArray51 = fila0.item;
        java.lang.Object[] objArray52 = fila0.item;
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray56 = fila53.item;
        fila53.tras = (short) 1;
        int int59 = fila53.frente;
        int int60 = fila53.frente;
        fila0.enfileira((java.lang.Object) int60);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0f + "'", obj25, 10.0f);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        java.lang.Object obj24 = fila21.desenfileira();
        fila13.enfileira((java.lang.Object) fila21);
        fila13.tras = ' ';
        int int28 = fila13.tras;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        int int39 = fila29.frente;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila29.enfileira((java.lang.Object) objArray41);
        fila29.enfileira((java.lang.Object) '#');
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Object[] objArray49 = fila45.item;
        fila29.item = objArray49;
        fila13.item = objArray49;
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (-1L));
        fila52.imprime();
        java.lang.Object[] objArray60 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila52.item = objArray60;
        fila13.enfileira((java.lang.Object) objArray60);
        fila3.item = objArray60;
        java.lang.Object[] objArray64 = fila3.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100 + "'", obj24, 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj6 = fila2.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        fila7.enfileira((java.lang.Object) '#');
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        int int26 = fila23.tras;
        java.lang.Object[] objArray27 = fila23.item;
        fila7.item = objArray27;
        fila2.enfileira((java.lang.Object) objArray27);
        fila0.item = objArray27;
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila31.item = objArray42;
        int int44 = fila31.tras;
        int int45 = fila31.tras;
        java.lang.Class<?> wildcardClass46 = fila31.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass46);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila51.enfileira((java.lang.Object) 10.0f);
        int int55 = fila51.tras;
        fila51.frente = 0;
        boolean boolean58 = fila51.vazia();
        boolean boolean59 = fila51.vazia();
        java.lang.Object[] objArray60 = fila51.item;
        fila0.item = objArray60;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1));
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        fila8.imprime();
        java.lang.Object[] objArray16 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila8.item = objArray16;
        int int18 = fila8.frente;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.item = objArray19;
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1L) + "'", obj5, (-1L));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        fila9.frente = (-1);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        java.lang.Object[] objArray18 = fila16.item;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100);
        fila19.frente = (short) 0;
        fila16.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila16.item = objArray30;
        fila9.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        fila34.enfileira((java.lang.Object) 10.0f);
        int int38 = fila34.tras;
        fila34.frente = 0;
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        fila34.enfileira((java.lang.Object) wildcardClass42);
        boolean boolean44 = fila34.vazia();
        fila0.enfileira((java.lang.Object) boolean44);
        java.lang.Object obj46 = fila0.desenfileira();
        fila0.tras = '#';
        int int49 = fila0.frente;
        java.lang.Object obj50 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1L) + "'", obj46, (-1L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + false + "'", obj50, false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass8);
        boolean boolean10 = fila0.vazia();
        fila0.tras = 33;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object obj13 = fila0.desenfileira();
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        int int22 = fila15.tras;
        fila15.frente = (byte) 0;
        boolean boolean25 = fila15.vazia();
        fila15.tras = 'a';
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean29 = fila15.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object[] objArray14 = fila0.item;
        int int15 = fila0.frente;
        boolean boolean16 = fila0.vazia();
        int int17 = fila0.frente;
        int int18 = fila0.tras;
        int int19 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        fila15.item = objArray25;
        fila0.item = objArray25;
        fila0.imprime();
        int int30 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.tras;
        fila0.tras = 'a';
        fila0.tras = (short) 0;
        int int19 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        int int15 = fila0.tras;
        java.lang.Object[] objArray16 = fila0.item;
        java.lang.Object[] objArray17 = fila0.item;
        fila0.frente = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.tras = (short) 0;
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) 10.0f);
        int int16 = fila12.tras;
        int int17 = fila12.tras;
        fila12.tras = (byte) 100;
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100);
        java.lang.Object obj23 = fila20.desenfileira();
        fila12.enfileira((java.lang.Object) fila20);
        fila12.tras = ' ';
        int int27 = fila12.tras;
        int int28 = fila12.frente;
        java.lang.Object obj29 = fila12.desenfileira();
        int int30 = fila12.frente;
        java.lang.Object[] objArray31 = fila12.item;
        java.lang.Object[] objArray32 = fila12.item;
        fila6.item = objArray32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100 + "'", obj23, 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10.0f + "'", obj29, 10.0f);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        fila0.tras = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.tras = 2;
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        int int30 = fila20.frente;
        fila15.enfileira((java.lang.Object) fila20);
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.enfileira((java.lang.Object) 10.0f);
        int int36 = fila32.tras;
        int int37 = fila32.tras;
        java.lang.Object[] objArray38 = fila32.item;
        fila20.item = objArray38;
        int int40 = fila20.tras;
        java.lang.Object[] objArray41 = fila20.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.frente = 'a';
        int int11 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) 10.0f);
        int int15 = fila11.tras;
        int int16 = fila11.tras;
        java.lang.Object[] objArray17 = fila11.item;
        fila9.item = objArray17;
        fila0.enfileira((java.lang.Object) objArray17);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        fila0.enfileira((java.lang.Object) objArray47);
        int int50 = fila0.tras;
        fila0.frente = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 33 + "'", int50 == 33);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        fila0.tras = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.tras = 1;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        int int16 = fila0.frente;
        java.lang.Object[] objArray17 = fila0.item;
        int int18 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.frente;
        fila0.frente = (short) 10;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.imprime();
        fila0.frente = 2;
        fila0.frente = (-1);
        int int12 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.tras = 10;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (-1L));
        fila5.imprime();
        java.lang.Object[] objArray13 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila5.item = objArray13;
        int int15 = fila5.frente;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila5.enfileira((java.lang.Object) objArray17);
        fila5.enfileira((java.lang.Object) '#');
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        int int24 = fila21.tras;
        java.lang.Object[] objArray25 = fila21.item;
        fila5.item = objArray25;
        java.lang.Object[] objArray27 = fila5.item;
        boolean boolean28 = fila5.vazia();
        int int29 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object[] objArray31 = null;
        fila0.item = objArray31;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.imprime();
        fila0.tras = 1;
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        fila15.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        java.lang.Object obj39 = fila29.desenfileira();
        java.lang.Object[] objArray40 = fila29.item;
        fila0.item = objArray40;
        int int42 = fila0.frente;
        fila0.frente = '#';
        int int45 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '#' + "'", obj39, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.enfileira((java.lang.Object) 10.0f);
        int int14 = fila10.tras;
        int int15 = fila10.tras;
        java.lang.Object[] objArray16 = fila10.item;
        fila8.item = objArray16;
        fila0.item = objArray16;
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        java.lang.Object[] objArray21 = fila19.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        fila22.frente = (short) 0;
        fila19.enfileira((java.lang.Object) fila22);
        fila15.enfileira((java.lang.Object) fila22);
        boolean boolean29 = fila22.vazia();
        fila22.frente = 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        fila0.imprime();
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        int int24 = fila14.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila14.enfileira((java.lang.Object) objArray26);
        fila14.enfileira((java.lang.Object) '#');
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        int int33 = fila30.tras;
        java.lang.Object[] objArray34 = fila30.item;
        fila14.item = objArray34;
        fila14.tras = 0;
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (-1L));
        int int41 = fila38.tras;
        java.lang.Class<?> wildcardClass42 = fila38.getClass();
        fila14.enfileira((java.lang.Object) fila38);
        fila0.enfileira((java.lang.Object) fila38);
        fila0.tras = 4;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        int int10 = fila0.tras;
        int int11 = fila0.tras;
        fila0.tras = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        java.lang.Object obj16 = fila3.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        fila17.imprime();
        int int22 = fila17.frente;
        java.lang.Object[] objArray23 = fila17.item;
        boolean boolean24 = fila17.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj28 = fila25.desenfileira();
        fila17.enfileira((java.lang.Object) fila25);
        java.lang.Object[] objArray30 = fila25.item;
        fila3.item = objArray30;
        int int32 = fila3.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        fila0.frente = 100;
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.tras;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        int int22 = fila0.frente;
        boolean boolean23 = fila0.vazia();
        fila0.tras = (byte) 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        fila5.item = objArray15;
        boolean boolean18 = fila5.vazia();
        fila5.frente = (byte) -1;
        fila0.enfileira((java.lang.Object) fila5);
        int int22 = fila5.frente;
        int int23 = fila5.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila5.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        int int9 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        fila0.frente = (byte) -1;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) 10.0f);
        int int19 = fila15.tras;
        int int20 = fila15.tras;
        fila15.tras = (byte) 100;
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100);
        java.lang.Object obj26 = fila23.desenfileira();
        fila15.enfileira((java.lang.Object) fila23);
        fila15.tras = ' ';
        int int30 = fila15.tras;
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        int int41 = fila31.frente;
        ds.Fila fila42 = new ds.Fila();
        java.lang.Object[] objArray43 = fila42.item;
        fila31.enfileira((java.lang.Object) objArray43);
        fila31.enfileira((java.lang.Object) '#');
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (-1L));
        int int50 = fila47.tras;
        java.lang.Object[] objArray51 = fila47.item;
        fila31.item = objArray51;
        java.lang.Object[] objArray53 = fila31.item;
        fila15.enfileira((java.lang.Object) objArray53);
        fila0.item = objArray53;
        int int56 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100 + "'", obj26, 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        java.lang.Object[] objArray22 = fila0.item;
        boolean boolean23 = fila0.vazia();
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        int int34 = fila32.frente;
        fila24.enfileira((java.lang.Object) int34);
        int int36 = fila24.tras;
        ds.Fila fila37 = new ds.Fila();
        fila37.frente = 2;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila40.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj44 = fila40.desenfileira();
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (-1L));
        fila47.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila47.item = objArray55;
        fila45.item = objArray55;
        boolean boolean58 = fila45.vazia();
        fila45.frente = (byte) -1;
        fila40.enfileira((java.lang.Object) fila45);
        java.lang.Object[] objArray62 = fila45.item;
        fila37.item = objArray62;
        fila24.item = objArray62;
        fila0.item = objArray62;
        java.lang.Object obj66 = fila0.desenfileira();
        ds.Fila fila67 = new ds.Fila();
        java.lang.Object[] objArray68 = fila67.item;
        fila67.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj71 = fila67.desenfileira();
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) (-1L));
        fila72.imprime();
        java.lang.Object[] objArray80 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila72.item = objArray80;
        int int82 = fila72.frente;
        ds.Fila fila83 = new ds.Fila();
        java.lang.Object[] objArray84 = fila83.item;
        fila72.enfileira((java.lang.Object) objArray84);
        fila72.enfileira((java.lang.Object) '#');
        ds.Fila fila88 = new ds.Fila();
        fila88.enfileira((java.lang.Object) (-1L));
        int int91 = fila88.tras;
        java.lang.Object[] objArray92 = fila88.item;
        fila72.item = objArray92;
        fila67.enfileira((java.lang.Object) objArray92);
        fila0.enfileira((java.lang.Object) fila67);
        fila67.tras = (short) 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 101 + "'", int36 == 101);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 10.0f + "'", obj44, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '#' + "'", obj66, '#');
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 10.0f + "'", obj71, 10.0f);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(objArray92);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1));
        int int8 = fila0.tras;
        int int9 = fila0.tras;
        fila0.frente = 97;
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1L) + "'", obj5, (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.tras = 10;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (-1L));
        fila5.imprime();
        java.lang.Object[] objArray13 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila5.item = objArray13;
        int int15 = fila5.frente;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila5.enfileira((java.lang.Object) objArray17);
        fila5.enfileira((java.lang.Object) '#');
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        int int24 = fila21.tras;
        java.lang.Object[] objArray25 = fila21.item;
        fila5.item = objArray25;
        java.lang.Object[] objArray27 = fila5.item;
        boolean boolean28 = fila5.vazia();
        int int29 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        int int41 = fila31.frente;
        ds.Fila fila42 = new ds.Fila();
        java.lang.Object[] objArray43 = fila42.item;
        fila31.enfileira((java.lang.Object) objArray43);
        fila5.item = objArray43;
        java.lang.Object obj46 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        fila0.tras = 0;
        int int8 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (-1L));
        fila6.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila6.item = objArray14;
        fila4.item = objArray14;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) 10.0f);
        int int22 = fila18.tras;
        int int23 = fila18.tras;
        fila18.tras = (byte) 100;
        java.lang.Class<?> wildcardClass26 = fila18.getClass();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        fila27.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila27.item = objArray35;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila27.item = objArray38;
        int int40 = fila27.tras;
        int int41 = fila27.tras;
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (-1L));
        fila43.imprime();
        java.lang.Object[] objArray51 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila43.item = objArray51;
        int int53 = fila43.frente;
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1), wildcardClass26, fila27, (byte) 0, int53 };
        fila4.item = objArray54;
        fila0.item = objArray54;
        int int57 = fila0.frente;
        fila0.frente = 10;
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) (-1L));
        fila60.imprime();
        java.lang.Object[] objArray68 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila60.item = objArray68;
        ds.Fila fila70 = new ds.Fila();
        java.lang.Object[] objArray71 = fila70.item;
        fila60.item = objArray71;
        java.lang.Object[] objArray73 = fila60.item;
        fila0.item = objArray73;
        java.lang.Class<?> wildcardClass75 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj13 = fila9.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        int int24 = fila14.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila14.enfileira((java.lang.Object) objArray26);
        fila14.enfileira((java.lang.Object) '#');
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        int int33 = fila30.tras;
        java.lang.Object[] objArray34 = fila30.item;
        fila14.item = objArray34;
        fila9.enfileira((java.lang.Object) objArray34);
        fila3.enfileira((java.lang.Object) objArray34);
        fila3.frente = 'a';
        int int40 = fila3.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = 4;
        fila0.tras = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray11 = fila8.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.tras = (short) 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj22 = fila18.desenfileira();
        fila14.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass27 = fila14.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0f + "'", obj22, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.tras;
        fila0.tras = 'a';
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        java.lang.Object[] objArray21 = fila19.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        fila22.frente = (short) 0;
        fila19.enfileira((java.lang.Object) fila22);
        fila15.enfileira((java.lang.Object) fila22);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila29.item = objArray40;
        int int42 = fila29.tras;
        int int43 = fila29.frente;
        java.lang.Object[] objArray44 = fila29.item;
        fila15.enfileira((java.lang.Object) objArray44);
        int int46 = fila15.frente;
        java.lang.Object obj47 = fila15.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 2;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.frente = (-1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Object[] objArray4 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100 + "'", obj3, 100);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.enfileira((java.lang.Object) 10.0f);
        int int14 = fila10.tras;
        int int15 = fila10.tras;
        java.lang.Object[] objArray16 = fila10.item;
        fila8.item = objArray16;
        fila8.frente = (byte) 10;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        java.lang.Object[] objArray22 = fila20.item;
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100);
        fila23.frente = (short) 0;
        fila20.enfileira((java.lang.Object) fila23);
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj33 = fila29.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (-1L));
        fila34.imprime();
        java.lang.Object[] objArray42 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila34.item = objArray42;
        int int44 = fila34.frente;
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        fila34.enfileira((java.lang.Object) objArray46);
        fila34.enfileira((java.lang.Object) '#');
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) (-1L));
        int int53 = fila50.tras;
        java.lang.Object[] objArray54 = fila50.item;
        fila34.item = objArray54;
        fila29.enfileira((java.lang.Object) objArray54);
        fila23.enfileira((java.lang.Object) objArray54);
        fila8.enfileira((java.lang.Object) objArray54);
        fila8.frente = 3;
        java.lang.Object obj61 = fila8.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10.0f + "'", obj33, 10.0f);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila21.item = objArray29;
        int int31 = fila21.frente;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila21.enfileira((java.lang.Object) objArray33);
        fila21.enfileira((java.lang.Object) '#');
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        int int40 = fila37.tras;
        java.lang.Object[] objArray41 = fila37.item;
        fila21.item = objArray41;
        fila21.tras = 0;
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Class<?> wildcardClass49 = fila45.getClass();
        fila21.enfileira((java.lang.Object) fila45);
        fila7.enfileira((java.lang.Object) fila45);
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        int int14 = fila9.tras;
        fila9.tras = (byte) 100;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        java.lang.Object obj20 = fila17.desenfileira();
        fila9.enfileira((java.lang.Object) fila17);
        fila9.tras = ' ';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.frente = (byte) 100;
        fila9.frente = (byte) 10;
        boolean boolean29 = fila9.vazia();
        java.lang.Object obj30 = fila9.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        java.lang.Object[] objArray26 = fila24.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100);
        fila27.frente = (short) 0;
        fila24.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila33.enfileira((java.lang.Object) 10.0f);
        int int37 = fila33.tras;
        fila33.frente = (-1);
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        java.lang.Object[] objArray42 = fila40.item;
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100);
        fila43.frente = (short) 0;
        fila40.enfileira((java.lang.Object) fila43);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (-1L));
        fila49.imprime();
        boolean boolean53 = fila49.vazia();
        java.lang.Object[] objArray54 = fila49.item;
        fila40.item = objArray54;
        fila33.enfileira((java.lang.Object) objArray54);
        fila24.item = objArray54;
        fila0.item = objArray54;
        fila0.frente = (byte) 10;
        boolean boolean61 = fila0.vazia();
        boolean boolean62 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        fila3.frente = 0;
        boolean boolean18 = fila3.vazia();
        java.lang.Object obj19 = null;
        fila3.enfileira(obj19);
        java.lang.Object[] objArray21 = fila3.item;
        fila3.frente = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) 10.0f);
        int int12 = fila8.tras;
        int int13 = fila8.tras;
        fila8.tras = (byte) 100;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        int int18 = fila16.frente;
        fila8.enfileira((java.lang.Object) int18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        int int30 = fila20.frente;
        java.lang.Object[] objArray31 = fila20.item;
        java.lang.Object[] objArray32 = fila20.item;
        java.lang.Object obj33 = fila20.desenfileira();
        boolean boolean34 = fila20.vazia();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        fila37.imprime();
        java.lang.Object[] objArray45 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila37.item = objArray45;
        fila35.item = objArray45;
        boolean boolean48 = fila35.vazia();
        fila35.imprime();
        int int50 = fila35.tras;
        java.lang.Object[] objArray51 = fila35.item;
        fila20.item = objArray51;
        fila8.item = objArray51;
        fila0.item = objArray51;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.tras = (short) -1;
        int int11 = fila7.frente;
        java.lang.Object obj12 = fila7.desenfileira();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.frente = 'a';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (-1L));
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = null;
        fila11.enfileira(obj16);
        int int18 = fila11.frente;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray22 = fila19.item;
        fila11.item = objArray22;
        fila0.item = objArray22;
        java.lang.Class<?> wildcardClass25 = objArray22.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        int int19 = fila15.tras;
        fila15.tras = 0;
        fila15.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        int int13 = fila8.tras;
        int int14 = fila8.tras;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        fila15.imprime();
        int int20 = fila15.frente;
        java.lang.Object[] objArray21 = fila15.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (-1L));
        fila22.imprime();
        java.lang.Object[] objArray30 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila22.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila22.item = objArray33;
        fila15.item = objArray33;
        fila8.item = objArray33;
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        fila37.imprime();
        boolean boolean41 = fila37.vazia();
        java.lang.Object[] objArray42 = fila37.item;
        fila8.item = objArray42;
        fila8.imprime();
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        fila45.enfileira((java.lang.Object) 10.0f);
        int int49 = fila45.tras;
        int int50 = fila45.tras;
        fila45.tras = (byte) 100;
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 100);
        java.lang.Object obj56 = fila53.desenfileira();
        fila45.enfileira((java.lang.Object) fila53);
        fila45.tras = ' ';
        int int60 = fila45.tras;
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) (-1L));
        fila61.imprime();
        java.lang.Object[] objArray69 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila61.item = objArray69;
        int int71 = fila61.frente;
        ds.Fila fila72 = new ds.Fila();
        java.lang.Object[] objArray73 = fila72.item;
        fila61.enfileira((java.lang.Object) objArray73);
        fila61.enfileira((java.lang.Object) '#');
        ds.Fila fila77 = new ds.Fila();
        fila77.enfileira((java.lang.Object) (-1L));
        int int80 = fila77.tras;
        java.lang.Object[] objArray81 = fila77.item;
        fila61.item = objArray81;
        java.lang.Object[] objArray83 = fila61.item;
        fila45.enfileira((java.lang.Object) objArray83);
        fila8.item = objArray83;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj87 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100 + "'", obj56, 100);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 32 + "'", int60 == 32);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (-1L) + "'", obj87, (-1L));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        int int24 = fila14.frente;
        java.lang.Object[] objArray25 = fila14.item;
        java.lang.Object[] objArray26 = fila14.item;
        java.lang.Object obj27 = fila14.desenfileira();
        boolean boolean28 = fila14.vazia();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        fila29.item = objArray39;
        boolean boolean42 = fila29.vazia();
        fila29.imprime();
        int int44 = fila29.tras;
        java.lang.Object[] objArray45 = fila29.item;
        fila14.item = objArray45;
        fila9.item = objArray45;
        int int48 = fila9.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        boolean boolean17 = fila0.vazia();
        int int18 = fila0.frente;
        int int19 = fila0.tras;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) 10.0f);
        int int24 = fila20.tras;
        int int25 = fila20.tras;
        fila20.tras = (byte) 100;
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        int int30 = fila28.frente;
        fila20.enfileira((java.lang.Object) int30);
        fila0.enfileira((java.lang.Object) int30);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (-1L));
        fila33.imprime();
        boolean boolean37 = fila33.vazia();
        boolean boolean38 = fila33.vazia();
        java.lang.Object obj39 = fila33.desenfileira();
        int int40 = fila33.tras;
        fila33.frente = (byte) 0;
        java.lang.Object[] objArray43 = fila33.item;
        fila0.enfileira((java.lang.Object) fila33);
        java.lang.Object obj45 = fila33.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1L) + "'", obj45, (-1L));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        java.lang.Object[] objArray15 = fila13.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100);
        fila16.frente = (short) 0;
        fila13.enfileira((java.lang.Object) fila16);
        java.lang.Object[] objArray22 = fila13.item;
        fila0.item = objArray22;
        java.lang.Object obj24 = fila0.desenfileira();
        int int25 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        java.lang.Object obj16 = fila3.desenfileira();
        java.lang.Object obj17 = fila3.desenfileira();
        boolean boolean18 = fila3.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.imprime();
        fila0.frente = 35;
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        fila15.item = objArray25;
        fila0.item = objArray25;
        int int29 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila7.item = objArray18;
        fila0.item = objArray18;
        java.lang.Object obj21 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass8);
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.frente;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        int int23 = fila21.frente;
        fila13.enfileira((java.lang.Object) int23);
        int int25 = fila13.tras;
        ds.Fila fila26 = new ds.Fila();
        fila26.frente = 2;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj33 = fila29.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (-1L));
        fila36.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila36.item = objArray44;
        fila34.item = objArray44;
        boolean boolean47 = fila34.vazia();
        fila34.frente = (byte) -1;
        fila29.enfileira((java.lang.Object) fila34);
        java.lang.Object[] objArray51 = fila34.item;
        fila26.item = objArray51;
        fila13.item = objArray51;
        fila0.item = objArray51;
        fila0.frente = 3;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10.0f + "'", obj33, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        int int10 = fila8.frente;
        fila0.enfileira((java.lang.Object) int10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) 10.0f);
        int int16 = fila12.tras;
        int int17 = fila12.tras;
        java.lang.Object[] objArray18 = fila12.item;
        java.lang.Object obj19 = fila12.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        java.lang.Object[] objArray22 = fila20.item;
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100);
        fila23.frente = (short) 0;
        fila20.enfileira((java.lang.Object) fila23);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila20.item = objArray34;
        fila12.item = objArray34;
        fila0.enfileira((java.lang.Object) fila12);
        int int38 = fila0.frente;
        java.lang.Object[] objArray39 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0f + "'", obj19, 10.0f);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object[] objArray14 = fila0.item;
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray11 = fila8.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj9 = fila3.desenfileira();
        fila3.frente = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        int int19 = fila15.tras;
        fila15.tras = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        int int14 = fila7.tras;
        fila7.frente = (byte) 0;
        boolean boolean17 = fila7.vazia();
        int int18 = fila7.frente;
        fila7.imprime();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        java.lang.Object[] objArray22 = fila20.item;
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100);
        fila23.frente = (short) 0;
        fila20.enfileira((java.lang.Object) fila23);
        java.lang.Object[] objArray29 = fila20.item;
        fila7.item = objArray29;
        java.lang.Object obj31 = fila7.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        fila32.imprime();
        java.lang.Object[] objArray40 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila32.item = objArray40;
        int int42 = fila32.frente;
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object[] objArray44 = fila43.item;
        fila32.enfileira((java.lang.Object) objArray44);
        fila32.enfileira((java.lang.Object) '#');
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) (-1L));
        int int51 = fila48.tras;
        java.lang.Object[] objArray52 = fila48.item;
        fila32.item = objArray52;
        fila32.frente = 0;
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        fila56.imprime();
        boolean boolean60 = fila56.vazia();
        boolean boolean61 = fila56.vazia();
        boolean boolean62 = fila56.vazia();
        java.lang.Object[] objArray63 = fila56.item;
        fila32.item = objArray63;
        fila7.enfileira((java.lang.Object) objArray63);
        fila0.item = objArray63;
        java.lang.Object obj67 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (-1L) + "'", obj67, (-1L));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) 10.0f);
        int int9 = fila5.tras;
        int int10 = fila5.tras;
        fila5.tras = (byte) 100;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100);
        java.lang.Object obj16 = fila13.desenfileira();
        fila5.enfileira((java.lang.Object) fila13);
        fila5.tras = ' ';
        int int20 = fila5.tras;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila21.item = objArray29;
        int int31 = fila21.frente;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila21.enfileira((java.lang.Object) objArray33);
        fila21.enfileira((java.lang.Object) '#');
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        int int40 = fila37.tras;
        java.lang.Object[] objArray41 = fila37.item;
        fila21.item = objArray41;
        fila5.item = objArray41;
        ds.Fila fila44 = new ds.Fila();
        java.lang.Object[] objArray45 = fila44.item;
        java.lang.Object[] objArray46 = fila44.item;
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 100);
        fila47.frente = (short) 0;
        fila44.enfileira((java.lang.Object) fila47);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (-1L));
        fila53.imprime();
        boolean boolean57 = fila53.vazia();
        java.lang.Object[] objArray58 = fila53.item;
        fila44.item = objArray58;
        fila5.enfileira((java.lang.Object) objArray58);
        fila0.item = objArray58;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        fila0.frente = (byte) 10;
        int int12 = fila0.frente;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.frente;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (-1L));
        fila6.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila6.item = objArray14;
        fila4.item = objArray14;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) 10.0f);
        int int22 = fila18.tras;
        int int23 = fila18.tras;
        fila18.tras = (byte) 100;
        java.lang.Class<?> wildcardClass26 = fila18.getClass();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        fila27.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila27.item = objArray35;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila27.item = objArray38;
        int int40 = fila27.tras;
        int int41 = fila27.tras;
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (-1L));
        fila43.imprime();
        java.lang.Object[] objArray51 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila43.item = objArray51;
        int int53 = fila43.frente;
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1), wildcardClass26, fila27, (byte) 0, int53 };
        fila4.item = objArray54;
        fila0.item = objArray54;
        int int57 = fila0.frente;
        fila0.frente = 10;
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) (-1L));
        fila60.imprime();
        java.lang.Object[] objArray68 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila60.item = objArray68;
        ds.Fila fila70 = new ds.Fila();
        java.lang.Object[] objArray71 = fila70.item;
        fila60.item = objArray71;
        java.lang.Object[] objArray73 = fila60.item;
        fila0.item = objArray73;
        java.lang.Object obj75 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj6 = fila2.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        fila7.enfileira((java.lang.Object) '#');
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        int int26 = fila23.tras;
        java.lang.Object[] objArray27 = fila23.item;
        fila7.item = objArray27;
        fila2.enfileira((java.lang.Object) objArray27);
        fila0.item = objArray27;
        fila0.tras = 0;
        boolean boolean33 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.tras;
        fila0.tras = 'a';
        int int17 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.tras = (short) 0;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        boolean boolean22 = fila0.vazia();
        boolean boolean23 = fila0.vazia();
        int int24 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        int int16 = fila0.frente;
        java.lang.Object[] objArray17 = fila0.item;
        fila0.frente = '#';
        int int20 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        java.lang.Object[] objArray16 = fila14.item;
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        java.lang.Object[] objArray19 = fila14.item;
        fila0.item = objArray19;
        boolean boolean21 = fila0.vazia();
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean9 = fila3.vazia();
        int int10 = fila3.tras;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (-1L));
        fila11.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila11.item = objArray19;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila11.item = objArray22;
        java.lang.Object obj24 = fila11.desenfileira();
        boolean boolean25 = fila11.vazia();
        fila3.enfileira((java.lang.Object) fila11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int5 = fila0.tras;
        fila0.frente = '#';
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object[] objArray14 = fila0.item;
        int int15 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.tras = (short) 0;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        boolean boolean22 = fila0.vazia();
        boolean boolean23 = fila0.vazia();
        int int24 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj6 = fila2.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        fila7.enfileira((java.lang.Object) '#');
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        int int26 = fila23.tras;
        java.lang.Object[] objArray27 = fila23.item;
        fila7.item = objArray27;
        fila2.enfileira((java.lang.Object) objArray27);
        fila0.item = objArray27;
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila31.item = objArray42;
        int int44 = fila31.tras;
        int int45 = fila31.tras;
        java.lang.Class<?> wildcardClass46 = fila31.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass46);
        fila0.tras = 4;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        fila5.item = objArray15;
        boolean boolean18 = fila5.vazia();
        fila5.frente = (byte) -1;
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean22 = fila0.vazia();
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) 10.0f);
        int int27 = fila23.tras;
        int int28 = fila23.tras;
        fila23.tras = (byte) 100;
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100);
        java.lang.Object obj34 = fila31.desenfileira();
        fila23.enfileira((java.lang.Object) fila31);
        fila23.tras = ' ';
        int int38 = fila23.tras;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        int int49 = fila39.frente;
        ds.Fila fila50 = new ds.Fila();
        java.lang.Object[] objArray51 = fila50.item;
        fila39.enfileira((java.lang.Object) objArray51);
        fila39.enfileira((java.lang.Object) '#');
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (-1L));
        int int58 = fila55.tras;
        java.lang.Object[] objArray59 = fila55.item;
        fila39.item = objArray59;
        fila23.item = objArray59;
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        java.lang.Object[] objArray64 = fila62.item;
        ds.Fila fila65 = new ds.Fila();
        fila65.enfileira((java.lang.Object) 100);
        fila65.frente = (short) 0;
        fila62.enfileira((java.lang.Object) fila65);
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) (-1L));
        fila71.imprime();
        boolean boolean75 = fila71.vazia();
        java.lang.Object[] objArray76 = fila71.item;
        fila62.item = objArray76;
        fila23.enfileira((java.lang.Object) objArray76);
        int int79 = fila23.tras;
        int int80 = fila23.frente;
        fila0.enfileira((java.lang.Object) int80);
        int int82 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100 + "'", obj34, 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 33 + "'", int79 == 33);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object[] objArray14 = fila0.item;
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object[] objArray14 = fila0.item;
        int int15 = fila0.frente;
        boolean boolean16 = fila0.vazia();
        int int17 = fila0.frente;
        int int18 = fila0.tras;
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        java.lang.Object[] objArray16 = fila14.item;
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        java.lang.Object[] objArray19 = fila14.item;
        fila0.item = objArray19;
        fila0.frente = (byte) 0;
        int int23 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        int int30 = fila20.frente;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila20.enfileira((java.lang.Object) objArray32);
        fila20.enfileira((java.lang.Object) '#');
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (-1L));
        int int39 = fila36.tras;
        java.lang.Object[] objArray40 = fila36.item;
        fila20.item = objArray40;
        java.lang.Object[] objArray42 = fila20.item;
        fila15.item = objArray42;
        int int44 = fila15.tras;
        fila15.tras = 1;
        java.lang.Object[] objArray47 = fila15.item;
        boolean boolean48 = fila15.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.frente = 100;
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.tras = (short) 10;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        fila19.imprime();
        fila19.imprime();
        int int24 = fila19.frente;
        java.lang.Object[] objArray25 = fila19.item;
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (-1L));
        fila26.imprime();
        java.lang.Object[] objArray34 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila26.item = objArray34;
        int int36 = fila26.frente;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila26.enfileira((java.lang.Object) objArray38);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila40.tras = 0;
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) (-1L));
        int int67 = fila64.tras;
        java.lang.Class<?> wildcardClass68 = fila64.getClass();
        fila40.enfileira((java.lang.Object) fila64);
        fila26.enfileira((java.lang.Object) fila64);
        fila19.enfileira((java.lang.Object) fila26);
        java.lang.Class<?> wildcardClass72 = fila19.getClass();
        fila0.enfileira((java.lang.Object) fila19);
        fila19.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila20.item = objArray31;
        java.lang.Object[] objArray33 = fila20.item;
        java.lang.Object[] objArray34 = fila20.item;
        int int35 = fila20.frente;
        fila15.enfileira((java.lang.Object) fila20);
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.enfileira((java.lang.Object) 10.0f);
        int int41 = fila37.tras;
        int int42 = fila37.tras;
        fila37.tras = (byte) 100;
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 100);
        java.lang.Object obj48 = fila45.desenfileira();
        fila37.enfileira((java.lang.Object) fila45);
        fila37.tras = ' ';
        int int52 = fila37.tras;
        int int53 = fila37.frente;
        boolean boolean54 = fila37.vazia();
        fila15.enfileira((java.lang.Object) fila37);
        java.lang.Class<?> wildcardClass56 = fila15.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100 + "'", obj48, 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        fila5.item = objArray15;
        boolean boolean18 = fila5.vazia();
        fila5.frente = (byte) -1;
        fila0.enfileira((java.lang.Object) fila5);
        int int22 = fila5.tras;
        int int23 = fila5.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        int int27 = fila24.tras;
        java.lang.Class<?> wildcardClass28 = fila24.getClass();
        fila0.enfileira((java.lang.Object) fila24);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        fila30.imprime();
        java.lang.Object[] objArray38 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila30.item = objArray38;
        int int40 = fila30.frente;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila30.enfileira((java.lang.Object) objArray42);
        fila30.enfileira((java.lang.Object) '#');
        int int46 = fila30.frente;
        java.lang.Object[] objArray47 = fila30.item;
        fila0.item = objArray47;
        fila0.tras = (byte) 0;
        fila0.frente = 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        boolean boolean39 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        fila0.frente = 97;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        fila8.imprime();
        java.lang.Object[] objArray16 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila8.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila8.item = objArray19;
        int int21 = fila8.tras;
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        fila24.imprime();
        java.lang.Object[] objArray32 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila24.item = objArray32;
        fila22.item = objArray32;
        fila8.item = objArray32;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila36.enfileira((java.lang.Object) 10.0f);
        int int40 = fila36.tras;
        fila36.frente = 0;
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass44);
        boolean boolean46 = fila36.vazia();
        java.lang.Object obj47 = fila36.desenfileira();
        int int48 = fila36.frente;
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray50 = fila49.item;
        fila49.enfileira((java.lang.Object) 10.0f);
        int int53 = fila49.tras;
        int int54 = fila49.tras;
        fila49.tras = (byte) 100;
        ds.Fila fila57 = new ds.Fila();
        boolean boolean58 = fila57.vazia();
        int int59 = fila57.frente;
        fila49.enfileira((java.lang.Object) int59);
        int int61 = fila49.tras;
        ds.Fila fila62 = new ds.Fila();
        fila62.frente = 2;
        ds.Fila fila65 = new ds.Fila();
        java.lang.Object[] objArray66 = fila65.item;
        fila65.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj69 = fila65.desenfileira();
        ds.Fila fila70 = new ds.Fila();
        boolean boolean71 = fila70.vazia();
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) (-1L));
        fila72.imprime();
        java.lang.Object[] objArray80 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila72.item = objArray80;
        fila70.item = objArray80;
        boolean boolean83 = fila70.vazia();
        fila70.frente = (byte) -1;
        fila65.enfileira((java.lang.Object) fila70);
        java.lang.Object[] objArray87 = fila70.item;
        fila62.item = objArray87;
        fila49.item = objArray87;
        fila36.item = objArray87;
        java.lang.Object obj91 = fila36.desenfileira();
        java.lang.Object[] objArray92 = fila36.item;
        fila8.item = objArray92;
        fila0.enfileira((java.lang.Object) objArray92);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 10.0f + "'", obj47, 10.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 101 + "'", int61 == 101);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 10.0f + "'", obj69, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + (-1.0f) + "'", obj91, (-1.0f));
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj18 = fila0.desenfileira();
        java.lang.Object[] objArray19 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        int int13 = fila8.tras;
        int int14 = fila8.tras;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        fila15.imprime();
        int int20 = fila15.frente;
        java.lang.Object[] objArray21 = fila15.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (-1L));
        fila22.imprime();
        java.lang.Object[] objArray30 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila22.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila22.item = objArray33;
        fila15.item = objArray33;
        fila8.item = objArray33;
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        fila37.imprime();
        boolean boolean41 = fila37.vazia();
        java.lang.Object[] objArray42 = fila37.item;
        fila8.item = objArray42;
        fila8.imprime();
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        fila45.enfileira((java.lang.Object) 10.0f);
        int int49 = fila45.tras;
        int int50 = fila45.tras;
        fila45.tras = (byte) 100;
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 100);
        java.lang.Object obj56 = fila53.desenfileira();
        fila45.enfileira((java.lang.Object) fila53);
        fila45.tras = ' ';
        int int60 = fila45.tras;
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) (-1L));
        fila61.imprime();
        java.lang.Object[] objArray69 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila61.item = objArray69;
        int int71 = fila61.frente;
        ds.Fila fila72 = new ds.Fila();
        java.lang.Object[] objArray73 = fila72.item;
        fila61.enfileira((java.lang.Object) objArray73);
        fila61.enfileira((java.lang.Object) '#');
        ds.Fila fila77 = new ds.Fila();
        fila77.enfileira((java.lang.Object) (-1L));
        int int80 = fila77.tras;
        java.lang.Object[] objArray81 = fila77.item;
        fila61.item = objArray81;
        java.lang.Object[] objArray83 = fila61.item;
        fila45.enfileira((java.lang.Object) objArray83);
        fila8.item = objArray83;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass87 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100 + "'", obj56, 100);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 32 + "'", int60 == 32);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray12 = fila9.item;
        fila9.tras = (short) 1;
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = fila9.item;
        fila0.enfileira((java.lang.Object) objArray16);
        int int18 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0f + "'", obj7, 10.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj6 = fila2.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        fila7.enfileira((java.lang.Object) '#');
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        int int26 = fila23.tras;
        java.lang.Object[] objArray27 = fila23.item;
        fila7.item = objArray27;
        fila2.enfileira((java.lang.Object) objArray27);
        fila0.item = objArray27;
        int int31 = fila0.tras;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        fila32.imprime();
        boolean boolean36 = fila32.vazia();
        java.lang.Object[] objArray37 = fila32.item;
        int int38 = fila32.tras;
        fila0.enfileira((java.lang.Object) int38);
        boolean boolean40 = fila0.vazia();
        fila0.tras = 3;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (-1L));
        fila5.imprime();
        java.lang.Object[] objArray13 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila5.item = objArray13;
        int int15 = fila5.frente;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila5.enfileira((java.lang.Object) objArray17);
        fila5.enfileira((java.lang.Object) '#');
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        int int24 = fila21.tras;
        java.lang.Object[] objArray25 = fila21.item;
        fila5.item = objArray25;
        fila0.enfileira((java.lang.Object) objArray25);
        java.lang.Object[] objArray28 = fila0.item;
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        int int16 = fila0.frente;
        java.lang.Object[] objArray17 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        int int30 = fila20.frente;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila20.enfileira((java.lang.Object) objArray32);
        fila20.enfileira((java.lang.Object) '#');
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (-1L));
        int int39 = fila36.tras;
        java.lang.Object[] objArray40 = fila36.item;
        fila20.item = objArray40;
        fila20.tras = 0;
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (-1L));
        int int47 = fila44.tras;
        java.lang.Class<?> wildcardClass48 = fila44.getClass();
        fila20.enfileira((java.lang.Object) fila44);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) (-1L));
        fila50.imprime();
        java.lang.Object[] objArray58 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila50.item = objArray58;
        int int60 = fila50.frente;
        ds.Fila fila61 = new ds.Fila();
        java.lang.Object[] objArray62 = fila61.item;
        fila50.enfileira((java.lang.Object) objArray62);
        fila50.enfileira((java.lang.Object) '#');
        int int66 = fila50.frente;
        java.lang.Object[] objArray67 = fila50.item;
        fila20.item = objArray67;
        fila20.tras = (byte) 0;
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray72 = fila0.item;
        java.lang.Object obj73 = fila0.desenfileira();
        boolean boolean74 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) 0 + "'", obj73, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        java.lang.Object[] objArray22 = fila0.item;
        boolean boolean23 = fila0.vazia();
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        int int34 = fila32.frente;
        fila24.enfileira((java.lang.Object) int34);
        int int36 = fila24.tras;
        ds.Fila fila37 = new ds.Fila();
        fila37.frente = 2;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila40.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj44 = fila40.desenfileira();
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (-1L));
        fila47.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila47.item = objArray55;
        fila45.item = objArray55;
        boolean boolean58 = fila45.vazia();
        fila45.frente = (byte) -1;
        fila40.enfileira((java.lang.Object) fila45);
        java.lang.Object[] objArray62 = fila45.item;
        fila37.item = objArray62;
        fila24.item = objArray62;
        fila0.item = objArray62;
        java.lang.Object obj66 = fila0.desenfileira();
        ds.Fila fila67 = new ds.Fila();
        java.lang.Object[] objArray68 = fila67.item;
        fila67.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj71 = fila67.desenfileira();
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) (-1L));
        fila72.imprime();
        java.lang.Object[] objArray80 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila72.item = objArray80;
        int int82 = fila72.frente;
        ds.Fila fila83 = new ds.Fila();
        java.lang.Object[] objArray84 = fila83.item;
        fila72.enfileira((java.lang.Object) objArray84);
        fila72.enfileira((java.lang.Object) '#');
        ds.Fila fila88 = new ds.Fila();
        fila88.enfileira((java.lang.Object) (-1L));
        int int91 = fila88.tras;
        java.lang.Object[] objArray92 = fila88.item;
        fila72.item = objArray92;
        fila67.enfileira((java.lang.Object) objArray92);
        fila0.enfileira((java.lang.Object) fila67);
        fila0.tras = (short) -1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 101 + "'", int36 == 101);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 10.0f + "'", obj44, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '#' + "'", obj66, '#');
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 10.0f + "'", obj71, 10.0f);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(objArray92);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        int int10 = fila0.tras;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        java.lang.Object[] objArray41 = fila39.item;
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100);
        fila42.frente = (short) 0;
        fila39.enfileira((java.lang.Object) fila42);
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) (-1L));
        fila48.imprime();
        boolean boolean52 = fila48.vazia();
        java.lang.Object[] objArray53 = fila48.item;
        fila39.item = objArray53;
        fila0.enfileira((java.lang.Object) objArray53);
        int int56 = fila0.tras;
        boolean boolean57 = fila0.vazia();
        java.lang.Object[] objArray58 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 33 + "'", int56 == 33);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.frente = (byte) -1;
        fila0.frente = (short) -1;
        int int18 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        int int10 = fila0.tras;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila20.item = objArray31;
        java.lang.Object[] objArray33 = fila20.item;
        java.lang.Object[] objArray34 = fila20.item;
        int int35 = fila20.frente;
        fila15.enfileira((java.lang.Object) fila20);
        boolean boolean37 = fila15.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila7.item = objArray18;
        fila0.item = objArray18;
        int int21 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.tras = (short) -1;
        int int11 = fila7.frente;
        java.lang.Object obj12 = fila7.desenfileira();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = fila0.desenfileira();
        int int15 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        int int16 = fila0.frente;
        java.lang.Object[] objArray17 = fila0.item;
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100);
        java.lang.Object obj21 = fila18.desenfileira();
        java.lang.Object[] objArray22 = fila18.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100 + "'", obj21, 100);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) 10.0f);
        int int9 = fila5.tras;
        fila5.frente = ' ';
        java.lang.Object[] objArray12 = fila5.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        int int23 = fila13.frente;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila13.enfileira((java.lang.Object) objArray25);
        fila13.enfileira((java.lang.Object) '#');
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        int int32 = fila29.tras;
        java.lang.Object[] objArray33 = fila29.item;
        fila13.item = objArray33;
        fila13.frente = 0;
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        fila37.imprime();
        boolean boolean41 = fila37.vazia();
        boolean boolean42 = fila37.vazia();
        boolean boolean43 = fila37.vazia();
        java.lang.Object[] objArray44 = fila37.item;
        fila13.item = objArray44;
        fila5.enfileira((java.lang.Object) objArray44);
        fila0.item = objArray44;
        java.lang.Class<?> wildcardClass48 = objArray44.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (-1L));
        fila6.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila6.item = objArray14;
        fila4.item = objArray14;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) 10.0f);
        int int22 = fila18.tras;
        int int23 = fila18.tras;
        fila18.tras = (byte) 100;
        java.lang.Class<?> wildcardClass26 = fila18.getClass();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        fila27.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila27.item = objArray35;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila27.item = objArray38;
        int int40 = fila27.tras;
        int int41 = fila27.tras;
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (-1L));
        fila43.imprime();
        java.lang.Object[] objArray51 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila43.item = objArray51;
        int int53 = fila43.frente;
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1), wildcardClass26, fila27, (byte) 0, int53 };
        fila4.item = objArray54;
        fila0.item = objArray54;
        int int57 = fila0.frente;
        int int58 = fila0.frente;
        java.lang.Class<?> wildcardClass59 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        java.lang.Object obj24 = fila21.desenfileira();
        fila13.enfileira((java.lang.Object) fila21);
        fila13.tras = ' ';
        int int28 = fila13.tras;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        int int39 = fila29.frente;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila29.enfileira((java.lang.Object) objArray41);
        fila29.enfileira((java.lang.Object) '#');
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Object[] objArray49 = fila45.item;
        fila29.item = objArray49;
        fila13.item = objArray49;
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (-1L));
        fila52.imprime();
        java.lang.Object[] objArray60 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila52.item = objArray60;
        fila13.enfileira((java.lang.Object) objArray60);
        fila8.enfileira((java.lang.Object) fila13);
        java.lang.Object obj64 = fila13.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100 + "'", obj24, 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (-1L) + "'", obj64, (-1L));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.frente = (byte) 0;
        fila0.frente = 97;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        int int20 = fila10.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila10.enfileira((java.lang.Object) objArray22);
        java.lang.Object obj24 = fila10.desenfileira();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        fila0.enfileira(obj24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        boolean boolean16 = fila0.vazia();
        java.lang.Object[] objArray17 = fila0.item;
        int int18 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        int int19 = fila15.frente;
        fila15.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila21.item = objArray29;
        int int31 = fila21.frente;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila21.enfileira((java.lang.Object) objArray33);
        fila21.enfileira((java.lang.Object) '#');
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        int int40 = fila37.tras;
        java.lang.Object[] objArray41 = fila37.item;
        fila21.item = objArray41;
        fila21.tras = 0;
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Class<?> wildcardClass49 = fila45.getClass();
        fila21.enfileira((java.lang.Object) fila45);
        fila7.enfileira((java.lang.Object) fila45);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        fila0.enfileira((java.lang.Object) objArray25);
        fila0.tras = (-1);
        int int30 = fila0.frente;
        int int31 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        java.lang.Object obj21 = fila7.desenfileira();
        int int22 = fila7.frente;
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        fila23.imprime();
        boolean boolean27 = fila23.vazia();
        boolean boolean28 = fila23.vazia();
        java.lang.Object obj29 = fila23.desenfileira();
        int int30 = fila23.tras;
        fila23.frente = (byte) 0;
        boolean boolean33 = fila23.vazia();
        int int34 = fila23.frente;
        fila23.imprime();
        fila23.frente = (byte) -1;
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray39 = fila38.item;
        fila38.enfileira((java.lang.Object) 10.0f);
        int int42 = fila38.tras;
        int int43 = fila38.tras;
        fila38.tras = (byte) 100;
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 100);
        java.lang.Object obj49 = fila46.desenfileira();
        fila38.enfileira((java.lang.Object) fila46);
        fila38.tras = ' ';
        int int53 = fila38.tras;
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) (-1L));
        fila54.imprime();
        java.lang.Object[] objArray62 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila54.item = objArray62;
        int int64 = fila54.frente;
        ds.Fila fila65 = new ds.Fila();
        java.lang.Object[] objArray66 = fila65.item;
        fila54.enfileira((java.lang.Object) objArray66);
        fila54.enfileira((java.lang.Object) '#');
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) (-1L));
        int int73 = fila70.tras;
        java.lang.Object[] objArray74 = fila70.item;
        fila54.item = objArray74;
        java.lang.Object[] objArray76 = fila54.item;
        fila38.enfileira((java.lang.Object) objArray76);
        fila23.item = objArray76;
        fila7.item = objArray76;
        fila7.tras = (short) 10;
        fila0.enfileira((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100 + "'", obj49, 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        int int20 = fila13.tras;
        fila13.frente = (byte) 0;
        boolean boolean23 = fila13.vazia();
        int int24 = fila13.frente;
        fila13.imprime();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        java.lang.Object[] objArray28 = fila26.item;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100);
        fila29.frente = (short) 0;
        fila26.enfileira((java.lang.Object) fila29);
        java.lang.Object[] objArray35 = fila26.item;
        fila13.item = objArray35;
        fila0.enfileira((java.lang.Object) objArray35);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (-1L));
        fila38.imprime();
        boolean boolean42 = fila38.vazia();
        boolean boolean43 = fila38.vazia();
        java.lang.Object obj44 = fila38.desenfileira();
        int int45 = fila38.tras;
        fila38.frente = (byte) 0;
        boolean boolean48 = fila38.vazia();
        int int49 = fila38.frente;
        fila38.imprime();
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        java.lang.Object[] objArray53 = fila51.item;
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) 100);
        fila54.frente = (short) 0;
        fila51.enfileira((java.lang.Object) fila54);
        java.lang.Object[] objArray60 = fila51.item;
        fila38.item = objArray60;
        fila0.item = objArray60;
        java.lang.Class<?> wildcardClass63 = objArray60.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1L) + "'", obj44, (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (-1L));
        int int15 = fila12.tras;
        java.lang.Object[] objArray16 = fila12.item;
        fila0.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj22 = fila18.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila25.item = objArray33;
        fila23.item = objArray33;
        boolean boolean36 = fila23.vazia();
        fila23.frente = (byte) -1;
        fila18.enfileira((java.lang.Object) fila23);
        java.lang.Object[] objArray40 = fila23.item;
        fila0.item = objArray40;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0f + "'", obj22, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        fila9.frente = (-1);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        java.lang.Object[] objArray18 = fila16.item;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100);
        fila19.frente = (short) 0;
        fila16.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila16.item = objArray30;
        fila9.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        java.lang.Object[] objArray36 = fila34.item;
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 100);
        fila37.frente = (short) 0;
        fila34.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (-1L));
        fila34.enfileira((java.lang.Object) (-1L));
        ds.Fila fila47 = new ds.Fila();
        boolean boolean48 = fila47.vazia();
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray50 = fila49.item;
        fila49.enfileira((java.lang.Object) 10.0f);
        int int53 = fila49.tras;
        int int54 = fila49.tras;
        java.lang.Object[] objArray55 = fila49.item;
        fila47.item = objArray55;
        fila34.item = objArray55;
        fila0.item = objArray55;
        ds.Fila fila59 = new ds.Fila();
        java.lang.Object[] objArray60 = fila59.item;
        java.lang.Object[] objArray61 = fila59.item;
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 100);
        fila62.frente = (short) 0;
        fila59.enfileira((java.lang.Object) fila62);
        ds.Fila fila68 = new ds.Fila();
        java.lang.Object[] objArray69 = fila68.item;
        fila68.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj72 = fila68.desenfileira();
        ds.Fila fila73 = new ds.Fila();
        fila73.enfileira((java.lang.Object) (-1L));
        fila73.imprime();
        java.lang.Object[] objArray81 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila73.item = objArray81;
        int int83 = fila73.frente;
        ds.Fila fila84 = new ds.Fila();
        java.lang.Object[] objArray85 = fila84.item;
        fila73.enfileira((java.lang.Object) objArray85);
        fila73.enfileira((java.lang.Object) '#');
        ds.Fila fila89 = new ds.Fila();
        fila89.enfileira((java.lang.Object) (-1L));
        int int92 = fila89.tras;
        java.lang.Object[] objArray93 = fila89.item;
        fila73.item = objArray93;
        fila68.enfileira((java.lang.Object) objArray93);
        fila62.enfileira((java.lang.Object) objArray93);
        fila0.item = objArray93;
        int int98 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 10.0f + "'", obj72, 10.0f);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        fila0.tras = 'a';
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        int int10 = fila8.frente;
        fila0.enfileira((java.lang.Object) int10);
        int int12 = fila0.tras;
        ds.Fila fila13 = new ds.Fila();
        fila13.frente = 2;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        fila23.imprime();
        java.lang.Object[] objArray31 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila23.item = objArray31;
        fila21.item = objArray31;
        boolean boolean34 = fila21.vazia();
        fila21.frente = (byte) -1;
        fila16.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray38 = fila21.item;
        fila13.item = objArray38;
        fila0.item = objArray38;
        int int41 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0f + "'", obj20, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        java.lang.Object obj24 = fila21.desenfileira();
        fila13.enfileira((java.lang.Object) fila21);
        fila13.tras = ' ';
        int int28 = fila13.tras;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        int int39 = fila29.frente;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila29.enfileira((java.lang.Object) objArray41);
        fila29.enfileira((java.lang.Object) '#');
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Object[] objArray49 = fila45.item;
        fila29.item = objArray49;
        fila13.item = objArray49;
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (-1L));
        fila52.imprime();
        java.lang.Object[] objArray60 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila52.item = objArray60;
        fila13.enfileira((java.lang.Object) objArray60);
        fila8.enfileira((java.lang.Object) fila13);
        fila13.frente = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100 + "'", obj24, 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (-1L));
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) 10.0f);
        int int19 = fila15.tras;
        int int20 = fila15.tras;
        java.lang.Object[] objArray21 = fila15.item;
        fila13.item = objArray21;
        fila0.item = objArray21;
        fila0.frente = (short) 0;
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.enfileira((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        java.lang.Object[] objArray20 = fila18.item;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        fila21.frente = (short) 0;
        fila18.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100);
        fila27.imprime();
        fila18.enfileira((java.lang.Object) fila27);
        fila27.imprime();
        fila15.enfileira((java.lang.Object) fila27);
        java.lang.Class<?> wildcardClass34 = fila15.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        fila3.frente = (byte) -1;
        java.lang.Class<?> wildcardClass14 = fila3.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        java.lang.Object[] objArray26 = fila24.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100);
        fila27.frente = (short) 0;
        fila24.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila33.enfileira((java.lang.Object) 10.0f);
        int int37 = fila33.tras;
        fila33.frente = (-1);
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        java.lang.Object[] objArray42 = fila40.item;
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100);
        fila43.frente = (short) 0;
        fila40.enfileira((java.lang.Object) fila43);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (-1L));
        fila49.imprime();
        boolean boolean53 = fila49.vazia();
        java.lang.Object[] objArray54 = fila49.item;
        fila40.item = objArray54;
        fila33.enfileira((java.lang.Object) objArray54);
        fila24.item = objArray54;
        fila0.item = objArray54;
        boolean boolean59 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object[] objArray9 = fila0.item;
        fila0.frente = (short) 100;
        fila0.tras = 33;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object obj8 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        java.lang.Object[] objArray9 = fila7.item;
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100);
        fila10.frente = (short) 0;
        fila7.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100);
        fila16.imprime();
        fila7.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        java.lang.Object[] objArray23 = fila21.item;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 100);
        fila24.frente = (short) 0;
        fila21.enfileira((java.lang.Object) fila24);
        int int30 = fila24.tras;
        boolean boolean31 = fila24.vazia();
        int int32 = fila24.frente;
        boolean boolean33 = fila24.vazia();
        fila24.imprime();
        fila24.tras = '#';
        java.lang.Object obj37 = fila24.desenfileira();
        int int38 = fila24.frente;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        int int42 = fila39.tras;
        java.lang.Object[] objArray43 = fila39.item;
        fila24.enfileira((java.lang.Object) objArray43);
        fila7.item = objArray43;
        fila0.enfileira((java.lang.Object) fila7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100 + "'", obj37, 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        int int15 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        java.lang.Object[] objArray15 = fila13.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100);
        fila16.frente = (short) 0;
        fila13.enfileira((java.lang.Object) fila16);
        java.lang.Object[] objArray22 = fila13.item;
        fila0.item = objArray22;
        int int24 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        int int8 = fila0.tras;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        int int15 = fila0.tras;
        fila0.imprime();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) 10.0f);
        int int21 = fila17.tras;
        boolean boolean22 = fila17.vazia();
        java.lang.Object[] objArray23 = null;
        fila17.item = objArray23;
        fila0.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.frente;
        int int10 = fila0.tras;
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.tras = 97;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        int int5 = fila0.frente;
        fila0.tras = (short) 100;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        fila5.item = objArray15;
        boolean boolean18 = fila5.vazia();
        fila5.frente = (byte) -1;
        fila0.enfileira((java.lang.Object) fila5);
        int int22 = fila5.frente;
        int int23 = fila5.tras;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        fila24.imprime();
        java.lang.Object[] objArray32 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila24.item = objArray32;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        fila24.item = objArray35;
        int int37 = fila24.tras;
        int int38 = fila24.frente;
        int int39 = fila24.frente;
        fila24.frente = 100;
        fila24.tras = (-1);
        fila5.enfileira((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        fila3.frente = (byte) -1;
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        fila14.imprime();
        int int19 = fila14.frente;
        int int20 = fila14.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.tras = (short) -1;
        int int25 = fila21.frente;
        java.lang.Object obj26 = fila21.desenfileira();
        fila14.enfileira((java.lang.Object) fila21);
        fila14.tras = 2;
        fila3.enfileira((java.lang.Object) 2);
        fila3.tras = '#';
        int int33 = fila3.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        java.lang.Object[] objArray15 = fila13.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100);
        fila16.frente = (short) 0;
        fila13.enfileira((java.lang.Object) fila16);
        java.lang.Object[] objArray22 = fila13.item;
        fila0.item = objArray22;
        fila0.frente = 32;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (-1L));
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        int int22 = fila15.tras;
        fila15.frente = (byte) 0;
        boolean boolean25 = fila15.vazia();
        int int26 = fila15.frente;
        fila15.imprime();
        java.lang.Object obj28 = fila15.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        java.lang.Object[] objArray35 = fila29.item;
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (-1L));
        fila36.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila36.item = objArray44;
        int int46 = fila36.frente;
        ds.Fila fila47 = new ds.Fila();
        java.lang.Object[] objArray48 = fila47.item;
        fila36.enfileira((java.lang.Object) objArray48);
        fila36.enfileira((java.lang.Object) '#');
        int int52 = fila36.frente;
        java.lang.Object[] objArray53 = fila36.item;
        fila29.enfileira((java.lang.Object) objArray53);
        fila15.item = objArray53;
        fila6.item = objArray53;
        fila6.frente = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.frente = (byte) 0;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100L);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.tras = (short) -1;
        int int13 = fila9.frente;
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.tras = 0;
        fila9.frente = (byte) 0;
        fila0.enfileira((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        fila5.item = objArray15;
        boolean boolean18 = fila5.vazia();
        fila5.frente = (byte) -1;
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object[] objArray22 = fila5.item;
        fila5.frente = (short) 100;
        fila5.frente = 101;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.imprime();
        fila0.frente = 2;
        fila0.frente = (byte) 1;
        int int12 = fila0.tras;
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        fila0.tras = 'a';
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila15.item = objArray23;
        fila13.item = objArray23;
        boolean boolean26 = fila13.vazia();
        fila13.imprime();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        fila30.imprime();
        java.lang.Object[] objArray38 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila30.item = objArray38;
        fila28.item = objArray38;
        fila13.item = objArray38;
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (-1L));
        fila43.imprime();
        boolean boolean47 = fila43.vazia();
        int int48 = fila43.tras;
        int int49 = fila43.tras;
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) (-1L));
        fila50.imprime();
        fila50.imprime();
        int int55 = fila50.frente;
        java.lang.Object[] objArray56 = fila50.item;
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) (-1L));
        fila57.imprime();
        java.lang.Object[] objArray65 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila57.item = objArray65;
        ds.Fila fila67 = new ds.Fila();
        java.lang.Object[] objArray68 = fila67.item;
        fila57.item = objArray68;
        fila50.item = objArray68;
        fila43.item = objArray68;
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) (-1L));
        fila72.imprime();
        boolean boolean76 = fila72.vazia();
        java.lang.Object[] objArray77 = fila72.item;
        fila43.item = objArray77;
        fila43.tras = 100;
        java.lang.Object[] objArray81 = fila43.item;
        fila0.enfileira((java.lang.Object) objArray81);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        java.lang.Object[] objArray15 = fila0.item;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.tras = (short) -1;
        int int20 = fila16.frente;
        java.lang.Object obj21 = fila16.desenfileira();
        int int22 = fila16.tras;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) 10.0f);
        int int27 = fila23.tras;
        fila23.frente = ' ';
        java.lang.Object[] objArray30 = fila23.item;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.tras = (short) 0;
        java.lang.Object[] objArray35 = fila31.item;
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (-1L));
        fila36.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila36.item = objArray44;
        ds.Fila fila46 = new ds.Fila();
        java.lang.Object[] objArray47 = fila46.item;
        fila36.item = objArray47;
        java.lang.Object[] objArray49 = fila36.item;
        java.lang.Object[] objArray50 = fila36.item;
        java.lang.Object[] objArray51 = fila36.item;
        fila31.item = objArray51;
        fila23.item = objArray51;
        fila16.item = objArray51;
        fila0.item = objArray51;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.tras;
        int int12 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        fila0.imprime();
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.frente;
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.enfileira((java.lang.Object) 10.0f);
        int int14 = fila10.tras;
        int int15 = fila10.tras;
        java.lang.Object[] objArray16 = fila10.item;
        fila8.item = objArray16;
        fila0.item = objArray16;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila10.item = objArray21;
        java.lang.Object[] objArray23 = fila10.item;
        java.lang.Object[] objArray24 = fila10.item;
        int int25 = fila10.frente;
        java.lang.Object[] objArray26 = fila10.item;
        java.lang.Object[] objArray27 = fila10.item;
        fila0.item = objArray27;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        fila0.enfileira((java.lang.Object) objArray47);
        java.lang.Object[] objArray50 = null;
        fila0.item = objArray50;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj3 = fila0.desenfileira();
        int int4 = fila0.tras;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1L) + "'", obj3, (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (-1L));
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object[] objArray15 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        java.lang.Object[] objArray10 = fila8.item;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100);
        fila11.frente = (short) 0;
        fila8.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        java.lang.Object[] objArray22 = fila17.item;
        fila8.item = objArray22;
        fila0.item = objArray22;
        fila0.imprime();
        java.lang.Object[] objArray26 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0f + "'", obj7, 10.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        java.lang.Object obj16 = fila3.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        fila17.imprime();
        int int22 = fila17.frente;
        java.lang.Object[] objArray23 = fila17.item;
        boolean boolean24 = fila17.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj28 = fila25.desenfileira();
        fila17.enfileira((java.lang.Object) fila25);
        java.lang.Object[] objArray30 = fila25.item;
        fila3.item = objArray30;
        int int32 = fila3.frente;
        int int33 = fila3.tras;
        fila3.frente = 98;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        int int8 = fila0.tras;
        boolean boolean9 = fila0.vazia();
        int int10 = fila0.frente;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.frente = 'a';
        fila0.tras = 0;
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        int int20 = fila13.tras;
        fila13.frente = (byte) 0;
        boolean boolean23 = fila13.vazia();
        int int24 = fila13.frente;
        fila13.imprime();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        java.lang.Object[] objArray28 = fila26.item;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100);
        fila29.frente = (short) 0;
        fila26.enfileira((java.lang.Object) fila29);
        java.lang.Object[] objArray35 = fila26.item;
        fila13.item = objArray35;
        fila0.enfileira((java.lang.Object) objArray35);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (-1L));
        fila38.imprime();
        boolean boolean42 = fila38.vazia();
        boolean boolean43 = fila38.vazia();
        java.lang.Object obj44 = fila38.desenfileira();
        int int45 = fila38.tras;
        fila38.frente = (byte) 0;
        boolean boolean48 = fila38.vazia();
        int int49 = fila38.frente;
        fila38.imprime();
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        java.lang.Object[] objArray53 = fila51.item;
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) 100);
        fila54.frente = (short) 0;
        fila51.enfileira((java.lang.Object) fila54);
        java.lang.Object[] objArray60 = fila51.item;
        fila38.item = objArray60;
        fila0.item = objArray60;
        fila0.frente = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1L) + "'", obj44, (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object obj13 = fila0.desenfileira();
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        int int22 = fila15.tras;
        fila15.frente = (byte) 0;
        boolean boolean25 = fila15.vazia();
        fila15.tras = 'a';
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray29 = fila15.item;
        java.lang.Object obj30 = fila15.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        int int8 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0f + "'", obj7, 10.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        fila0.frente = (byte) 10;
        int int12 = fila0.frente;
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        int int5 = fila0.frente;
        fila0.tras = 33;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        int int17 = fila7.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila7.enfileira((java.lang.Object) objArray19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila21.item = objArray29;
        int int31 = fila21.frente;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila21.enfileira((java.lang.Object) objArray33);
        fila21.enfileira((java.lang.Object) '#');
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        int int40 = fila37.tras;
        java.lang.Object[] objArray41 = fila37.item;
        fila21.item = objArray41;
        fila21.tras = 0;
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Class<?> wildcardClass49 = fila45.getClass();
        fila21.enfileira((java.lang.Object) fila45);
        fila7.enfileira((java.lang.Object) fila45);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.tras = 2;
        fila0.tras = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        java.lang.Object[] objArray22 = fila0.item;
        boolean boolean23 = fila0.vazia();
        int int24 = fila0.tras;
        boolean boolean25 = fila0.vazia();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.tras = (short) -1;
        int int30 = fila26.frente;
        java.lang.Object obj31 = fila26.desenfileira();
        fila0.enfileira(obj31);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100);
        java.lang.Object obj12 = fila9.desenfileira();
        java.lang.Object[] objArray13 = fila9.item;
        fila0.item = objArray13;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        java.lang.Object obj24 = fila21.desenfileira();
        fila13.enfileira((java.lang.Object) fila21);
        fila13.tras = ' ';
        int int28 = fila13.tras;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        int int39 = fila29.frente;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila29.enfileira((java.lang.Object) objArray41);
        fila29.enfileira((java.lang.Object) '#');
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Object[] objArray49 = fila45.item;
        fila29.item = objArray49;
        fila13.item = objArray49;
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (-1L));
        fila52.imprime();
        java.lang.Object[] objArray60 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila52.item = objArray60;
        fila13.enfileira((java.lang.Object) objArray60);
        fila3.item = objArray60;
        int int64 = fila3.frente;
        java.lang.Object obj65 = fila3.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100 + "'", obj24, 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '#' + "'", obj65, '#');
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        fila3.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        fila11.item = objArray21;
        java.lang.Object[] objArray24 = fila11.item;
        fila3.enfileira((java.lang.Object) objArray24);
        int int26 = fila3.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        int int5 = fila0.frente;
        fila0.frente = 0;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.tras;
        int int15 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        fila0.tras = 'a';
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila15.item = objArray23;
        fila13.item = objArray23;
        boolean boolean26 = fila13.vazia();
        fila13.imprime();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        fila30.imprime();
        java.lang.Object[] objArray38 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila30.item = objArray38;
        fila28.item = objArray38;
        fila13.item = objArray38;
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object[] objArray44 = fila43.item;
        java.lang.Object[] objArray45 = fila43.item;
        fila13.item = objArray45;
        fila13.imprime();
        fila13.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100 + "'", obj3, 100);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        fila0.frente = (short) 1;
        java.lang.Object obj26 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (-1L));
        fila5.imprime();
        java.lang.Object[] objArray13 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila5.item = objArray13;
        int int15 = fila5.frente;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila5.enfileira((java.lang.Object) objArray17);
        fila5.enfileira((java.lang.Object) '#');
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        int int24 = fila21.tras;
        java.lang.Object[] objArray25 = fila21.item;
        fila5.item = objArray25;
        fila0.enfileira((java.lang.Object) objArray25);
        java.lang.Object[] objArray28 = fila0.item;
        int int29 = fila0.tras;
        int int30 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        int int14 = fila9.tras;
        fila9.tras = (byte) 100;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100);
        java.lang.Object obj20 = fila17.desenfileira();
        fila9.enfileira((java.lang.Object) fila17);
        fila9.tras = ' ';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.frente = (byte) 100;
        fila9.frente = (byte) 10;
        fila9.frente = 97;
        java.lang.Object[] objArray31 = fila9.item;
        java.lang.Object obj32 = fila9.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        fila0.imprime();
        fila0.tras = 33;
        fila0.frente = (short) 0;
        fila0.tras = (byte) 1;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        java.lang.Object[] objArray16 = fila14.item;
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        java.lang.Object[] objArray19 = fila14.item;
        fila0.item = objArray19;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        int int27 = fila24.tras;
        java.lang.Class<?> wildcardClass28 = fila24.getClass();
        fila0.enfileira((java.lang.Object) fila24);
        int int30 = fila0.frente;
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila31.item = objArray42;
        java.lang.Object[] objArray44 = fila31.item;
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        fila45.imprime();
        boolean boolean49 = fila45.vazia();
        java.lang.Object obj50 = null;
        fila45.enfileira(obj50);
        int int52 = fila45.frente;
        boolean boolean53 = fila45.vazia();
        int int54 = fila45.frente;
        fila31.enfileira((java.lang.Object) fila45);
        int int56 = fila31.tras;
        fila0.enfileira((java.lang.Object) fila31);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.tras = 10;
        int int5 = fila0.tras;
        fila0.tras = 0;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        java.lang.Object[] objArray21 = fila19.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        fila22.frente = (short) 0;
        fila19.enfileira((java.lang.Object) fila22);
        fila15.enfileira((java.lang.Object) fila22);
        fila15.frente = 33;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) 10.0f);
        int int9 = fila5.tras;
        int int10 = fila5.tras;
        fila5.tras = (byte) 100;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100);
        java.lang.Object obj16 = fila13.desenfileira();
        fila5.enfileira((java.lang.Object) fila13);
        fila5.tras = ' ';
        int int20 = fila5.tras;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.tras = (short) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila5.item = objArray25;
        fila0.item = objArray25;
        java.lang.Object obj28 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.tras = 2;
        java.lang.Object obj20 = fila15.desenfileira();
        fila15.frente = (short) 100;
        boolean boolean23 = fila15.vazia();
        fila15.tras = ' ';
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila20.item = objArray31;
        java.lang.Object[] objArray33 = fila20.item;
        java.lang.Object[] objArray34 = fila20.item;
        int int35 = fila20.frente;
        fila15.enfileira((java.lang.Object) fila20);
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.enfileira((java.lang.Object) 10.0f);
        int int41 = fila37.tras;
        int int42 = fila37.tras;
        fila37.tras = (byte) 100;
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 100);
        java.lang.Object obj48 = fila45.desenfileira();
        fila37.enfileira((java.lang.Object) fila45);
        fila37.tras = ' ';
        int int52 = fila37.tras;
        int int53 = fila37.frente;
        boolean boolean54 = fila37.vazia();
        fila15.enfileira((java.lang.Object) fila37);
        int int56 = fila37.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100 + "'", obj48, 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 32 + "'", int56 == 32);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        java.lang.Object[] objArray21 = fila19.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        fila22.frente = (short) 0;
        fila19.enfileira((java.lang.Object) fila22);
        fila15.enfileira((java.lang.Object) fila22);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila29.item = objArray40;
        int int42 = fila29.tras;
        int int43 = fila29.frente;
        java.lang.Object[] objArray44 = fila29.item;
        fila15.enfileira((java.lang.Object) objArray44);
        java.lang.Object obj46 = fila15.desenfileira();
        int int47 = fila15.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        fila7.imprime();
        int int12 = fila7.frente;
        java.lang.Object[] objArray13 = fila7.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila14.item = objArray22;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila14.item = objArray25;
        fila7.item = objArray25;
        fila0.item = objArray25;
        fila0.tras = (-1);
        boolean boolean31 = fila0.vazia();
        fila0.tras = 0;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        fila0.enfileira((java.lang.Object) objArray47);
        int int50 = fila0.tras;
        boolean boolean51 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 33 + "'", int50 == 33);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.enfileira((java.lang.Object) 10.0f);
        int int6 = fila2.tras;
        int int7 = fila2.tras;
        java.lang.Object[] objArray8 = fila2.item;
        fila0.item = objArray8;
        fila0.frente = (byte) 10;
        int int12 = fila0.frente;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        int int23 = fila13.frente;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila13.enfileira((java.lang.Object) objArray25);
        fila13.enfileira((java.lang.Object) '#');
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        int int32 = fila29.tras;
        java.lang.Object[] objArray33 = fila29.item;
        fila13.item = objArray33;
        java.lang.Object[] objArray35 = fila13.item;
        boolean boolean36 = fila13.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.frente = (byte) 1;
        java.lang.Object[] objArray40 = fila37.item;
        fila13.item = objArray40;
        fila0.item = objArray40;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.frente = (byte) 1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean9 = fila3.vazia();
        fila3.frente = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        int int24 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = ' ';
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        fila8.imprime();
        java.lang.Object[] objArray16 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila8.item = objArray16;
        int int18 = fila8.frente;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila8.enfileira((java.lang.Object) objArray20);
        fila8.enfileira((java.lang.Object) '#');
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        int int27 = fila24.tras;
        java.lang.Object[] objArray28 = fila24.item;
        fila8.item = objArray28;
        fila8.frente = 0;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        fila32.imprime();
        boolean boolean36 = fila32.vazia();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila8.item = objArray39;
        fila0.enfileira((java.lang.Object) objArray39);
        boolean boolean42 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.frente;
        fila0.tras = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.imprime();
        fila0.tras = 1;
        int int20 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        int int5 = fila0.frente;
        fila0.imprime();
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        fila0.tras = 'a';
        boolean boolean10 = fila0.vazia();
        fila0.frente = (short) 1;
        java.lang.Object[] objArray13 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        fila0.frente = 10;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1L) + "'", obj5, (-1L));
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.imprime();
        int int7 = fila0.frente;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.frente = (short) 10;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}

