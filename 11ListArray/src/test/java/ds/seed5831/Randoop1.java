package ds.seed5831;

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
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.primeiro = (-1);
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
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
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.primeiro;
        lista19.ultimo = 10;
        lista19.primeiro = (short) 0;
        java.lang.Object[] objArray25 = lista19.item;
        lista2.item = objArray25;
        lista2.ultimo = (short) 100;
        boolean boolean29 = lista2.vazia();
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
        ds.Lista lista54 = new ds.Lista();
        int int55 = lista54.pos;
        int int56 = lista54.ultimo;
        lista54.imprime();
        lista45.insere((java.lang.Object) lista54);
        lista45.ultimo = 0;
        lista45.primeiro = 97;
        ds.Lista lista63 = new ds.Lista();
        boolean boolean64 = lista63.vazia();
        ds.Lista lista65 = new ds.Lista();
        lista65.ultimo = 100;
        lista65.ultimo = '4';
        lista65.primeiro = (byte) -1;
        lista63.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray73 = lista63.item;
        lista63.primeiro = 54;
        lista45.insere((java.lang.Object) 54);
        ds.Lista lista77 = new ds.Lista();
        int int78 = lista77.pos;
        int int79 = lista77.ultimo;
        lista77.primeiro = '#';
        ds.Lista lista82 = new ds.Lista();
        lista82.ultimo = 100;
        lista82.ultimo = '4';
        int int87 = lista82.pos;
        java.lang.Object[] objArray88 = lista82.item;
        lista77.item = objArray88;
        lista77.ultimo = 'a';
        boolean boolean92 = lista77.vazia();
        lista77.pos = 'a';
        java.lang.Object[] objArray95 = lista77.item;
        lista45.item = objArray95;
        lista2.item = objArray95;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objArray95);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
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
        lista0.pos = 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        lista0.primeiro = (-1);
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = 32;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
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
        int int36 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        int int39 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
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
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
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
        lista0.primeiro = 'a';
        lista0.pos = 53;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
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
        lista15.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        int int8 = lista0.primeiro;
        lista0.primeiro = 11;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
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
        lista42.ultimo = 100;
        lista42.ultimo = '4';
        int int47 = lista42.pos;
        ds.Lista lista48 = new ds.Lista();
        int int49 = lista48.pos;
        int int50 = lista48.ultimo;
        lista48.primeiro = '#';
        java.lang.Object[] objArray53 = lista48.item;
        lista42.item = objArray53;
        lista42.pos = 1;
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        int int7 = lista0.ultimo;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
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
        int int15 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
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
        java.lang.Object[] objArray21 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100]");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
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
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
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
        int int15 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
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
        java.lang.Class<?> wildcardClass45 = lista26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
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
        int int17 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
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
        java.lang.Class<?> wildcardClass25 = objArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        lista0.primeiro = 11;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        java.lang.Object[] objArray15 = lista10.item;
        lista10.primeiro = (byte) -1;
        int int18 = lista10.primeiro;
        lista10.insere((java.lang.Object) 10);
        lista0.insere((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        lista0.ultimo = 54;
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) -1;
        lista0.primeiro = ' ';
        lista0.primeiro = 53;
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
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
        lista15.ultimo = 0;
        int int31 = lista15.ultimo;
        lista15.imprime();
        int int33 = lista15.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
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
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        lista32.ultimo = '4';
        int int37 = lista32.pos;
        java.lang.Object[] objArray38 = lista32.item;
        lista27.item = objArray38;
        lista15.insere((java.lang.Object) lista27);
        int int41 = lista15.pos;
        int int42 = lista15.ultimo;
        java.lang.Object[] objArray43 = lista15.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 101 + "'", int42 == 101);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.primeiro = 0;
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        java.lang.Object obj9 = null;
        lista0.insere(obj9);
        lista0.primeiro = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
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
        lista15.ultimo = 0;
        int int31 = lista15.ultimo;
        lista15.primeiro = 32;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        int int9 = lista0.ultimo;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        int int5 = lista0.primeiro;
        lista0.pos = (byte) 100;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        lista9.ultimo = 10;
        lista9.ultimo = 0;
        int int15 = lista9.primeiro;
        java.lang.Object[] objArray16 = lista9.item;
        lista0.item = objArray16;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
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
        int int77 = lista0.ultimo;
        ds.Lista lista78 = new ds.Lista();
        lista78.ultimo = 100;
        lista78.ultimo = '4';
        int int83 = lista78.pos;
        ds.Lista lista84 = new ds.Lista();
        int int85 = lista84.pos;
        int int86 = lista84.ultimo;
        lista84.primeiro = '#';
        java.lang.Object[] objArray89 = lista84.item;
        lista78.item = objArray89;
        lista0.item = objArray89;
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 11 + "'", int77 == 11);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
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
        int int27 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '4';
        lista8.insere((java.lang.Object) 10.0d);
        int int15 = lista8.ultimo;
        java.lang.Object[] objArray16 = lista8.item;
        int int17 = lista8.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        lista18.ultimo = '4';
        lista18.primeiro = (byte) -1;
        boolean boolean25 = lista18.vazia();
        boolean boolean26 = lista18.vazia();
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        lista32.ultimo = '4';
        int int37 = lista32.pos;
        java.lang.Object[] objArray38 = lista32.item;
        lista27.item = objArray38;
        lista27.pos = (short) 100;
        java.lang.Object[] objArray42 = lista27.item;
        lista18.item = objArray42;
        lista8.item = objArray42;
        lista0.item = objArray42;
        java.lang.Object[] objArray46 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
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
        lista0.pos = 'a';
        lista0.ultimo = (byte) 1;
        lista0.primeiro = 101;
        int int22 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
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
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.ultimo = 54;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.ultimo = 1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
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
        java.lang.Object[] objArray21 = lista0.item;
        int int22 = lista0.ultimo;
        java.lang.Object[] objArray23 = lista0.item;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100]");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 97;
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        lista0.primeiro = (byte) 100;
        lista0.ultimo = 0;
        lista0.imprime();
        int int13 = lista0.ultimo;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.primeiro;
        lista14.ultimo = 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        lista18.ultimo = '4';
        int int23 = lista18.pos;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.primeiro = '#';
        java.lang.Object[] objArray29 = lista24.item;
        lista18.item = objArray29;
        int int31 = lista18.primeiro;
        int int32 = lista18.primeiro;
        java.lang.Object[] objArray33 = lista18.item;
        lista14.item = objArray33;
        int int35 = lista14.primeiro;
        lista0.insere((java.lang.Object) int35);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
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
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        int int15 = lista13.ultimo;
        lista13.primeiro = '4';
        lista13.imprime();
        boolean boolean19 = lista13.vazia();
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.primeiro = '#';
        java.lang.Object[] objArray25 = lista20.item;
        lista20.primeiro = (byte) -1;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.primeiro;
        lista28.ultimo = 10;
        lista28.pos = ' ';
        lista28.ultimo = 1;
        java.lang.Object[] objArray36 = lista28.item;
        lista20.item = objArray36;
        lista13.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray39 = lista13.item;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.pos;
        int int42 = lista40.ultimo;
        lista40.primeiro = '#';
        int int45 = lista40.ultimo;
        java.lang.Object[] objArray46 = lista40.item;
        lista40.pos = 0;
        int int49 = lista40.primeiro;
        ds.Lista lista50 = new ds.Lista();
        lista50.ultimo = 100;
        lista50.ultimo = '4';
        lista50.primeiro = (byte) -1;
        lista50.insere((java.lang.Object) 35);
        lista50.ultimo = (short) 1;
        lista50.pos = (short) 10;
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.pos;
        int int65 = lista63.ultimo;
        lista63.primeiro = '#';
        ds.Lista lista68 = new ds.Lista();
        lista68.ultimo = 100;
        java.lang.Object[] objArray71 = new java.lang.Object[] { 100 };
        lista63.item = objArray71;
        lista50.item = objArray71;
        lista40.item = objArray71;
        lista13.item = objArray71;
        lista0.item = objArray71;
        int int77 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[100]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
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
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        int int25 = lista23.ultimo;
        lista23.primeiro = '#';
        java.lang.Object[] objArray28 = lista23.item;
        lista23.primeiro = (byte) -1;
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.primeiro;
        lista31.ultimo = 10;
        lista31.pos = ' ';
        lista31.ultimo = 1;
        java.lang.Object[] objArray39 = lista31.item;
        lista23.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        int int42 = lista41.pos;
        int int43 = lista41.ultimo;
        lista41.primeiro = '#';
        lista41.primeiro = 0;
        lista23.insere((java.lang.Object) 0);
        boolean boolean49 = lista23.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista23);
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
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
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
        lista24.ultimo = 1;
        boolean boolean38 = lista24.vazia();
        lista24.ultimo = (byte) 1;
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        int int11 = lista0.ultimo;
        lista0.ultimo = 2;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        boolean boolean6 = lista0.vazia();
        lista0.primeiro = 54;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
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
        lista8.primeiro = (byte) 10;
        lista8.pos = (byte) 0;
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
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
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
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.primeiro;
        lista34.ultimo = 10;
        lista34.pos = ' ';
        lista34.ultimo = 1;
        java.lang.Object[] objArray42 = lista34.item;
        java.lang.Object[] objArray43 = lista34.item;
        java.lang.Object obj44 = null;
        lista34.insere(obj44);
        java.lang.Object[] objArray46 = lista34.item;
        lista15.item = objArray46;
        lista15.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
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
        int int22 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        lista0.pos = 100;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        lista6.ultimo = 0;
        lista6.ultimo = 0;
        lista6.ultimo = (short) 100;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        int int16 = lista14.ultimo;
        lista14.primeiro = '#';
        ds.Lista lista19 = new ds.Lista();
        lista19.ultimo = 100;
        lista19.ultimo = '4';
        int int24 = lista19.pos;
        java.lang.Object[] objArray25 = lista19.item;
        lista14.item = objArray25;
        lista6.item = objArray25;
        lista0.item = objArray25;
        java.lang.Object[] objArray29 = lista0.item;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
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
        ds.Lista lista31 = new ds.Lista();
        lista31.ultimo = 100;
        lista31.ultimo = '4';
        lista31.primeiro = (byte) -1;
        lista31.insere((java.lang.Object) 35);
        lista31.ultimo = (short) 1;
        lista31.pos = (short) 10;
        int int44 = lista31.pos;
        int int45 = lista31.primeiro;
        java.lang.Object[] objArray46 = lista31.item;
        lista24.item = objArray46;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        int int12 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
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
        int int43 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 100;
        int int48 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        lista11.imprime();
        lista11.ultimo = 1;
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
        java.lang.Object[] objArray34 = lista29.item;
        lista29.primeiro = (byte) -1;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.primeiro;
        lista37.ultimo = 10;
        lista37.pos = ' ';
        lista37.ultimo = 1;
        java.lang.Object[] objArray45 = lista37.item;
        lista29.item = objArray45;
        ds.Lista lista47 = new ds.Lista();
        int int48 = lista47.pos;
        int int49 = lista47.ultimo;
        lista47.primeiro = '#';
        lista47.primeiro = 0;
        lista29.insere((java.lang.Object) 0);
        ds.Lista lista55 = new ds.Lista();
        int int56 = lista55.pos;
        lista55.ultimo = 0;
        lista55.ultimo = 0;
        lista55.ultimo = (short) 100;
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.pos;
        int int65 = lista63.ultimo;
        lista63.primeiro = '#';
        ds.Lista lista68 = new ds.Lista();
        lista68.ultimo = 100;
        lista68.ultimo = '4';
        int int73 = lista68.pos;
        java.lang.Object[] objArray74 = lista68.item;
        lista63.item = objArray74;
        lista55.item = objArray74;
        lista29.item = objArray74;
        lista11.item = objArray74;
        lista0.item = objArray74;
        ds.Lista lista80 = new ds.Lista();
        int int81 = lista80.pos;
        int int82 = lista80.ultimo;
        lista80.primeiro = '4';
        lista80.insere((java.lang.Object) 10.0d);
        int int87 = lista80.ultimo;
        java.lang.Object[] objArray88 = lista80.item;
        int int89 = lista80.ultimo;
        java.lang.Object[] objArray90 = lista80.item;
        lista0.item = objArray90;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(objArray90);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
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
        lista0.pos = '#';
        int int38 = lista0.ultimo;
        int int39 = lista0.pos;
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
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
        int int27 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int11 = lista0.ultimo;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
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
        lista0.pos = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 100 };
        lista19.item = objArray27;
        lista0.item = objArray27;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        int int32 = lista30.ultimo;
        lista30.primeiro = '#';
        java.lang.Object[] objArray35 = lista30.item;
        boolean boolean36 = lista30.vazia();
        int int37 = lista30.pos;
        int int38 = lista30.ultimo;
        int int39 = lista30.ultimo;
        java.lang.Object[] objArray40 = lista30.item;
        java.lang.Class<?> wildcardClass41 = objArray40.getClass();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) wildcardClass41);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        int int8 = lista0.primeiro;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        lista8.primeiro = 0;
        int int15 = lista8.ultimo;
        lista8.pos = 54;
        java.lang.Object[] objArray18 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        int int20 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
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
        boolean boolean15 = lista7.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
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
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.primeiro;
        lista19.ultimo = 10;
        lista19.primeiro = (short) 0;
        java.lang.Object[] objArray25 = lista19.item;
        lista2.item = objArray25;
        int int27 = lista2.primeiro;
        int int28 = lista2.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
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
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        lista32.ultimo = '4';
        int int37 = lista32.pos;
        java.lang.Object[] objArray38 = lista32.item;
        lista27.item = objArray38;
        lista15.insere((java.lang.Object) lista27);
        boolean boolean41 = lista15.vazia();
        int int42 = lista15.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        boolean boolean10 = lista0.vazia();
        lista0.pos = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        int int13 = lista0.pos;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.ultimo = (byte) 10;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.pos;
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        java.lang.Object[] objArray3 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        lista4.ultimo = 0;
        int int8 = lista4.primeiro;
        lista4.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '4';
        lista10.insere((java.lang.Object) 10.0d);
        lista4.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.primeiro = 0;
        int int7 = lista0.ultimo;
        lista0.pos = 54;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54 + "'", int11 == 54);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
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
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (byte) 1);
        ds.Lista lista4 = new ds.Lista();
        lista4.primeiro = ' ';
        lista4.primeiro = '#';
        boolean boolean9 = lista4.vazia();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = 0;
        int int14 = lista10.primeiro;
        lista10.imprime();
        lista10.ultimo = 0;
        lista4.insere((java.lang.Object) lista10);
        ds.Lista lista19 = new ds.Lista();
        lista19.ultimo = 100;
        lista19.ultimo = '4';
        int int24 = lista19.pos;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        int int27 = lista25.ultimo;
        lista25.primeiro = '#';
        java.lang.Object[] objArray30 = lista25.item;
        lista19.item = objArray30;
        lista19.pos = 1;
        int int34 = lista19.primeiro;
        lista4.insere((java.lang.Object) int34);
        lista0.insere((java.lang.Object) int34);
        lista0.pos = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
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
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.primeiro = '#';
        java.lang.Object[] objArray31 = lista26.item;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        ds.Lista lista37 = new ds.Lista();
        lista37.ultimo = 100;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 100 };
        lista32.item = objArray40;
        lista26.item = objArray40;
        lista0.item = objArray40;
        java.lang.Object[] objArray44 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100]");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
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
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
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
        lista0.pos = (short) 100;
        int int18 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
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
        int int18 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        lista0.primeiro = (byte) 0;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = 33;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
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
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
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
        lista11.imprime();
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.pos;
        int int33 = lista31.ultimo;
        lista31.primeiro = '#';
        int int36 = lista31.ultimo;
        int int37 = lista31.ultimo;
        lista11.insere((java.lang.Object) int37);
        lista11.ultimo = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
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
        int int27 = lista0.primeiro;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
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
        lista21.pos = 53;
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
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
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
        int int31 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
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
        java.lang.Object[] objArray18 = lista0.item;
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = 35;
        lista0.pos = (byte) 1;
        lista0.pos = 101;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
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
        lista0.ultimo = ' ';
        boolean boolean18 = lista0.vazia();
        lista0.pos = 54;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        int int9 = lista0.pos;
        lista0.pos = 0;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
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
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 100;
        lista20.ultimo = '4';
        int int25 = lista20.pos;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = '#';
        java.lang.Object[] objArray31 = lista26.item;
        lista20.item = objArray31;
        lista20.pos = 1;
        ds.Lista lista35 = new ds.Lista();
        lista35.ultimo = 100;
        lista35.primeiro = '#';
        java.lang.Object[] objArray40 = lista35.item;
        lista35.primeiro = 35;
        lista20.insere((java.lang.Object) lista35);
        boolean boolean44 = lista35.vazia();
        lista35.ultimo = 52;
        lista35.pos = 32;
        lista0.insere((java.lang.Object) 32);
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = 54;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
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
        lista0.pos = (byte) 1;
        lista0.primeiro = (short) -1;
        int int18 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        boolean boolean14 = lista8.vazia();
        java.lang.Object[] objArray15 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        lista0.ultimo = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        lista0.pos = (byte) 100;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.ultimo = 52;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
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
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '#';
        int int39 = lista34.ultimo;
        java.lang.Object[] objArray40 = lista34.item;
        lista34.ultimo = 100;
        java.lang.Object[] objArray43 = lista34.item;
        lista24.item = objArray43;
        lista24.primeiro = (short) 100;
        lista24.pos = (short) 100;
        boolean boolean49 = lista24.vazia();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        boolean boolean5 = lista0.vazia();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (short) -1;
        int int10 = lista0.ultimo;
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
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
        lista0.pos = 0;
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
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        int int3 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
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
        int int64 = lista63.primeiro;
        lista63.ultimo = 10;
        java.lang.Object[] objArray67 = lista63.item;
        boolean boolean68 = lista63.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista63);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.primeiro = 0;
        int int7 = lista0.ultimo;
        lista0.pos = 54;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = 10;
        lista0.pos = 1;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
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
        ds.Lista lista30 = new ds.Lista();
        lista30.ultimo = 100;
        lista30.ultimo = '4';
        lista30.primeiro = (byte) -1;
        lista30.insere((java.lang.Object) 35);
        lista30.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista30);
        lista30.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
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
        java.lang.Class<?> wildcardClass63 = lista0.getClass();
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
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
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
        int int63 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = 35;
        lista0.ultimo = (short) -1;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
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
        lista11.imprime();
        lista11.ultimo = 0;
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
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        lista0.ultimo = (byte) 10;
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 100;
        lista11.ultimo = '4';
        lista11.primeiro = (byte) -1;
        lista11.insere((java.lang.Object) 35);
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 100;
        lista20.primeiro = '#';
        java.lang.Object[] objArray25 = lista20.item;
        lista11.item = objArray25;
        int int27 = lista11.ultimo;
        java.lang.Object[] objArray28 = lista11.item;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
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
        lista9.pos = 1;
        lista9.imprime();
        java.lang.Object[] objArray29 = lista9.item;
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
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
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
        lista0.primeiro = 0;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
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
        lista0.pos = (short) 0;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '4';
        lista21.insere((java.lang.Object) 10.0d);
        int int28 = lista21.ultimo;
        java.lang.Object[] objArray29 = lista21.item;
        lista21.primeiro = (byte) -1;
        int int32 = lista21.ultimo;
        lista0.insere((java.lang.Object) int32);
        boolean boolean34 = lista0.vazia();
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
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
        java.lang.Object[] objArray21 = lista0.item;
        int int22 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        int int6 = lista0.primeiro;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = 35;
        lista0.ultimo = 'a';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
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
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
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
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.primeiro = '#';
        java.lang.Object[] objArray31 = lista26.item;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        ds.Lista lista37 = new ds.Lista();
        lista37.ultimo = 100;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 100 };
        lista32.item = objArray40;
        lista26.item = objArray40;
        lista0.item = objArray40;
        lista0.ultimo = (short) 10;
        lista0.ultimo = (-1);
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100]");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
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
        lista0.pos = '#';
        int int38 = lista0.ultimo;
        int int39 = lista0.pos;
        lista0.pos = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = 35;
        lista0.ultimo = (byte) 10;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.ultimo = 100;
        lista6.primeiro = '#';
        lista6.primeiro = (-1);
        java.lang.Object[] objArray13 = lista6.item;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        int int16 = lista14.ultimo;
        lista14.primeiro = '#';
        java.lang.Object[] objArray19 = lista14.item;
        boolean boolean20 = lista14.vazia();
        java.lang.Object[] objArray21 = lista14.item;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        lista24.ultimo = '4';
        int int29 = lista24.pos;
        java.lang.Object[] objArray30 = lista24.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.ultimo = 100;
        lista31.ultimo = '4';
        int int36 = lista31.pos;
        java.lang.Object[] objArray37 = lista31.item;
        lista24.item = objArray37;
        int int39 = lista24.ultimo;
        lista22.insere((java.lang.Object) lista24);
        lista22.ultimo = 32;
        lista22.primeiro = 35;
        lista22.primeiro = (-1);
        java.lang.Object[] objArray47 = lista22.item;
        lista14.item = objArray47;
        lista6.item = objArray47;
        lista0.item = objArray47;
        boolean boolean51 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
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
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
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
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        lista8.primeiro = 0;
        int int15 = lista8.ultimo;
        lista8.pos = 54;
        java.lang.Object[] objArray18 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        int int20 = lista8.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
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
        lista8.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
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
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(objArray16);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        lista0.insere((java.lang.Object) 10);
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.primeiro = 0;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
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
        java.lang.Class<?> wildcardClass17 = objArray16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
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
        lista24.primeiro = (short) 100;
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
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.pos = (byte) -1;
        int int7 = lista0.primeiro;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
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
        lista0.primeiro = 33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        lista0.ultimo = 54;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
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
        int int83 = lista0.pos;
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
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        lista0.pos = 54;
        ds.Lista lista10 = new ds.Lista();
        lista10.ultimo = 100;
        lista10.ultimo = '4';
        lista10.primeiro = (byte) -1;
        lista10.insere((java.lang.Object) 35);
        lista10.ultimo = (short) 1;
        lista10.pos = (short) 10;
        int int23 = lista10.pos;
        int int24 = lista10.primeiro;
        java.lang.Object[] objArray25 = lista10.item;
        lista0.item = objArray25;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
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
        int int48 = lista24.ultimo;
        int int49 = lista24.pos;
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        lista0.pos = 53;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        int int6 = lista0.ultimo;
        lista0.ultimo = ' ';
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = ' ';
        int int12 = lista9.ultimo;
        lista9.pos = 100;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = 0;
        lista15.ultimo = 0;
        lista15.ultimo = (short) 100;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        int int25 = lista23.ultimo;
        lista23.primeiro = '#';
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.ultimo = '4';
        int int33 = lista28.pos;
        java.lang.Object[] objArray34 = lista28.item;
        lista23.item = objArray34;
        lista15.item = objArray34;
        lista9.item = objArray34;
        lista0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
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
        lista0.pos = 'a';
        lista0.ultimo = (byte) 1;
        int int20 = lista0.primeiro;
        lista0.ultimo = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
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
        java.lang.Object[] objArray41 = lista0.item;
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
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
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
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
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
        java.lang.Object[] objArray21 = lista0.item;
        int int22 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.pos = (byte) -1;
        lista0.pos = '#';
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        int int14 = lista9.ultimo;
        java.lang.Object[] objArray15 = lista9.item;
        lista9.imprime();
        lista9.imprime();
        int int18 = lista9.pos;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 100 };
        lista19.item = objArray27;
        lista9.item = objArray27;
        java.lang.Object[] objArray30 = lista9.item;
        lista0.item = objArray30;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100]");
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = 35;
        lista0.ultimo = 'a';
        lista0.pos = 'a';
        lista0.primeiro = (byte) 100;
        lista0.ultimo = 11;
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
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
        lista0.primeiro = 101;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista6.primeiro = (byte) -1;
        int int14 = lista6.primeiro;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista6.item = objArray20;
        lista6.pos = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        lista0.primeiro = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.pos = '4';
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
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
        int int77 = lista0.ultimo;
        boolean boolean78 = lista0.vazia();
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 11 + "'", int77 == 11);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '4';
        lista8.insere((java.lang.Object) 10.0d);
        int int15 = lista8.ultimo;
        java.lang.Object[] objArray16 = lista8.item;
        int int17 = lista8.ultimo;
        java.lang.Object[] objArray18 = lista8.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.primeiro = '#';
        ds.Lista lista25 = new ds.Lista();
        lista25.ultimo = 100;
        lista25.ultimo = '4';
        int int30 = lista25.pos;
        java.lang.Object[] objArray31 = lista25.item;
        lista20.item = objArray31;
        lista20.pos = (short) 100;
        ds.Lista lista35 = new ds.Lista();
        int int36 = lista35.pos;
        ds.Lista lista37 = new ds.Lista();
        lista37.ultimo = 100;
        lista37.ultimo = '4';
        int int42 = lista37.pos;
        ds.Lista lista43 = new ds.Lista();
        int int44 = lista43.pos;
        int int45 = lista43.ultimo;
        lista43.primeiro = '#';
        java.lang.Object[] objArray48 = lista43.item;
        lista37.item = objArray48;
        lista35.item = objArray48;
        lista20.item = objArray48;
        lista0.item = objArray48;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
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
        int int29 = lista24.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        lista0.primeiro = (short) 0;
        lista0.pos = '4';
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
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
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.ultimo = 53;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
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
        lista0.imprime();
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
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
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = ' ';
        lista33.primeiro = '#';
        lista33.pos = (short) 0;
        int int40 = lista33.pos;
        ds.Lista lista41 = new ds.Lista();
        int int42 = lista41.pos;
        int int43 = lista41.ultimo;
        lista41.primeiro = '#';
        java.lang.Object[] objArray46 = lista41.item;
        lista41.primeiro = (byte) -1;
        lista41.primeiro = 100;
        ds.Lista lista51 = new ds.Lista();
        int int52 = lista51.pos;
        int int53 = lista51.ultimo;
        lista51.primeiro = '#';
        int int56 = lista51.ultimo;
        java.lang.Object[] objArray57 = lista51.item;
        lista51.ultimo = 100;
        java.lang.Object[] objArray60 = lista51.item;
        lista41.insere((java.lang.Object) objArray60);
        lista33.item = objArray60;
        lista25.item = objArray60;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
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
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '#';
        int int39 = lista34.ultimo;
        java.lang.Object[] objArray40 = lista34.item;
        lista34.ultimo = 100;
        java.lang.Object[] objArray43 = lista34.item;
        lista24.item = objArray43;
        lista24.primeiro = (short) 100;
        lista24.pos = (short) 100;
        lista24.ultimo = 52;
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        int int6 = lista0.primeiro;
        int int7 = lista0.primeiro;
        lista0.imprime();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
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
        lista15.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        boolean boolean14 = lista8.vazia();
        java.lang.Object[] objArray15 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        boolean boolean17 = lista8.vazia();
        boolean boolean18 = lista8.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
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
        lista0.pos = 52;
        int int49 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
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
        java.lang.Object[] objArray24 = lista0.item;
        int int25 = lista0.ultimo;
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 53 + "'", int25 == 53);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
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
        ds.Lista lista47 = new ds.Lista();
        lista47.ultimo = 100;
        lista47.ultimo = '4';
        int int52 = lista47.pos;
        ds.Lista lista53 = new ds.Lista();
        int int54 = lista53.pos;
        int int55 = lista53.ultimo;
        lista53.primeiro = '#';
        java.lang.Object[] objArray58 = lista53.item;
        lista47.item = objArray58;
        lista47.pos = 1;
        ds.Lista lista62 = new ds.Lista();
        lista62.ultimo = 100;
        lista62.primeiro = '#';
        java.lang.Object[] objArray67 = lista62.item;
        lista62.primeiro = 35;
        lista47.insere((java.lang.Object) lista62);
        ds.Lista lista71 = new ds.Lista();
        int int72 = lista71.pos;
        int int73 = lista71.ultimo;
        lista71.imprime();
        lista62.insere((java.lang.Object) lista71);
        lista62.ultimo = 0;
        int int78 = lista62.ultimo;
        int int79 = lista62.ultimo;
        lista0.insere((java.lang.Object) lista62);
        int int81 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
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
        lista0.ultimo = ' ';
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        lista18.imprime();
        lista18.pos = '4';
        java.lang.Object[] objArray26 = lista18.item;
        int int27 = lista18.pos;
        lista0.insere((java.lang.Object) int27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
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
        lista15.ultimo = 0;
        int int31 = lista15.ultimo;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '4';
        int int37 = lista32.pos;
        int int38 = lista32.primeiro;
        int int39 = lista32.ultimo;
        lista32.primeiro = 11;
        lista15.insere((java.lang.Object) 11);
        lista15.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        int int9 = lista0.primeiro;
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
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
        int int44 = lista16.primeiro;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 53 + "'", int43 == 53);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        lista4.ultimo = 0;
        lista4.imprime();
        lista4.insere((java.lang.Object) 10.0f);
        int int11 = lista4.ultimo;
        boolean boolean12 = lista4.vazia();
        int int13 = lista4.primeiro;
        lista0.insere((java.lang.Object) lista4);
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
        lista15.pos = 1;
        int int30 = lista15.primeiro;
        lista15.primeiro = (short) 1;
        int int33 = lista15.primeiro;
        lista15.ultimo = 97;
        int int36 = lista15.ultimo;
        lista4.insere((java.lang.Object) int36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
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
        int int37 = lista36.pos;
        int int38 = lista36.ultimo;
        lista36.primeiro = '#';
        java.lang.Object[] objArray41 = lista36.item;
        lista36.primeiro = (byte) -1;
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.primeiro;
        lista44.ultimo = 10;
        lista44.pos = ' ';
        lista44.ultimo = 1;
        java.lang.Object[] objArray52 = lista44.item;
        lista36.item = objArray52;
        ds.Lista lista54 = new ds.Lista();
        int int55 = lista54.pos;
        int int56 = lista54.ultimo;
        lista54.primeiro = '#';
        lista54.primeiro = 0;
        lista36.insere((java.lang.Object) 0);
        java.lang.Object[] objArray62 = lista36.item;
        lista21.item = objArray62;
        int int64 = lista21.ultimo;
        lista21.primeiro = (short) 1;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
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
        int int27 = lista0.primeiro;
        lista0.imprime();
        int int29 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = (byte) 0;
        int int8 = lista0.ultimo;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        int int9 = lista0.primeiro;
        lista0.primeiro = ' ';
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
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
        int int16 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista0.item = objArray16;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        int int23 = lista18.ultimo;
        int int24 = lista18.ultimo;
        java.lang.Object obj25 = null;
        lista18.insere(obj25);
        lista18.ultimo = (byte) 10;
        boolean boolean29 = lista18.vazia();
        java.lang.Object[] objArray30 = lista18.item;
        lista0.item = objArray30;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
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
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        lista32.ultimo = '4';
        int int37 = lista32.pos;
        java.lang.Object[] objArray38 = lista32.item;
        lista27.item = objArray38;
        lista15.insere((java.lang.Object) lista27);
        java.lang.Class<?> wildcardClass41 = lista15.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
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
        lista0.ultimo = (byte) -1;
        lista0.pos = (byte) 100;
        ds.Lista lista48 = new ds.Lista();
        int int49 = lista48.pos;
        ds.Lista lista50 = new ds.Lista();
        lista50.ultimo = 100;
        lista50.ultimo = '4';
        lista50.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass57 = lista50.getClass();
        lista48.insere((java.lang.Object) wildcardClass57);
        lista48.pos = (short) 0;
        java.lang.Object[] objArray61 = lista48.item;
        lista0.item = objArray61;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 54 + "'", int43 == 54);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
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
        lista0.ultimo = 0;
        int int27 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass9 = lista2.getClass();
        lista0.insere((java.lang.Object) wildcardClass9);
        lista0.primeiro = 0;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
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
        int int21 = lista0.primeiro;
        int int22 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
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
        int int31 = lista24.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
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
        java.lang.Object[] objArray19 = lista2.item;
        lista2.primeiro = (short) 1;
        java.lang.Class<?> wildcardClass22 = lista2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.primeiro;
        lista3.ultimo = 10;
        lista3.primeiro = (short) 0;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        int int6 = lista0.primeiro;
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
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
        java.lang.Object[] objArray16 = lista0.item;
        java.lang.Object[] objArray17 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
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
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.primeiro = '#';
        lista20.imprime();
        lista20.ultimo = 1;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        int int30 = lista28.ultimo;
        lista28.primeiro = '#';
        lista28.imprime();
        lista28.ultimo = 1;
        lista20.insere((java.lang.Object) lista28);
        java.lang.Object[] objArray37 = lista28.item;
        lista0.item = objArray37;
        lista0.ultimo = 97;
        int int41 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(objArray16);
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
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
        java.lang.Object[] objArray24 = lista0.item;
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        java.lang.Object[] objArray33 = lista27.item;
        ds.Lista lista34 = new ds.Lista();
        lista34.ultimo = 100;
        lista34.ultimo = '4';
        int int39 = lista34.pos;
        java.lang.Object[] objArray40 = lista34.item;
        lista27.item = objArray40;
        int int42 = lista27.ultimo;
        lista25.insere((java.lang.Object) lista27);
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.primeiro;
        lista44.ultimo = 10;
        lista44.primeiro = (short) 0;
        java.lang.Object[] objArray50 = lista44.item;
        lista27.item = objArray50;
        lista0.item = objArray50;
        int int53 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
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
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        java.lang.Object[] objArray23 = lista18.item;
        int int24 = lista18.primeiro;
        lista18.imprime();
        lista0.insere((java.lang.Object) lista18);
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '4';
        lista27.imprime();
        boolean boolean33 = lista27.vazia();
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '#';
        java.lang.Object[] objArray39 = lista34.item;
        lista34.primeiro = (byte) -1;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.primeiro;
        lista42.ultimo = 10;
        lista42.pos = ' ';
        lista42.ultimo = 1;
        java.lang.Object[] objArray50 = lista42.item;
        lista34.item = objArray50;
        lista27.insere((java.lang.Object) lista34);
        java.lang.Object[] objArray53 = lista27.item;
        lista18.insere((java.lang.Object) objArray53);
        lista18.pos = (byte) -1;
        int int57 = lista18.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        lista0.primeiro = (byte) 10;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        int int13 = lista8.ultimo;
        int int14 = lista8.ultimo;
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
        lista8.item = objArray26;
        java.lang.Class<?> wildcardClass29 = objArray26.getClass();
        lista0.insere((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
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
        lista24.ultimo = 101;
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
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        boolean boolean10 = lista0.vazia();
        lista0.pos = ' ';
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass9 = lista2.getClass();
        lista0.insere((java.lang.Object) wildcardClass9);
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        int int16 = lista11.ultimo;
        int int17 = lista11.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        lista18.ultimo = '4';
        int int23 = lista18.pos;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.primeiro = '#';
        java.lang.Object[] objArray29 = lista24.item;
        lista18.item = objArray29;
        lista11.item = objArray29;
        lista0.insere((java.lang.Object) lista11);
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
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
        java.lang.Object[] objArray26 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
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
        java.lang.Class<?> wildcardClass18 = lista7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
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
        int int27 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.primeiro;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
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
        ds.Lista lista30 = new ds.Lista();
        lista30.ultimo = 100;
        lista30.ultimo = '4';
        lista30.primeiro = (byte) -1;
        lista30.insere((java.lang.Object) 35);
        lista30.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista30);
        int int42 = lista30.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = 35;
        lista0.ultimo = 'a';
        lista0.primeiro = (byte) 10;
        int int11 = lista0.primeiro;
        int int12 = lista0.primeiro;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
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
        lista21.primeiro = ' ';
        int int24 = lista21.ultimo;
        int int25 = lista21.primeiro;
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.ultimo = '4';
        int int31 = lista26.pos;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        java.lang.Object[] objArray37 = lista32.item;
        lista26.item = objArray37;
        lista26.pos = 1;
        ds.Lista lista41 = new ds.Lista();
        lista41.ultimo = 100;
        lista41.primeiro = '#';
        java.lang.Object[] objArray46 = lista41.item;
        lista41.primeiro = 35;
        lista26.insere((java.lang.Object) lista41);
        java.lang.Object[] objArray50 = lista26.item;
        lista21.insere((java.lang.Object) objArray50);
        lista0.item = objArray50;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
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
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = (short) 0;
        int int7 = lista0.pos;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        lista0.ultimo = 54;
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        lista0.ultimo = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
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
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '#';
        java.lang.Object[] objArray39 = lista34.item;
        lista34.primeiro = (byte) -1;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.primeiro;
        lista42.ultimo = 10;
        lista42.pos = ' ';
        lista42.ultimo = 1;
        java.lang.Object[] objArray50 = lista42.item;
        lista34.item = objArray50;
        ds.Lista lista52 = new ds.Lista();
        int int53 = lista52.pos;
        int int54 = lista52.ultimo;
        lista52.primeiro = '#';
        lista52.primeiro = 0;
        lista34.insere((java.lang.Object) 0);
        java.lang.Object[] objArray60 = lista34.item;
        lista19.item = objArray60;
        lista0.item = objArray60;
        boolean boolean63 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
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
        int int18 = lista7.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray11 = lista0.item;
        ds.Lista lista12 = new ds.Lista();
        lista12.ultimo = 100;
        lista12.ultimo = '4';
        int int17 = lista12.pos;
        boolean boolean18 = lista12.vazia();
        lista12.primeiro = 54;
        int int21 = lista12.pos;
        lista12.pos = 97;
        lista0.insere((java.lang.Object) lista12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
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
        java.lang.Class<?> wildcardClass42 = objArray37.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        lista0.pos = 35;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
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
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
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
        int int16 = lista0.pos;
        java.lang.Object[] objArray17 = lista0.item;
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
        int int31 = lista18.primeiro;
        java.lang.Object[] objArray32 = lista18.item;
        lista18.imprime();
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
        ds.Lista lista50 = new ds.Lista();
        int int51 = lista50.pos;
        int int52 = lista50.ultimo;
        lista50.primeiro = '#';
        int int55 = lista50.ultimo;
        java.lang.Object[] objArray56 = lista50.item;
        lista34.insere((java.lang.Object) objArray56);
        lista18.item = objArray56;
        lista0.item = objArray56;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
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
        int int20 = lista0.primeiro;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
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
        lista45.pos = 1;
        int int60 = lista45.primeiro;
        lista45.ultimo = 32;
        java.lang.Object[] objArray63 = lista45.item;
        lista0.item = objArray63;
        lista0.primeiro = '4';
        int int67 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 52 + "'", int67 == 52);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
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
        lista24.ultimo = 1;
        boolean boolean38 = lista24.vazia();
        lista24.pos = (byte) 1;
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        lista0.primeiro = 11;
        ds.Lista lista10 = new ds.Lista();
        lista10.ultimo = 100;
        lista10.ultimo = '4';
        int int15 = lista10.pos;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '#';
        java.lang.Object[] objArray21 = lista16.item;
        lista10.item = objArray21;
        lista10.pos = 1;
        int int25 = lista10.primeiro;
        lista10.primeiro = (short) 1;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        int int30 = lista28.ultimo;
        lista28.primeiro = '#';
        java.lang.Object[] objArray33 = lista28.item;
        int int34 = lista28.primeiro;
        lista28.imprime();
        lista10.insere((java.lang.Object) lista28);
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.pos;
        int int39 = lista37.ultimo;
        lista37.primeiro = '4';
        lista37.imprime();
        boolean boolean43 = lista37.vazia();
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.pos;
        int int46 = lista44.ultimo;
        lista44.primeiro = '#';
        java.lang.Object[] objArray49 = lista44.item;
        lista44.primeiro = (byte) -1;
        ds.Lista lista52 = new ds.Lista();
        int int53 = lista52.primeiro;
        lista52.ultimo = 10;
        lista52.pos = ' ';
        lista52.ultimo = 1;
        java.lang.Object[] objArray60 = lista52.item;
        lista44.item = objArray60;
        lista37.insere((java.lang.Object) lista44);
        java.lang.Object[] objArray63 = lista37.item;
        lista28.insere((java.lang.Object) objArray63);
        lista0.item = objArray63;
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
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
        java.lang.Class<?> wildcardClass29 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        lista0.ultimo = 54;
        lista0.ultimo = (byte) 10;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
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
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
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
        int int21 = lista0.ultimo;
        int int22 = lista0.pos;
        lista0.primeiro = 33;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        int int5 = lista0.primeiro;
        lista0.ultimo = (-1);
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
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
        int int34 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        int int11 = lista0.pos;
        lista0.pos = 97;
        int int14 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
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
        int int14 = lista0.ultimo;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.ultimo = '4';
        lista15.primeiro = (byte) -1;
        lista15.insere((java.lang.Object) 35);
        lista15.ultimo = (short) 1;
        lista15.pos = (short) 10;
        lista0.insere((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
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
        int int25 = lista17.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        lista0.insere((java.lang.Object) 10);
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.primeiro;
        lista11.ultimo = 10;
        lista11.primeiro = (short) 0;
        java.lang.Object[] objArray17 = lista11.item;
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        lista18.primeiro = '#';
        java.lang.Object[] objArray23 = lista18.item;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.primeiro = '#';
        ds.Lista lista29 = new ds.Lista();
        lista29.ultimo = 100;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 100 };
        lista24.item = objArray32;
        lista18.item = objArray32;
        lista11.item = objArray32;
        lista0.item = objArray32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100]");
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        lista0.ultimo = 54;
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = 10;
        lista0.pos = 1;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean4 = lista0.vazia();
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
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
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
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
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.ultimo = '4';
        int int26 = lista21.pos;
        java.lang.Object[] objArray27 = lista21.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.ultimo = '4';
        int int33 = lista28.pos;
        java.lang.Object[] objArray34 = lista28.item;
        lista21.item = objArray34;
        int int36 = lista21.ultimo;
        lista19.insere((java.lang.Object) lista21);
        lista19.imprime();
        lista19.ultimo = 'a';
        boolean boolean41 = lista19.vazia();
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista42.primeiro = (byte) -1;
        ds.Lista lista50 = new ds.Lista();
        int int51 = lista50.primeiro;
        lista50.ultimo = 10;
        lista50.pos = ' ';
        lista50.ultimo = 1;
        java.lang.Object[] objArray58 = lista50.item;
        lista42.item = objArray58;
        ds.Lista lista60 = new ds.Lista();
        int int61 = lista60.pos;
        int int62 = lista60.ultimo;
        lista60.primeiro = '#';
        lista60.primeiro = 0;
        lista42.insere((java.lang.Object) 0);
        java.lang.Object[] objArray68 = lista42.item;
        java.lang.Object[] objArray69 = lista42.item;
        lista19.item = objArray69;
        lista0.insere((java.lang.Object) lista19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '4';
        lista8.insere((java.lang.Object) 10.0d);
        int int15 = lista8.ultimo;
        java.lang.Object[] objArray16 = lista8.item;
        int int17 = lista8.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        lista18.ultimo = '4';
        lista18.primeiro = (byte) -1;
        boolean boolean25 = lista18.vazia();
        boolean boolean26 = lista18.vazia();
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        lista32.ultimo = '4';
        int int37 = lista32.pos;
        java.lang.Object[] objArray38 = lista32.item;
        lista27.item = objArray38;
        lista27.pos = (short) 100;
        java.lang.Object[] objArray42 = lista27.item;
        lista18.item = objArray42;
        lista8.item = objArray42;
        lista0.item = objArray42;
        java.lang.Class<?> wildcardClass46 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
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
        int int19 = lista2.pos;
        int int20 = lista2.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
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
        int int43 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int46 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
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
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.ultimo = '4';
        int int31 = lista26.pos;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        java.lang.Object[] objArray37 = lista32.item;
        lista26.item = objArray37;
        lista26.pos = 1;
        int int41 = lista26.primeiro;
        lista26.primeiro = (short) 1;
        lista26.pos = (short) -1;
        boolean boolean46 = lista26.vazia();
        ds.Lista lista47 = new ds.Lista();
        int int48 = lista47.pos;
        int int49 = lista47.ultimo;
        lista47.primeiro = '#';
        ds.Lista lista52 = new ds.Lista();
        lista52.ultimo = 100;
        lista52.ultimo = '4';
        int int57 = lista52.pos;
        java.lang.Object[] objArray58 = lista52.item;
        lista47.item = objArray58;
        int int60 = lista47.primeiro;
        java.lang.Object[] objArray61 = lista47.item;
        lista26.insere((java.lang.Object) lista47);
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.pos;
        int int65 = lista63.ultimo;
        lista63.primeiro = '#';
        java.lang.Object[] objArray68 = lista63.item;
        lista63.primeiro = (byte) -1;
        int int71 = lista63.primeiro;
        ds.Lista lista72 = new ds.Lista();
        lista72.ultimo = 100;
        lista72.primeiro = '#';
        java.lang.Object[] objArray77 = lista72.item;
        lista63.item = objArray77;
        lista26.item = objArray77;
        lista0.insere((java.lang.Object) lista26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        int int6 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
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
        int int52 = lista43.pos;
        ds.Lista lista53 = new ds.Lista();
        int int54 = lista53.pos;
        lista53.ultimo = 0;
        int int57 = lista53.pos;
        java.lang.Object obj58 = null;
        lista53.insere(obj58);
        lista43.insere((java.lang.Object) lista53);
        int int61 = lista43.primeiro;
        ds.Lista lista62 = new ds.Lista();
        int int63 = lista62.primeiro;
        lista62.ultimo = 10;
        lista62.pos = ' ';
        lista62.ultimo = 1;
        java.lang.Object[] objArray70 = lista62.item;
        java.lang.Object[] objArray71 = lista62.item;
        java.lang.Object obj72 = null;
        lista62.insere(obj72);
        java.lang.Object[] objArray74 = lista62.item;
        lista43.item = objArray74;
        lista9.item = objArray74;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
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
        java.lang.Object[] objArray25 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        lista0.ultimo = 32;
        lista0.pos = (byte) 0;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.primeiro;
        lista3.ultimo = 10;
        lista3.primeiro = (short) 0;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        int int11 = lista0.primeiro;
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (short) 10;
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        boolean boolean13 = lista10.vazia();
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        int int16 = lista14.ultimo;
        lista14.primeiro = '#';
        int int19 = lista14.ultimo;
        java.lang.Object[] objArray20 = lista14.item;
        lista14.imprime();
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
        lista22.ultimo = 'a';
        boolean boolean37 = lista22.vazia();
        lista22.pos = 'a';
        java.lang.Object[] objArray40 = lista22.item;
        lista14.item = objArray40;
        lista10.item = objArray40;
        lista0.item = objArray40;
        java.lang.Object[] objArray44 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        ds.Lista lista12 = new ds.Lista();
        lista12.ultimo = 100;
        lista12.ultimo = '4';
        int int17 = lista12.pos;
        java.lang.Object[] objArray18 = lista12.item;
        lista7.item = objArray18;
        int int20 = lista7.primeiro;
        java.lang.Object[] objArray21 = lista7.item;
        lista7.imprime();
        int int23 = lista7.pos;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        lista24.ultimo = 10;
        lista24.primeiro = (short) 0;
        int int30 = lista24.ultimo;
        lista7.insere((java.lang.Object) lista24);
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '4';
        lista32.insere((java.lang.Object) 10.0d);
        java.lang.Object[] objArray39 = lista32.item;
        java.lang.Object[] objArray40 = lista32.item;
        lista32.primeiro = 52;
        lista24.insere((java.lang.Object) 52);
        lista0.insere((java.lang.Object) lista24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int6 = lista0.pos;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
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
        int int21 = lista0.pos;
        int int22 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista9.primeiro = 35;
        lista9.ultimo = (short) 10;
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
        ds.Lista lista34 = new ds.Lista();
        lista34.ultimo = 100;
        lista34.ultimo = '4';
        int int39 = lista34.pos;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.pos;
        int int42 = lista40.ultimo;
        lista40.primeiro = '#';
        java.lang.Object[] objArray45 = lista40.item;
        lista34.item = objArray45;
        lista19.item = objArray45;
        lista9.item = objArray45;
        lista0.insere((java.lang.Object) lista9);
        int int50 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object obj8 = null;
        lista0.insere(obj8);
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = (byte) 0;
        int int8 = lista0.ultimo;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray12 = lista0.item;
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
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
        lista0.pos = 'a';
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.primeiro;
        lista20.ultimo = 10;
        lista20.primeiro = (short) 0;
        int int26 = lista20.ultimo;
        lista20.pos = (short) 1;
        java.lang.Class<?> wildcardClass29 = lista20.getClass();
        lista0.insere((java.lang.Object) wildcardClass29);
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.primeiro;
        lista31.ultimo = 10;
        ds.Lista lista35 = new ds.Lista();
        int int36 = lista35.pos;
        int int37 = lista35.ultimo;
        lista35.primeiro = '#';
        int int40 = lista35.ultimo;
        java.lang.Object[] objArray41 = lista35.item;
        lista35.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.ultimo = 100;
        lista43.ultimo = '4';
        lista43.primeiro = (byte) -1;
        lista43.insere((java.lang.Object) 35);
        ds.Lista lista52 = new ds.Lista();
        lista52.ultimo = 100;
        lista52.primeiro = '#';
        java.lang.Object[] objArray57 = lista52.item;
        lista43.item = objArray57;
        lista35.item = objArray57;
        java.lang.Object[] objArray60 = lista35.item;
        lista31.item = objArray60;
        boolean boolean62 = lista31.vazia();
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.pos;
        int int65 = lista63.ultimo;
        lista63.primeiro = '#';
        java.lang.Object[] objArray68 = lista63.item;
        lista63.primeiro = (byte) -1;
        int int71 = lista63.primeiro;
        ds.Lista lista72 = new ds.Lista();
        lista72.ultimo = 100;
        lista72.primeiro = '#';
        java.lang.Object[] objArray77 = lista72.item;
        lista63.item = objArray77;
        java.lang.Object[] objArray79 = lista63.item;
        lista31.item = objArray79;
        lista0.item = objArray79;
        int int82 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        boolean boolean8 = lista0.vazia();
        lista0.primeiro = (short) -1;
        lista0.ultimo = 101;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
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
        lista0.pos = 11;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0]");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
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
        lista0.pos = (short) 0;
        lista0.primeiro = (short) -1;
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.ultimo;
        lista0.pos = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
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
        lista0.ultimo = (short) 100;
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
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = 35;
        lista0.ultimo = (byte) 10;
        int int10 = lista0.primeiro;
        lista0.primeiro = (-1);
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
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
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        lista32.ultimo = '4';
        int int37 = lista32.pos;
        java.lang.Object[] objArray38 = lista32.item;
        lista27.item = objArray38;
        lista15.insere((java.lang.Object) lista27);
        lista27.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
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
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
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
        int int26 = lista10.pos;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.primeiro;
        lista27.ultimo = 10;
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.pos;
        int int33 = lista31.ultimo;
        lista31.primeiro = '#';
        int int36 = lista31.ultimo;
        java.lang.Object[] objArray37 = lista31.item;
        lista31.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.ultimo = 100;
        lista39.ultimo = '4';
        lista39.primeiro = (byte) -1;
        lista39.insere((java.lang.Object) 35);
        ds.Lista lista48 = new ds.Lista();
        lista48.ultimo = 100;
        lista48.primeiro = '#';
        java.lang.Object[] objArray53 = lista48.item;
        lista39.item = objArray53;
        lista31.item = objArray53;
        java.lang.Object[] objArray56 = lista31.item;
        lista27.item = objArray56;
        lista10.insere((java.lang.Object) objArray56);
        lista0.item = objArray56;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
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
        lista0.primeiro = 35;
        lista0.ultimo = ' ';
        lista0.primeiro = 53;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
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
        lista0.pos = '#';
        java.lang.Class<?> wildcardClass38 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object obj8 = null;
        lista0.insere(obj8);
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        lista0.primeiro = (byte) 100;
        lista0.ultimo = 0;
        lista0.imprime();
        int int13 = lista0.ultimo;
        lista0.imprime();
        lista0.pos = (byte) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
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
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
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
        lista0.pos = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 100 };
        lista19.item = objArray27;
        lista0.item = objArray27;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        lista30.ultimo = 0;
        lista30.imprime();
        lista30.insere((java.lang.Object) 10.0f);
        lista30.primeiro = (short) -1;
        int int39 = lista30.pos;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.pos;
        int int42 = lista40.ultimo;
        lista40.primeiro = '#';
        int int45 = lista40.ultimo;
        java.lang.Object[] objArray46 = lista40.item;
        lista40.ultimo = 100;
        java.lang.Object[] objArray49 = lista40.item;
        lista30.item = objArray49;
        lista0.item = objArray49;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = 10;
        lista0.pos = 1;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.pos;
        lista0.insere((java.lang.Object) int13);
        int int15 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        lista0.ultimo = 0;
        int int11 = lista0.ultimo;
        lista0.pos = 100;
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (short) -1;
        lista0.primeiro = 11;
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        lista0.ultimo = 54;
        lista0.ultimo = (byte) 10;
        lista0.pos = (byte) 1;
        int int15 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test802");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test803");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.insere((java.lang.Object) 1.0f);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.ultimo = 10;
        lista10.primeiro = (short) 0;
        java.lang.Object[] objArray16 = lista10.item;
        java.lang.Object[] objArray17 = lista10.item;
        java.lang.Object[] objArray18 = lista10.item;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        java.lang.Object[] objArray24 = lista19.item;
        boolean boolean25 = lista19.vazia();
        int int26 = lista19.pos;
        lista19.pos = (byte) 1;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        int int34 = lista29.ultimo;
        java.lang.Object[] objArray35 = lista29.item;
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.pos;
        int int38 = lista36.ultimo;
        lista36.imprime();
        lista36.ultimo = ' ';
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        boolean boolean48 = lista42.vazia();
        lista42.imprime();
        lista36.insere((java.lang.Object) lista42);
        java.lang.Object[] objArray51 = lista36.item;
        lista29.insere((java.lang.Object) objArray51);
        lista19.item = objArray51;
        lista10.item = objArray51;
        ds.Lista lista55 = new ds.Lista();
        lista55.ultimo = 100;
        lista55.ultimo = '4';
        int int60 = lista55.pos;
        ds.Lista lista61 = new ds.Lista();
        int int62 = lista61.pos;
        int int63 = lista61.ultimo;
        lista61.primeiro = '#';
        java.lang.Object[] objArray66 = lista61.item;
        lista55.item = objArray66;
        lista55.pos = 1;
        int int70 = lista55.primeiro;
        lista55.ultimo = 32;
        java.lang.Object[] objArray73 = lista55.item;
        lista10.item = objArray73;
        lista0.insere((java.lang.Object) objArray73);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test804");
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
        lista0.pos = 'a';
        lista0.pos = 0;
        java.lang.Object[] objArray20 = lista0.item;
        java.lang.Object[] objArray21 = lista0.item;
        int int22 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test805");
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
        lista0.pos = (byte) 1;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test806");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (short) 10;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test807");
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
        boolean boolean16 = lista0.vazia();
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
        int int30 = lista17.primeiro;
        lista0.insere((java.lang.Object) lista17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test808");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        lista4.ultimo = 100;
        lista4.ultimo = '4';
        int int9 = lista4.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        java.lang.Object[] objArray15 = lista10.item;
        lista4.item = objArray15;
        int int17 = lista4.primeiro;
        int int18 = lista4.primeiro;
        java.lang.Object[] objArray19 = lista4.item;
        lista0.item = objArray19;
        int int21 = lista0.primeiro;
        int int22 = lista0.ultimo;
        lista0.ultimo = 1;
        int int25 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test809");
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
        int int24 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test810");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        int int8 = lista0.ultimo;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test811");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        int int13 = lista0.pos;
        lista0.pos = (short) -1;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test812");
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
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test813");
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
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100]");
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test814");
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
        lista0.imprime();
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
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test815");
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
        lista0.primeiro = (short) 10;
        lista0.ultimo = 0;
        lista0.primeiro = (-1);
        boolean boolean32 = lista0.vazia();
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        int int35 = lista33.ultimo;
        lista33.primeiro = '#';
        java.lang.Object[] objArray38 = lista33.item;
        boolean boolean39 = lista33.vazia();
        lista33.pos = ' ';
        lista0.insere((java.lang.Object) lista33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test816");
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
        lista0.pos = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test817");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = (short) 0;
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.ultimo = (byte) 100;
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test818");
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
        lista0.ultimo = 10;
        int int20 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test819");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test820");
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
        lista0.pos = 'a';
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 54 + "'", int43 == 54);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test821");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test822");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        lista0.ultimo = 54;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = '4';
        int int15 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test823");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = 11;
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test824");
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
        lista0.pos = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test825");
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
        lista0.ultimo = (short) 10;
        lista0.primeiro = 1;
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
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test826");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100 };
        lista0.item = objArray8;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test827");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 100;
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test828");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        int int5 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test829");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        lista13.ultimo = 0;
        lista13.imprime();
        lista13.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray20 = lista13.item;
        int int21 = lista13.primeiro;
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
        lista13.item = objArray33;
        lista0.insere((java.lang.Object) objArray33);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test830");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.primeiro = (short) 10;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test831");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) -1;
        lista0.primeiro = ' ';
        lista0.primeiro = 53;
        int int15 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test832");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        boolean boolean14 = lista8.vazia();
        java.lang.Object[] objArray15 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        int int17 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test833");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        int int7 = lista0.pos;
        lista0.primeiro = 52;
        lista0.pos = ' ';
        int int12 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test834");
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
        lista0.pos = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 100 };
        lista19.item = objArray27;
        lista0.item = objArray27;
        int int30 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test835");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        lista0.ultimo = 97;
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test836");
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
        lista0.pos = (byte) 0;
        int int22 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test837");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.ultimo = 10;
        java.lang.Object[] objArray17 = lista13.item;
        lista0.item = objArray17;
        java.lang.Class<?> wildcardClass19 = objArray17.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test838");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        lista0.primeiro = 100;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = null;
        lista0.item = objArray11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test839");
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
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test840");
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
        ds.Lista lista47 = new ds.Lista();
        lista47.ultimo = 100;
        lista47.ultimo = '4';
        lista47.primeiro = (byte) -1;
        lista47.ultimo = (byte) 10;
        lista47.ultimo = 32;
        ds.Lista lista58 = new ds.Lista();
        int int59 = lista58.pos;
        int int60 = lista58.ultimo;
        lista58.primeiro = '#';
        java.lang.Object[] objArray63 = lista58.item;
        lista58.primeiro = (byte) -1;
        int int66 = lista58.primeiro;
        ds.Lista lista67 = new ds.Lista();
        int int68 = lista67.pos;
        int int69 = lista67.ultimo;
        lista67.primeiro = '#';
        java.lang.Object[] objArray72 = lista67.item;
        lista58.item = objArray72;
        lista47.item = objArray72;
        lista0.item = objArray72;
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test841");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = 0;
        lista10.ultimo = 10;
        int int16 = lista10.pos;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        int int19 = lista17.ultimo;
        lista17.primeiro = '#';
        int int22 = lista17.ultimo;
        java.lang.Object[] objArray23 = lista17.item;
        lista17.imprime();
        lista17.imprime();
        int int26 = lista17.pos;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 100 };
        lista27.item = objArray35;
        lista17.item = objArray35;
        java.lang.Object[] objArray38 = lista17.item;
        lista10.item = objArray38;
        lista0.insere((java.lang.Object) objArray38);
        boolean boolean41 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test842");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (short) 10;
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        boolean boolean13 = lista10.vazia();
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        int int16 = lista14.ultimo;
        lista14.primeiro = '#';
        int int19 = lista14.ultimo;
        java.lang.Object[] objArray20 = lista14.item;
        lista14.imprime();
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
        lista22.ultimo = 'a';
        boolean boolean37 = lista22.vazia();
        lista22.pos = 'a';
        java.lang.Object[] objArray40 = lista22.item;
        lista14.item = objArray40;
        lista10.item = objArray40;
        lista0.item = objArray40;
        int int44 = lista0.pos;
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test843");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test844");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        lista0.pos = (-1);
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test845");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = 52;
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test846");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = 101;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test847");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        lista0.primeiro = (-1);
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = 32;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test848");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        java.lang.Object[] objArray16 = lista8.item;
        java.lang.Object[] objArray17 = lista8.item;
        lista0.insere((java.lang.Object) objArray17);
        ds.Lista lista19 = new ds.Lista();
        lista19.primeiro = ' ';
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.primeiro;
        lista22.ultimo = 10;
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        lista19.item = objArray28;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test849");
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
        lista43.primeiro = ' ';
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
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test850");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.primeiro;
        lista6.ultimo = 10;
        lista6.pos = ' ';
        lista6.ultimo = 1;
        java.lang.Object[] objArray14 = lista6.item;
        lista0.item = objArray14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test851");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = (short) 1;
        lista0.ultimo = (byte) -1;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test852");
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
        int int16 = lista0.ultimo;
        java.lang.Object[] objArray17 = lista0.item;
        boolean boolean18 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test853");
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
        lista25.primeiro = (byte) 1;
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
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test854");
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
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.primeiro;
        lista19.ultimo = 10;
        lista19.primeiro = (short) 0;
        java.lang.Object[] objArray25 = lista19.item;
        lista2.item = objArray25;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        lista27.imprime();
        lista27.ultimo = 1;
        ds.Lista lista35 = new ds.Lista();
        int int36 = lista35.pos;
        int int37 = lista35.ultimo;
        lista35.primeiro = '#';
        lista35.imprime();
        lista35.ultimo = 1;
        lista27.insere((java.lang.Object) lista35);
        java.lang.Object[] objArray44 = lista35.item;
        lista2.item = objArray44;
        lista2.ultimo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test855");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        lista0.ultimo = (short) 1;
        int int11 = lista0.ultimo;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test856");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        lista0.primeiro = ' ';
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test857");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.ultimo = 0;
        lista0.ultimo = (short) 100;
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test858");
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
        int int16 = lista7.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test859");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        lista0.ultimo = 32;
        int int7 = lista0.ultimo;
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
        int int23 = lista8.primeiro;
        lista8.primeiro = (short) 1;
        int int26 = lista8.primeiro;
        lista0.insere((java.lang.Object) lista8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test860");
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
        ds.Lista lista45 = new ds.Lista();
        int int46 = lista45.pos;
        lista45.ultimo = 0;
        lista45.imprime();
        boolean boolean50 = lista45.vazia();
        lista45.ultimo = (byte) 10;
        lista7.insere((java.lang.Object) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test861");
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
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test862");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.ultimo = (byte) 10;
        lista8.ultimo = 32;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        java.lang.Object[] objArray24 = lista19.item;
        lista19.primeiro = (byte) -1;
        int int27 = lista19.primeiro;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        int int30 = lista28.ultimo;
        lista28.primeiro = '#';
        java.lang.Object[] objArray33 = lista28.item;
        lista19.item = objArray33;
        lista8.item = objArray33;
        lista0.insere((java.lang.Object) lista8);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test863");
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
        lista0.imprime();
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
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test864");
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
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '#';
        int int39 = lista34.ultimo;
        java.lang.Object[] objArray40 = lista34.item;
        lista34.ultimo = 100;
        java.lang.Object[] objArray43 = lista34.item;
        lista24.item = objArray43;
        lista24.primeiro = (short) 100;
        ds.Lista lista47 = new ds.Lista();
        int int48 = lista47.pos;
        lista47.insere((java.lang.Object) (byte) 1);
        boolean boolean51 = lista47.vazia();
        int int52 = lista47.pos;
        java.lang.Object[] objArray53 = lista47.item;
        int int54 = lista47.pos;
        lista24.insere((java.lang.Object) lista47);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test865");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = 0;
        lista10.ultimo = 10;
        int int16 = lista10.pos;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        int int19 = lista17.ultimo;
        lista17.primeiro = '#';
        int int22 = lista17.ultimo;
        java.lang.Object[] objArray23 = lista17.item;
        lista17.imprime();
        lista17.imprime();
        int int26 = lista17.pos;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 100 };
        lista27.item = objArray35;
        lista17.item = objArray35;
        java.lang.Object[] objArray38 = lista17.item;
        lista10.item = objArray38;
        lista0.insere((java.lang.Object) objArray38);
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100]");
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test866");
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
        lista24.ultimo = 1;
        boolean boolean38 = lista24.vazia();
        int int39 = lista24.ultimo;
        lista24.pos = 10;
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test867");
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
        int int17 = lista0.pos;
        lista0.ultimo = '4';
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test868");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        lista0.ultimo = 32;
        lista0.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test869");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test870");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = null;
        lista0.item = objArray9;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test871");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = 35;
        lista0.pos = (byte) 1;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test872");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        lista0.primeiro = 11;
        int int10 = lista0.pos;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test873");
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
        lista15.primeiro = ' ';
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
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test874");
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
        lista0.pos = '#';
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.pos;
        int int40 = lista38.ultimo;
        lista38.primeiro = '#';
        java.lang.Object[] objArray43 = lista38.item;
        int int44 = lista38.primeiro;
        lista38.imprime();
        boolean boolean46 = lista38.vazia();
        int int47 = lista38.primeiro;
        ds.Lista lista48 = new ds.Lista();
        int int49 = lista48.pos;
        int int50 = lista48.ultimo;
        lista48.primeiro = '#';
        int int53 = lista48.ultimo;
        java.lang.Object[] objArray54 = lista48.item;
        lista48.imprime();
        ds.Lista lista56 = new ds.Lista();
        int int57 = lista56.pos;
        int int58 = lista56.ultimo;
        lista56.primeiro = '#';
        ds.Lista lista61 = new ds.Lista();
        lista61.ultimo = 100;
        lista61.ultimo = '4';
        int int66 = lista61.pos;
        java.lang.Object[] objArray67 = lista61.item;
        lista56.item = objArray67;
        lista56.ultimo = 'a';
        boolean boolean71 = lista56.vazia();
        lista56.pos = 'a';
        java.lang.Object[] objArray74 = lista56.item;
        lista48.item = objArray74;
        lista38.item = objArray74;
        lista0.item = objArray74;
        int int78 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test875");
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
        int int15 = lista0.ultimo;
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
        lista16.pos = (short) 100;
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.pos;
        ds.Lista lista33 = new ds.Lista();
        lista33.ultimo = 100;
        lista33.ultimo = '4';
        int int38 = lista33.pos;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.pos;
        int int41 = lista39.ultimo;
        lista39.primeiro = '#';
        java.lang.Object[] objArray44 = lista39.item;
        lista33.item = objArray44;
        lista31.item = objArray44;
        lista16.item = objArray44;
        lista0.item = objArray44;
        boolean boolean49 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test876");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test877");
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
        int int16 = lista0.ultimo;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        int int19 = lista17.ultimo;
        lista17.primeiro = '#';
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = 100;
        lista22.ultimo = '4';
        int int27 = lista22.pos;
        java.lang.Object[] objArray28 = lista22.item;
        lista17.item = objArray28;
        int int30 = lista17.primeiro;
        java.lang.Object[] objArray31 = lista17.item;
        lista17.imprime();
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        int int35 = lista33.ultimo;
        lista33.primeiro = '#';
        java.lang.Object[] objArray38 = lista33.item;
        lista33.primeiro = (byte) -1;
        int int41 = lista33.primeiro;
        ds.Lista lista42 = new ds.Lista();
        lista42.ultimo = 100;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista33.item = objArray47;
        ds.Lista lista49 = new ds.Lista();
        int int50 = lista49.pos;
        int int51 = lista49.ultimo;
        lista49.primeiro = '#';
        int int54 = lista49.ultimo;
        java.lang.Object[] objArray55 = lista49.item;
        lista33.insere((java.lang.Object) objArray55);
        lista17.item = objArray55;
        lista0.item = objArray55;
        java.lang.Class<?> wildcardClass59 = objArray55.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test878");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.ultimo = 10;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0d };
        lista4.item = objArray9;
        lista0.item = objArray9;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0]");
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test879");
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
        int int20 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test880");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.pos = (byte) -1;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        int int10 = lista0.primeiro;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test881");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = (short) 0;
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = 0;
        lista10.imprime();
        lista10.insere((java.lang.Object) 10.0f);
        lista10.primeiro = (short) -1;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        java.lang.Object[] objArray24 = lista19.item;
        lista19.primeiro = (byte) -1;
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
        lista19.item = objArray38;
        lista10.item = objArray38;
        lista0.item = objArray38;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test882");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        int int5 = lista0.primeiro;
        lista0.pos = (byte) 100;
        int int8 = lista0.pos;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test883");
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
        lista7.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test884");
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
        int int35 = lista0.pos;
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test885");
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
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        int int19 = lista17.ultimo;
        lista17.primeiro = '4';
        int int22 = lista17.pos;
        int int23 = lista17.primeiro;
        java.lang.Object[] objArray24 = lista17.item;
        lista0.item = objArray24;
        int int26 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test886");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test887");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        int int13 = lista0.pos;
        int int14 = lista0.primeiro;
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test888");
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
        int int13 = lista7.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test889");
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
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        int int19 = lista17.ultimo;
        lista17.primeiro = '#';
        int int22 = lista17.ultimo;
        java.lang.Object[] objArray23 = lista17.item;
        lista17.imprime();
        lista17.imprime();
        int int26 = lista17.pos;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 100 };
        lista27.item = objArray35;
        lista17.item = objArray35;
        java.lang.Object[] objArray38 = lista17.item;
        lista0.item = objArray38;
        lista0.primeiro = (byte) -1;
        int int42 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test890");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        int int5 = lista0.primeiro;
        lista0.ultimo = (-1);
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test891");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        lista8.primeiro = (byte) -1;
        lista8.primeiro = (byte) 0;
        lista8.primeiro = 52;
        lista8.imprime();
        lista8.ultimo = (short) -1;
        lista0.insere((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test892");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test893");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.pos = '4';
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = 'a';
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test894");
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
        boolean boolean38 = lista0.vazia();
        boolean boolean39 = lista0.vazia();
        lista0.pos = 1;
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test895");
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
        lista24.ultimo = 1;
        int int38 = lista24.primeiro;
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test896");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.pos;
        int int5 = lista3.ultimo;
        lista3.primeiro = '#';
        int int8 = lista3.ultimo;
        java.lang.Object[] objArray9 = lista3.item;
        lista3.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 100;
        lista11.ultimo = '4';
        lista11.primeiro = (byte) -1;
        lista11.insere((java.lang.Object) 35);
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 100;
        lista20.primeiro = '#';
        java.lang.Object[] objArray25 = lista20.item;
        lista11.item = objArray25;
        lista3.item = objArray25;
        java.lang.Object[] objArray28 = lista3.item;
        int int29 = lista3.pos;
        java.lang.Object[] objArray30 = lista3.item;
        lista0.item = objArray30;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test897");
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
        lista0.ultimo = 10;
        java.lang.Object[] objArray20 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test898");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        lista0.pos = ' ';
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test899");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.primeiro = 52;
        lista0.imprime();
        lista0.ultimo = (short) 1;
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test900");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista0.item = objArray16;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test901");
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
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.primeiro = '#';
        java.lang.Object[] objArray25 = lista20.item;
        lista14.item = objArray25;
        lista14.pos = 1;
        ds.Lista lista29 = new ds.Lista();
        lista29.ultimo = 100;
        lista29.primeiro = '#';
        java.lang.Object[] objArray34 = lista29.item;
        lista29.primeiro = 35;
        lista14.insere((java.lang.Object) lista29);
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.pos;
        int int40 = lista38.ultimo;
        lista38.imprime();
        lista29.insere((java.lang.Object) lista38);
        int int43 = lista38.pos;
        int int44 = lista38.ultimo;
        lista38.primeiro = 0;
        lista38.ultimo = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        int int50 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test902");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        int int13 = lista8.pos;
        java.lang.Object[] objArray14 = lista8.item;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.ultimo = '4';
        int int20 = lista15.pos;
        java.lang.Object[] objArray21 = lista15.item;
        lista8.item = objArray21;
        int int23 = lista8.ultimo;
        lista6.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray25 = lista8.item;
        lista8.primeiro = (short) 1;
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.primeiro = '#';
        lista28.primeiro = (-1);
        java.lang.Object[] objArray35 = lista28.item;
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.pos;
        int int38 = lista36.ultimo;
        lista36.primeiro = '#';
        java.lang.Object[] objArray41 = lista36.item;
        boolean boolean42 = lista36.vazia();
        java.lang.Object[] objArray43 = lista36.item;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        ds.Lista lista46 = new ds.Lista();
        lista46.ultimo = 100;
        lista46.ultimo = '4';
        int int51 = lista46.pos;
        java.lang.Object[] objArray52 = lista46.item;
        ds.Lista lista53 = new ds.Lista();
        lista53.ultimo = 100;
        lista53.ultimo = '4';
        int int58 = lista53.pos;
        java.lang.Object[] objArray59 = lista53.item;
        lista46.item = objArray59;
        int int61 = lista46.ultimo;
        lista44.insere((java.lang.Object) lista46);
        lista44.ultimo = 32;
        lista44.primeiro = 35;
        lista44.primeiro = (-1);
        java.lang.Object[] objArray69 = lista44.item;
        lista36.item = objArray69;
        lista28.item = objArray69;
        lista8.insere((java.lang.Object) objArray69);
        lista0.insere((java.lang.Object) objArray69);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 52 + "'", int61 == 52);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test903");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        lista4.ultimo = 100;
        lista4.ultimo = '4';
        int int9 = lista4.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        java.lang.Object[] objArray15 = lista10.item;
        lista4.item = objArray15;
        int int17 = lista4.primeiro;
        int int18 = lista4.primeiro;
        java.lang.Object[] objArray19 = lista4.item;
        lista0.item = objArray19;
        int int21 = lista0.primeiro;
        lista0.ultimo = 53;
        java.lang.Object[] objArray24 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test904");
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
        lista0.primeiro = 35;
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
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test905");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.ultimo = 100;
        lista6.ultimo = '4';
        int int11 = lista6.pos;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        java.lang.Object[] objArray17 = lista12.item;
        lista6.item = objArray17;
        lista6.pos = 1;
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista21.primeiro = 35;
        lista6.insere((java.lang.Object) lista21);
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        int int32 = lista30.ultimo;
        lista30.imprime();
        lista21.insere((java.lang.Object) lista30);
        lista21.ultimo = 0;
        int int37 = lista21.ultimo;
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.pos;
        int int40 = lista38.ultimo;
        lista38.primeiro = '4';
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        int int45 = lista38.ultimo;
        lista38.primeiro = 11;
        lista21.insere((java.lang.Object) 11);
        lista0.insere((java.lang.Object) lista21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test906");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test907");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test908");
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
        lista0.imprime();
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test909");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista9.primeiro = 35;
        lista9.ultimo = (short) 10;
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
        ds.Lista lista34 = new ds.Lista();
        lista34.ultimo = 100;
        lista34.ultimo = '4';
        int int39 = lista34.pos;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.pos;
        int int42 = lista40.ultimo;
        lista40.primeiro = '#';
        java.lang.Object[] objArray45 = lista40.item;
        lista34.item = objArray45;
        lista19.item = objArray45;
        lista9.item = objArray45;
        lista0.insere((java.lang.Object) lista9);
        int int50 = lista0.ultimo;
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 33 + "'", int50 == 33);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test910");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        lista9.primeiro = 0;
        int int16 = lista9.ultimo;
        lista9.pos = 54;
        java.lang.Object[] objArray19 = lista9.item;
        lista0.item = objArray19;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test911");
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
        int int43 = lista0.ultimo;
        lista0.pos = 'a';
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.pos;
        lista46.ultimo = 0;
        lista46.imprime();
        lista46.insere((java.lang.Object) 10.0f);
        lista46.primeiro = (short) -1;
        lista0.insere((java.lang.Object) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test912");
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
        int int36 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test913");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.ultimo = 0;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test914");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista0.item = objArray10;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test915");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (byte) 10;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test916");
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
        int int28 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test917");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.primeiro;
        lista3.ultimo = 10;
        lista3.primeiro = (short) 0;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        int int11 = lista0.ultimo;
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.ultimo = 100;
        lista13.ultimo = '4';
        lista13.primeiro = (byte) -1;
        lista13.ultimo = (byte) 10;
        lista13.ultimo = 32;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.primeiro = '#';
        java.lang.Object[] objArray29 = lista24.item;
        lista24.primeiro = (byte) -1;
        int int32 = lista24.primeiro;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        int int35 = lista33.ultimo;
        lista33.primeiro = '#';
        java.lang.Object[] objArray38 = lista33.item;
        lista24.item = objArray38;
        lista13.item = objArray38;
        lista0.item = objArray38;
        java.lang.Object[] objArray42 = lista0.item;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test918");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test919");
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
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.primeiro;
        lista19.ultimo = 10;
        lista19.primeiro = (short) 0;
        java.lang.Object[] objArray25 = lista19.item;
        lista2.item = objArray25;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        lista27.imprime();
        lista27.ultimo = 1;
        ds.Lista lista35 = new ds.Lista();
        int int36 = lista35.pos;
        int int37 = lista35.ultimo;
        lista35.primeiro = '#';
        lista35.imprime();
        lista35.ultimo = 1;
        lista27.insere((java.lang.Object) lista35);
        java.lang.Object[] objArray44 = lista35.item;
        lista2.item = objArray44;
        int int46 = lista2.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test920");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        int int6 = lista4.ultimo;
        boolean boolean7 = lista4.vazia();
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
        lista4.item = objArray34;
        lista4.pos = 100;
        lista0.insere((java.lang.Object) lista4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
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
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test921");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test922");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test923");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        lista9.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass16 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test924");
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
        java.lang.Object[] objArray24 = lista0.item;
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        java.lang.Object[] objArray33 = lista27.item;
        ds.Lista lista34 = new ds.Lista();
        lista34.ultimo = 100;
        lista34.ultimo = '4';
        int int39 = lista34.pos;
        java.lang.Object[] objArray40 = lista34.item;
        lista27.item = objArray40;
        int int42 = lista27.ultimo;
        lista25.insere((java.lang.Object) lista27);
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.primeiro;
        lista44.ultimo = 10;
        lista44.primeiro = (short) 0;
        java.lang.Object[] objArray50 = lista44.item;
        lista27.item = objArray50;
        lista0.item = objArray50;
        lista0.pos = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test925");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (-1);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test926");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test927");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        lista6.ultimo = 0;
        int int10 = lista6.primeiro;
        lista6.imprime();
        lista6.ultimo = 0;
        lista0.insere((java.lang.Object) lista6);
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
        lista15.pos = 1;
        int int30 = lista15.primeiro;
        lista0.insere((java.lang.Object) int30);
        boolean boolean32 = lista0.vazia();
        lista0.primeiro = 2;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test928");
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
        boolean boolean19 = lista2.vazia();
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.primeiro = '#';
        java.lang.Object[] objArray25 = lista20.item;
        boolean boolean26 = lista20.vazia();
        int int27 = lista20.pos;
        int int28 = lista20.ultimo;
        int int29 = lista20.ultimo;
        java.lang.Object[] objArray30 = lista20.item;
        lista2.insere((java.lang.Object) objArray30);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test929");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.ultimo = 1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        int int18 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test930");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test931");
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
        java.lang.Object[] objArray18 = lista0.item;
        lista0.ultimo = '#';
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '4';
        lista21.insere((java.lang.Object) 10.0d);
        int int28 = lista21.ultimo;
        int int29 = lista21.pos;
        lista21.pos = 0;
        java.lang.Object[] objArray32 = lista21.item;
        lista0.item = objArray32;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test932");
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
        boolean boolean33 = lista0.vazia();
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '4';
        lista34.insere((java.lang.Object) 10.0d);
        int int41 = lista34.ultimo;
        java.lang.Object[] objArray42 = lista34.item;
        int int43 = lista34.ultimo;
        ds.Lista lista44 = new ds.Lista();
        lista44.ultimo = 100;
        lista44.ultimo = '4';
        lista44.primeiro = (byte) -1;
        boolean boolean51 = lista44.vazia();
        boolean boolean52 = lista44.vazia();
        ds.Lista lista53 = new ds.Lista();
        int int54 = lista53.pos;
        int int55 = lista53.ultimo;
        lista53.primeiro = '#';
        ds.Lista lista58 = new ds.Lista();
        lista58.ultimo = 100;
        lista58.ultimo = '4';
        int int63 = lista58.pos;
        java.lang.Object[] objArray64 = lista58.item;
        lista53.item = objArray64;
        lista53.pos = (short) 100;
        java.lang.Object[] objArray68 = lista53.item;
        lista44.item = objArray68;
        lista34.item = objArray68;
        ds.Lista lista71 = new ds.Lista();
        int int72 = lista71.pos;
        int int73 = lista71.ultimo;
        lista71.primeiro = '#';
        lista71.imprime();
        java.lang.Object[] objArray77 = lista71.item;
        int int78 = lista71.pos;
        boolean boolean79 = lista71.vazia();
        lista34.insere((java.lang.Object) lista71);
        lista0.insere((java.lang.Object) lista34);
        int int82 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test933");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        int int6 = lista4.ultimo;
        lista4.primeiro = '#';
        int int9 = lista4.ultimo;
        java.lang.Object[] objArray10 = lista4.item;
        lista4.imprime();
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
        lista12.ultimo = 'a';
        boolean boolean27 = lista12.vazia();
        lista12.pos = 'a';
        java.lang.Object[] objArray30 = lista12.item;
        lista4.item = objArray30;
        lista0.item = objArray30;
        lista0.ultimo = 54;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test934");
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
        lista9.pos = 1;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        int int30 = lista28.ultimo;
        lista28.primeiro = '#';
        java.lang.Object[] objArray33 = lista28.item;
        boolean boolean34 = lista28.vazia();
        java.lang.Object[] objArray35 = lista28.item;
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.ultimo = 100;
        lista38.ultimo = '4';
        int int43 = lista38.pos;
        java.lang.Object[] objArray44 = lista38.item;
        ds.Lista lista45 = new ds.Lista();
        lista45.ultimo = 100;
        lista45.ultimo = '4';
        int int50 = lista45.pos;
        java.lang.Object[] objArray51 = lista45.item;
        lista38.item = objArray51;
        int int53 = lista38.ultimo;
        lista36.insere((java.lang.Object) lista38);
        lista36.ultimo = 32;
        lista36.primeiro = 35;
        lista36.primeiro = (-1);
        java.lang.Object[] objArray61 = lista36.item;
        lista28.item = objArray61;
        lista9.insere((java.lang.Object) lista28);
        boolean boolean64 = lista9.vazia();
        boolean boolean65 = lista9.vazia();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test935");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        lista0.ultimo = 54;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = '4';
        int int15 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test936");
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
        int int31 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test937");
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
        lista0.pos = (short) 10;
        int int22 = lista0.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 100;
        lista23.ultimo = '4';
        lista23.primeiro = (byte) -1;
        java.lang.Object[] objArray30 = lista23.item;
        lista0.insere((java.lang.Object) objArray30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test938");
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
        java.lang.Object[] objArray27 = lista15.item;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        int int30 = lista28.ultimo;
        lista28.primeiro = '#';
        java.lang.Object[] objArray33 = lista28.item;
        lista28.imprime();
        ds.Lista lista35 = new ds.Lista();
        int int36 = lista35.pos;
        lista35.ultimo = 0;
        lista35.imprime();
        lista35.insere((java.lang.Object) 10.0f);
        lista28.insere((java.lang.Object) lista35);
        ds.Lista lista43 = new ds.Lista();
        int int44 = lista43.primeiro;
        lista43.ultimo = 10;
        ds.Lista lista47 = new ds.Lista();
        int int48 = lista47.pos;
        int int49 = lista47.ultimo;
        lista47.primeiro = '#';
        int int52 = lista47.ultimo;
        java.lang.Object[] objArray53 = lista47.item;
        lista47.imprime();
        ds.Lista lista55 = new ds.Lista();
        lista55.ultimo = 100;
        lista55.ultimo = '4';
        lista55.primeiro = (byte) -1;
        lista55.insere((java.lang.Object) 35);
        ds.Lista lista64 = new ds.Lista();
        lista64.ultimo = 100;
        lista64.primeiro = '#';
        java.lang.Object[] objArray69 = lista64.item;
        lista55.item = objArray69;
        lista47.item = objArray69;
        java.lang.Object[] objArray72 = lista47.item;
        lista43.item = objArray72;
        boolean boolean74 = lista43.vazia();
        ds.Lista lista75 = new ds.Lista();
        int int76 = lista75.pos;
        int int77 = lista75.ultimo;
        lista75.primeiro = '#';
        java.lang.Object[] objArray80 = lista75.item;
        lista75.primeiro = (byte) -1;
        int int83 = lista75.primeiro;
        ds.Lista lista84 = new ds.Lista();
        lista84.ultimo = 100;
        lista84.primeiro = '#';
        java.lang.Object[] objArray89 = lista84.item;
        lista75.item = objArray89;
        java.lang.Object[] objArray91 = lista75.item;
        lista43.item = objArray91;
        lista28.item = objArray91;
        lista15.item = objArray91;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test939");
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
        lista0.ultimo = (byte) -1;
        int int46 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 54 + "'", int43 == 54);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test940");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test941");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        int int7 = lista0.pos;
        lista0.primeiro = 52;
        lista0.pos = ' ';
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.ultimo = 10;
        lista12.primeiro = (short) 0;
        java.lang.Object[] objArray18 = lista12.item;
        java.lang.Object[] objArray19 = lista12.item;
        java.lang.Object[] objArray20 = lista12.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test942");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        lista0.ultimo = 0;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test943");
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
        java.lang.Object[] objArray16 = lista0.item;
        java.lang.Object[] objArray17 = lista0.item;
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        lista18.ultimo = '4';
        int int23 = lista18.pos;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.primeiro = '#';
        java.lang.Object[] objArray29 = lista24.item;
        lista18.item = objArray29;
        int int31 = lista18.primeiro;
        java.lang.Object[] objArray32 = lista18.item;
        lista0.item = objArray32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test944");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = (short) 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        lista8.primeiro = (byte) -1;
        lista8.primeiro = 100;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        int int23 = lista18.ultimo;
        java.lang.Object[] objArray24 = lista18.item;
        lista18.ultimo = 100;
        java.lang.Object[] objArray27 = lista18.item;
        lista8.insere((java.lang.Object) objArray27);
        lista0.item = objArray27;
        int int30 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test945");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test946");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        int int12 = lista0.primeiro;
        int int13 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test947");
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
        int int17 = lista0.pos;
        lista0.ultimo = '4';
        java.lang.Object obj20 = null;
        lista0.insere(obj20);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test948");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test949");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test950");
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
        int int34 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test951");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        int int6 = lista0.primeiro;
        int int7 = lista0.primeiro;
        lista0.imprime();
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test952");
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
        lista0.pos = 1;
        int int26 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test953");
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
        lista51.primeiro = ' ';
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
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test954");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.pos = '4';
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test955");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 100;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test956");
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
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test957");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        int int6 = lista4.ultimo;
        lista4.primeiro = '#';
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista4.item = objArray15;
        lista4.pos = (short) 100;
        boolean boolean19 = lista4.vazia();
        lista0.insere((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test958");
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
        lista21.pos = 1;
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.primeiro = '#';
        java.lang.Object[] objArray41 = lista36.item;
        lista36.primeiro = 35;
        lista21.insere((java.lang.Object) lista36);
        ds.Lista lista45 = new ds.Lista();
        int int46 = lista45.pos;
        int int47 = lista45.ultimo;
        lista45.imprime();
        lista36.insere((java.lang.Object) lista45);
        lista36.ultimo = 0;
        int int52 = lista36.ultimo;
        lista36.imprime();
        lista0.insere((java.lang.Object) lista36);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test959");
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
        lista0.imprime();
        java.lang.Class<?> wildcardClass32 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test960");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        int int13 = lista0.primeiro;
        lista0.primeiro = 32;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test961");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.primeiro = 0;
        lista0.pos = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test962");
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
        int int25 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test963");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = (short) 0;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test964");
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
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100]");
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test965");
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
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.pos;
        lista46.ultimo = 0;
        int int50 = lista46.pos;
        java.lang.Object obj51 = null;
        lista46.insere(obj51);
        ds.Lista lista53 = new ds.Lista();
        lista53.ultimo = 100;
        lista53.ultimo = '4';
        int int58 = lista53.pos;
        java.lang.Object[] objArray59 = lista53.item;
        lista53.ultimo = 10;
        lista46.insere((java.lang.Object) lista53);
        lista46.pos = (byte) 1;
        ds.Lista lista65 = new ds.Lista();
        int int66 = lista65.pos;
        int int67 = lista65.ultimo;
        lista65.primeiro = '#';
        ds.Lista lista70 = new ds.Lista();
        lista70.ultimo = 100;
        java.lang.Object[] objArray73 = new java.lang.Object[] { 100 };
        lista65.item = objArray73;
        lista46.item = objArray73;
        lista24.item = objArray73;
        lista24.primeiro = 35;
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[100]");
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test966");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        boolean boolean14 = lista8.vazia();
        java.lang.Object[] objArray15 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        int int17 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test967");
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
        int int12 = lista0.primeiro;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
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
        lista13.item = objArray26;
        lista0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test968");
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
        boolean boolean28 = lista0.vazia();
        int int29 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test969");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        int int3 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test970");
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
        int int33 = lista15.ultimo;
        lista15.ultimo = (byte) -1;
        lista15.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 101 + "'", int33 == 101);
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test971");
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
        lista0.ultimo = 97;
        java.lang.Object[] objArray21 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test972");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        lista0.primeiro = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test973");
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
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test974");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        lista0.pos = (short) 10;
        lista0.pos = 54;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test975");
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
        lista0.imprime();
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
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test976");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        lista11.imprime();
        lista11.ultimo = 1;
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
        java.lang.Object[] objArray34 = lista29.item;
        lista29.primeiro = (byte) -1;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.primeiro;
        lista37.ultimo = 10;
        lista37.pos = ' ';
        lista37.ultimo = 1;
        java.lang.Object[] objArray45 = lista37.item;
        lista29.item = objArray45;
        ds.Lista lista47 = new ds.Lista();
        int int48 = lista47.pos;
        int int49 = lista47.ultimo;
        lista47.primeiro = '#';
        lista47.primeiro = 0;
        lista29.insere((java.lang.Object) 0);
        ds.Lista lista55 = new ds.Lista();
        int int56 = lista55.pos;
        lista55.ultimo = 0;
        lista55.ultimo = 0;
        lista55.ultimo = (short) 100;
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.pos;
        int int65 = lista63.ultimo;
        lista63.primeiro = '#';
        ds.Lista lista68 = new ds.Lista();
        lista68.ultimo = 100;
        lista68.ultimo = '4';
        int int73 = lista68.pos;
        java.lang.Object[] objArray74 = lista68.item;
        lista63.item = objArray74;
        lista55.item = objArray74;
        lista29.item = objArray74;
        lista11.item = objArray74;
        lista0.item = objArray74;
        lista0.primeiro = 32;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test977");
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
        int int26 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test978");
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
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        int int15 = lista13.ultimo;
        lista13.primeiro = '#';
        java.lang.Object[] objArray18 = lista13.item;
        boolean boolean19 = lista13.vazia();
        lista13.imprime();
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.primeiro;
        lista21.ultimo = 10;
        lista21.pos = ' ';
        lista21.ultimo = 1;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.primeiro;
        lista29.ultimo = 10;
        lista29.primeiro = (short) 0;
        java.lang.Object[] objArray35 = lista29.item;
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.primeiro = '#';
        java.lang.Object[] objArray41 = lista36.item;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        ds.Lista lista47 = new ds.Lista();
        lista47.ultimo = 100;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 100 };
        lista42.item = objArray50;
        lista36.item = objArray50;
        lista29.item = objArray50;
        lista21.item = objArray50;
        ds.Lista lista55 = new ds.Lista();
        int int56 = lista55.pos;
        int int57 = lista55.ultimo;
        lista55.primeiro = '#';
        int int60 = lista55.ultimo;
        java.lang.Object[] objArray61 = lista55.item;
        lista21.item = objArray61;
        lista13.insere((java.lang.Object) lista21);
        int int64 = lista13.pos;
        lista0.insere((java.lang.Object) lista13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test979");
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
        int int14 = lista0.ultimo;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test980");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.pos = (byte) -1;
        int int8 = lista0.ultimo;
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = 0;
        lista10.imprime();
        lista10.insere((java.lang.Object) 10.0f);
        int int17 = lista10.ultimo;
        boolean boolean18 = lista10.vazia();
        int int19 = lista10.primeiro;
        java.lang.Object[] objArray20 = lista10.item;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        lista21.imprime();
        lista21.ultimo = 1;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.primeiro;
        lista29.ultimo = 10;
        lista29.pos = ' ';
        lista29.ultimo = 1;
        java.lang.Object[] objArray37 = lista29.item;
        lista21.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.pos;
        int int41 = lista39.ultimo;
        lista39.primeiro = '#';
        java.lang.Object[] objArray44 = lista39.item;
        lista39.primeiro = (byte) -1;
        ds.Lista lista47 = new ds.Lista();
        int int48 = lista47.primeiro;
        lista47.ultimo = 10;
        lista47.pos = ' ';
        lista47.ultimo = 1;
        java.lang.Object[] objArray55 = lista47.item;
        lista39.item = objArray55;
        ds.Lista lista57 = new ds.Lista();
        int int58 = lista57.pos;
        int int59 = lista57.ultimo;
        lista57.primeiro = '#';
        lista57.primeiro = 0;
        lista39.insere((java.lang.Object) 0);
        ds.Lista lista65 = new ds.Lista();
        int int66 = lista65.pos;
        lista65.ultimo = 0;
        lista65.ultimo = 0;
        lista65.ultimo = (short) 100;
        ds.Lista lista73 = new ds.Lista();
        int int74 = lista73.pos;
        int int75 = lista73.ultimo;
        lista73.primeiro = '#';
        ds.Lista lista78 = new ds.Lista();
        lista78.ultimo = 100;
        lista78.ultimo = '4';
        int int83 = lista78.pos;
        java.lang.Object[] objArray84 = lista78.item;
        lista73.item = objArray84;
        lista65.item = objArray84;
        lista39.item = objArray84;
        lista21.item = objArray84;
        lista10.item = objArray84;
        lista0.item = objArray84;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(objArray84);
    }

    @Test
    public void test981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test981");
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
        lista0.primeiro = 35;
        lista0.ultimo = ' ';
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        lista22.ultimo = 0;
        int int26 = lista22.primeiro;
        lista22.imprime();
        lista22.ultimo = 0;
        int int30 = lista22.ultimo;
        java.lang.Class<?> wildcardClass31 = lista22.getClass();
        lista0.insere((java.lang.Object) lista22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test982");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.ultimo = 100;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista6.primeiro = 35;
        boolean boolean14 = lista6.vazia();
        java.lang.Object[] objArray15 = lista6.item;
        lista0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test983");
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
        lista24.ultimo = 1;
        java.lang.Object[] objArray38 = lista24.item;
        lista24.pos = (-1);
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
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test984");
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
        lista9.pos = 1;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        int int30 = lista28.ultimo;
        lista28.primeiro = '#';
        java.lang.Object[] objArray33 = lista28.item;
        boolean boolean34 = lista28.vazia();
        java.lang.Object[] objArray35 = lista28.item;
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.ultimo = 100;
        lista38.ultimo = '4';
        int int43 = lista38.pos;
        java.lang.Object[] objArray44 = lista38.item;
        ds.Lista lista45 = new ds.Lista();
        lista45.ultimo = 100;
        lista45.ultimo = '4';
        int int50 = lista45.pos;
        java.lang.Object[] objArray51 = lista45.item;
        lista38.item = objArray51;
        int int53 = lista38.ultimo;
        lista36.insere((java.lang.Object) lista38);
        lista36.ultimo = 32;
        lista36.primeiro = 35;
        lista36.primeiro = (-1);
        java.lang.Object[] objArray61 = lista36.item;
        lista28.item = objArray61;
        lista9.insere((java.lang.Object) lista28);
        ds.Lista lista64 = new ds.Lista();
        int int65 = lista64.pos;
        lista64.ultimo = 0;
        lista64.ultimo = 0;
        lista64.ultimo = (short) 100;
        ds.Lista lista72 = new ds.Lista();
        int int73 = lista72.pos;
        int int74 = lista72.ultimo;
        lista72.primeiro = '#';
        ds.Lista lista77 = new ds.Lista();
        lista77.ultimo = 100;
        lista77.ultimo = '4';
        int int82 = lista77.pos;
        java.lang.Object[] objArray83 = lista77.item;
        lista72.item = objArray83;
        lista64.item = objArray83;
        lista9.item = objArray83;
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test985");
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
        lista0.pos = 'a';
        lista0.ultimo = (byte) 1;
        int int20 = lista0.primeiro;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista21.primeiro = (byte) -1;
        int int29 = lista21.primeiro;
        lista21.ultimo = (byte) 10;
        java.lang.Object[] objArray32 = lista21.item;
        lista0.item = objArray32;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '4';
        lista34.imprime();
        java.lang.Object[] objArray40 = lista34.item;
        lista0.insere((java.lang.Object) lista34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test986");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        lista0.primeiro = 100;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test987");
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
        lista0.pos = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test988");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test989");
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
        lista0.primeiro = (short) 10;
        lista0.ultimo = 0;
        int int30 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test990");
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
        int int21 = lista16.ultimo;
        java.lang.Object[] objArray22 = lista16.item;
        lista16.pos = 0;
        int int25 = lista16.pos;
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        boolean boolean32 = lista27.vazia();
        java.lang.Object[] objArray33 = lista27.item;
        lista16.item = objArray33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test991");
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
        lista15.ultimo = 0;
        int int31 = lista15.ultimo;
        lista15.imprime();
        lista15.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test992");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        lista0.ultimo = 0;
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test993");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        lista4.ultimo = 100;
        lista4.ultimo = '4';
        int int9 = lista4.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        java.lang.Object[] objArray15 = lista10.item;
        lista4.item = objArray15;
        int int17 = lista4.primeiro;
        int int18 = lista4.primeiro;
        java.lang.Object[] objArray19 = lista4.item;
        lista0.item = objArray19;
        int int21 = lista0.primeiro;
        int int22 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.primeiro = 100;
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test994");
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
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        int int15 = lista13.ultimo;
        lista13.primeiro = '4';
        lista13.imprime();
        boolean boolean19 = lista13.vazia();
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.primeiro = '#';
        java.lang.Object[] objArray25 = lista20.item;
        lista20.primeiro = (byte) -1;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.primeiro;
        lista28.ultimo = 10;
        lista28.pos = ' ';
        lista28.ultimo = 1;
        java.lang.Object[] objArray36 = lista28.item;
        lista20.item = objArray36;
        lista13.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray39 = lista13.item;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.pos;
        int int42 = lista40.ultimo;
        lista40.primeiro = '#';
        int int45 = lista40.ultimo;
        java.lang.Object[] objArray46 = lista40.item;
        lista40.pos = 0;
        int int49 = lista40.primeiro;
        ds.Lista lista50 = new ds.Lista();
        lista50.ultimo = 100;
        lista50.ultimo = '4';
        lista50.primeiro = (byte) -1;
        lista50.insere((java.lang.Object) 35);
        lista50.ultimo = (short) 1;
        lista50.pos = (short) 10;
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.pos;
        int int65 = lista63.ultimo;
        lista63.primeiro = '#';
        ds.Lista lista68 = new ds.Lista();
        lista68.ultimo = 100;
        java.lang.Object[] objArray71 = new java.lang.Object[] { 100 };
        lista63.item = objArray71;
        lista50.item = objArray71;
        lista40.item = objArray71;
        lista13.item = objArray71;
        lista0.item = objArray71;
        lista0.imprime();
        int int78 = lista0.primeiro;
        int int79 = lista0.ultimo;
        int int80 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[100]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 35 + "'", int78 == 35);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }
}

