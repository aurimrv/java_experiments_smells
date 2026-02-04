package ds.seed5311;

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
        lista0.imprime();
        lista0.ultimo = (byte) -1;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
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
        lista0.imprime();
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
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = '#';
        int int12 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        lista0.pos = 10;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista12.imprime();
        lista12.ultimo = 10;
        int int20 = lista12.ultimo;
        lista12.ultimo = 1;
        lista0.insere((java.lang.Object) lista12);
        lista0.ultimo = (short) 0;
        int int26 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
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
        boolean boolean57 = lista0.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        lista0.primeiro = (byte) 10;
        lista0.imprime();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 2;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
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
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        lista29.pos = '4';
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        lista34.pos = '4';
        lista34.ultimo = (short) -1;
        lista29.insere((java.lang.Object) lista34);
        lista34.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista34);
        java.lang.Class<?> wildcardClass45 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
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
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        java.lang.Object obj25 = new java.lang.Object();
        lista22.insere(obj25);
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista22.item = objArray30;
        lista22.pos = (short) 0;
        lista22.pos = (short) 1;
        java.lang.Object[] objArray36 = lista22.item;
        lista0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10.0, -1.0]");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
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
        int int55 = lista18.ultimo;
        lista18.pos = 32;
        java.lang.Object[] objArray58 = lista18.item;
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
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
        lista0.primeiro = 10;
        int int48 = lista0.ultimo;
        ds.Lista lista49 = new ds.Lista();
        lista49.primeiro = '4';
        int int52 = lista49.primeiro;
        lista49.insere((java.lang.Object) (byte) 100);
        lista49.ultimo = (short) 0;
        lista0.insere((java.lang.Object) lista49);
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
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
        int int27 = lista0.primeiro;
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        lista28.pos = '4';
        lista28.primeiro = '4';
        boolean boolean35 = lista28.vazia();
        lista28.pos = 100;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        int int41 = lista38.primeiro;
        lista38.insere((java.lang.Object) (byte) 100);
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
        lista44.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.imprime();
        java.lang.Object[] objArray64 = lista62.item;
        lista62.primeiro = (short) 0;
        java.lang.Object[] objArray67 = lista62.item;
        lista44.item = objArray67;
        lista38.item = objArray67;
        lista28.item = objArray67;
        lista0.insere((java.lang.Object) objArray67);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
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
        int int21 = lista0.primeiro;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.pos = (-1);
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.ultimo = 0;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray17 = lista15.item;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista15.item = objArray20;
        boolean boolean22 = lista15.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        lista23.pos = '4';
        lista23.primeiro = '4';
        lista23.imprime();
        java.lang.Object[] objArray31 = lista23.item;
        lista15.item = objArray31;
        lista7.item = objArray31;
        java.lang.Object[] objArray34 = lista7.item;
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
        lista7.item = objArray49;
        lista0.item = objArray49;
        ds.Lista lista54 = new ds.Lista();
        lista54.primeiro = '4';
        java.lang.Object obj57 = new java.lang.Object();
        lista54.insere(obj57);
        java.lang.Object[] objArray59 = lista54.item;
        lista54.insere((java.lang.Object) '#');
        lista54.primeiro = ' ';
        lista0.insere((java.lang.Object) lista54);
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
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
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
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
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        lista15.pos = '4';
        lista15.primeiro = '4';
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        lista23.pos = '4';
        lista23.primeiro = '4';
        boolean boolean30 = lista23.vazia();
        lista23.pos = 100;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray35 = lista33.item;
        lista23.item = objArray35;
        lista15.item = objArray35;
        lista0.item = objArray35;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
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
        boolean boolean14 = lista0.vazia();
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
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
        int int13 = lista0.pos;
        boolean boolean14 = lista0.vazia();
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = (byte) 100;
        java.lang.Object[] objArray15 = lista5.item;
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
        lista34.primeiro = '4';
        java.lang.Object obj37 = new java.lang.Object();
        lista34.insere(obj37);
        java.lang.Object[] objArray39 = lista34.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista34.item = objArray42;
        int int44 = lista34.pos;
        lista16.insere((java.lang.Object) lista34);
        lista16.pos = 1;
        java.lang.Object[] objArray48 = lista16.item;
        lista16.ultimo = 0;
        lista16.primeiro = (-1);
        lista5.insere((java.lang.Object) lista16);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
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
        lista0.pos = 1;
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
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) 10;
        int int11 = lista0.pos;
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
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
        int int26 = lista0.ultimo;
        int int27 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
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
        int int13 = lista0.ultimo;
        lista0.pos = 2;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
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
        lista0.pos = 52;
        java.lang.Class<?> wildcardClass29 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
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
        lista0.imprime();
        int int31 = lista0.pos;
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        lista4.primeiro = '4';
        boolean boolean7 = lista4.vazia();
        lista0.insere((java.lang.Object) boolean7);
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 0;
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 'a';
        int int12 = lista0.ultimo;
        java.lang.Object obj13 = null;
        lista0.insere(obj13);
        lista0.pos = '4';
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
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
        boolean boolean34 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
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
        lista35.primeiro = 100;
        ds.Lista lista59 = new ds.Lista();
        lista59.primeiro = '4';
        lista59.pos = '4';
        lista59.primeiro = '4';
        lista59.imprime();
        java.lang.Object[] objArray67 = lista59.item;
        boolean boolean68 = lista59.vazia();
        lista59.pos = 10;
        lista59.pos = (short) -1;
        ds.Lista lista73 = new ds.Lista();
        lista73.primeiro = '4';
        java.lang.Object obj76 = new java.lang.Object();
        lista73.insere(obj76);
        int int78 = lista73.ultimo;
        lista73.pos = '4';
        java.lang.Object[] objArray81 = lista73.item;
        lista59.item = objArray81;
        lista35.item = objArray81;
        int int84 = lista35.primeiro;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.pos = (-1);
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
        java.lang.Object[] objArray41 = lista14.item;
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
        lista14.item = objArray56;
        lista7.item = objArray56;
        lista0.item = objArray56;
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
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
        int int13 = lista0.ultimo;
        lista0.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
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
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        java.lang.Object obj32 = new java.lang.Object();
        lista29.insere(obj32);
        lista29.imprime();
        java.lang.Object[] objArray35 = lista29.item;
        java.lang.Object[] objArray36 = lista29.item;
        boolean boolean37 = lista29.vazia();
        lista0.insere((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
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
        int int74 = lista6.primeiro;
        boolean boolean75 = lista6.vazia();
        lista6.ultimo = 10;
        int int78 = lista6.ultimo;
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 52 + "'", int74 == 52);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = (byte) 100;
        java.lang.Object[] objArray15 = lista5.item;
        lista5.primeiro = (byte) 100;
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
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
        int int26 = lista0.primeiro;
        int int27 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.ultimo;
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
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
        int int22 = lista11.pos;
        lista11.pos = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
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
        lista0.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
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
        lista0.primeiro = (byte) 10;
        int int26 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
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
        lista0.primeiro = 35;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        lista0.pos = (short) 0;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista12.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        lista12.item = objArray26;
        lista0.item = objArray26;
        java.lang.Object[] objArray30 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10.0, -1.0]");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
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
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        lista35.pos = '4';
        lista35.primeiro = '4';
        int int42 = lista35.primeiro;
        int int43 = lista35.primeiro;
        lista35.pos = (byte) 1;
        lista35.pos = (byte) 1;
        lista35.primeiro = (byte) 100;
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        java.lang.Object[] objArray55 = lista50.item;
        lista50.imprime();
        int int57 = lista50.primeiro;
        ds.Lista lista58 = new ds.Lista();
        lista58.primeiro = '4';
        java.lang.Object obj61 = new java.lang.Object();
        lista58.insere(obj61);
        lista58.imprime();
        java.lang.Object[] objArray64 = lista58.item;
        ds.Lista lista65 = new ds.Lista();
        lista65.primeiro = '4';
        java.lang.Object obj68 = new java.lang.Object();
        lista65.insere(obj68);
        lista65.imprime();
        ds.Lista lista71 = new ds.Lista();
        lista71.primeiro = '4';
        java.lang.Object obj74 = new java.lang.Object();
        lista71.insere(obj74);
        java.lang.Object[] objArray76 = lista71.item;
        java.lang.Object[] objArray79 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista71.item = objArray79;
        lista65.item = objArray79;
        lista58.insere((java.lang.Object) objArray79);
        int int83 = lista58.pos;
        java.lang.Object[] objArray84 = lista58.item;
        lista50.item = objArray84;
        lista35.item = objArray84;
        lista35.pos = (byte) 0;
        int int89 = lista35.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
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
        int int76 = lista0.primeiro;
        java.lang.Class<?> wildcardClass77 = lista0.getClass();
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 52 + "'", int76 == 52);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
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
        lista0.pos = '4';
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        lista15.imprime();
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
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        java.lang.Object[] objArray43 = lista38.item;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista38.item = objArray46;
        lista21.item = objArray46;
        lista15.item = objArray46;
        boolean boolean50 = lista15.vazia();
        int int51 = lista15.pos;
        ds.Lista lista52 = new ds.Lista();
        lista52.primeiro = '4';
        java.lang.Object obj55 = new java.lang.Object();
        lista52.insere(obj55);
        lista52.imprime();
        java.lang.Object[] objArray58 = lista52.item;
        lista52.imprime();
        lista15.insere((java.lang.Object) lista52);
        java.lang.Object[] objArray61 = lista52.item;
        lista0.item = objArray61;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
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
        boolean boolean32 = lista0.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int11 = lista0.pos;
        int int12 = lista0.ultimo;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
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
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
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
        int int32 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        lista12.imprime();
        int int19 = lista12.primeiro;
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        java.lang.Object obj23 = new java.lang.Object();
        lista20.insere(obj23);
        lista20.imprime();
        java.lang.Object[] objArray26 = lista20.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        lista27.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        java.lang.Object[] objArray38 = lista33.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista33.item = objArray41;
        lista27.item = objArray41;
        lista20.insere((java.lang.Object) objArray41);
        int int45 = lista20.pos;
        java.lang.Object[] objArray46 = lista20.item;
        lista12.item = objArray46;
        lista0.item = objArray46;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
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
        lista0.pos = ' ';
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
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
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
        java.lang.Object[] objArray28 = lista0.item;
        boolean boolean29 = lista0.vazia();
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
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
        int int18 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.primeiro;
        lista0.primeiro = (byte) -1;
        int int13 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        lista4.primeiro = '4';
        boolean boolean7 = lista4.vazia();
        lista0.insere((java.lang.Object) boolean7);
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
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
        lista0.pos = (short) 1;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.ultimo = 32;
        lista0.primeiro = (byte) 100;
        lista0.primeiro = 0;
        lista0.ultimo = (short) 0;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        lista15.imprime();
        java.lang.Object[] objArray21 = lista15.item;
        java.lang.Object[] objArray22 = lista15.item;
        lista15.ultimo = (byte) 100;
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
        lista25.pos = 52;
        lista25.pos = (-1);
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        lista48.imprime();
        int int55 = lista48.primeiro;
        ds.Lista lista56 = new ds.Lista();
        lista56.primeiro = '4';
        java.lang.Object obj59 = new java.lang.Object();
        lista56.insere(obj59);
        lista56.imprime();
        java.lang.Object[] objArray62 = lista56.item;
        ds.Lista lista63 = new ds.Lista();
        lista63.primeiro = '4';
        java.lang.Object obj66 = new java.lang.Object();
        lista63.insere(obj66);
        lista63.imprime();
        ds.Lista lista69 = new ds.Lista();
        lista69.primeiro = '4';
        java.lang.Object obj72 = new java.lang.Object();
        lista69.insere(obj72);
        java.lang.Object[] objArray74 = lista69.item;
        java.lang.Object[] objArray77 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista69.item = objArray77;
        lista63.item = objArray77;
        lista56.insere((java.lang.Object) objArray77);
        int int81 = lista56.pos;
        java.lang.Object[] objArray82 = lista56.item;
        lista48.item = objArray82;
        lista25.item = objArray82;
        int int85 = lista25.ultimo;
        lista15.insere((java.lang.Object) int85);
        lista0.insere((java.lang.Object) lista15);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 52 + "'", int55 == 52);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
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
        lista0.pos = 32;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
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
        int int51 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        lista0.primeiro = (byte) 1;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        lista0.primeiro = 2;
        lista0.primeiro = 52;
        lista0.imprime();
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 52;
        int int5 = lista0.primeiro;
        lista0.primeiro = '#';
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = (short) 10;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
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
        lista0.imprime();
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
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
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
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
        int int36 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (byte) 100;
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
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        java.lang.Object[] objArray40 = lista38.item;
        lista38.primeiro = (short) 0;
        lista38.pos = (byte) -1;
        lista38.imprime();
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
        int int71 = lista46.primeiro;
        lista46.imprime();
        java.lang.Object[] objArray73 = lista46.item;
        lista38.item = objArray73;
        lista0.item = objArray73;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 52 + "'", int71 == 52);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        java.lang.Object obj12 = new java.lang.Object();
        lista9.insere(obj12);
        lista9.imprime();
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
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista32.item = objArray40;
        lista15.item = objArray40;
        lista9.item = objArray40;
        int int44 = lista9.ultimo;
        ds.Lista lista45 = new ds.Lista();
        lista45.primeiro = '4';
        lista45.pos = '4';
        lista45.primeiro = '4';
        lista45.imprime();
        java.lang.Object[] objArray53 = lista45.item;
        boolean boolean54 = lista45.vazia();
        lista45.pos = 10;
        lista45.pos = (short) -1;
        ds.Lista lista59 = new ds.Lista();
        lista59.primeiro = '4';
        java.lang.Object obj62 = new java.lang.Object();
        lista59.insere(obj62);
        int int64 = lista59.ultimo;
        lista59.pos = '4';
        java.lang.Object[] objArray67 = lista59.item;
        lista45.item = objArray67;
        lista9.item = objArray67;
        java.lang.Object[] objArray70 = lista9.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        lista0.ultimo = 2;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        lista10.insere((java.lang.Object) lista11);
        int int16 = lista10.pos;
        lista10.pos = '4';
        int int19 = lista10.primeiro;
        lista10.ultimo = 'a';
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        java.lang.Object obj25 = new java.lang.Object();
        lista22.insere(obj25);
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista22.item = objArray30;
        lista22.pos = (short) 0;
        lista22.pos = (short) 1;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista22.item = objArray37;
        java.lang.Object[] objArray39 = lista22.item;
        ds.Lista lista40 = new ds.Lista();
        lista40.primeiro = '4';
        int int43 = lista40.primeiro;
        lista40.insere((java.lang.Object) (byte) 100);
        lista40.primeiro = ' ';
        lista40.ultimo = 'a';
        java.lang.Object[] objArray50 = lista40.item;
        lista22.item = objArray50;
        lista10.item = objArray50;
        int int53 = lista10.ultimo;
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        lista0.ultimo = 10;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.pos = '4';
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        lista6.insere((java.lang.Object) '#');
        lista6.primeiro = ' ';
        lista0.insere((java.lang.Object) ' ');
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.pos = (short) 10;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        java.lang.Object[] objArray16 = lista10.item;
        lista0.item = objArray16;
        boolean boolean18 = lista0.vazia();
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        java.lang.Object[] objArray15 = lista10.item;
        lista10.insere((java.lang.Object) '#');
        int int18 = lista10.ultimo;
        int int19 = lista10.ultimo;
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        java.lang.Object obj23 = new java.lang.Object();
        lista20.insere(obj23);
        lista20.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        java.lang.Object obj29 = new java.lang.Object();
        lista26.insere(obj29);
        java.lang.Object[] objArray31 = lista26.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista26.item = objArray34;
        lista20.item = objArray34;
        java.lang.Object[] objArray37 = lista20.item;
        lista10.insere((java.lang.Object) objArray37);
        lista0.item = objArray37;
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0, -1.0]");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.primeiro = (byte) 100;
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        java.lang.Object[] objArray9 = lista0.item;
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
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
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
        int int14 = lista0.primeiro;
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        int int13 = lista10.primeiro;
        lista10.insere((java.lang.Object) (byte) 100);
        lista10.ultimo = (short) 0;
        int int18 = lista10.pos;
        boolean boolean19 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean19);
        int int21 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.pos = 1;
        int int8 = lista0.pos;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
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
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        boolean boolean10 = lista0.vazia();
        lista0.primeiro = 32;
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
        lista13.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        java.lang.Object[] objArray36 = lista31.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista31.item = objArray39;
        int int41 = lista31.pos;
        lista13.insere((java.lang.Object) lista31);
        java.lang.Object[] objArray43 = lista31.item;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        int int54 = lista44.pos;
        java.lang.Object[] objArray55 = null;
        lista44.item = objArray55;
        ds.Lista lista57 = new ds.Lista();
        lista57.primeiro = '4';
        lista57.pos = '4';
        lista57.primeiro = '4';
        lista57.imprime();
        java.lang.Object[] objArray65 = lista57.item;
        lista44.item = objArray65;
        lista31.insere((java.lang.Object) lista44);
        boolean boolean68 = lista44.vazia();
        int int69 = lista44.primeiro;
        int int70 = lista44.ultimo;
        int int71 = lista44.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 52 + "'", int69 == 52);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 0;
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        java.lang.Object obj8 = new java.lang.Object();
        lista5.insere(obj8);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        int int5 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int11 = lista0.pos;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        lista13.pos = '4';
        lista13.primeiro = '4';
        lista13.imprime();
        java.lang.Object[] objArray21 = lista13.item;
        lista13.imprime();
        lista13.primeiro = 'a';
        int int25 = lista13.ultimo;
        lista13.primeiro = (byte) -1;
        int int28 = lista13.pos;
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        java.lang.Object obj32 = new java.lang.Object();
        lista29.insere(obj32);
        java.lang.Object[] objArray34 = lista29.item;
        lista29.insere((java.lang.Object) '#');
        int int37 = lista29.ultimo;
        int int38 = lista29.ultimo;
        lista29.ultimo = 0;
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        lista41.imprime();
        java.lang.Object[] objArray47 = lista41.item;
        lista29.item = objArray47;
        lista13.item = objArray47;
        lista0.insere((java.lang.Object) lista13);
        boolean boolean51 = lista13.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = 1;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
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
        lista0.pos = ' ';
        int int29 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
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
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
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
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.imprime();
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
        int int41 = lista29.primeiro;
        int int42 = lista29.pos;
        int int43 = lista29.pos;
        lista0.insere((java.lang.Object) int43);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
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
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.primeiro = '4';
        java.lang.Object obj14 = new java.lang.Object();
        lista11.insere(obj14);
        lista11.ultimo = 0;
        int int18 = lista11.pos;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray21 = lista19.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray24 = lista22.item;
        lista19.item = objArray24;
        boolean boolean26 = lista19.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        lista27.pos = '4';
        lista27.primeiro = '4';
        lista27.imprime();
        java.lang.Object[] objArray35 = lista27.item;
        lista19.item = objArray35;
        lista11.item = objArray35;
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
        lista11.item = objArray72;
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista77 = new ds.Lista();
        lista77.imprime();
        java.lang.Object[] objArray79 = lista77.item;
        ds.Lista lista80 = new ds.Lista();
        lista80.imprime();
        java.lang.Object[] objArray82 = lista80.item;
        lista77.item = objArray82;
        lista11.item = objArray82;
        int int85 = lista11.ultimo;
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        int int88 = lista11.primeiro;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 52 + "'", int88 == 52);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.primeiro;
        lista0.pos = (short) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        int int10 = lista0.primeiro;
        lista0.pos = (short) 10;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
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
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
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
        lista0.pos = '4';
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = 2;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        lista5.item = objArray10;
        boolean boolean12 = lista5.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        lista13.pos = '4';
        lista13.primeiro = '4';
        lista13.imprime();
        java.lang.Object[] objArray21 = lista13.item;
        lista5.item = objArray21;
        lista5.primeiro = (short) 0;
        lista5.imprime();
        java.lang.Object[] objArray26 = lista5.item;
        lista0.item = objArray26;
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 52;
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        boolean boolean2 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
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
        int int17 = lista0.primeiro;
        int int18 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 0;
        int int10 = lista0.ultimo;
        java.lang.Object[] objArray11 = lista0.item;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
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
        lista0.pos = 35;
        int int18 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
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
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        lista16.insere(obj21);
        lista16.pos = (byte) 100;
        lista16.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista16.insere((java.lang.Object) lista27);
        java.lang.Object[] objArray29 = lista27.item;
        lista27.pos = (byte) 10;
        lista0.insere((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
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
        int int53 = lista0.primeiro;
        lista0.imprime();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
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
        boolean boolean73 = lista6.vazia();
        int int74 = lista6.ultimo;
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
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
        int int30 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
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
        int int14 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.ultimo = 0;
        int int12 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
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
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        lista29.pos = '4';
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        lista34.pos = '4';
        lista34.ultimo = (short) -1;
        lista29.insere((java.lang.Object) lista34);
        lista34.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista34);
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) 1;
        lista0.primeiro = (short) 10;
        int int16 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
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
        lista18.pos = '4';
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
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        lista0.pos = 'a';
        lista0.ultimo = 10;
        boolean boolean11 = lista0.vazia();
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
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
        java.lang.Object[] objArray17 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10.0, -1.0]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
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
        int int28 = lista0.primeiro;
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        java.lang.Object obj32 = new java.lang.Object();
        lista29.insere(obj32);
        lista29.imprime();
        lista29.ultimo = 10;
        lista29.imprime();
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.pos = (byte) 1;
        lista0.ultimo = 1;
        lista0.pos = 52;
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        boolean boolean3 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
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
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        int int51 = lista48.pos;
        boolean boolean52 = lista48.vazia();
        int int53 = lista48.primeiro;
        int int54 = lista48.pos;
        java.lang.Class<?> wildcardClass55 = lista48.getClass();
        lista0.insere((java.lang.Object) wildcardClass55);
        lista0.pos = (short) 10;
        java.lang.Class<?> wildcardClass59 = lista0.getClass();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = 'a';
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.imprime();
        lista0.pos = 0;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        int int6 = lista0.pos;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        lista13.pos = '4';
        lista13.ultimo = (short) -1;
        lista8.insere((java.lang.Object) lista13);
        lista13.ultimo = (byte) 100;
        java.lang.Object[] objArray23 = lista13.item;
        lista0.item = objArray23;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        int int10 = lista0.primeiro;
        lista0.pos = 'a';
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
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
        int int13 = lista0.primeiro;
        lista0.pos = (short) 1;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
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
        java.lang.Object[] objArray63 = lista0.item;
        lista0.imprime();
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
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        int int6 = lista0.ultimo;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
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
        int int61 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 'a';
        boolean boolean12 = lista0.vazia();
        int int13 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.primeiro = '4';
        lista1.pos = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.primeiro = (byte) 100;
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
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
        lista29.primeiro = '4';
        lista29.pos = '4';
        lista29.primeiro = '4';
        boolean boolean36 = lista29.vazia();
        lista29.pos = 100;
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        java.lang.Object[] objArray41 = lista39.item;
        lista29.item = objArray41;
        lista0.item = objArray41;
        lista0.pos = 97;
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.pos = (byte) 1;
        lista0.ultimo = 1;
        lista0.pos = (byte) 10;
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.ultimo;
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
        lista6.imprime();
        java.lang.Object[] objArray26 = lista6.item;
        lista0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        lista0.pos = (byte) 10;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        java.lang.Object[] objArray15 = lista10.item;
        lista10.imprime();
        int int17 = lista10.primeiro;
        boolean boolean18 = lista10.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista12.imprime();
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        int int20 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
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
        lista0.primeiro = 97;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        lista0.insere((java.lang.Object) 1.0f);
        lista0.imprime();
        lista0.pos = 2;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista6.pos = (short) 0;
        lista6.pos = (short) 1;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista6.item = objArray21;
        lista6.primeiro = (short) 100;
        java.lang.Object[] objArray25 = lista6.item;
        java.lang.Object[] objArray26 = lista6.item;
        lista0.item = objArray26;
        boolean boolean28 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
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
        int int29 = lista0.ultimo;
        java.lang.Class<?> wildcardClass30 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 'a';
        int int12 = lista0.ultimo;
        java.lang.Object obj13 = null;
        lista0.insere(obj13);
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
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
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        java.lang.Object obj19 = new java.lang.Object();
        lista16.insere(obj19);
        java.lang.Object[] objArray21 = lista16.item;
        lista16.insere((java.lang.Object) '#');
        int int24 = lista16.ultimo;
        int int25 = lista16.ultimo;
        lista16.ultimo = 0;
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        java.lang.Object obj31 = new java.lang.Object();
        lista28.insere(obj31);
        lista28.imprime();
        java.lang.Object[] objArray34 = lista28.item;
        lista16.item = objArray34;
        lista0.item = objArray34;
        java.lang.Class<?> wildcardClass37 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        int int12 = lista0.ultimo;
        lista0.imprime();
        int int14 = lista0.primeiro;
        lista0.imprime();
        boolean boolean16 = lista0.vazia();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
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
        int int27 = lista0.primeiro;
        int int28 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        lista30.pos = '4';
        lista30.primeiro = '4';
        lista30.imprime();
        lista30.imprime();
        lista0.insere((java.lang.Object) lista30);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
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
        lista18.pos = (byte) 100;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        java.lang.Object[] objArray40 = lista35.item;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista35.item = objArray43;
        lista35.pos = (short) 0;
        lista35.pos = (short) -1;
        int int49 = lista35.primeiro;
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        int int52 = lista50.primeiro;
        lista50.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.primeiro = '4';
        ds.Lista lista57 = new ds.Lista();
        lista57.primeiro = '4';
        java.lang.Object obj60 = new java.lang.Object();
        lista57.insere(obj60);
        lista57.imprime();
        lista57.ultimo = 10;
        lista57.imprime();
        java.lang.Object[] objArray66 = lista57.item;
        lista54.item = objArray66;
        lista50.item = objArray66;
        lista35.insere((java.lang.Object) objArray66);
        lista18.item = objArray66;
        java.lang.Class<?> wildcardClass71 = objArray66.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.ultimo = 2;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
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
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        int int33 = lista30.primeiro;
        boolean boolean34 = lista30.vazia();
        int int35 = lista30.pos;
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
        lista30.insere((java.lang.Object) lista36);
        boolean boolean56 = lista30.vazia();
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        lista30.item = objArray58;
        lista18.item = objArray58;
        lista18.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        lista0.pos = '4';
        int int8 = lista0.ultimo;
        lista0.ultimo = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
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
        lista0.pos = 0;
        int int58 = lista0.primeiro;
        int int59 = lista0.pos;
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 52 + "'", int58 == 52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        int int8 = lista0.ultimo;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
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
        lista0.primeiro = 0;
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
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        lista0.pos = 10;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista12.imprime();
        lista12.ultimo = 10;
        int int20 = lista12.ultimo;
        lista12.ultimo = 1;
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista24 = new ds.Lista();
        lista24.primeiro = '4';
        java.lang.Object obj27 = new java.lang.Object();
        lista24.insere(obj27);
        java.lang.Object[] objArray29 = lista24.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista24.item = objArray32;
        lista24.pos = (short) 0;
        lista24.pos = (short) 1;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista24.item = objArray39;
        java.lang.Object[] objArray41 = lista24.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        int int45 = lista42.primeiro;
        lista42.insere((java.lang.Object) (byte) 100);
        lista42.primeiro = ' ';
        lista42.ultimo = 'a';
        java.lang.Object[] objArray52 = lista42.item;
        lista24.item = objArray52;
        ds.Lista lista54 = new ds.Lista();
        lista54.primeiro = '4';
        lista54.pos = '4';
        lista54.primeiro = '4';
        int int61 = lista54.primeiro;
        int int62 = lista54.primeiro;
        java.lang.Object[] objArray63 = lista54.item;
        lista24.item = objArray63;
        lista12.item = objArray63;
        lista12.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 52 + "'", int61 == 52);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        lista0.insere((java.lang.Object) 10.0f);
        int int10 = lista0.ultimo;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
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
        lista0.pos = (short) 1;
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
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
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
        int int57 = lista31.ultimo;
        lista31.pos = 2;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
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
        java.lang.Object[] objArray50 = lista0.item;
        lista0.pos = 97;
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
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
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
        lista0.primeiro = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = (byte) 0;
        lista0.ultimo = (byte) 1;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
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
        int int17 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
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
        int int95 = lista71.ultimo;
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
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        lista0.primeiro = 2;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
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
        java.lang.Object[] objArray28 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        lista10.pos = '4';
        lista10.ultimo = (short) -1;
        int int17 = lista10.primeiro;
        int int18 = lista10.pos;
        lista10.primeiro = (byte) 1;
        lista10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
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
        lista0.primeiro = '4';
        lista0.primeiro = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
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
        int int12 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
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
        int int28 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.primeiro;
        int int11 = lista0.primeiro;
        lista0.ultimo = 35;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
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
        int int14 = lista6.ultimo;
        java.lang.Object[] objArray15 = lista6.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
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
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        lista17.pos = (short) 0;
        lista17.pos = (short) -1;
        lista17.imprime();
        int int32 = lista17.ultimo;
        java.lang.Object[] objArray33 = lista17.item;
        lista17.primeiro = 0;
        lista0.insere((java.lang.Object) lista17);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10.0, -1.0]");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        int int14 = lista0.primeiro;
        int int15 = lista0.ultimo;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.pos = (byte) 1;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
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
        lista0.primeiro = 97;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        lista0.ultimo = 2;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        lista0.imprime();
        lista0.primeiro = '#';
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
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
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        java.lang.Class<?> wildcardClass27 = lista24.getClass();
        lista0.insere((java.lang.Object) wildcardClass27);
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
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
        int int31 = lista28.pos;
        boolean boolean32 = lista28.vazia();
        lista28.pos = 0;
        java.lang.Object[] objArray35 = lista28.item;
        lista0.insere((java.lang.Object) objArray35);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
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
        lista0.pos = 35;
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
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        boolean boolean10 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
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
        int int25 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.pos = 100;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        lista9.pos = '4';
        lista9.primeiro = '4';
        int int16 = lista9.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        lista17.pos = '4';
        lista17.primeiro = '4';
        boolean boolean24 = lista17.vazia();
        lista17.pos = 100;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        java.lang.Object[] objArray29 = lista27.item;
        lista17.item = objArray29;
        lista9.item = objArray29;
        lista0.insere((java.lang.Object) lista9);
        int int33 = lista0.pos;
        java.lang.Object[] objArray34 = lista0.item;
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        java.lang.Object[] objArray16 = lista10.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        lista17.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista17.item = objArray31;
        lista10.insere((java.lang.Object) objArray31);
        int int35 = lista10.pos;
        lista10.imprime();
        lista10.imprime();
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        java.lang.Object[] objArray43 = lista38.item;
        lista10.item = objArray43;
        lista0.item = objArray43;
        lista0.pos = (short) 100;
        int int48 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
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
        lista0.imprime();
        int int20 = lista0.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        java.lang.Object obj24 = new java.lang.Object();
        lista21.insere(obj24);
        lista21.imprime();
        java.lang.Object[] objArray27 = lista21.item;
        lista21.ultimo = (short) 0;
        int int30 = lista21.pos;
        int int31 = lista21.ultimo;
        lista21.ultimo = (byte) -1;
        java.lang.Object[] objArray34 = lista21.item;
        lista0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.pos = (short) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
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
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.pos;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
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
        int int32 = lista18.pos;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista33.insere(obj38);
        lista33.pos = (byte) 100;
        lista33.ultimo = 10;
        ds.Lista lista45 = new ds.Lista();
        lista45.imprime();
        int int47 = lista45.primeiro;
        lista45.imprime();
        ds.Lista lista49 = new ds.Lista();
        lista49.primeiro = '4';
        ds.Lista lista52 = new ds.Lista();
        lista52.primeiro = '4';
        java.lang.Object obj55 = new java.lang.Object();
        lista52.insere(obj55);
        lista52.imprime();
        lista52.ultimo = 10;
        lista52.imprime();
        java.lang.Object[] objArray61 = lista52.item;
        lista49.item = objArray61;
        lista45.item = objArray61;
        lista33.item = objArray61;
        lista18.item = objArray61;
        java.lang.Class<?> wildcardClass66 = objArray61.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        int int5 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
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
        boolean boolean95 = lista0.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
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
        lista7.ultimo = 100;
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
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = 97;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10.0, -1.0]");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
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
        lista0.primeiro = 10;
        java.lang.Class<?> wildcardClass56 = lista0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
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
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        lista0.pos = 'a';
        lista0.ultimo = 10;
        ds.Lista lista11 = new ds.Lista();
        lista11.primeiro = '4';
        lista11.pos = '4';
        lista11.primeiro = '4';
        lista11.imprime();
        java.lang.Object[] objArray19 = lista11.item;
        boolean boolean20 = lista11.vazia();
        int int21 = lista11.ultimo;
        lista11.pos = 0;
        lista0.insere((java.lang.Object) lista11);
        int int25 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
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
        lista0.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 'a';
        lista0.pos = (short) 100;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
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
        boolean boolean36 = lista0.vazia();
        java.lang.Class<?> wildcardClass37 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
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
        java.lang.Object[] objArray68 = lista0.item;
        int int69 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
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
        lista0.primeiro = 32;
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
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
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        java.lang.Object obj24 = new java.lang.Object();
        lista21.insere(obj24);
        lista19.insere(obj24);
        lista19.pos = (byte) 100;
        lista19.ultimo = 10;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        int int33 = lista31.primeiro;
        lista31.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        lista38.ultimo = 10;
        lista38.imprime();
        java.lang.Object[] objArray47 = lista38.item;
        lista35.item = objArray47;
        lista31.item = objArray47;
        lista19.item = objArray47;
        lista0.item = objArray47;
        lista0.imprime();
        lista0.pos = (short) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
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
        java.lang.Object[] objArray32 = lista0.item;
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
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
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        int int20 = lista18.primeiro;
        lista18.imprime();
        java.lang.Object[] objArray22 = null;
        lista18.item = objArray22;
        int int24 = lista18.primeiro;
        int int25 = lista18.ultimo;
        java.lang.Object[] objArray26 = lista18.item;
        int int27 = lista18.pos;
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        int int31 = lista28.primeiro;
        lista28.insere((java.lang.Object) (byte) 100);
        lista28.primeiro = ' ';
        java.lang.Object[] objArray36 = lista28.item;
        lista18.item = objArray36;
        lista0.item = objArray36;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
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
        lista0.imprime();
        lista0.imprime();
        boolean boolean29 = lista0.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        java.lang.Object obj33 = new java.lang.Object();
        lista30.insere(obj33);
        java.lang.Object[] objArray35 = lista30.item;
        lista0.item = objArray35;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        lista0.pos = 'a';
        lista0.ultimo = 10;
        ds.Lista lista11 = new ds.Lista();
        lista11.primeiro = '4';
        lista11.pos = '4';
        lista11.primeiro = '4';
        lista11.imprime();
        java.lang.Object[] objArray19 = lista11.item;
        boolean boolean20 = lista11.vazia();
        int int21 = lista11.ultimo;
        lista11.pos = 0;
        lista0.insere((java.lang.Object) lista11);
        lista11.imprime();
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        lista2.pos = '4';
        lista2.primeiro = '4';
        lista2.imprime();
        int int10 = lista2.primeiro;
        lista0.insere((java.lang.Object) lista2);
        lista2.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
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
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
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
        int int74 = lista6.primeiro;
        boolean boolean75 = lista6.vazia();
        lista6.pos = 0;
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 52 + "'", int74 == 52);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
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
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        int int27 = lista17.pos;
        lista17.pos = 0;
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.pos = (short) 10;
        lista0.imprime();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        lista0.primeiro = 2;
        lista0.primeiro = 52;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        lista10.pos = '4';
        lista10.primeiro = '4';
        lista10.imprime();
        java.lang.Object[] objArray18 = lista10.item;
        boolean boolean19 = lista10.vazia();
        lista10.pos = (short) 1;
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        java.lang.Object obj25 = new java.lang.Object();
        lista22.insere(obj25);
        lista22.imprime();
        lista22.primeiro = 2;
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        lista30.pos = '4';
        lista30.primeiro = '4';
        boolean boolean37 = lista30.vazia();
        lista30.ultimo = (-1);
        int int40 = lista30.pos;
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
        lista41.imprime();
        lista41.imprime();
        ds.Lista lista69 = new ds.Lista();
        lista69.primeiro = '4';
        java.lang.Object obj72 = new java.lang.Object();
        lista69.insere(obj72);
        java.lang.Object[] objArray74 = lista69.item;
        lista41.item = objArray74;
        lista30.item = objArray74;
        lista22.item = objArray74;
        lista10.item = objArray74;
        lista0.item = objArray74;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
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
        ds.Lista lista48 = new ds.Lista();
        lista48.imprime();
        int int50 = lista48.primeiro;
        lista48.imprime();
        java.lang.Object[] objArray52 = null;
        lista48.item = objArray52;
        int int54 = lista48.primeiro;
        boolean boolean55 = lista48.vazia();
        int int56 = lista48.primeiro;
        lista0.insere((java.lang.Object) int56);
        ds.Lista lista58 = new ds.Lista();
        lista58.primeiro = '4';
        lista58.pos = '4';
        lista58.ultimo = (short) -1;
        int int65 = lista58.primeiro;
        ds.Lista lista66 = new ds.Lista();
        lista66.primeiro = '4';
        java.lang.Object obj69 = new java.lang.Object();
        lista66.insere(obj69);
        java.lang.Object[] objArray71 = lista66.item;
        java.lang.Object[] objArray74 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista66.item = objArray74;
        lista58.item = objArray74;
        lista58.imprime();
        java.lang.Object[] objArray78 = lista58.item;
        lista0.insere((java.lang.Object) objArray78);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 52 + "'", int65 == 52);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[10.0, -1.0]");
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
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
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        java.lang.Class<?> wildcardClass27 = lista24.getClass();
        lista0.insere((java.lang.Object) wildcardClass27);
        lista0.pos = (short) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
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
        int int32 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        lista0.primeiro = (byte) 10;
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
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
        boolean boolean75 = lista6.vazia();
        java.lang.Object[] objArray76 = lista6.item;
        ds.Lista lista77 = new ds.Lista();
        lista77.primeiro = '4';
        int int80 = lista77.primeiro;
        lista77.insere((java.lang.Object) (byte) 100);
        ds.Lista lista83 = new ds.Lista();
        lista83.primeiro = '4';
        java.lang.Object obj86 = new java.lang.Object();
        lista83.insere(obj86);
        java.lang.Object[] objArray88 = lista83.item;
        lista83.insere((java.lang.Object) '#');
        lista83.primeiro = ' ';
        lista77.insere((java.lang.Object) ' ');
        lista77.ultimo = (byte) -1;
        lista6.insere((java.lang.Object) lista77);
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 52 + "'", int80 == 52);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int11 = lista0.ultimo;
        int int12 = lista0.pos;
        int int13 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.pos = (short) 10;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        java.lang.Object[] objArray16 = lista10.item;
        lista0.item = objArray16;
        int int18 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.primeiro = '4';
        java.lang.Object obj14 = new java.lang.Object();
        lista11.insere(obj14);
        lista11.ultimo = 0;
        int int18 = lista11.pos;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray21 = lista19.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray24 = lista22.item;
        lista19.item = objArray24;
        boolean boolean26 = lista19.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        lista27.pos = '4';
        lista27.primeiro = '4';
        lista27.imprime();
        java.lang.Object[] objArray35 = lista27.item;
        lista19.item = objArray35;
        lista11.item = objArray35;
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
        lista11.item = objArray72;
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista77 = new ds.Lista();
        lista77.imprime();
        java.lang.Object[] objArray79 = lista77.item;
        ds.Lista lista80 = new ds.Lista();
        lista80.imprime();
        java.lang.Object[] objArray82 = lista80.item;
        lista77.item = objArray82;
        lista11.item = objArray82;
        int int85 = lista11.ultimo;
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        int int88 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
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
        lista0.pos = (-1);
        boolean boolean22 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
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
        boolean boolean27 = lista0.vazia();
        int int28 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.pos = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.primeiro = (byte) 100;
        lista0.imprime();
        boolean boolean13 = lista0.vazia();
        lista0.pos = (byte) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
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
        lista0.primeiro = (short) 1;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        lista0.pos = '4';
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
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
        int int54 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 52 + "'", int54 == 52);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.primeiro = '4';
        lista0.ultimo = 2;
        lista0.imprime();
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
        int int75 = lista10.ultimo;
        lista10.primeiro = (byte) 0;
        java.lang.Object[] objArray78 = lista10.item;
        lista0.insere((java.lang.Object) objArray78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
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
        java.lang.Object[] objArray60 = lista0.item;
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
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.pos = 100;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        lista9.pos = '4';
        lista9.primeiro = '4';
        int int16 = lista9.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        lista17.pos = '4';
        lista17.primeiro = '4';
        boolean boolean24 = lista17.vazia();
        lista17.pos = 100;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        java.lang.Object[] objArray29 = lista27.item;
        lista17.item = objArray29;
        lista9.item = objArray29;
        lista0.insere((java.lang.Object) lista9);
        boolean boolean33 = lista9.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
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
        lista36.pos = 52;
        lista36.pos = (-1);
        ds.Lista lista59 = new ds.Lista();
        lista59.primeiro = '4';
        java.lang.Object obj62 = new java.lang.Object();
        lista59.insere(obj62);
        java.lang.Object[] objArray64 = lista59.item;
        lista59.imprime();
        int int66 = lista59.primeiro;
        ds.Lista lista67 = new ds.Lista();
        lista67.primeiro = '4';
        java.lang.Object obj70 = new java.lang.Object();
        lista67.insere(obj70);
        lista67.imprime();
        java.lang.Object[] objArray73 = lista67.item;
        ds.Lista lista74 = new ds.Lista();
        lista74.primeiro = '4';
        java.lang.Object obj77 = new java.lang.Object();
        lista74.insere(obj77);
        lista74.imprime();
        ds.Lista lista80 = new ds.Lista();
        lista80.primeiro = '4';
        java.lang.Object obj83 = new java.lang.Object();
        lista80.insere(obj83);
        java.lang.Object[] objArray85 = lista80.item;
        java.lang.Object[] objArray88 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista80.item = objArray88;
        lista74.item = objArray88;
        lista67.insere((java.lang.Object) objArray88);
        int int92 = lista67.pos;
        java.lang.Object[] objArray93 = lista67.item;
        lista59.item = objArray93;
        lista36.item = objArray93;
        boolean boolean96 = lista36.vazia();
        lista36.imprime();
        lista0.insere((java.lang.Object) lista36);
        int int99 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 52 + "'", int66 == 52);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 52 + "'", int99 == 52);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 100;
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0f };
        lista0.item = objArray9;
        int int11 = lista0.pos;
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10.0]");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
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
        lista0.primeiro = (byte) 0;
        java.lang.Object[] objArray68 = lista0.item;
        int int69 = lista0.pos;
        lista0.pos = (short) -1;
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
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
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
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        int int24 = lista22.primeiro;
        int int25 = lista22.pos;
        lista22.pos = (short) 10;
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        java.lang.Object[] objArray30 = lista28.item;
        lista28.primeiro = (short) 0;
        java.lang.Object[] objArray33 = lista28.item;
        int int34 = lista28.primeiro;
        lista22.insere((java.lang.Object) lista28);
        boolean boolean36 = lista28.vazia();
        java.lang.Object[] objArray37 = null;
        lista28.item = objArray37;
        int int39 = lista28.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) int39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
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
        int int28 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        int int7 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
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
        int int32 = lista18.pos;
        lista18.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        lista34.pos = '4';
        lista34.primeiro = '4';
        int int41 = lista34.primeiro;
        int int42 = lista34.primeiro;
        lista34.pos = (byte) 1;
        int int45 = lista34.pos;
        int int46 = lista34.ultimo;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        java.lang.Object[] objArray52 = lista47.item;
        java.lang.Object[] objArray55 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista47.item = objArray55;
        lista34.item = objArray55;
        lista34.primeiro = (short) 100;
        ds.Lista lista60 = new ds.Lista();
        lista60.primeiro = '4';
        java.lang.Object obj63 = new java.lang.Object();
        lista60.insere(obj63);
        lista60.imprime();
        lista60.primeiro = (short) -1;
        lista60.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray70 = lista60.item;
        lista34.item = objArray70;
        lista18.item = objArray70;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
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
        lista0.ultimo = (short) 0;
        int int88 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = 2;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
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
        java.lang.Object[] objArray56 = lista31.item;
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
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
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
        int int13 = lista0.primeiro;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = (byte) 100;
        java.lang.Object[] objArray15 = lista5.item;
        lista5.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
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
        int int19 = lista10.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
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
        lista0.primeiro = (byte) 0;
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        int int14 = lista0.primeiro;
        int int15 = lista0.ultimo;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
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
        lista0.primeiro = 10;
        int int48 = lista0.ultimo;
        java.lang.Object[] objArray49 = lista0.item;
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10.0, -1.0]");
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
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
        lista14.primeiro = '4';
        lista14.pos = '4';
        lista14.primeiro = '4';
        lista14.imprime();
        java.lang.Object[] objArray22 = lista14.item;
        lista14.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.primeiro = '4';
        java.lang.Object obj27 = new java.lang.Object();
        lista24.insere(obj27);
        lista24.imprime();
        java.lang.Object[] objArray30 = lista24.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.primeiro = '4';
        java.lang.Object obj40 = new java.lang.Object();
        lista37.insere(obj40);
        java.lang.Object[] objArray42 = lista37.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista37.item = objArray45;
        lista31.item = objArray45;
        lista24.insere((java.lang.Object) objArray45);
        int int49 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        ds.Lista lista52 = new ds.Lista();
        lista52.primeiro = '4';
        java.lang.Object obj55 = new java.lang.Object();
        lista52.insere(obj55);
        java.lang.Object[] objArray57 = lista52.item;
        lista24.item = objArray57;
        lista14.item = objArray57;
        lista0.item = objArray57;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.ultimo = 32;
        lista0.primeiro = (byte) 100;
        lista0.primeiro = 0;
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
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
        int int26 = lista0.primeiro;
        java.lang.Object[] objArray27 = lista0.item;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 0;
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        java.lang.Object obj8 = new java.lang.Object();
        lista5.insere(obj8);
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
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
        java.lang.Object[] objArray73 = lista0.item;
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
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
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
        int int32 = lista18.pos;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray35 = lista33.item;
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        java.lang.Object[] objArray38 = lista36.item;
        lista33.item = objArray38;
        boolean boolean40 = lista33.vazia();
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        lista41.pos = '4';
        lista41.primeiro = '4';
        lista41.imprime();
        java.lang.Object[] objArray49 = lista41.item;
        lista33.item = objArray49;
        lista33.primeiro = (short) 0;
        lista33.imprime();
        java.lang.Object[] objArray54 = lista33.item;
        lista18.insere((java.lang.Object) lista33);
        lista33.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
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
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        lista0.pos = '4';
        int int8 = lista0.ultimo;
        lista0.primeiro = 0;
        int int11 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = (byte) 0;
        int int7 = lista0.primeiro;
        lista0.imprime();
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.imprime();
        lista0.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = (byte) 100;
        java.lang.Object[] objArray15 = lista5.item;
        int int16 = lista5.pos;
        int int17 = lista5.primeiro;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        int int20 = lista18.primeiro;
        int int21 = lista18.pos;
        lista18.pos = (short) 10;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista24.primeiro = (short) 0;
        java.lang.Object[] objArray29 = lista24.item;
        int int30 = lista24.primeiro;
        lista18.insere((java.lang.Object) lista24);
        boolean boolean32 = lista24.vazia();
        java.lang.Object[] objArray33 = null;
        lista24.item = objArray33;
        int int35 = lista24.primeiro;
        lista5.insere((java.lang.Object) int35);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
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
        int int16 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
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
        java.lang.Object[] objArray27 = lista0.item;
        int int28 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
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
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        lista29.pos = '4';
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        lista34.pos = '4';
        lista34.ultimo = (short) -1;
        lista29.insere((java.lang.Object) lista34);
        lista34.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista34);
        boolean boolean45 = lista34.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
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
        int int39 = lista11.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
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
        java.lang.Object[] objArray16 = lista0.item;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.primeiro = (byte) 100;
        lista0.imprime();
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
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
        int int49 = lista0.primeiro;
        int int50 = lista0.pos;
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = 2;
        int int8 = lista0.pos;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
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
        int int32 = lista18.pos;
        int int33 = lista18.primeiro;
        int int34 = lista18.primeiro;
        lista18.imprime();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        lista0.insere((java.lang.Object) 1.0f);
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) 10;
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista12.imprime();
        java.lang.Object[] objArray18 = lista12.item;
        boolean boolean19 = lista12.vazia();
        lista12.insere((java.lang.Object) 10.0f);
        int int22 = lista12.ultimo;
        lista0.insere((java.lang.Object) lista12);
        lista12.pos = (short) 1;
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        java.lang.Object obj29 = new java.lang.Object();
        lista26.insere(obj29);
        java.lang.Object[] objArray31 = lista26.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista26.item = objArray34;
        boolean boolean36 = lista26.vazia();
        java.lang.Object[] objArray37 = lista26.item;
        java.lang.Object[] objArray38 = lista26.item;
        lista12.item = objArray38;
        java.lang.Object[] objArray40 = lista12.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10.0, -1.0]");
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        java.lang.Object[] objArray15 = lista10.item;
        lista10.insere((java.lang.Object) '#');
        int int18 = lista10.ultimo;
        int int19 = lista10.ultimo;
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        java.lang.Object obj23 = new java.lang.Object();
        lista20.insere(obj23);
        lista20.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        java.lang.Object obj29 = new java.lang.Object();
        lista26.insere(obj29);
        java.lang.Object[] objArray31 = lista26.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista26.item = objArray34;
        lista20.item = objArray34;
        java.lang.Object[] objArray37 = lista20.item;
        lista10.insere((java.lang.Object) objArray37);
        lista0.item = objArray37;
        int int40 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
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
        lista0.ultimo = (short) 0;
        java.lang.Object[] objArray19 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
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
        int int57 = lista31.primeiro;
        lista31.imprime();
        lista31.ultimo = (byte) 0;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        lista0.ultimo = (byte) -1;
        int int9 = lista0.primeiro;
        int int10 = lista0.ultimo;
        int int11 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        lista6.insere((java.lang.Object) '#');
        lista6.primeiro = ' ';
        lista0.insere((java.lang.Object) ' ');
        boolean boolean17 = lista0.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        lista18.pos = '4';
        lista18.primeiro = '4';
        lista18.imprime();
        int int26 = lista18.primeiro;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        int int30 = lista27.primeiro;
        boolean boolean31 = lista27.vazia();
        int int32 = lista27.pos;
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
        lista27.insere((java.lang.Object) lista33);
        lista18.insere((java.lang.Object) lista27);
        lista0.insere((java.lang.Object) lista27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10.0, -1.0]");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test802");
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
        lista0.pos = 11;
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
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test803");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        int int12 = lista10.primeiro;
        int int13 = lista10.pos;
        lista10.pos = ' ';
        java.lang.Object[] objArray16 = lista10.item;
        lista0.item = objArray16;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test804");
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
        java.lang.Object[] objArray46 = lista37.item;
        int int47 = lista37.ultimo;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test805");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test806");
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
        int int75 = lista0.primeiro;
        boolean boolean76 = lista0.vazia();
        boolean boolean77 = lista0.vazia();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 52 + "'", int75 == 52);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test807");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.imprime();
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test808");
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
        java.lang.Object[] objArray27 = lista0.item;
        int int28 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test809");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        int int9 = lista6.pos;
        lista6.pos = (short) 10;
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        java.lang.Object[] objArray14 = lista12.item;
        lista12.primeiro = (short) 0;
        java.lang.Object[] objArray17 = lista12.item;
        int int18 = lista12.primeiro;
        lista6.insere((java.lang.Object) lista12);
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        java.lang.Object obj23 = new java.lang.Object();
        lista20.insere(obj23);
        lista20.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        java.lang.Object obj29 = new java.lang.Object();
        lista26.insere(obj29);
        java.lang.Object[] objArray31 = lista26.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista26.item = objArray34;
        lista20.item = objArray34;
        lista20.primeiro = 0;
        ds.Lista lista39 = new ds.Lista();
        lista39.primeiro = '4';
        java.lang.Object obj42 = new java.lang.Object();
        lista39.insere(obj42);
        lista39.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.imprime();
        java.lang.Object[] objArray47 = lista45.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.imprime();
        java.lang.Object[] objArray50 = lista48.item;
        lista45.item = objArray50;
        boolean boolean52 = lista45.vazia();
        ds.Lista lista53 = new ds.Lista();
        lista53.primeiro = '4';
        lista53.pos = '4';
        lista53.primeiro = '4';
        lista53.imprime();
        java.lang.Object[] objArray61 = lista53.item;
        lista45.item = objArray61;
        lista39.item = objArray61;
        lista20.item = objArray61;
        lista12.item = objArray61;
        lista0.item = objArray61;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test810");
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
        lista0.pos = 0;
        int int58 = lista0.primeiro;
        lista0.pos = 32;
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 52 + "'", int58 == 52);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test811");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.pos = (byte) 1;
        lista0.ultimo = 1;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test812");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 97;
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test813");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        lista0.primeiro = 'a';
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        lista12.pos = '4';
        lista12.primeiro = '4';
        lista12.imprime();
        java.lang.Object[] objArray20 = lista12.item;
        lista0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test814");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.imprime();
        int int5 = lista0.ultimo;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test815");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test816");
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
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test817");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        ds.Lista lista2 = new ds.Lista();
        lista2.pos = 0;
        lista0.insere((java.lang.Object) lista2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test818");
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
        ds.Lista lista19 = new ds.Lista();
        lista19.primeiro = '4';
        java.lang.Object obj22 = new java.lang.Object();
        lista19.insere(obj22);
        lista19.ultimo = 0;
        lista19.pos = 'a';
        lista19.ultimo = 10;
        boolean boolean30 = lista19.vazia();
        java.lang.Object[] objArray31 = lista19.item;
        lista0.insere((java.lang.Object) lista19);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test819");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        java.lang.Object[] objArray15 = null;
        lista11.item = objArray15;
        lista11.pos = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test820");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.ultimo;
        int int11 = lista0.pos;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test821");
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
        lista0.imprime();
        lista0.primeiro = (short) 10;
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test822");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test823");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        int int12 = lista0.ultimo;
        lista0.imprime();
        int int14 = lista0.primeiro;
        int int15 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test824");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.pos = 100;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        lista9.pos = '4';
        lista9.primeiro = '4';
        int int16 = lista9.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        lista17.pos = '4';
        lista17.primeiro = '4';
        boolean boolean24 = lista17.vazia();
        lista17.pos = 100;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        java.lang.Object[] objArray29 = lista27.item;
        lista17.item = objArray29;
        lista9.item = objArray29;
        lista0.insere((java.lang.Object) lista9);
        int int33 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test825");
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
        int int26 = lista0.ultimo;
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test826");
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
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test827");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        lista0.pos = 'a';
        lista0.ultimo = 10;
        boolean boolean11 = lista0.vazia();
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test828");
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
        java.lang.Object[] objArray16 = lista0.item;
        lista0.primeiro = 0;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test829");
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
        lista39.primeiro = '4';
        boolean boolean46 = lista39.vazia();
        lista39.pos = 100;
        ds.Lista lista49 = new ds.Lista();
        lista49.primeiro = '4';
        int int52 = lista49.primeiro;
        lista49.insere((java.lang.Object) (byte) 100);
        ds.Lista lista55 = new ds.Lista();
        lista55.primeiro = '4';
        java.lang.Object obj58 = new java.lang.Object();
        lista55.insere(obj58);
        lista55.imprime();
        ds.Lista lista61 = new ds.Lista();
        lista61.primeiro = '4';
        java.lang.Object obj64 = new java.lang.Object();
        lista61.insere(obj64);
        java.lang.Object[] objArray66 = lista61.item;
        java.lang.Object[] objArray69 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista61.item = objArray69;
        lista55.item = objArray69;
        lista55.imprime();
        ds.Lista lista73 = new ds.Lista();
        lista73.imprime();
        java.lang.Object[] objArray75 = lista73.item;
        lista73.primeiro = (short) 0;
        java.lang.Object[] objArray78 = lista73.item;
        lista55.item = objArray78;
        lista49.item = objArray78;
        lista39.item = objArray78;
        lista0.item = objArray78;
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test830");
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
        lista0.ultimo = (byte) 0;
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
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test831");
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
        int int14 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test832");
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
        lista0.imprime();
        lista0.primeiro = (short) 10;
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        java.lang.Object obj24 = new java.lang.Object();
        lista21.insere(obj24);
        lista21.ultimo = 0;
        int int28 = lista21.primeiro;
        lista0.insere((java.lang.Object) lista21);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test833");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.primeiro = '4';
        int int6 = lista3.primeiro;
        boolean boolean7 = lista3.vazia();
        lista0.insere((java.lang.Object) lista3);
        lista0.primeiro = (short) 0;
        int int11 = lista0.pos;
        boolean boolean12 = lista0.vazia();
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test834");
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
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test835");
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
        java.lang.Object[] objArray48 = lista0.item;
        lista0.ultimo = 0;
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
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test836");
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
        lista0.imprime();
        lista0.ultimo = (byte) -1;
        int int21 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test837");
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
        java.lang.Object[] objArray35 = lista0.item;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test838");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        lista0.insere((java.lang.Object) 0);
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista12.imprime();
        java.lang.Object[] objArray18 = lista12.item;
        lista12.ultimo = (short) 0;
        int int21 = lista12.pos;
        int int22 = lista12.ultimo;
        lista12.primeiro = (byte) 0;
        lista12.ultimo = 35;
        lista0.insere((java.lang.Object) 35);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test839");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = (byte) 100;
        java.lang.Object[] objArray15 = lista5.item;
        int int16 = lista5.pos;
        lista5.ultimo = 11;
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test840");
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
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        lista48.pos = '4';
        lista48.primeiro = '4';
        boolean boolean55 = lista48.vazia();
        lista48.ultimo = (-1);
        lista48.ultimo = 52;
        java.lang.Object[] objArray60 = lista48.item;
        lista0.item = objArray60;
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test841");
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
        lista0.primeiro = (short) 10;
        int int27 = lista0.ultimo;
        boolean boolean28 = lista0.vazia();
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test842");
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
        java.lang.Object[] objArray14 = lista6.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test843");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        lista0.pos = '#';
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
    }
}

