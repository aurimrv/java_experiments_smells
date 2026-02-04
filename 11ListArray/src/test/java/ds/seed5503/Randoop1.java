package ds.seed5503;

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
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        int int6 = lista4.pos;
        lista4.primeiro = 100;
        java.lang.Object[] objArray9 = lista4.item;
        lista0.item = objArray9;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        int int14 = lista12.pos;
        java.lang.Object[] objArray15 = lista12.item;
        lista12.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        lista0.primeiro = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = '4';
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        lista0.pos = 0;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        int int12 = lista8.ultimo;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista8.item = objArray14;
        java.lang.Object[] objArray16 = lista8.item;
        lista8.primeiro = (-1);
        lista0.insere((java.lang.Object) lista8);
        int int20 = lista0.pos;
        int int21 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = (short) 100;
        int int3 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        lista0.ultimo = 32;
        int int19 = lista0.primeiro;
        lista0.primeiro = 12;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        lista6.primeiro = '4';
        lista6.pos = (-1);
        lista6.insere((java.lang.Object) 1L);
        lista6.pos = (byte) 10;
        lista6.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 10;
        lista18.ultimo = (short) -1;
        lista18.ultimo = (byte) 1;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        int int27 = lista25.pos;
        java.lang.Object[] objArray28 = lista25.item;
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1L, 0.0f };
        lista29.item = objArray33;
        lista25.item = objArray33;
        lista18.insere((java.lang.Object) lista25);
        int int37 = lista25.pos;
        int int38 = lista25.pos;
        lista25.pos = '4';
        java.lang.Object[] objArray41 = lista25.item;
        lista6.item = objArray41;
        lista0.item = objArray41;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 0.0]");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        boolean boolean22 = lista18.vazia();
        lista13.insere((java.lang.Object) lista18);
        lista18.ultimo = 0;
        java.lang.Object[] objArray26 = lista18.item;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        java.lang.Object[] objArray29 = lista27.item;
        lista27.ultimo = (byte) 1;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        int int35 = lista32.ultimo;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        int int38 = lista36.pos;
        lista36.primeiro = 100;
        java.lang.Object[] objArray41 = lista36.item;
        lista32.item = objArray41;
        lista27.item = objArray41;
        int int44 = lista27.primeiro;
        java.lang.Object[] objArray45 = lista27.item;
        lista18.item = objArray45;
        lista0.item = objArray45;
        int int48 = lista0.primeiro;
        lista0.ultimo = 11;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = '#';
        java.lang.Object[] objArray20 = lista0.item;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 0.0]");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        boolean boolean23 = lista2.vazia();
        int int24 = lista2.ultimo;
        int int25 = lista2.primeiro;
        lista2.primeiro = ' ';
        boolean boolean28 = lista2.vazia();
        boolean boolean29 = lista2.vazia();
        int int30 = lista2.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista11.pos = (short) -1;
        java.lang.Object[] objArray18 = lista11.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = 10;
        lista20.insere((java.lang.Object) lista22);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.primeiro;
        int int30 = lista26.primeiro;
        lista22.insere((java.lang.Object) int30);
        java.lang.Object[] objArray32 = lista22.item;
        java.lang.Object[] objArray33 = lista22.item;
        java.lang.Object[] objArray34 = lista22.item;
        lista22.pos = (short) 10;
        java.lang.Class<?> wildcardClass37 = lista22.getClass();
        lista0.insere((java.lang.Object) wildcardClass37);
        int int39 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 53 + "'", int39 == 53);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.ultimo;
        java.lang.Object[] objArray9 = lista5.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        lista10.pos = 100;
        int int16 = lista10.pos;
        int int17 = lista10.ultimo;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        int int22 = lista18.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1L, 0.0f };
        lista23.item = objArray27;
        lista18.insere((java.lang.Object) objArray27);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.ultimo = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista37.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, 0.0f };
        lista40.item = objArray44;
        lista37.item = objArray44;
        lista35.item = objArray44;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        lista48.primeiro = '4';
        lista35.insere((java.lang.Object) lista48);
        lista30.insere((java.lang.Object) lista48);
        java.lang.Object[] objArray55 = lista48.item;
        lista18.insere((java.lang.Object) objArray55);
        lista10.item = objArray55;
        lista5.item = objArray55;
        int int59 = lista5.pos;
        lista0.insere((java.lang.Object) lista5);
        lista0.primeiro = 'a';
        int int63 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.ultimo;
        lista18.pos = '#';
        int int28 = lista18.ultimo;
        int int29 = lista18.ultimo;
        lista18.primeiro = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        int int8 = lista0.primeiro;
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        lista13.ultimo = '#';
        boolean boolean22 = lista13.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        int int7 = lista4.primeiro;
        int int8 = lista4.primeiro;
        lista4.pos = (short) -1;
        java.lang.Object[] objArray11 = lista4.item;
        java.lang.Object[] objArray12 = lista4.item;
        boolean boolean13 = lista4.vazia();
        boolean boolean14 = lista4.vazia();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.ultimo;
        int int19 = lista15.ultimo;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista15.item = objArray21;
        lista4.item = objArray21;
        lista0.insere((java.lang.Object) lista4);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        int int19 = lista15.primeiro;
        lista15.ultimo = (byte) 100;
        lista2.insere((java.lang.Object) (byte) 100);
        lista2.ultimo = 32;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        int int28 = lista25.ultimo;
        int int29 = lista25.ultimo;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista25.item = objArray31;
        int int33 = lista25.primeiro;
        java.lang.Object[] objArray34 = lista25.item;
        lista2.item = objArray34;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.pos = 'a';
        lista2.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        lista0.pos = 10;
        lista0.pos = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Object[] objArray20 = lista0.item;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        int int24 = lista21.primeiro;
        lista21.pos = 100;
        java.lang.Object[] objArray27 = lista21.item;
        lista21.imprime();
        lista21.pos = (short) 0;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.primeiro;
        lista31.pos = 100;
        java.lang.Object[] objArray37 = lista31.item;
        lista21.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object[] objArray40 = lista0.item;
        lista0.primeiro = (byte) 1;
        lista0.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.primeiro;
        lista5.pos = 100;
        java.lang.Object[] objArray11 = lista5.item;
        int int12 = lista5.pos;
        int int13 = lista5.ultimo;
        lista5.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        lista15.primeiro = '4';
        lista15.pos = (-1);
        lista15.insere((java.lang.Object) 1L);
        lista15.imprime();
        java.lang.Object[] objArray25 = lista15.item;
        lista5.item = objArray25;
        java.lang.Object[] objArray27 = lista5.item;
        lista0.item = objArray27;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.ultimo;
        lista29.imprime();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 10;
        lista34.insere((java.lang.Object) lista36);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista40.imprime();
        int int43 = lista40.primeiro;
        int int44 = lista40.primeiro;
        lista36.insere((java.lang.Object) int44);
        java.lang.Object[] objArray46 = lista36.item;
        lista29.item = objArray46;
        lista29.primeiro = ' ';
        lista29.ultimo = (byte) 1;
        lista29.ultimo = 100;
        lista0.insere((java.lang.Object) lista29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        int int12 = lista0.primeiro;
        int int13 = lista0.pos;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        lista6.ultimo = (byte) 10;
        lista6.primeiro = 100;
        lista2.insere((java.lang.Object) 100);
        java.lang.Object[] objArray15 = lista2.item;
        int int16 = lista2.primeiro;
        int int17 = lista2.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        lista12.primeiro = '4';
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.ultimo;
        boolean boolean21 = lista17.vazia();
        lista12.insere((java.lang.Object) lista17);
        java.lang.Object[] objArray23 = lista17.item;
        lista17.pos = 0;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        lista26.primeiro = '4';
        lista26.pos = (-1);
        lista26.insere((java.lang.Object) 1L);
        lista26.imprime();
        java.lang.Object[] objArray36 = lista26.item;
        lista17.item = objArray36;
        java.lang.Class<?> wildcardClass38 = lista17.getClass();
        lista0.insere((java.lang.Object) wildcardClass38);
        int int40 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        lista8.primeiro = '4';
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        boolean boolean17 = lista13.vazia();
        lista8.insere((java.lang.Object) lista13);
        lista13.ultimo = 0;
        lista13.pos = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        lista0.primeiro = ' ';
        lista0.primeiro = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.insere((java.lang.Object) 100);
        int int13 = lista5.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        lista0.ultimo = (short) 10;
        lista0.insere((java.lang.Object) 32);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        boolean boolean12 = lista8.vazia();
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.ultimo = '4';
        lista8.insere((java.lang.Object) '4');
        lista8.pos = 0;
        boolean boolean21 = lista8.vazia();
        int int22 = lista8.primeiro;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        int int26 = lista23.ultimo;
        boolean boolean27 = lista23.vazia();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        lista28.ultimo = '4';
        lista23.insere((java.lang.Object) '4');
        int int34 = lista23.primeiro;
        int int35 = lista23.ultimo;
        lista23.pos = 'a';
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista38.imprime();
        lista38.primeiro = '4';
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        lista43.imprime();
        int int46 = lista43.ultimo;
        boolean boolean47 = lista43.vazia();
        lista38.insere((java.lang.Object) lista43);
        java.lang.Object[] objArray49 = lista43.item;
        lista43.pos = 0;
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        lista52.imprime();
        int int55 = lista52.primeiro;
        lista52.pos = 100;
        java.lang.Object[] objArray58 = lista52.item;
        lista43.insere((java.lang.Object) objArray58);
        lista23.item = objArray58;
        lista8.item = objArray58;
        lista0.item = objArray58;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        int int12 = lista8.ultimo;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 1L, 0.0f };
        lista13.item = objArray17;
        lista8.insere((java.lang.Object) objArray17);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        lista20.ultimo = '4';
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 1L, 0.0f };
        lista30.item = objArray34;
        lista27.item = objArray34;
        lista25.item = objArray34;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista38.imprime();
        lista38.primeiro = '4';
        lista25.insere((java.lang.Object) lista38);
        lista20.insere((java.lang.Object) lista38);
        java.lang.Object[] objArray45 = lista38.item;
        lista8.insere((java.lang.Object) objArray45);
        lista0.item = objArray45;
        java.lang.Object[] objArray48 = lista0.item;
        java.lang.Class<?> wildcardClass49 = objArray48.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        int int15 = lista12.ultimo;
        boolean boolean16 = lista12.vazia();
        lista7.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        int int24 = lista20.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        lista25.ultimo = '4';
        java.lang.Object[] objArray30 = lista25.item;
        lista20.item = objArray30;
        int int32 = lista20.primeiro;
        int int33 = lista20.primeiro;
        int int34 = lista20.ultimo;
        lista20.primeiro = 32;
        lista20.imprime();
        java.lang.Object[] objArray38 = lista20.item;
        lista0.insere((java.lang.Object) lista20);
        int int40 = lista20.ultimo;
        lista20.imprime();
        lista20.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 0;
        java.lang.Object[] objArray13 = lista5.item;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray16 = lista14.item;
        lista14.ultimo = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        int int22 = lista19.ultimo;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        lista23.primeiro = 100;
        java.lang.Object[] objArray28 = lista23.item;
        lista19.item = objArray28;
        lista14.item = objArray28;
        int int31 = lista14.primeiro;
        java.lang.Object[] objArray32 = lista14.item;
        lista5.item = objArray32;
        java.lang.Class<?> wildcardClass34 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        int int12 = lista5.ultimo;
        java.lang.Class<?> wildcardClass13 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        boolean boolean10 = lista0.vazia();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = 12;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista9.imprime();
        lista9.primeiro = '4';
        lista9.pos = (-1);
        lista9.insere((java.lang.Object) 1L);
        lista9.pos = (byte) 10;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        lista20.ultimo = '4';
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 1L, 0.0f };
        lista30.item = objArray34;
        lista27.item = objArray34;
        lista25.item = objArray34;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista38.imprime();
        lista38.primeiro = '4';
        lista25.insere((java.lang.Object) lista38);
        lista20.insere((java.lang.Object) lista38);
        int int45 = lista38.primeiro;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { 1L, 0.0f };
        lista51.item = objArray55;
        lista48.item = objArray55;
        lista46.item = objArray55;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        lista59.imprime();
        lista59.primeiro = '4';
        lista46.insere((java.lang.Object) lista59);
        java.lang.Object[] objArray65 = lista46.item;
        lista38.item = objArray65;
        lista9.insere((java.lang.Object) lista38);
        java.lang.Object[] objArray68 = lista9.item;
        lista0.item = objArray68;
        lista0.primeiro = (byte) 10;
        int int72 = lista0.ultimo;
        boolean boolean73 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        int int15 = lista0.pos;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        lista0.ultimo = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.pos = '4';
        lista0.insere((java.lang.Object) '4');
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray31 = lista29.item;
        lista29.ultimo = (byte) 1;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista34.imprime();
        int int37 = lista34.ultimo;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        lista38.primeiro = 100;
        java.lang.Object[] objArray43 = lista38.item;
        lista34.item = objArray43;
        lista29.item = objArray43;
        int int46 = lista29.primeiro;
        java.lang.Object[] objArray47 = lista29.item;
        lista0.insere((java.lang.Object) objArray47);
        java.lang.Object[] objArray49 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        lista6.ultimo = (byte) 10;
        lista6.primeiro = 100;
        lista2.insere((java.lang.Object) 100);
        lista2.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        boolean boolean5 = lista0.vazia();
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        lista0.ultimo = (short) 10;
        lista0.primeiro = (byte) 100;
        boolean boolean29 = lista0.vazia();
        int int30 = lista0.ultimo;
        lista0.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 0;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.ultimo = 10;
        lista4.insere((java.lang.Object) lista6);
        int int10 = lista4.primeiro;
        java.lang.Object[] objArray11 = lista4.item;
        lista0.item = objArray11;
        int int13 = lista0.ultimo;
        lista0.imprime();
        int int15 = lista0.ultimo;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista3.imprime();
        int int6 = lista3.ultimo;
        lista3.ultimo = (byte) 10;
        lista3.primeiro = 100;
        lista3.pos = (short) 1;
        lista3.primeiro = (byte) -1;
        int int15 = lista3.ultimo;
        lista3.pos = 0;
        lista0.insere((java.lang.Object) lista3);
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (short) 1;
        int int11 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        lista0.pos = (byte) 0;
        int int9 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        lista0.ultimo = 10;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.primeiro;
        lista20.pos = 100;
        java.lang.Object[] objArray26 = lista20.item;
        int int27 = lista20.pos;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1L, 0.0f };
        lista35.item = objArray39;
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista28.item = objArray39;
        lista20.item = objArray39;
        lista0.item = objArray39;
        java.lang.Class<?> wildcardClass46 = objArray39.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.pos = (byte) 10;
        boolean boolean23 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        lista0.pos = (short) 0;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Object[] objArray20 = lista0.item;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        int int24 = lista21.primeiro;
        lista21.pos = 100;
        java.lang.Object[] objArray27 = lista21.item;
        lista21.imprime();
        lista21.pos = (short) 0;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.primeiro;
        lista31.pos = 100;
        java.lang.Object[] objArray37 = lista31.item;
        lista21.item = objArray37;
        lista0.item = objArray37;
        boolean boolean40 = lista0.vazia();
        lista0.pos = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.ultimo;
        lista18.pos = '#';
        int int28 = lista18.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        boolean boolean31 = lista29.vazia();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        int int35 = lista32.primeiro;
        lista32.pos = 100;
        java.lang.Object[] objArray38 = lista32.item;
        lista29.item = objArray38;
        lista18.item = objArray38;
        int int41 = lista18.pos;
        int int42 = lista18.primeiro;
        java.lang.Object[] objArray43 = lista18.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        lista2.primeiro = (short) 100;
        lista2.imprime();
        lista2.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        int int11 = lista5.pos;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        int int14 = lista12.pos;
        java.lang.Object[] objArray15 = lista12.item;
        lista12.primeiro = (byte) -1;
        java.lang.Object[] objArray18 = lista12.item;
        lista5.insere((java.lang.Object) objArray18);
        lista5.pos = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        java.lang.Object[] objArray12 = lista5.item;
        boolean boolean13 = lista5.vazia();
        int int14 = lista5.pos;
        java.lang.Class<?> wildcardClass15 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        int int20 = lista13.pos;
        lista13.pos = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        lista25.ultimo = 10;
        lista23.insere((java.lang.Object) lista25);
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.ultimo;
        lista29.ultimo = (byte) 10;
        lista29.primeiro = 100;
        lista25.insere((java.lang.Object) 100);
        java.lang.Object[] objArray38 = lista25.item;
        lista13.insere((java.lang.Object) lista25);
        lista13.pos = (byte) 0;
        boolean boolean42 = lista13.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        boolean boolean25 = lista0.vazia();
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.primeiro;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        int int33 = lista26.pos;
        lista0.insere((java.lang.Object) lista26);
        java.lang.Object obj35 = null;
        lista0.insere(obj35);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        int int25 = lista22.ultimo;
        int int26 = lista22.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        lista27.ultimo = '4';
        java.lang.Object[] objArray32 = lista27.item;
        lista22.item = objArray32;
        int int34 = lista22.primeiro;
        int int35 = lista22.primeiro;
        int int36 = lista22.ultimo;
        lista22.primeiro = 32;
        lista22.imprime();
        java.lang.Object[] objArray40 = lista22.item;
        lista0.item = objArray40;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        lista42.imprime();
        int int45 = lista42.ultimo;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.ultimo = 10;
        lista46.insere((java.lang.Object) lista48);
        int int52 = lista46.primeiro;
        java.lang.Object[] objArray53 = lista46.item;
        lista42.item = objArray53;
        int int55 = lista42.ultimo;
        lista42.imprime();
        int int57 = lista42.ultimo;
        lista0.insere((java.lang.Object) lista42);
        lista42.imprime();
        lista42.ultimo = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        int int11 = lista9.pos;
        lista9.primeiro = 100;
        java.lang.Object[] objArray14 = lista9.item;
        lista5.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        lista0.primeiro = (byte) 100;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.primeiro = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        boolean boolean14 = lista10.vazia();
        lista5.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray16 = lista10.item;
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray19 = lista10.item;
        java.lang.Object[] objArray20 = lista10.item;
        int int21 = lista10.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 10;
        int int8 = lista5.ultimo;
        lista5.pos = (byte) 1;
        boolean boolean11 = lista5.vazia();
        boolean boolean12 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 10;
        int int13 = lista5.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.pos = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        int int8 = lista0.pos;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        int int11 = lista9.pos;
        lista9.primeiro = 100;
        java.lang.Object[] objArray14 = lista9.item;
        lista5.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        boolean boolean14 = lista5.vazia();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 10;
        lista15.insere((java.lang.Object) lista17);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista5.item = objArray22;
        lista5.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista3.imprime();
        int int6 = lista3.ultimo;
        lista3.ultimo = (byte) 10;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1L, 0.0f };
        lista14.item = objArray18;
        lista11.item = objArray18;
        lista9.item = objArray18;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.primeiro = '4';
        lista9.insere((java.lang.Object) lista22);
        int int28 = lista22.primeiro;
        java.lang.Object[] objArray29 = lista22.item;
        lista3.item = objArray29;
        lista3.primeiro = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 100);
        int int34 = lista0.pos;
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.ultimo = (short) 10;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        lista7.pos = (-1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        lista14.primeiro = '4';
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        int int22 = lista19.ultimo;
        boolean boolean23 = lista19.vazia();
        lista14.insere((java.lang.Object) lista19);
        java.lang.Object[] objArray25 = lista19.item;
        lista7.item = objArray25;
        lista0.item = objArray25;
        lista0.primeiro = 11;
        lista0.primeiro = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        int int40 = lista0.primeiro;
        boolean boolean41 = lista0.vazia();
        int int42 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        lista0.ultimo = (byte) 1;
        lista0.ultimo = 100;
        java.lang.Object[] objArray25 = lista0.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.ultimo;
        lista26.ultimo = (byte) 10;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista34.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.imprime();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 1L, 0.0f };
        lista37.item = objArray41;
        lista34.item = objArray41;
        lista32.item = objArray41;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista45.imprime();
        lista45.primeiro = '4';
        lista32.insere((java.lang.Object) lista45);
        int int51 = lista45.primeiro;
        java.lang.Object[] objArray52 = lista45.item;
        lista26.item = objArray52;
        lista26.primeiro = (byte) 100;
        int int56 = lista26.primeiro;
        boolean boolean57 = lista26.vazia();
        lista0.insere((java.lang.Object) lista26);
        java.lang.Object[] objArray59 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.primeiro;
        lista13.pos = 100;
        int int19 = lista13.pos;
        int int20 = lista13.ultimo;
        lista13.ultimo = (short) 100;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        int int26 = lista23.primeiro;
        int int27 = lista23.primeiro;
        lista23.pos = (short) -1;
        lista23.pos = (short) 1;
        lista23.imprime();
        java.lang.Object[] objArray33 = lista23.item;
        java.lang.Class<?> wildcardClass34 = objArray33.getClass();
        lista13.insere((java.lang.Object) wildcardClass34);
        int int36 = lista13.primeiro;
        java.lang.Object[] objArray37 = lista13.item;
        lista0.insere((java.lang.Object) objArray37);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        lista0.ultimo = (-1);
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        lista6.ultimo = (byte) 10;
        lista6.primeiro = 100;
        lista2.insere((java.lang.Object) 100);
        java.lang.Object[] objArray15 = null;
        lista2.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.ultimo;
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        lista17.item = objArray34;
        lista17.primeiro = ' ';
        lista17.ultimo = (byte) 1;
        lista17.ultimo = 100;
        int int42 = lista17.pos;
        lista17.primeiro = 35;
        // The following exception was thrown during execution in test generation
        try {
            lista2.insere((java.lang.Object) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.ultimo = (byte) 0;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        lista0.insere((java.lang.Object) objArray15);
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        int int7 = lista0.pos;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.ultimo = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        lista7.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, 0.0f };
        lista19.item = objArray23;
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista12.item = objArray23;
        int int28 = lista12.ultimo;
        lista12.pos = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean32 = lista0.vazia();
        lista0.pos = 100;
        int int35 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        lista0.ultimo = 3;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.insere((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        lista0.ultimo = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1L, 0.0f };
        lista31.item = objArray35;
        lista28.item = objArray35;
        lista26.item = objArray35;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        lista39.primeiro = '4';
        lista26.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray45 = lista26.item;
        lista18.item = objArray45;
        lista18.imprime();
        int int48 = lista18.ultimo;
        lista18.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista9.imprime();
        int int12 = lista9.ultimo;
        int int13 = lista9.ultimo;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista9.item = objArray15;
        int int17 = lista9.primeiro;
        java.lang.Object[] objArray18 = lista9.item;
        int int19 = lista9.ultimo;
        lista0.insere((java.lang.Object) lista9);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        lista0.ultimo = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.pos = '4';
        lista0.insere((java.lang.Object) '4');
        java.lang.Object[] objArray29 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.ultimo;
        java.lang.Object[] objArray17 = lista13.item;
        lista0.item = objArray17;
        java.lang.Class<?> wildcardClass19 = objArray17.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        int int20 = lista13.pos;
        lista13.pos = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        lista25.ultimo = 10;
        lista23.insere((java.lang.Object) lista25);
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.ultimo;
        lista29.ultimo = (byte) 10;
        lista29.primeiro = 100;
        lista25.insere((java.lang.Object) 100);
        java.lang.Object[] objArray38 = lista25.item;
        lista13.insere((java.lang.Object) lista25);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista40.imprime();
        int int43 = lista40.ultimo;
        lista40.imprime();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.ultimo = 10;
        lista45.insere((java.lang.Object) lista47);
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista51.imprime();
        int int54 = lista51.primeiro;
        int int55 = lista51.primeiro;
        lista47.insere((java.lang.Object) int55);
        java.lang.Object[] objArray57 = lista47.item;
        lista40.item = objArray57;
        lista40.primeiro = ' ';
        int int61 = lista40.primeiro;
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        ds.Lista lista64 = new ds.Lista();
        lista64.ultimo = 10;
        lista62.insere((java.lang.Object) lista64);
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray69 = lista68.item;
        lista68.imprime();
        int int71 = lista68.primeiro;
        int int72 = lista68.primeiro;
        lista64.insere((java.lang.Object) int72);
        java.lang.Object[] objArray74 = lista64.item;
        java.lang.Object[] objArray75 = lista64.item;
        java.lang.Object[] objArray76 = lista64.item;
        lista40.item = objArray76;
        lista25.item = objArray76;
        lista25.pos = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = '#';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = 10;
        lista20.insere((java.lang.Object) lista22);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.ultimo;
        lista26.ultimo = (byte) 10;
        lista26.primeiro = 100;
        lista22.insere((java.lang.Object) 100);
        java.lang.Object[] objArray35 = lista22.item;
        lista0.item = objArray35;
        int int37 = lista0.primeiro;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        java.lang.Object[] objArray41 = lista38.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 1L, 0.0f };
        lista42.item = objArray46;
        lista38.item = objArray46;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        java.lang.Object[] objArray51 = lista49.item;
        lista49.ultimo = (byte) 1;
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        lista54.imprime();
        int int57 = lista54.ultimo;
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        int int60 = lista58.pos;
        lista58.primeiro = 100;
        java.lang.Object[] objArray63 = lista58.item;
        lista54.item = objArray63;
        lista49.item = objArray63;
        lista38.insere((java.lang.Object) objArray63);
        lista0.item = objArray63;
        lista0.pos = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        boolean boolean14 = lista5.vazia();
        lista5.pos = (-1);
        int int17 = lista5.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        int int17 = lista0.pos;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista6.primeiro;
        int int26 = lista6.ultimo;
        lista0.insere((java.lang.Object) lista6);
        lista0.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 10;
        lista7.insere((java.lang.Object) lista9);
        lista9.primeiro = '4';
        lista0.insere((java.lang.Object) lista9);
        lista9.pos = 97;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.ultimo = '4';
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 1L, 0.0f };
        lista28.item = objArray32;
        lista25.item = objArray32;
        lista23.item = objArray32;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista36.imprime();
        lista36.primeiro = '4';
        lista23.insere((java.lang.Object) lista36);
        lista18.insere((java.lang.Object) lista36);
        java.lang.Object[] objArray43 = lista36.item;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.imprime();
        java.lang.Object[] objArray55 = new java.lang.Object[] { 1L, 0.0f };
        lista51.item = objArray55;
        lista48.item = objArray55;
        lista46.item = objArray55;
        lista44.item = objArray55;
        boolean boolean60 = lista44.vazia();
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        ds.Lista lista63 = new ds.Lista();
        lista63.ultimo = 10;
        lista61.insere((java.lang.Object) lista63);
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray68 = lista67.item;
        lista67.imprime();
        int int70 = lista67.primeiro;
        int int71 = lista67.primeiro;
        lista63.insere((java.lang.Object) int71);
        java.lang.Object[] objArray73 = lista63.item;
        java.lang.Object[] objArray74 = lista63.item;
        java.lang.Object[] objArray75 = lista63.item;
        lista44.item = objArray75;
        int int77 = lista44.primeiro;
        lista36.insere((java.lang.Object) lista44);
        lista9.insere((java.lang.Object) lista44);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        int int26 = lista18.ultimo;
        java.lang.Object[] objArray27 = lista18.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1L, 0.0f };
        lista35.item = objArray39;
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista28.item = objArray39;
        boolean boolean44 = lista28.vazia();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.ultimo = 10;
        lista45.insere((java.lang.Object) lista47);
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista51.imprime();
        int int54 = lista51.primeiro;
        int int55 = lista51.primeiro;
        lista47.insere((java.lang.Object) int55);
        java.lang.Object[] objArray57 = lista47.item;
        java.lang.Object[] objArray58 = lista47.item;
        java.lang.Object[] objArray59 = lista47.item;
        lista28.item = objArray59;
        int int61 = lista28.primeiro;
        java.lang.Object[] objArray62 = lista28.item;
        lista18.item = objArray62;
        lista18.ultimo = 52;
        int int66 = lista18.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 52 + "'", int66 == 52);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        java.lang.Object[] objArray12 = lista5.item;
        boolean boolean13 = lista5.vazia();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 10;
        lista14.insere((java.lang.Object) lista16);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.primeiro;
        int int24 = lista20.primeiro;
        lista16.insere((java.lang.Object) int24);
        java.lang.Object[] objArray26 = lista16.item;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        lista27.imprime();
        lista16.insere((java.lang.Object) lista27);
        int int33 = lista27.primeiro;
        int int34 = lista27.pos;
        lista27.pos = (byte) 1;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        lista39.ultimo = 10;
        lista37.insere((java.lang.Object) lista39);
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        lista43.imprime();
        int int46 = lista43.ultimo;
        lista43.ultimo = (byte) 10;
        lista43.primeiro = 100;
        lista39.insere((java.lang.Object) 100);
        java.lang.Object[] objArray52 = lista39.item;
        lista27.insere((java.lang.Object) lista39);
        int int54 = lista27.ultimo;
        lista5.insere((java.lang.Object) lista27);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.primeiro = '4';
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        boolean boolean31 = lista27.vazia();
        lista22.insere((java.lang.Object) lista27);
        lista27.imprime();
        lista27.pos = 'a';
        lista0.insere((java.lang.Object) lista27);
        lista27.pos = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        lista18.pos = (byte) 1;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        lista27.imprime();
        java.lang.Object[] objArray32 = lista27.item;
        lista18.item = objArray32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        lista0.ultimo = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 10;
        lista7.insere((java.lang.Object) lista9);
        int int13 = lista7.primeiro;
        java.lang.Object[] objArray14 = lista7.item;
        lista7.pos = ' ';
        lista7.primeiro = 'a';
        java.lang.Object[] objArray19 = lista7.item;
        lista0.item = objArray19;
        int int21 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (byte) 0;
        int int11 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.ultimo;
        lista18.pos = '#';
        int int28 = lista18.ultimo;
        int int29 = lista18.ultimo;
        int int30 = lista18.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista0.pos = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.insere((java.lang.Object) 100);
        lista5.primeiro = '4';
        boolean boolean15 = lista5.vazia();
        lista5.pos = 'a';
        lista5.ultimo = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        boolean boolean2 = lista0.vazia();
        java.lang.Object[] objArray3 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = (-1);
        lista0.imprime();
        lista0.ultimo = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = '#';
        java.lang.Object[] objArray20 = lista0.item;
        int int21 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        lista19.ultimo = 10;
        lista17.insere((java.lang.Object) lista19);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        int int26 = lista23.primeiro;
        int int27 = lista23.primeiro;
        lista19.insere((java.lang.Object) int27);
        java.lang.Object[] objArray29 = lista19.item;
        java.lang.Object[] objArray30 = lista19.item;
        java.lang.Object[] objArray31 = lista19.item;
        lista0.item = objArray31;
        int int33 = lista0.primeiro;
        java.lang.Object[] objArray34 = lista0.item;
        boolean boolean35 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        int int7 = lista4.ultimo;
        boolean boolean8 = lista4.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1L, 0.0f };
        lista9.item = objArray13;
        lista4.item = objArray13;
        lista0.item = objArray13;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.primeiro;
        lista17.pos = 100;
        java.lang.Object[] objArray23 = lista17.item;
        int int24 = lista17.pos;
        int int25 = lista17.ultimo;
        lista17.imprime();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        lista27.primeiro = '4';
        lista27.pos = (-1);
        lista27.insere((java.lang.Object) 1L);
        lista27.imprime();
        java.lang.Object[] objArray37 = lista27.item;
        lista17.item = objArray37;
        lista0.item = objArray37;
        lista0.ultimo = 12;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        boolean boolean14 = lista5.vazia();
        lista5.pos = (-1);
        java.lang.Class<?> wildcardClass17 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        boolean boolean24 = lista8.vazia();
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 10;
        lista25.insere((java.lang.Object) lista27);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.primeiro;
        int int35 = lista31.primeiro;
        lista27.insere((java.lang.Object) int35);
        java.lang.Object[] objArray37 = lista27.item;
        java.lang.Object[] objArray38 = lista27.item;
        java.lang.Object[] objArray39 = lista27.item;
        lista8.item = objArray39;
        lista0.item = objArray39;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        lista42.imprime();
        int int45 = lista42.ultimo;
        lista42.imprime();
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        ds.Lista lista49 = new ds.Lista();
        lista49.ultimo = 10;
        lista47.insere((java.lang.Object) lista49);
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        lista53.imprime();
        int int56 = lista53.primeiro;
        int int57 = lista53.primeiro;
        lista49.insere((java.lang.Object) int57);
        java.lang.Object[] objArray59 = lista49.item;
        lista42.item = objArray59;
        lista42.primeiro = ' ';
        int int63 = lista42.primeiro;
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        ds.Lista lista66 = new ds.Lista();
        lista66.ultimo = 10;
        lista64.insere((java.lang.Object) lista66);
        ds.Lista lista70 = new ds.Lista();
        java.lang.Object[] objArray71 = lista70.item;
        lista70.imprime();
        int int73 = lista70.primeiro;
        int int74 = lista70.primeiro;
        lista66.insere((java.lang.Object) int74);
        java.lang.Object[] objArray76 = lista66.item;
        java.lang.Object[] objArray77 = lista66.item;
        java.lang.Object[] objArray78 = lista66.item;
        lista42.item = objArray78;
        ds.Lista lista80 = new ds.Lista();
        java.lang.Object[] objArray81 = lista80.item;
        int int82 = lista80.pos;
        java.lang.Object[] objArray83 = lista80.item;
        lista80.primeiro = (byte) -1;
        java.lang.Object[] objArray86 = lista80.item;
        lista42.item = objArray86;
        lista0.item = objArray86;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 32 + "'", int63 == 32);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        lista2.pos = (short) 1;
        int int17 = lista2.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        boolean boolean14 = lista2.vazia();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.ultimo;
        int int19 = lista15.pos;
        lista15.primeiro = 'a';
        java.lang.Object[] objArray22 = lista15.item;
        lista2.item = objArray22;
        int int24 = lista2.ultimo;
        java.lang.Object obj25 = null;
        lista2.insere(obj25);
        lista2.primeiro = 52;
        lista2.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray25 = lista18.item;
        lista18.pos = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object obj6 = null;
        lista0.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        int int14 = lista11.primeiro;
        java.lang.Object[] objArray15 = lista11.item;
        lista8.insere((java.lang.Object) objArray15);
        int int17 = lista8.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.pos = 100;
        lista0.ultimo = 0;
        lista0.primeiro = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.ultimo = 10;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        int int15 = lista13.pos;
        lista13.primeiro = 100;
        lista13.pos = (short) -1;
        int int20 = lista13.pos;
        lista0.insere((java.lang.Object) lista13);
        lista13.pos = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.primeiro;
        lista0.ultimo = '#';
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        lista5.insere((java.lang.Object) objArray20);
        lista5.ultimo = 32;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista24.imprime();
        int int27 = lista24.ultimo;
        lista24.imprime();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.ultimo = 10;
        lista29.insere((java.lang.Object) lista31);
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        int int38 = lista35.primeiro;
        int int39 = lista35.primeiro;
        lista31.insere((java.lang.Object) int39);
        java.lang.Object[] objArray41 = lista31.item;
        lista24.item = objArray41;
        lista24.primeiro = ' ';
        int int45 = lista24.primeiro;
        int int46 = lista24.pos;
        lista5.insere((java.lang.Object) int46);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        lista0.primeiro = (-1);
        int int10 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.pos = 0;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.ultimo;
        boolean boolean19 = lista15.vazia();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        lista20.ultimo = '4';
        lista15.insere((java.lang.Object) '4');
        int int26 = lista15.primeiro;
        int int27 = lista15.ultimo;
        lista15.pos = 'a';
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.primeiro = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        int int38 = lista35.ultimo;
        boolean boolean39 = lista35.vazia();
        lista30.insere((java.lang.Object) lista35);
        java.lang.Object[] objArray41 = lista35.item;
        lista35.pos = 0;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista44.imprime();
        int int47 = lista44.primeiro;
        lista44.pos = 100;
        java.lang.Object[] objArray50 = lista44.item;
        lista35.insere((java.lang.Object) objArray50);
        lista15.item = objArray50;
        lista0.item = objArray50;
        lista0.pos = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.primeiro = '4';
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        boolean boolean31 = lista27.vazia();
        lista22.insere((java.lang.Object) lista27);
        lista27.imprime();
        lista27.pos = 'a';
        lista0.insere((java.lang.Object) lista27);
        lista27.ultimo = 53;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        int int22 = lista0.pos;
        java.lang.Object[] objArray23 = lista0.item;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.pos = 'a';
        int int28 = lista24.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        lista29.ultimo = '4';
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista36.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 1L, 0.0f };
        lista39.item = objArray43;
        lista36.item = objArray43;
        lista34.item = objArray43;
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        lista47.imprime();
        lista47.primeiro = '4';
        lista34.insere((java.lang.Object) lista47);
        lista29.insere((java.lang.Object) lista47);
        java.lang.Object[] objArray54 = lista47.item;
        lista24.insere((java.lang.Object) objArray54);
        int int56 = lista24.ultimo;
        int int57 = lista24.primeiro;
        lista24.ultimo = (short) 10;
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        lista64.imprime();
        ds.Lista lista67 = new ds.Lista();
        lista67.imprime();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 1L, 0.0f };
        lista67.item = objArray71;
        lista64.item = objArray71;
        lista62.item = objArray71;
        lista60.item = objArray71;
        boolean boolean76 = lista60.vazia();
        ds.Lista lista77 = new ds.Lista();
        java.lang.Object[] objArray78 = lista77.item;
        ds.Lista lista79 = new ds.Lista();
        lista79.ultimo = 10;
        lista77.insere((java.lang.Object) lista79);
        ds.Lista lista83 = new ds.Lista();
        java.lang.Object[] objArray84 = lista83.item;
        lista83.imprime();
        int int86 = lista83.primeiro;
        int int87 = lista83.primeiro;
        lista79.insere((java.lang.Object) int87);
        java.lang.Object[] objArray89 = lista79.item;
        java.lang.Object[] objArray90 = lista79.item;
        java.lang.Object[] objArray91 = lista79.item;
        lista60.item = objArray91;
        lista24.item = objArray91;
        lista0.item = objArray91;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        lista2.primeiro = (short) 100;
        java.lang.Object[] objArray8 = lista2.item;
        lista2.primeiro = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        lista5.pos = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        java.lang.Object[] objArray18 = lista7.item;
        java.lang.Object[] objArray19 = lista7.item;
        lista7.pos = (short) 1;
        java.lang.Object[] objArray22 = lista7.item;
        lista0.item = objArray22;
        java.lang.Object[] objArray24 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.imprime();
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, 0.0f };
        lista19.item = objArray23;
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista12.item = objArray23;
        int int28 = lista12.ultimo;
        lista12.pos = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean32 = lista0.vazia();
        boolean boolean33 = lista0.vazia();
        boolean boolean34 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (-1);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        lista11.ultimo = '4';
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, 0.0f };
        lista21.item = objArray25;
        lista18.item = objArray25;
        lista16.item = objArray25;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        lista29.primeiro = '4';
        lista16.insere((java.lang.Object) lista29);
        lista11.insere((java.lang.Object) lista29);
        java.lang.Object[] objArray36 = lista29.item;
        lista0.item = objArray36;
        int int38 = lista0.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.primeiro = '4';
        lista10.insere((java.lang.Object) lista23);
        lista5.insere((java.lang.Object) lista23);
        java.lang.Object[] objArray30 = lista23.item;
        lista0.insere((java.lang.Object) objArray30);
        int int32 = lista0.ultimo;
        int int33 = lista0.primeiro;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista34.imprime();
        lista34.primeiro = '4';
        lista34.pos = (-1);
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista41.imprime();
        lista41.primeiro = '4';
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        lista46.imprime();
        int int49 = lista46.ultimo;
        boolean boolean50 = lista46.vazia();
        lista41.insere((java.lang.Object) lista46);
        java.lang.Object[] objArray52 = lista46.item;
        lista34.item = objArray52;
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        lista54.imprime();
        int int57 = lista54.ultimo;
        int int58 = lista54.pos;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        lista59.imprime();
        lista59.ultimo = '4';
        java.lang.Object[] objArray64 = lista59.item;
        lista54.item = objArray64;
        int int66 = lista54.primeiro;
        int int67 = lista54.primeiro;
        int int68 = lista54.ultimo;
        lista54.primeiro = 32;
        lista54.imprime();
        java.lang.Object[] objArray72 = lista54.item;
        lista34.insere((java.lang.Object) lista54);
        int int74 = lista54.ultimo;
        lista54.imprime();
        lista54.primeiro = 0;
        ds.Lista lista78 = new ds.Lista();
        java.lang.Object[] objArray79 = lista78.item;
        lista78.imprime();
        int int81 = lista78.primeiro;
        lista78.pos = 100;
        java.lang.Object[] objArray84 = lista78.item;
        lista78.imprime();
        lista78.pos = (short) 0;
        java.lang.Object[] objArray88 = lista78.item;
        lista54.insere((java.lang.Object) objArray88);
        lista0.item = objArray88;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        int int24 = lista8.ultimo;
        lista8.pos = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.imprime();
        int int11 = lista0.pos;
        lista0.primeiro = '4';
        lista0.primeiro = 100;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        int int19 = lista16.primeiro;
        lista16.pos = 100;
        java.lang.Object[] objArray22 = lista16.item;
        int int23 = lista16.pos;
        int int24 = lista16.ultimo;
        int int25 = lista16.pos;
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, 0.0f };
        lista3.item = objArray7;
        lista0.item = objArray7;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        lista10.ultimo = (byte) 10;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, 0.0f };
        lista21.item = objArray25;
        lista18.item = objArray25;
        lista16.item = objArray25;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        lista29.primeiro = '4';
        lista16.insere((java.lang.Object) lista29);
        int int35 = lista29.primeiro;
        java.lang.Object[] objArray36 = lista29.item;
        lista10.item = objArray36;
        java.lang.Object[] objArray38 = lista10.item;
        lista0.item = objArray38;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        java.lang.Object[] objArray21 = lista0.item;
        lista0.pos = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 0;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        lista0.ultimo = 10;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        lista20.ultimo = (byte) 10;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1L, 0.0f };
        lista31.item = objArray35;
        lista28.item = objArray35;
        lista26.item = objArray35;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        lista39.primeiro = '4';
        lista26.insere((java.lang.Object) lista39);
        int int45 = lista39.primeiro;
        java.lang.Object[] objArray46 = lista39.item;
        lista20.item = objArray46;
        java.lang.Object[] objArray48 = lista20.item;
        lista0.item = objArray48;
        lista0.imprime();
        boolean boolean51 = lista0.vazia();
        int int52 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.primeiro = 11;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        boolean boolean14 = lista12.vazia();
        int int15 = lista12.ultimo;
        java.lang.Object[] objArray16 = lista12.item;
        lista12.ultimo = ' ';
        java.lang.Object[] objArray19 = lista12.item;
        lista0.insere((java.lang.Object) lista12);
        lista12.ultimo = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        int int5 = lista2.primeiro;
        int int6 = lista2.primeiro;
        lista2.pos = (short) -1;
        java.lang.Object[] objArray9 = lista2.item;
        int int10 = lista2.ultimo;
        lista2.pos = 10;
        lista0.insere((java.lang.Object) 10);
        lista0.pos = 12;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.primeiro = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista3.imprime();
        int int6 = lista3.primeiro;
        lista3.pos = 100;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        lista0.primeiro = (byte) -1;
        int int13 = lista0.ultimo;
        lista0.pos = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        int int19 = lista7.pos;
        int int20 = lista7.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 10;
        lista21.insere((java.lang.Object) lista23);
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.primeiro;
        int int31 = lista27.primeiro;
        lista23.insere((java.lang.Object) int31);
        java.lang.Object[] objArray33 = lista23.item;
        java.lang.Object[] objArray34 = lista23.item;
        java.lang.Object[] objArray35 = lista23.item;
        lista23.pos = (short) 1;
        java.lang.Object[] objArray38 = lista23.item;
        lista7.item = objArray38;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        int int10 = lista7.ultimo;
        boolean boolean11 = lista7.vazia();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        lista12.ultimo = '4';
        lista7.insere((java.lang.Object) '4');
        int int18 = lista7.primeiro;
        int int19 = lista7.ultimo;
        lista7.pos = 'a';
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.primeiro = '4';
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        boolean boolean31 = lista27.vazia();
        lista22.insere((java.lang.Object) lista27);
        java.lang.Object[] objArray33 = lista27.item;
        lista27.pos = 0;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista36.imprime();
        int int39 = lista36.primeiro;
        lista36.pos = 100;
        java.lang.Object[] objArray42 = lista36.item;
        lista27.insere((java.lang.Object) objArray42);
        lista7.item = objArray42;
        int int45 = lista7.pos;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.ultimo = 10;
        lista46.insere((java.lang.Object) lista48);
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        lista52.imprime();
        int int55 = lista52.primeiro;
        int int56 = lista52.primeiro;
        lista48.insere((java.lang.Object) int56);
        java.lang.Object[] objArray58 = lista48.item;
        java.lang.Object[] objArray59 = lista48.item;
        java.lang.Object[] objArray60 = lista48.item;
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        lista61.imprime();
        int int64 = lista61.primeiro;
        lista61.pos = 100;
        java.lang.Object[] objArray67 = lista61.item;
        lista48.item = objArray67;
        lista7.item = objArray67;
        lista0.item = objArray67;
        int int71 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1L, 0.0f };
        lista14.item = objArray18;
        lista11.item = objArray18;
        lista9.item = objArray18;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.primeiro = '4';
        lista9.insere((java.lang.Object) lista22);
        java.lang.Object[] objArray28 = lista9.item;
        java.lang.Object[] objArray29 = lista9.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        int int33 = lista30.primeiro;
        lista30.pos = 100;
        java.lang.Object[] objArray36 = lista30.item;
        lista30.imprime();
        lista30.pos = (short) 0;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista40.imprime();
        int int43 = lista40.primeiro;
        lista40.pos = 100;
        java.lang.Object[] objArray46 = lista40.item;
        lista30.item = objArray46;
        lista9.item = objArray46;
        lista0.item = objArray46;
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        lista50.imprime();
        int int53 = lista50.primeiro;
        int int54 = lista50.primeiro;
        lista50.pos = (short) -1;
        lista50.pos = (short) 1;
        lista50.imprime();
        java.lang.Object[] objArray60 = lista50.item;
        lista0.insere((java.lang.Object) objArray60);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 1;
        int int9 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.primeiro;
        int int9 = lista5.primeiro;
        lista5.pos = (short) -1;
        java.lang.Object[] objArray12 = lista5.item;
        lista0.item = objArray12;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 10;
        lista15.ultimo = (short) -1;
        int int20 = lista15.ultimo;
        lista15.imprime();
        lista15.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray25 = lista0.item;
        lista0.pos = 97;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        lista30.ultimo = 10;
        lista28.insere((java.lang.Object) lista30);
        lista30.primeiro = (short) 100;
        lista30.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.imprime();
        int int39 = lista37.primeiro;
        lista37.imprime();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        lista43.ultimo = 10;
        lista41.insere((java.lang.Object) lista43);
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        lista47.imprime();
        int int50 = lista47.ultimo;
        lista47.ultimo = (byte) 10;
        lista47.primeiro = 100;
        lista43.insere((java.lang.Object) 100);
        java.lang.Object[] objArray56 = lista43.item;
        java.lang.Object[] objArray57 = lista43.item;
        lista37.item = objArray57;
        lista30.item = objArray57;
        lista0.item = objArray57;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        lista5.insere((java.lang.Object) objArray20);
        boolean boolean22 = lista5.vazia();
        boolean boolean23 = lista5.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        int int7 = lista0.primeiro;
        lista0.ultimo = 53;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 0;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        int int16 = lista0.ultimo;
        int int17 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        int int14 = lista10.pos;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        lista15.ultimo = '4';
        java.lang.Object[] objArray20 = lista15.item;
        lista10.item = objArray20;
        int int22 = lista10.primeiro;
        int int23 = lista10.primeiro;
        int int24 = lista10.ultimo;
        lista10.primeiro = 32;
        int int27 = lista10.pos;
        lista10.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.ultimo = 11;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1L, 0.0f };
        lista31.item = objArray35;
        lista28.item = objArray35;
        lista26.item = objArray35;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        lista39.primeiro = '4';
        lista26.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray45 = lista26.item;
        lista18.item = objArray45;
        lista18.imprime();
        int int48 = lista18.primeiro;
        int int49 = lista18.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        lista0.item = objArray10;
        int int12 = lista0.pos;
        lista0.primeiro = 52;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        lista12.primeiro = '4';
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.ultimo;
        boolean boolean21 = lista17.vazia();
        lista12.insere((java.lang.Object) lista17);
        lista17.ultimo = 10;
        lista17.ultimo = ' ';
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        int int31 = lista27.ultimo;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista27.item = objArray33;
        lista17.item = objArray33;
        java.lang.Object[] objArray36 = lista17.item;
        lista0.item = objArray36;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista6.primeiro;
        int int26 = lista6.ultimo;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.ultimo;
        int int32 = lista28.ultimo;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista28.item = objArray34;
        java.lang.Object[] objArray36 = lista28.item;
        lista28.primeiro = (-1);
        lista6.insere((java.lang.Object) lista28);
        lista28.pos = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        boolean boolean12 = lista0.vazia();
        lista0.ultimo = 1;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, 0.0f };
        lista21.item = objArray25;
        lista18.item = objArray25;
        lista16.item = objArray25;
        int int29 = lista16.pos;
        lista16.pos = 11;
        java.lang.Object[] objArray32 = lista16.item;
        lista0.item = objArray32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 0.0]");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        boolean boolean14 = lista2.vazia();
        lista2.ultimo = 0;
        int int17 = lista2.ultimo;
        java.lang.Class<?> wildcardClass18 = lista2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        boolean boolean10 = lista0.vazia();
        lista0.primeiro = 53;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        java.lang.Object[] objArray41 = lista38.item;
        lista38.primeiro = (byte) -1;
        java.lang.Object[] objArray44 = lista38.item;
        lista0.item = objArray44;
        java.lang.Object[] objArray46 = lista0.item;
        int int47 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = 52;
        int int11 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.insere((java.lang.Object) objArray9);
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        lista12.ultimo = '4';
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 1L, 0.0f };
        lista22.item = objArray26;
        lista19.item = objArray26;
        lista17.item = objArray26;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.primeiro = '4';
        lista17.insere((java.lang.Object) lista30);
        lista12.insere((java.lang.Object) lista30);
        java.lang.Object[] objArray37 = lista30.item;
        lista0.insere((java.lang.Object) objArray37);
        java.lang.Class<?> wildcardClass39 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        lista0.pos = (short) 0;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.primeiro;
        int int9 = lista5.primeiro;
        lista5.pos = (short) -1;
        java.lang.Object[] objArray12 = lista5.item;
        lista0.item = objArray12;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 10;
        lista15.ultimo = (short) -1;
        int int20 = lista15.ultimo;
        lista15.imprime();
        lista15.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 10;
        lista25.insere((java.lang.Object) lista27);
        int int31 = lista25.primeiro;
        java.lang.Object[] objArray32 = lista25.item;
        lista25.pos = ' ';
        lista25.primeiro = 'a';
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista37.imprime();
        lista37.primeiro = '4';
        lista37.pos = (-1);
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista44.imprime();
        lista44.primeiro = '4';
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        lista49.imprime();
        int int52 = lista49.ultimo;
        boolean boolean53 = lista49.vazia();
        lista44.insere((java.lang.Object) lista49);
        java.lang.Object[] objArray55 = lista49.item;
        lista37.item = objArray55;
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        lista57.imprime();
        int int60 = lista57.ultimo;
        int int61 = lista57.pos;
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        lista62.imprime();
        lista62.ultimo = '4';
        java.lang.Object[] objArray67 = lista62.item;
        lista57.item = objArray67;
        int int69 = lista57.primeiro;
        int int70 = lista57.primeiro;
        int int71 = lista57.ultimo;
        lista57.primeiro = 32;
        lista57.imprime();
        java.lang.Object[] objArray75 = lista57.item;
        lista37.insere((java.lang.Object) lista57);
        lista57.ultimo = (short) 100;
        java.lang.Object[] objArray79 = lista57.item;
        lista25.item = objArray79;
        lista0.item = objArray79;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray79);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        lista6.pos = 100;
        int int12 = lista6.pos;
        int int13 = lista6.ultimo;
        lista6.ultimo = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        boolean boolean17 = lista0.vazia();
        boolean boolean18 = lista0.vazia();
        int int19 = lista0.pos;
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray19 = lista7.item;
        int int20 = lista7.ultimo;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        int int17 = lista0.pos;
        int int18 = lista0.primeiro;
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = '4';
        lista0.primeiro = (short) 10;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        lista13.pos = 32;
        int int22 = lista13.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        int int26 = lista18.ultimo;
        java.lang.Object[] objArray27 = lista18.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1L, 0.0f };
        lista35.item = objArray39;
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista28.item = objArray39;
        boolean boolean44 = lista28.vazia();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.ultimo = 10;
        lista45.insere((java.lang.Object) lista47);
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista51.imprime();
        int int54 = lista51.primeiro;
        int int55 = lista51.primeiro;
        lista47.insere((java.lang.Object) int55);
        java.lang.Object[] objArray57 = lista47.item;
        java.lang.Object[] objArray58 = lista47.item;
        java.lang.Object[] objArray59 = lista47.item;
        lista28.item = objArray59;
        int int61 = lista28.primeiro;
        java.lang.Object[] objArray62 = lista28.item;
        lista18.item = objArray62;
        lista18.ultimo = 52;
        lista18.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        int int15 = lista12.ultimo;
        boolean boolean16 = lista12.vazia();
        lista7.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        int int24 = lista20.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        lista25.ultimo = '4';
        java.lang.Object[] objArray30 = lista25.item;
        lista20.item = objArray30;
        int int32 = lista20.primeiro;
        int int33 = lista20.primeiro;
        int int34 = lista20.ultimo;
        lista20.primeiro = 32;
        lista20.imprime();
        java.lang.Object[] objArray38 = lista20.item;
        lista0.insere((java.lang.Object) lista20);
        int int40 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = '4';
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        int int21 = lista14.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1L, 0.0f };
        lista29.item = objArray33;
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista22.item = objArray33;
        lista14.item = objArray33;
        int int39 = lista14.pos;
        boolean boolean40 = lista14.vazia();
        lista2.insere((java.lang.Object) boolean40);
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        lista42.primeiro = (short) 1;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        lista46.imprime();
        int int49 = lista46.primeiro;
        lista46.pos = 100;
        java.lang.Object[] objArray52 = lista46.item;
        lista46.imprime();
        lista46.pos = (short) 0;
        java.lang.Object[] objArray56 = lista46.item;
        lista42.item = objArray56;
        lista2.item = objArray56;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = ' ';
        lista0.ultimo = (byte) 100;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        boolean boolean23 = lista2.vazia();
        int int24 = lista2.ultimo;
        int int25 = lista2.primeiro;
        lista2.primeiro = ' ';
        boolean boolean28 = lista2.vazia();
        lista2.ultimo = '4';
        int int31 = lista2.ultimo;
        lista2.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        boolean boolean23 = lista2.vazia();
        int int24 = lista2.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        lista10.pos = 100;
        java.lang.Object[] objArray16 = lista10.item;
        lista0.item = objArray16;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        boolean boolean22 = lista18.vazia();
        lista18.pos = (byte) 0;
        int int25 = lista18.ultimo;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.primeiro;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        int int33 = lista26.pos;
        int int34 = lista26.ultimo;
        lista26.imprime();
        lista18.insere((java.lang.Object) lista26);
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        java.lang.Object[] objArray39 = lista37.item;
        lista37.ultimo = (byte) 1;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        lista42.imprime();
        int int45 = lista42.ultimo;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        int int48 = lista46.pos;
        lista46.primeiro = 100;
        java.lang.Object[] objArray51 = lista46.item;
        lista42.item = objArray51;
        lista37.item = objArray51;
        lista18.insere((java.lang.Object) objArray51);
        lista0.item = objArray51;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.insere((java.lang.Object) objArray9);
        lista0.primeiro = 52;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 10;
        lista14.insere((java.lang.Object) lista16);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.primeiro;
        int int24 = lista20.primeiro;
        lista16.insere((java.lang.Object) int24);
        lista16.pos = 0;
        boolean boolean28 = lista16.vazia();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.ultimo;
        int int33 = lista29.pos;
        lista29.primeiro = 'a';
        java.lang.Object[] objArray36 = lista29.item;
        lista16.item = objArray36;
        int int38 = lista16.ultimo;
        java.lang.Object obj39 = null;
        lista16.insere(obj39);
        lista16.primeiro = 52;
        lista16.primeiro = '#';
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 11 + "'", int38 == 11);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        int int12 = lista8.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.ultimo = '4';
        java.lang.Object[] objArray18 = lista13.item;
        lista8.item = objArray18;
        lista0.insere((java.lang.Object) lista8);
        lista8.imprime();
        int int22 = lista8.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 10;
        int int12 = lista9.ultimo;
        lista9.pos = (byte) 1;
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista9.ultimo = 'a';
        lista9.primeiro = (byte) 0;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        int int24 = lista21.ultimo;
        int int25 = lista21.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        lista26.ultimo = '4';
        java.lang.Object[] objArray31 = lista26.item;
        lista21.item = objArray31;
        lista9.item = objArray31;
        lista0.item = objArray31;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        int int38 = lista35.primeiro;
        int int39 = lista35.primeiro;
        lista35.ultimo = (byte) 100;
        java.lang.Object[] objArray42 = lista35.item;
        lista0.item = objArray42;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        int int26 = lista18.ultimo;
        java.lang.Object[] objArray27 = lista18.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1L, 0.0f };
        lista35.item = objArray39;
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista28.item = objArray39;
        boolean boolean44 = lista28.vazia();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.ultimo = 10;
        lista45.insere((java.lang.Object) lista47);
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista51.imprime();
        int int54 = lista51.primeiro;
        int int55 = lista51.primeiro;
        lista47.insere((java.lang.Object) int55);
        java.lang.Object[] objArray57 = lista47.item;
        java.lang.Object[] objArray58 = lista47.item;
        java.lang.Object[] objArray59 = lista47.item;
        lista28.item = objArray59;
        int int61 = lista28.primeiro;
        java.lang.Object[] objArray62 = lista28.item;
        lista18.item = objArray62;
        lista18.ultimo = 52;
        lista18.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        int int10 = lista6.pos;
        lista6.primeiro = 'a';
        lista0.insere((java.lang.Object) 'a');
        int int14 = lista0.ultimo;
        lista0.pos = 32;
        int int17 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        boolean boolean14 = lista2.vazia();
        lista2.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        lista8.primeiro = '4';
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        boolean boolean17 = lista13.vazia();
        lista8.insere((java.lang.Object) lista13);
        lista13.ultimo = 0;
        lista13.pos = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        lista0.primeiro = ' ';
        lista0.ultimo = 3;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        int int9 = lista0.pos;
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 10;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.primeiro;
        lista13.pos = 100;
        java.lang.Object obj19 = null;
        lista13.insere(obj19);
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista13.insere((java.lang.Object) lista21);
        lista21.ultimo = 0;
        boolean boolean26 = lista21.vazia();
        int int27 = lista21.primeiro;
        lista5.insere((java.lang.Object) int27);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (short) 1;
        int int4 = lista0.pos;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        boolean boolean14 = lista5.vazia();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 10;
        lista15.insere((java.lang.Object) lista17);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista5.item = objArray22;
        boolean boolean24 = lista5.vazia();
        int int25 = lista5.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.ultimo = (short) 10;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        lista7.pos = (-1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        lista14.primeiro = '4';
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        int int22 = lista19.ultimo;
        boolean boolean23 = lista19.vazia();
        lista14.insere((java.lang.Object) lista19);
        java.lang.Object[] objArray25 = lista19.item;
        lista7.item = objArray25;
        lista0.item = objArray25;
        lista0.primeiro = 11;
        int int30 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.ultimo = 10;
        lista0.primeiro = 11;
        int int15 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        int int22 = lista0.pos;
        int int23 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.pos = (byte) 10;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.ultimo = '4';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1L, 0.0f };
        lista20.item = objArray24;
        lista17.item = objArray24;
        lista15.item = objArray24;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        lista28.primeiro = '4';
        lista15.insere((java.lang.Object) lista28);
        lista10.insere((java.lang.Object) lista28);
        lista28.pos = (byte) 1;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista37.imprime();
        int int40 = lista37.ultimo;
        int int41 = lista37.ultimo;
        int int42 = lista37.primeiro;
        lista28.insere((java.lang.Object) lista37);
        lista0.insere((java.lang.Object) lista37);
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista45.imprime();
        lista45.primeiro = '4';
        lista45.pos = (-1);
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        lista52.imprime();
        lista52.primeiro = '4';
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        lista57.imprime();
        int int60 = lista57.ultimo;
        boolean boolean61 = lista57.vazia();
        lista52.insere((java.lang.Object) lista57);
        java.lang.Object[] objArray63 = lista57.item;
        lista45.item = objArray63;
        lista0.item = objArray63;
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        lista66.imprime();
        int int69 = lista66.ultimo;
        int int70 = lista66.pos;
        ds.Lista lista71 = new ds.Lista();
        java.lang.Object[] objArray72 = lista71.item;
        lista71.imprime();
        lista71.primeiro = '4';
        ds.Lista lista76 = new ds.Lista();
        java.lang.Object[] objArray77 = lista76.item;
        lista76.imprime();
        int int79 = lista76.ultimo;
        boolean boolean80 = lista76.vazia();
        lista71.insere((java.lang.Object) lista76);
        java.lang.Object[] objArray82 = lista76.item;
        lista76.imprime();
        lista66.insere((java.lang.Object) lista76);
        lista0.insere((java.lang.Object) lista66);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(objArray82);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.ultimo = (byte) 100;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.pos = 2;
        int int11 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        java.lang.Object[] objArray41 = lista38.item;
        lista38.primeiro = (byte) -1;
        java.lang.Object[] objArray44 = lista38.item;
        lista0.item = objArray44;
        java.lang.Object[] objArray46 = lista0.item;
        lista0.pos = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray19 = lista7.item;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        boolean boolean24 = lista20.vazia();
        lista20.pos = (byte) 0;
        int int27 = lista20.ultimo;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        lista28.pos = 100;
        java.lang.Object[] objArray34 = lista28.item;
        int int35 = lista28.pos;
        int int36 = lista28.ultimo;
        lista28.imprime();
        lista20.insere((java.lang.Object) lista28);
        java.lang.Object[] objArray39 = lista20.item;
        lista7.item = objArray39;
        java.lang.Class<?> wildcardClass41 = lista7.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        lista0.ultimo = 10;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        lista20.ultimo = (byte) 10;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1L, 0.0f };
        lista31.item = objArray35;
        lista28.item = objArray35;
        lista26.item = objArray35;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        lista39.primeiro = '4';
        lista26.insere((java.lang.Object) lista39);
        int int45 = lista39.primeiro;
        java.lang.Object[] objArray46 = lista39.item;
        lista20.item = objArray46;
        java.lang.Object[] objArray48 = lista20.item;
        lista0.item = objArray48;
        lista0.imprime();
        boolean boolean51 = lista0.vazia();
        lista0.pos = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray25 = lista18.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1L, 0.0f };
        lista33.item = objArray37;
        lista30.item = objArray37;
        lista28.item = objArray37;
        lista26.item = objArray37;
        boolean boolean42 = lista26.vazia();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        lista45.ultimo = 10;
        lista43.insere((java.lang.Object) lista45);
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        lista49.imprime();
        int int52 = lista49.primeiro;
        int int53 = lista49.primeiro;
        lista45.insere((java.lang.Object) int53);
        java.lang.Object[] objArray55 = lista45.item;
        java.lang.Object[] objArray56 = lista45.item;
        java.lang.Object[] objArray57 = lista45.item;
        lista26.item = objArray57;
        int int59 = lista26.primeiro;
        lista18.insere((java.lang.Object) lista26);
        int int61 = lista26.ultimo;
        lista26.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.primeiro;
        lista8.pos = 100;
        java.lang.Object[] objArray14 = lista8.item;
        int int15 = lista8.pos;
        int int16 = lista8.ultimo;
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray19 = lista0.item;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        lista20.primeiro = '4';
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        int int28 = lista25.ultimo;
        boolean boolean29 = lista25.vazia();
        lista20.insere((java.lang.Object) lista25);
        java.lang.Object[] objArray31 = lista25.item;
        lista25.pos = 0;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista34.imprime();
        lista34.primeiro = '4';
        lista34.pos = (-1);
        lista34.insere((java.lang.Object) 1L);
        lista34.imprime();
        java.lang.Object[] objArray44 = lista34.item;
        lista25.item = objArray44;
        lista0.insere((java.lang.Object) objArray44);
        int int47 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.ultimo = 10;
        lista4.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        lista10.ultimo = (byte) 10;
        lista10.primeiro = 100;
        lista6.insere((java.lang.Object) 100);
        java.lang.Object[] objArray19 = lista6.item;
        java.lang.Object[] objArray20 = lista6.item;
        lista0.item = objArray20;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        int int25 = lista22.ultimo;
        int int26 = lista22.pos;
        lista22.primeiro = 'a';
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        lista29.ultimo = '4';
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista36.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 1L, 0.0f };
        lista39.item = objArray43;
        lista36.item = objArray43;
        lista34.item = objArray43;
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        lista47.imprime();
        lista47.primeiro = '4';
        lista34.insere((java.lang.Object) lista47);
        lista29.insere((java.lang.Object) lista47);
        lista22.insere((java.lang.Object) lista47);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        lista57.imprime();
        ds.Lista lista60 = new ds.Lista();
        lista60.imprime();
        java.lang.Object[] objArray64 = new java.lang.Object[] { 1L, 0.0f };
        lista60.item = objArray64;
        lista57.item = objArray64;
        lista55.item = objArray64;
        int int68 = lista55.pos;
        lista55.pos = 11;
        java.lang.Object[] objArray71 = lista55.item;
        java.lang.Object[] objArray72 = lista55.item;
        ds.Lista lista73 = new ds.Lista();
        java.lang.Object[] objArray74 = lista73.item;
        boolean boolean75 = lista73.vazia();
        int int76 = lista73.ultimo;
        java.lang.Object[] objArray77 = lista73.item;
        lista73.ultimo = ' ';
        java.lang.Object[] objArray80 = lista73.item;
        java.lang.Object[] objArray81 = lista73.item;
        lista55.insere((java.lang.Object) lista73);
        lista47.insere((java.lang.Object) lista73);
        lista0.insere((java.lang.Object) lista47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.primeiro = '4';
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        boolean boolean31 = lista27.vazia();
        lista22.insere((java.lang.Object) lista27);
        lista27.imprime();
        lista27.pos = 'a';
        lista0.insere((java.lang.Object) lista27);
        int int37 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        int int27 = lista25.pos;
        lista25.primeiro = 100;
        lista25.ultimo = (short) 10;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        lista32.primeiro = '4';
        lista32.pos = (-1);
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        lista39.primeiro = '4';
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista44.imprime();
        int int47 = lista44.ultimo;
        boolean boolean48 = lista44.vazia();
        lista39.insere((java.lang.Object) lista44);
        java.lang.Object[] objArray50 = lista44.item;
        lista32.item = objArray50;
        lista25.item = objArray50;
        lista0.item = objArray50;
        java.lang.Class<?> wildcardClass54 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        int int19 = lista16.ultimo;
        lista16.imprime();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 10;
        lista21.insere((java.lang.Object) lista23);
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.primeiro;
        int int31 = lista27.primeiro;
        lista23.insere((java.lang.Object) int31);
        java.lang.Object[] objArray33 = lista23.item;
        lista16.item = objArray33;
        lista16.primeiro = ' ';
        int int37 = lista16.primeiro;
        boolean boolean38 = lista16.vazia();
        lista0.insere((java.lang.Object) boolean38);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        boolean boolean42 = lista40.vazia();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        lista43.imprime();
        int int46 = lista43.primeiro;
        lista43.pos = 100;
        java.lang.Object[] objArray49 = lista43.item;
        lista40.item = objArray49;
        lista40.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        int int10 = lista6.ultimo;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista6.item = objArray12;
        lista6.ultimo = (-1);
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        lista6.pos = 'a';
        lista6.imprime();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 10;
        lista21.insere((java.lang.Object) lista23);
        int int27 = lista21.primeiro;
        lista21.ultimo = 10;
        lista21.primeiro = (byte) 0;
        int int32 = lista21.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista6.insere((java.lang.Object) lista21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.ultimo;
        int int26 = lista18.primeiro;
        lista18.imprime();
        int int28 = lista18.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        lista0.ultimo = (short) 10;
        lista0.primeiro = (byte) 100;
        int int29 = lista0.primeiro;
        int int30 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        lista0.pos = 'a';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        lista15.primeiro = '4';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        boolean boolean24 = lista20.vazia();
        lista15.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray26 = lista20.item;
        java.lang.Object[] objArray27 = lista20.item;
        boolean boolean28 = lista20.vazia();
        lista20.pos = (-1);
        lista0.insere((java.lang.Object) lista20);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, 0.0f };
        lista19.item = objArray23;
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista12.item = objArray23;
        int int28 = lista12.ultimo;
        lista12.pos = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray32 = lista0.item;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        ds.Lista lista35 = new ds.Lista();
        lista35.ultimo = 10;
        lista33.insere((java.lang.Object) lista35);
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        int int42 = lista39.primeiro;
        int int43 = lista39.primeiro;
        lista35.insere((java.lang.Object) int43);
        java.lang.Object[] objArray45 = lista35.item;
        java.lang.Object[] objArray46 = lista35.item;
        java.lang.Object[] objArray47 = lista35.item;
        lista35.pos = (short) 1;
        java.lang.Object[] objArray50 = lista35.item;
        lista0.item = objArray50;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        lista0.pos = (short) 0;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        lista0.pos = (short) 0;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        int int5 = lista0.ultimo;
        lista0.primeiro = 52;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista9.imprime();
        int int12 = lista9.primeiro;
        lista9.pos = 100;
        java.lang.Object[] objArray15 = lista9.item;
        lista9.imprime();
        lista9.pos = (short) 0;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 10;
        lista19.insere((java.lang.Object) lista21);
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        int int28 = lista25.primeiro;
        int int29 = lista25.primeiro;
        lista21.insere((java.lang.Object) int29);
        java.lang.Object[] objArray31 = lista21.item;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        int int35 = lista32.ultimo;
        lista32.imprime();
        lista21.insere((java.lang.Object) lista32);
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista38.imprime();
        int int41 = lista38.ultimo;
        lista38.imprime();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        lista45.ultimo = 10;
        lista43.insere((java.lang.Object) lista45);
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        lista49.imprime();
        int int52 = lista49.primeiro;
        int int53 = lista49.primeiro;
        lista45.insere((java.lang.Object) int53);
        java.lang.Object[] objArray55 = lista45.item;
        lista38.item = objArray55;
        lista38.primeiro = ' ';
        int int59 = lista38.pos;
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        lista60.imprime();
        int int63 = lista60.ultimo;
        int int64 = lista60.pos;
        ds.Lista lista65 = new ds.Lista();
        java.lang.Object[] objArray66 = lista65.item;
        lista65.imprime();
        lista65.ultimo = '4';
        java.lang.Object[] objArray70 = lista65.item;
        lista60.item = objArray70;
        int int72 = lista60.primeiro;
        int int73 = lista60.primeiro;
        int int74 = lista60.ultimo;
        lista60.primeiro = 32;
        lista60.imprime();
        java.lang.Object[] objArray78 = lista60.item;
        lista38.item = objArray78;
        lista21.item = objArray78;
        lista9.item = objArray78;
        lista0.item = objArray78;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        lista0.ultimo = 1;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        int int19 = lista7.pos;
        int int20 = lista7.pos;
        lista7.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        int int25 = lista0.pos;
        boolean boolean26 = lista0.vazia();
        int int27 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.ultimo;
        java.lang.Object[] objArray9 = lista5.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        lista10.pos = 100;
        int int16 = lista10.pos;
        int int17 = lista10.ultimo;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        int int22 = lista18.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1L, 0.0f };
        lista23.item = objArray27;
        lista18.insere((java.lang.Object) objArray27);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.ultimo = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista37.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, 0.0f };
        lista40.item = objArray44;
        lista37.item = objArray44;
        lista35.item = objArray44;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        lista48.primeiro = '4';
        lista35.insere((java.lang.Object) lista48);
        lista30.insere((java.lang.Object) lista48);
        java.lang.Object[] objArray55 = lista48.item;
        lista18.insere((java.lang.Object) objArray55);
        lista10.item = objArray55;
        lista5.item = objArray55;
        int int59 = lista5.pos;
        lista0.insere((java.lang.Object) lista5);
        lista0.primeiro = 12;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        lista2.pos = (short) 10;
        int int17 = lista2.ultimo;
        int int18 = lista2.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        lista0.pos = 0;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        int int12 = lista8.ultimo;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista8.item = objArray14;
        java.lang.Object[] objArray16 = lista8.item;
        lista8.primeiro = (-1);
        lista0.insere((java.lang.Object) lista8);
        boolean boolean20 = lista8.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        int int19 = lista13.pos;
        lista13.ultimo = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista0.ultimo;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1L, 0.0f };
        lista25.item = objArray29;
        lista22.item = objArray29;
        lista20.item = objArray29;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista33.imprime();
        lista33.primeiro = '4';
        lista20.insere((java.lang.Object) lista33);
        java.lang.Object[] objArray39 = lista20.item;
        lista0.item = objArray39;
        int int41 = lista0.pos;
        int int42 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.primeiro = '#';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (short) 0;
        lista0.imprime();
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.pos = 0;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.ultimo;
        boolean boolean19 = lista15.vazia();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        lista20.ultimo = '4';
        lista15.insere((java.lang.Object) '4');
        int int26 = lista15.primeiro;
        int int27 = lista15.ultimo;
        lista15.pos = 'a';
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.primeiro = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        int int38 = lista35.ultimo;
        boolean boolean39 = lista35.vazia();
        lista30.insere((java.lang.Object) lista35);
        java.lang.Object[] objArray41 = lista35.item;
        lista35.pos = 0;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista44.imprime();
        int int47 = lista44.primeiro;
        lista44.pos = 100;
        java.lang.Object[] objArray50 = lista44.item;
        lista35.insere((java.lang.Object) objArray50);
        lista15.item = objArray50;
        lista0.item = objArray50;
        int int54 = lista0.ultimo;
        int int55 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.pos = 0;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        int int5 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.ultimo = (short) 10;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.primeiro;
        lista8.pos = 100;
        java.lang.Object[] objArray14 = lista8.item;
        lista8.imprime();
        lista8.pos = (short) 0;
        lista8.imprime();
        int int19 = lista8.pos;
        lista8.primeiro = '4';
        lista0.insere((java.lang.Object) '4');
        boolean boolean23 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (short) 1;
        lista0.pos = (byte) -1;
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        java.lang.Object[] objArray18 = lista0.item;
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.pos;
        lista0.primeiro = (byte) 100;
        lista0.pos = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        int int25 = lista22.ultimo;
        int int26 = lista22.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        lista27.ultimo = '4';
        java.lang.Object[] objArray32 = lista27.item;
        lista22.item = objArray32;
        int int34 = lista22.primeiro;
        int int35 = lista22.primeiro;
        int int36 = lista22.ultimo;
        lista22.primeiro = 32;
        lista22.imprime();
        java.lang.Object[] objArray40 = lista22.item;
        lista0.item = objArray40;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        lista42.imprime();
        int int45 = lista42.ultimo;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.ultimo = 10;
        lista46.insere((java.lang.Object) lista48);
        int int52 = lista46.primeiro;
        java.lang.Object[] objArray53 = lista46.item;
        lista42.item = objArray53;
        int int55 = lista42.ultimo;
        lista42.imprime();
        int int57 = lista42.ultimo;
        lista0.insere((java.lang.Object) lista42);
        lista42.imprime();
        lista42.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        boolean boolean14 = lista2.vazia();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.ultimo;
        int int19 = lista15.pos;
        lista15.primeiro = 'a';
        java.lang.Object[] objArray22 = lista15.item;
        lista2.item = objArray22;
        int int24 = lista2.ultimo;
        lista2.ultimo = (short) 10;
        lista2.ultimo = (short) 100;
        lista2.primeiro = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        int int8 = lista0.primeiro;
        boolean boolean9 = lista0.vazia();
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        int int16 = lista0.ultimo;
        int int17 = lista0.ultimo;
        int int18 = lista0.primeiro;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1L, 0.0f };
        lista24.item = objArray28;
        lista21.item = objArray28;
        lista19.item = objArray28;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        lista32.primeiro = '4';
        lista19.insere((java.lang.Object) lista32);
        int int38 = lista32.primeiro;
        boolean boolean39 = lista32.vazia();
        int int40 = lista32.primeiro;
        lista32.pos = (byte) 100;
        lista0.insere((java.lang.Object) lista32);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        lista0.primeiro = (byte) 0;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 10;
        lista18.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista24.imprime();
        int int27 = lista24.primeiro;
        int int28 = lista24.primeiro;
        lista20.insere((java.lang.Object) int28);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 10;
        lista30.insere((java.lang.Object) lista32);
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista36.imprime();
        int int39 = lista36.primeiro;
        int int40 = lista36.primeiro;
        lista32.insere((java.lang.Object) int40);
        lista32.pos = 0;
        boolean boolean44 = lista32.vazia();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista45.imprime();
        int int48 = lista45.ultimo;
        int int49 = lista45.pos;
        lista45.primeiro = 'a';
        java.lang.Object[] objArray52 = lista45.item;
        lista32.item = objArray52;
        lista20.item = objArray52;
        lista0.item = objArray52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        lista0.pos = 'a';
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        lista16.primeiro = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        int int24 = lista21.ultimo;
        boolean boolean25 = lista21.vazia();
        lista16.insere((java.lang.Object) lista21);
        lista21.ultimo = 0;
        java.lang.Object[] objArray29 = lista21.item;
        lista0.item = objArray29;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.pos = 'a';
        int int16 = lista2.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.ultimo;
        int int21 = lista17.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.ultimo = '4';
        java.lang.Object[] objArray27 = lista22.item;
        lista17.item = objArray27;
        int int29 = lista17.primeiro;
        int int30 = lista17.primeiro;
        int int31 = lista17.ultimo;
        lista17.primeiro = 32;
        lista17.imprime();
        java.lang.Object[] objArray35 = lista17.item;
        lista17.imprime();
        lista2.insere((java.lang.Object) lista17);
        java.lang.Object[] objArray38 = lista17.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 10;
        lista7.insere((java.lang.Object) lista9);
        lista9.primeiro = '4';
        lista0.insere((java.lang.Object) lista9);
        lista9.imprime();
        lista9.primeiro = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista19.primeiro;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.item = objArray26;
        lista0.primeiro = (byte) 100;
        int int30 = lista0.primeiro;
        boolean boolean31 = lista0.vazia();
        int int32 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        int int20 = lista13.pos;
        lista13.pos = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        lista25.ultimo = 10;
        lista23.insere((java.lang.Object) lista25);
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.ultimo;
        lista29.ultimo = (byte) 10;
        lista29.primeiro = 100;
        lista25.insere((java.lang.Object) 100);
        java.lang.Object[] objArray38 = lista25.item;
        lista13.insere((java.lang.Object) lista25);
        int int40 = lista13.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (byte) 0;
        lista0.primeiro = 'a';
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.insere((java.lang.Object) 1L);
        lista0.imprime();
        lista0.pos = '4';
        lista0.primeiro = (short) 100;
        int int14 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        lista13.ultimo = (byte) 1;
        int int23 = lista13.primeiro;
        lista13.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 10;
        lista7.insere((java.lang.Object) lista9);
        int int13 = lista7.primeiro;
        java.lang.Object[] objArray14 = lista7.item;
        lista7.pos = ' ';
        lista7.primeiro = 'a';
        java.lang.Object[] objArray19 = lista7.item;
        lista0.item = objArray19;
        int int21 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        int int19 = lista7.pos;
        int int20 = lista7.pos;
        lista7.pos = '4';
        lista7.ultimo = (byte) 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        int int10 = lista6.pos;
        lista6.primeiro = 'a';
        lista0.insere((java.lang.Object) 'a');
        int int14 = lista0.ultimo;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.ultimo;
        lista18.pos = '#';
        int int28 = lista18.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        boolean boolean31 = lista29.vazia();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        int int35 = lista32.primeiro;
        lista32.pos = 100;
        java.lang.Object[] objArray38 = lista32.item;
        lista29.item = objArray38;
        lista18.item = objArray38;
        int int41 = lista18.pos;
        lista18.pos = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.imprime();
        lista0.pos = 0;
        int int18 = lista0.pos;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.primeiro;
        lista5.pos = 100;
        java.lang.Object[] objArray11 = lista5.item;
        int int12 = lista5.pos;
        int int13 = lista5.ultimo;
        lista5.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        lista15.primeiro = '4';
        lista15.pos = (-1);
        lista15.insere((java.lang.Object) 1L);
        lista15.imprime();
        java.lang.Object[] objArray25 = lista15.item;
        lista5.item = objArray25;
        java.lang.Object[] objArray27 = lista5.item;
        lista0.item = objArray27;
        int int29 = lista0.ultimo;
        lista0.primeiro = 97;
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.pos = 100;
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.insere((java.lang.Object) 100);
        lista5.primeiro = '4';
        java.lang.Object[] objArray15 = lista5.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 10;
        lista7.insere((java.lang.Object) lista9);
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.primeiro;
        int int17 = lista13.primeiro;
        lista9.insere((java.lang.Object) int17);
        lista9.pos = 0;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        int int24 = lista21.primeiro;
        lista21.pos = 100;
        java.lang.Object[] objArray27 = lista21.item;
        int int28 = lista21.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista33.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 1L, 0.0f };
        lista36.item = objArray40;
        lista33.item = objArray40;
        lista31.item = objArray40;
        lista29.item = objArray40;
        lista21.item = objArray40;
        int int46 = lista21.pos;
        boolean boolean47 = lista21.vazia();
        lista9.insere((java.lang.Object) boolean47);
        int int49 = lista9.pos;
        int int50 = lista9.ultimo;
        int int51 = lista9.pos;
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        int int54 = lista52.pos;
        java.lang.Object[] objArray55 = lista52.item;
        lista52.primeiro = (byte) -1;
        java.lang.Object[] objArray58 = lista52.item;
        lista9.item = objArray58;
        lista0.item = objArray58;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 12 + "'", int50 == 12);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 10;
        lista19.insere((java.lang.Object) lista21);
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        int int28 = lista25.primeiro;
        int int29 = lista25.primeiro;
        lista21.insere((java.lang.Object) int29);
        java.lang.Object[] objArray31 = lista21.item;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        int int35 = lista32.ultimo;
        lista32.imprime();
        lista21.insere((java.lang.Object) lista32);
        int int38 = lista32.primeiro;
        int int39 = lista32.pos;
        lista32.pos = (byte) 1;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        ds.Lista lista44 = new ds.Lista();
        lista44.ultimo = 10;
        lista42.insere((java.lang.Object) lista44);
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        int int51 = lista48.ultimo;
        lista48.ultimo = (byte) 10;
        lista48.primeiro = 100;
        lista44.insere((java.lang.Object) 100);
        java.lang.Object[] objArray57 = lista44.item;
        lista32.insere((java.lang.Object) lista44);
        lista0.insere((java.lang.Object) lista32);
        lista0.primeiro = 53;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.pos = 'a';
        int int16 = lista2.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        boolean boolean19 = lista17.vazia();
        java.lang.Object[] objArray20 = lista17.item;
        java.lang.Object[] objArray21 = lista17.item;
        lista2.insere((java.lang.Object) lista17);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        lista25.ultimo = 10;
        lista23.insere((java.lang.Object) lista25);
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.primeiro;
        int int33 = lista29.primeiro;
        lista25.insere((java.lang.Object) int33);
        java.lang.Object[] objArray35 = lista25.item;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista36.imprime();
        int int39 = lista36.ultimo;
        lista36.imprime();
        lista25.insere((java.lang.Object) lista36);
        int int42 = lista36.primeiro;
        int int43 = lista36.pos;
        lista36.pos = (byte) 1;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.ultimo = 10;
        lista46.insere((java.lang.Object) lista48);
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        lista52.imprime();
        int int55 = lista52.ultimo;
        lista52.ultimo = (byte) 10;
        lista52.primeiro = 100;
        lista48.insere((java.lang.Object) 100);
        java.lang.Object[] objArray61 = lista48.item;
        lista36.insere((java.lang.Object) lista48);
        lista17.insere((java.lang.Object) lista36);
        boolean boolean64 = lista17.vazia();
        java.lang.Class<?> wildcardClass65 = lista17.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        lista0.pos = (short) 0;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.insere((java.lang.Object) 1L);
        lista0.imprime();
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        int int7 = lista0.pos;
        lista0.ultimo = 97;
        lista0.primeiro = 'a';
        boolean boolean12 = lista0.vazia();
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        boolean boolean14 = lista2.vazia();
        java.lang.Class<?> wildcardClass15 = lista2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        int int16 = lista0.ultimo;
        int int17 = lista0.ultimo;
        int int18 = lista0.primeiro;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.ultimo = '4';
        java.lang.Object[] objArray24 = lista19.item;
        lista19.primeiro = '4';
        int int27 = lista19.pos;
        java.lang.Object[] objArray28 = lista19.item;
        lista0.insere((java.lang.Object) objArray28);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        lista0.primeiro = (short) 100;
        boolean boolean21 = lista0.vazia();
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 10;
        lista12.insere((java.lang.Object) lista14);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.primeiro;
        int int22 = lista18.primeiro;
        lista14.insere((java.lang.Object) int22);
        lista14.pos = 0;
        boolean boolean26 = lista14.vazia();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        int int31 = lista27.pos;
        lista27.primeiro = 'a';
        java.lang.Object[] objArray34 = lista27.item;
        lista14.item = objArray34;
        lista2.item = objArray34;
        java.lang.Object obj37 = null;
        lista2.insere(obj37);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.ultimo = (short) 10;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.primeiro;
        lista8.pos = 100;
        java.lang.Object[] objArray14 = lista8.item;
        lista8.imprime();
        lista8.pos = (short) 0;
        lista8.imprime();
        int int19 = lista8.pos;
        lista8.primeiro = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.primeiro = '4';
        lista10.pos = (-1);
        lista10.insere((java.lang.Object) 1L);
        lista10.primeiro = (short) 10;
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray19 = lista0.item;
        lista0.ultimo = (short) 10;
        lista0.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Class<?> wildcardClass24 = lista23.getClass();
        lista2.insere((java.lang.Object) lista23);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.ultimo = (short) 10;
        int int7 = lista0.primeiro;
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista9.imprime();
        lista9.primeiro = '4';
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.ultimo;
        boolean boolean18 = lista14.vazia();
        lista9.insere((java.lang.Object) lista14);
        lista14.insere((java.lang.Object) 100);
        java.lang.Object[] objArray22 = lista14.item;
        lista0.item = objArray22;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.imprime();
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 1L, 0.0f };
        lista17.item = objArray21;
        lista14.item = objArray21;
        lista12.item = objArray21;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        lista25.primeiro = '4';
        lista12.insere((java.lang.Object) lista25);
        int int31 = lista25.primeiro;
        boolean boolean32 = lista25.vazia();
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        lista33.pos = 'a';
        int int37 = lista33.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista38.imprime();
        lista38.ultimo = '4';
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista45.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.imprime();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 1L, 0.0f };
        lista48.item = objArray52;
        lista45.item = objArray52;
        lista43.item = objArray52;
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        lista56.imprime();
        lista56.primeiro = '4';
        lista43.insere((java.lang.Object) lista56);
        lista38.insere((java.lang.Object) lista56);
        java.lang.Object[] objArray63 = lista56.item;
        lista33.insere((java.lang.Object) objArray63);
        lista25.item = objArray63;
        lista0.item = objArray63;
        java.lang.Class<?> wildcardClass67 = objArray63.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.ultimo;
        java.lang.Object[] objArray9 = lista5.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        lista10.pos = 100;
        int int16 = lista10.pos;
        int int17 = lista10.ultimo;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        int int22 = lista18.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1L, 0.0f };
        lista23.item = objArray27;
        lista18.insere((java.lang.Object) objArray27);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.ultimo = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista37.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, 0.0f };
        lista40.item = objArray44;
        lista37.item = objArray44;
        lista35.item = objArray44;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        lista48.primeiro = '4';
        lista35.insere((java.lang.Object) lista48);
        lista30.insere((java.lang.Object) lista48);
        java.lang.Object[] objArray55 = lista48.item;
        lista18.insere((java.lang.Object) objArray55);
        lista10.item = objArray55;
        lista5.item = objArray55;
        lista5.pos = (short) -1;
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        ds.Lista lista63 = new ds.Lista();
        lista63.ultimo = 10;
        lista61.insere((java.lang.Object) lista63);
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray68 = lista67.item;
        lista67.imprime();
        int int70 = lista67.ultimo;
        lista67.ultimo = (byte) 10;
        lista67.primeiro = 100;
        lista63.insere((java.lang.Object) 100);
        java.lang.Object[] objArray76 = lista63.item;
        java.lang.Object[] objArray77 = lista63.item;
        lista5.insere((java.lang.Object) objArray77);
        lista0.item = objArray77;
        ds.Lista lista80 = new ds.Lista();
        java.lang.Object[] objArray81 = lista80.item;
        lista80.imprime();
        lista80.primeiro = '4';
        lista80.pos = (-1);
        lista80.insere((java.lang.Object) 1L);
        lista80.imprime();
        java.lang.Object[] objArray90 = lista80.item;
        lista0.item = objArray90;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray90);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista6.primeiro;
        int int26 = lista6.ultimo;
        lista0.insere((java.lang.Object) lista6);
        lista6.pos = (short) -1;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.primeiro = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        int int38 = lista35.ultimo;
        boolean boolean39 = lista35.vazia();
        lista30.insere((java.lang.Object) lista35);
        lista35.ultimo = 0;
        java.lang.Object[] objArray43 = lista35.item;
        lista6.item = objArray43;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        int int19 = lista7.pos;
        int int20 = lista7.pos;
        lista7.pos = '4';
        lista7.ultimo = (short) 10;
        java.lang.Class<?> wildcardClass25 = lista7.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        lista13.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int13 = lista0.pos;
        lista0.pos = 11;
        int int16 = lista0.primeiro;
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test802");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.imprime();
        int int16 = lista0.primeiro;
        lista0.primeiro = 52;
        lista0.pos = (byte) 1;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        boolean boolean23 = lista21.vazia();
        int int24 = lista21.ultimo;
        java.lang.Object[] objArray25 = lista21.item;
        lista21.ultimo = ' ';
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.ultimo;
        java.lang.Object[] objArray32 = lista28.item;
        lista21.item = objArray32;
        lista0.item = objArray32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test803");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        int int7 = lista5.primeiro;
        int int8 = lista5.primeiro;
        java.lang.Object[] objArray9 = lista5.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        int int14 = lista10.primeiro;
        lista10.pos = (short) -1;
        java.lang.Object[] objArray17 = lista10.item;
        lista5.item = objArray17;
        lista5.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 10;
        lista20.ultimo = (short) -1;
        int int25 = lista20.ultimo;
        lista20.imprime();
        lista20.primeiro = (byte) -1;
        lista5.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista5.item;
        lista0.item = objArray30;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test804");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        java.lang.Object[] objArray41 = lista38.item;
        lista38.primeiro = (byte) -1;
        java.lang.Object[] objArray44 = lista38.item;
        lista0.item = objArray44;
        java.lang.Object[] objArray46 = lista0.item;
        int int47 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test805");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        lista0.pos = 'a';
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test806");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista7.ultimo = (short) -1;
        lista7.ultimo = (byte) 1;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        java.lang.Object[] objArray17 = lista14.item;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 1L, 0.0f };
        lista18.item = objArray22;
        lista14.item = objArray22;
        lista7.insere((java.lang.Object) lista14);
        java.lang.Object[] objArray26 = lista14.item;
        lista0.item = objArray26;
        lista0.pos = 'a';
        int int30 = lista0.primeiro;
        boolean boolean31 = lista0.vazia();
        boolean boolean32 = lista0.vazia();
        boolean boolean33 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test807");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        boolean boolean24 = lista8.vazia();
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 10;
        lista25.insere((java.lang.Object) lista27);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.primeiro;
        int int35 = lista31.primeiro;
        lista27.insere((java.lang.Object) int35);
        java.lang.Object[] objArray37 = lista27.item;
        java.lang.Object[] objArray38 = lista27.item;
        java.lang.Object[] objArray39 = lista27.item;
        lista8.item = objArray39;
        lista0.item = objArray39;
        lista0.imprime();
        int int43 = lista0.pos;
        int int44 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test808");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object obj6 = null;
        lista0.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        lista8.ultimo = 0;
        lista8.ultimo = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test809");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test810");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        lista13.pos = (short) 0;
        lista13.ultimo = 97;
        int int23 = lista13.ultimo;
        int int24 = lista13.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test811");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        lista0.insere((java.lang.Object) "");
        int int9 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test812");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        int int11 = lista5.pos;
        lista5.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test813");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        int int12 = lista8.ultimo;
        int int13 = lista8.pos;
        lista8.pos = 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 10;
        lista16.ultimo = (short) -1;
        lista16.ultimo = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        java.lang.Object[] objArray26 = lista23.item;
        lista16.item = objArray26;
        lista8.item = objArray26;
        lista0.item = objArray26;
        lista0.imprime();
        java.lang.Object[] objArray31 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test814");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        lista0.ultimo = 1;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test815");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        boolean boolean14 = lista5.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test816");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        int int25 = lista22.ultimo;
        int int26 = lista22.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        lista27.ultimo = '4';
        java.lang.Object[] objArray32 = lista27.item;
        lista22.item = objArray32;
        int int34 = lista22.primeiro;
        int int35 = lista22.primeiro;
        int int36 = lista22.ultimo;
        lista22.primeiro = 32;
        lista22.imprime();
        java.lang.Object[] objArray40 = lista22.item;
        lista0.item = objArray40;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        lista42.imprime();
        int int45 = lista42.ultimo;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.ultimo = 10;
        lista46.insere((java.lang.Object) lista48);
        int int52 = lista46.primeiro;
        java.lang.Object[] objArray53 = lista46.item;
        lista42.item = objArray53;
        int int55 = lista42.ultimo;
        lista42.imprime();
        int int57 = lista42.ultimo;
        lista0.insere((java.lang.Object) lista42);
        lista42.imprime();
        boolean boolean60 = lista42.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test817");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 10;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        int int15 = lista13.pos;
        lista13.primeiro = 100;
        java.lang.Class<?> wildcardClass18 = lista13.getClass();
        lista5.insere((java.lang.Object) wildcardClass18);
        int int20 = lista5.pos;
        java.lang.Class<?> wildcardClass21 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test818");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        lista0.pos = 'a';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        lista15.primeiro = '4';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        boolean boolean24 = lista20.vazia();
        lista15.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray26 = lista20.item;
        lista20.pos = 0;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.primeiro;
        lista29.pos = 100;
        java.lang.Object[] objArray35 = lista29.item;
        lista20.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        int int38 = lista0.pos;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        int int42 = lista39.ultimo;
        int int43 = lista39.ultimo;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista39.item = objArray45;
        int int47 = lista39.primeiro;
        java.lang.Object[] objArray48 = lista39.item;
        lista0.item = objArray48;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test819");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        int int12 = lista8.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.ultimo = '4';
        java.lang.Object[] objArray18 = lista13.item;
        lista8.item = objArray18;
        lista0.insere((java.lang.Object) lista8);
        lista8.imprime();
        lista8.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test820");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        lista13.pos = (short) 0;
        lista13.ultimo = 97;
        int int23 = lista13.ultimo;
        lista13.ultimo = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test821");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test822");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        lista0.pos = (short) 0;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        lista11.primeiro = '4';
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        int int19 = lista16.ultimo;
        boolean boolean20 = lista16.vazia();
        lista11.insere((java.lang.Object) lista16);
        lista16.ultimo = 0;
        lista16.imprime();
        lista16.primeiro = (byte) 1;
        int int27 = lista16.ultimo;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        int int30 = lista28.pos;
        lista28.primeiro = 100;
        java.lang.Object[] objArray33 = lista28.item;
        lista16.insere((java.lang.Object) objArray33);
        lista0.item = objArray33;
        lista0.primeiro = 11;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test823");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        lista6.primeiro = '4';
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.ultimo;
        boolean boolean15 = lista11.vazia();
        lista6.insere((java.lang.Object) lista11);
        lista11.ultimo = 0;
        java.lang.Object[] objArray19 = lista11.item;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray22 = lista20.item;
        lista20.ultimo = (byte) 1;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        int int28 = lista25.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        int int31 = lista29.pos;
        lista29.primeiro = 100;
        java.lang.Object[] objArray34 = lista29.item;
        lista25.item = objArray34;
        lista20.item = objArray34;
        int int37 = lista20.primeiro;
        java.lang.Object[] objArray38 = lista20.item;
        lista11.item = objArray38;
        lista0.item = objArray38;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test824");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test825");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.pos = (byte) 10;
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        lista0.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test826");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = (byte) 0;
        lista5.ultimo = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test827");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 100;
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test828");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        boolean boolean23 = lista2.vazia();
        int int24 = lista2.ultimo;
        int int25 = lista2.primeiro;
        lista2.primeiro = ' ';
        lista2.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        int int31 = lista29.primeiro;
        int int32 = lista29.primeiro;
        java.lang.Object[] objArray33 = lista29.item;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista34.imprime();
        lista34.primeiro = '4';
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        int int42 = lista39.ultimo;
        boolean boolean43 = lista39.vazia();
        lista34.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray45 = lista39.item;
        lista39.pos = 0;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        int int51 = lista48.primeiro;
        lista48.pos = 100;
        java.lang.Object[] objArray54 = lista48.item;
        lista39.insere((java.lang.Object) objArray54);
        lista29.item = objArray54;
        java.lang.Object[] objArray57 = lista29.item;
        lista2.item = objArray57;
        lista2.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test829");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        lista42.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 1L, 0.0f };
        lista45.item = objArray49;
        lista42.item = objArray49;
        lista40.item = objArray49;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        lista53.imprime();
        lista53.primeiro = '4';
        lista40.insere((java.lang.Object) lista53);
        java.lang.Object[] objArray59 = lista40.item;
        java.lang.Object[] objArray60 = lista40.item;
        int int61 = lista40.pos;
        lista0.insere((java.lang.Object) lista40);
        int int63 = lista40.ultimo;
        lista40.pos = (byte) 1;
        lista40.ultimo = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test830");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        lista0.primeiro = 'a';
        int int22 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test831");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        boolean boolean7 = lista0.vazia();
        lista0.pos = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test832");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        boolean boolean14 = lista5.vazia();
        lista5.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test833");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1L, 0.0f };
        lista31.item = objArray35;
        lista28.item = objArray35;
        lista26.item = objArray35;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        lista39.primeiro = '4';
        lista26.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray45 = lista26.item;
        lista18.item = objArray45;
        int int47 = lista18.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test834");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        int int10 = lista0.pos;
        int int11 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test835");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        int int11 = lista9.pos;
        lista9.primeiro = 100;
        java.lang.Object[] objArray14 = lista9.item;
        lista5.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        int int18 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test836");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        int int19 = lista7.pos;
        int int20 = lista7.pos;
        lista7.pos = '4';
        lista7.ultimo = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        int int28 = lista25.ultimo;
        boolean boolean29 = lista25.vazia();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.ultimo = '4';
        lista25.insere((java.lang.Object) '4');
        int int36 = lista25.primeiro;
        int int37 = lista25.ultimo;
        lista25.pos = 'a';
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista40.imprime();
        lista40.primeiro = '4';
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista45.imprime();
        int int48 = lista45.ultimo;
        boolean boolean49 = lista45.vazia();
        lista40.insere((java.lang.Object) lista45);
        java.lang.Object[] objArray51 = lista45.item;
        lista45.pos = 0;
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        lista54.imprime();
        int int57 = lista54.primeiro;
        lista54.pos = 100;
        java.lang.Object[] objArray60 = lista54.item;
        lista45.insere((java.lang.Object) objArray60);
        lista25.item = objArray60;
        int int63 = lista25.pos;
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        ds.Lista lista66 = new ds.Lista();
        lista66.ultimo = 10;
        lista64.insere((java.lang.Object) lista66);
        ds.Lista lista70 = new ds.Lista();
        java.lang.Object[] objArray71 = lista70.item;
        lista70.imprime();
        int int73 = lista70.primeiro;
        int int74 = lista70.primeiro;
        lista66.insere((java.lang.Object) int74);
        java.lang.Object[] objArray76 = lista66.item;
        java.lang.Object[] objArray77 = lista66.item;
        java.lang.Object[] objArray78 = lista66.item;
        ds.Lista lista79 = new ds.Lista();
        java.lang.Object[] objArray80 = lista79.item;
        lista79.imprime();
        int int82 = lista79.primeiro;
        lista79.pos = 100;
        java.lang.Object[] objArray85 = lista79.item;
        lista66.item = objArray85;
        lista25.item = objArray85;
        lista7.item = objArray85;
        java.lang.Class<?> wildcardClass89 = objArray85.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test837");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 0;
        lista5.pos = 'a';
        lista5.pos = 1;
        lista5.primeiro = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test838");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = ' ';
        lista0.ultimo = (byte) 100;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = (short) 1;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test839");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        lista5.pos = 'a';
        java.lang.Object[] objArray14 = lista5.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test840");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = '#';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = 10;
        lista20.insere((java.lang.Object) lista22);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.ultimo;
        lista26.ultimo = (byte) 10;
        lista26.primeiro = 100;
        lista22.insere((java.lang.Object) 100);
        java.lang.Object[] objArray35 = lista22.item;
        lista0.item = objArray35;
        int int37 = lista0.primeiro;
        int int38 = lista0.pos;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista41.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 1L, 0.0f };
        lista44.item = objArray48;
        lista41.item = objArray48;
        lista39.item = objArray48;
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        lista52.imprime();
        lista52.primeiro = '4';
        lista39.insere((java.lang.Object) lista52);
        java.lang.Object[] objArray58 = lista39.item;
        java.lang.Object[] objArray59 = lista39.item;
        lista0.item = objArray59;
        boolean boolean61 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test841");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        lista0.pos = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test842");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.ultimo;
        java.lang.Object[] objArray17 = lista13.item;
        lista0.item = objArray17;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test843");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 100;
        lista0.pos = (short) 1;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.ultimo = '4';
        java.lang.Object[] objArray15 = lista10.item;
        lista10.primeiro = '4';
        int int18 = lista10.pos;
        java.lang.Object[] objArray19 = lista10.item;
        lista0.item = objArray19;
        java.lang.Object[] objArray21 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test844");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.ultimo = (-1);
        int int13 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test845");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        lista0.primeiro = '#';
        int int20 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test846");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        int int21 = lista13.primeiro;
        lista13.pos = (byte) 100;
        boolean boolean24 = lista13.vazia();
        int int25 = lista13.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test847");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test848");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        lista0.pos = (short) 0;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test849");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        lista6.ultimo = (byte) 10;
        lista6.primeiro = 100;
        lista2.insere((java.lang.Object) 100);
        java.lang.Object[] objArray15 = lista2.item;
        java.lang.Object[] objArray16 = lista2.item;
        boolean boolean17 = lista2.vazia();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 10;
        lista18.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista24.imprime();
        int int27 = lista24.primeiro;
        int int28 = lista24.primeiro;
        lista20.insere((java.lang.Object) int28);
        lista20.pos = 0;
        boolean boolean32 = lista20.vazia();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista33.imprime();
        int int36 = lista33.ultimo;
        int int37 = lista33.pos;
        lista33.primeiro = 'a';
        java.lang.Object[] objArray40 = lista33.item;
        lista20.item = objArray40;
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        int int44 = lista42.primeiro;
        int int45 = lista42.primeiro;
        java.lang.Object[] objArray46 = lista42.item;
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        lista47.imprime();
        int int50 = lista47.primeiro;
        int int51 = lista47.primeiro;
        lista47.pos = (short) -1;
        java.lang.Object[] objArray54 = lista47.item;
        lista42.item = objArray54;
        lista42.imprime();
        ds.Lista lista57 = new ds.Lista();
        lista57.ultimo = 10;
        lista57.ultimo = (short) -1;
        int int62 = lista57.ultimo;
        lista57.imprime();
        lista57.primeiro = (byte) -1;
        lista42.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray67 = lista42.item;
        lista20.item = objArray67;
        lista20.ultimo = 'a';
        lista2.insere((java.lang.Object) lista20);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test850");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista9.imprime();
        int int12 = lista9.ultimo;
        boolean boolean13 = lista9.vazia();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        lista14.ultimo = '4';
        lista9.insere((java.lang.Object) '4');
        int int20 = lista9.primeiro;
        java.lang.Class<?> wildcardClass21 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test851");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        boolean boolean5 = lista0.vazia();
        lista0.pos = 'a';
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test852");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        lista6.pos = 100;
        java.lang.Object[] objArray12 = lista6.item;
        int int13 = lista6.ultimo;
        java.lang.Object[] objArray14 = lista6.item;
        lista6.primeiro = (short) 1;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        lista17.primeiro = '4';
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        int int25 = lista22.ultimo;
        boolean boolean26 = lista22.vazia();
        lista17.insere((java.lang.Object) lista22);
        int int28 = lista22.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        int int31 = lista29.pos;
        java.lang.Object[] objArray32 = lista29.item;
        lista29.primeiro = (byte) -1;
        java.lang.Object[] objArray35 = lista29.item;
        lista22.insere((java.lang.Object) objArray35);
        lista6.item = objArray35;
        lista0.item = objArray35;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        int int42 = lista39.ultimo;
        boolean boolean43 = lista39.vazia();
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista44.imprime();
        lista44.ultimo = '4';
        lista39.insere((java.lang.Object) '4');
        int int50 = lista39.primeiro;
        int int51 = lista39.primeiro;
        lista0.insere((java.lang.Object) lista39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test853");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (-1);
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test854");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        lista0.pos = 'a';
        lista0.primeiro = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test855");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        boolean boolean24 = lista8.vazia();
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 10;
        lista25.insere((java.lang.Object) lista27);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.primeiro;
        int int35 = lista31.primeiro;
        lista27.insere((java.lang.Object) int35);
        java.lang.Object[] objArray37 = lista27.item;
        java.lang.Object[] objArray38 = lista27.item;
        java.lang.Object[] objArray39 = lista27.item;
        lista8.item = objArray39;
        lista0.item = objArray39;
        lista0.imprime();
        int int43 = lista0.pos;
        int int44 = lista0.primeiro;
        lista0.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test856");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        lista0.pos = 10;
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test857");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        int int7 = lista0.pos;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (short) -1;
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test858");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.ultimo;
        lista0.pos = 10;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test859");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }
}

