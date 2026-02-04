package ds.seed7992;

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
        int int1 = lista0.primeiro;
        lista0.primeiro = '4';
        int int4 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        lista0.insere((java.lang.Object) lista14);
        lista14.imprime();
        boolean boolean19 = lista14.vazia();
        lista14.pos = ' ';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        int int9 = lista6.ultimo;
        lista6.imprime();
        boolean boolean11 = lista6.vazia();
        lista6.primeiro = '4';
        boolean boolean14 = lista6.vazia();
        int int15 = lista6.pos;
        java.lang.Object obj16 = null;
        lista6.insere(obj16);
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        java.lang.Object[] objArray24 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista18.item = objArray24;
        lista18.pos = 0;
        lista18.primeiro = '#';
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        java.lang.Object[] objArray36 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista30.item = objArray36;
        lista30.primeiro = (short) -1;
        int int40 = lista30.ultimo;
        lista30.pos = (byte) -1;
        java.lang.Object[] objArray43 = lista30.item;
        lista18.item = objArray43;
        lista6.item = objArray43;
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        lista46.imprime();
        java.lang.Object[] objArray49 = lista46.item;
        lista6.insere((java.lang.Object) objArray49);
        lista0.item = objArray49;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = 'a';
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        int int17 = lista14.ultimo;
        int int18 = lista14.pos;
        java.lang.Object[] objArray19 = lista14.item;
        lista0.item = objArray19;
        java.lang.Object[] objArray21 = lista0.item;
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 'a';
        lista0.primeiro = (-1);
        lista0.pos = (short) 1;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        boolean boolean19 = lista17.vazia();
        int int20 = lista17.pos;
        lista17.ultimo = '#';
        int int23 = lista17.primeiro;
        java.lang.Object[] objArray24 = lista17.item;
        lista0.item = objArray24;
        int int26 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        boolean boolean6 = lista4.vazia();
        lista4.primeiro = (byte) 0;
        lista4.ultimo = (byte) 10;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        java.lang.Object[] objArray17 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista11.item = objArray17;
        lista11.pos = 0;
        java.lang.Class<?> wildcardClass21 = lista11.getClass();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        java.lang.Object[] objArray25 = new java.lang.Object[] { wildcardClass21, lista22 };
        lista4.item = objArray25;
        java.lang.Class<?> wildcardClass27 = lista4.getClass();
        lista0.insere((java.lang.Object) wildcardClass27);
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = (short) 1;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.pos = 52;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.imprime();
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        lista0.insere((java.lang.Object) (-1L));
        lista0.pos = 35;
        int int9 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        java.lang.Object[] objArray11 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista5.item = objArray11;
        lista5.pos = 0;
        lista5.imprime();
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista17.item = objArray23;
        lista17.pos = 0;
        java.lang.Class<?> wildcardClass27 = lista17.getClass();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        java.lang.Object[] objArray34 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista28.item = objArray34;
        lista28.primeiro = (short) -1;
        int int38 = lista28.ultimo;
        java.lang.Object[] objArray39 = new java.lang.Object[] { (-1), lista17, lista28 };
        lista5.item = objArray39;
        lista5.ultimo = (byte) 1;
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        java.lang.Object[] objArray49 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista43.item = objArray49;
        int int51 = lista43.pos;
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        lista52.imprime();
        int int55 = lista52.ultimo;
        lista52.imprime();
        boolean boolean57 = lista52.vazia();
        lista43.insere((java.lang.Object) boolean57);
        lista5.insere((java.lang.Object) boolean57);
        java.lang.Object[] objArray60 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[true, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[true, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        lista0.pos = 1;
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        int int12 = lista0.ultimo;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        lista0.insere((java.lang.Object) lista14);
        lista14.imprime();
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray20 = lista14.item;
        lista14.ultimo = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        java.lang.Object[] objArray9 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista3.item = objArray9;
        lista3.primeiro = (short) -1;
        lista3.primeiro = 1;
        int int15 = lista3.ultimo;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        int int19 = lista16.pos;
        int int20 = lista16.pos;
        java.lang.Object[] objArray21 = lista16.item;
        java.lang.Object[] objArray22 = lista16.item;
        lista3.item = objArray22;
        boolean boolean24 = lista3.vazia();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        java.lang.Object[] objArray31 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista25.item = objArray31;
        int int33 = lista25.pos;
        lista25.pos = (byte) 0;
        int int36 = lista25.primeiro;
        lista25.primeiro = 35;
        lista3.insere((java.lang.Object) lista25);
        java.lang.Object[] objArray40 = lista3.item;
        lista3.pos = '#';
        lista0.insere((java.lang.Object) lista3);
        java.lang.Class<?> wildcardClass44 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        lista0.primeiro = 35;
        int int14 = lista0.ultimo;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        java.lang.Object[] objArray22 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista16.item = objArray22;
        lista16.pos = 0;
        lista16.imprime();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        java.lang.Object[] objArray34 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista28.item = objArray34;
        lista28.pos = 0;
        java.lang.Class<?> wildcardClass38 = lista28.getClass();
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        java.lang.Object[] objArray45 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista39.item = objArray45;
        lista39.primeiro = (short) -1;
        int int49 = lista39.ultimo;
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-1), lista28, lista39 };
        lista16.item = objArray50;
        lista16.ultimo = (byte) 1;
        int int54 = lista16.ultimo;
        lista16.imprime();
        int int56 = lista16.primeiro;
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        java.lang.Object[] objArray40 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista34.item = objArray40;
        lista34.pos = 0;
        lista34.imprime();
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        java.lang.Object[] objArray52 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista46.item = objArray52;
        lista46.pos = 0;
        java.lang.Class<?> wildcardClass56 = lista46.getClass();
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        java.lang.Object[] objArray63 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista57.item = objArray63;
        lista57.primeiro = (short) -1;
        int int67 = lista57.ultimo;
        java.lang.Object[] objArray68 = new java.lang.Object[] { (-1), lista46, lista57 };
        lista34.item = objArray68;
        lista34.ultimo = (byte) 1;
        lista34.imprime();
        int int73 = lista34.ultimo;
        lista0.insere((java.lang.Object) lista34);
        java.lang.Object[] objArray75 = lista34.item;
        java.lang.Class<?> wildcardClass76 = objArray75.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = (short) 1;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.pos = 52;
        lista0.ultimo = (byte) 10;
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 1, 1, 0]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.imprime();
        java.lang.Object[] objArray16 = lista13.item;
        int int17 = lista13.primeiro;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        int int21 = lista18.pos;
        lista18.ultimo = '#';
        int int24 = lista18.primeiro;
        lista18.ultimo = 100;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        boolean boolean29 = lista27.vazia();
        int int30 = lista27.primeiro;
        lista18.insere((java.lang.Object) lista27);
        lista18.ultimo = 35;
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.imprime();
        int int37 = lista34.ultimo;
        lista34.imprime();
        boolean boolean39 = lista34.vazia();
        lista34.primeiro = '4';
        lista34.imprime();
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.primeiro = (short) 100;
        java.lang.Object[] objArray47 = lista43.item;
        lista34.item = objArray47;
        lista18.item = objArray47;
        lista13.item = objArray47;
        lista0.item = objArray47;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        boolean boolean12 = lista0.vazia();
        lista0.primeiro = (short) 100;
        int int15 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        java.lang.Object[] objArray12 = lista5.item;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista13.item = objArray19;
        lista13.pos = 0;
        lista13.imprime();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        java.lang.Object[] objArray31 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista25.item = objArray31;
        lista25.pos = 0;
        java.lang.Class<?> wildcardClass35 = lista25.getClass();
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        java.lang.Object[] objArray42 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista36.item = objArray42;
        lista36.primeiro = (short) -1;
        int int46 = lista36.ultimo;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (-1), lista25, lista36 };
        lista13.item = objArray47;
        lista5.insere((java.lang.Object) lista13);
        lista5.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = (short) 100;
        java.lang.Object[] objArray16 = lista12.item;
        lista5.item = objArray16;
        boolean boolean18 = lista5.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        int int22 = lista19.pos;
        int int23 = lista19.pos;
        lista19.pos = 1;
        lista19.imprime();
        lista19.ultimo = '4';
        lista5.insere((java.lang.Object) '4');
        int int30 = lista5.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        lista0.imprime();
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.primeiro = '#';
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int6 = lista0.primeiro;
        lista0.ultimo = 97;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        java.lang.Object[] objArray16 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista10.item = objArray16;
        int int18 = lista10.pos;
        lista10.pos = (byte) 0;
        java.lang.Object[] objArray21 = lista10.item;
        lista10.ultimo = (byte) 100;
        java.lang.Object[] objArray24 = lista10.item;
        java.lang.Object[] objArray25 = null;
        lista10.item = objArray25;
        int int27 = lista10.primeiro;
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        int int11 = lista0.primeiro;
        lista0.imprime();
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 100;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        lista7.pos = 0;
        java.lang.Class<?> wildcardClass17 = lista7.getClass();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass17, lista18 };
        lista0.item = objArray21;
        lista0.ultimo = (short) -1;
        int int25 = lista0.primeiro;
        boolean boolean26 = lista0.vazia();
        lista0.imprime();
        int int28 = lista0.pos;
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.imprime();
        int int5 = lista0.primeiro;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        lista0.primeiro = (byte) -1;
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        lista25.imprime();
        int int28 = lista25.ultimo;
        lista25.imprime();
        boolean boolean30 = lista25.vazia();
        lista25.primeiro = '4';
        boolean boolean33 = lista25.vazia();
        int int34 = lista25.pos;
        java.lang.Object obj35 = null;
        lista25.insere(obj35);
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        java.lang.Object[] objArray43 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista37.item = objArray43;
        lista37.pos = 0;
        lista37.primeiro = '#';
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        java.lang.Object[] objArray55 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista49.item = objArray55;
        lista49.primeiro = (short) -1;
        int int59 = lista49.ultimo;
        lista49.pos = (byte) -1;
        java.lang.Object[] objArray62 = lista49.item;
        lista37.item = objArray62;
        lista25.item = objArray62;
        java.lang.Object obj65 = null;
        lista25.insere(obj65);
        java.lang.Object obj67 = null;
        lista25.insere(obj67);
        int int69 = lista25.primeiro;
        java.lang.Class<?> wildcardClass70 = lista25.getClass();
        lista0.insere((java.lang.Object) wildcardClass70);
        java.lang.Object[] objArray72 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[, null, null, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[, null, null, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[, null, null, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[, null, null, 0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 52 + "'", int69 == 52);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        lista0.primeiro = 35;
        int int14 = lista0.ultimo;
        lista0.pos = (byte) 1;
        int int17 = lista0.ultimo;
        lista0.primeiro = 52;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista8.item = objArray14;
        lista8.pos = 0;
        lista8.imprime();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista20.pos = 0;
        java.lang.Class<?> wildcardClass30 = lista20.getClass();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista31.item = objArray37;
        lista31.primeiro = (short) -1;
        int int41 = lista31.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1), lista20, lista31 };
        lista8.item = objArray42;
        lista8.ultimo = (byte) 1;
        lista8.imprime();
        int int47 = lista8.ultimo;
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        boolean boolean50 = lista48.vazia();
        int int51 = lista48.pos;
        int int52 = lista48.pos;
        java.lang.Object[] objArray53 = lista48.item;
        lista8.item = objArray53;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        lista55.imprime();
        int int58 = lista55.ultimo;
        int int59 = lista55.pos;
        java.lang.Object[] objArray60 = lista55.item;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        java.lang.Object[] objArray67 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista61.item = objArray67;
        lista55.item = objArray67;
        lista8.item = objArray67;
        lista0.insere((java.lang.Object) lista8);
        lista8.primeiro = 1;
        int int74 = lista8.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        lista0.imprime();
        int int5 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 'a';
        lista0.primeiro = (-1);
        int int15 = lista0.pos;
        java.lang.Object[] objArray16 = lista0.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[, 1, 1, 0]");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.primeiro = (short) 100;
        java.lang.Object[] objArray15 = lista11.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista17.item = objArray23;
        int int25 = lista17.pos;
        lista17.pos = (byte) 0;
        java.lang.Object[] objArray28 = lista17.item;
        lista17.ultimo = 'a';
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        boolean boolean33 = lista31.vazia();
        lista31.primeiro = (byte) 0;
        lista31.pos = (-1);
        int int38 = lista31.primeiro;
        int int39 = lista31.ultimo;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        java.lang.Object[] objArray46 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista40.item = objArray46;
        int int48 = lista40.pos;
        lista40.pos = (byte) 0;
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        boolean boolean53 = lista51.vazia();
        int int54 = lista51.pos;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        java.lang.Object[] objArray61 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista55.item = objArray61;
        lista55.primeiro = (short) -1;
        lista55.primeiro = 1;
        int int67 = lista55.ultimo;
        ds.Lista lista68 = new ds.Lista();
        boolean boolean69 = lista68.vazia();
        boolean boolean70 = lista68.vazia();
        int int71 = lista68.pos;
        int int72 = lista68.pos;
        java.lang.Object[] objArray73 = lista68.item;
        java.lang.Object[] objArray74 = lista68.item;
        lista55.item = objArray74;
        lista51.item = objArray74;
        lista40.item = objArray74;
        lista31.item = objArray74;
        lista17.item = objArray74;
        java.lang.Object[] objArray80 = lista17.item;
        lista0.insere((java.lang.Object) lista17);
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        int int42 = lista0.pos;
        lista0.imprime();
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.imprime();
        int int47 = lista44.ultimo;
        lista44.imprime();
        boolean boolean49 = lista44.vazia();
        lista44.primeiro = 0;
        lista44.primeiro = '4';
        lista0.insere((java.lang.Object) lista44);
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        lista55.imprime();
        int int58 = lista55.ultimo;
        int int59 = lista55.pos;
        java.lang.Object[] objArray60 = lista55.item;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        java.lang.Object[] objArray67 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista61.item = objArray67;
        lista55.item = objArray67;
        lista55.primeiro = (byte) 0;
        lista55.ultimo = '4';
        lista55.primeiro = (short) 100;
        java.lang.Object[] objArray76 = lista55.item;
        lista0.item = objArray76;
        lista0.pos = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[, 1, 1, 0]");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.imprime();
        int int7 = lista0.pos;
        lista0.ultimo = 1;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = 'a';
        lista0.pos = ' ';
        int int16 = lista0.pos;
        int int17 = lista0.pos;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        java.lang.Object[] objArray24 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista18.item = objArray24;
        int int26 = lista18.pos;
        lista18.pos = (byte) 0;
        int int29 = lista18.primeiro;
        boolean boolean30 = lista18.vazia();
        int int31 = lista18.pos;
        int int32 = lista18.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) int32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass42 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        int int13 = lista0.pos;
        lista0.primeiro = 0;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        java.lang.Object[] objArray22 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista16.item = objArray22;
        int int24 = lista16.pos;
        lista0.insere((java.lang.Object) int24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.primeiro = ' ';
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        lista10.ultimo = 10;
        lista10.insere((java.lang.Object) (-1L));
        int int17 = lista10.ultimo;
        java.lang.Object[] objArray18 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        int int23 = lista20.pos;
        lista20.ultimo = '#';
        int int26 = lista20.primeiro;
        lista20.ultimo = 100;
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        boolean boolean31 = lista29.vazia();
        int int32 = lista29.primeiro;
        lista20.insere((java.lang.Object) lista29);
        lista20.ultimo = 35;
        java.lang.Object[] objArray36 = lista20.item;
        lista10.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray38 = lista10.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        lista0.primeiro = (byte) 10;
        lista0.ultimo = 10;
        java.lang.Object[] objArray44 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.primeiro = 10;
        int int38 = lista0.primeiro;
        int int39 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        lista0.primeiro = 35;
        int int14 = lista0.ultimo;
        boolean boolean15 = lista0.vazia();
        lista0.ultimo = 52;
        boolean boolean18 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.primeiro;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        int int38 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
        int int41 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        int int42 = lista0.pos;
        lista0.imprime();
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.imprime();
        int int47 = lista44.ultimo;
        lista44.imprime();
        boolean boolean49 = lista44.vazia();
        lista44.primeiro = 0;
        lista44.primeiro = '4';
        lista0.insere((java.lang.Object) lista44);
        boolean boolean55 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 'a';
        lista0.primeiro = (short) 1;
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        boolean boolean11 = lista0.vazia();
        lista0.ultimo = (short) 0;
        java.lang.Object[] objArray14 = lista0.item;
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        lista9.primeiro = (byte) 0;
        lista9.pos = (-1);
        int int16 = lista9.primeiro;
        int int17 = lista9.ultimo;
        lista0.insere((java.lang.Object) lista9);
        lista0.pos = '4';
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        java.lang.Object[] objArray27 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista21.item = objArray27;
        lista21.primeiro = (short) -1;
        lista0.insere((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[, 1, 1, 0]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista38.item = objArray44;
        int int46 = lista38.pos;
        ds.Lista lista47 = new ds.Lista();
        boolean boolean48 = lista47.vazia();
        lista47.imprime();
        int int50 = lista47.ultimo;
        lista47.imprime();
        boolean boolean52 = lista47.vazia();
        lista38.insere((java.lang.Object) boolean52);
        lista0.insere((java.lang.Object) boolean52);
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        lista55.primeiro = (byte) 0;
        ds.Lista lista60 = new ds.Lista();
        boolean boolean61 = lista60.vazia();
        boolean boolean62 = lista60.vazia();
        lista60.primeiro = (byte) 0;
        lista55.insere((java.lang.Object) lista60);
        boolean boolean66 = lista60.vazia();
        ds.Lista lista67 = new ds.Lista();
        boolean boolean68 = lista67.vazia();
        lista67.primeiro = (short) 100;
        java.lang.Object[] objArray71 = lista67.item;
        lista60.item = objArray71;
        lista0.item = objArray71;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[true, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[true, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        lista0.insere((java.lang.Object) (-1L));
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.primeiro = (short) 100;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 0;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        lista15.pos = 0;
        lista15.imprime();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista27.item = objArray33;
        lista27.pos = 0;
        java.lang.Class<?> wildcardClass37 = lista27.getClass();
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista38.item = objArray44;
        lista38.primeiro = (short) -1;
        int int48 = lista38.ultimo;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1), lista27, lista38 };
        lista15.item = objArray49;
        lista0.insere((java.lang.Object) lista15);
        int int52 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 'a';
        lista0.primeiro = (-1);
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.imprime();
        int int18 = lista15.ultimo;
        lista15.imprime();
        boolean boolean20 = lista15.vazia();
        lista15.primeiro = '4';
        boolean boolean23 = lista15.vazia();
        int int24 = lista15.pos;
        boolean boolean25 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean25);
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista8.item = objArray14;
        lista8.pos = 0;
        lista8.imprime();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista20.pos = 0;
        java.lang.Class<?> wildcardClass30 = lista20.getClass();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista31.item = objArray37;
        lista31.primeiro = (short) -1;
        int int41 = lista31.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1), lista20, lista31 };
        lista8.item = objArray42;
        lista8.ultimo = (byte) 1;
        lista8.imprime();
        int int47 = lista8.ultimo;
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        boolean boolean50 = lista48.vazia();
        int int51 = lista48.pos;
        int int52 = lista48.pos;
        java.lang.Object[] objArray53 = lista48.item;
        lista8.item = objArray53;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        lista55.imprime();
        int int58 = lista55.ultimo;
        int int59 = lista55.pos;
        java.lang.Object[] objArray60 = lista55.item;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        java.lang.Object[] objArray67 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista61.item = objArray67;
        lista55.item = objArray67;
        lista8.item = objArray67;
        lista0.insere((java.lang.Object) lista8);
        int int72 = lista0.ultimo;
        lista0.pos = (byte) 10;
        java.lang.Object[] objArray75 = lista0.item;
        java.lang.Class<?> wildcardClass76 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 36 + "'", int72 == 36);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        java.lang.Object[] objArray9 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista3.item = objArray9;
        lista3.primeiro = (short) -1;
        lista3.primeiro = 1;
        int int15 = lista3.ultimo;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        int int19 = lista16.pos;
        int int20 = lista16.pos;
        java.lang.Object[] objArray21 = lista16.item;
        java.lang.Object[] objArray22 = lista16.item;
        lista3.item = objArray22;
        boolean boolean24 = lista3.vazia();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        java.lang.Object[] objArray31 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista25.item = objArray31;
        int int33 = lista25.pos;
        lista25.pos = (byte) 0;
        int int36 = lista25.primeiro;
        lista25.primeiro = 35;
        lista3.insere((java.lang.Object) lista25);
        java.lang.Object[] objArray40 = lista3.item;
        lista3.pos = '#';
        lista0.insere((java.lang.Object) lista3);
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        lista0.ultimo = '#';
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        int int10 = lista8.pos;
        java.lang.Object[] objArray11 = lista8.item;
        lista0.insere((java.lang.Object) objArray11);
        int int13 = lista0.ultimo;
        int int14 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, 1, 1, 0]");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        int int17 = lista14.primeiro;
        int int18 = lista14.ultimo;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista19.item = objArray26;
        java.lang.Object[] objArray29 = lista19.item;
        lista14.item = objArray29;
        lista0.insere((java.lang.Object) lista14);
        java.lang.Object[] objArray32 = lista14.item;
        java.lang.Object[] objArray33 = lista14.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = (short) 100;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.pos;
        lista0.ultimo = 11;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista1.item = objArray7;
        lista0.item = objArray7;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (-1);
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.primeiro;
        lista0.pos = 35;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.imprime();
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        lista0.primeiro = (short) 0;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        int int13 = lista0.pos;
        lista0.primeiro = 0;
        int int16 = lista0.pos;
        lista0.primeiro = 10;
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        lista7.pos = 0;
        java.lang.Class<?> wildcardClass17 = lista7.getClass();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass17, lista18 };
        lista0.item = objArray21;
        lista0.ultimo = (short) -1;
        int int25 = lista0.primeiro;
        boolean boolean26 = lista0.vazia();
        lista0.imprime();
        int int28 = lista0.pos;
        lista0.ultimo = 52;
        int int31 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        java.lang.Object[] objArray12 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista6.item = objArray12;
        lista0.item = objArray12;
        lista0.primeiro = (byte) 0;
        int int17 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = (short) -1;
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        lista0.insere((java.lang.Object) (-1L));
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        int int15 = lista7.pos;
        lista7.pos = (byte) 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        int int21 = lista18.pos;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        java.lang.Object[] objArray28 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista22.item = objArray28;
        lista22.primeiro = (short) -1;
        lista22.primeiro = 1;
        int int34 = lista22.ultimo;
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        int int38 = lista35.pos;
        int int39 = lista35.pos;
        java.lang.Object[] objArray40 = lista35.item;
        java.lang.Object[] objArray41 = lista35.item;
        lista22.item = objArray41;
        lista18.item = objArray41;
        lista7.item = objArray41;
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        java.lang.Object[] objArray51 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista45.item = objArray51;
        lista45.pos = 0;
        lista45.primeiro = '#';
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        java.lang.Object[] objArray63 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista57.item = objArray63;
        lista57.primeiro = (short) -1;
        int int67 = lista57.ultimo;
        lista57.pos = (byte) -1;
        java.lang.Object[] objArray70 = lista57.item;
        lista45.item = objArray70;
        lista7.item = objArray70;
        lista0.insere((java.lang.Object) objArray70);
        boolean boolean74 = lista0.vazia();
        ds.Lista lista75 = new ds.Lista();
        boolean boolean76 = lista75.vazia();
        boolean boolean77 = lista75.vazia();
        lista75.primeiro = (byte) 0;
        int int80 = lista75.pos;
        lista75.pos = 0;
        lista0.insere((java.lang.Object) 0);
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.pos;
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        boolean boolean35 = lista33.vazia();
        lista33.primeiro = (byte) 0;
        lista33.ultimo = (byte) 10;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        java.lang.Object[] objArray46 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista40.item = objArray46;
        lista40.pos = 0;
        java.lang.Class<?> wildcardClass50 = lista40.getClass();
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        boolean boolean53 = lista51.vazia();
        java.lang.Object[] objArray54 = new java.lang.Object[] { wildcardClass50, lista51 };
        lista33.item = objArray54;
        lista0.item = objArray54;
        lista0.primeiro = '#';
        java.lang.Class<?> wildcardClass59 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.primeiro = (short) 100;
        java.lang.Object[] objArray15 = lista11.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista17.item = objArray23;
        int int25 = lista17.pos;
        lista17.pos = (byte) 0;
        java.lang.Object[] objArray28 = lista17.item;
        lista17.ultimo = 'a';
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        boolean boolean33 = lista31.vazia();
        lista31.primeiro = (byte) 0;
        lista31.pos = (-1);
        int int38 = lista31.primeiro;
        int int39 = lista31.ultimo;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        java.lang.Object[] objArray46 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista40.item = objArray46;
        int int48 = lista40.pos;
        lista40.pos = (byte) 0;
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        boolean boolean53 = lista51.vazia();
        int int54 = lista51.pos;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        java.lang.Object[] objArray61 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista55.item = objArray61;
        lista55.primeiro = (short) -1;
        lista55.primeiro = 1;
        int int67 = lista55.ultimo;
        ds.Lista lista68 = new ds.Lista();
        boolean boolean69 = lista68.vazia();
        boolean boolean70 = lista68.vazia();
        int int71 = lista68.pos;
        int int72 = lista68.pos;
        java.lang.Object[] objArray73 = lista68.item;
        java.lang.Object[] objArray74 = lista68.item;
        lista55.item = objArray74;
        lista51.item = objArray74;
        lista40.item = objArray74;
        lista31.item = objArray74;
        lista17.item = objArray74;
        java.lang.Object[] objArray80 = lista17.item;
        lista0.insere((java.lang.Object) lista17);
        lista17.pos = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Class<?> wildcardClass40 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista1.item = objArray7;
        lista0.item = objArray7;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        int int15 = lista12.pos;
        lista12.ultimo = '#';
        int int18 = lista12.primeiro;
        java.lang.Object[] objArray19 = lista12.item;
        lista0.item = objArray19;
        int int21 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.imprime();
        lista0.pos = 36;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        lista0.imprime();
        lista0.primeiro = (-1);
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        int int7 = lista0.primeiro;
        java.lang.Object[] objArray8 = null;
        lista0.item = objArray8;
        lista0.primeiro = (byte) 0;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.primeiro = (short) -1;
        lista12.ultimo = '#';
        lista12.ultimo = (short) 10;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        java.lang.Object[] objArray32 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista26.item = objArray32;
        lista26.pos = 0;
        lista26.primeiro = '#';
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista38.item = objArray44;
        lista38.primeiro = (short) -1;
        int int48 = lista38.ultimo;
        lista38.pos = (byte) -1;
        java.lang.Object[] objArray51 = lista38.item;
        lista26.item = objArray51;
        lista12.item = objArray51;
        java.lang.Object[] objArray54 = lista12.item;
        lista0.item = objArray54;
        lista0.pos = (byte) 1;
        int int58 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        lista0.ultimo = (byte) -1;
        java.lang.Object[] objArray14 = lista0.item;
        lista0.primeiro = '4';
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista17.item = objArray23;
        int int25 = lista17.pos;
        lista17.pos = (byte) 0;
        int int28 = lista17.ultimo;
        lista17.pos = (byte) 100;
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.imprime();
        lista17.insere((java.lang.Object) lista31);
        lista17.primeiro = 100;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = (byte) 100;
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = null;
        lista0.item = objArray15;
        int int17 = lista0.primeiro;
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 0;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        lista15.pos = 0;
        lista15.imprime();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista27.item = objArray33;
        lista27.pos = 0;
        java.lang.Class<?> wildcardClass37 = lista27.getClass();
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista38.item = objArray44;
        lista38.primeiro = (short) -1;
        int int48 = lista38.ultimo;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1), lista27, lista38 };
        lista15.item = objArray49;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        java.lang.Object[] objArray58 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista52.item = objArray58;
        int int60 = lista52.pos;
        lista52.pos = (byte) 0;
        int int63 = lista52.ultimo;
        lista52.pos = (byte) 100;
        lista52.imprime();
        int int67 = lista52.ultimo;
        int int68 = lista52.primeiro;
        int int69 = lista52.ultimo;
        lista0.insere((java.lang.Object) lista52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.primeiro = ' ';
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        lista10.ultimo = 10;
        lista10.insere((java.lang.Object) (-1L));
        int int17 = lista10.ultimo;
        java.lang.Object[] objArray18 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        int int23 = lista20.pos;
        lista20.ultimo = '#';
        int int26 = lista20.primeiro;
        lista20.ultimo = 100;
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        boolean boolean31 = lista29.vazia();
        int int32 = lista29.primeiro;
        lista20.insere((java.lang.Object) lista29);
        lista20.ultimo = 35;
        java.lang.Object[] objArray36 = lista20.item;
        lista10.insere((java.lang.Object) lista20);
        int int38 = lista10.ultimo;
        lista10.primeiro = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 12 + "'", int38 == 12);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        lista7.pos = 0;
        java.lang.Class<?> wildcardClass17 = lista7.getClass();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass17, lista18 };
        lista0.item = objArray21;
        lista0.ultimo = (short) -1;
        int int25 = lista0.primeiro;
        boolean boolean26 = lista0.vazia();
        lista0.imprime();
        int int28 = lista0.pos;
        lista0.ultimo = 52;
        boolean boolean31 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (-1);
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        int int39 = lista0.ultimo;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        boolean boolean42 = lista40.vazia();
        int int43 = lista40.pos;
        int int44 = lista40.pos;
        java.lang.Object[] objArray45 = lista40.item;
        lista0.item = objArray45;
        java.lang.Object[] objArray47 = lista0.item;
        int int48 = lista0.primeiro;
        lista0.ultimo = (byte) 1;
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        int int7 = lista0.primeiro;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.pos = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.primeiro = (byte) 0;
        lista8.ultimo = (byte) 10;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        lista15.pos = 0;
        java.lang.Class<?> wildcardClass25 = lista15.getClass();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        boolean boolean28 = lista26.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { wildcardClass25, lista26 };
        lista8.item = objArray29;
        lista8.ultimo = (short) -1;
        int int33 = lista8.primeiro;
        boolean boolean34 = lista8.vazia();
        lista8.imprime();
        int int36 = lista8.pos;
        lista0.insere((java.lang.Object) int36);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = ' ';
        int int4 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.imprime();
        int int3 = lista0.pos;
        lista0.imprime();
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        lista0.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = (short) 1;
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        int int13 = lista0.pos;
        lista0.primeiro = 0;
        int int16 = lista0.pos;
        lista0.primeiro = 10;
        int int19 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        lista0.pos = 1;
        lista0.ultimo = (short) 1;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.imprime();
        int int12 = lista9.ultimo;
        lista9.imprime();
        boolean boolean14 = lista9.vazia();
        lista9.primeiro = '4';
        boolean boolean17 = lista9.vazia();
        int int18 = lista9.pos;
        java.lang.Object obj19 = null;
        lista9.insere(obj19);
        lista9.ultimo = 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        lista23.pos = (byte) -1;
        int int36 = lista23.pos;
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        boolean boolean39 = lista37.vazia();
        int int40 = lista37.primeiro;
        int int41 = lista37.ultimo;
        ds.Lista lista42 = new ds.Lista();
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        java.lang.Object[] objArray49 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista43.item = objArray49;
        lista42.item = objArray49;
        java.lang.Object[] objArray52 = lista42.item;
        lista37.item = objArray52;
        lista23.insere((java.lang.Object) lista37);
        java.lang.Object[] objArray55 = lista37.item;
        lista9.item = objArray55;
        lista0.insere((java.lang.Object) lista9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[, 1, 1, 0]");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.primeiro = '#';
        int int12 = lista0.primeiro;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 36;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista13.item = objArray19;
        lista13.primeiro = (short) -1;
        int int23 = lista13.ultimo;
        lista13.pos = (byte) -1;
        lista13.primeiro = (short) 100;
        lista13.pos = (short) 10;
        lista13.pos = 0;
        boolean boolean32 = lista13.vazia();
        int int33 = lista13.ultimo;
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        java.lang.Object[] objArray40 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista34.item = objArray40;
        int int42 = lista34.pos;
        lista34.pos = (byte) 0;
        java.lang.Object[] objArray45 = lista34.item;
        lista34.ultimo = (byte) 100;
        int int48 = lista34.primeiro;
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        int int52 = lista49.pos;
        int int53 = lista49.pos;
        int int54 = lista49.ultimo;
        lista49.imprime();
        java.lang.Object[] objArray56 = lista49.item;
        lista34.item = objArray56;
        lista13.item = objArray56;
        lista0.item = objArray56;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        lista0.primeiro = (byte) -1;
        lista0.ultimo = 100;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista27.item = objArray33;
        int int35 = lista27.pos;
        lista27.pos = (byte) 0;
        java.lang.Object[] objArray38 = lista27.item;
        lista27.ultimo = 'a';
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        lista41.imprime();
        int int44 = lista41.ultimo;
        int int45 = lista41.pos;
        java.lang.Object[] objArray46 = lista41.item;
        lista27.item = objArray46;
        java.lang.Object[] objArray48 = lista27.item;
        lista0.item = objArray48;
        java.lang.Class<?> wildcardClass50 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        java.lang.Object[] objArray28 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista22.item = objArray28;
        int int30 = lista22.pos;
        lista22.pos = (byte) 0;
        int int33 = lista22.primeiro;
        lista22.primeiro = 35;
        lista0.insere((java.lang.Object) lista22);
        lista22.imprime();
        int int38 = lista22.pos;
        lista22.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.ultimo = '#';
        int int12 = lista0.ultimo;
        int int13 = lista0.ultimo;
        int int14 = lista0.pos;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.ultimo = '#';
        lista0.ultimo = (short) 10;
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        int int23 = lista15.pos;
        lista15.pos = (byte) 0;
        lista15.pos = 'a';
        lista15.primeiro = (-1);
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        lista30.primeiro = (byte) 0;
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        lista35.primeiro = (byte) 0;
        lista30.insere((java.lang.Object) lista35);
        boolean boolean41 = lista35.vazia();
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        java.lang.Object[] objArray48 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista42.item = objArray48;
        lista42.pos = 0;
        lista42.imprime();
        ds.Lista lista54 = new ds.Lista();
        boolean boolean55 = lista54.vazia();
        java.lang.Object[] objArray60 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista54.item = objArray60;
        lista54.pos = 0;
        java.lang.Class<?> wildcardClass64 = lista54.getClass();
        ds.Lista lista65 = new ds.Lista();
        boolean boolean66 = lista65.vazia();
        java.lang.Object[] objArray71 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista65.item = objArray71;
        lista65.primeiro = (short) -1;
        int int75 = lista65.ultimo;
        java.lang.Object[] objArray76 = new java.lang.Object[] { (-1), lista54, lista65 };
        lista42.item = objArray76;
        lista35.item = objArray76;
        lista15.item = objArray76;
        lista0.item = objArray76;
        lista0.pos = 36;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 0;
        lista0.pos = (byte) 100;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        java.lang.Object[] objArray12 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista6.item = objArray12;
        lista6.primeiro = (short) -1;
        lista6.ultimo = '#';
        lista6.ultimo = (short) 10;
        int int20 = lista6.pos;
        java.lang.Object[] objArray21 = lista6.item;
        boolean boolean22 = lista6.vazia();
        lista0.insere((java.lang.Object) boolean22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        lista0.primeiro = 35;
        int int14 = lista0.ultimo;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        int int19 = lista16.ultimo;
        lista16.imprime();
        boolean boolean21 = lista16.vazia();
        lista16.primeiro = '4';
        boolean boolean24 = lista16.vazia();
        int int25 = lista16.pos;
        java.lang.Object obj26 = null;
        lista16.insere(obj26);
        java.lang.Object[] objArray28 = lista16.item;
        lista0.item = objArray28;
        lista0.pos = 1;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        lista0.insere((java.lang.Object) (-1L));
        lista0.pos = 35;
        int int9 = lista0.ultimo;
        lista0.ultimo = 0;
        int int12 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        lista0.imprime();
        lista0.primeiro = (-1);
        boolean boolean10 = lista0.vazia();
        lista0.pos = (short) 100;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista13.item = objArray19;
        int int21 = lista13.pos;
        lista13.pos = (byte) 0;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        int int27 = lista24.pos;
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        java.lang.Object[] objArray34 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista28.item = objArray34;
        lista28.primeiro = (short) -1;
        lista28.primeiro = 1;
        int int40 = lista28.ultimo;
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        boolean boolean43 = lista41.vazia();
        int int44 = lista41.pos;
        int int45 = lista41.pos;
        java.lang.Object[] objArray46 = lista41.item;
        java.lang.Object[] objArray47 = lista41.item;
        lista28.item = objArray47;
        lista24.item = objArray47;
        lista13.item = objArray47;
        lista0.item = objArray47;
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        java.lang.Object[] objArray58 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista52.item = objArray58;
        lista52.pos = 0;
        lista52.primeiro = '#';
        ds.Lista lista64 = new ds.Lista();
        boolean boolean65 = lista64.vazia();
        boolean boolean66 = lista64.vazia();
        int int67 = lista64.pos;
        int int68 = lista64.pos;
        lista52.insere((java.lang.Object) int68);
        int int70 = lista52.ultimo;
        lista0.insere((java.lang.Object) int70);
        java.lang.Object[] objArray72 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[-1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[-1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 'a';
        lista0.primeiro = (-1);
        lista0.pos = (short) 1;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        boolean boolean19 = lista17.vazia();
        int int20 = lista17.pos;
        lista17.ultimo = '#';
        int int23 = lista17.primeiro;
        java.lang.Object[] objArray24 = lista17.item;
        lista0.item = objArray24;
        int int26 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista27.item = objArray33;
        lista27.primeiro = (short) -1;
        lista27.primeiro = 1;
        java.lang.Object[] objArray39 = lista27.item;
        lista22.item = objArray39;
        lista22.primeiro = 100;
        lista22.primeiro = 97;
        int int45 = lista22.ultimo;
        lista0.insere((java.lang.Object) lista22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        int int36 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        lista0.primeiro = (byte) 100;
        java.lang.Object[] objArray23 = lista0.item;
        int int24 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        boolean boolean11 = lista0.vazia();
        lista0.ultimo = (short) 0;
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.imprime();
        int int18 = lista15.ultimo;
        lista15.imprime();
        boolean boolean20 = lista15.vazia();
        lista15.primeiro = '4';
        boolean boolean23 = lista15.vazia();
        int int24 = lista15.pos;
        java.lang.Object obj25 = null;
        lista15.insere(obj25);
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista27.item = objArray33;
        lista27.pos = 0;
        lista27.primeiro = '#';
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        java.lang.Object[] objArray45 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista39.item = objArray45;
        lista39.primeiro = (short) -1;
        int int49 = lista39.ultimo;
        lista39.pos = (byte) -1;
        java.lang.Object[] objArray52 = lista39.item;
        lista27.item = objArray52;
        lista15.item = objArray52;
        java.lang.Object obj55 = null;
        lista15.insere(obj55);
        int int57 = lista15.pos;
        lista15.ultimo = '#';
        lista0.insere((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        int int42 = lista0.pos;
        boolean boolean43 = lista0.vazia();
        int int44 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.primeiro;
        int int23 = lista0.ultimo;
        int int24 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        int int39 = lista0.ultimo;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        boolean boolean42 = lista40.vazia();
        int int43 = lista40.pos;
        int int44 = lista40.pos;
        java.lang.Object[] objArray45 = lista40.item;
        lista0.item = objArray45;
        java.lang.Object[] objArray47 = lista0.item;
        lista0.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        lista0.primeiro = 35;
        int int14 = lista0.ultimo;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        int int19 = lista16.ultimo;
        lista16.imprime();
        boolean boolean21 = lista16.vazia();
        lista16.primeiro = '4';
        boolean boolean24 = lista16.vazia();
        int int25 = lista16.pos;
        java.lang.Object obj26 = null;
        lista16.insere(obj26);
        java.lang.Object[] objArray28 = lista16.item;
        lista0.item = objArray28;
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        lista0.pos = (-1);
        lista0.ultimo = 11;
        lista0.primeiro = 1;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.imprime();
        java.lang.Object[] objArray21 = lista18.item;
        int int22 = lista18.ultimo;
        lista0.insere((java.lang.Object) int22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        lista0.primeiro = 35;
        int int14 = lista0.ultimo;
        lista0.pos = (byte) 1;
        lista0.pos = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        lista0.ultimo = (byte) -1;
        lista0.pos = 1;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        lista0.ultimo = (byte) -1;
        int int14 = lista0.pos;
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.primeiro = '#';
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, 1, 1, 0]");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        lista0.imprime();
        lista0.primeiro = 97;
        int int25 = lista0.pos;
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        lista0.imprime();
        lista0.primeiro = (-1);
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        int int7 = lista4.ultimo;
        int int8 = lista4.pos;
        int int9 = lista4.primeiro;
        lista4.ultimo = '#';
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.ultimo;
        int int14 = lista12.pos;
        java.lang.Object[] objArray15 = lista12.item;
        lista4.insere((java.lang.Object) objArray15);
        lista0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        lista0.ultimo = (byte) -1;
        int int14 = lista0.ultimo;
        lista0.imprime();
        int int16 = lista0.pos;
        java.lang.Object[] objArray17 = lista0.item;
        boolean boolean18 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.imprime();
        int int14 = lista11.ultimo;
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.primeiro = '4';
        lista11.imprime();
        int int20 = lista11.pos;
        boolean boolean21 = lista11.vazia();
        int int22 = lista11.pos;
        java.lang.Object[] objArray23 = lista11.item;
        lista0.item = objArray23;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        int int38 = lista0.ultimo;
        lista0.imprime();
        int int40 = lista0.ultimo;
        int int41 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.pos = (byte) -1;
        lista0.pos = (short) 100;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        java.lang.Object[] objArray11 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista5.item = objArray11;
        lista5.primeiro = (short) -1;
        lista5.primeiro = 1;
        java.lang.Object[] objArray17 = lista5.item;
        lista0.item = objArray17;
        lista0.primeiro = 100;
        lista0.primeiro = 97;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[, 1, 1, 0]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        boolean boolean4 = lista2.vazia();
        int int5 = lista2.pos;
        lista2.ultimo = '#';
        int int8 = lista2.primeiro;
        lista2.ultimo = 100;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        int int14 = lista11.primeiro;
        lista2.insere((java.lang.Object) lista11);
        lista2.ultimo = 35;
        java.lang.Object[] objArray18 = lista2.item;
        lista0.item = objArray18;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        int int12 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        lista9.ultimo = 11;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.primeiro = ' ';
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        lista10.ultimo = 10;
        lista10.insere((java.lang.Object) (-1L));
        int int17 = lista10.ultimo;
        java.lang.Object[] objArray18 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista8.item = objArray14;
        lista8.pos = 0;
        lista8.imprime();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista20.pos = 0;
        java.lang.Class<?> wildcardClass30 = lista20.getClass();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista31.item = objArray37;
        lista31.primeiro = (short) -1;
        int int41 = lista31.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1), lista20, lista31 };
        lista8.item = objArray42;
        lista8.ultimo = (byte) 1;
        int int46 = lista8.ultimo;
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        lista0.insere((java.lang.Object) 0);
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        java.lang.Object[] objArray40 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista34.item = objArray40;
        lista34.pos = 0;
        lista34.imprime();
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        java.lang.Object[] objArray52 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista46.item = objArray52;
        lista46.pos = 0;
        java.lang.Class<?> wildcardClass56 = lista46.getClass();
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        java.lang.Object[] objArray63 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista57.item = objArray63;
        lista57.primeiro = (short) -1;
        int int67 = lista57.ultimo;
        java.lang.Object[] objArray68 = new java.lang.Object[] { (-1), lista46, lista57 };
        lista34.item = objArray68;
        lista34.ultimo = (byte) 1;
        lista34.imprime();
        int int73 = lista34.ultimo;
        lista0.insere((java.lang.Object) lista34);
        java.lang.Object[] objArray75 = lista34.item;
        java.lang.Object[] objArray76 = lista34.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.pos;
        lista0.imprime();
        lista0.pos = 36;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.ultimo;
        java.lang.Object[] objArray33 = lista0.item;
        lista0.imprime();
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray11 = lista0.item;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        int int15 = lista12.pos;
        int int16 = lista12.pos;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista17.item = objArray23;
        lista17.primeiro = (short) -1;
        lista17.primeiro = 1;
        java.lang.Object[] objArray29 = lista17.item;
        lista12.item = objArray29;
        lista12.primeiro = 100;
        lista12.primeiro = 97;
        int int35 = lista12.ultimo;
        boolean boolean36 = lista12.vazia();
        int int37 = lista12.pos;
        java.lang.Class<?> wildcardClass38 = lista12.getClass();
        lista0.insere((java.lang.Object) wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[class ds.Lista, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[class ds.Lista, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[class ds.Lista, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[class ds.Lista, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 'a';
        lista0.primeiro = (-1);
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        boolean boolean17 = lista15.vazia();
        lista15.primeiro = (byte) 0;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        lista20.primeiro = (byte) 0;
        lista15.insere((java.lang.Object) lista20);
        boolean boolean26 = lista20.vazia();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista27.item = objArray33;
        lista27.pos = 0;
        lista27.imprime();
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        java.lang.Object[] objArray45 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista39.item = objArray45;
        lista39.pos = 0;
        java.lang.Class<?> wildcardClass49 = lista39.getClass();
        ds.Lista lista50 = new ds.Lista();
        boolean boolean51 = lista50.vazia();
        java.lang.Object[] objArray56 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista50.item = objArray56;
        lista50.primeiro = (short) -1;
        int int60 = lista50.ultimo;
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), lista39, lista50 };
        lista27.item = objArray61;
        lista20.item = objArray61;
        lista0.item = objArray61;
        int int65 = lista0.pos;
        lista0.primeiro = (byte) 100;
        int int68 = lista0.ultimo;
        int int69 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista1.item = objArray7;
        lista0.item = objArray7;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        int int15 = lista12.pos;
        lista12.ultimo = '#';
        int int18 = lista12.primeiro;
        java.lang.Object[] objArray19 = lista12.item;
        lista0.item = objArray19;
        java.lang.Class<?> wildcardClass21 = objArray19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = (short) 10;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        lista5.ultimo = '#';
        int int11 = lista5.ultimo;
        int int12 = lista5.primeiro;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista13.item = objArray19;
        lista13.pos = 0;
        lista13.imprime();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        java.lang.Object[] objArray31 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista25.item = objArray31;
        lista25.pos = 0;
        java.lang.Class<?> wildcardClass35 = lista25.getClass();
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        java.lang.Object[] objArray42 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista36.item = objArray42;
        lista36.primeiro = (short) -1;
        int int46 = lista36.ultimo;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (-1), lista25, lista36 };
        lista13.item = objArray47;
        lista13.ultimo = (byte) 1;
        lista13.imprime();
        int int52 = lista13.ultimo;
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        boolean boolean55 = lista53.vazia();
        int int56 = lista53.pos;
        int int57 = lista53.pos;
        java.lang.Object[] objArray58 = lista53.item;
        lista13.item = objArray58;
        ds.Lista lista60 = new ds.Lista();
        boolean boolean61 = lista60.vazia();
        lista60.imprime();
        int int63 = lista60.ultimo;
        int int64 = lista60.pos;
        java.lang.Object[] objArray65 = lista60.item;
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        java.lang.Object[] objArray72 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista66.item = objArray72;
        lista60.item = objArray72;
        lista13.item = objArray72;
        lista5.insere((java.lang.Object) lista13);
        int int77 = lista5.ultimo;
        ds.Lista lista78 = new ds.Lista();
        boolean boolean79 = lista78.vazia();
        boolean boolean80 = lista78.vazia();
        lista78.ultimo = 10;
        ds.Lista lista83 = new ds.Lista();
        boolean boolean84 = lista83.vazia();
        boolean boolean85 = lista83.vazia();
        lista83.ultimo = 10;
        lista83.insere((java.lang.Object) (-1L));
        int int90 = lista83.ultimo;
        java.lang.Object[] objArray91 = lista83.item;
        lista78.item = objArray91;
        lista5.item = objArray91;
        lista0.item = objArray91;
        java.lang.Class<?> wildcardClass95 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 36 + "'", int77 == 36);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 11 + "'", int90 == 11);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 52;
        lista0.pos = 36;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        int int12 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        lista0.ultimo = 35;
        java.lang.Object[] objArray16 = lista0.item;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        boolean boolean19 = lista17.vazia();
        int int20 = lista17.pos;
        lista17.ultimo = '#';
        int int23 = lista17.primeiro;
        java.lang.Object[] objArray24 = lista17.item;
        lista0.item = objArray24;
        lista0.ultimo = (byte) 100;
        int int28 = lista0.pos;
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        boolean boolean31 = lista29.vazia();
        lista29.primeiro = (byte) 0;
        lista29.pos = (-1);
        int int36 = lista29.primeiro;
        int int37 = lista29.ultimo;
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista38.item = objArray44;
        int int46 = lista38.pos;
        lista38.pos = (byte) 0;
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        int int52 = lista49.pos;
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        java.lang.Object[] objArray59 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista53.item = objArray59;
        lista53.primeiro = (short) -1;
        lista53.primeiro = 1;
        int int65 = lista53.ultimo;
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        boolean boolean68 = lista66.vazia();
        int int69 = lista66.pos;
        int int70 = lista66.pos;
        java.lang.Object[] objArray71 = lista66.item;
        java.lang.Object[] objArray72 = lista66.item;
        lista53.item = objArray72;
        lista49.item = objArray72;
        lista38.item = objArray72;
        lista29.item = objArray72;
        lista0.item = objArray72;
        java.lang.Class<?> wildcardClass78 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        int int39 = lista0.ultimo;
        lista0.primeiro = 10;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        int int11 = lista5.primeiro;
        int int12 = lista5.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        boolean boolean44 = lista42.vazia();
        int int45 = lista42.pos;
        int int46 = lista42.pos;
        java.lang.Object[] objArray47 = lista42.item;
        lista0.item = objArray47;
        lista0.primeiro = ' ';
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        java.lang.Object[] objArray57 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista51.item = objArray57;
        int int59 = lista51.pos;
        lista51.pos = (byte) 0;
        int int62 = lista51.ultimo;
        lista0.insere((java.lang.Object) int62);
        lista0.primeiro = 36;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        java.lang.Object[] objArray40 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista34.item = objArray40;
        lista34.pos = 0;
        lista34.imprime();
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        java.lang.Object[] objArray52 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista46.item = objArray52;
        lista46.pos = 0;
        java.lang.Class<?> wildcardClass56 = lista46.getClass();
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        java.lang.Object[] objArray63 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista57.item = objArray63;
        lista57.primeiro = (short) -1;
        int int67 = lista57.ultimo;
        java.lang.Object[] objArray68 = new java.lang.Object[] { (-1), lista46, lista57 };
        lista34.item = objArray68;
        lista34.ultimo = (byte) 1;
        lista34.imprime();
        int int73 = lista34.ultimo;
        lista0.insere((java.lang.Object) lista34);
        java.lang.Object[] objArray75 = lista34.item;
        int int76 = lista34.primeiro;
        java.lang.Class<?> wildcardClass77 = lista34.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        lista0.pos = 2;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        lista11.primeiro = (byte) 0;
        lista11.pos = (-1);
        int int18 = lista11.primeiro;
        java.lang.Object[] objArray19 = null;
        lista11.item = objArray19;
        lista11.primeiro = (byte) 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        lista23.ultimo = '#';
        lista23.ultimo = (short) 10;
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        java.lang.Object[] objArray43 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista37.item = objArray43;
        lista37.pos = 0;
        lista37.primeiro = '#';
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        java.lang.Object[] objArray55 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista49.item = objArray55;
        lista49.primeiro = (short) -1;
        int int59 = lista49.ultimo;
        lista49.pos = (byte) -1;
        java.lang.Object[] objArray62 = lista49.item;
        lista37.item = objArray62;
        lista23.item = objArray62;
        java.lang.Object[] objArray65 = lista23.item;
        lista11.item = objArray65;
        lista0.item = objArray65;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[, 1, 1, 0]");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        int int17 = lista14.primeiro;
        int int18 = lista14.ultimo;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista19.item = objArray26;
        java.lang.Object[] objArray29 = lista19.item;
        lista14.item = objArray29;
        lista0.insere((java.lang.Object) lista14);
        int int32 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = null;
        lista0.item = objArray2;
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        java.lang.Object[] objArray10 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista4.item = objArray10;
        lista0.item = objArray10;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista17.item = objArray23;
        lista17.primeiro = (short) -1;
        lista17.primeiro = 1;
        int int29 = lista17.ultimo;
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        int int33 = lista30.pos;
        int int34 = lista30.pos;
        java.lang.Object[] objArray35 = lista30.item;
        java.lang.Object[] objArray36 = lista30.item;
        lista17.item = objArray36;
        lista13.item = objArray36;
        lista0.item = objArray36;
        int int40 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.ultimo = 10;
        lista5.insere((java.lang.Object) (-1L));
        int int12 = lista5.ultimo;
        java.lang.Object[] objArray13 = lista5.item;
        lista0.item = objArray13;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        java.lang.Object[] objArray22 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista16.item = objArray22;
        lista16.primeiro = (short) -1;
        lista16.primeiro = 1;
        lista16.ultimo = (byte) -1;
        int int30 = lista16.ultimo;
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        java.lang.Object[] objArray38 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista32.item = objArray38;
        int int40 = lista32.pos;
        lista32.pos = (byte) 0;
        int int43 = lista32.ultimo;
        lista32.pos = (byte) 100;
        lista0.insere((java.lang.Object) lista32);
        lista0.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        lista5.ultimo = (byte) -1;
        int int14 = lista5.ultimo;
        java.lang.Object[] objArray15 = lista5.item;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        int int19 = lista16.primeiro;
        lista16.pos = (byte) 1;
        int int22 = lista16.primeiro;
        java.lang.Object[] objArray23 = lista16.item;
        lista5.item = objArray23;
        java.lang.Class<?> wildcardClass25 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        int int23 = lista15.pos;
        lista15.pos = (byte) 0;
        lista15.pos = 'a';
        lista15.primeiro = (-1);
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        lista30.primeiro = (byte) 0;
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        lista35.primeiro = (byte) 0;
        lista30.insere((java.lang.Object) lista35);
        boolean boolean41 = lista35.vazia();
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        java.lang.Object[] objArray48 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista42.item = objArray48;
        lista42.pos = 0;
        lista42.imprime();
        ds.Lista lista54 = new ds.Lista();
        boolean boolean55 = lista54.vazia();
        java.lang.Object[] objArray60 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista54.item = objArray60;
        lista54.pos = 0;
        java.lang.Class<?> wildcardClass64 = lista54.getClass();
        ds.Lista lista65 = new ds.Lista();
        boolean boolean66 = lista65.vazia();
        java.lang.Object[] objArray71 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista65.item = objArray71;
        lista65.primeiro = (short) -1;
        int int75 = lista65.ultimo;
        java.lang.Object[] objArray76 = new java.lang.Object[] { (-1), lista54, lista65 };
        lista42.item = objArray76;
        lista35.item = objArray76;
        lista15.item = objArray76;
        int int80 = lista15.pos;
        lista15.primeiro = (byte) 100;
        int int83 = lista15.ultimo;
        ds.Lista lista84 = new ds.Lista();
        boolean boolean85 = lista84.vazia();
        boolean boolean86 = lista84.vazia();
        int int87 = lista84.pos;
        int int88 = lista84.pos;
        int int89 = lista84.ultimo;
        lista84.imprime();
        java.lang.Object[] objArray91 = lista84.item;
        lista15.item = objArray91;
        lista0.item = objArray91;
        lista0.ultimo = ' ';
        lista0.ultimo = (-1);
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 97 + "'", int80 == 97);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.primeiro = '#';
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.primeiro = (short) -1;
        int int22 = lista12.ultimo;
        lista12.pos = (byte) -1;
        java.lang.Object[] objArray25 = lista12.item;
        lista0.item = objArray25;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        boolean boolean29 = lista27.vazia();
        int int30 = lista27.pos;
        lista27.ultimo = '#';
        int int33 = lista27.ultimo;
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        java.lang.Object[] objArray40 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista34.item = objArray40;
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        boolean boolean44 = lista42.vazia();
        lista42.ultimo = 10;
        lista42.insere((java.lang.Object) (-1L));
        int int49 = lista42.ultimo;
        java.lang.Object[] objArray50 = lista42.item;
        java.lang.Object[] objArray51 = new java.lang.Object[] { objArray50 };
        lista34.item = objArray51;
        lista27.item = objArray51;
        lista0.insere((java.lang.Object) lista27);
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        java.lang.Object[] objArray61 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista55.item = objArray61;
        lista55.pos = 0;
        lista55.imprime();
        ds.Lista lista67 = new ds.Lista();
        boolean boolean68 = lista67.vazia();
        java.lang.Object[] objArray73 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista67.item = objArray73;
        lista67.pos = 0;
        java.lang.Class<?> wildcardClass77 = lista67.getClass();
        ds.Lista lista78 = new ds.Lista();
        boolean boolean79 = lista78.vazia();
        java.lang.Object[] objArray84 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista78.item = objArray84;
        lista78.primeiro = (short) -1;
        int int88 = lista78.ultimo;
        java.lang.Object[] objArray89 = new java.lang.Object[] { (-1), lista67, lista78 };
        lista55.item = objArray89;
        lista55.ultimo = (byte) 1;
        lista55.imprime();
        int int94 = lista55.ultimo;
        lista0.insere((java.lang.Object) lista55);
        java.lang.Object[] objArray96 = null;
        lista0.item = objArray96;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 11 + "'", int49 == 11);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        int int11 = lista0.primeiro;
        lista0.ultimo = 35;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 36;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.primeiro = (byte) 0;
        lista8.pos = (-1);
        int int15 = lista8.primeiro;
        int int16 = lista8.ultimo;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista17.item = objArray23;
        int int25 = lista17.pos;
        lista17.pos = (byte) 0;
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        boolean boolean30 = lista28.vazia();
        int int31 = lista28.pos;
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        java.lang.Object[] objArray38 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista32.item = objArray38;
        lista32.primeiro = (short) -1;
        lista32.primeiro = 1;
        int int44 = lista32.ultimo;
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        boolean boolean47 = lista45.vazia();
        int int48 = lista45.pos;
        int int49 = lista45.pos;
        java.lang.Object[] objArray50 = lista45.item;
        java.lang.Object[] objArray51 = lista45.item;
        lista32.item = objArray51;
        lista28.item = objArray51;
        lista17.item = objArray51;
        lista8.item = objArray51;
        int int56 = lista8.pos;
        lista0.insere((java.lang.Object) lista8);
        ds.Lista lista58 = new ds.Lista();
        boolean boolean59 = lista58.vazia();
        lista58.imprime();
        int int61 = lista58.ultimo;
        lista58.imprime();
        ds.Lista lista63 = new ds.Lista();
        boolean boolean64 = lista63.vazia();
        boolean boolean65 = lista63.vazia();
        int int66 = lista63.pos;
        ds.Lista lista67 = new ds.Lista();
        boolean boolean68 = lista67.vazia();
        java.lang.Object[] objArray73 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista67.item = objArray73;
        lista67.primeiro = (short) -1;
        lista67.primeiro = 1;
        int int79 = lista67.ultimo;
        ds.Lista lista80 = new ds.Lista();
        boolean boolean81 = lista80.vazia();
        boolean boolean82 = lista80.vazia();
        int int83 = lista80.pos;
        int int84 = lista80.pos;
        java.lang.Object[] objArray85 = lista80.item;
        java.lang.Object[] objArray86 = lista80.item;
        lista67.item = objArray86;
        lista63.item = objArray86;
        lista58.item = objArray86;
        int int90 = lista58.ultimo;
        java.lang.Object[] objArray91 = lista58.item;
        java.lang.Class<?> wildcardClass92 = lista58.getClass();
        lista8.insere((java.lang.Object) lista58);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.ultimo;
        lista0.pos = ' ';
        java.lang.Object[] objArray17 = lista0.item;
        lista0.ultimo = 2;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        int int23 = lista20.pos;
        int int24 = lista20.pos;
        int int25 = lista20.ultimo;
        java.lang.Object[] objArray26 = lista20.item;
        java.lang.Class<?> wildcardClass27 = objArray26.getClass();
        lista0.insere((java.lang.Object) wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, class [Ljava.lang.Object;, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, class [Ljava.lang.Object;, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, class [Ljava.lang.Object;, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, class [Ljava.lang.Object;, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[, 1, class [Ljava.lang.Object;, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[, 1, class [Ljava.lang.Object;, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = 2;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        lista5.ultimo = (byte) -1;
        java.lang.Object[] objArray14 = null;
        lista5.item = objArray14;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.primeiro = '#';
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.primeiro = (short) -1;
        int int22 = lista12.ultimo;
        lista12.pos = (byte) -1;
        java.lang.Object[] objArray25 = lista12.item;
        lista0.item = objArray25;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista27.item = objArray33;
        lista27.primeiro = (short) -1;
        lista27.ultimo = '#';
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.imprime();
        java.lang.Object[] objArray42 = lista39.item;
        lista27.item = objArray42;
        lista0.item = objArray42;
        boolean boolean45 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        int int17 = lista14.primeiro;
        int int18 = lista14.ultimo;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista19.item = objArray26;
        java.lang.Object[] objArray29 = lista19.item;
        lista14.item = objArray29;
        lista0.insere((java.lang.Object) lista14);
        java.lang.Object[] objArray32 = lista14.item;
        lista14.pos = 12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[, 1, 1, 0]");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        int int17 = lista14.pos;
        int int18 = lista14.pos;
        lista0.insere((java.lang.Object) lista14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        lista0.pos = (byte) 100;
        boolean boolean15 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        int int2 = lista0.ultimo;
        lista0.pos = ' ';
        int int5 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista1.item = objArray7;
        lista0.item = objArray7;
        lista0.ultimo = (short) -1;
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.imprime();
        int int16 = lista13.ultimo;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        java.lang.Object[] objArray25 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista19.item = objArray25;
        lista13.item = objArray25;
        lista13.primeiro = (byte) 0;
        int int30 = lista13.ultimo;
        lista13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.primeiro = (byte) 0;
        lista13.ultimo = (byte) 10;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista20.pos = 0;
        java.lang.Class<?> wildcardClass30 = lista20.getClass();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        boolean boolean33 = lista31.vazia();
        java.lang.Object[] objArray34 = new java.lang.Object[] { wildcardClass30, lista31 };
        lista13.item = objArray34;
        lista13.ultimo = (short) -1;
        int int38 = lista13.primeiro;
        int int39 = lista13.pos;
        lista0.insere((java.lang.Object) lista13);
        boolean boolean41 = lista13.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        lista12.primeiro = (byte) 0;
        lista12.ultimo = (byte) 10;
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        java.lang.Object[] objArray25 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista19.item = objArray25;
        lista19.pos = 0;
        java.lang.Class<?> wildcardClass29 = lista19.getClass();
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { wildcardClass29, lista30 };
        lista12.item = objArray33;
        lista12.ultimo = (short) -1;
        int int37 = lista12.primeiro;
        lista0.insere((java.lang.Object) lista12);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        lista0.insere((java.lang.Object) lista14);
        lista14.imprime();
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray20 = lista14.item;
        int int21 = lista14.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        int int12 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        lista0.ultimo = 35;
        java.lang.Object[] objArray16 = lista0.item;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        boolean boolean19 = lista17.vazia();
        int int20 = lista17.pos;
        lista17.ultimo = '#';
        int int23 = lista17.primeiro;
        java.lang.Object[] objArray24 = lista17.item;
        lista0.item = objArray24;
        lista0.ultimo = (byte) 100;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        java.lang.Object[] objArray28 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista22.item = objArray28;
        int int30 = lista22.pos;
        lista22.pos = (byte) 0;
        int int33 = lista22.primeiro;
        lista22.primeiro = 35;
        lista0.insere((java.lang.Object) lista22);
        java.lang.Object[] objArray37 = lista0.item;
        lista0.primeiro = '#';
        boolean boolean40 = lista0.vazia();
        lista0.primeiro = 2;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        int int39 = lista0.ultimo;
        lista0.primeiro = 10;
        java.lang.Object[] objArray42 = lista0.item;
        java.lang.Object[] objArray43 = lista0.item;
        java.lang.Object[] objArray44 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.ultimo;
        lista0.pos = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        java.lang.Object[] objArray12 = lista0.item;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        int int21 = lista18.pos;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        java.lang.Object[] objArray28 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista22.item = objArray28;
        lista22.primeiro = (short) -1;
        lista22.primeiro = 1;
        int int34 = lista22.ultimo;
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        int int38 = lista35.pos;
        int int39 = lista35.pos;
        java.lang.Object[] objArray40 = lista35.item;
        java.lang.Object[] objArray41 = lista35.item;
        lista22.item = objArray41;
        lista18.item = objArray41;
        lista13.item = objArray41;
        lista0.item = objArray41;
        java.lang.Object[] objArray46 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 0;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        lista15.pos = 0;
        lista15.imprime();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista27.item = objArray33;
        lista27.pos = 0;
        java.lang.Class<?> wildcardClass37 = lista27.getClass();
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista38.item = objArray44;
        lista38.primeiro = (short) -1;
        int int48 = lista38.ultimo;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1), lista27, lista38 };
        lista15.item = objArray49;
        lista0.insere((java.lang.Object) lista15);
        lista15.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.ultimo;
        lista0.imprime();
        java.lang.Object[] objArray34 = lista0.item;
        int int35 = lista0.pos;
        boolean boolean36 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        int int17 = lista14.primeiro;
        int int18 = lista14.ultimo;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista19.item = objArray26;
        java.lang.Object[] objArray29 = lista19.item;
        lista14.item = objArray29;
        lista0.insere((java.lang.Object) lista14);
        java.lang.Object[] objArray32 = lista14.item;
        int int33 = lista14.ultimo;
        int int34 = lista14.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.ultimo = '#';
        int int12 = lista0.ultimo;
        int int13 = lista0.ultimo;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.primeiro = '#';
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        int int15 = lista12.pos;
        int int16 = lista12.pos;
        lista0.insere((java.lang.Object) int16);
        int int18 = lista0.primeiro;
        lista0.pos = 100;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        lista0.imprime();
        lista0.imprime();
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        int int11 = lista0.ultimo;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        java.lang.Object[] objArray9 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista3.item = objArray9;
        int int11 = lista3.pos;
        lista3.pos = (byte) 0;
        int int14 = lista3.primeiro;
        int int15 = lista3.ultimo;
        int int16 = lista3.primeiro;
        lista3.ultimo = '4';
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        lista19.primeiro = (byte) 0;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        lista24.primeiro = (byte) 0;
        lista19.insere((java.lang.Object) lista24);
        boolean boolean30 = lista24.vazia();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.imprime();
        int int34 = lista31.ultimo;
        lista31.imprime();
        boolean boolean36 = lista31.vazia();
        lista31.primeiro = '4';
        boolean boolean39 = lista31.vazia();
        int int40 = lista31.pos;
        java.lang.Object obj41 = null;
        lista31.insere(obj41);
        java.lang.Object[] objArray43 = lista31.item;
        lista24.item = objArray43;
        lista3.item = objArray43;
        lista0.insere((java.lang.Object) lista3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        lista12.primeiro = (byte) 0;
        lista12.ultimo = (byte) 10;
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        java.lang.Object[] objArray25 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista19.item = objArray25;
        lista19.pos = 0;
        java.lang.Class<?> wildcardClass29 = lista19.getClass();
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { wildcardClass29, lista30 };
        lista12.item = objArray33;
        lista12.ultimo = (short) -1;
        int int37 = lista12.primeiro;
        lista0.insere((java.lang.Object) lista12);
        lista12.primeiro = (short) 100;
        java.lang.Object[] objArray41 = null;
        lista12.item = objArray41;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        int int12 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        lista9.pos = (-1);
        int int16 = lista9.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        lista0.imprime();
        lista0.primeiro = (-1);
        boolean boolean10 = lista0.vazia();
        lista0.pos = (short) 100;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista13.item = objArray19;
        int int21 = lista13.pos;
        lista13.pos = (byte) 0;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        int int27 = lista24.pos;
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        java.lang.Object[] objArray34 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista28.item = objArray34;
        lista28.primeiro = (short) -1;
        lista28.primeiro = 1;
        int int40 = lista28.ultimo;
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        boolean boolean43 = lista41.vazia();
        int int44 = lista41.pos;
        int int45 = lista41.pos;
        java.lang.Object[] objArray46 = lista41.item;
        java.lang.Object[] objArray47 = lista41.item;
        lista28.item = objArray47;
        lista24.item = objArray47;
        lista13.item = objArray47;
        lista0.item = objArray47;
        lista0.pos = 100;
        int int54 = lista0.primeiro;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        lista55.primeiro = (byte) 0;
        lista55.pos = (-1);
        lista55.imprime();
        lista55.imprime();
        int int64 = lista55.ultimo;
        int int65 = lista55.ultimo;
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        lista66.primeiro = (short) 100;
        java.lang.Object[] objArray70 = lista66.item;
        lista55.insere((java.lang.Object) lista66);
        java.lang.Object[] objArray72 = lista55.item;
        lista0.item = objArray72;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        int int39 = lista0.ultimo;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        boolean boolean42 = lista40.vazia();
        int int43 = lista40.pos;
        int int44 = lista40.pos;
        java.lang.Object[] objArray45 = lista40.item;
        lista0.item = objArray45;
        ds.Lista lista47 = new ds.Lista();
        boolean boolean48 = lista47.vazia();
        lista47.imprime();
        int int50 = lista47.ultimo;
        int int51 = lista47.pos;
        java.lang.Object[] objArray52 = lista47.item;
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        java.lang.Object[] objArray59 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista53.item = objArray59;
        lista47.item = objArray59;
        lista0.item = objArray59;
        lista0.imprime();
        int int64 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        lista0.imprime();
        lista0.primeiro = (-1);
        lista0.primeiro = ' ';
        int int12 = lista0.pos;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.primeiro;
        int int23 = lista0.ultimo;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        boolean boolean11 = lista0.vazia();
        lista0.primeiro = 36;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = 0;
        java.lang.Object[] objArray44 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        boolean boolean25 = lista23.vazia();
        int int26 = lista23.pos;
        int int27 = lista23.pos;
        lista23.pos = 1;
        lista23.imprime();
        java.lang.Object[] objArray31 = lista23.item;
        lista0.item = objArray31;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = (short) 100;
        java.lang.Object[] objArray16 = lista12.item;
        lista5.item = objArray16;
        boolean boolean18 = lista5.vazia();
        boolean boolean19 = lista5.vazia();
        java.lang.Class<?> wildcardClass20 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        lista0.insere((java.lang.Object) (-1L));
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.primeiro = (short) 100;
        int int13 = lista0.primeiro;
        lista0.primeiro = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int6 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 36;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        lista0.pos = 1;
        lista0.ultimo = (short) 1;
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        boolean boolean44 = lista42.vazia();
        int int45 = lista42.pos;
        int int46 = lista42.pos;
        java.lang.Object[] objArray47 = lista42.item;
        lista0.item = objArray47;
        java.lang.Object[] objArray49 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        java.lang.Object obj42 = null;
        lista0.insere(obj42);
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.imprime();
        int int47 = lista44.ultimo;
        lista44.imprime();
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        int int52 = lista49.pos;
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        java.lang.Object[] objArray59 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista53.item = objArray59;
        lista53.primeiro = (short) -1;
        lista53.primeiro = 1;
        int int65 = lista53.ultimo;
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        boolean boolean68 = lista66.vazia();
        int int69 = lista66.pos;
        int int70 = lista66.pos;
        java.lang.Object[] objArray71 = lista66.item;
        java.lang.Object[] objArray72 = lista66.item;
        lista53.item = objArray72;
        lista49.item = objArray72;
        lista44.item = objArray72;
        lista0.insere((java.lang.Object) lista44);
        boolean boolean77 = lista0.vazia();
        lista0.pos = 0;
        int int80 = lista0.pos;
        boolean boolean81 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = 0;
        int int44 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        int int7 = lista0.pos;
        lista0.primeiro = (short) 100;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        java.lang.Object[] objArray16 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista10.item = objArray16;
        lista10.pos = 0;
        lista10.imprime();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        java.lang.Object[] objArray28 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista22.item = objArray28;
        lista22.pos = 0;
        java.lang.Class<?> wildcardClass32 = lista22.getClass();
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        java.lang.Object[] objArray39 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista33.item = objArray39;
        lista33.primeiro = (short) -1;
        int int43 = lista33.ultimo;
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-1), lista22, lista33 };
        lista10.item = objArray44;
        lista0.item = objArray44;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista1.item = objArray7;
        lista0.item = objArray7;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (-1);
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, 1, 1, 0]");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 0;
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        java.lang.Object[] objArray11 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista5.item = objArray11;
        lista5.primeiro = (short) -1;
        int int15 = lista5.ultimo;
        lista5.pos = (byte) -1;
        int int18 = lista5.pos;
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        int int22 = lista19.primeiro;
        int int23 = lista19.ultimo;
        ds.Lista lista24 = new ds.Lista();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        java.lang.Object[] objArray31 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista25.item = objArray31;
        lista24.item = objArray31;
        java.lang.Object[] objArray34 = lista24.item;
        lista19.item = objArray34;
        lista5.insere((java.lang.Object) lista19);
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        lista37.imprime();
        int int40 = lista37.ultimo;
        lista37.imprime();
        boolean boolean42 = lista37.vazia();
        lista37.primeiro = '4';
        boolean boolean45 = lista37.vazia();
        int int46 = lista37.pos;
        java.lang.Object obj47 = null;
        lista37.insere(obj47);
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        java.lang.Object[] objArray55 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista49.item = objArray55;
        lista49.pos = 0;
        lista49.primeiro = '#';
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        java.lang.Object[] objArray67 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista61.item = objArray67;
        lista61.primeiro = (short) -1;
        int int71 = lista61.ultimo;
        lista61.pos = (byte) -1;
        java.lang.Object[] objArray74 = lista61.item;
        lista49.item = objArray74;
        lista37.item = objArray74;
        lista5.item = objArray74;
        lista0.insere((java.lang.Object) objArray74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[, 1, 1, 0]");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.primeiro = '#';
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.primeiro = (short) -1;
        int int22 = lista12.ultimo;
        lista12.pos = (byte) -1;
        java.lang.Object[] objArray25 = lista12.item;
        lista0.item = objArray25;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        boolean boolean29 = lista27.vazia();
        int int30 = lista27.pos;
        lista27.ultimo = '#';
        int int33 = lista27.ultimo;
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        java.lang.Object[] objArray40 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista34.item = objArray40;
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        boolean boolean44 = lista42.vazia();
        lista42.ultimo = 10;
        lista42.insere((java.lang.Object) (-1L));
        int int49 = lista42.ultimo;
        java.lang.Object[] objArray50 = lista42.item;
        java.lang.Object[] objArray51 = new java.lang.Object[] { objArray50 };
        lista34.item = objArray51;
        lista27.item = objArray51;
        lista0.insere((java.lang.Object) lista27);
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        java.lang.Object[] objArray61 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista55.item = objArray61;
        lista55.pos = 0;
        lista55.imprime();
        ds.Lista lista67 = new ds.Lista();
        boolean boolean68 = lista67.vazia();
        java.lang.Object[] objArray73 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista67.item = objArray73;
        lista67.pos = 0;
        java.lang.Class<?> wildcardClass77 = lista67.getClass();
        ds.Lista lista78 = new ds.Lista();
        boolean boolean79 = lista78.vazia();
        java.lang.Object[] objArray84 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista78.item = objArray84;
        lista78.primeiro = (short) -1;
        int int88 = lista78.ultimo;
        java.lang.Object[] objArray89 = new java.lang.Object[] { (-1), lista67, lista78 };
        lista55.item = objArray89;
        lista55.ultimo = (byte) 1;
        lista55.imprime();
        int int94 = lista55.ultimo;
        lista0.insere((java.lang.Object) lista55);
        int int96 = lista0.pos;
        java.lang.Class<?> wildcardClass97 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 11 + "'", int49 == 11);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 1;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        boolean boolean12 = lista0.vazia();
        lista0.primeiro = (short) 100;
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        lista0.insere((java.lang.Object) (-1L));
        int int7 = lista0.ultimo;
        int int8 = lista0.ultimo;
        lista0.pos = (short) 1;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = (short) 1;
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        int int11 = lista0.primeiro;
        lista0.imprime();
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        lista14.ultimo = 10;
        lista14.insere((java.lang.Object) (-1L));
        int int21 = lista14.ultimo;
        int int22 = lista14.ultimo;
        lista14.pos = (short) 1;
        java.lang.Object[] objArray25 = lista14.item;
        lista0.item = objArray25;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        java.lang.Object obj42 = null;
        lista0.insere(obj42);
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.imprime();
        int int47 = lista44.ultimo;
        lista44.imprime();
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        int int52 = lista49.pos;
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        java.lang.Object[] objArray59 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista53.item = objArray59;
        lista53.primeiro = (short) -1;
        lista53.primeiro = 1;
        int int65 = lista53.ultimo;
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        boolean boolean68 = lista66.vazia();
        int int69 = lista66.pos;
        int int70 = lista66.pos;
        java.lang.Object[] objArray71 = lista66.item;
        java.lang.Object[] objArray72 = lista66.item;
        lista53.item = objArray72;
        lista49.item = objArray72;
        lista44.item = objArray72;
        lista0.insere((java.lang.Object) lista44);
        lista0.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = (short) 10;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        int int9 = lista5.pos;
        int int10 = lista5.ultimo;
        lista5.imprime();
        java.lang.Object[] objArray12 = lista5.item;
        lista0.item = objArray12;
        int int14 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.primeiro = 11;
        lista0.primeiro = (-1);
        java.lang.Object obj9 = null;
        lista0.insere(obj9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.ultimo = '#';
        int int12 = lista0.ultimo;
        lista0.pos = (byte) 1;
        int int15 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = '#';
        lista0.primeiro = (short) 0;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        lista0.pos = (byte) 0;
        lista0.pos = 10;
        int int17 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.primeiro = ' ';
        int int10 = lista0.primeiro;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        int int14 = lista11.pos;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        lista15.primeiro = (short) -1;
        lista15.primeiro = 1;
        int int27 = lista15.ultimo;
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        boolean boolean30 = lista28.vazia();
        int int31 = lista28.pos;
        int int32 = lista28.pos;
        java.lang.Object[] objArray33 = lista28.item;
        java.lang.Object[] objArray34 = lista28.item;
        lista15.item = objArray34;
        lista11.item = objArray34;
        lista0.item = objArray34;
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        lista38.imprime();
        java.lang.Object[] objArray41 = lista38.item;
        lista38.primeiro = (-1);
        lista0.insere((java.lang.Object) lista38);
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        lista45.imprime();
        int int48 = lista45.ultimo;
        int int49 = lista45.pos;
        java.lang.Object[] objArray50 = lista45.item;
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        java.lang.Object[] objArray57 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista51.item = objArray57;
        lista45.item = objArray57;
        lista0.item = objArray57;
        lista0.ultimo = 12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[, 1, 1, 0]");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = (short) 100;
        java.lang.Object[] objArray16 = lista12.item;
        lista5.item = objArray16;
        java.lang.Object[] objArray18 = lista5.item;
        int int19 = lista5.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.ultimo = 10;
        lista5.insere((java.lang.Object) (-1L));
        int int12 = lista5.ultimo;
        java.lang.Object[] objArray13 = lista5.item;
        lista0.item = objArray13;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        java.lang.Object[] objArray22 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista16.item = objArray22;
        lista16.primeiro = (short) -1;
        lista16.primeiro = 1;
        lista16.ultimo = (byte) -1;
        int int30 = lista16.ultimo;
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        java.lang.Object[] objArray38 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista32.item = objArray38;
        int int40 = lista32.pos;
        lista32.pos = (byte) 0;
        int int43 = lista32.ultimo;
        lista32.pos = (byte) 100;
        lista0.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray47 = lista32.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[, 1, 1, 0]");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        lista7.pos = 0;
        java.lang.Class<?> wildcardClass17 = lista7.getClass();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass17, lista18 };
        lista0.item = objArray21;
        lista0.ultimo = (short) -1;
        int int25 = lista0.primeiro;
        int int26 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        boolean boolean6 = lista4.vazia();
        int int7 = lista4.primeiro;
        lista4.pos = (byte) 1;
        int int10 = lista4.primeiro;
        lista4.imprime();
        lista4.ultimo = (byte) 1;
        java.lang.Object[] objArray14 = lista4.item;
        lista0.item = objArray14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        java.lang.Object[] objArray12 = lista5.item;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista13.item = objArray19;
        lista13.pos = 0;
        lista13.imprime();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        java.lang.Object[] objArray31 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista25.item = objArray31;
        lista25.pos = 0;
        java.lang.Class<?> wildcardClass35 = lista25.getClass();
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        java.lang.Object[] objArray42 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista36.item = objArray42;
        lista36.primeiro = (short) -1;
        int int46 = lista36.ultimo;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (-1), lista25, lista36 };
        lista13.item = objArray47;
        lista5.insere((java.lang.Object) lista13);
        ds.Lista lista50 = new ds.Lista();
        boolean boolean51 = lista50.vazia();
        java.lang.Object[] objArray56 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista50.item = objArray56;
        int int58 = lista50.pos;
        lista50.pos = (byte) 0;
        java.lang.Object[] objArray61 = lista50.item;
        lista50.ultimo = (byte) 100;
        java.lang.Object[] objArray64 = lista50.item;
        lista13.item = objArray64;
        java.lang.Object[] objArray66 = lista13.item;
        ds.Lista lista67 = new ds.Lista();
        boolean boolean68 = lista67.vazia();
        boolean boolean69 = lista67.vazia();
        int int70 = lista67.pos;
        int int71 = lista67.pos;
        ds.Lista lista72 = new ds.Lista();
        boolean boolean73 = lista72.vazia();
        java.lang.Object[] objArray78 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista72.item = objArray78;
        lista72.primeiro = (short) -1;
        lista72.primeiro = 1;
        java.lang.Object[] objArray84 = lista72.item;
        lista67.item = objArray84;
        lista67.primeiro = 100;
        lista67.primeiro = 97;
        int int90 = lista67.ultimo;
        boolean boolean91 = lista67.vazia();
        lista67.primeiro = '#';
        java.lang.Object[] objArray94 = lista67.item;
        lista13.item = objArray94;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray94), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray94), "[, 1, 1, 0]");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista1.item = objArray7;
        lista1.pos = 0;
        lista1.primeiro = '#';
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        lista1.insere((java.lang.Object) int17);
        int int19 = lista1.ultimo;
        int int20 = lista1.primeiro;
        lista0.insere((java.lang.Object) lista1);
        lista0.imprime();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        boolean boolean25 = lista23.vazia();
        lista23.primeiro = (byte) 0;
        java.lang.Object[] objArray28 = lista23.item;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        java.lang.Object[] objArray12 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista6.item = objArray12;
        lista0.item = objArray12;
        lista0.primeiro = (byte) 0;
        int int17 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = (short) -1;
        int int21 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        int int42 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray44 = lista0.item;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, null, 1, 0]");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = '4';
        int int4 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 100;
        lista0.imprime();
        int int15 = lista0.ultimo;
        int int16 = lista0.primeiro;
        int int17 = lista0.pos;
        int int18 = lista0.primeiro;
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 'a';
        java.lang.Object[] objArray13 = null;
        lista0.item = objArray13;
        boolean boolean15 = lista0.vazia();
        lista0.ultimo = 0;
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(objArray18);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.primeiro = ' ';
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        lista10.ultimo = 10;
        lista10.insere((java.lang.Object) (-1L));
        int int17 = lista10.ultimo;
        java.lang.Object[] objArray18 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        int int23 = lista20.pos;
        lista20.ultimo = '#';
        int int26 = lista20.primeiro;
        lista20.ultimo = 100;
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        boolean boolean31 = lista29.vazia();
        int int32 = lista29.primeiro;
        lista20.insere((java.lang.Object) lista29);
        lista20.ultimo = 35;
        java.lang.Object[] objArray36 = lista20.item;
        lista10.insere((java.lang.Object) lista20);
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        lista38.primeiro = (byte) 0;
        lista38.ultimo = (byte) 10;
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        java.lang.Object[] objArray51 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista45.item = objArray51;
        lista45.pos = 0;
        java.lang.Class<?> wildcardClass55 = lista45.getClass();
        ds.Lista lista56 = new ds.Lista();
        boolean boolean57 = lista56.vazia();
        boolean boolean58 = lista56.vazia();
        java.lang.Object[] objArray59 = new java.lang.Object[] { wildcardClass55, lista56 };
        lista38.item = objArray59;
        lista38.ultimo = (short) -1;
        int int63 = lista38.primeiro;
        boolean boolean64 = lista38.vazia();
        lista38.pos = (byte) 100;
        int int67 = lista38.pos;
        lista10.insere((java.lang.Object) lista38);
        boolean boolean69 = lista38.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        boolean boolean44 = lista42.vazia();
        int int45 = lista42.pos;
        int int46 = lista42.pos;
        java.lang.Object[] objArray47 = lista42.item;
        lista0.item = objArray47;
        lista0.primeiro = ' ';
        lista0.imprime();
        int int52 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        boolean boolean12 = lista0.vazia();
        int int13 = lista0.pos;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = '#';
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = 'a';
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        lista14.primeiro = (byte) 0;
        lista14.pos = (-1);
        int int21 = lista14.primeiro;
        int int22 = lista14.ultimo;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        int int31 = lista23.pos;
        lista23.pos = (byte) 0;
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        boolean boolean36 = lista34.vazia();
        int int37 = lista34.pos;
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista38.item = objArray44;
        lista38.primeiro = (short) -1;
        lista38.primeiro = 1;
        int int50 = lista38.ultimo;
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        boolean boolean53 = lista51.vazia();
        int int54 = lista51.pos;
        int int55 = lista51.pos;
        java.lang.Object[] objArray56 = lista51.item;
        java.lang.Object[] objArray57 = lista51.item;
        lista38.item = objArray57;
        lista34.item = objArray57;
        lista23.item = objArray57;
        lista14.item = objArray57;
        lista0.item = objArray57;
        java.lang.Object[] objArray63 = lista0.item;
        int int64 = lista0.pos;
        java.lang.Object[] objArray65 = lista0.item;
        int int66 = lista0.ultimo;
        int int67 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        java.lang.Object[] objArray11 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista5.item = objArray11;
        lista5.primeiro = (short) -1;
        lista5.primeiro = 1;
        java.lang.Object[] objArray17 = lista5.item;
        lista0.item = objArray17;
        lista0.primeiro = 100;
        lista0.primeiro = 97;
        int int23 = lista0.ultimo;
        java.lang.Object[] objArray24 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[, 1, 1, 0]");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.ultimo = '#';
        int int12 = lista0.primeiro;
        java.lang.Object[] objArray13 = null;
        lista0.item = objArray13;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        java.lang.Object[] objArray12 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista6.item = objArray12;
        lista5.item = objArray12;
        java.lang.Object[] objArray15 = lista5.item;
        lista0.item = objArray15;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        java.lang.Object[] objArray24 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista18.item = objArray24;
        int int26 = lista18.pos;
        lista18.pos = (byte) 0;
        int int29 = lista18.ultimo;
        lista18.pos = (byte) 100;
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = (short) 1;
        lista18.insere((java.lang.Object) (short) 1);
        lista0.insere((java.lang.Object) lista18);
        java.lang.Class<?> wildcardClass37 = lista18.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        lista0.imprime();
        lista0.imprime();
        int int42 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista13.item = objArray19;
        lista12.item = objArray19;
        java.lang.Object[] objArray22 = lista12.item;
        lista0.item = objArray22;
        int int24 = lista0.primeiro;
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        java.lang.Object[] objArray9 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista3.item = objArray9;
        lista3.primeiro = (short) -1;
        lista3.primeiro = 1;
        java.lang.Object[] objArray15 = lista3.item;
        lista0.insere((java.lang.Object) objArray15);
        lista0.primeiro = 12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray11 = lista0.item;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        java.lang.Object[] objArray10 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista4.item = objArray10;
        lista4.primeiro = (short) -1;
        lista4.primeiro = 1;
        int int16 = lista4.ultimo;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        boolean boolean19 = lista17.vazia();
        int int20 = lista17.pos;
        int int21 = lista17.pos;
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray23 = lista17.item;
        lista4.item = objArray23;
        lista0.item = objArray23;
        int int26 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        lista7.pos = 0;
        java.lang.Class<?> wildcardClass17 = lista7.getClass();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass17, lista18 };
        lista0.item = objArray21;
        lista0.ultimo = (short) -1;
        int int25 = lista0.pos;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        int int10 = lista0.pos;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.imprime();
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.pos = 0;
        java.lang.Class<?> wildcardClass34 = lista24.getClass();
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        java.lang.Object[] objArray41 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista35.item = objArray41;
        lista35.primeiro = (short) -1;
        int int45 = lista35.ultimo;
        java.lang.Object[] objArray46 = new java.lang.Object[] { (-1), lista24, lista35 };
        lista12.item = objArray46;
        lista5.item = objArray46;
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        java.lang.Object[] objArray55 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista49.item = objArray55;
        lista49.pos = 0;
        lista49.imprime();
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        java.lang.Object[] objArray67 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista61.item = objArray67;
        lista61.pos = 0;
        java.lang.Class<?> wildcardClass71 = lista61.getClass();
        ds.Lista lista72 = new ds.Lista();
        boolean boolean73 = lista72.vazia();
        java.lang.Object[] objArray78 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista72.item = objArray78;
        lista72.primeiro = (short) -1;
        int int82 = lista72.ultimo;
        java.lang.Object[] objArray83 = new java.lang.Object[] { (-1), lista61, lista72 };
        lista49.item = objArray83;
        lista5.item = objArray83;
        lista5.primeiro = 0;
        ds.Lista lista88 = new ds.Lista();
        boolean boolean89 = lista88.vazia();
        boolean boolean90 = lista88.vazia();
        int int91 = lista88.pos;
        int int92 = lista88.pos;
        java.lang.Object[] objArray93 = lista88.item;
        lista5.item = objArray93;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNotNull(objArray93);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        lista9.primeiro = (byte) 0;
        lista9.pos = (-1);
        int int16 = lista9.primeiro;
        int int17 = lista9.ultimo;
        lista0.insere((java.lang.Object) lista9);
        lista0.pos = '4';
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        boolean boolean12 = lista0.vazia();
        lista0.primeiro = (short) 100;
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        lista0.ultimo = 0;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.primeiro = (short) 100;
        java.lang.Object[] objArray13 = lista9.item;
        lista0.item = objArray13;
        lista0.imprime();
        java.lang.Object[] objArray16 = lista0.item;
        java.lang.Object[] objArray17 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.pos = 52;
        lista0.ultimo = (byte) -1;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = 'a';
        lista0.primeiro = 11;
        int int16 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        int int17 = lista14.primeiro;
        int int18 = lista14.ultimo;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista19.item = objArray26;
        java.lang.Object[] objArray29 = lista19.item;
        lista14.item = objArray29;
        lista0.insere((java.lang.Object) lista14);
        lista14.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        int int14 = lista11.pos;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        lista15.primeiro = (short) -1;
        lista15.primeiro = 1;
        int int27 = lista15.ultimo;
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        boolean boolean30 = lista28.vazia();
        int int31 = lista28.pos;
        int int32 = lista28.pos;
        java.lang.Object[] objArray33 = lista28.item;
        java.lang.Object[] objArray34 = lista28.item;
        lista15.item = objArray34;
        lista11.item = objArray34;
        lista0.item = objArray34;
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista38.item = objArray44;
        lista38.primeiro = (short) -1;
        lista0.insere((java.lang.Object) (short) -1);
        int int49 = lista0.primeiro;
        int int50 = lista0.ultimo;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = 100;
        lista0.primeiro = 11;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 100;
        lista0.imprime();
        int int15 = lista0.ultimo;
        int int16 = lista0.primeiro;
        int int17 = lista0.pos;
        int int18 = lista0.primeiro;
        int int19 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = 0;
        lista0.pos = 36;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        lista12.primeiro = (byte) 0;
        lista12.ultimo = (byte) 10;
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        java.lang.Object[] objArray25 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista19.item = objArray25;
        lista19.pos = 0;
        java.lang.Class<?> wildcardClass29 = lista19.getClass();
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { wildcardClass29, lista30 };
        lista12.item = objArray33;
        lista12.ultimo = (short) -1;
        int int37 = lista12.primeiro;
        lista0.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray39 = lista0.item;
        int int40 = lista0.ultimo;
        lista0.primeiro = 32;
        int int43 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        lista7.pos = 0;
        java.lang.Class<?> wildcardClass17 = lista7.getClass();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass17, lista18 };
        lista0.item = objArray21;
        lista0.ultimo = ' ';
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.primeiro = (short) 100;
        java.lang.Object[] objArray15 = lista11.item;
        lista0.item = objArray15;
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        lista12.primeiro = (byte) 0;
        lista12.pos = (-1);
        lista12.imprime();
        lista12.pos = '#';
        lista0.insere((java.lang.Object) '#');
        java.lang.Object[] objArray23 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[#, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[#, 1, 1, 0]");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        int int42 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray44 = lista0.item;
        int int45 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        int int42 = lista0.pos;
        lista0.imprime();
        int int44 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, null, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        int int13 = lista0.primeiro;
        lista0.ultimo = '4';
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        int int13 = lista0.pos;
        java.lang.Object[] objArray14 = lista0.item;
        boolean boolean15 = lista0.vazia();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        int int19 = lista16.ultimo;
        lista16.imprime();
        boolean boolean21 = lista16.vazia();
        lista16.primeiro = '4';
        boolean boolean24 = lista16.vazia();
        int int25 = lista16.pos;
        java.lang.Object obj26 = null;
        lista16.insere(obj26);
        int int28 = lista16.pos;
        lista0.insere((java.lang.Object) int28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.primeiro = (byte) 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        lista18.primeiro = (byte) 0;
        lista13.insere((java.lang.Object) lista18);
        int int24 = lista18.primeiro;
        boolean boolean25 = lista18.vazia();
        lista18.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) lista18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        lista0.pos = (byte) -1;
        java.lang.Object[] objArray13 = lista0.item;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.pos;
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        java.lang.Object[] objArray39 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista33.item = objArray39;
        lista33.primeiro = (short) -1;
        lista33.ultimo = '#';
        lista33.ultimo = (short) 10;
        int int47 = lista33.pos;
        lista0.insere((java.lang.Object) int47);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.imprime();
        int int5 = lista0.primeiro;
        lista0.imprime();
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        lista0.primeiro = (byte) -1;
        lista0.ultimo = 100;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista27.item = objArray33;
        int int35 = lista27.pos;
        lista27.pos = (byte) 0;
        java.lang.Object[] objArray38 = lista27.item;
        lista27.ultimo = 'a';
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        lista41.imprime();
        int int44 = lista41.ultimo;
        int int45 = lista41.pos;
        java.lang.Object[] objArray46 = lista41.item;
        lista27.item = objArray46;
        java.lang.Object[] objArray48 = lista27.item;
        lista0.item = objArray48;
        lista0.pos = (short) 100;
        java.lang.Class<?> wildcardClass52 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        lista0.imprime();
        lista0.primeiro = (-1);
        lista0.primeiro = ' ';
        int int12 = lista0.ultimo;
        lista0.pos = 52;
        int int15 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        lista12.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        int int34 = lista24.ultimo;
        lista24.pos = (byte) -1;
        java.lang.Object[] objArray37 = lista24.item;
        lista12.item = objArray37;
        lista0.item = objArray37;
        java.lang.Object obj40 = null;
        lista0.insere(obj40);
        java.lang.Object obj42 = null;
        lista0.insere(obj42);
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.imprime();
        int int47 = lista44.ultimo;
        lista44.imprime();
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        int int52 = lista49.pos;
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        java.lang.Object[] objArray59 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista53.item = objArray59;
        lista53.primeiro = (short) -1;
        lista53.primeiro = 1;
        int int65 = lista53.ultimo;
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        boolean boolean68 = lista66.vazia();
        int int69 = lista66.pos;
        int int70 = lista66.pos;
        java.lang.Object[] objArray71 = lista66.item;
        java.lang.Object[] objArray72 = lista66.item;
        lista53.item = objArray72;
        lista49.item = objArray72;
        lista44.item = objArray72;
        lista0.insere((java.lang.Object) lista44);
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        int int13 = lista0.pos;
        java.lang.Object[] objArray14 = lista0.item;
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        java.lang.Object[] objArray12 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista6.item = objArray12;
        lista0.item = objArray12;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = '4';
        int int19 = lista0.primeiro;
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        lista7.pos = 0;
        java.lang.Class<?> wildcardClass17 = lista7.getClass();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass17, lista18 };
        lista0.item = objArray21;
        lista0.ultimo = (short) -1;
        int int25 = lista0.ultimo;
        lista0.pos = 11;
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        boolean boolean30 = lista28.vazia();
        lista28.primeiro = (byte) 0;
        lista28.ultimo = (byte) 10;
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        java.lang.Object[] objArray41 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista35.item = objArray41;
        lista35.pos = 0;
        java.lang.Class<?> wildcardClass45 = lista35.getClass();
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        boolean boolean48 = lista46.vazia();
        java.lang.Object[] objArray49 = new java.lang.Object[] { wildcardClass45, lista46 };
        lista28.item = objArray49;
        lista28.ultimo = (short) -1;
        int int53 = lista28.primeiro;
        boolean boolean54 = lista28.vazia();
        lista28.pos = (byte) 100;
        int int57 = lista28.pos;
        lista28.primeiro = 52;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 'a';
        lista0.primeiro = (short) 1;
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        lista0.ultimo = 1;
        int int34 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        lista7.pos = 0;
        java.lang.Class<?> wildcardClass17 = lista7.getClass();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass17, lista18 };
        lista0.item = objArray21;
        lista0.ultimo = (short) -1;
        int int25 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        lista0.pos = 1;
        lista0.ultimo = (short) 1;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.pos = 0;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.ultimo = '#';
        lista0.ultimo = (short) 10;
        int int14 = lista0.pos;
        java.lang.Object[] objArray15 = lista0.item;
        boolean boolean16 = lista0.vazia();
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista17.item = objArray23;
        lista17.primeiro = (short) -1;
        lista17.ultimo = '#';
        lista17.ultimo = (short) 10;
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista31.item = objArray37;
        lista31.pos = 0;
        lista31.primeiro = '#';
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        java.lang.Object[] objArray49 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista43.item = objArray49;
        lista43.primeiro = (short) -1;
        int int53 = lista43.ultimo;
        lista43.pos = (byte) -1;
        java.lang.Object[] objArray56 = lista43.item;
        lista31.item = objArray56;
        lista17.item = objArray56;
        lista0.item = objArray56;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[, 1, 1, 0]");
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        lista0.ultimo = (byte) -1;
        int int14 = lista0.ultimo;
        boolean boolean15 = lista0.vazia();
        lista0.imprime();
        boolean boolean17 = lista0.vazia();
        int int18 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.ultimo = '#';
        lista0.ultimo = (short) 10;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        java.lang.Object[] objArray20 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista14.item = objArray20;
        lista14.pos = 0;
        lista14.primeiro = '#';
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        java.lang.Object[] objArray32 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista26.item = objArray32;
        lista26.primeiro = (short) -1;
        int int36 = lista26.ultimo;
        lista26.pos = (byte) -1;
        java.lang.Object[] objArray39 = lista26.item;
        lista14.item = objArray39;
        lista0.item = objArray39;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[, 1, 1, 0]");
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        int int14 = lista11.pos;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        lista15.primeiro = (short) -1;
        lista15.primeiro = 1;
        int int27 = lista15.ultimo;
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        boolean boolean30 = lista28.vazia();
        int int31 = lista28.pos;
        int int32 = lista28.pos;
        java.lang.Object[] objArray33 = lista28.item;
        java.lang.Object[] objArray34 = lista28.item;
        lista15.item = objArray34;
        lista11.item = objArray34;
        lista0.item = objArray34;
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista38.item = objArray44;
        lista38.pos = 0;
        lista38.primeiro = '#';
        ds.Lista lista50 = new ds.Lista();
        boolean boolean51 = lista50.vazia();
        java.lang.Object[] objArray56 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista50.item = objArray56;
        lista50.primeiro = (short) -1;
        int int60 = lista50.ultimo;
        lista50.pos = (byte) -1;
        java.lang.Object[] objArray63 = lista50.item;
        lista38.item = objArray63;
        lista0.item = objArray63;
        lista0.pos = 0;
        lista0.primeiro = (short) 1;
        boolean boolean70 = lista0.vazia();
        ds.Lista lista71 = new ds.Lista();
        boolean boolean72 = lista71.vazia();
        lista71.imprime();
        int int74 = lista71.ultimo;
        lista71.imprime();
        boolean boolean76 = lista71.vazia();
        lista71.primeiro = '4';
        lista71.imprime();
        lista71.pos = 0;
        lista0.insere((java.lang.Object) lista71);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = 'a';
        lista0.primeiro = (-1);
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        int int19 = lista16.primeiro;
        lista16.pos = (byte) 1;
        int int22 = lista16.primeiro;
        java.lang.Object[] objArray23 = lista16.item;
        lista0.item = objArray23;
        boolean boolean25 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = null;
        lista0.item = objArray2;
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        java.lang.Object[] objArray10 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista4.item = objArray10;
        lista0.item = objArray10;
        lista0.pos = (short) 1;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, 1, 1, 0]");
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.imprime();
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        int int10 = lista0.ultimo;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.primeiro = (short) 100;
        java.lang.Object[] objArray15 = lista11.item;
        lista0.item = objArray15;
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        lista0.insere((java.lang.Object) (-1L));
        int int7 = lista0.ultimo;
        lista0.ultimo = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.ultimo;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        java.lang.Object[] objArray40 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista34.item = objArray40;
        int int42 = lista34.pos;
        lista34.pos = (byte) 0;
        boolean boolean45 = lista34.vazia();
        lista34.ultimo = (short) 0;
        lista34.primeiro = (-1);
        int int50 = lista34.primeiro;
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        java.lang.Object[] objArray57 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista51.item = objArray57;
        lista51.pos = 0;
        lista51.imprime();
        ds.Lista lista63 = new ds.Lista();
        boolean boolean64 = lista63.vazia();
        java.lang.Object[] objArray69 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista63.item = objArray69;
        lista63.pos = 0;
        java.lang.Class<?> wildcardClass73 = lista63.getClass();
        ds.Lista lista74 = new ds.Lista();
        boolean boolean75 = lista74.vazia();
        java.lang.Object[] objArray80 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista74.item = objArray80;
        lista74.primeiro = (short) -1;
        int int84 = lista74.ultimo;
        java.lang.Object[] objArray85 = new java.lang.Object[] { (-1), lista63, lista74 };
        lista51.item = objArray85;
        lista51.ultimo = (byte) 1;
        lista51.imprime();
        int int90 = lista51.pos;
        boolean boolean91 = lista51.vazia();
        lista51.imprime();
        lista34.insere((java.lang.Object) lista51);
        java.lang.Class<?> wildcardClass94 = lista34.getClass();
        lista0.insere((java.lang.Object) wildcardClass94);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.ultimo = 10;
        lista5.insere((java.lang.Object) (-1L));
        int int12 = lista5.ultimo;
        java.lang.Object[] objArray13 = lista5.item;
        lista0.item = objArray13;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        java.lang.Object[] objArray22 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista16.item = objArray22;
        lista16.primeiro = (short) -1;
        lista16.primeiro = 1;
        lista16.ultimo = (byte) -1;
        int int30 = lista16.ultimo;
        lista0.insere((java.lang.Object) lista16);
        boolean boolean32 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        boolean boolean11 = lista0.vazia();
        lista0.ultimo = (short) 0;
        java.lang.Object[] objArray14 = lista0.item;
        int int15 = lista0.pos;
        java.lang.Object[] objArray16 = null;
        lista0.item = objArray16;
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        int int7 = lista0.primeiro;
        java.lang.Object[] objArray8 = null;
        lista0.item = objArray8;
        lista0.primeiro = (byte) 0;
        int int12 = lista0.pos;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        java.lang.Object[] objArray12 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista6.item = objArray12;
        lista0.item = objArray12;
        lista0.primeiro = (byte) 0;
        int int17 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 32;
        lista0.pos = 2;
        lista0.ultimo = 0;
        lista0.imprime();
        java.lang.Object[] objArray26 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, 1, 0]");
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.ultimo = '#';
        int int12 = lista0.ultimo;
        lista0.pos = (byte) 1;
        int int15 = lista0.ultimo;
        lista0.ultimo = 2;
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        lista0.pos = 12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test802");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        boolean boolean11 = lista0.vazia();
        lista0.ultimo = (short) 0;
        java.lang.Object[] objArray14 = lista0.item;
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[, 1, 1, 0]");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test803");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.primeiro = (short) 100;
        java.lang.Object[] objArray13 = lista9.item;
        lista0.item = objArray13;
        lista0.imprime();
        java.lang.Object[] objArray16 = lista0.item;
        boolean boolean17 = lista0.vazia();
        int int18 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test804");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        lista9.primeiro = (short) -1;
        lista9.primeiro = 1;
        int int21 = lista9.ultimo;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        int int25 = lista22.pos;
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray28 = lista22.item;
        lista9.item = objArray28;
        lista5.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.pos;
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        boolean boolean35 = lista33.vazia();
        lista33.primeiro = (byte) 0;
        lista33.ultimo = (byte) 10;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        java.lang.Object[] objArray46 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista40.item = objArray46;
        lista40.pos = 0;
        java.lang.Class<?> wildcardClass50 = lista40.getClass();
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        boolean boolean53 = lista51.vazia();
        java.lang.Object[] objArray54 = new java.lang.Object[] { wildcardClass50, lista51 };
        lista33.item = objArray54;
        lista0.item = objArray54;
        lista0.imprime();
        int int58 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test805");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        lista0.imprime();
        lista0.primeiro = (-1);
        lista0.pos = 100;
        boolean boolean12 = lista0.vazia();
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test806");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = (short) 1;
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test807");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray12 = lista0.item;
        lista0.insere((java.lang.Object) 1);
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        boolean boolean17 = lista15.vazia();
        int int18 = lista15.pos;
        lista15.ultimo = '#';
        int int21 = lista15.primeiro;
        lista15.ultimo = 100;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        int int27 = lista24.primeiro;
        lista15.insere((java.lang.Object) lista24);
        lista24.pos = (-1);
        lista0.insere((java.lang.Object) lista24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test808");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        int int5 = lista0.pos;
        lista0.pos = 0;
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test809");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.primeiro = '#';
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        int int15 = lista12.pos;
        int int16 = lista12.pos;
        lista0.insere((java.lang.Object) int16);
        lista0.primeiro = 35;
        lista0.pos = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test810");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        int int38 = lista0.ultimo;
        boolean boolean39 = lista0.vazia();
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        boolean boolean42 = lista40.vazia();
        lista40.primeiro = (byte) 0;
        lista40.ultimo = (byte) 10;
        ds.Lista lista47 = new ds.Lista();
        boolean boolean48 = lista47.vazia();
        java.lang.Object[] objArray53 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista47.item = objArray53;
        lista47.pos = 0;
        java.lang.Class<?> wildcardClass57 = lista47.getClass();
        ds.Lista lista58 = new ds.Lista();
        boolean boolean59 = lista58.vazia();
        boolean boolean60 = lista58.vazia();
        java.lang.Object[] objArray61 = new java.lang.Object[] { wildcardClass57, lista58 };
        lista40.item = objArray61;
        lista40.ultimo = (short) -1;
        int int65 = lista40.primeiro;
        boolean boolean66 = lista40.vazia();
        java.lang.Class<?> wildcardClass67 = lista40.getClass();
        lista0.insere((java.lang.Object) lista40);
        lista40.ultimo = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test811");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 10;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        lista7.pos = 0;
        java.lang.Class<?> wildcardClass17 = lista7.getClass();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass17, lista18 };
        lista0.item = objArray21;
        lista0.ultimo = (short) -1;
        int int25 = lista0.ultimo;
        lista0.pos = 11;
        boolean boolean28 = lista0.vazia();
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        boolean boolean31 = lista29.vazia();
        int int32 = lista29.pos;
        lista29.ultimo = '#';
        int int35 = lista29.ultimo;
        int int36 = lista29.ultimo;
        lista29.primeiro = (short) 10;
        boolean boolean39 = lista29.vazia();
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        boolean boolean42 = lista40.vazia();
        int int43 = lista40.pos;
        lista40.ultimo = '#';
        int int46 = lista40.ultimo;
        int int47 = lista40.ultimo;
        lista40.primeiro = (short) 10;
        lista29.insere((java.lang.Object) (short) 10);
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        boolean boolean53 = lista51.vazia();
        lista51.ultimo = 10;
        lista51.insere((java.lang.Object) (-1L));
        java.lang.Object[] objArray58 = lista51.item;
        lista29.item = objArray58;
        lista0.item = objArray58;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test812");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        lista0.pos = (-1);
        int int7 = lista0.primeiro;
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista9.item = objArray15;
        int int17 = lista9.pos;
        lista9.pos = (byte) 0;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        int int23 = lista20.pos;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista24.item = objArray30;
        lista24.primeiro = (short) -1;
        lista24.primeiro = 1;
        int int36 = lista24.ultimo;
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        boolean boolean39 = lista37.vazia();
        int int40 = lista37.pos;
        int int41 = lista37.pos;
        java.lang.Object[] objArray42 = lista37.item;
        java.lang.Object[] objArray43 = lista37.item;
        lista24.item = objArray43;
        lista20.item = objArray43;
        lista9.item = objArray43;
        lista0.item = objArray43;
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        java.lang.Object[] objArray54 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista48.item = objArray54;
        lista48.pos = 0;
        lista48.imprime();
        ds.Lista lista60 = new ds.Lista();
        boolean boolean61 = lista60.vazia();
        java.lang.Object[] objArray66 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista60.item = objArray66;
        lista60.pos = 0;
        java.lang.Class<?> wildcardClass70 = lista60.getClass();
        ds.Lista lista71 = new ds.Lista();
        boolean boolean72 = lista71.vazia();
        java.lang.Object[] objArray77 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista71.item = objArray77;
        lista71.primeiro = (short) -1;
        int int81 = lista71.ultimo;
        java.lang.Object[] objArray82 = new java.lang.Object[] { (-1), lista60, lista71 };
        lista48.item = objArray82;
        lista48.ultimo = (byte) 1;
        lista48.imprime();
        int int87 = lista48.ultimo;
        ds.Lista lista88 = new ds.Lista();
        boolean boolean89 = lista88.vazia();
        boolean boolean90 = lista88.vazia();
        int int91 = lista88.pos;
        int int92 = lista88.pos;
        java.lang.Object[] objArray93 = lista88.item;
        lista48.item = objArray93;
        lista0.item = objArray93;
        int int96 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test813");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        java.lang.Object[] objArray10 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista4.item = objArray10;
        lista4.primeiro = (short) -1;
        lista4.primeiro = 1;
        lista4.ultimo = (byte) -1;
        int int18 = lista4.ultimo;
        boolean boolean19 = lista4.vazia();
        lista0.insere((java.lang.Object) lista4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test814");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.pos;
        int int17 = lista13.pos;
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        java.lang.Object[] objArray28 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista22.item = objArray28;
        int int30 = lista22.pos;
        lista22.pos = (byte) 0;
        int int33 = lista22.primeiro;
        lista22.primeiro = 35;
        lista0.insere((java.lang.Object) lista22);
        lista22.imprime();
        int int38 = lista22.pos;
        lista22.ultimo = 100;
        lista22.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test815");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test816");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        int int7 = lista0.pos;
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test817");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        java.lang.Object[] objArray12 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista6.item = objArray12;
        lista5.item = objArray12;
        java.lang.Object[] objArray15 = lista5.item;
        lista0.item = objArray15;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        java.lang.Object[] objArray24 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista18.item = objArray24;
        int int26 = lista18.pos;
        lista18.pos = (byte) 0;
        int int29 = lista18.ultimo;
        lista18.pos = (byte) 100;
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = (short) 1;
        lista18.insere((java.lang.Object) (short) 1);
        lista0.insere((java.lang.Object) lista18);
        lista18.pos = 11;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test818");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = 100;
        lista0.primeiro = 11;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test819");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        lista0.insere((java.lang.Object) lista14);
        java.lang.Object[] objArray18 = lista14.item;
        int int19 = lista14.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test820");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        lista0.pos = 2;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test821");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista5.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = (short) 100;
        java.lang.Object[] objArray16 = lista12.item;
        lista5.item = objArray16;
        lista5.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test822");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        lista0.insere((java.lang.Object) lista14);
        int int18 = lista14.pos;
        int int19 = lista14.primeiro;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.primeiro = (short) 100;
        lista20.pos = (byte) 0;
        lista14.insere((java.lang.Object) lista20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test823");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.imprime();
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test824");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.ultimo = '#';
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        java.lang.Object[] objArray15 = lista12.item;
        lista0.item = objArray15;
        lista0.pos = 52;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test825");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.imprime();
        int int37 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test826");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        lista0.pos = (short) 0;
        java.lang.Object[] objArray13 = null;
        lista0.item = objArray13;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test827");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        int int12 = lista0.pos;
        lista0.imprime();
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test828");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        lista0.insere((java.lang.Object) (-1L));
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista7.item = objArray13;
        int int15 = lista7.pos;
        lista7.pos = (byte) 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        int int21 = lista18.pos;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        java.lang.Object[] objArray28 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista22.item = objArray28;
        lista22.primeiro = (short) -1;
        lista22.primeiro = 1;
        int int34 = lista22.ultimo;
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        int int38 = lista35.pos;
        int int39 = lista35.pos;
        java.lang.Object[] objArray40 = lista35.item;
        java.lang.Object[] objArray41 = lista35.item;
        lista22.item = objArray41;
        lista18.item = objArray41;
        lista7.item = objArray41;
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        java.lang.Object[] objArray51 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista45.item = objArray51;
        lista45.pos = 0;
        lista45.primeiro = '#';
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        java.lang.Object[] objArray63 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista57.item = objArray63;
        lista57.primeiro = (short) -1;
        int int67 = lista57.ultimo;
        lista57.pos = (byte) -1;
        java.lang.Object[] objArray70 = lista57.item;
        lista45.item = objArray70;
        lista7.item = objArray70;
        lista0.insere((java.lang.Object) objArray70);
        int int74 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test829");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        int int39 = lista0.pos;
        boolean boolean40 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        boolean boolean45 = lista43.vazia();
        int int46 = lista43.pos;
        int int47 = lista43.pos;
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        java.lang.Object[] objArray54 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista48.item = objArray54;
        lista48.primeiro = (short) -1;
        lista48.primeiro = 1;
        java.lang.Object[] objArray60 = lista48.item;
        lista43.item = objArray60;
        lista0.item = objArray60;
        int int63 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[, 1, 1, 0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test830");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        int int12 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        lista0.ultimo = 35;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        int int19 = lista16.ultimo;
        lista16.imprime();
        boolean boolean21 = lista16.vazia();
        lista16.primeiro = '4';
        lista16.imprime();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        lista25.primeiro = (short) 100;
        java.lang.Object[] objArray29 = lista25.item;
        lista16.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.ultimo;
        lista0.ultimo = ' ';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test831");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.primeiro = ' ';
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        lista10.ultimo = 10;
        lista10.insere((java.lang.Object) (-1L));
        int int17 = lista10.ultimo;
        java.lang.Object[] objArray18 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        boolean boolean20 = lista10.vazia();
        int int21 = lista10.pos;
        int int22 = lista10.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }
}

