package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test501");
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
        fila18.frente = 0;
        ds.Fila fila42 = new ds.Fila();
        java.lang.Object[] objArray43 = fila42.item;
        fila42.enfileira((java.lang.Object) 10.0f);
        int int46 = fila42.tras;
        int int47 = fila42.tras;
        fila42.tras = (byte) 100;
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 100);
        java.lang.Object obj53 = fila50.desenfileira();
        fila42.enfileira((java.lang.Object) fila50);
        fila42.tras = ' ';
        int int57 = fila42.tras;
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) (-1L));
        fila58.imprime();
        java.lang.Object[] objArray66 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila58.item = objArray66;
        int int68 = fila58.frente;
        ds.Fila fila69 = new ds.Fila();
        java.lang.Object[] objArray70 = fila69.item;
        fila58.enfileira((java.lang.Object) objArray70);
        fila58.enfileira((java.lang.Object) '#');
        ds.Fila fila74 = new ds.Fila();
        fila74.enfileira((java.lang.Object) (-1L));
        int int77 = fila74.tras;
        java.lang.Object[] objArray78 = fila74.item;
        fila58.item = objArray78;
        fila42.item = objArray78;
        ds.Fila fila81 = new ds.Fila();
        fila81.enfileira((java.lang.Object) (-1L));
        fila81.imprime();
        java.lang.Object[] objArray89 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila81.item = objArray89;
        fila42.enfileira((java.lang.Object) objArray89);
        fila18.enfileira((java.lang.Object) objArray89);
        fila15.enfileira((java.lang.Object) objArray89);
        fila15.imprime();
        int int95 = fila15.tras;
        boolean boolean96 = fila15.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100 + "'", obj53, 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 32 + "'", int57 == 32);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (-1L));
        fila9.imprime();
        java.lang.Object[] objArray17 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila9.item = objArray17;
        fila7.item = objArray17;
        java.lang.Object[] objArray20 = fila7.item;
        fila0.item = objArray20;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean9 = fila3.vazia();
        int int10 = fila3.tras;
        boolean boolean11 = fila3.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
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
        java.lang.Object[] objArray40 = fila0.item;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila41.enfileira((java.lang.Object) 10.0f);
        int int45 = fila41.tras;
        int int46 = fila41.tras;
        fila41.tras = (byte) 100;
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 100);
        java.lang.Object obj52 = fila49.desenfileira();
        fila41.enfileira((java.lang.Object) fila49);
        fila41.tras = ' ';
        int int56 = fila41.tras;
        int int57 = fila41.frente;
        java.lang.Object obj58 = fila41.desenfileira();
        int int59 = fila41.frente;
        java.lang.Object[] objArray60 = fila41.item;
        java.lang.Object[] objArray61 = fila41.item;
        fila0.item = objArray61;
        int int63 = fila0.frente;
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
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100 + "'", obj52, 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 32 + "'", int56 == 32);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 10.0f + "'", obj58, 10.0f);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.tras;
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        int int15 = fila10.tras;
        java.lang.Object[] objArray16 = fila10.item;
        fila0.item = objArray16;
        int int18 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
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
        java.lang.Object obj18 = null;
        fila0.enfileira(obj18);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
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
        fila0.tras = 4;
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
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
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
        int int11 = fila0.tras;
        int int12 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
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
        fila14.frente = (byte) 100;
        java.lang.Class<?> wildcardClass29 = fila14.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0f + "'", obj22, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
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
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
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
        fila8.imprime();
        int int88 = fila8.frente;
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
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        fila0.tras = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
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
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila17.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
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
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila17.item = objArray25;
        fila15.item = objArray25;
        boolean boolean28 = fila15.vazia();
        fila15.imprime();
        int int30 = fila15.tras;
        java.lang.Object[] objArray31 = fila15.item;
        fila0.item = objArray31;
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
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.tras = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 2;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj7 = fila3.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        fila8.item = objArray18;
        boolean boolean21 = fila8.vazia();
        fila8.frente = (byte) -1;
        fila3.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray25 = fila8.item;
        fila0.item = objArray25;
        java.lang.Object[] objArray27 = fila0.item;
        java.lang.Class<?> wildcardClass28 = objArray27.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0f + "'", obj7, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
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
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila22.enfileira((java.lang.Object) fila29);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
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
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj22 = fila18.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (-1L));
        fila23.imprime();
        java.lang.Object[] objArray31 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila23.item = objArray31;
        int int33 = fila23.frente;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        fila23.enfileira((java.lang.Object) objArray35);
        fila23.enfileira((java.lang.Object) '#');
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        int int42 = fila39.tras;
        java.lang.Object[] objArray43 = fila39.item;
        fila23.item = objArray43;
        fila18.enfileira((java.lang.Object) objArray43);
        java.lang.Object[] objArray46 = fila18.item;
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (-1L));
        fila47.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila47.item = objArray55;
        ds.Fila fila57 = new ds.Fila();
        java.lang.Object[] objArray58 = fila57.item;
        fila47.item = objArray58;
        java.lang.Object[] objArray60 = fila47.item;
        java.lang.Object[] objArray61 = fila47.item;
        int int62 = fila47.frente;
        java.lang.Object[] objArray63 = fila47.item;
        fila18.item = objArray63;
        fila0.item = objArray63;
        ds.Fila fila66 = new ds.Fila();
        boolean boolean67 = fila66.vazia();
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
        fila66.item = objArray93;
        int int97 = fila66.frente;
        fila0.enfileira((java.lang.Object) fila66);
        int int99 = fila66.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0f + "'", obj7, 10.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0f + "'", obj22, 10.0f);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 10.0f + "'", obj72, 10.0f);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        fila0.frente = (byte) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        fila0.frente = 33;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
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
        boolean boolean18 = fila3.vazia();
        int int19 = fila3.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
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
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        java.lang.Object[] objArray18 = fila13.item;
        int int19 = fila13.frente;
        fila0.enfileira((java.lang.Object) int19);
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
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
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
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
        java.lang.Object[] objArray17 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray10 = fila0.item;
        boolean boolean11 = fila0.vazia();
        int int12 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
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
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.enfileira((java.lang.Object) 10.0f);
        int int30 = fila26.tras;
        int int31 = fila26.tras;
        fila26.tras = (byte) 100;
        int int34 = fila26.frente;
        fila26.tras = (byte) 0;
        fila26.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        boolean boolean43 = fila39.vazia();
        boolean boolean44 = fila39.vazia();
        java.lang.Object obj45 = fila39.desenfileira();
        int int46 = fila39.tras;
        fila39.frente = (byte) 0;
        boolean boolean49 = fila39.vazia();
        int int50 = fila39.frente;
        fila39.imprime();
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray53 = fila52.item;
        java.lang.Object[] objArray54 = fila52.item;
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 100);
        fila55.frente = (short) 0;
        fila52.enfileira((java.lang.Object) fila55);
        java.lang.Object[] objArray61 = fila52.item;
        fila39.item = objArray61;
        fila26.enfileira((java.lang.Object) objArray61);
        fila3.item = objArray61;
        int int65 = fila3.tras;
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
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1L) + "'", obj45, (-1L));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
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
        java.lang.Object[] objArray20 = fila15.item;
        fila15.tras = (short) 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.imprime();
        int int7 = fila0.frente;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (-1L));
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        fila0.enfileira((java.lang.Object) fila11);
        int int19 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        fila0.imprime();
        fila0.imprime();
        fila0.frente = 101;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
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
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object[] objArray9 = fila0.item;
        fila0.frente = (short) 100;
        boolean boolean12 = fila0.vazia();
        java.lang.Object[] objArray13 = fila0.item;
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
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
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        int int23 = fila13.frente;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila13.enfileira((java.lang.Object) objArray25);
        fila13.enfileira((java.lang.Object) '#');
        int int29 = fila13.frente;
        java.lang.Object[] objArray30 = fila13.item;
        fila13.frente = '#';
        java.lang.Object[] objArray33 = null;
        fila13.item = objArray33;
        fila13.frente = (short) 1;
        fila0.enfileira((java.lang.Object) (short) 1);
        boolean boolean38 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 1;
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
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
        java.lang.Object[] objArray20 = fila19.item;
        java.lang.Object[] objArray21 = fila19.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        fila22.frente = (short) 0;
        fila19.enfileira((java.lang.Object) fila22);
        boolean boolean28 = fila22.vazia();
        int int29 = fila22.tras;
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        fila30.imprime();
        java.lang.Object[] objArray38 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila30.item = objArray38;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila30.item = objArray41;
        fila22.item = objArray41;
        fila0.item = objArray41;
        java.lang.Object[] objArray45 = fila0.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
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
        int int52 = fila0.frente;
        ds.Fila fila53 = new ds.Fila();
        java.lang.Object[] objArray54 = fila53.item;
        java.lang.Object[] objArray55 = fila53.item;
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 100);
        fila56.frente = (short) 0;
        fila53.enfileira((java.lang.Object) fila56);
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) (-1L));
        fila62.imprime();
        boolean boolean66 = fila62.vazia();
        java.lang.Object[] objArray67 = fila62.item;
        fila53.item = objArray67;
        fila53.frente = (short) 1;
        ds.Fila fila71 = new ds.Fila();
        java.lang.Object[] objArray72 = fila71.item;
        java.lang.Object[] objArray73 = fila71.item;
        ds.Fila fila74 = new ds.Fila();
        fila74.enfileira((java.lang.Object) 100);
        fila74.frente = (short) 0;
        fila71.enfileira((java.lang.Object) fila74);
        ds.Fila fila80 = new ds.Fila();
        fila80.enfileira((java.lang.Object) (-1L));
        fila71.enfileira((java.lang.Object) (-1L));
        ds.Fila fila84 = new ds.Fila();
        boolean boolean85 = fila84.vazia();
        ds.Fila fila86 = new ds.Fila();
        java.lang.Object[] objArray87 = fila86.item;
        fila86.enfileira((java.lang.Object) 10.0f);
        int int90 = fila86.tras;
        int int91 = fila86.tras;
        java.lang.Object[] objArray92 = fila86.item;
        fila84.item = objArray92;
        fila71.item = objArray92;
        fila53.item = objArray92;
        fila0.item = objArray92;
        int int97 = fila0.tras;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        fila0.tras = 'a';
        int int10 = fila0.tras;
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
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
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        fila19.imprime();
        boolean boolean23 = fila19.vazia();
        boolean boolean24 = fila19.vazia();
        java.lang.Object obj25 = fila19.desenfileira();
        int int26 = fila19.tras;
        fila19.frente = (byte) 0;
        boolean boolean29 = fila19.vazia();
        int int30 = fila19.frente;
        fila19.imprime();
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        java.lang.Object[] objArray34 = fila32.item;
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100);
        fila35.frente = (short) 0;
        fila32.enfileira((java.lang.Object) fila35);
        java.lang.Object[] objArray41 = fila32.item;
        fila19.item = objArray41;
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Object obj44 = fila19.desenfileira();
        fila19.tras = 32;
        int int47 = fila19.tras;
        java.lang.Object obj48 = fila19.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
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
        boolean boolean53 = fila0.vazia();
        int int54 = fila0.tras;
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
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
        fila15.frente = 33;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        java.lang.Object[] objArray38 = fila36.item;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 100);
        fila39.frente = (short) 0;
        fila36.enfileira((java.lang.Object) fila39);
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        fila45.enfileira((java.lang.Object) 10.0f);
        int int49 = fila45.tras;
        fila45.frente = (-1);
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray53 = fila52.item;
        java.lang.Object[] objArray54 = fila52.item;
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 100);
        fila55.frente = (short) 0;
        fila52.enfileira((java.lang.Object) fila55);
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) (-1L));
        fila61.imprime();
        boolean boolean65 = fila61.vazia();
        java.lang.Object[] objArray66 = fila61.item;
        fila52.item = objArray66;
        fila45.enfileira((java.lang.Object) objArray66);
        fila36.item = objArray66;
        ds.Fila fila70 = new ds.Fila();
        java.lang.Object[] objArray71 = fila70.item;
        java.lang.Object[] objArray72 = fila70.item;
        ds.Fila fila73 = new ds.Fila();
        fila73.enfileira((java.lang.Object) 100);
        fila73.frente = (short) 0;
        fila70.enfileira((java.lang.Object) fila73);
        ds.Fila fila79 = new ds.Fila();
        fila79.enfileira((java.lang.Object) (-1L));
        fila70.enfileira((java.lang.Object) (-1L));
        ds.Fila fila83 = new ds.Fila();
        boolean boolean84 = fila83.vazia();
        ds.Fila fila85 = new ds.Fila();
        java.lang.Object[] objArray86 = fila85.item;
        fila85.enfileira((java.lang.Object) 10.0f);
        int int89 = fila85.tras;
        int int90 = fila85.tras;
        java.lang.Object[] objArray91 = fila85.item;
        fila83.item = objArray91;
        fila70.item = objArray91;
        fila36.item = objArray91;
        fila15.enfileira((java.lang.Object) objArray91);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
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
        java.lang.Object[] objArray48 = fila0.item;
        fila0.imprime();
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
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        fila0.tras = 3;
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        fila0.frente = (byte) 1;
        int int10 = fila0.frente;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
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
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.tras = 100;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
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
        int int15 = fila0.tras;
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
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
        fila0.frente = (byte) 1;
        ds.Fila fila73 = new ds.Fila();
        fila73.enfileira((java.lang.Object) (-1L));
        fila73.imprime();
        fila73.imprime();
        int int78 = fila73.frente;
        fila73.imprime();
        fila73.frente = '4';
        fila0.enfileira((java.lang.Object) '4');
        int int83 = fila0.tras;
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
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
        fila0.frente = (byte) 0;
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
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
        int int23 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        int int7 = fila0.tras;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        fila0.frente = 1;
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
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
        fila6.frente = 2;
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
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
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
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.tras = 33;
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
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
        int int17 = fila3.tras;
        int int18 = fila3.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
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
        java.lang.Object obj24 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
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
        fila0.frente = 98;
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
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
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
        java.lang.Class<?> wildcardClass21 = objArray19.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1L) + "'", obj5, (-1L));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
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
        fila15.tras = (short) -1;
        java.lang.Object obj19 = fila15.desenfileira();
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray21 = fila15.item;
        java.lang.Class<?> wildcardClass22 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
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
        boolean boolean33 = fila13.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (-1L));
        fila34.imprime();
        boolean boolean38 = fila34.vazia();
        java.lang.Object[] objArray39 = fila34.item;
        java.lang.Object[] objArray40 = fila34.item;
        fila13.item = objArray40;
        int int42 = fila13.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, 100.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, 100.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.imprime();
        fila0.frente = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) (-1L));
        fila3.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila3.item = objArray11;
        int int13 = fila3.frente;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila3.enfileira((java.lang.Object) objArray15);
        fila3.enfileira((java.lang.Object) '#');
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        int int22 = fila19.tras;
        java.lang.Object[] objArray23 = fila19.item;
        fila3.item = objArray23;
        fila0.item = objArray23;
        fila0.imprime();
        int int27 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
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
        boolean boolean13 = fila8.vazia();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) 10.0f);
        int int18 = fila14.tras;
        int int19 = fila14.tras;
        fila14.tras = (byte) 100;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        java.lang.Object obj25 = fila22.desenfileira();
        fila14.enfileira((java.lang.Object) fila22);
        fila14.tras = ' ';
        int int29 = fila14.tras;
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
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (-1L));
        int int49 = fila46.tras;
        java.lang.Object[] objArray50 = fila46.item;
        fila30.item = objArray50;
        fila14.item = objArray50;
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (-1L));
        fila53.imprime();
        java.lang.Object[] objArray61 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila53.item = objArray61;
        fila14.enfileira((java.lang.Object) objArray61);
        fila14.frente = 0;
        java.lang.Object obj66 = fila14.desenfileira();
        boolean boolean67 = fila14.vazia();
        fila8.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100 + "'", obj25, 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (-1L) + "'", obj66, (-1L));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        java.lang.Object[] objArray11 = fila3.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.tras;
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        int int15 = fila10.tras;
        java.lang.Object[] objArray16 = fila10.item;
        fila0.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        int int20 = fila18.frente;
        fila18.imprime();
        java.lang.Object[] objArray22 = fila18.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) 10.0f);
        int int27 = fila23.tras;
        fila23.frente = (-1);
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        java.lang.Object[] objArray32 = fila30.item;
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100);
        fila33.frente = (short) 0;
        fila30.enfileira((java.lang.Object) fila33);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        boolean boolean43 = fila39.vazia();
        java.lang.Object[] objArray44 = fila39.item;
        fila30.item = objArray44;
        fila23.enfileira((java.lang.Object) objArray44);
        fila18.item = objArray44;
        fila0.item = objArray44;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
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
        boolean boolean57 = fila6.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.frente;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        fila0.frente = 2;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (-1L));
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila11.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (-1L));
        fila18.imprime();
        fila18.imprime();
        int int23 = fila18.frente;
        java.lang.Object[] objArray24 = fila18.item;
        boolean boolean25 = fila18.vazia();
        java.lang.Object[] objArray26 = fila18.item;
        fila11.item = objArray26;
        fila11.tras = 35;
        fila0.enfileira((java.lang.Object) 35);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
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
        fila0.frente = (short) 10;
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
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
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
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
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
        boolean boolean15 = fila0.vazia();
        int int16 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
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
        fila19.enfileira((java.lang.Object) (-1L));
        fila19.imprime();
        java.lang.Object[] objArray27 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila19.item = objArray27;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila19.item = objArray30;
        int int32 = fila19.tras;
        fila19.tras = (byte) 1;
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100);
        fila35.frente = (short) 0;
        fila19.enfileira((java.lang.Object) (short) 0);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (-1L));
        fila41.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila41.item = objArray49;
        int int51 = fila41.frente;
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray53 = fila52.item;
        fila41.enfileira((java.lang.Object) objArray53);
        fila19.item = objArray53;
        fila15.item = objArray53;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
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
        java.lang.Object obj17 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '#' + "'", obj17, '#');
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
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
        int int43 = fila0.tras;
        fila0.imprime();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        fila8.imprime();
        fila8.imprime();
        java.lang.Object obj13 = fila8.desenfileira();
        fila8.enfileira((java.lang.Object) (-1));
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        java.lang.Object[] objArray27 = fila16.item;
        fila8.item = objArray27;
        fila0.item = objArray27;
        int int30 = fila0.tras;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila33.tras = (short) 0;
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        int int40 = fila37.tras;
        ds.Fila fila41 = new ds.Fila();
        boolean boolean42 = fila41.vazia();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (-1L));
        fila43.imprime();
        java.lang.Object[] objArray51 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila43.item = objArray51;
        fila41.item = objArray51;
        ds.Fila fila55 = new ds.Fila();
        java.lang.Object[] objArray56 = fila55.item;
        fila55.enfileira((java.lang.Object) 10.0f);
        int int59 = fila55.tras;
        int int60 = fila55.tras;
        fila55.tras = (byte) 100;
        java.lang.Class<?> wildcardClass63 = fila55.getClass();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) (-1L));
        fila64.imprime();
        java.lang.Object[] objArray72 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila64.item = objArray72;
        ds.Fila fila74 = new ds.Fila();
        java.lang.Object[] objArray75 = fila74.item;
        fila64.item = objArray75;
        int int77 = fila64.tras;
        int int78 = fila64.tras;
        ds.Fila fila80 = new ds.Fila();
        fila80.enfileira((java.lang.Object) (-1L));
        fila80.imprime();
        java.lang.Object[] objArray88 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila80.item = objArray88;
        int int90 = fila80.frente;
        java.lang.Object[] objArray91 = new java.lang.Object[] { (-1), wildcardClass63, fila64, (byte) 0, int90 };
        fila41.item = objArray91;
        fila37.item = objArray91;
        fila33.item = objArray91;
        fila31.enfileira((java.lang.Object) fila33);
        java.lang.Object[] objArray96 = fila31.item;
        fila0.enfileira((java.lang.Object) objArray96);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(objArray96);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        java.lang.Object[] objArray5 = fila3.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 100);
        fila6.frente = (short) 0;
        fila3.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) 10.0f);
        int int16 = fila12.tras;
        fila12.frente = (-1);
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        java.lang.Object[] objArray21 = fila19.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        fila22.frente = (short) 0;
        fila19.enfileira((java.lang.Object) fila22);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (-1L));
        fila28.imprime();
        boolean boolean32 = fila28.vazia();
        java.lang.Object[] objArray33 = fila28.item;
        fila19.item = objArray33;
        fila12.enfileira((java.lang.Object) objArray33);
        fila3.item = objArray33;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        java.lang.Object[] objArray39 = fila37.item;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 100);
        fila40.frente = (short) 0;
        fila37.enfileira((java.lang.Object) fila40);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (-1L));
        fila37.enfileira((java.lang.Object) (-1L));
        ds.Fila fila50 = new ds.Fila();
        boolean boolean51 = fila50.vazia();
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray53 = fila52.item;
        fila52.enfileira((java.lang.Object) 10.0f);
        int int56 = fila52.tras;
        int int57 = fila52.tras;
        java.lang.Object[] objArray58 = fila52.item;
        fila50.item = objArray58;
        fila37.item = objArray58;
        fila3.item = objArray58;
        fila0.item = objArray58;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean9 = fila3.vazia();
        int int10 = fila3.tras;
        java.lang.Object[] objArray11 = fila3.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (-1L));
        fila12.imprime();
        boolean boolean16 = fila12.vazia();
        int int17 = fila12.tras;
        fila3.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
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
        fila15.frente = 33;
        java.lang.Object[] objArray36 = fila15.item;
        java.lang.Object[] objArray37 = fila15.item;
        int int38 = fila15.frente;
        java.lang.Class<?> wildcardClass39 = fila15.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 33 + "'", int38 == 33);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.tras = (short) -1;
        int int12 = fila8.frente;
        java.lang.Object obj13 = fila8.desenfileira();
        fila8.tras = 0;
        fila8.frente = (byte) 0;
        java.lang.Object[] objArray18 = fila8.item;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = (-1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
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
        fila0.tras = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.tras = 33;
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        fila0.frente = (byte) 1;
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) 10.0f);
        int int15 = fila11.tras;
        fila11.frente = (-1);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        java.lang.Object[] objArray20 = fila18.item;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        fila21.frente = (short) 0;
        fila18.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        fila27.imprime();
        boolean boolean31 = fila27.vazia();
        java.lang.Object[] objArray32 = fila27.item;
        fila18.item = objArray32;
        fila11.enfileira((java.lang.Object) objArray32);
        fila11.frente = 0;
        fila0.enfileira((java.lang.Object) fila11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
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
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        fila19.imprime();
        fila19.imprime();
        java.lang.Object obj24 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (-1));
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        fila27.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila27.item = objArray35;
        int int37 = fila27.frente;
        java.lang.Object[] objArray38 = fila27.item;
        fila19.item = objArray38;
        fila0.item = objArray38;
        java.lang.Object[] objArray41 = fila0.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) (-1L));
        fila2.imprime();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila2.item = objArray10;
        fila0.item = objArray10;
        int int13 = fila0.frente;
        int int14 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        java.lang.Object obj10 = fila3.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100 + "'", obj10, 100);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
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
        int int33 = fila0.tras;
        boolean boolean34 = fila0.vazia();
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 33 + "'", int33 == 33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
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
        java.lang.Class<?> wildcardClass59 = fila0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1L) + "'", obj3, (-1L));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object[] objArray9 = fila0.item;
        fila0.frente = (short) 100;
        boolean boolean12 = fila0.vazia();
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        fila0.frente = 0;
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
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
        int int37 = fila20.tras;
        fila20.tras = 0;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
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
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        java.lang.Object[] objArray33 = fila31.item;
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 100);
        fila34.frente = (short) 0;
        fila31.enfileira((java.lang.Object) fila34);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 100);
        fila40.imprime();
        fila31.enfileira((java.lang.Object) fila40);
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        fila45.imprime();
        java.lang.Object[] objArray53 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila45.item = objArray53;
        int int55 = fila45.frente;
        java.lang.Object[] objArray56 = fila45.item;
        java.lang.Object[] objArray57 = fila45.item;
        java.lang.Object obj58 = fila45.desenfileira();
        boolean boolean59 = fila45.vazia();
        ds.Fila fila60 = new ds.Fila();
        boolean boolean61 = fila60.vazia();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) (-1L));
        fila62.imprime();
        java.lang.Object[] objArray70 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila62.item = objArray70;
        fila60.item = objArray70;
        boolean boolean73 = fila60.vazia();
        fila60.imprime();
        int int75 = fila60.tras;
        java.lang.Object[] objArray76 = fila60.item;
        fila45.item = objArray76;
        fila40.item = objArray76;
        java.lang.Object obj79 = fila40.desenfileira();
        boolean boolean80 = fila40.vazia();
        fila9.enfileira((java.lang.Object) fila40);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + '#' + "'", obj58, '#');
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + '#' + "'", obj79, '#');
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.imprime();
        int int7 = fila0.frente;
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj13 = fila9.desenfileira();
        int int14 = fila9.frente;
        fila9.tras = 0;
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
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
        ds.Fila fila65 = new ds.Fila();
        fila65.enfileira((java.lang.Object) (-1L));
        fila65.imprime();
        java.lang.Object[] objArray73 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila65.item = objArray73;
        ds.Fila fila75 = new ds.Fila();
        java.lang.Object[] objArray76 = fila75.item;
        fila65.item = objArray76;
        fila0.item = objArray76;
        java.lang.Object obj79 = fila0.desenfileira();
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
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        int int8 = fila0.tras;
        int int9 = fila0.frente;
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
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
        java.lang.Object obj52 = fila0.desenfileira();
        boolean boolean53 = fila0.vazia();
        java.lang.Object[] objArray54 = fila0.item;
        java.lang.Object[] objArray55 = fila0.item;
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
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1L) + "'", obj52, (-1L));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
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
        fila0.frente = (byte) -1;
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
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
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
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
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
        fila3.tras = 32;
        java.lang.Object[] objArray20 = fila3.item;
        java.lang.Object[] objArray21 = fila3.item;
        fila3.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
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
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.enfileira((java.lang.Object) 10.0f);
        int int26 = fila22.tras;
        int int27 = fila22.tras;
        fila22.tras = (byte) 100;
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 100);
        java.lang.Object obj33 = fila30.desenfileira();
        fila22.enfileira((java.lang.Object) fila30);
        fila22.tras = ' ';
        int int37 = fila22.tras;
        int int38 = fila22.frente;
        boolean boolean39 = fila22.vazia();
        int int40 = fila22.frente;
        int int41 = fila22.tras;
        ds.Fila fila42 = new ds.Fila();
        java.lang.Object[] objArray43 = fila42.item;
        fila42.enfileira((java.lang.Object) 10.0f);
        int int46 = fila42.tras;
        int int47 = fila42.tras;
        fila42.tras = (byte) 100;
        ds.Fila fila50 = new ds.Fila();
        boolean boolean51 = fila50.vazia();
        int int52 = fila50.frente;
        fila42.enfileira((java.lang.Object) int52);
        fila22.enfileira((java.lang.Object) int52);
        int int55 = fila22.tras;
        boolean boolean56 = fila22.vazia();
        fila15.enfileira((java.lang.Object) boolean56);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100 + "'", obj33, 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 33 + "'", int55 == 33);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
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
        java.lang.Object[] objArray16 = fila0.item;
        int int17 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        fila0.frente = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
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
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = fila9.item;
        java.lang.Object obj17 = fila9.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100 + "'", obj17, 100);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
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
        fila0.frente = (byte) 10;
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray29 = fila26.item;
        fila0.enfileira((java.lang.Object) objArray29);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
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
        fila0.imprime();
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        int int8 = fila0.tras;
        int int9 = fila0.frente;
        int int10 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
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
        fila0.tras = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        fila0.frente = 3;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
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
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
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
        java.lang.Object[] objArray39 = null;
        fila0.item = objArray39;
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
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object[] objArray9 = fila0.item;
        fila0.frente = (short) 100;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
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
        int int19 = fila0.frente;
        int int20 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
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
        int int40 = fila3.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass8);
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
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
        java.lang.Object obj58 = fila0.desenfileira();
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
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
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
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object obj14 = null;
        fila8.enfileira(obj14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        fila0.frente = (byte) 1;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
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
        int int28 = fila0.tras;
        fila0.tras = (-1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        int int10 = fila0.tras;
        int int11 = fila0.tras;
        int int12 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
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
        java.lang.Object obj26 = fila9.desenfileira();
        int int27 = fila9.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0f + "'", obj26, 10.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = 4;
        fila0.frente = ' ';
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        java.lang.Object[] objArray11 = fila9.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 100);
        fila12.frente = (short) 0;
        fila9.enfileira((java.lang.Object) fila12);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (-1L));
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        java.lang.Object[] objArray23 = fila18.item;
        fila9.item = objArray23;
        fila0.item = objArray23;
        java.lang.Object[] objArray26 = fila0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
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
        fila0.frente = 32;
        int int13 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
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
        java.lang.Object[] objArray13 = fila8.item;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.tras = (short) -1;
        int int18 = fila14.frente;
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.tras = 0;
        fila14.frente = (byte) 0;
        java.lang.Object[] objArray24 = fila14.item;
        java.lang.Object[] objArray25 = fila14.item;
        fila8.enfileira((java.lang.Object) objArray25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
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
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila0.item = objArray34;
        fila0.tras = 100;
        java.lang.Object[] objArray38 = fila0.item;
        int int39 = fila0.frente;
        fila0.tras = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        fila0.imprime();
        fila0.tras = 33;
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        int int20 = fila10.frente;
        java.lang.Object[] objArray21 = fila10.item;
        java.lang.Object[] objArray22 = fila10.item;
        fila0.item = objArray22;
        int int24 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) (-1L));
        fila3.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila3.item = objArray11;
        int int13 = fila3.frente;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila3.enfileira((java.lang.Object) objArray15);
        fila3.enfileira((java.lang.Object) '#');
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        int int22 = fila19.tras;
        java.lang.Object[] objArray23 = fila19.item;
        fila3.item = objArray23;
        fila0.item = objArray23;
        fila0.tras = (byte) 100;
        int int28 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        fila3.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
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
        fila3.frente = (byte) 1;
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) (-1L));
        fila42.imprime();
        java.lang.Object[] objArray50 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila42.item = objArray50;
        fila40.item = objArray50;
        boolean boolean53 = fila40.vazia();
        fila40.imprime();
        int int55 = fila40.tras;
        java.lang.Object[] objArray56 = fila40.item;
        java.lang.Object[] objArray57 = fila40.item;
        int int58 = fila40.frente;
        fila40.imprime();
        fila3.enfileira((java.lang.Object) fila40);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) 10.0f);
        int int18 = fila14.tras;
        int int19 = fila14.tras;
        fila14.tras = (byte) 100;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        java.lang.Object obj25 = fila22.desenfileira();
        fila14.enfileira((java.lang.Object) fila22);
        fila14.tras = ' ';
        int int29 = fila14.tras;
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
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (-1L));
        int int49 = fila46.tras;
        java.lang.Object[] objArray50 = fila46.item;
        fila30.item = objArray50;
        fila14.item = objArray50;
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (-1L));
        fila53.imprime();
        java.lang.Object[] objArray61 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila53.item = objArray61;
        fila14.enfileira((java.lang.Object) objArray61);
        int int64 = fila14.tras;
        java.lang.Object[] objArray65 = fila14.item;
        fila0.item = objArray65;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100 + "'", obj25, 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 33 + "'", int64 == 33);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
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
        fila3.frente = '4';
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) 10.0f);
        int int25 = fila21.tras;
        fila21.frente = 0;
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass29);
        boolean boolean31 = fila21.vazia();
        fila21.imprime();
        fila3.enfileira((java.lang.Object) fila21);
        boolean boolean34 = fila3.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
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
        fila12.frente = 3;
        boolean boolean40 = fila12.vazia();
        java.lang.Object[] objArray41 = fila12.item;
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.frente;
        int int4 = fila0.tras;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (-1L));
        fila5.imprime();
        java.lang.Object[] objArray13 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila5.item = objArray13;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila5.item = objArray16;
        java.lang.Object[] objArray18 = fila5.item;
        java.lang.Object[] objArray19 = fila5.item;
        java.lang.Object[] objArray20 = fila5.item;
        fila0.item = objArray20;
        fila0.frente = 1;
        boolean boolean24 = fila0.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila25.item = objArray33;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila25.item = objArray36;
        int int38 = fila25.tras;
        int int39 = fila25.frente;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila25.enfileira((java.lang.Object) fila40);
        int int43 = fila40.tras;
        int int44 = fila40.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) int44);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
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
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        fila45.enfileira((java.lang.Object) 10.0f);
        int int49 = fila45.tras;
        int int50 = fila45.tras;
        java.lang.Object[] objArray51 = fila45.item;
        java.lang.Object obj52 = fila45.desenfileira();
        int int53 = fila45.frente;
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray57 = fila54.item;
        fila54.tras = (short) 1;
        int int60 = fila54.frente;
        java.lang.Object[] objArray61 = fila54.item;
        fila45.enfileira((java.lang.Object) objArray61);
        fila0.item = objArray61;
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
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 10.0f + "'", obj52, 10.0f);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
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
        boolean boolean21 = fila9.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
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
        fila0.imprime();
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
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
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
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
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
        fila0.frente = 0;
        fila0.frente = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = ' ';
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
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
        boolean boolean18 = fila3.vazia();
        fila3.tras = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
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
        int int33 = fila0.tras;
        boolean boolean34 = fila0.vazia();
        java.lang.Object obj35 = fila0.desenfileira();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 33 + "'", int33 == 33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10.0f + "'", obj35, 10.0f);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
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
        java.lang.Class<?> wildcardClass56 = fila0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
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
        int int15 = fila0.tras;
        fila0.tras = 32;
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = 0;
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = 101;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
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
        java.lang.Object[] objArray43 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
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
        ds.Fila fila41 = new ds.Fila();
        boolean boolean42 = fila41.vazia();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (-1L));
        fila43.imprime();
        java.lang.Object[] objArray51 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila43.item = objArray51;
        fila41.item = objArray51;
        boolean boolean54 = fila41.vazia();
        fila41.imprime();
        ds.Fila fila56 = new ds.Fila();
        boolean boolean57 = fila56.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) (-1L));
        fila58.imprime();
        java.lang.Object[] objArray66 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila58.item = objArray66;
        fila56.item = objArray66;
        fila41.item = objArray66;
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) (-1L));
        fila70.imprime();
        java.lang.Object[] objArray78 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila70.item = objArray78;
        java.lang.Object obj80 = fila70.desenfileira();
        java.lang.Object[] objArray81 = fila70.item;
        fila41.item = objArray81;
        int int83 = fila41.frente;
        java.lang.Object[] objArray84 = fila41.item;
        fila20.enfileira((java.lang.Object) fila41);
        boolean boolean86 = fila20.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + '#' + "'", obj80, '#');
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
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
        fila0.frente = (byte) 0;
        fila0.frente = 100;
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
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
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
        java.lang.Object obj13 = fila0.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) 10.0f);
        int int18 = fila14.tras;
        fila14.frente = 0;
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass22);
        boolean boolean24 = fila14.vazia();
        java.lang.Object obj25 = fila14.desenfileira();
        int int26 = fila14.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila27.enfileira((java.lang.Object) 10.0f);
        int int31 = fila27.tras;
        int int32 = fila27.tras;
        fila27.tras = (byte) 100;
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        int int37 = fila35.frente;
        fila27.enfileira((java.lang.Object) int37);
        int int39 = fila27.tras;
        ds.Fila fila40 = new ds.Fila();
        fila40.frente = 2;
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object[] objArray44 = fila43.item;
        fila43.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj47 = fila43.desenfileira();
        ds.Fila fila48 = new ds.Fila();
        boolean boolean49 = fila48.vazia();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) (-1L));
        fila50.imprime();
        java.lang.Object[] objArray58 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila50.item = objArray58;
        fila48.item = objArray58;
        boolean boolean61 = fila48.vazia();
        fila48.frente = (byte) -1;
        fila43.enfileira((java.lang.Object) fila48);
        java.lang.Object[] objArray65 = fila48.item;
        fila40.item = objArray65;
        fila27.item = objArray65;
        fila14.item = objArray65;
        java.lang.Object obj69 = fila14.desenfileira();
        java.lang.Object[] objArray70 = fila14.item;
        fila0.enfileira((java.lang.Object) objArray70);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0f + "'", obj25, 10.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 10.0f + "'", obj47, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (-1.0f) + "'", obj69, (-1.0f));
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
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
        java.lang.Class<?> wildcardClass46 = fila5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
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
        java.lang.Object[] objArray13 = fila11.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100);
        fila14.frente = (short) 0;
        fila11.enfileira((java.lang.Object) fila14);
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) 10.0f);
        int int24 = fila20.tras;
        fila20.frente = (-1);
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        java.lang.Object[] objArray29 = fila27.item;
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 100);
        fila30.frente = (short) 0;
        fila27.enfileira((java.lang.Object) fila30);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (-1L));
        fila36.imprime();
        boolean boolean40 = fila36.vazia();
        java.lang.Object[] objArray41 = fila36.item;
        fila27.item = objArray41;
        fila20.enfileira((java.lang.Object) objArray41);
        fila11.item = objArray41;
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        java.lang.Object[] objArray47 = fila45.item;
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 100);
        fila48.frente = (short) 0;
        fila45.enfileira((java.lang.Object) fila48);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) (-1L));
        fila45.enfileira((java.lang.Object) (-1L));
        ds.Fila fila58 = new ds.Fila();
        boolean boolean59 = fila58.vazia();
        ds.Fila fila60 = new ds.Fila();
        java.lang.Object[] objArray61 = fila60.item;
        fila60.enfileira((java.lang.Object) 10.0f);
        int int64 = fila60.tras;
        int int65 = fila60.tras;
        java.lang.Object[] objArray66 = fila60.item;
        fila58.item = objArray66;
        fila45.item = objArray66;
        fila11.item = objArray66;
        fila0.item = objArray66;
        fila0.tras = (byte) 10;
        java.lang.Object obj73 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
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
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        int int24 = fila22.frente;
        fila22.tras = 10;
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
        boolean boolean50 = fila27.vazia();
        int int51 = fila27.tras;
        fila22.enfileira((java.lang.Object) fila27);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (-1L));
        fila53.imprime();
        java.lang.Object[] objArray61 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila53.item = objArray61;
        int int63 = fila53.frente;
        ds.Fila fila64 = new ds.Fila();
        java.lang.Object[] objArray65 = fila64.item;
        fila53.enfileira((java.lang.Object) objArray65);
        fila27.item = objArray65;
        fila0.item = objArray65;
        int int69 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
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
        java.lang.Object obj26 = fila9.desenfileira();
        int int27 = fila9.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0f + "'", obj26, 10.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
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
        fila0.tras = (short) 1;
        java.lang.Class<?> wildcardClass42 = fila0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (byte) 0;
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
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
        java.lang.Object[] objArray32 = fila0.item;
        fila0.tras = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, 100.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, 100.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
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
        int int11 = fila0.tras;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
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
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
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
        fila52.imprime();
        int int57 = fila52.frente;
        java.lang.Object[] objArray58 = fila52.item;
        boolean boolean59 = fila52.vazia();
        fila52.imprime();
        int int61 = fila52.frente;
        fila0.enfileira((java.lang.Object) fila52);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
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
        fila0.frente = (short) -1;
        fila0.tras = (short) 10;
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
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
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
        fila3.tras = (short) 1;
        ds.Fila fila44 = new ds.Fila();
        java.lang.Object[] objArray45 = fila44.item;
        java.lang.Object[] objArray46 = fila44.item;
        boolean boolean47 = fila44.vazia();
        fila44.imprime();
        java.lang.Object[] objArray49 = fila44.item;
        fila3.item = objArray49;
        fila3.frente = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
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
        int int46 = fila15.tras;
        java.lang.Class<?> wildcardClass47 = fila15.getClass();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
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
        int int15 = fila0.frente;
        fila0.tras = (-1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        int int14 = fila0.tras;
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
        fila15.frente = 0;
        fila0.enfileira((java.lang.Object) fila15);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100 + "'", obj26, 100);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
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
        fila15.tras = (short) -1;
        java.lang.Object obj19 = fila15.desenfileira();
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj21 = fila0.desenfileira();
        int int22 = fila0.tras;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.tras = (short) -1;
        java.lang.Object[] objArray27 = fila23.item;
        fila0.item = objArray27;
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        int int11 = fila8.tras;
        java.lang.Class<?> wildcardClass12 = fila8.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass12);
        fila0.tras = 98;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
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
        int int39 = fila23.frente;
        java.lang.Object obj40 = fila23.desenfileira();
        int int41 = fila23.frente;
        java.lang.Object[] objArray42 = fila23.item;
        fila0.item = objArray42;
        boolean boolean44 = fila0.vazia();
        java.lang.Object[] objArray45 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100 + "'", obj34, 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10.0f + "'", obj40, 10.0f);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.frente;
        fila0.tras = (short) 0;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
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
        fila15.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        int int7 = fila0.tras;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 2;
        fila0.tras = '4';
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = fila15.desenfileira();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        fila3.imprime();
        fila3.imprime();
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
        fila15.frente = 'a';
        fila15.frente = (short) -1;
        fila15.tras = (short) 1;
        ds.Fila fila56 = new ds.Fila();
        java.lang.Object[] objArray57 = fila56.item;
        java.lang.Object[] objArray58 = fila56.item;
        boolean boolean59 = fila56.vazia();
        fila56.imprime();
        java.lang.Object[] objArray61 = fila56.item;
        fila15.item = objArray61;
        fila3.item = objArray61;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0f + "'", obj25, 10.0f);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
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
        java.lang.Object[] objArray23 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila15.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila15.item = objArray26;
        int int28 = fila15.tras;
        int int29 = fila15.frente;
        java.lang.Object[] objArray30 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.enfileira((java.lang.Object) 10.0f);
        int int36 = fila32.tras;
        int int37 = fila32.tras;
        fila32.tras = (byte) 100;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 100);
        java.lang.Object obj43 = fila40.desenfileira();
        fila32.enfileira((java.lang.Object) fila40);
        fila32.tras = ' ';
        int int47 = fila32.tras;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        fila48.tras = (short) 0;
        java.lang.Object[] objArray52 = fila48.item;
        fila32.item = objArray52;
        fila0.item = objArray52;
        fila0.tras = 35;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100 + "'", obj43, 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
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
        int int13 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        int int11 = fila0.frente;
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
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
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        int int26 = fila21.tras;
        int int27 = fila21.frente;
        fila21.imprime();
        fila21.tras = 33;
        fila9.enfileira((java.lang.Object) fila21);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
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
        boolean boolean34 = fila0.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray38 = fila35.item;
        fila35.tras = (short) 1;
        int int41 = fila35.frente;
        java.lang.Object[] objArray42 = fila35.item;
        java.lang.Object obj43 = fila35.desenfileira();
        fila0.enfileira(obj43);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        fila0.frente = '#';
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (-1L));
        fila6.imprime();
        boolean boolean10 = fila6.vazia();
        java.lang.Object obj11 = null;
        fila6.enfileira(obj11);
        int int13 = fila6.frente;
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray17 = fila14.item;
        fila6.item = objArray17;
        int int19 = fila6.tras;
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        boolean boolean24 = fila20.vazia();
        java.lang.Object obj25 = null;
        fila20.enfileira(obj25);
        int int27 = fila20.frente;
        boolean boolean28 = fila20.vazia();
        java.lang.Object[] objArray29 = fila20.item;
        fila6.item = objArray29;
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (-1L));
        fila31.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila31.item = objArray39;
        fila31.tras = 0;
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object[] objArray44 = fila43.item;
        java.lang.Object[] objArray45 = fila43.item;
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (-1L));
        fila46.imprime();
        java.lang.Object[] objArray54 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila46.item = objArray54;
        int int56 = fila46.frente;
        ds.Fila fila57 = new ds.Fila();
        java.lang.Object[] objArray58 = fila57.item;
        fila46.enfileira((java.lang.Object) objArray58);
        fila46.enfileira((java.lang.Object) '#');
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) (-1L));
        int int65 = fila62.tras;
        java.lang.Object[] objArray66 = fila62.item;
        fila46.item = objArray66;
        fila43.item = objArray66;
        fila31.item = objArray66;
        fila6.item = objArray66;
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) (-1L));
        fila71.imprime();
        java.lang.Object[] objArray79 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila71.item = objArray79;
        ds.Fila fila81 = new ds.Fila();
        java.lang.Object[] objArray82 = fila81.item;
        fila71.item = objArray82;
        fila6.item = objArray82;
        fila0.item = objArray82;
        fila0.tras = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray82);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
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
        fila0.frente = ' ';
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (-1L));
        fila52.imprime();
        java.lang.Object[] objArray60 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila52.item = objArray60;
        int int62 = fila52.frente;
        ds.Fila fila63 = new ds.Fila();
        java.lang.Object[] objArray64 = fila63.item;
        fila52.enfileira((java.lang.Object) objArray64);
        java.lang.Object obj66 = fila52.desenfileira();
        int int67 = fila52.frente;
        fila52.tras = (byte) 100;
        boolean boolean70 = fila52.vazia();
        ds.Fila fila71 = new ds.Fila();
        java.lang.Object[] objArray72 = fila71.item;
        fila71.enfileira((java.lang.Object) 10.0f);
        int int75 = fila71.tras;
        int int76 = fila71.tras;
        fila71.tras = (byte) 100;
        ds.Fila fila79 = new ds.Fila();
        fila79.enfileira((java.lang.Object) 100);
        java.lang.Object obj82 = fila79.desenfileira();
        fila71.enfileira((java.lang.Object) fila79);
        fila71.tras = ' ';
        int int86 = fila71.tras;
        ds.Fila fila87 = new ds.Fila();
        java.lang.Object[] objArray88 = fila87.item;
        fila87.tras = (short) 0;
        java.lang.Object[] objArray91 = fila87.item;
        fila71.item = objArray91;
        fila52.item = objArray91;
        fila0.enfileira((java.lang.Object) objArray91);
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '#' + "'", obj66, '#');
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 100 + "'", obj82, 100);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 32 + "'", int86 == 32);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
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
        java.lang.Object[] objArray17 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
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
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        fila13.tras = 'a';
        fila0.enfileira((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
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
        fila7.tras = 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
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
        java.lang.Object[] objArray33 = fila0.item;
        java.lang.Class<?> wildcardClass34 = objArray33.getClass();
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
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
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
        int int33 = fila0.tras;
        fila0.frente = (byte) -1;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 33 + "'", int33 == 33);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
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
        fila0.frente = (short) 0;
        java.lang.Class<?> wildcardClass79 = fila0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.frente = (short) -1;
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
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
        fila15.frente = 33;
        java.lang.Object[] objArray36 = fila15.item;
        java.lang.Object[] objArray37 = fila15.item;
        java.lang.Class<?> wildcardClass38 = fila15.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        int int11 = fila0.tras;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object obj13 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
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
        fila0.imprime();
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
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
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
        int int57 = fila0.frente;
        java.lang.Object[] objArray58 = fila0.item;
        fila0.tras = (short) 100;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
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
        java.lang.Object[] objArray14 = fila0.item;
        int int15 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
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
        java.lang.Object[] objArray23 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila15.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila15.item = objArray26;
        int int28 = fila15.tras;
        int int29 = fila15.frente;
        java.lang.Object[] objArray30 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.enfileira((java.lang.Object) 10.0f);
        int int36 = fila32.tras;
        fila32.frente = 0;
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira((java.lang.Object) wildcardClass40);
        boolean boolean42 = fila32.vazia();
        java.lang.Object obj43 = fila32.desenfileira();
        int int44 = fila32.frente;
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        fila45.enfileira((java.lang.Object) 10.0f);
        int int49 = fila45.tras;
        int int50 = fila45.tras;
        fila45.tras = (byte) 100;
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        int int55 = fila53.frente;
        fila45.enfileira((java.lang.Object) int55);
        int int57 = fila45.tras;
        ds.Fila fila58 = new ds.Fila();
        fila58.frente = 2;
        ds.Fila fila61 = new ds.Fila();
        java.lang.Object[] objArray62 = fila61.item;
        fila61.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj65 = fila61.desenfileira();
        ds.Fila fila66 = new ds.Fila();
        boolean boolean67 = fila66.vazia();
        ds.Fila fila68 = new ds.Fila();
        fila68.enfileira((java.lang.Object) (-1L));
        fila68.imprime();
        java.lang.Object[] objArray76 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila68.item = objArray76;
        fila66.item = objArray76;
        boolean boolean79 = fila66.vazia();
        fila66.frente = (byte) -1;
        fila61.enfileira((java.lang.Object) fila66);
        java.lang.Object[] objArray83 = fila66.item;
        fila58.item = objArray83;
        fila45.item = objArray83;
        fila32.item = objArray83;
        int int87 = fila32.tras;
        fila15.enfileira((java.lang.Object) fila32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 10.0f + "'", obj43, 10.0f);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 10.0f + "'", obj65, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 2;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (-1L));
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        int int9 = fila4.tras;
        int int10 = fila4.tras;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (-1L));
        fila11.imprime();
        fila11.imprime();
        int int16 = fila11.frente;
        java.lang.Object[] objArray17 = fila11.item;
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (-1L));
        fila18.imprime();
        java.lang.Object[] objArray26 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila18.item = objArray26;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila18.item = objArray29;
        fila11.item = objArray29;
        fila4.item = objArray29;
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (-1L));
        fila33.imprime();
        boolean boolean37 = fila33.vazia();
        java.lang.Object[] objArray38 = fila33.item;
        fila4.item = objArray38;
        fila4.tras = 100;
        java.lang.Object[] objArray42 = fila4.item;
        boolean boolean43 = fila4.vazia();
        fila0.enfileira((java.lang.Object) boolean43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        fila0.tras = (byte) 100;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
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
        fila0.imprime();
        fila0.frente = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
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
        fila8.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila8.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        fila0.frente = (short) -1;
        int int7 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
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
        int int25 = fila0.frente;
        java.lang.Object obj26 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0f + "'", obj26, 10.0f);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.frente = (short) -1;
        int int16 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
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
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
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
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (-1L));
        fila46.imprime();
        java.lang.Object[] objArray54 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila46.item = objArray54;
        ds.Fila fila56 = new ds.Fila();
        java.lang.Object[] objArray57 = fila56.item;
        fila46.item = objArray57;
        fila15.enfileira((java.lang.Object) fila46);
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
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        fila14.item = objArray24;
        fila0.item = objArray24;
        int int28 = fila0.frente;
        int int29 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        fila0.frente = 100;
        int int9 = fila0.frente;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
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
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        int int16 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
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
        java.lang.Object obj56 = fila0.desenfileira();
        java.lang.Object obj57 = fila0.desenfileira();
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
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1L) + "'", obj56, (-1L));
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0f + "'", obj7, 10.0f);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
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
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Object[] objArray17 = fila0.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
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
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila21.item = objArray29;
        fila19.item = objArray29;
        boolean boolean32 = fila19.vazia();
        fila19.imprime();
        int int34 = fila19.tras;
        java.lang.Object[] objArray35 = fila19.item;
        fila0.item = objArray35;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[#, -1.0, 0.0, 1]");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        fila14.imprime();
        int int19 = fila14.frente;
        fila14.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (-1L));
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        java.lang.Object obj27 = fila21.desenfileira();
        int int28 = fila21.tras;
        fila21.frente = (byte) 0;
        boolean boolean31 = fila21.vazia();
        int int32 = fila21.frente;
        fila21.imprime();
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        java.lang.Object[] objArray36 = fila34.item;
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 100);
        fila37.frente = (short) 0;
        fila34.enfileira((java.lang.Object) fila37);
        java.lang.Object[] objArray43 = fila34.item;
        fila21.item = objArray43;
        java.lang.Object obj45 = fila21.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (-1L));
        fila46.imprime();
        java.lang.Object[] objArray54 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila46.item = objArray54;
        int int56 = fila46.frente;
        ds.Fila fila57 = new ds.Fila();
        java.lang.Object[] objArray58 = fila57.item;
        fila46.enfileira((java.lang.Object) objArray58);
        fila46.enfileira((java.lang.Object) '#');
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) (-1L));
        int int65 = fila62.tras;
        java.lang.Object[] objArray66 = fila62.item;
        fila46.item = objArray66;
        fila46.frente = 0;
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) (-1L));
        fila70.imprime();
        boolean boolean74 = fila70.vazia();
        boolean boolean75 = fila70.vazia();
        boolean boolean76 = fila70.vazia();
        java.lang.Object[] objArray77 = fila70.item;
        fila46.item = objArray77;
        fila21.enfileira((java.lang.Object) objArray77);
        fila14.item = objArray77;
        fila0.item = objArray77;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1L) + "'", obj27, (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
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
        fila0.frente = 0;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
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
        java.lang.Object[] objArray29 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
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
        fila0.frente = 35;
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
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
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
        int int51 = fila0.frente;
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        fila0.tras = 98;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
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
        java.lang.Object obj56 = null;
        fila0.enfileira(obj56);
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
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
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
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
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
        boolean boolean31 = fila0.vazia();
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1));
        ds.Fila fila8 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila8);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1L) + "'", obj5, (-1L));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        fila0.tras = (byte) 0;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (-1L));
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        java.lang.Object obj14 = fila8.desenfileira();
        int int15 = fila8.tras;
        fila8.frente = (byte) 0;
        boolean boolean18 = fila8.vazia();
        java.lang.Class<?> wildcardClass19 = fila8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
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
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.tras = (short) 0;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        int int32 = fila29.tras;
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (-1L));
        fila35.imprime();
        java.lang.Object[] objArray43 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila35.item = objArray43;
        fila33.item = objArray43;
        ds.Fila fila47 = new ds.Fila();
        java.lang.Object[] objArray48 = fila47.item;
        fila47.enfileira((java.lang.Object) 10.0f);
        int int51 = fila47.tras;
        int int52 = fila47.tras;
        fila47.tras = (byte) 100;
        java.lang.Class<?> wildcardClass55 = fila47.getClass();
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        fila56.imprime();
        java.lang.Object[] objArray64 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila56.item = objArray64;
        ds.Fila fila66 = new ds.Fila();
        java.lang.Object[] objArray67 = fila66.item;
        fila56.item = objArray67;
        int int69 = fila56.tras;
        int int70 = fila56.tras;
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) (-1L));
        fila72.imprime();
        java.lang.Object[] objArray80 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila72.item = objArray80;
        int int82 = fila72.frente;
        java.lang.Object[] objArray83 = new java.lang.Object[] { (-1), wildcardClass55, fila56, (byte) 0, int82 };
        fila33.item = objArray83;
        fila29.item = objArray83;
        fila25.item = objArray83;
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object[] objArray88 = fila23.item;
        fila0.item = objArray88;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
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
        java.lang.Object[] objArray61 = fila0.item;
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
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
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
        boolean boolean13 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
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
        fila13.frente = 3;
        int int66 = fila13.tras;
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
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 33 + "'", int66 == 33);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
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
        fila0.enfileira((java.lang.Object) "");
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
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
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
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        java.lang.Object[] objArray17 = fila15.item;
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100);
        fila18.frente = (short) 0;
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object[] objArray24 = fila18.item;
        fila0.item = objArray24;
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
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean9 = fila3.vazia();
        int int10 = fila3.tras;
        int int11 = fila3.tras;
        java.lang.Object obj12 = fila3.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
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
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.tras = (short) -1;
        int int29 = fila25.tras;
        fila25.frente = (short) -1;
        fila0.enfileira((java.lang.Object) fila25);
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
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
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
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
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
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj8 = fila4.desenfileira();
        fila0.enfileira(obj8);
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        java.lang.Object[] objArray12 = fila10.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100);
        fila13.frente = (short) 0;
        fila10.enfileira((java.lang.Object) fila13);
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj23 = fila19.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (-1L));
        fila24.imprime();
        java.lang.Object[] objArray32 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila24.item = objArray32;
        int int34 = fila24.frente;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila24.enfileira((java.lang.Object) objArray36);
        fila24.enfileira((java.lang.Object) '#');
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        int int43 = fila40.tras;
        java.lang.Object[] objArray44 = fila40.item;
        fila24.item = objArray44;
        fila19.enfileira((java.lang.Object) objArray44);
        fila13.enfileira((java.lang.Object) objArray44);
        java.lang.Object obj48 = fila13.desenfileira();
        java.lang.Object[] objArray49 = fila13.item;
        fila0.item = objArray49;
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) (-1L));
        fila51.imprime();
        boolean boolean55 = fila51.vazia();
        int int56 = fila51.tras;
        java.lang.Object obj57 = fila51.desenfileira();
        int int58 = fila51.frente;
        java.lang.Object[] objArray59 = fila51.item;
        fila0.item = objArray59;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0f + "'", obj23, 10.0f);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100 + "'", obj48, 100);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1L) + "'", obj57, (-1L));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
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
        fila0.frente = ' ';
        int int52 = fila0.tras;
        java.lang.Object[] objArray53 = null;
        fila0.item = objArray53;
        fila0.tras = 0;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 33 + "'", int52 == 33);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        int int5 = fila0.frente;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
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
        fila7.item = objArray34;
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (-1L));
        fila38.imprime();
        java.lang.Object[] objArray46 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila38.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        fila38.item = objArray49;
        int int51 = fila38.tras;
        int int52 = fila38.tras;
        java.lang.Class<?> wildcardClass53 = fila38.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass53);
        java.lang.Object[] objArray55 = fila7.item;
        fila0.item = objArray55;
        java.lang.Class<?> wildcardClass57 = objArray55.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
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
        fila0.tras = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.frente;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
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
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) 10.0f);
        int int24 = fila20.tras;
        int int25 = fila20.tras;
        fila20.tras = (byte) 100;
        int int28 = fila20.frente;
        fila20.tras = (byte) 0;
        fila20.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (-1L));
        fila33.imprime();
        boolean boolean37 = fila33.vazia();
        boolean boolean38 = fila33.vazia();
        java.lang.Object obj39 = fila33.desenfileira();
        int int40 = fila33.tras;
        fila33.frente = (byte) 0;
        boolean boolean43 = fila33.vazia();
        int int44 = fila33.frente;
        fila33.imprime();
        ds.Fila fila46 = new ds.Fila();
        java.lang.Object[] objArray47 = fila46.item;
        java.lang.Object[] objArray48 = fila46.item;
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 100);
        fila49.frente = (short) 0;
        fila46.enfileira((java.lang.Object) fila49);
        java.lang.Object[] objArray55 = fila46.item;
        fila33.item = objArray55;
        fila20.enfileira((java.lang.Object) objArray55);
        fila15.enfileira((java.lang.Object) fila20);
        java.lang.Object obj59 = fila20.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 10.0f + "'", obj59, 10.0f);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.frente;
        fila0.frente = (short) 10;
        int int7 = fila0.tras;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
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
        fila0.frente = 0;
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
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
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
        java.lang.Object[] objArray15 = fila0.item;
        fila0.frente = 10;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
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
        boolean boolean31 = fila26.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        fila32.imprime();
        fila32.imprime();
        java.lang.Object obj37 = fila32.desenfileira();
        fila32.enfileira((java.lang.Object) (-1));
        fila26.enfileira((java.lang.Object) fila32);
        java.lang.Object[] objArray41 = fila26.item;
        fila9.enfileira((java.lang.Object) objArray41);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1L) + "'", obj37, (-1L));
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
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
        fila0.frente = '#';
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
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        java.lang.Object[] objArray5 = fila0.item;
        boolean boolean6 = fila0.vazia();
        fila0.tras = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.tras;
        int int13 = fila0.tras;
        fila0.frente = (short) 10;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
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
        int int51 = fila0.frente;
        fila0.frente = (byte) 1;
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = (short) 1;
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.frente = (short) 0;
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
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
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila13.item = objArray24;
        int int26 = fila13.tras;
        int int27 = fila13.frente;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila13.enfileira((java.lang.Object) fila28);
        int int31 = fila28.tras;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        java.lang.Object[] objArray34 = fila32.item;
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100);
        fila35.frente = (short) 0;
        fila32.enfileira((java.lang.Object) fila35);
        fila28.enfileira((java.lang.Object) fila35);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) (-1L));
        fila42.imprime();
        java.lang.Object[] objArray50 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila42.item = objArray50;
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray53 = fila52.item;
        fila42.item = objArray53;
        int int55 = fila42.tras;
        int int56 = fila42.frente;
        java.lang.Object[] objArray57 = fila42.item;
        fila28.enfileira((java.lang.Object) objArray57);
        fila0.item = objArray57;
        fila0.frente = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.imprime();
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) 10.0f);
        int int12 = fila8.tras;
        boolean boolean13 = fila8.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (-1L));
        fila14.imprime();
        fila14.imprime();
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (-1));
        fila8.enfileira((java.lang.Object) fila14);
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
        java.lang.Object obj36 = fila23.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        fila37.imprime();
        boolean boolean41 = fila37.vazia();
        java.lang.Object[] objArray42 = fila37.item;
        java.lang.Object[] objArray43 = fila37.item;
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (-1L));
        fila44.imprime();
        java.lang.Object[] objArray52 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila44.item = objArray52;
        int int54 = fila44.frente;
        ds.Fila fila55 = new ds.Fila();
        java.lang.Object[] objArray56 = fila55.item;
        fila44.enfileira((java.lang.Object) objArray56);
        fila44.enfileira((java.lang.Object) '#');
        int int60 = fila44.frente;
        java.lang.Object[] objArray61 = fila44.item;
        fila37.enfileira((java.lang.Object) objArray61);
        fila23.item = objArray61;
        fila14.item = objArray61;
        java.lang.Object[] objArray65 = fila14.item;
        fila0.item = objArray65;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1L) + "'", obj36, (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
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
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.frente = 97;
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        java.lang.Object[] objArray10 = fila8.item;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100);
        fila11.frente = (short) 0;
        fila8.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj21 = fila17.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (-1L));
        fila22.imprime();
        java.lang.Object[] objArray30 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila22.item = objArray30;
        int int32 = fila22.frente;
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila22.enfileira((java.lang.Object) objArray34);
        fila22.enfileira((java.lang.Object) '#');
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (-1L));
        int int41 = fila38.tras;
        java.lang.Object[] objArray42 = fila38.item;
        fila22.item = objArray42;
        fila17.enfileira((java.lang.Object) objArray42);
        fila11.enfileira((java.lang.Object) objArray42);
        fila11.frente = 'a';
        fila11.frente = (short) -1;
        fila11.tras = (short) 1;
        fila0.enfileira((java.lang.Object) fila11);
        fila11.frente = (short) -1;
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (-1L));
        fila55.imprime();
        boolean boolean59 = fila55.vazia();
        java.lang.Object obj60 = null;
        fila55.enfileira(obj60);
        int int62 = fila55.frente;
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        java.lang.Object[] objArray66 = fila63.item;
        fila55.item = objArray66;
        fila11.item = objArray66;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 10.0f + "'", obj21, 10.0f);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
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
        java.lang.Class<?> wildcardClass24 = fila5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
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
        java.lang.Class<?> wildcardClass55 = fila0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.enfileira((java.lang.Object) 10.0f);
        int int14 = fila10.tras;
        int int15 = fila10.tras;
        fila10.tras = (byte) 100;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        java.lang.Object[] objArray20 = fila18.item;
        boolean boolean21 = fila18.vazia();
        fila18.imprime();
        java.lang.Object[] objArray23 = fila18.item;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.tras = (short) -1;
        int int28 = fila24.frente;
        java.lang.Object obj29 = fila24.desenfileira();
        fila24.tras = 0;
        fila24.frente = (byte) 0;
        java.lang.Object[] objArray34 = fila24.item;
        fila18.item = objArray34;
        fila10.item = objArray34;
        fila0.item = objArray34;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        fila0.frente = (short) 0;
        int int12 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
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
        fila0.frente = 32;
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
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
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
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1L) + "'", obj12, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
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
        fila15.tras = '#';
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
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.tras = (short) -1;
        int int8 = fila4.frente;
        java.lang.Object obj9 = fila4.desenfileira();
        fila4.tras = 0;
        fila4.frente = (byte) 0;
        java.lang.Object[] objArray14 = fila4.item;
        int int15 = fila4.tras;
        fila0.enfileira((java.lang.Object) int15);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
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
        fila3.tras = 0;
        int int26 = fila3.tras;
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 2;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        int int5 = fila0.frente;
        fila0.frente = 2;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        java.lang.Object obj4 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1L) + "'", obj4, (-1L));
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
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
        fila0.tras = (byte) 1;
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
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
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
        fila0.tras = (short) 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
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
        int int31 = fila0.tras;
        int int32 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.tras = 'a';
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
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
        fila15.frente = (byte) -1;
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
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
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
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila0.item = objArray34;
        fila0.tras = 100;
        java.lang.Object[] objArray38 = fila0.item;
        boolean boolean39 = fila0.vazia();
        java.lang.Object obj40 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1L) + "'", obj40, (-1L));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) (-1L));
        fila3.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila3.item = objArray11;
        int int13 = fila3.frente;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila3.enfileira((java.lang.Object) objArray15);
        fila3.enfileira((java.lang.Object) '#');
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        int int22 = fila19.tras;
        java.lang.Object[] objArray23 = fila19.item;
        fila3.item = objArray23;
        fila0.item = objArray23;
        fila0.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (-1L));
        fila27.imprime();
        boolean boolean31 = fila27.vazia();
        int int32 = fila27.tras;
        int int33 = fila27.frente;
        fila27.imprime();
        fila27.tras = 33;
        fila27.frente = (short) 0;
        fila27.tras = (byte) 1;
        fila0.enfileira((java.lang.Object) fila27);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) (-1L));
        fila42.imprime();
        java.lang.Object[] objArray50 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila42.item = objArray50;
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray53 = fila52.item;
        fila42.item = objArray53;
        int int55 = fila42.tras;
        int int56 = fila42.frente;
        java.lang.Object[] objArray57 = fila42.item;
        java.lang.Class<?> wildcardClass58 = fila42.getClass();
        fila0.enfileira((java.lang.Object) fila42);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
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
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila15.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila15.item = objArray26;
        fila0.item = objArray26;
        java.lang.Class<?> wildcardClass29 = objArray26.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
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
        java.lang.Object obj20 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
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
        int int17 = fila3.tras;
        boolean boolean18 = fila3.vazia();
        java.lang.Object[] objArray19 = fila3.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        int int14 = fila7.tras;
        fila7.frente = (byte) 0;
        boolean boolean17 = fila7.vazia();
        fila7.tras = 'a';
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (-1L));
        fila22.imprime();
        java.lang.Object[] objArray30 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila22.item = objArray30;
        fila20.item = objArray30;
        boolean boolean33 = fila20.vazia();
        fila20.imprime();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        fila37.imprime();
        java.lang.Object[] objArray45 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila37.item = objArray45;
        fila35.item = objArray45;
        fila20.item = objArray45;
        fila7.enfileira((java.lang.Object) fila20);
        ds.Fila fila50 = new ds.Fila();
        java.lang.Object[] objArray51 = fila50.item;
        java.lang.Object[] objArray52 = fila50.item;
        fila20.item = objArray52;
        fila0.item = objArray52;
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (-1L));
        fila55.imprime();
        fila55.imprime();
        java.lang.Object obj60 = fila55.desenfileira();
        fila55.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (-1L) + "'", obj60, (-1L));
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100);
        java.lang.Object obj13 = fila10.desenfileira();
        java.lang.Object[] objArray14 = fila10.item;
        fila0.item = objArray14;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100 + "'", obj13, 100);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
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
        fila0.frente = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj8 = fila4.desenfileira();
        fila0.enfileira(obj8);
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        int int12 = fila0.frente;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
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
        int int11 = fila0.tras;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        java.lang.Object[] objArray14 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100);
        fila15.frente = (short) 0;
        fila12.enfileira((java.lang.Object) fila15);
        int int21 = fila15.tras;
        boolean boolean22 = fila15.vazia();
        int int23 = fila15.frente;
        boolean boolean24 = fila15.vazia();
        fila15.imprime();
        fila15.tras = '#';
        java.lang.Object obj28 = fila15.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        fila29.imprime();
        int int34 = fila29.frente;
        java.lang.Object[] objArray35 = fila29.item;
        boolean boolean36 = fila29.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj40 = fila37.desenfileira();
        fila29.enfileira((java.lang.Object) fila37);
        java.lang.Object[] objArray42 = fila37.item;
        fila15.item = objArray42;
        fila0.item = objArray42;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100 + "'", obj28, 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1L) + "'", obj40, (-1L));
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
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
        int int17 = fila3.tras;
        boolean boolean18 = fila3.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (-1L));
        fila19.imprime();
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
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
        fila26.enfileira((java.lang.Object) '#');
        int int42 = fila26.frente;
        java.lang.Object[] objArray43 = fila26.item;
        fila19.enfileira((java.lang.Object) objArray43);
        fila3.item = objArray43;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        fila0.imprime();
        fila0.tras = 33;
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        int int20 = fila10.frente;
        java.lang.Object[] objArray21 = fila10.item;
        java.lang.Object[] objArray22 = fila10.item;
        fila0.item = objArray22;
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
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
        java.lang.Class<?> wildcardClass49 = objArray47.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
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
        int int60 = fila0.tras;
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        int int5 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test802");
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
        fila0.frente = 0;
        int int15 = fila0.frente;
        fila0.frente = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test803");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test804");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        int int9 = fila0.frente;
        fila0.tras = (byte) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test805");
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
        fila0.tras = (short) 10;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) 10.0f);
        int int21 = fila17.tras;
        int int22 = fila17.tras;
        fila17.tras = (byte) 100;
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 100);
        java.lang.Object obj28 = fila25.desenfileira();
        fila17.enfileira((java.lang.Object) fila25);
        fila17.tras = ' ';
        int int32 = fila17.tras;
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (-1L));
        fila33.imprime();
        java.lang.Object[] objArray41 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila33.item = objArray41;
        int int43 = fila33.frente;
        ds.Fila fila44 = new ds.Fila();
        java.lang.Object[] objArray45 = fila44.item;
        fila33.enfileira((java.lang.Object) objArray45);
        fila33.enfileira((java.lang.Object) '#');
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (-1L));
        int int52 = fila49.tras;
        java.lang.Object[] objArray53 = fila49.item;
        fila33.item = objArray53;
        fila17.item = objArray53;
        java.lang.Object[] objArray56 = fila17.item;
        java.lang.Object[] objArray57 = fila17.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100 + "'", obj28, 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test806");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = (-1);
        fila0.frente = 100;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        int int14 = fila9.tras;
        fila9.tras = (byte) 100;
        fila9.frente = (byte) 1;
        java.lang.Object[] objArray19 = fila9.item;
        fila0.item = objArray19;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test807");
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
        fila0.frente = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test808");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = fila0.desenfileira();
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
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test809");
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
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.enfileira((java.lang.Object) 10.0f);
        int int20 = fila16.tras;
        int int21 = fila16.tras;
        fila16.tras = (byte) 100;
        int int24 = fila16.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.enfileira((java.lang.Object) 10.0f);
        int int29 = fila25.tras;
        int int30 = fila25.tras;
        fila25.tras = (byte) 100;
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100);
        java.lang.Object obj36 = fila33.desenfileira();
        fila25.enfileira((java.lang.Object) fila33);
        fila25.tras = ' ';
        fila16.enfileira((java.lang.Object) fila25);
        fila25.frente = (byte) 100;
        fila25.frente = (byte) 10;
        java.lang.Object obj45 = fila25.desenfileira();
        fila0.enfileira((java.lang.Object) fila25);
        boolean boolean47 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100 + "'", obj36, 100);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test810");
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
        fila15.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (-1L));
        fila30.imprime();
        boolean boolean34 = fila30.vazia();
        java.lang.Object[] objArray35 = fila30.item;
        fila30.imprime();
        fila15.enfileira((java.lang.Object) fila30);
        int int38 = fila15.tras;
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test811");
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
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test812");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        fila10.imprime();
        int int15 = fila10.frente;
        int int16 = fila10.frente;
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (-1L));
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        int int22 = fila17.tras;
        java.lang.Object obj23 = fila17.desenfileira();
        int int24 = fila17.tras;
        fila10.enfileira((java.lang.Object) int24);
        fila0.enfileira((java.lang.Object) fila10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1L) + "'", obj23, (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test813");
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
        fila3.frente = (byte) 100;
        int int14 = fila3.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test814");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.frente = 1;
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test815");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.tras = (short) -1;
        int int12 = fila8.frente;
        java.lang.Object obj13 = fila8.desenfileira();
        fila8.tras = 0;
        fila8.frente = (byte) 0;
        java.lang.Object[] objArray18 = fila8.item;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
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
        java.lang.Object[] objArray46 = fila45.item;
        java.lang.Object[] objArray47 = fila45.item;
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 100);
        fila48.frente = (short) 0;
        fila45.enfileira((java.lang.Object) fila48);
        ds.Fila fila54 = new ds.Fila();
        java.lang.Object[] objArray55 = fila54.item;
        fila54.enfileira((java.lang.Object) 10.0f);
        int int58 = fila54.tras;
        fila54.frente = (-1);
        ds.Fila fila61 = new ds.Fila();
        java.lang.Object[] objArray62 = fila61.item;
        java.lang.Object[] objArray63 = fila61.item;
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 100);
        fila64.frente = (short) 0;
        fila61.enfileira((java.lang.Object) fila64);
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) (-1L));
        fila70.imprime();
        boolean boolean74 = fila70.vazia();
        java.lang.Object[] objArray75 = fila70.item;
        fila61.item = objArray75;
        fila54.enfileira((java.lang.Object) objArray75);
        fila45.item = objArray75;
        fila21.item = objArray75;
        fila21.frente = (byte) 10;
        fila21.tras = ' ';
        fila0.enfileira((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test816");
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
        int int51 = fila0.frente;
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test817");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = ' ';
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test818");
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
        fila0.frente = (byte) 10;
        boolean boolean43 = fila0.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test819");
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
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test820");
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
        fila0.tras = (-1);
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
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test821");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) (-1L));
        fila3.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila3.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila3.item = objArray14;
        java.lang.Object[] objArray16 = fila3.item;
        int int17 = fila3.tras;
        fila3.tras = '4';
        fila0.enfileira((java.lang.Object) fila3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test822");
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
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (-1L));
        fila13.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila13.item = objArray21;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila13.item = objArray24;
        int int26 = fila13.tras;
        int int27 = fila13.frente;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila13.enfileira((java.lang.Object) fila28);
        int int31 = fila28.tras;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        java.lang.Object[] objArray34 = fila32.item;
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100);
        fila35.frente = (short) 0;
        fila32.enfileira((java.lang.Object) fila35);
        fila28.enfileira((java.lang.Object) fila35);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) (-1L));
        fila42.imprime();
        java.lang.Object[] objArray50 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila42.item = objArray50;
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray53 = fila52.item;
        fila42.item = objArray53;
        int int55 = fila42.tras;
        int int56 = fila42.frente;
        java.lang.Object[] objArray57 = fila42.item;
        fila28.enfileira((java.lang.Object) objArray57);
        fila0.item = objArray57;
        int int60 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test823");
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
        fila3.tras = 32;
        java.lang.Object[] objArray20 = fila3.item;
        java.lang.Object[] objArray21 = fila3.item;
        java.lang.Object[] objArray22 = fila3.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test824");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        fila0.imprime();
        fila0.tras = 33;
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (-1L));
        fila10.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila10.item = objArray18;
        int int20 = fila10.frente;
        java.lang.Object[] objArray21 = fila10.item;
        java.lang.Object[] objArray22 = fila10.item;
        fila0.item = objArray22;
        java.lang.Object[] objArray24 = fila0.item;
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test825");
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
        fila3.tras = (short) 1;
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (-1L));
        fila44.imprime();
        boolean boolean48 = fila44.vazia();
        boolean boolean49 = fila44.vazia();
        java.lang.Object obj50 = fila44.desenfileira();
        int int51 = fila44.tras;
        fila44.frente = (byte) 0;
        fila44.frente = (short) 0;
        fila3.enfileira((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test826");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        fila0.frente = (byte) 1;
        boolean boolean10 = fila0.vazia();
        fila0.frente = 98;
        java.lang.Object[] objArray13 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test827");
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
        fila0.tras = (-1);
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
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test828");
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
        java.lang.Object[] objArray16 = fila0.item;
        fila0.tras = (byte) 100;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        java.lang.Object[] objArray21 = fila19.item;
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100);
        fila22.frente = (short) 0;
        fila19.enfileira((java.lang.Object) fila22);
        java.lang.Object[] objArray28 = fila22.item;
        fila0.item = objArray28;
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
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[#, -1.0, 0.0, 1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test829");
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
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test830");
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
        boolean boolean18 = fila0.vazia();
        fila0.imprime();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test831");
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
        java.lang.Object[] objArray38 = fila0.item;
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
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test832");
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
        fila0.frente = (byte) 1;
        int int65 = fila0.tras;
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test833");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        fila0.tras = 0;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) 10.0f);
        int int12 = fila8.tras;
        int int13 = fila8.tras;
        fila8.tras = (byte) 100;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100);
        java.lang.Object obj19 = fila16.desenfileira();
        fila8.enfileira((java.lang.Object) fila16);
        fila8.tras = ' ';
        int int23 = fila8.tras;
        int int24 = fila8.frente;
        java.lang.Object obj25 = fila8.desenfileira();
        int int26 = fila8.frente;
        java.lang.Object[] objArray27 = fila8.item;
        java.lang.Object[] objArray28 = fila8.item;
        fila0.item = objArray28;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100 + "'", obj19, 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0f + "'", obj25, 10.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
    }
}

