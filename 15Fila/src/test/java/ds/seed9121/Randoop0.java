package ds.seed9121;

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
        java.lang.Class<?> wildcardClass1 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        java.lang.Class<?> wildcardClass9 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 100;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object[] objArray12 = fila9.item;
        fila5.item = objArray12;
        fila0.item = objArray12;
        int int15 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 100;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object[] objArray12 = fila9.item;
        fila5.item = objArray12;
        fila0.item = objArray12;
        java.lang.Class<?> wildcardClass15 = objArray12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 100;
        fila9.tras = (short) 1;
        int int15 = fila9.frente;
        fila9.frente = (-1);
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.tras = (short) 10;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        java.lang.Object[] objArray24 = fila22.item;
        java.lang.Object[] objArray25 = fila22.item;
        fila18.item = objArray25;
        fila9.enfileira((java.lang.Object) objArray25);
        ds.Fila fila28 = new ds.Fila();
        fila28.frente = 0;
        java.lang.Object[] objArray31 = fila28.item;
        fila9.item = objArray31;
        fila0.item = objArray31;
        fila0.frente = (short) 10;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object obj10 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = obj10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        java.lang.Object obj4 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila9.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.frente = (-1);
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.enfileira((java.lang.Object) (byte) -1);
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila8.item;
        fila0.item = objArray14;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        int int10 = fila7.frente;
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 0, obj12, (byte) 100 };
        fila7.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.tras = (short) 10;
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 100;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        java.lang.Object[] objArray27 = fila25.item;
        java.lang.Object[] objArray28 = fila25.item;
        fila21.item = objArray28;
        fila16.item = objArray28;
        fila7.enfileira((java.lang.Object) objArray28);
        fila0.item = objArray28;
        java.lang.Object obj33 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.frente;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        java.lang.Object obj20 = fila16.desenfileira();
        int int21 = fila16.frente;
        ds.Fila fila22 = new ds.Fila();
        fila22.frente = 0;
        int int25 = fila22.frente;
        java.lang.Object[] objArray26 = fila22.item;
        fila16.item = objArray26;
        fila0.enfileira((java.lang.Object) objArray26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        java.lang.Object[] objArray14 = fila12.item;
        fila8.item = objArray14;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass16 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 100;
        fila10.tras = (short) 1;
        int int16 = fila10.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        java.lang.Object[] objArray20 = fila17.item;
        fila10.enfileira((java.lang.Object) fila17);
        fila10.frente = '#';
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        java.lang.Object[] objArray27 = fila25.item;
        boolean boolean28 = fila25.vazia();
        fila10.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        fila0.frente = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        fila0.tras = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        fila6.tras = ' ';
        int int18 = fila6.frente;
        int int19 = fila6.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        java.lang.Object[] objArray10 = fila7.item;
        fila7.frente = 'a';
        fila7.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 100;
        java.lang.Object obj19 = fila15.desenfileira();
        int int20 = fila15.frente;
        fila7.enfileira((java.lang.Object) fila15);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 100;
        java.lang.Object obj9 = fila5.desenfileira();
        java.lang.Object[] objArray10 = fila5.item;
        java.lang.Object[] objArray11 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray11);
        fila0.frente = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray23 = fila19.item;
        fila0.item = objArray23;
        int int25 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        java.lang.Object obj13 = fila9.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 100;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        java.lang.Object[] objArray21 = fila18.item;
        fila14.item = objArray21;
        fila9.item = objArray21;
        fila0.enfileira((java.lang.Object) objArray21);
        fila0.frente = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        int int18 = fila13.frente;
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        fila0.frente = (byte) 0;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        fila0.item = objArray25;
        java.lang.Object[] objArray27 = fila0.item;
        java.lang.Class<?> wildcardClass28 = objArray27.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.tras = (-1);
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = fila11.item;
        fila0.item = objArray15;
        fila0.tras = (-1);
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.tras = (short) 10;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        java.lang.Object[] objArray10 = fila7.item;
        fila3.item = objArray10;
        fila3.tras = (-1);
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        fila3.item = objArray18;
        fila3.frente = ' ';
        java.lang.Object[] objArray22 = fila3.item;
        fila0.item = objArray22;
        java.lang.Class<?> wildcardClass24 = objArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        fila6.tras = ' ';
        java.lang.Object[] objArray18 = fila6.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        fila0.frente = '4';
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = 0;
        java.lang.Object[] objArray26 = fila23.item;
        fila0.enfileira((java.lang.Object) fila23);
        fila0.frente = '4';
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.frente;
        fila0.frente = 0;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = 0;
        java.lang.Object[] objArray19 = fila16.item;
        fila9.item = objArray19;
        java.lang.Class<?> wildcardClass21 = objArray19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.frente = (-1);
        int int8 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        fila0.tras = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 100;
        java.lang.Object obj9 = fila5.desenfileira();
        java.lang.Object[] objArray10 = fila5.item;
        java.lang.Object[] objArray11 = fila5.item;
        fila5.tras = 1;
        java.lang.Object[] objArray14 = fila5.item;
        fila0.item = objArray14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.tras = (-1);
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = fila11.item;
        fila0.item = objArray15;
        fila0.frente = ' ';
        java.lang.Object[] objArray19 = fila0.item;
        java.lang.Class<?> wildcardClass20 = objArray19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 100;
        java.lang.Object obj11 = fila7.desenfileira();
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object[] objArray13 = fila7.item;
        fila7.tras = 1;
        boolean boolean16 = fila7.vazia();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray21 = fila17.item;
        boolean boolean22 = fila17.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        java.lang.Object[] objArray28 = fila23.item;
        fila17.item = objArray28;
        fila7.item = objArray28;
        fila0.item = objArray28;
        java.lang.Object obj32 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = 0;
        java.lang.Object[] objArray22 = fila19.item;
        fila0.item = objArray22;
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 0, obj15, (byte) 100 };
        fila10.item = objArray17;
        int int19 = fila10.tras;
        boolean boolean20 = fila10.vazia();
        fila0.enfileira((java.lang.Object) fila10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        java.lang.Object[] objArray22 = fila20.item;
        fila16.item = objArray22;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.frente = (short) 100;
        java.lang.Object obj28 = fila24.desenfileira();
        java.lang.Object[] objArray29 = fila24.item;
        java.lang.Object[] objArray30 = fila24.item;
        fila16.enfileira((java.lang.Object) fila24);
        java.lang.Object[] objArray32 = fila16.item;
        fila0.item = objArray32;
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = 0;
        java.lang.Object[] objArray22 = fila19.item;
        fila0.item = objArray22;
        int int24 = fila0.tras;
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        int int21 = fila0.tras;
        boolean boolean22 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 100;
        fila9.tras = (short) 1;
        int int15 = fila9.frente;
        fila9.frente = (-1);
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.tras = (short) 10;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        java.lang.Object[] objArray24 = fila22.item;
        java.lang.Object[] objArray25 = fila22.item;
        fila18.item = objArray25;
        fila9.enfileira((java.lang.Object) objArray25);
        ds.Fila fila28 = new ds.Fila();
        fila28.frente = 0;
        java.lang.Object[] objArray31 = fila28.item;
        fila9.item = objArray31;
        fila0.item = objArray31;
        fila0.frente = (short) 10;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj16 = fila0.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.frente = (short) 100;
        java.lang.Object obj21 = fila17.desenfileira();
        java.lang.Object[] objArray22 = fila17.item;
        java.lang.Object[] objArray23 = fila17.item;
        fila17.tras = 1;
        boolean boolean26 = fila17.vazia();
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray31 = fila27.item;
        boolean boolean32 = fila27.vazia();
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        fila33.frente = (short) 100;
        java.lang.Object obj37 = fila33.desenfileira();
        java.lang.Object[] objArray38 = fila33.item;
        fila27.item = objArray38;
        fila17.item = objArray38;
        fila0.item = objArray38;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila4.vazia();
        fila4.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass16 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        int int13 = fila8.frente;
        fila0.enfileira((java.lang.Object) fila8);
        fila0.frente = '#';
        fila0.tras = (byte) 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        java.lang.Object[] objArray8 = fila0.item;
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        fila0.frente = 101;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila8.tras = 1;
        fila8.tras = (byte) 1;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = 0;
        int int23 = fila0.tras;
        int int24 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila9.tras = '4';
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        java.lang.Object obj23 = fila19.desenfileira();
        java.lang.Object[] objArray24 = fila19.item;
        java.lang.Object[] objArray25 = fila19.item;
        fila19.tras = 1;
        boolean boolean28 = fila19.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.frente = 0;
        int int32 = fila29.frente;
        java.lang.Object[] objArray33 = fila29.item;
        fila19.enfileira((java.lang.Object) fila29);
        java.lang.Object[] objArray35 = fila19.item;
        fila0.enfileira((java.lang.Object) objArray35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.frente = (-1);
        fila0.frente = ' ';
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 97;
        int int3 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        int int11 = fila0.frente;
        fila0.frente = (short) 10;
        ds.Fila fila14 = new ds.Fila();
        fila14.frente = 0;
        java.lang.Object[] objArray17 = fila14.item;
        fila14.tras = (short) 1;
        fila14.frente = 0;
        java.lang.Object[] objArray22 = fila14.item;
        fila0.item = objArray22;
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean16 = fila0.vazia();
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        fila0.tras = (byte) -1;
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        java.lang.Object[] objArray10 = fila7.item;
        fila7.frente = 'a';
        fila7.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 100;
        java.lang.Object obj19 = fila15.desenfileira();
        int int20 = fila15.frente;
        fila7.enfileira((java.lang.Object) fila15);
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 100;
        java.lang.Object obj26 = fila22.desenfileira();
        java.lang.Object[] objArray27 = fila22.item;
        java.lang.Object[] objArray28 = fila22.item;
        fila22.tras = 1;
        java.lang.Object[] objArray31 = fila22.item;
        java.lang.Object obj32 = fila22.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        fila33.frente = (short) 100;
        java.lang.Object obj37 = fila33.desenfileira();
        java.lang.Object[] objArray38 = fila33.item;
        java.lang.Object[] objArray39 = fila33.item;
        fila33.tras = 1;
        fila33.tras = (byte) 1;
        java.lang.Object[] objArray44 = fila33.item;
        ds.Fila fila45 = new ds.Fila();
        int int46 = fila45.tras;
        fila45.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray49 = fila45.item;
        boolean boolean50 = fila45.vazia();
        ds.Fila fila51 = new ds.Fila();
        int int52 = fila51.tras;
        fila51.frente = (short) 100;
        java.lang.Object obj55 = fila51.desenfileira();
        java.lang.Object[] objArray56 = fila51.item;
        fila45.item = objArray56;
        ds.Fila fila58 = new ds.Fila();
        int int59 = fila58.tras;
        fila58.frente = (short) 100;
        java.lang.Object obj62 = fila58.desenfileira();
        int int63 = fila58.frente;
        boolean boolean64 = fila58.vazia();
        fila45.enfileira((java.lang.Object) boolean64);
        fila45.frente = (byte) 0;
        ds.Fila fila68 = new ds.Fila();
        int int69 = fila68.tras;
        java.lang.Object[] objArray70 = fila68.item;
        fila45.item = objArray70;
        ds.Fila fila72 = new ds.Fila();
        int int73 = fila72.tras;
        fila72.frente = (short) 100;
        java.lang.Object obj76 = fila72.desenfileira();
        int int77 = fila72.frente;
        ds.Fila fila78 = new ds.Fila();
        fila78.frente = 0;
        int int81 = fila78.frente;
        java.lang.Object[] objArray82 = fila78.item;
        fila72.item = objArray82;
        int int84 = fila72.frente;
        java.lang.Object[] objArray85 = fila72.item;
        fila45.item = objArray85;
        fila33.item = objArray85;
        fila22.item = objArray85;
        fila15.item = objArray85;
        fila0.item = objArray85;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 101 + "'", int63 == 101);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 101 + "'", int77 == 101);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 101 + "'", int84 == 101);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.tras;
        fila0.tras = (byte) 0;
        fila0.tras = 2;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        java.lang.Object[] objArray12 = fila6.item;
        fila6.tras = 1;
        java.lang.Object[] objArray15 = fila6.item;
        fila0.item = objArray15;
        fila0.frente = 0;
        fila0.frente = 101;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 100;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        int int11 = fila0.frente;
        fila0.frente = (short) 10;
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = 0;
        java.lang.Object[] objArray22 = fila19.item;
        fila0.item = objArray22;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.frente = (short) 100;
        boolean boolean28 = fila24.vazia();
        int int29 = fila24.tras;
        java.lang.Object[] objArray30 = null;
        fila24.item = objArray30;
        fila0.enfileira((java.lang.Object) fila24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        fila0.tras = ' ';
        java.lang.Object[] objArray19 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        java.lang.Object obj13 = fila9.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 100;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        java.lang.Object[] objArray21 = fila18.item;
        fila14.item = objArray21;
        fila9.item = objArray21;
        fila0.enfileira((java.lang.Object) objArray21);
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        int int16 = fila8.frente;
        boolean boolean17 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray16 = fila0.item;
        int int17 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean16 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        fila0.frente = '4';
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = 0;
        java.lang.Object[] objArray26 = fila23.item;
        fila0.enfileira((java.lang.Object) fila23);
        fila23.tras = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = fila23.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        int int11 = fila0.frente;
        boolean boolean12 = fila0.vazia();
        int int13 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 100;
        fila9.tras = (short) 1;
        int int15 = fila9.frente;
        fila9.frente = (-1);
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.tras = (short) 10;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        java.lang.Object[] objArray24 = fila22.item;
        java.lang.Object[] objArray25 = fila22.item;
        fila18.item = objArray25;
        fila9.enfileira((java.lang.Object) objArray25);
        ds.Fila fila28 = new ds.Fila();
        fila28.frente = 0;
        java.lang.Object[] objArray31 = fila28.item;
        fila9.item = objArray31;
        fila0.item = objArray31;
        int int34 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        int int7 = fila0.frente;
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 100;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        fila9.item = objArray15;
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = 0;
        java.lang.Object[] objArray21 = fila18.item;
        fila18.frente = 'a';
        fila18.tras = '4';
        java.lang.Object[] objArray26 = fila18.item;
        fila9.item = objArray26;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 100;
        int int32 = fila28.frente;
        int int33 = fila28.frente;
        fila9.enfileira((java.lang.Object) fila28);
        int int35 = fila9.tras;
        fila0.enfileira((java.lang.Object) int35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila0.vazia();
        fila0.frente = '4';
        fila0.tras = '#';
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        int int10 = fila7.frente;
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 0, obj12, (byte) 100 };
        fila7.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.tras = (short) 10;
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 100;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        java.lang.Object[] objArray27 = fila25.item;
        java.lang.Object[] objArray28 = fila25.item;
        fila21.item = objArray28;
        fila16.item = objArray28;
        fila7.enfileira((java.lang.Object) objArray28);
        fila0.item = objArray28;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        fila33.frente = (short) 100;
        boolean boolean37 = fila33.vazia();
        fila33.tras = 1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 100;
        fila18.tras = (short) 1;
        int int24 = fila18.frente;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        java.lang.Object[] objArray27 = fila25.item;
        java.lang.Object[] objArray28 = fila25.item;
        fila18.enfileira((java.lang.Object) fila25);
        fila18.tras = (short) 100;
        java.lang.Object[] objArray32 = fila18.item;
        fila0.item = objArray32;
        int int34 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 100;
        fila10.tras = (short) 1;
        int int16 = fila10.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        java.lang.Object[] objArray20 = fila17.item;
        fila10.enfileira((java.lang.Object) fila17);
        fila10.frente = '#';
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 100;
        java.lang.Object obj16 = fila12.desenfileira();
        java.lang.Object[] objArray17 = fila12.item;
        java.lang.Object[] objArray18 = fila12.item;
        fila12.tras = 1;
        boolean boolean21 = fila12.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.frente = 0;
        int int25 = fila22.frente;
        java.lang.Object[] objArray26 = fila22.item;
        fila12.enfileira((java.lang.Object) fila22);
        java.lang.Object[] objArray28 = fila12.item;
        fila12.tras = 'a';
        fila0.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        fila0.frente = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Object obj18 = fila0.desenfileira();
        fila0.tras = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 100;
        fila10.tras = (short) 1;
        int int16 = fila10.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        java.lang.Object[] objArray20 = fila17.item;
        fila10.enfileira((java.lang.Object) fila17);
        fila10.frente = '#';
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean25 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray13 = fila9.item;
        boolean boolean14 = fila9.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 100;
        java.lang.Object obj19 = fila15.desenfileira();
        java.lang.Object[] objArray20 = fila15.item;
        fila9.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 100;
        java.lang.Object obj26 = fila22.desenfileira();
        int int27 = fila22.frente;
        boolean boolean28 = fila22.vazia();
        fila9.enfileira((java.lang.Object) boolean28);
        fila9.frente = (byte) 0;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        fila9.item = objArray34;
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.tras;
        fila36.frente = (short) 100;
        java.lang.Object obj40 = fila36.desenfileira();
        int int41 = fila36.frente;
        ds.Fila fila42 = new ds.Fila();
        fila42.frente = 0;
        int int45 = fila42.frente;
        java.lang.Object[] objArray46 = fila42.item;
        fila36.item = objArray46;
        int int48 = fila36.frente;
        java.lang.Object[] objArray49 = fila36.item;
        fila9.item = objArray49;
        fila0.item = objArray49;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 101 + "'", int48 == 101);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        java.lang.Object[] objArray12 = fila6.item;
        fila6.tras = 1;
        java.lang.Object[] objArray15 = fila6.item;
        fila0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        fila0.tras = 1;
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        boolean boolean9 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila0.vazia();
        fila0.tras = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila4.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.tras = (short) 10;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila7.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        fila16.tras = (short) 1;
        int int22 = fila16.frente;
        fila16.frente = (-1);
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.tras = (short) 10;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        java.lang.Object[] objArray32 = fila29.item;
        fila25.item = objArray32;
        fila16.enfileira((java.lang.Object) objArray32);
        ds.Fila fila35 = new ds.Fila();
        fila35.frente = 0;
        java.lang.Object[] objArray38 = fila35.item;
        fila16.item = objArray38;
        fila7.item = objArray38;
        fila7.frente = (short) 10;
        fila4.enfileira((java.lang.Object) (short) 10);
        int int44 = fila4.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        java.lang.Class<?> wildcardClass19 = objArray16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        fila0.tras = 101;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray10 = fila6.item;
        int int11 = fila6.frente;
        fila6.frente = 101;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 100;
        java.lang.Object obj18 = fila14.desenfileira();
        java.lang.Object[] objArray19 = fila14.item;
        java.lang.Object[] objArray20 = fila14.item;
        fila14.tras = 1;
        fila14.tras = (byte) 1;
        java.lang.Object[] objArray25 = fila14.item;
        fila6.enfileira((java.lang.Object) fila14);
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 100;
        java.lang.Object obj31 = fila27.desenfileira();
        java.lang.Object[] objArray32 = fila27.item;
        java.lang.Object[] objArray33 = fila27.item;
        fila6.item = objArray33;
        fila0.item = objArray33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = 0;
        java.lang.Object[] objArray19 = fila16.item;
        fila16.frente = 'a';
        fila16.tras = '4';
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.frente = (short) 100;
        java.lang.Object obj28 = fila24.desenfileira();
        int int29 = fila24.frente;
        fila16.enfileira((java.lang.Object) fila24);
        fila10.enfileira((java.lang.Object) fila24);
        fila10.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        java.lang.Object[] objArray22 = fila20.item;
        fila16.item = objArray22;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.frente = (short) 100;
        java.lang.Object obj28 = fila24.desenfileira();
        java.lang.Object[] objArray29 = fila24.item;
        java.lang.Object[] objArray30 = fila24.item;
        fila16.enfileira((java.lang.Object) fila24);
        java.lang.Object[] objArray32 = fila16.item;
        fila0.item = objArray32;
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        fila34.frente = (short) 100;
        int int38 = fila34.tras;
        boolean boolean39 = fila34.vazia();
        int int40 = fila34.frente;
        fila0.enfileira((java.lang.Object) fila34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        java.lang.Object[] objArray10 = fila7.item;
        ds.Fila fila11 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila11);
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.frente = (byte) -1;
        java.lang.Object[] objArray17 = fila7.item;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = 0;
        java.lang.Object[] objArray22 = fila19.item;
        fila19.frente = 'a';
        fila19.frente = (-1);
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila9.tras = '4';
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        int int23 = fila19.frente;
        int int24 = fila19.frente;
        fila0.enfileira((java.lang.Object) fila19);
        int int26 = fila0.tras;
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        int int6 = fila4.frente;
        java.lang.Class<?> wildcardClass7 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = 0;
        java.lang.Object[] objArray19 = fila16.item;
        fila9.item = objArray19;
        java.lang.Class<?> wildcardClass21 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        int int10 = fila6.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila6.enfileira((java.lang.Object) objArray14);
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        fila0.enfileira((java.lang.Object) objArray14);
        fila0.frente = '#';
        fila0.tras = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        int int3 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        boolean boolean9 = fila7.vazia();
        fila7.tras = 1;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 100;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        java.lang.Object[] objArray18 = fila16.item;
        fila12.item = objArray18;
        boolean boolean20 = fila12.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.frente = 0;
        java.lang.Object[] objArray24 = fila21.item;
        fila21.frente = 'a';
        fila21.tras = '4';
        java.lang.Object[] objArray29 = fila21.item;
        fila12.item = objArray29;
        fila7.item = objArray29;
        fila0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        boolean boolean2 = fila0.vazia();
        fila0.tras = 1;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = (short) 10;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object[] objArray12 = fila9.item;
        fila5.item = objArray12;
        fila5.tras = (-1);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray20 = fila16.item;
        fila5.item = objArray20;
        fila5.tras = (-1);
        fila0.enfileira((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.tras = (short) 100;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 100;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        java.lang.Object[] objArray17 = fila15.item;
        java.lang.Object[] objArray18 = fila15.item;
        fila11.item = objArray18;
        ds.Fila fila20 = new ds.Fila();
        fila20.frente = 0;
        java.lang.Object[] objArray23 = fila20.item;
        fila20.frente = 'a';
        fila11.enfileira((java.lang.Object) fila20);
        fila20.frente = 100;
        java.lang.Class<?> wildcardClass29 = fila20.getClass();
        fila9.enfileira((java.lang.Object) wildcardClass29);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = 0;
        java.lang.Object[] objArray19 = fila16.item;
        fila9.item = objArray19;
        fila9.enfileira((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass23 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.tras = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        int int10 = fila6.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila6.enfileira((java.lang.Object) objArray14);
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        fila0.enfileira((java.lang.Object) objArray14);
        fila0.frente = (short) 100;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.frente = (short) 100;
        int int24 = fila20.tras;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 100;
        java.lang.Object obj29 = fila25.desenfileira();
        java.lang.Object[] objArray30 = fila25.item;
        java.lang.Object[] objArray31 = fila25.item;
        fila20.enfileira((java.lang.Object) objArray31);
        fila0.item = objArray31;
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        fila0.frente = 101;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 100;
        fila10.tras = (short) 1;
        int int16 = fila10.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        java.lang.Object[] objArray20 = fila17.item;
        fila10.enfileira((java.lang.Object) fila17);
        fila10.frente = '#';
        fila0.enfileira((java.lang.Object) fila10);
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 97;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray7 = fila3.item;
        boolean boolean8 = fila3.vazia();
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 100;
        java.lang.Object obj13 = fila9.desenfileira();
        java.lang.Object[] objArray14 = fila9.item;
        fila3.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        java.lang.Object obj20 = fila16.desenfileira();
        int int21 = fila16.frente;
        boolean boolean22 = fila16.vazia();
        fila3.enfileira((java.lang.Object) boolean22);
        fila3.frente = (byte) 0;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        fila3.item = objArray28;
        fila0.enfileira((java.lang.Object) objArray28);
        fila0.frente = 1;
        java.lang.Class<?> wildcardClass33 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object[] objArray16 = fila0.item;
        fila0.tras = 'a';
        int int19 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 100;
        java.lang.Object obj9 = fila5.desenfileira();
        java.lang.Object[] objArray10 = fila5.item;
        java.lang.Object[] objArray11 = fila5.item;
        fila5.tras = 1;
        boolean boolean14 = fila5.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = 0;
        int int18 = fila15.frente;
        java.lang.Object[] objArray19 = fila15.item;
        fila5.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 100;
        int int25 = fila21.tras;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        fila26.frente = (short) 100;
        java.lang.Object obj30 = fila26.desenfileira();
        java.lang.Object[] objArray31 = fila26.item;
        java.lang.Object[] objArray32 = fila26.item;
        fila21.enfileira((java.lang.Object) objArray32);
        fila15.enfileira((java.lang.Object) objArray32);
        fila0.enfileira((java.lang.Object) objArray32);
        fila0.frente = (short) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        int int10 = fila0.tras;
        fila0.tras = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        java.lang.Object[] objArray10 = fila7.item;
        fila0.enfileira((java.lang.Object) fila7);
        fila0.frente = '#';
        fila0.tras = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        int int6 = fila4.frente;
        fila4.frente = 52;
        fila4.frente = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        int int4 = fila0.frente;
        fila0.imprime();
        fila0.tras = 97;
        fila0.frente = (byte) 10;
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.enfileira((java.lang.Object) (byte) 100);
        fila0.tras = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object[] objArray10 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        int int10 = fila6.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila6.enfileira((java.lang.Object) objArray14);
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        fila0.enfileira((java.lang.Object) objArray14);
        java.lang.Object obj18 = fila0.desenfileira();
        int int19 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.frente = (-1);
        fila0.frente = ' ';
        fila0.frente = (short) 1;
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        fila0.frente = (short) 0;
        fila0.imprime();
        int int12 = fila0.frente;
        java.lang.Object[] objArray13 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        int int18 = fila13.frente;
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        fila0.frente = (byte) 0;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        fila0.item = objArray25;
        java.lang.Object[] objArray27 = fila0.item;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 100;
        fila28.tras = (short) 1;
        int int34 = fila28.frente;
        fila28.frente = (-1);
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.tras;
        fila37.tras = (short) 10;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        java.lang.Object[] objArray43 = fila41.item;
        java.lang.Object[] objArray44 = fila41.item;
        fila37.item = objArray44;
        fila28.enfileira((java.lang.Object) objArray44);
        fila28.tras = 1;
        fila28.frente = '4';
        ds.Fila fila51 = new ds.Fila();
        int int52 = fila51.tras;
        fila51.frente = (short) 100;
        java.lang.Object obj55 = fila51.desenfileira();
        java.lang.Object[] objArray56 = fila51.item;
        java.lang.Object[] objArray57 = fila51.item;
        fila51.tras = 1;
        java.lang.Object[] objArray60 = fila51.item;
        fila28.item = objArray60;
        fila0.item = objArray60;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        fila6.frente = (short) -1;
        boolean boolean18 = fila6.vazia();
        int int19 = fila6.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila6.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        fila0.tras = 10;
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.frente = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 97;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray7 = fila3.item;
        boolean boolean8 = fila3.vazia();
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 100;
        java.lang.Object obj13 = fila9.desenfileira();
        java.lang.Object[] objArray14 = fila9.item;
        fila3.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        java.lang.Object obj20 = fila16.desenfileira();
        int int21 = fila16.frente;
        boolean boolean22 = fila16.vazia();
        fila3.enfileira((java.lang.Object) boolean22);
        fila3.frente = (byte) 0;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        fila3.item = objArray28;
        fila0.enfileira((java.lang.Object) objArray28);
        fila0.tras = 32;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.frente = (short) 0;
        int int7 = fila0.tras;
        fila0.tras = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.frente = (byte) 0;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.enfileira((java.lang.Object) (byte) -1);
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila8.item;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        java.lang.Object[] objArray17 = fila15.item;
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        fila15.enfileira((java.lang.Object) fila19);
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.frente = (byte) -1;
        java.lang.Object[] objArray25 = fila15.item;
        fila8.item = objArray25;
        fila0.item = objArray25;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray16 = fila12.item;
        boolean boolean17 = fila12.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 100;
        java.lang.Object obj22 = fila18.desenfileira();
        java.lang.Object[] objArray23 = fila18.item;
        fila12.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 100;
        java.lang.Object obj29 = fila25.desenfileira();
        int int30 = fila25.frente;
        boolean boolean31 = fila25.vazia();
        fila12.enfileira((java.lang.Object) boolean31);
        fila12.frente = (byte) 0;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.tras;
        java.lang.Object[] objArray37 = fila35.item;
        fila12.item = objArray37;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 100;
        java.lang.Object obj43 = fila39.desenfileira();
        int int44 = fila39.frente;
        ds.Fila fila45 = new ds.Fila();
        fila45.frente = 0;
        int int48 = fila45.frente;
        java.lang.Object[] objArray49 = fila45.item;
        fila39.item = objArray49;
        int int51 = fila39.frente;
        java.lang.Object[] objArray52 = fila39.item;
        fila12.item = objArray52;
        fila0.item = objArray52;
        java.lang.Object obj55 = fila0.desenfileira();
        int int56 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        java.lang.Object obj13 = fila9.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 100;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        java.lang.Object[] objArray21 = fila18.item;
        fila14.item = objArray21;
        fila9.item = objArray21;
        fila0.enfileira((java.lang.Object) objArray21);
        int int25 = fila0.frente;
        boolean boolean26 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        fila0.frente = '4';
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        java.lang.Object[] objArray28 = fila23.item;
        java.lang.Object[] objArray29 = fila23.item;
        fila23.tras = 1;
        java.lang.Object[] objArray32 = fila23.item;
        fila0.item = objArray32;
        fila0.tras = 102;
        java.lang.Class<?> wildcardClass36 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        fila0.frente = 0;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 100;
        java.lang.Object obj22 = fila18.desenfileira();
        int int23 = fila18.frente;
        boolean boolean24 = fila18.vazia();
        java.lang.Object[] objArray25 = fila18.item;
        fila0.item = objArray25;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = 0;
        java.lang.Object[] objArray19 = fila16.item;
        fila9.item = objArray19;
        fila9.enfileira((java.lang.Object) (short) 0);
        java.lang.Object obj23 = fila9.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray23 = fila19.item;
        fila0.item = objArray23;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        fila6.tras = (short) 1;
        int int12 = fila6.frente;
        fila6.frente = (-1);
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.tras = (short) 10;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        java.lang.Object[] objArray21 = fila19.item;
        java.lang.Object[] objArray22 = fila19.item;
        fila15.item = objArray22;
        fila6.enfileira((java.lang.Object) objArray22);
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray29 = fila25.item;
        fila6.item = objArray29;
        fila0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.frente = (-1);
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = 0;
        java.lang.Object[] objArray11 = fila8.item;
        fila8.frente = 'a';
        fila8.tras = '4';
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        java.lang.Object obj20 = fila16.desenfileira();
        int int21 = fila16.frente;
        fila8.enfileira((java.lang.Object) fila16);
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        java.lang.Object[] objArray28 = fila23.item;
        java.lang.Object[] objArray29 = fila23.item;
        fila23.tras = 1;
        java.lang.Object[] objArray32 = fila23.item;
        java.lang.Object obj33 = fila23.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        fila34.frente = (short) 100;
        java.lang.Object obj38 = fila34.desenfileira();
        java.lang.Object[] objArray39 = fila34.item;
        java.lang.Object[] objArray40 = fila34.item;
        fila34.tras = 1;
        fila34.tras = (byte) 1;
        java.lang.Object[] objArray45 = fila34.item;
        ds.Fila fila46 = new ds.Fila();
        int int47 = fila46.tras;
        fila46.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray50 = fila46.item;
        boolean boolean51 = fila46.vazia();
        ds.Fila fila52 = new ds.Fila();
        int int53 = fila52.tras;
        fila52.frente = (short) 100;
        java.lang.Object obj56 = fila52.desenfileira();
        java.lang.Object[] objArray57 = fila52.item;
        fila46.item = objArray57;
        ds.Fila fila59 = new ds.Fila();
        int int60 = fila59.tras;
        fila59.frente = (short) 100;
        java.lang.Object obj63 = fila59.desenfileira();
        int int64 = fila59.frente;
        boolean boolean65 = fila59.vazia();
        fila46.enfileira((java.lang.Object) boolean65);
        fila46.frente = (byte) 0;
        ds.Fila fila69 = new ds.Fila();
        int int70 = fila69.tras;
        java.lang.Object[] objArray71 = fila69.item;
        fila46.item = objArray71;
        ds.Fila fila73 = new ds.Fila();
        int int74 = fila73.tras;
        fila73.frente = (short) 100;
        java.lang.Object obj77 = fila73.desenfileira();
        int int78 = fila73.frente;
        ds.Fila fila79 = new ds.Fila();
        fila79.frente = 0;
        int int82 = fila79.frente;
        java.lang.Object[] objArray83 = fila79.item;
        fila73.item = objArray83;
        int int85 = fila73.frente;
        java.lang.Object[] objArray86 = fila73.item;
        fila46.item = objArray86;
        fila34.item = objArray86;
        fila23.item = objArray86;
        fila16.item = objArray86;
        fila0.item = objArray86;
        int int92 = fila0.frente;
        int int93 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 101 + "'", int64 == 101);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 101 + "'", int78 == 101);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 101 + "'", int85 == 101);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        int int18 = fila13.frente;
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        fila0.frente = (byte) 0;
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = 0;
        int int26 = fila23.frente;
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 0, obj28, (byte) 100 };
        fila23.item = objArray30;
        int int32 = fila23.frente;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        fila33.frente = (short) 100;
        fila33.tras = (short) 1;
        int int39 = fila33.frente;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        java.lang.Object[] objArray42 = fila40.item;
        java.lang.Object[] objArray43 = fila40.item;
        fila33.enfileira((java.lang.Object) fila40);
        fila33.frente = '#';
        fila23.enfileira((java.lang.Object) fila33);
        fila23.frente = 1;
        fila23.imprime();
        ds.Fila fila51 = new ds.Fila();
        int int52 = fila51.tras;
        java.lang.Object[] objArray53 = fila51.item;
        java.lang.Object[] objArray54 = fila51.item;
        ds.Fila fila55 = new ds.Fila();
        fila51.enfileira((java.lang.Object) fila55);
        fila55.tras = (short) 10;
        java.lang.Object[] objArray59 = fila55.item;
        fila23.item = objArray59;
        fila0.item = objArray59;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.tras = (-1);
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = fila11.item;
        fila0.item = objArray15;
        fila0.tras = (-1);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        java.lang.Object obj23 = fila19.desenfileira();
        int int24 = fila19.frente;
        java.lang.Object obj25 = fila19.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        fila0.frente = '4';
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = 0;
        java.lang.Object[] objArray26 = fila23.item;
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean28 = fila23.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.frente;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 1;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        int int17 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        fila0.frente = '4';
        java.lang.Object obj23 = null;
        fila0.enfileira(obj23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.frente = (short) 0;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Object obj18 = fila0.desenfileira();
        java.lang.Object obj19 = fila0.desenfileira();
        int int20 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 103 + "'", int20 == 103);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 100;
        java.lang.Object obj9 = fila5.desenfileira();
        java.lang.Object[] objArray10 = fila5.item;
        java.lang.Object[] objArray11 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray11);
        ds.Fila fila13 = new ds.Fila();
        fila13.frente = 0;
        int int16 = fila13.frente;
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0, obj18, (byte) 100 };
        fila13.item = objArray20;
        int int22 = fila13.frente;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        fila23.tras = (short) 1;
        int int29 = fila23.frente;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        java.lang.Object[] objArray32 = fila30.item;
        java.lang.Object[] objArray33 = fila30.item;
        fila23.enfileira((java.lang.Object) fila30);
        fila23.frente = '#';
        fila13.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila13);
        fila13.frente = (byte) 10;
        boolean boolean41 = fila13.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 1;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        fila0.frente = (-1);
        fila0.frente = 102;
        fila0.frente = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray9 = fila0.item;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 100;
        java.lang.Object obj14 = fila10.desenfileira();
        int int15 = fila10.frente;
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = 0;
        int int19 = fila16.frente;
        java.lang.Object[] objArray20 = fila16.item;
        fila10.item = objArray20;
        int int22 = fila10.frente;
        java.lang.Object[] objArray23 = fila10.item;
        fila0.enfileira((java.lang.Object) objArray23);
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray23 = fila19.item;
        fila0.item = objArray23;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean16 = fila0.vazia();
        fila0.frente = (short) -1;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        java.lang.Object obj23 = fila19.desenfileira();
        java.lang.Object[] objArray24 = fila19.item;
        fila0.item = objArray24;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        int int4 = fila0.frente;
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = 0;
        java.lang.Object[] objArray18 = fila15.item;
        fila15.frente = 'a';
        fila6.enfileira((java.lang.Object) fila15);
        ds.Fila fila22 = new ds.Fila();
        fila22.frente = 0;
        java.lang.Object[] objArray25 = fila22.item;
        fila15.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray13 = fila9.item;
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        fila0.frente = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 100;
        java.lang.Object obj11 = fila7.desenfileira();
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object[] objArray13 = fila7.item;
        fila7.tras = 1;
        java.lang.Object[] objArray16 = fila7.item;
        java.lang.Object obj17 = fila7.desenfileira();
        int int18 = fila7.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        fila19.tras = (short) 1;
        int int25 = fila19.frente;
        fila7.enfileira((java.lang.Object) int25);
        fila0.enfileira((java.lang.Object) fila7);
        int int28 = fila7.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 102 + "'", int28 == 102);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = 0;
        java.lang.Object[] objArray19 = fila16.item;
        fila16.frente = 'a';
        fila16.tras = '4';
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.frente = (short) 100;
        java.lang.Object obj28 = fila24.desenfileira();
        int int29 = fila24.frente;
        fila16.enfileira((java.lang.Object) fila24);
        fila10.enfileira((java.lang.Object) fila24);
        fila24.tras = (byte) 1;
        java.lang.Object[] objArray34 = null;
        fila24.item = objArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        int int10 = fila0.tras;
        int int11 = fila0.tras;
        fila0.tras = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        int int13 = fila8.frente;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj15 = fila8.desenfileira();
        fila8.frente = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 100;
        fila10.tras = (short) 1;
        int int16 = fila10.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        java.lang.Object[] objArray20 = fila17.item;
        fila10.enfileira((java.lang.Object) fila17);
        fila10.frente = '#';
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        java.lang.Object[] objArray8 = fila6.item;
        java.lang.Object[] objArray9 = fila6.item;
        int int10 = fila6.tras;
        fila6.tras = (-1);
        int int13 = fila6.tras;
        int int14 = fila6.tras;
        java.lang.Object[] objArray15 = fila6.item;
        fila0.item = objArray15;
        java.lang.Object obj17 = fila0.desenfileira();
        int int18 = fila0.frente;
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object[] objArray16 = fila0.item;
        fila0.tras = 'a';
        fila0.tras = 97;
        java.lang.Object[] objArray21 = null;
        fila0.item = objArray21;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.frente;
        fila0.frente = 0;
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.tras = '#';
        java.lang.Object obj19 = fila0.desenfileira();
        fila0.tras = (short) 1;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        java.lang.Object[] objArray22 = fila20.item;
        fila16.item = objArray22;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.frente = (short) 100;
        java.lang.Object obj28 = fila24.desenfileira();
        java.lang.Object[] objArray29 = fila24.item;
        java.lang.Object[] objArray30 = fila24.item;
        fila16.enfileira((java.lang.Object) fila24);
        java.lang.Object[] objArray32 = fila16.item;
        fila0.item = objArray32;
        fila0.tras = 0;
        ds.Fila fila36 = new ds.Fila();
        fila36.frente = 0;
        java.lang.Object[] objArray39 = fila36.item;
        fila36.frente = 'a';
        fila36.tras = '4';
        java.lang.Object[] objArray44 = fila36.item;
        int int45 = fila36.tras;
        fila0.enfileira((java.lang.Object) fila36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.tras = (short) 10;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        java.lang.Object[] objArray10 = fila7.item;
        fila3.item = objArray10;
        fila3.tras = (-1);
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        fila3.item = objArray18;
        fila3.frente = ' ';
        java.lang.Object[] objArray22 = fila3.item;
        fila0.item = objArray22;
        int int24 = fila0.frente;
        int int25 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.tras = (-1);
        fila0.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        int int4 = fila0.frente;
        fila0.imprime();
        fila0.tras = 97;
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object[] objArray16 = fila10.item;
        fila10.imprime();
        java.lang.Class<?> wildcardClass18 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray16 = fila12.item;
        boolean boolean17 = fila12.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 100;
        java.lang.Object obj22 = fila18.desenfileira();
        java.lang.Object[] objArray23 = fila18.item;
        fila12.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 100;
        java.lang.Object obj29 = fila25.desenfileira();
        int int30 = fila25.frente;
        boolean boolean31 = fila25.vazia();
        fila12.enfileira((java.lang.Object) boolean31);
        fila12.frente = (byte) 0;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.tras;
        java.lang.Object[] objArray37 = fila35.item;
        fila12.item = objArray37;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 100;
        java.lang.Object obj43 = fila39.desenfileira();
        int int44 = fila39.frente;
        ds.Fila fila45 = new ds.Fila();
        fila45.frente = 0;
        int int48 = fila45.frente;
        java.lang.Object[] objArray49 = fila45.item;
        fila39.item = objArray49;
        int int51 = fila39.frente;
        java.lang.Object[] objArray52 = fila39.item;
        fila12.item = objArray52;
        fila0.item = objArray52;
        fila0.frente = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        java.lang.Object[] objArray8 = fila0.item;
        fila0.frente = 0;
        int int11 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        int int8 = fila0.tras;
        boolean boolean9 = fila0.vazia();
        fila0.tras = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.frente = 0;
        java.lang.Object[] objArray15 = fila12.item;
        fila12.frente = 'a';
        fila12.tras = '4';
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.frente = (short) 100;
        java.lang.Object obj24 = fila20.desenfileira();
        int int25 = fila20.frente;
        fila12.enfileira((java.lang.Object) fila20);
        java.lang.Object[] objArray27 = fila12.item;
        fila0.item = objArray27;
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        int int4 = fila0.frente;
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = 0;
        java.lang.Object[] objArray18 = fila15.item;
        fila15.frente = 'a';
        fila6.enfileira((java.lang.Object) fila15);
        ds.Fila fila22 = new ds.Fila();
        fila22.frente = 0;
        java.lang.Object[] objArray25 = fila22.item;
        fila15.item = objArray25;
        fila0.item = objArray25;
        java.lang.Object obj28 = null;
        fila0.enfileira(obj28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        int int10 = fila6.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila6.enfileira((java.lang.Object) objArray14);
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        fila0.enfileira((java.lang.Object) objArray14);
        java.lang.Object[] objArray18 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.tras = (short) 100;
        int int9 = fila0.tras;
        int int10 = fila0.tras;
        fila0.frente = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        java.lang.Object obj13 = fila9.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 100;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        java.lang.Object[] objArray21 = fila18.item;
        fila14.item = objArray21;
        fila9.item = objArray21;
        fila0.enfileira((java.lang.Object) objArray21);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 100;
        java.lang.Object obj16 = fila12.desenfileira();
        int int17 = fila12.frente;
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = 0;
        int int21 = fila18.frente;
        java.lang.Object[] objArray22 = fila18.item;
        fila12.item = objArray22;
        fila0.item = objArray22;
        java.lang.Object[] objArray25 = fila0.item;
        int int26 = fila0.frente;
        java.lang.Object obj27 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.tras;
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) (byte) 10);
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        int int11 = fila0.frente;
        fila0.frente = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.tras = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Object obj18 = fila0.desenfileira();
        int int19 = fila0.frente;
        int int20 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.frente;
        fila0.imprime();
        fila0.frente = 32;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj16 = fila0.desenfileira();
        int int17 = fila0.frente;
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = 0;
        java.lang.Object[] objArray21 = fila18.item;
        fila18.frente = 'a';
        fila18.frente = (-1);
        fila18.frente = ' ';
        java.lang.Object[] objArray28 = fila18.item;
        fila0.item = objArray28;
        fila0.tras = (short) -1;
        java.lang.Object obj32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        fila0.frente = (short) 0;
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 100;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        java.lang.Object[] objArray18 = fila16.item;
        fila12.item = objArray18;
        fila0.item = objArray18;
        java.lang.Object[] objArray21 = fila0.item;
        int int22 = fila0.tras;
        fila0.frente = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        int int10 = fila6.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila6.enfileira((java.lang.Object) objArray14);
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        fila0.enfileira((java.lang.Object) objArray14);
        fila0.frente = '#';
        fila0.tras = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        int int13 = fila8.frente;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Object[] objArray16 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = 0;
        java.lang.Object[] objArray22 = fila19.item;
        fila0.item = objArray22;
        java.lang.Class<?> wildcardClass24 = objArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.tras = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        fila0.tras = (byte) 100;
        fila0.frente = (short) 0;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.frente = 0;
        java.lang.Object[] objArray15 = fila12.item;
        fila12.frente = 'a';
        fila12.tras = '4';
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.frente = (short) 100;
        java.lang.Object obj24 = fila20.desenfileira();
        int int25 = fila20.frente;
        fila12.enfileira((java.lang.Object) fila20);
        java.lang.Object[] objArray27 = fila12.item;
        fila0.item = objArray27;
        fila0.frente = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object[] objArray16 = fila10.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        int int10 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        fila0.frente = 0;
        fila0.tras = (short) 100;
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        fila0.frente = 101;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila8.tras = 1;
        fila8.tras = (byte) 1;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = (-1);
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object[] objArray16 = fila0.item;
        int int17 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        fila0.frente = 0;
        java.lang.Object obj8 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 100;
        boolean boolean11 = fila7.vazia();
        int int12 = fila7.tras;
        java.lang.Object[] objArray13 = null;
        fila7.item = objArray13;
        boolean boolean15 = fila7.vazia();
        fila7.frente = (-1);
        fila0.enfileira((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        java.lang.Object[] objArray8 = fila6.item;
        java.lang.Object[] objArray9 = fila6.item;
        int int10 = fila6.tras;
        fila6.tras = (-1);
        int int13 = fila6.tras;
        int int14 = fila6.tras;
        java.lang.Object[] objArray15 = fila6.item;
        fila0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.frente = 100;
        int int18 = fila9.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila19.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray25 = fila19.item;
        fila9.enfileira((java.lang.Object) fila19);
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 100;
        int int31 = fila27.tras;
        boolean boolean32 = fila27.vazia();
        java.lang.Object[] objArray33 = fila27.item;
        fila19.item = objArray33;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.tras;
        fila35.frente = (short) 100;
        java.lang.Object obj39 = fila35.desenfileira();
        java.lang.Object[] objArray40 = fila35.item;
        java.lang.Object[] objArray41 = fila35.item;
        fila35.tras = 1;
        fila35.tras = (byte) 1;
        java.lang.Object[] objArray46 = fila35.item;
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        fila47.frente = (short) 100;
        java.lang.Object obj51 = fila47.desenfileira();
        int int52 = fila47.frente;
        ds.Fila fila53 = new ds.Fila();
        fila53.frente = 0;
        int int56 = fila53.frente;
        java.lang.Object[] objArray57 = fila53.item;
        fila47.item = objArray57;
        fila35.item = objArray57;
        java.lang.Object[] objArray60 = fila35.item;
        fila19.enfileira((java.lang.Object) objArray60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj16 = fila0.desenfileira();
        int int17 = fila0.frente;
        java.lang.Object obj18 = fila0.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        boolean boolean23 = fila19.vazia();
        fila0.enfileira((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.frente = 100;
        boolean boolean18 = fila9.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = 0;
        java.lang.Object[] objArray22 = fila19.item;
        fila0.item = objArray22;
        boolean boolean24 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.tras = (byte) 100;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 100;
        java.lang.Object obj13 = fila9.desenfileira();
        int int14 = fila9.frente;
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = 0;
        int int18 = fila15.frente;
        java.lang.Object[] objArray19 = fila15.item;
        fila9.item = objArray19;
        int int21 = fila9.frente;
        fila9.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) 0L);
        int int25 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        int int6 = fila4.frente;
        fila4.frente = 52;
        java.lang.Class<?> wildcardClass9 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        fila0.tras = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 100;
        java.lang.Object obj11 = fila7.desenfileira();
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object[] objArray13 = fila7.item;
        fila7.tras = 1;
        boolean boolean16 = fila7.vazia();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray21 = fila17.item;
        boolean boolean22 = fila17.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        java.lang.Object[] objArray28 = fila23.item;
        fila17.item = objArray28;
        fila7.item = objArray28;
        fila0.item = objArray28;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        java.lang.Object[] objArray35 = fila32.item;
        int int36 = fila32.tras;
        fila32.tras = (-1);
        ds.Fila fila39 = new ds.Fila();
        fila39.frente = 0;
        int int42 = fila39.frente;
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 0, obj44, (byte) 100 };
        fila39.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.tras;
        fila48.tras = (short) 10;
        java.lang.Object obj52 = fila48.desenfileira();
        ds.Fila fila53 = new ds.Fila();
        int int54 = fila53.tras;
        fila53.frente = (short) 100;
        ds.Fila fila57 = new ds.Fila();
        int int58 = fila57.tras;
        java.lang.Object[] objArray59 = fila57.item;
        java.lang.Object[] objArray60 = fila57.item;
        fila53.item = objArray60;
        fila48.item = objArray60;
        fila39.enfileira((java.lang.Object) objArray60);
        fila32.item = objArray60;
        int int65 = fila32.frente;
        fila32.frente = (short) 100;
        java.lang.Object[] objArray68 = fila32.item;
        fila0.item = objArray68;
        java.lang.Object[] objArray70 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.frente;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 100;
        int int15 = fila11.tras;
        int int16 = fila11.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.frente = (short) 100;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        java.lang.Object[] objArray24 = fila21.item;
        fila17.item = objArray24;
        fila11.enfileira((java.lang.Object) fila17);
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 100;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila27.item = objArray33;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.tras;
        fila35.frente = (short) 100;
        java.lang.Object obj39 = fila35.desenfileira();
        java.lang.Object[] objArray40 = fila35.item;
        java.lang.Object[] objArray41 = fila35.item;
        fila27.enfileira((java.lang.Object) fila35);
        java.lang.Object[] objArray43 = fila27.item;
        fila11.item = objArray43;
        fila0.item = objArray43;
        java.lang.Class<?> wildcardClass46 = objArray43.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila0.vazia();
        fila0.frente = '4';
        fila0.tras = '#';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 100;
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = fila11.desenfileira();
        boolean boolean17 = fila11.vazia();
        fila11.tras = (short) 100;
        fila0.enfileira((java.lang.Object) fila11);
        int int21 = fila11.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        fila0.tras = (byte) 100;
        fila0.frente = (short) 0;
        int int9 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        fila0.frente = (-1);
        fila0.frente = 102;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object[] objArray10 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 100;
        java.lang.Object obj14 = fila10.desenfileira();
        java.lang.Object[] objArray15 = fila10.item;
        java.lang.Object[] objArray16 = fila10.item;
        fila10.tras = 1;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray23 = fila19.item;
        fila10.item = objArray23;
        fila0.item = objArray23;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        int int11 = fila0.frente;
        fila0.frente = (short) 10;
        ds.Fila fila14 = new ds.Fila();
        fila14.frente = 0;
        java.lang.Object[] objArray17 = fila14.item;
        fila14.tras = (short) 1;
        fila14.frente = 0;
        java.lang.Object[] objArray22 = fila14.item;
        fila0.item = objArray22;
        fila0.tras = (byte) 1;
        boolean boolean26 = fila0.vazia();
        fila0.tras = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        int int4 = fila0.frente;
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = 0;
        java.lang.Object[] objArray9 = fila6.item;
        fila6.frente = 'a';
        fila6.tras = '4';
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 100;
        java.lang.Object obj18 = fila14.desenfileira();
        int int19 = fila14.frente;
        fila6.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        int int10 = fila0.tras;
        int int11 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        fila0.frente = 0;
        fila0.frente = 101;
        java.lang.Object[] objArray10 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.tras = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.tras = (short) 100;
        fila0.frente = 103;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.frente;
        java.lang.Object[] objArray5 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        int int3 = fila0.tras;
        int int4 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila9.tras = '4';
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        int int23 = fila19.frente;
        int int24 = fila19.frente;
        fila0.enfileira((java.lang.Object) fila19);
        int int26 = fila0.tras;
        int int27 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 100;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray25 = fila21.item;
        int int26 = fila21.frente;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        java.lang.Object[] objArray29 = fila27.item;
        java.lang.Object[] objArray30 = fila27.item;
        int int31 = fila27.tras;
        fila27.tras = (-1);
        int int34 = fila27.tras;
        int int35 = fila27.tras;
        java.lang.Object[] objArray36 = fila27.item;
        fila21.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 100;
        java.lang.Object obj43 = fila39.desenfileira();
        java.lang.Object[] objArray44 = fila39.item;
        java.lang.Object[] objArray45 = fila39.item;
        fila39.tras = 1;
        fila39.tras = (byte) 1;
        int int50 = fila39.frente;
        fila39.frente = (short) 10;
        ds.Fila fila53 = new ds.Fila();
        fila53.frente = 0;
        java.lang.Object[] objArray56 = fila53.item;
        fila53.tras = (short) 1;
        fila53.frente = 0;
        java.lang.Object[] objArray61 = fila53.item;
        fila39.item = objArray61;
        fila0.enfileira((java.lang.Object) fila39);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 101 + "'", int50 == 101);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 100;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        java.lang.Object[] objArray10 = fila8.item;
        java.lang.Object[] objArray11 = fila8.item;
        fila4.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        fila13.frente = 0;
        java.lang.Object[] objArray16 = fila13.item;
        fila13.frente = 'a';
        fila4.enfileira((java.lang.Object) fila13);
        int int20 = fila4.tras;
        java.lang.Object obj21 = fila4.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 100;
        fila22.tras = (short) 1;
        int int28 = fila22.frente;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        java.lang.Object[] objArray32 = fila29.item;
        fila22.enfileira((java.lang.Object) fila29);
        fila22.tras = (short) 100;
        java.lang.Object[] objArray36 = fila22.item;
        fila4.item = objArray36;
        ds.Fila fila38 = new ds.Fila();
        fila38.frente = 0;
        java.lang.Object[] objArray41 = fila38.item;
        fila38.frente = 'a';
        fila38.tras = '4';
        ds.Fila fila46 = new ds.Fila();
        int int47 = fila46.tras;
        fila46.frente = (short) 100;
        java.lang.Object obj50 = fila46.desenfileira();
        int int51 = fila46.frente;
        fila38.enfileira((java.lang.Object) fila46);
        fila38.frente = '#';
        ds.Fila fila55 = new ds.Fila();
        int int56 = fila55.tras;
        fila55.frente = (short) 100;
        fila55.tras = (short) 1;
        int int61 = fila55.frente;
        fila55.frente = (-1);
        ds.Fila fila64 = new ds.Fila();
        int int65 = fila64.tras;
        fila64.tras = (short) 10;
        ds.Fila fila68 = new ds.Fila();
        int int69 = fila68.tras;
        java.lang.Object[] objArray70 = fila68.item;
        java.lang.Object[] objArray71 = fila68.item;
        fila64.item = objArray71;
        fila55.enfileira((java.lang.Object) objArray71);
        ds.Fila fila74 = new ds.Fila();
        fila74.frente = 0;
        java.lang.Object[] objArray77 = fila74.item;
        fila55.item = objArray77;
        fila38.item = objArray77;
        fila4.enfileira((java.lang.Object) objArray77);
        fila0.enfileira((java.lang.Object) objArray77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 100;
        java.lang.Object obj16 = fila12.desenfileira();
        int int17 = fila12.frente;
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = 0;
        int int21 = fila18.frente;
        java.lang.Object[] objArray22 = fila18.item;
        fila12.item = objArray22;
        fila0.item = objArray22;
        java.lang.Object[] objArray25 = fila0.item;
        int int26 = fila0.frente;
        boolean boolean27 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        int int18 = fila13.frente;
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        fila0.frente = (byte) 0;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        fila0.item = objArray25;
        fila0.tras = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.frente = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.tras;
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) (byte) 10);
        fila0.enfileira((java.lang.Object) (byte) 10);
        int int18 = fila0.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        java.lang.Object obj23 = fila19.desenfileira();
        int int24 = fila19.frente;
        ds.Fila fila25 = new ds.Fila();
        fila25.frente = 0;
        int int28 = fila25.frente;
        java.lang.Object[] objArray29 = fila25.item;
        fila19.item = objArray29;
        boolean boolean31 = fila19.vazia();
        fila0.enfileira((java.lang.Object) fila19);
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        fila33.frente = (short) 100;
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.tras;
        java.lang.Object[] objArray39 = fila37.item;
        fila33.item = objArray39;
        boolean boolean41 = fila33.vazia();
        fila33.frente = (short) 0;
        fila33.imprime();
        ds.Fila fila45 = new ds.Fila();
        int int46 = fila45.tras;
        fila45.frente = (short) 100;
        ds.Fila fila49 = new ds.Fila();
        int int50 = fila49.tras;
        java.lang.Object[] objArray51 = fila49.item;
        fila45.item = objArray51;
        fila33.item = objArray51;
        java.lang.Object[] objArray54 = fila33.item;
        int int55 = fila33.tras;
        ds.Fila fila56 = new ds.Fila();
        int int57 = fila56.tras;
        boolean boolean58 = fila56.vazia();
        ds.Fila fila59 = new ds.Fila();
        int int60 = fila59.tras;
        fila59.frente = (short) 100;
        java.lang.Object obj63 = fila59.desenfileira();
        java.lang.Object[] objArray64 = fila59.item;
        java.lang.Object[] objArray65 = fila59.item;
        fila59.tras = 1;
        boolean boolean68 = fila59.vazia();
        ds.Fila fila69 = new ds.Fila();
        int int70 = fila69.tras;
        fila69.frente = (short) 100;
        int int73 = fila69.tras;
        int int74 = fila69.frente;
        int int75 = fila69.tras;
        fila59.enfileira((java.lang.Object) int75);
        fila56.enfileira((java.lang.Object) fila59);
        java.lang.Object obj78 = fila56.desenfileira();
        fila33.enfileira(obj78);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj78);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(obj78);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        int int7 = fila0.frente;
        fila0.tras = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        java.lang.Object[] objArray10 = fila7.item;
        fila0.enfileira((java.lang.Object) fila7);
        fila0.frente = '#';
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.tras = (short) 10;
        fila14.enfileira((java.lang.Object) (-1.0d));
        fila14.enfileira((java.lang.Object) 97);
        fila0.enfileira((java.lang.Object) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        java.lang.Object[] objArray18 = fila16.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.tras = (short) 10;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        java.lang.Object[] objArray26 = fila23.item;
        fila19.item = objArray26;
        fila19.tras = (-1);
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray34 = fila30.item;
        fila19.item = objArray34;
        fila19.frente = ' ';
        java.lang.Object[] objArray38 = fila19.item;
        fila16.item = objArray38;
        fila10.enfileira((java.lang.Object) fila16);
        ds.Fila fila41 = new ds.Fila();
        fila41.frente = 0;
        boolean boolean44 = fila41.vazia();
        int int45 = fila41.frente;
        int int46 = fila41.tras;
        fila16.enfileira((java.lang.Object) fila41);
        java.lang.Object obj48 = fila16.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.frente = 100;
        java.lang.Object obj18 = fila9.desenfileira();
        boolean boolean19 = fila9.vazia();
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.frente = (short) 100;
        java.lang.Object obj24 = fila20.desenfileira();
        java.lang.Object[] objArray25 = fila20.item;
        java.lang.Object[] objArray26 = fila20.item;
        fila20.tras = 1;
        boolean boolean29 = fila20.vazia();
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray34 = fila30.item;
        boolean boolean35 = fila30.vazia();
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.tras;
        fila36.frente = (short) 100;
        java.lang.Object obj40 = fila36.desenfileira();
        java.lang.Object[] objArray41 = fila36.item;
        fila30.item = objArray41;
        fila20.item = objArray41;
        fila9.item = objArray41;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        int int16 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = 0;
        boolean boolean9 = fila6.vazia();
        int int10 = fila6.frente;
        fila0.enfileira((java.lang.Object) fila6);
        fila6.frente = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        fila0.frente = '4';
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = 0;
        java.lang.Object[] objArray26 = fila23.item;
        fila0.enfileira((java.lang.Object) fila23);
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 100;
        int int32 = fila28.tras;
        int int33 = fila28.frente;
        int int34 = fila28.tras;
        fila0.enfileira((java.lang.Object) fila28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        fila0.frente = (-1);
        int int7 = fila0.frente;
        fila0.tras = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        int int18 = fila13.frente;
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        fila0.frente = (byte) 0;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        fila0.item = objArray25;
        java.lang.Object[] objArray27 = fila0.item;
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        int int16 = fila8.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray21 = fila17.item;
        boolean boolean22 = fila17.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        java.lang.Object[] objArray28 = fila23.item;
        fila17.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.frente = (short) 100;
        java.lang.Object obj34 = fila30.desenfileira();
        int int35 = fila30.frente;
        boolean boolean36 = fila30.vazia();
        fila17.enfileira((java.lang.Object) boolean36);
        fila17.frente = (byte) 0;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        java.lang.Object[] objArray42 = fila40.item;
        fila17.item = objArray42;
        java.lang.Object[] objArray44 = fila17.item;
        java.lang.Object obj45 = fila17.desenfileira();
        fila8.enfileira(obj45);
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        fila47.frente = (short) 100;
        java.lang.Object obj51 = fila47.desenfileira();
        java.lang.Object[] objArray52 = fila47.item;
        java.lang.Object[] objArray53 = fila47.item;
        fila47.tras = 1;
        boolean boolean56 = fila47.vazia();
        ds.Fila fila57 = new ds.Fila();
        int int58 = fila57.tras;
        fila57.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray61 = fila57.item;
        boolean boolean62 = fila57.vazia();
        ds.Fila fila63 = new ds.Fila();
        int int64 = fila63.tras;
        fila63.frente = (short) 100;
        java.lang.Object obj67 = fila63.desenfileira();
        java.lang.Object[] objArray68 = fila63.item;
        fila57.item = objArray68;
        fila47.item = objArray68;
        fila8.item = objArray68;
        int int72 = fila8.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 101 + "'", int72 == 101);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.frente = (short) 0;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        boolean boolean13 = fila8.vazia();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 100;
        java.lang.Object obj18 = fila14.desenfileira();
        java.lang.Object[] objArray19 = fila14.item;
        fila8.item = objArray19;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 100;
        java.lang.Object obj25 = fila21.desenfileira();
        int int26 = fila21.frente;
        boolean boolean27 = fila21.vazia();
        fila8.enfileira((java.lang.Object) boolean27);
        fila8.frente = (byte) 0;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila8.item = objArray33;
        java.lang.Object[] objArray35 = fila8.item;
        java.lang.Object obj36 = fila8.desenfileira();
        java.lang.Object[] objArray37 = fila8.item;
        fila0.item = objArray37;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        int int10 = fila7.frente;
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 0, obj12, (byte) 100 };
        fila7.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.tras = (short) 10;
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 100;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        java.lang.Object[] objArray27 = fila25.item;
        java.lang.Object[] objArray28 = fila25.item;
        fila21.item = objArray28;
        fila16.item = objArray28;
        fila7.enfileira((java.lang.Object) objArray28);
        fila0.item = objArray28;
        int int33 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        int int13 = fila8.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        int int16 = fila8.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray21 = fila17.item;
        boolean boolean22 = fila17.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        java.lang.Object[] objArray28 = fila23.item;
        fila17.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.frente = (short) 100;
        java.lang.Object obj34 = fila30.desenfileira();
        int int35 = fila30.frente;
        boolean boolean36 = fila30.vazia();
        fila17.enfileira((java.lang.Object) boolean36);
        fila17.frente = (byte) 0;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        java.lang.Object[] objArray42 = fila40.item;
        fila17.item = objArray42;
        java.lang.Object[] objArray44 = fila17.item;
        java.lang.Object obj45 = fila17.desenfileira();
        fila8.enfileira(obj45);
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        fila47.frente = (short) 100;
        java.lang.Object obj51 = fila47.desenfileira();
        java.lang.Object[] objArray52 = fila47.item;
        java.lang.Object[] objArray53 = fila47.item;
        fila47.tras = 1;
        boolean boolean56 = fila47.vazia();
        ds.Fila fila57 = new ds.Fila();
        int int58 = fila57.tras;
        fila57.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray61 = fila57.item;
        boolean boolean62 = fila57.vazia();
        ds.Fila fila63 = new ds.Fila();
        int int64 = fila63.tras;
        fila63.frente = (short) 100;
        java.lang.Object obj67 = fila63.desenfileira();
        java.lang.Object[] objArray68 = fila63.item;
        fila57.item = objArray68;
        fila47.item = objArray68;
        fila8.item = objArray68;
        java.lang.Class<?> wildcardClass72 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        java.lang.Object[] objArray14 = fila12.item;
        java.lang.Object[] objArray15 = fila12.item;
        fila8.item = objArray15;
        fila0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.frente;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = 100;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 100;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        java.lang.Object[] objArray24 = fila22.item;
        fila18.item = objArray24;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        fila26.frente = (short) 100;
        java.lang.Object obj30 = fila26.desenfileira();
        java.lang.Object[] objArray31 = fila26.item;
        java.lang.Object[] objArray32 = fila26.item;
        fila18.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.tras;
        fila0.tras = (byte) 0;
        fila0.tras = 2;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        fila0.frente = '4';
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila9.tras = '4';
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        int int23 = fila19.frente;
        int int24 = fila19.frente;
        fila0.enfileira((java.lang.Object) fila19);
        boolean boolean26 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        java.lang.Object obj23 = fila19.desenfileira();
        int int24 = fila19.frente;
        java.lang.Object[] objArray25 = fila19.item;
        fila0.item = objArray25;
        fila0.frente = 102;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        java.lang.Object[] objArray8 = fila6.item;
        java.lang.Object[] objArray9 = fila6.item;
        int int10 = fila6.tras;
        fila6.tras = (-1);
        int int13 = fila6.tras;
        int int14 = fila6.tras;
        java.lang.Object[] objArray15 = fila6.item;
        fila0.item = objArray15;
        java.lang.Object obj17 = fila0.desenfileira();
        int int18 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        int int11 = fila0.frente;
        fila0.frente = (short) -1;
        boolean boolean14 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 100;
        java.lang.Object obj11 = fila7.desenfileira();
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object[] objArray13 = fila7.item;
        fila7.tras = 1;
        boolean boolean16 = fila7.vazia();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray21 = fila17.item;
        boolean boolean22 = fila17.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        java.lang.Object[] objArray28 = fila23.item;
        fila17.item = objArray28;
        fila7.item = objArray28;
        fila0.item = objArray28;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        java.lang.Object[] objArray35 = fila32.item;
        int int36 = fila32.tras;
        fila32.tras = (-1);
        ds.Fila fila39 = new ds.Fila();
        fila39.frente = 0;
        int int42 = fila39.frente;
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 0, obj44, (byte) 100 };
        fila39.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.tras;
        fila48.tras = (short) 10;
        java.lang.Object obj52 = fila48.desenfileira();
        ds.Fila fila53 = new ds.Fila();
        int int54 = fila53.tras;
        fila53.frente = (short) 100;
        ds.Fila fila57 = new ds.Fila();
        int int58 = fila57.tras;
        java.lang.Object[] objArray59 = fila57.item;
        java.lang.Object[] objArray60 = fila57.item;
        fila53.item = objArray60;
        fila48.item = objArray60;
        fila39.enfileira((java.lang.Object) objArray60);
        fila32.item = objArray60;
        int int65 = fila32.frente;
        fila32.frente = (short) 100;
        java.lang.Object[] objArray68 = fila32.item;
        fila0.item = objArray68;
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        fila0.frente = 10;
        fila0.tras = 103;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        int int14 = fila10.tras;
        fila10.tras = (-1);
        ds.Fila fila17 = new ds.Fila();
        fila17.frente = 0;
        int int20 = fila17.frente;
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0, obj22, (byte) 100 };
        fila17.item = objArray24;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        fila26.tras = (short) 10;
        java.lang.Object obj30 = fila26.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        fila31.frente = (short) 100;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.tras;
        java.lang.Object[] objArray37 = fila35.item;
        java.lang.Object[] objArray38 = fila35.item;
        fila31.item = objArray38;
        fila26.item = objArray38;
        fila17.enfileira((java.lang.Object) objArray38);
        fila10.item = objArray38;
        int int43 = fila10.frente;
        fila10.frente = (short) 100;
        java.lang.Object[] objArray46 = fila10.item;
        fila0.item = objArray46;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = 0;
        java.lang.Object[] objArray22 = fila19.item;
        fila0.item = objArray22;
        java.lang.Object[] objArray24 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        int int16 = fila8.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray21 = fila17.item;
        boolean boolean22 = fila17.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        java.lang.Object[] objArray28 = fila23.item;
        fila17.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.frente = (short) 100;
        java.lang.Object obj34 = fila30.desenfileira();
        int int35 = fila30.frente;
        boolean boolean36 = fila30.vazia();
        fila17.enfileira((java.lang.Object) boolean36);
        fila17.frente = (byte) 0;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        java.lang.Object[] objArray42 = fila40.item;
        fila17.item = objArray42;
        java.lang.Object[] objArray44 = fila17.item;
        java.lang.Object obj45 = fila17.desenfileira();
        fila8.enfileira(obj45);
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        fila47.frente = (short) 100;
        java.lang.Object obj51 = fila47.desenfileira();
        java.lang.Object[] objArray52 = fila47.item;
        java.lang.Object[] objArray53 = fila47.item;
        fila47.tras = 1;
        boolean boolean56 = fila47.vazia();
        ds.Fila fila57 = new ds.Fila();
        int int58 = fila57.tras;
        fila57.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray61 = fila57.item;
        boolean boolean62 = fila57.vazia();
        ds.Fila fila63 = new ds.Fila();
        int int64 = fila63.tras;
        fila63.frente = (short) 100;
        java.lang.Object obj67 = fila63.desenfileira();
        java.lang.Object[] objArray68 = fila63.item;
        fila57.item = objArray68;
        fila47.item = objArray68;
        fila8.item = objArray68;
        java.lang.Class<?> wildcardClass72 = objArray68.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        fila0.frente = 0;
        java.lang.Object[] objArray8 = fila0.item;
        boolean boolean9 = fila0.vazia();
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila4.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 100;
        java.lang.Object obj11 = fila7.desenfileira();
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object[] objArray13 = fila7.item;
        fila7.tras = 1;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray20 = fila16.item;
        fila7.item = objArray20;
        fila4.item = objArray20;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        java.lang.Object[] objArray28 = fila23.item;
        java.lang.Object[] objArray29 = fila23.item;
        fila23.tras = 1;
        boolean boolean32 = fila23.vazia();
        ds.Fila fila33 = new ds.Fila();
        fila33.frente = 0;
        int int36 = fila33.frente;
        java.lang.Object[] objArray37 = fila33.item;
        fila23.enfileira((java.lang.Object) fila33);
        java.lang.Object[] objArray39 = fila23.item;
        fila4.item = objArray39;
        int int41 = fila4.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        java.lang.Class<?> wildcardClass9 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        int int10 = fila7.frente;
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 0, obj12, (byte) 100 };
        fila7.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.tras = (short) 10;
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 100;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        java.lang.Object[] objArray27 = fila25.item;
        java.lang.Object[] objArray28 = fila25.item;
        fila21.item = objArray28;
        fila16.item = objArray28;
        fila7.enfileira((java.lang.Object) objArray28);
        fila0.item = objArray28;
        int int33 = fila0.frente;
        fila0.frente = (short) 100;
        java.lang.Object[] objArray36 = fila0.item;
        ds.Fila fila37 = new ds.Fila();
        fila37.frente = 0;
        int int40 = fila37.frente;
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 0, obj42, (byte) 100 };
        fila37.item = objArray44;
        int int46 = fila37.tras;
        boolean boolean47 = fila37.vazia();
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.tras;
        fila48.enfileira((java.lang.Object) (byte) -1);
        fila48.enfileira((java.lang.Object) (byte) 10);
        fila37.enfileira((java.lang.Object) (byte) 10);
        int int55 = fila37.frente;
        ds.Fila fila56 = new ds.Fila();
        int int57 = fila56.tras;
        fila56.frente = (short) 100;
        java.lang.Object obj60 = fila56.desenfileira();
        int int61 = fila56.frente;
        ds.Fila fila62 = new ds.Fila();
        fila62.frente = 0;
        int int65 = fila62.frente;
        java.lang.Object[] objArray66 = fila62.item;
        fila56.item = objArray66;
        boolean boolean68 = fila56.vazia();
        fila37.enfileira((java.lang.Object) fila56);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 101 + "'", int61 == 101);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        java.lang.Object[] objArray10 = fila7.item;
        ds.Fila fila11 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila11);
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.frente = (byte) -1;
        java.lang.Object[] objArray17 = fila7.item;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = 0;
        java.lang.Object[] objArray22 = fila19.item;
        fila19.frente = 'a';
        fila19.frente = (-1);
        fila0.enfileira((java.lang.Object) (-1));
        fila0.tras = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        boolean boolean2 = fila0.vazia();
        fila0.tras = 1;
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object[] objArray16 = fila10.item;
        int int17 = fila10.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.tras = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        fila0.item = objArray9;
        int int11 = fila0.tras;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        java.lang.Object[] objArray22 = fila20.item;
        fila16.item = objArray22;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.frente = (short) 100;
        java.lang.Object obj28 = fila24.desenfileira();
        java.lang.Object[] objArray29 = fila24.item;
        java.lang.Object[] objArray30 = fila24.item;
        fila16.enfileira((java.lang.Object) fila24);
        java.lang.Object[] objArray32 = fila16.item;
        fila0.enfileira((java.lang.Object) objArray32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.frente;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        java.lang.Object[] objArray18 = fila16.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.tras = (short) 10;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        java.lang.Object[] objArray26 = fila23.item;
        fila19.item = objArray26;
        fila19.tras = (-1);
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray34 = fila30.item;
        fila19.item = objArray34;
        fila19.frente = ' ';
        java.lang.Object[] objArray38 = fila19.item;
        fila16.item = objArray38;
        fila10.enfileira((java.lang.Object) fila16);
        ds.Fila fila41 = new ds.Fila();
        fila41.frente = 0;
        java.lang.Object[] objArray44 = fila41.item;
        fila41.tras = (short) 1;
        fila41.frente = 0;
        java.lang.Object[] objArray49 = fila41.item;
        boolean boolean50 = fila41.vazia();
        java.lang.Object[] objArray51 = fila41.item;
        fila10.item = objArray51;
        fila10.tras = (short) 0;
        int int55 = fila10.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.frente = 100;
        java.lang.Object obj18 = fila9.desenfileira();
        fila9.tras = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int11 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila9.tras = '4';
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        fila0.frente = 0;
        java.lang.Object[] objArray8 = fila0.item;
        boolean boolean9 = fila0.vazia();
        java.lang.Object[] objArray10 = fila0.item;
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        java.lang.Object[] objArray21 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        int int4 = fila0.frente;
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        int int11 = fila0.frente;
        fila0.frente = (short) -1;
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 100;
        java.lang.Object obj19 = fila15.desenfileira();
        java.lang.Object[] objArray20 = fila15.item;
        java.lang.Object[] objArray21 = fila15.item;
        fila15.tras = 1;
        boolean boolean24 = fila15.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.frente = 0;
        int int28 = fila25.frente;
        java.lang.Object[] objArray29 = fila25.item;
        fila15.enfileira((java.lang.Object) fila25);
        java.lang.Object[] objArray31 = fila25.item;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 100;
        java.lang.Object obj36 = fila32.desenfileira();
        java.lang.Object[] objArray37 = fila32.item;
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        fila38.frente = (short) 100;
        int int42 = fila38.frente;
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.tras;
        java.lang.Object[] objArray45 = fila43.item;
        java.lang.Object[] objArray46 = fila43.item;
        fila38.enfileira((java.lang.Object) objArray46);
        java.lang.Class<?> wildcardClass48 = objArray46.getClass();
        fila32.enfileira((java.lang.Object) objArray46);
        fila25.enfileira((java.lang.Object) objArray46);
        fila0.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        fila0.frente = '4';
        boolean boolean23 = fila0.vazia();
        boolean boolean24 = fila0.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.tras = (short) 10;
        fila0.enfileira((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.frente = 100;
        int int18 = fila9.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila19.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray25 = fila19.item;
        fila9.enfileira((java.lang.Object) fila19);
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 100;
        int int31 = fila27.tras;
        boolean boolean32 = fila27.vazia();
        java.lang.Object[] objArray33 = fila27.item;
        fila19.item = objArray33;
        java.lang.Object[] objArray35 = fila19.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila4.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.tras = (short) 10;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila7.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        fila16.tras = (short) 1;
        int int22 = fila16.frente;
        fila16.frente = (-1);
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.tras = (short) 10;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        java.lang.Object[] objArray32 = fila29.item;
        fila25.item = objArray32;
        fila16.enfileira((java.lang.Object) objArray32);
        ds.Fila fila35 = new ds.Fila();
        fila35.frente = 0;
        java.lang.Object[] objArray38 = fila35.item;
        fila16.item = objArray38;
        fila7.item = objArray38;
        fila7.frente = (short) 10;
        fila4.enfileira((java.lang.Object) (short) 10);
        fila4.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.tras = (-1);
        boolean boolean11 = fila0.vazia();
        int int12 = fila0.tras;
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = 0;
        java.lang.Object[] objArray19 = fila16.item;
        fila16.frente = 'a';
        fila16.tras = '4';
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.frente = (short) 100;
        java.lang.Object obj28 = fila24.desenfileira();
        int int29 = fila24.frente;
        fila16.enfileira((java.lang.Object) fila24);
        fila10.enfileira((java.lang.Object) fila24);
        fila24.tras = (byte) 1;
        fila24.tras = (short) -1;
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.tras;
        fila36.frente = (short) 100;
        fila36.tras = (short) 1;
        int int42 = fila36.frente;
        fila36.frente = (-1);
        ds.Fila fila45 = new ds.Fila();
        int int46 = fila45.tras;
        fila45.tras = (short) 10;
        ds.Fila fila49 = new ds.Fila();
        int int50 = fila49.tras;
        java.lang.Object[] objArray51 = fila49.item;
        java.lang.Object[] objArray52 = fila49.item;
        fila45.item = objArray52;
        fila36.enfileira((java.lang.Object) objArray52);
        ds.Fila fila55 = new ds.Fila();
        fila55.frente = 0;
        java.lang.Object[] objArray58 = fila55.item;
        fila36.item = objArray58;
        // The following exception was thrown during execution in test generation
        try {
            fila24.enfileira((java.lang.Object) fila36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.frente = 100;
        int int18 = fila9.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila19.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray25 = fila19.item;
        fila9.enfileira((java.lang.Object) fila19);
        fila9.frente = (short) 100;
        fila9.tras = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        int int11 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 97;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila10.item;
        boolean boolean15 = fila10.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        java.lang.Object obj20 = fila16.desenfileira();
        java.lang.Object[] objArray21 = fila16.item;
        fila10.item = objArray21;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        java.lang.Object obj27 = fila23.desenfileira();
        int int28 = fila23.frente;
        boolean boolean29 = fila23.vazia();
        fila10.enfileira((java.lang.Object) boolean29);
        fila10.frente = (byte) 0;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        java.lang.Object[] objArray35 = fila33.item;
        fila10.item = objArray35;
        fila7.enfileira((java.lang.Object) objArray35);
        fila0.item = objArray35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        fila0.frente = 10;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        int int11 = fila0.frente;
        fila0.frente = (short) 10;
        ds.Fila fila14 = new ds.Fila();
        fila14.frente = 0;
        java.lang.Object[] objArray17 = fila14.item;
        fila14.tras = (short) 1;
        fila14.frente = 0;
        java.lang.Object[] objArray22 = fila14.item;
        fila0.item = objArray22;
        java.lang.Class<?> wildcardClass24 = objArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        java.lang.Object[] objArray18 = fila16.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.tras = (short) 10;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        java.lang.Object[] objArray26 = fila23.item;
        fila19.item = objArray26;
        fila19.tras = (-1);
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray34 = fila30.item;
        fila19.item = objArray34;
        fila19.frente = ' ';
        java.lang.Object[] objArray38 = fila19.item;
        fila16.item = objArray38;
        fila10.enfileira((java.lang.Object) fila16);
        ds.Fila fila41 = new ds.Fila();
        fila41.frente = 0;
        java.lang.Object[] objArray44 = fila41.item;
        fila41.tras = (short) 1;
        fila41.frente = 0;
        java.lang.Object[] objArray49 = fila41.item;
        boolean boolean50 = fila41.vazia();
        java.lang.Object[] objArray51 = fila41.item;
        fila10.item = objArray51;
        ds.Fila fila53 = new ds.Fila();
        int int54 = fila53.tras;
        java.lang.Object[] objArray55 = fila53.item;
        boolean boolean56 = fila53.vazia();
        fila10.enfileira((java.lang.Object) boolean56);
        fila10.frente = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.frente = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        fila0.tras = 103;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.tras;
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) (byte) 10);
        fila0.enfileira((java.lang.Object) (byte) 10);
        int int18 = fila0.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        java.lang.Object obj23 = fila19.desenfileira();
        int int24 = fila19.frente;
        ds.Fila fila25 = new ds.Fila();
        fila25.frente = 0;
        int int28 = fila25.frente;
        java.lang.Object[] objArray29 = fila25.item;
        fila19.item = objArray29;
        boolean boolean31 = fila19.vazia();
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Object obj33 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        java.lang.Object[] objArray10 = fila7.item;
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean12 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean16 = fila0.vazia();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.frente = (short) 100;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        fila17.item = objArray23;
        boolean boolean25 = fila17.vazia();
        fila17.frente = (short) 0;
        fila17.imprime();
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        fila29.frente = (short) 100;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        java.lang.Object[] objArray35 = fila33.item;
        fila29.item = objArray35;
        fila17.item = objArray35;
        java.lang.Object[] objArray38 = fila17.item;
        fila0.item = objArray38;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        fila40.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray44 = fila40.item;
        int int45 = fila40.frente;
        fila40.frente = 101;
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.tras;
        fila48.frente = (short) 100;
        java.lang.Object obj52 = fila48.desenfileira();
        java.lang.Object[] objArray53 = fila48.item;
        java.lang.Object[] objArray54 = fila48.item;
        fila48.tras = 1;
        fila48.tras = (byte) 1;
        java.lang.Object[] objArray59 = fila48.item;
        fila40.enfileira((java.lang.Object) fila48);
        ds.Fila fila61 = new ds.Fila();
        int int62 = fila61.tras;
        fila61.frente = (short) 100;
        java.lang.Object obj65 = fila61.desenfileira();
        java.lang.Object[] objArray66 = fila61.item;
        java.lang.Object[] objArray67 = fila61.item;
        fila40.item = objArray67;
        fila0.enfileira((java.lang.Object) fila40);
        java.lang.Object[] objArray70 = fila40.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        fila8.frente = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 100;
        fila12.tras = (short) 1;
        int int18 = fila12.frente;
        fila0.enfileira((java.lang.Object) int18);
        boolean boolean20 = fila0.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.frente = 0;
        int int24 = fila21.frente;
        boolean boolean25 = fila21.vazia();
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        fila26.frente = (short) 100;
        java.lang.Object obj30 = fila26.desenfileira();
        java.lang.Object[] objArray31 = fila26.item;
        java.lang.Object[] objArray32 = fila26.item;
        fila26.tras = 1;
        boolean boolean35 = fila26.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.frente = 0;
        int int39 = fila36.frente;
        java.lang.Object[] objArray40 = fila36.item;
        fila26.enfileira((java.lang.Object) fila36);
        ds.Fila fila42 = new ds.Fila();
        int int43 = fila42.tras;
        fila42.frente = (short) 100;
        int int46 = fila42.tras;
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        fila47.frente = (short) 100;
        java.lang.Object obj51 = fila47.desenfileira();
        java.lang.Object[] objArray52 = fila47.item;
        java.lang.Object[] objArray53 = fila47.item;
        fila42.enfileira((java.lang.Object) objArray53);
        fila36.enfileira((java.lang.Object) objArray53);
        fila21.enfileira((java.lang.Object) objArray53);
        fila0.item = objArray53;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = 0;
        int int9 = fila6.frente;
        java.lang.Object[] objArray10 = fila6.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.frente = 0;
        java.lang.Object[] objArray16 = fila13.item;
        fila13.tras = (short) 1;
        fila13.frente = 0;
        java.lang.Object[] objArray21 = fila13.item;
        fila0.item = objArray21;
        int int23 = fila0.frente;
        java.lang.Object obj24 = null;
        fila0.enfileira(obj24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 100;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object[] objArray12 = fila9.item;
        fila5.item = objArray12;
        fila0.item = objArray12;
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray9 = fila5.item;
        boolean boolean10 = fila5.vazia();
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 100;
        java.lang.Object obj15 = fila11.desenfileira();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 100;
        java.lang.Object obj22 = fila18.desenfileira();
        int int23 = fila18.frente;
        boolean boolean24 = fila18.vazia();
        fila5.enfileira((java.lang.Object) boolean24);
        fila5.frente = (byte) 0;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        java.lang.Object[] objArray30 = fila28.item;
        fila5.item = objArray30;
        java.lang.Object[] objArray32 = fila5.item;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        fila33.frente = (short) 100;
        java.lang.Object obj37 = fila33.desenfileira();
        java.lang.Object[] objArray38 = fila33.item;
        java.lang.Object[] objArray39 = fila33.item;
        fila33.tras = 1;
        boolean boolean42 = fila33.vazia();
        ds.Fila fila43 = new ds.Fila();
        fila43.frente = 0;
        int int46 = fila43.frente;
        java.lang.Object[] objArray47 = fila43.item;
        fila33.enfileira((java.lang.Object) fila43);
        ds.Fila fila49 = new ds.Fila();
        int int50 = fila49.tras;
        fila49.frente = (short) 100;
        int int53 = fila49.tras;
        ds.Fila fila54 = new ds.Fila();
        int int55 = fila54.tras;
        fila54.frente = (short) 100;
        java.lang.Object obj58 = fila54.desenfileira();
        java.lang.Object[] objArray59 = fila54.item;
        java.lang.Object[] objArray60 = fila54.item;
        fila49.enfileira((java.lang.Object) objArray60);
        fila43.enfileira((java.lang.Object) objArray60);
        fila5.item = objArray60;
        fila0.item = objArray60;
        ds.Fila fila65 = new ds.Fila();
        int int66 = fila65.tras;
        boolean boolean67 = fila65.vazia();
        fila65.tras = (short) 10;
        fila0.enfileira((java.lang.Object) fila65);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object[] objArray16 = fila10.item;
        fila10.imprime();
        fila10.frente = (short) -1;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 100;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        java.lang.Object[] objArray29 = fila26.item;
        fila22.item = objArray29;
        ds.Fila fila31 = new ds.Fila();
        fila31.frente = 0;
        java.lang.Object[] objArray34 = fila31.item;
        fila31.frente = 'a';
        fila22.enfileira((java.lang.Object) fila31);
        fila31.frente = 100;
        java.lang.Class<?> wildcardClass40 = fila31.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass40);
        fila10.enfileira((java.lang.Object) wildcardClass40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        fila0.frente = 101;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        fila0.frente = 10;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = fila11.item;
        boolean boolean16 = fila11.vazia();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.frente = (short) 100;
        java.lang.Object obj21 = fila17.desenfileira();
        java.lang.Object[] objArray22 = fila17.item;
        fila11.item = objArray22;
        fila0.item = objArray22;
        int int25 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        int int18 = fila13.frente;
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        fila0.frente = (byte) 0;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        fila0.item = objArray25;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 100;
        java.lang.Object obj31 = fila27.desenfileira();
        int int32 = fila27.frente;
        ds.Fila fila33 = new ds.Fila();
        fila33.frente = 0;
        int int36 = fila33.frente;
        java.lang.Object[] objArray37 = fila33.item;
        fila27.item = objArray37;
        int int39 = fila27.frente;
        java.lang.Object[] objArray40 = fila27.item;
        fila0.item = objArray40;
        ds.Fila fila42 = new ds.Fila();
        int int43 = fila42.tras;
        fila42.frente = (short) 100;
        fila42.tras = (short) 1;
        int int48 = fila42.frente;
        fila42.frente = (-1);
        ds.Fila fila51 = new ds.Fila();
        int int52 = fila51.tras;
        fila51.tras = (short) 10;
        ds.Fila fila55 = new ds.Fila();
        int int56 = fila55.tras;
        java.lang.Object[] objArray57 = fila55.item;
        java.lang.Object[] objArray58 = fila55.item;
        fila51.item = objArray58;
        fila42.enfileira((java.lang.Object) objArray58);
        java.lang.Object[] objArray61 = fila42.item;
        fila0.item = objArray61;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) -1);
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray10 = fila6.item;
        boolean boolean11 = fila6.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 100;
        java.lang.Object obj16 = fila12.desenfileira();
        java.lang.Object[] objArray17 = fila12.item;
        fila6.item = objArray17;
        java.lang.Class<?> wildcardClass19 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        java.lang.Object[] objArray10 = fila7.item;
        fila0.enfileira((java.lang.Object) fila7);
        fila0.frente = '#';
        fila0.frente = (short) 100;
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.tras;
        fila2.frente = (short) 100;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        java.lang.Object[] objArray8 = fila6.item;
        java.lang.Object[] objArray9 = fila6.item;
        fila2.item = objArray9;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        java.lang.Object[] objArray14 = fila11.item;
        fila11.frente = 'a';
        fila2.enfileira((java.lang.Object) fila11);
        fila11.frente = 100;
        java.lang.Class<?> wildcardClass20 = fila11.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass20);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.enfileira((java.lang.Object) (byte) 100);
        fila0.frente = (short) 100;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 100;
        fila12.tras = (short) 1;
        int int18 = fila12.frente;
        fila0.enfileira((java.lang.Object) int18);
        java.lang.Object[] objArray20 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        int int18 = fila13.frente;
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        fila0.frente = (byte) 0;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        fila0.item = objArray25;
        java.lang.Object[] objArray27 = fila0.item;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 100;
        java.lang.Object obj32 = fila28.desenfileira();
        java.lang.Object[] objArray33 = fila28.item;
        java.lang.Object[] objArray34 = fila28.item;
        fila28.tras = 1;
        boolean boolean37 = fila28.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.frente = 0;
        int int41 = fila38.frente;
        java.lang.Object[] objArray42 = fila38.item;
        fila28.enfileira((java.lang.Object) fila38);
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.tras;
        fila44.frente = (short) 100;
        int int48 = fila44.tras;
        ds.Fila fila49 = new ds.Fila();
        int int50 = fila49.tras;
        fila49.frente = (short) 100;
        java.lang.Object obj53 = fila49.desenfileira();
        java.lang.Object[] objArray54 = fila49.item;
        java.lang.Object[] objArray55 = fila49.item;
        fila44.enfileira((java.lang.Object) objArray55);
        fila38.enfileira((java.lang.Object) objArray55);
        fila0.item = objArray55;
        fila0.tras = (short) 1;
        int int61 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        int int21 = fila0.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 100;
        int int26 = fila22.tras;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 100;
        java.lang.Object obj31 = fila27.desenfileira();
        java.lang.Object[] objArray32 = fila27.item;
        java.lang.Object[] objArray33 = fila27.item;
        fila22.enfileira((java.lang.Object) objArray33);
        ds.Fila fila35 = new ds.Fila();
        fila35.frente = 0;
        int int38 = fila35.frente;
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 0, obj40, (byte) 100 };
        fila35.item = objArray42;
        int int44 = fila35.frente;
        ds.Fila fila45 = new ds.Fila();
        int int46 = fila45.tras;
        fila45.frente = (short) 100;
        fila45.tras = (short) 1;
        int int51 = fila45.frente;
        ds.Fila fila52 = new ds.Fila();
        int int53 = fila52.tras;
        java.lang.Object[] objArray54 = fila52.item;
        java.lang.Object[] objArray55 = fila52.item;
        fila45.enfileira((java.lang.Object) fila52);
        fila45.frente = '#';
        fila35.enfileira((java.lang.Object) fila45);
        fila22.enfileira((java.lang.Object) fila35);
        fila35.frente = (byte) 10;
        fila0.enfileira((java.lang.Object) fila35);
        // The following exception was thrown during execution in test generation
        try {
            fila35.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 97;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray7 = fila3.item;
        boolean boolean8 = fila3.vazia();
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 100;
        java.lang.Object obj13 = fila9.desenfileira();
        java.lang.Object[] objArray14 = fila9.item;
        fila3.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 100;
        java.lang.Object obj20 = fila16.desenfileira();
        int int21 = fila16.frente;
        boolean boolean22 = fila16.vazia();
        fila3.enfileira((java.lang.Object) boolean22);
        fila3.frente = (byte) 0;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        fila3.item = objArray28;
        fila0.enfileira((java.lang.Object) objArray28);
        boolean boolean31 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        java.lang.Object[] objArray10 = fila7.item;
        fila7.tras = (short) 1;
        fila7.frente = 0;
        java.lang.Object[] objArray15 = fila7.item;
        boolean boolean16 = fila7.vazia();
        java.lang.Object[] objArray17 = fila7.item;
        fila0.item = objArray17;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila9.tras = '4';
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        java.lang.Object[] objArray21 = fila19.item;
        java.lang.Object[] objArray22 = fila19.item;
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object[] objArray16 = fila10.item;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.frente = (short) 100;
        java.lang.Object obj21 = fila17.desenfileira();
        java.lang.Object[] objArray22 = fila17.item;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 100;
        int int27 = fila23.frente;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        java.lang.Object[] objArray30 = fila28.item;
        java.lang.Object[] objArray31 = fila28.item;
        fila23.enfileira((java.lang.Object) objArray31);
        java.lang.Class<?> wildcardClass33 = objArray31.getClass();
        fila17.enfileira((java.lang.Object) objArray31);
        fila10.enfileira((java.lang.Object) objArray31);
        int int36 = fila10.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        java.lang.Object[] objArray10 = fila7.item;
        fila7.tras = (short) 1;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        java.lang.Object[] objArray18 = fila13.item;
        java.lang.Object[] objArray19 = fila13.item;
        fila13.tras = 1;
        java.lang.Object[] objArray22 = fila13.item;
        fila7.item = objArray22;
        java.lang.Object[] objArray24 = fila7.item;
        fila0.item = objArray24;
        java.lang.Object[] objArray26 = fila0.item;
        fila0.tras = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        java.lang.Object[] objArray18 = fila16.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.tras = (short) 10;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        java.lang.Object[] objArray26 = fila23.item;
        fila19.item = objArray26;
        fila19.tras = (-1);
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray34 = fila30.item;
        fila19.item = objArray34;
        fila19.frente = ' ';
        java.lang.Object[] objArray38 = fila19.item;
        fila16.item = objArray38;
        fila10.enfileira((java.lang.Object) fila16);
        ds.Fila fila41 = new ds.Fila();
        fila41.frente = 0;
        java.lang.Object[] objArray44 = fila41.item;
        fila41.tras = (short) 1;
        fila41.frente = 0;
        java.lang.Object[] objArray49 = fila41.item;
        boolean boolean50 = fila41.vazia();
        java.lang.Object[] objArray51 = fila41.item;
        fila10.item = objArray51;
        ds.Fila fila53 = new ds.Fila();
        int int54 = fila53.tras;
        java.lang.Object[] objArray55 = fila53.item;
        java.lang.Object[] objArray56 = fila53.item;
        ds.Fila fila57 = new ds.Fila();
        fila53.enfileira((java.lang.Object) fila57);
        java.lang.Object[] objArray59 = fila53.item;
        int int60 = fila53.frente;
        fila10.enfileira((java.lang.Object) int60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean6 = fila4.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 100;
        java.lang.Object obj11 = fila7.desenfileira();
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object[] objArray13 = fila7.item;
        fila7.tras = 1;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray20 = fila16.item;
        fila7.item = objArray20;
        fila4.item = objArray20;
        java.lang.Class<?> wildcardClass23 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.tras = (-1);
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = fila11.item;
        fila0.item = objArray15;
        fila0.frente = ' ';
        fila0.tras = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = 0;
        int int9 = fila6.frente;
        java.lang.Object[] objArray10 = fila6.item;
        fila0.item = objArray10;
        int int12 = fila0.frente;
        java.lang.Object[] objArray13 = fila0.item;
        fila0.tras = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        java.lang.Object obj13 = fila9.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 100;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        java.lang.Object[] objArray21 = fila18.item;
        fila14.item = objArray21;
        fila9.item = objArray21;
        fila0.enfileira((java.lang.Object) objArray21);
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 100;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        java.lang.Object[] objArray32 = fila29.item;
        fila25.item = objArray32;
        ds.Fila fila34 = new ds.Fila();
        fila34.frente = 0;
        java.lang.Object[] objArray37 = fila34.item;
        fila34.frente = 'a';
        fila25.enfileira((java.lang.Object) fila34);
        ds.Fila fila41 = new ds.Fila();
        fila41.frente = 0;
        int int44 = fila41.frente;
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 0, obj46, (byte) 100 };
        fila41.item = objArray48;
        fila25.item = objArray48;
        fila0.item = objArray48;
        fila0.tras = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        int int16 = fila8.frente;
        int int17 = fila8.tras;
        fila8.tras = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.tras = '#';
        java.lang.Object obj19 = fila0.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.frente = 0;
        java.lang.Object[] objArray23 = fila20.item;
        fila20.frente = 'a';
        fila20.tras = '4';
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 100;
        java.lang.Object obj32 = fila28.desenfileira();
        int int33 = fila28.frente;
        fila20.enfileira((java.lang.Object) fila28);
        java.lang.Object[] objArray35 = fila20.item;
        fila0.item = objArray35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 101 + "'", int33 == 101);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        fila0.tras = (byte) 100;
        fila0.tras = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        fila6.tras = ' ';
        int int18 = fila6.frente;
        fila6.tras = 2;
        fila6.tras = 0;
        int int23 = fila6.tras;
        boolean boolean24 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}

