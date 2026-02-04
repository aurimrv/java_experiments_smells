package ds.seed5482;

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
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = 'a';
        lista0.pos = 97;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = lista15.item;
        lista15.primeiro = (byte) 1;
        java.lang.Object[] objArray20 = lista15.item;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.ultimo;
        java.lang.Object[] objArray26 = lista24.item;
        lista21.item = objArray26;
        lista15.item = objArray26;
        lista0.item = objArray26;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista30.item = objArray34;
        lista0.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        lista37.imprime();
        int int39 = lista37.primeiro;
        int int40 = lista37.primeiro;
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        int int43 = lista41.primeiro;
        lista41.primeiro = 10;
        lista37.insere((java.lang.Object) lista41);
        boolean boolean47 = lista37.vazia();
        boolean boolean48 = lista37.vazia();
        int int49 = lista37.primeiro;
        ds.Lista lista50 = new ds.Lista();
        int int51 = lista50.pos;
        lista50.ultimo = '#';
        lista50.pos = (short) 10;
        int int56 = lista50.pos;
        lista50.primeiro = 0;
        ds.Lista lista59 = new ds.Lista();
        int int60 = lista59.ultimo;
        java.lang.Object[] objArray61 = lista59.item;
        java.lang.Object[] objArray62 = lista59.item;
        lista50.item = objArray62;
        lista37.item = objArray62;
        lista0.item = objArray62;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.pos = '#';
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
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
        int int30 = lista21.primeiro;
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
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
        boolean boolean53 = lista19.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.primeiro = (byte) 1;
        boolean boolean8 = lista0.vazia();
        lista0.pos = 0;
        lista0.pos = 101;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = 0;
        lista0.pos = 1;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 100;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
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
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        int int14 = lista12.primeiro;
        java.lang.Object[] objArray15 = lista12.item;
        lista12.ultimo = 1;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray20 = lista12.item;
        int int21 = lista12.primeiro;
        int int22 = lista12.pos;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        int int25 = lista23.primeiro;
        lista23.imprime();
        int int27 = lista23.pos;
        lista23.primeiro = (byte) -1;
        java.lang.Object[] objArray30 = lista23.item;
        lista12.item = objArray30;
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        boolean boolean34 = lista32.vazia();
        int int35 = lista32.primeiro;
        lista12.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray37 = lista32.item;
        lista0.item = objArray37;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        int int12 = lista10.primeiro;
        lista10.imprime();
        int int14 = lista10.ultimo;
        lista0.insere((java.lang.Object) int14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
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
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
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
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.pos = 1;
        lista0.imprime();
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
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
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
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
        int int27 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.pos = (byte) 0;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        lista32.ultimo = '#';
        lista32.pos = (short) 0;
        java.lang.Object[] objArray38 = lista32.item;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.ultimo;
        java.lang.Object[] objArray41 = lista39.item;
        lista39.primeiro = (byte) 1;
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.pos;
        lista44.ultimo = (byte) 1;
        ds.Lista lista48 = new ds.Lista();
        lista48.imprime();
        int int50 = lista48.primeiro;
        java.lang.Object[] objArray51 = lista48.item;
        lista44.item = objArray51;
        java.lang.Class<?> wildcardClass53 = lista44.getClass();
        lista39.insere((java.lang.Object) wildcardClass53);
        lista39.imprime();
        lista32.insere((java.lang.Object) lista39);
        lista0.insere((java.lang.Object) lista39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        int int6 = lista0.pos;
        lista0.primeiro = 36;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = '#';
        lista9.ultimo = 0;
        lista0.insere((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.pos = 100;
        lista0.pos = (-1);
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
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
        int int23 = lista6.primeiro;
        java.lang.Class<?> wildcardClass24 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
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
        lista18.pos = 10;
        lista18.primeiro = 0;
        int int25 = lista18.ultimo;
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
        int int37 = lista26.ultimo;
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.pos;
        lista38.ultimo = '#';
        lista38.pos = (short) 0;
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.pos;
        java.lang.Object[] objArray46 = lista44.item;
        lista38.item = objArray46;
        lista26.item = objArray46;
        java.lang.Object[] objArray49 = lista26.item;
        lista18.item = objArray49;
        lista0.insere((java.lang.Object) objArray49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
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
        lista0.ultimo = '4';
        java.lang.Object[] objArray28 = lista0.item;
        lista0.ultimo = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = (short) 1;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray15 = lista13.item;
        lista8.item = objArray15;
        int int17 = lista8.primeiro;
        boolean boolean18 = lista8.vazia();
        int int19 = lista8.ultimo;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        lista20.ultimo = '#';
        lista20.pos = (short) 0;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        java.lang.Object[] objArray28 = lista26.item;
        lista20.item = objArray28;
        lista8.item = objArray28;
        java.lang.Object[] objArray31 = lista8.item;
        lista0.item = objArray31;
        java.lang.Class<?> wildcardClass33 = objArray31.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
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
        lista0.primeiro = 37;
        int int33 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 37 + "'", int33 == 37);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        lista0.imprime();
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = '#';
        int int13 = lista9.pos;
        int int14 = lista9.pos;
        lista9.ultimo = (short) 100;
        lista0.insere((java.lang.Object) lista9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
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
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        lista0.pos = 0;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
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
        lista0.imprime();
        lista0.pos = '4';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
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
        lista0.ultimo = 100;
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
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
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
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.primeiro = 10;
        lista15.imprime();
        lista15.imprime();
        int int22 = lista15.ultimo;
        boolean boolean23 = lista15.vazia();
        java.lang.Object[] objArray24 = lista15.item;
        lista0.insere((java.lang.Object) lista15);
        int int26 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
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
        lista0.ultimo = '#';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
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
        lista14.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
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
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        int int20 = lista17.primeiro;
        int int21 = lista17.primeiro;
        lista17.pos = 1;
        int int24 = lista17.primeiro;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        lista25.ultimo = '#';
        java.lang.Object obj29 = null;
        lista25.insere(obj29);
        int int31 = lista25.primeiro;
        boolean boolean32 = lista25.vazia();
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        lista33.ultimo = '#';
        lista33.pos = (short) 10;
        lista25.insere((java.lang.Object) (short) 10);
        lista25.primeiro = 1;
        lista17.insere((java.lang.Object) lista25);
        java.lang.Object[] objArray43 = lista25.item;
        lista0.item = objArray43;
        lista0.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
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
        int int15 = lista0.pos;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
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
        int int14 = lista12.pos;
        java.lang.Object[] objArray15 = lista12.item;
        java.lang.Object[] objArray16 = lista12.item;
        int int17 = lista12.ultimo;
        int int18 = lista12.ultimo;
        java.lang.Object[] objArray19 = lista12.item;
        lista0.item = objArray19;
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
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
        lista20.primeiro = (byte) 0;
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
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = 100;
        boolean boolean6 = lista0.vazia();
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.ultimo;
        java.lang.Object[] objArray11 = lista9.item;
        lista6.item = objArray11;
        lista0.item = objArray11;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
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
        lista0.imprime();
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
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
        lista10.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = '#';
        int int9 = lista0.pos;
        lista0.imprime();
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
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
        lista0.primeiro = 35;
        boolean boolean26 = lista0.vazia();
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        lista0.ultimo = 97;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = null;
        lista8.item = objArray10;
        lista8.ultimo = 'a';
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        int int16 = lista14.primeiro;
        lista14.imprime();
        int int18 = lista14.pos;
        lista14.primeiro = (byte) -1;
        java.lang.Object[] objArray21 = lista14.item;
        lista14.pos = (short) 10;
        java.lang.Object[] objArray24 = lista14.item;
        lista14.pos = 'a';
        lista14.pos = 97;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.ultimo;
        java.lang.Object[] objArray31 = lista29.item;
        lista29.primeiro = (byte) 1;
        java.lang.Object[] objArray34 = lista29.item;
        ds.Lista lista35 = new ds.Lista();
        int int36 = lista35.pos;
        int int37 = lista35.ultimo;
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.ultimo;
        java.lang.Object[] objArray40 = lista38.item;
        lista35.item = objArray40;
        lista29.item = objArray40;
        lista14.item = objArray40;
        lista8.item = objArray40;
        lista0.item = objArray40;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
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
        int int12 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
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
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        lista12.ultimo = 0;
        lista12.ultimo = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.pos = 10;
        lista20.primeiro = 0;
        int int27 = lista20.ultimo;
        java.lang.Object[] objArray28 = lista20.item;
        lista12.item = objArray28;
        java.lang.Object[] objArray30 = lista12.item;
        lista0.insere((java.lang.Object) lista12);
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.pos = 1;
        lista0.ultimo = ' ';
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
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
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        int int7 = lista5.ultimo;
        lista0.insere((java.lang.Object) int7);
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
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
        int int26 = lista0.pos;
        boolean boolean27 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = 98;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        lista4.ultimo = '#';
        lista4.ultimo = 0;
        int int10 = lista4.pos;
        lista0.insere((java.lang.Object) lista4);
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista6.pos;
        boolean boolean11 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        lista4.ultimo = '#';
        lista4.pos = (short) 10;
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray12 = lista10.item;
        lista4.insere((java.lang.Object) lista10);
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = '#';
        lista10.insere((java.lang.Object) lista14);
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        lista19.ultimo = '#';
        java.lang.Object obj23 = null;
        lista19.insere(obj23);
        int int25 = lista19.primeiro;
        java.lang.Object[] objArray26 = lista19.item;
        lista14.insere((java.lang.Object) lista19);
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        int int30 = lista28.ultimo;
        lista28.primeiro = (short) 1;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        lista33.ultimo = (byte) 1;
        ds.Lista lista37 = new ds.Lista();
        lista37.imprime();
        int int39 = lista37.primeiro;
        java.lang.Object[] objArray40 = lista37.item;
        lista33.item = objArray40;
        lista28.item = objArray40;
        lista19.item = objArray40;
        lista19.pos = 0;
        lista0.insere((java.lang.Object) lista19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        int int11 = lista8.pos;
        lista8.ultimo = 97;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = 10;
        lista8.insere((java.lang.Object) lista14);
        int int19 = lista8.ultimo;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        int int23 = lista20.pos;
        lista20.pos = 100;
        lista20.pos = (-1);
        java.lang.Object[] objArray28 = lista20.item;
        lista8.item = objArray28;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        int int7 = lista5.ultimo;
        lista0.insere((java.lang.Object) int7);
        java.lang.Object[] objArray9 = lista0.item;
        lista0.imprime();
        lista0.primeiro = (byte) 1;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 10, 1]");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        lista0.primeiro = 1;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
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
        int int24 = lista0.pos;
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = 10;
        boolean boolean12 = lista4.vazia();
        lista4.primeiro = 2;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
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
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        lista13.ultimo = '#';
        lista13.pos = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray21 = lista19.item;
        lista13.insere((java.lang.Object) lista19);
        ds.Lista lista23 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista24.item = objArray28;
        lista23.item = objArray28;
        lista23.primeiro = ' ';
        lista23.primeiro = 2;
        java.lang.Object[] objArray35 = lista23.item;
        lista19.item = objArray35;
        lista6.insere((java.lang.Object) lista19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, 10, 1]");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
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
        boolean boolean30 = lista21.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.pos = (short) 0;
        boolean boolean4 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
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
        lista11.imprime();
        int int13 = lista11.primeiro;
        int int14 = lista11.primeiro;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.primeiro = 10;
        lista11.insere((java.lang.Object) lista15);
        boolean boolean21 = lista11.vazia();
        boolean boolean22 = lista11.vazia();
        int int23 = lista11.primeiro;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.ultimo = '#';
        lista24.pos = (short) 10;
        int int30 = lista24.pos;
        lista24.primeiro = 0;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.ultimo;
        java.lang.Object[] objArray35 = lista33.item;
        java.lang.Object[] objArray36 = lista33.item;
        lista24.item = objArray36;
        lista11.item = objArray36;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
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
        int int24 = lista6.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
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
        int int39 = lista7.pos;
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        int int42 = lista40.primeiro;
        java.lang.Object[] objArray43 = lista40.item;
        lista7.item = objArray43;
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista10.ultimo = 0;
        lista10.ultimo = (short) 10;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.pos = 10;
        lista18.primeiro = 0;
        int int25 = lista18.ultimo;
        java.lang.Object[] objArray26 = lista18.item;
        lista10.item = objArray26;
        java.lang.Object[] objArray28 = lista10.item;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.primeiro;
        int int11 = lista0.ultimo;
        lista0.primeiro = 35;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
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
        lista20.primeiro = (short) 10;
        java.lang.Object[] objArray27 = lista20.item;
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
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.pos = (byte) 100;
        int int9 = lista0.ultimo;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
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
        lista7.imprime();
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
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.ultimo;
        java.lang.Object[] objArray11 = lista9.item;
        lista6.item = objArray11;
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
        int int41 = lista14.primeiro;
        int int42 = lista14.ultimo;
        lista14.primeiro = (short) -1;
        ds.Lista lista45 = new ds.Lista();
        lista45.imprime();
        int int47 = lista45.primeiro;
        lista45.ultimo = 100;
        java.lang.Object[] objArray50 = lista45.item;
        lista14.insere((java.lang.Object) lista45);
        java.lang.Object[] objArray52 = lista14.item;
        lista0.item = objArray52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
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
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        int int6 = lista0.ultimo;
        lista0.ultimo = (short) -1;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        lista0.primeiro = (short) -1;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
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
        lista0.pos = 10;
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
        lista24.pos = 'a';
        lista24.primeiro = (byte) 0;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.pos;
        int int39 = lista37.ultimo;
        lista37.pos = 10;
        lista37.primeiro = 0;
        int int44 = lista37.ultimo;
        lista24.insere((java.lang.Object) int44);
        ds.Lista lista46 = new ds.Lista();
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista47.item = objArray51;
        lista46.item = objArray51;
        lista46.primeiro = ' ';
        lista46.primeiro = 2;
        lista24.insere((java.lang.Object) lista46);
        lista0.insere((java.lang.Object) lista46);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[-1, 10, 1]");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
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
        int int12 = lista0.pos;
        lista0.pos = (byte) 100;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
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
        lista20.primeiro = 35;
        lista20.imprime();
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
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = 0;
        lista0.pos = 'a';
        boolean boolean11 = lista0.vazia();
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (short) 100;
        lista0.primeiro = ' ';
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.pos = (short) 10;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        lista8.insere((java.lang.Object) lista14);
        lista8.primeiro = (short) -1;
        lista8.ultimo = (short) 1;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        lista22.ultimo = '#';
        lista22.pos = (short) 10;
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        java.lang.Object[] objArray30 = lista28.item;
        lista22.insere((java.lang.Object) lista28);
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        lista32.ultimo = '#';
        lista28.insere((java.lang.Object) lista32);
        ds.Lista lista37 = new ds.Lista();
        lista37.imprime();
        int int39 = lista37.primeiro;
        lista37.imprime();
        int int41 = lista37.pos;
        lista37.primeiro = (byte) -1;
        java.lang.Object[] objArray44 = lista37.item;
        lista32.item = objArray44;
        lista8.insere((java.lang.Object) lista32);
        lista0.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray48 = lista0.item;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
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
        int int15 = lista6.primeiro;
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = 100;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = '#';
        lista7.ultimo = 0;
        lista7.ultimo = (short) 10;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        int int17 = lista15.ultimo;
        lista15.pos = 10;
        lista15.primeiro = 0;
        int int22 = lista15.ultimo;
        java.lang.Object[] objArray23 = lista15.item;
        lista7.item = objArray23;
        lista7.pos = 52;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        int int29 = lista27.primeiro;
        int int30 = lista27.primeiro;
        lista27.pos = (-1);
        java.lang.Object[] objArray33 = lista27.item;
        lista7.item = objArray33;
        lista0.item = objArray33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        int int8 = lista5.ultimo;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        lista9.item = objArray16;
        lista5.item = objArray16;
        lista0.item = objArray16;
        java.lang.Object obj20 = null;
        lista0.insere(obj20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
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
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        lista19.ultimo = '#';
        lista19.pos = (short) 0;
        java.lang.Object[] objArray25 = lista19.item;
        lista0.item = objArray25;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = 'a';
        lista0.pos = 97;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = lista15.item;
        lista15.primeiro = (byte) 1;
        java.lang.Object[] objArray20 = lista15.item;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.ultimo;
        java.lang.Object[] objArray26 = lista24.item;
        lista21.item = objArray26;
        lista15.item = objArray26;
        lista0.item = objArray26;
        int int30 = lista0.ultimo;
        int int31 = lista0.ultimo;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.ultimo;
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista9.item = objArray13;
        lista8.item = objArray13;
        lista8.pos = (-1);
        int int18 = lista8.primeiro;
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        java.lang.Object[] objArray4 = lista0.item;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.ultimo;
        java.lang.Object[] objArray9 = lista7.item;
        lista7.primeiro = (byte) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = (short) 1;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        lista17.ultimo = (byte) 1;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        int int23 = lista21.primeiro;
        java.lang.Object[] objArray24 = lista21.item;
        lista17.item = objArray24;
        lista12.item = objArray24;
        lista12.pos = (short) -1;
        lista12.imprime();
        lista12.ultimo = 0;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.primeiro;
        java.lang.Object obj35 = null;
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        lista12.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        int int41 = lista39.primeiro;
        lista39.imprime();
        int int43 = lista39.pos;
        lista39.primeiro = (byte) -1;
        int int46 = lista39.ultimo;
        java.lang.Object[] objArray47 = lista39.item;
        lista12.insere((java.lang.Object) objArray47);
        lista7.item = objArray47;
        lista0.item = objArray47;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
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
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
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
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
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
        lista0.pos = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        int int4 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 0;
        boolean boolean6 = lista0.vazia();
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.ultimo;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista8.item = objArray12;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        int int16 = lista14.primeiro;
        lista14.imprime();
        int int18 = lista14.pos;
        lista14.primeiro = (byte) -1;
        int int21 = lista14.ultimo;
        lista14.pos = '4';
        java.lang.Class<?> wildcardClass24 = lista14.getClass();
        lista8.insere((java.lang.Object) lista14);
        lista8.imprime();
        lista8.imprime();
        int int28 = lista8.ultimo;
        java.lang.Object[] objArray29 = lista8.item;
        lista0.item = objArray29;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        int int10 = lista0.ultimo;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
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
        lista6.primeiro = '#';
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        int int20 = lista18.primeiro;
        lista18.primeiro = 10;
        lista18.imprime();
        lista18.imprime();
        int int25 = lista18.ultimo;
        int int26 = lista18.ultimo;
        boolean boolean27 = lista18.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        int int30 = lista28.primeiro;
        java.lang.Object[] objArray31 = lista28.item;
        lista28.ultimo = 1;
        lista18.insere((java.lang.Object) lista28);
        lista6.insere((java.lang.Object) lista18);
        lista18.primeiro = 0;
        java.lang.Object[] objArray38 = lista18.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
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
        lista0.ultimo = '4';
        java.lang.Object[] objArray28 = lista0.item;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista29.item = objArray33;
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        int int37 = lista35.primeiro;
        lista35.imprime();
        int int39 = lista35.pos;
        lista35.primeiro = (byte) -1;
        int int42 = lista35.ultimo;
        lista35.pos = '4';
        java.lang.Class<?> wildcardClass45 = lista35.getClass();
        lista29.insere((java.lang.Object) lista35);
        lista29.imprime();
        lista29.imprime();
        int int49 = lista29.ultimo;
        java.lang.Object[] objArray50 = lista29.item;
        ds.Lista lista51 = new ds.Lista();
        int int52 = lista51.pos;
        lista51.ultimo = '#';
        lista51.pos = (short) 0;
        ds.Lista lista57 = new ds.Lista();
        int int58 = lista57.pos;
        java.lang.Object[] objArray59 = lista57.item;
        lista51.item = objArray59;
        int int61 = lista51.ultimo;
        java.lang.Object[] objArray62 = lista51.item;
        lista29.item = objArray62;
        lista0.insere((java.lang.Object) lista29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
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
        int int18 = lista10.pos;
        int int19 = lista10.primeiro;
        int int20 = lista10.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
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
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (short) 10;
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.ultimo = 97;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        lista6.ultimo = 10;
        lista0.insere((java.lang.Object) lista6);
        int int11 = lista6.ultimo;
        int int12 = lista6.primeiro;
        boolean boolean13 = lista6.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
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
        java.lang.Class<?> wildcardClass23 = lista16.getClass();
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
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.pos = 36;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.pos = (byte) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        int int15 = lista11.pos;
        lista11.primeiro = (byte) -1;
        int int18 = lista11.ultimo;
        lista0.insere((java.lang.Object) int18);
        java.lang.Object[] objArray20 = lista0.item;
        lista0.pos = (short) 10;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        int int25 = lista23.primeiro;
        int int26 = lista23.primeiro;
        lista23.pos = (-1);
        java.lang.Object[] objArray29 = lista23.item;
        lista0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
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
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = (short) 1;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        lista12.item = objArray19;
        int int21 = lista12.primeiro;
        boolean boolean22 = lista12.vazia();
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        int int25 = lista23.ultimo;
        lista23.pos = 10;
        int int28 = lista23.pos;
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        int int31 = lista29.primeiro;
        java.lang.Object[] objArray32 = lista29.item;
        lista29.ultimo = 1;
        ds.Lista lista35 = new ds.Lista();
        lista29.insere((java.lang.Object) lista35);
        java.lang.Object[] objArray37 = lista29.item;
        int int38 = lista29.primeiro;
        int int39 = lista29.pos;
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        int int42 = lista40.primeiro;
        lista40.imprime();
        int int44 = lista40.pos;
        lista40.primeiro = (byte) -1;
        java.lang.Object[] objArray47 = lista40.item;
        lista29.item = objArray47;
        lista23.insere((java.lang.Object) objArray47);
        lista12.item = objArray47;
        lista0.item = objArray47;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.primeiro = (byte) 1;
        int int8 = lista0.pos;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
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
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        lista26.ultimo = '#';
        lista26.pos = (short) 10;
        int int32 = lista26.pos;
        lista26.primeiro = (short) 0;
        lista26.pos = (byte) 1;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista26.insere((java.lang.Object) objArray38);
        lista20.item = objArray38;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = (short) 1;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray15 = lista13.item;
        lista8.item = objArray15;
        int int17 = lista8.primeiro;
        boolean boolean18 = lista8.vazia();
        int int19 = lista8.ultimo;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        lista20.ultimo = '#';
        lista20.pos = (short) 0;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        java.lang.Object[] objArray28 = lista26.item;
        lista20.item = objArray28;
        lista8.item = objArray28;
        java.lang.Object[] objArray31 = lista8.item;
        lista0.item = objArray31;
        int int33 = lista0.ultimo;
        int int34 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
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
        lista6.primeiro = '#';
        int int18 = lista6.ultimo;
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.ultimo;
        int int8 = lista0.ultimo;
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        int int12 = lista10.primeiro;
        java.lang.Object[] objArray13 = lista10.item;
        lista10.ultimo = 1;
        lista0.insere((java.lang.Object) lista10);
        int int17 = lista10.ultimo;
        boolean boolean18 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        int int5 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
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
        lista0.imprime();
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        lista0.primeiro = (short) 0;
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        java.lang.Object[] objArray14 = null;
        lista12.item = objArray14;
        lista12.ultimo = 'a';
        lista12.ultimo = 101;
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
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.pos;
        lista36.ultimo = '#';
        lista36.pos = (short) 0;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        java.lang.Object[] objArray44 = lista42.item;
        lista36.item = objArray44;
        lista20.item = objArray44;
        lista12.item = objArray44;
        lista0.insere((java.lang.Object) lista12);
        lista12.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
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
        java.lang.Object[] objArray12 = lista6.item;
        lista6.imprime();
        lista6.primeiro = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista6.pos = 1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = '#';
        java.lang.Object obj18 = null;
        lista14.insere(obj18);
        int int20 = lista14.primeiro;
        boolean boolean21 = lista14.vazia();
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        lista22.ultimo = '#';
        lista22.pos = (short) 10;
        lista14.insere((java.lang.Object) (short) 10);
        lista14.primeiro = 1;
        lista6.insere((java.lang.Object) lista14);
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.primeiro;
        java.lang.Object obj35 = null;
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        lista32.primeiro = (short) 10;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.ultimo;
        java.lang.Object[] objArray42 = lista40.item;
        lista32.item = objArray42;
        boolean boolean44 = lista32.vazia();
        ds.Lista lista45 = new ds.Lista();
        int int46 = lista45.ultimo;
        java.lang.Object[] objArray47 = lista45.item;
        lista45.primeiro = (byte) 1;
        int int50 = lista45.primeiro;
        java.lang.Object[] objArray51 = lista45.item;
        lista32.item = objArray51;
        lista6.insere((java.lang.Object) lista32);
        lista6.primeiro = (short) 0;
        lista0.insere((java.lang.Object) lista6);
        java.lang.Class<?> wildcardClass57 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 36;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
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
        int int14 = lista0.pos;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        int int6 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.primeiro = 35;
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.pos = (byte) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        int int15 = lista11.pos;
        lista11.primeiro = (byte) -1;
        int int18 = lista11.ultimo;
        lista0.insere((java.lang.Object) int18);
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        lista20.ultimo = '#';
        lista20.pos = (short) 10;
        int int26 = lista20.pos;
        lista20.primeiro = 0;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.ultimo;
        java.lang.Object[] objArray31 = lista29.item;
        java.lang.Object[] objArray32 = lista29.item;
        lista20.item = objArray32;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        lista34.ultimo = '#';
        lista34.pos = (short) 0;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.pos;
        java.lang.Object[] objArray42 = lista40.item;
        lista34.item = objArray42;
        int int44 = lista34.ultimo;
        lista20.insere((java.lang.Object) lista34);
        java.lang.Object[] objArray46 = lista20.item;
        lista0.item = objArray46;
        java.lang.Class<?> wildcardClass48 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray7 = null;
        lista0.item = objArray7;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
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
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        lista16.ultimo = '#';
        lista16.pos = (short) 0;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        java.lang.Object[] objArray24 = lista22.item;
        lista16.item = objArray24;
        java.lang.Object[] objArray26 = lista16.item;
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        int int10 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
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
        int int11 = lista0.pos;
        lista0.primeiro = 35;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        int int16 = lista14.primeiro;
        lista14.ultimo = 100;
        int int19 = lista14.primeiro;
        boolean boolean20 = lista14.vazia();
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        lista21.ultimo = '#';
        java.lang.Object obj25 = null;
        lista21.insere(obj25);
        int int27 = lista21.primeiro;
        java.lang.Object[] objArray28 = lista21.item;
        lista14.item = objArray28;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
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
        int int40 = lista24.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
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
        int int41 = lista39.ultimo;
        lista39.ultimo = 10;
        lista39.pos = (byte) 10;
        boolean boolean46 = lista39.vazia();
        lista0.insere((java.lang.Object) lista39);
        java.lang.Class<?> wildcardClass48 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
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
        int int39 = lista0.pos;
        java.lang.Object[] objArray40 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
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
        int int17 = lista0.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        int int20 = lista18.primeiro;
        lista18.primeiro = 10;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        int int25 = lista23.primeiro;
        java.lang.Object[] objArray26 = lista23.item;
        lista23.ultimo = 1;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        java.lang.Object[] objArray31 = lista23.item;
        int int32 = lista23.primeiro;
        int int33 = lista23.pos;
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        int int36 = lista34.primeiro;
        lista34.imprime();
        int int38 = lista34.pos;
        lista34.primeiro = (byte) -1;
        java.lang.Object[] objArray41 = lista34.item;
        lista23.item = objArray41;
        lista18.item = objArray41;
        lista0.insere((java.lang.Object) objArray41);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = null;
        lista0.item = objArray2;
        lista0.ultimo = 'a';
        lista0.pos = 100;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertNull(objArray8);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.primeiro = (byte) 1;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
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
        boolean boolean27 = lista15.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.pos = 100;
        lista0.pos = (-1);
        int int8 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        lista7.imprime();
        int int11 = lista7.pos;
        lista7.primeiro = (byte) -1;
        int int14 = lista7.ultimo;
        java.lang.Object[] objArray15 = lista7.item;
        lista0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.ultimo = 35;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        lista11.ultimo = '#';
        lista11.pos = (short) 10;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        lista11.insere((java.lang.Object) lista17);
        int int21 = lista11.pos;
        lista11.pos = (short) -1;
        java.lang.Object[] objArray24 = lista11.item;
        int int25 = lista11.ultimo;
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 36 + "'", int25 == 36);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
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
        lista0.imprime();
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
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
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
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
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
        boolean boolean15 = lista10.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista16.ultimo = 1;
        ds.Lista lista22 = new ds.Lista();
        lista16.insere((java.lang.Object) lista22);
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        int int27 = lista24.ultimo;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        lista28.ultimo = '#';
        java.lang.Object obj32 = null;
        lista28.insere(obj32);
        int int34 = lista28.primeiro;
        boolean boolean35 = lista28.vazia();
        java.lang.Object[] objArray36 = lista28.item;
        lista24.item = objArray36;
        lista22.item = objArray36;
        lista22.ultimo = 'a';
        java.lang.Object[] objArray41 = lista22.item;
        java.lang.Object[] objArray42 = lista22.item;
        lista10.item = objArray42;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
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
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
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
        int int16 = lista5.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
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
        int int18 = lista17.pos;
        lista17.ultimo = '#';
        java.lang.Object obj21 = null;
        lista17.insere(obj21);
        int int23 = lista17.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        int int26 = lista24.primeiro;
        lista24.imprime();
        int int28 = lista24.pos;
        lista24.primeiro = (byte) -1;
        java.lang.Object[] objArray31 = lista24.item;
        java.lang.Object[] objArray32 = lista24.item;
        lista17.item = objArray32;
        lista0.item = objArray32;
        int int35 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36 + "'", int23 == 36);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.ultimo = 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
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
        java.lang.Object[] objArray19 = lista0.item;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        lista0.ultimo = (byte) 1;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista9.item = objArray13;
        lista8.item = objArray13;
        lista8.pos = (-1);
        lista8.pos = (short) 100;
        lista8.pos = 100;
        int int22 = lista8.pos;
        lista0.insere((java.lang.Object) lista8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        lista6.primeiro = 10;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        boolean boolean13 = lista11.vazia();
        lista11.pos = 0;
        boolean boolean16 = lista11.vazia();
        java.lang.Object[] objArray17 = lista11.item;
        lista6.item = objArray17;
        lista0.item = objArray17;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        boolean boolean3 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.pos = (short) 10;
        lista0.insere((java.lang.Object) (short) 10);
        lista0.primeiro = 1;
        lista0.ultimo = 52;
        lista0.pos = 10;
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        lista7.primeiro = 10;
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        int int14 = lista12.primeiro;
        java.lang.Object[] objArray15 = lista12.item;
        lista12.ultimo = 1;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray20 = lista12.item;
        int int21 = lista12.primeiro;
        int int22 = lista12.pos;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        int int25 = lista23.primeiro;
        lista23.imprime();
        int int27 = lista23.pos;
        lista23.primeiro = (byte) -1;
        java.lang.Object[] objArray30 = lista23.item;
        lista12.item = objArray30;
        lista7.item = objArray30;
        lista0.item = objArray30;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        lista0.primeiro = 100;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
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
        int int25 = lista19.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
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
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (short) 10;
        lista0.primeiro = 36;
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.ultimo;
        java.lang.Object[] objArray16 = lista14.item;
        lista11.item = objArray16;
        lista0.item = objArray16;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
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
        lista6.pos = 37;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        lista0.ultimo = (short) 0;
        int int9 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        lista0.pos = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.pos = (short) -1;
        lista0.ultimo = 100;
        int int9 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        int int6 = lista0.pos;
        lista0.primeiro = 36;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = 10;
        java.lang.Object[] objArray13 = lista9.item;
        lista0.item = objArray13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = (short) 1;
        java.lang.Object[] objArray8 = null;
        lista0.item = objArray8;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
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
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista24.imprime();
        int int28 = lista24.ultimo;
        lista24.imprime();
        int int30 = lista24.pos;
        lista24.pos = 'a';
        lista6.insere((java.lang.Object) lista24);
        boolean boolean34 = lista24.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        int int8 = lista0.pos;
        lista0.ultimo = 2;
        lista0.primeiro = 97;
        lista0.primeiro = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.ultimo = 35;
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = (-1);
        int int14 = lista11.primeiro;
        int int15 = lista11.pos;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        int int19 = lista16.ultimo;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.primeiro = (short) 1;
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        java.lang.Object[] objArray27 = lista25.item;
        lista20.item = objArray27;
        lista16.item = objArray27;
        lista11.item = objArray27;
        lista0.item = objArray27;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.ultimo;
        lista0.insere((java.lang.Object) int8);
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        java.lang.Object[] objArray14 = lista12.item;
        lista12.imprime();
        boolean boolean16 = lista12.vazia();
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray18 = lista12.item;
        lista0.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray20 = lista12.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
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
        int int26 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 36 + "'", int26 == 36);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        lista0.ultimo = 97;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
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
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
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
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = 1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        java.lang.Object obj12 = null;
        lista8.insere(obj12);
        int int14 = lista8.primeiro;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        lista16.ultimo = '#';
        lista16.pos = (short) 10;
        lista8.insere((java.lang.Object) (short) 10);
        lista8.primeiro = 1;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object obj26 = null;
        lista8.insere(obj26);
        java.lang.Object[] objArray28 = lista8.item;
        // The following exception was thrown during execution in test generation
        try {
            lista8.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.pos = (byte) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        int int15 = lista11.pos;
        lista11.primeiro = (byte) -1;
        int int18 = lista11.ultimo;
        lista0.insere((java.lang.Object) int18);
        java.lang.Object[] objArray20 = lista0.item;
        lista0.pos = (short) 10;
        lista0.primeiro = '#';
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista12.item = objArray16;
        lista7.item = objArray16;
        boolean boolean19 = lista7.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        int int22 = lista20.pos;
        java.lang.Object[] objArray23 = lista20.item;
        lista7.item = objArray23;
        lista0.item = objArray23;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
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
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
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
        lista0.primeiro = 35;
        boolean boolean26 = lista0.vazia();
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        lista27.ultimo = '#';
        lista27.pos = (short) 10;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray35 = lista33.item;
        lista27.insere((java.lang.Object) lista33);
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.pos;
        lista37.ultimo = '#';
        lista33.insere((java.lang.Object) lista37);
        lista33.pos = 0;
        lista33.pos = (short) 10;
        ds.Lista lista46 = new ds.Lista();
        lista46.pos = (-1);
        lista33.insere((java.lang.Object) lista46);
        lista33.pos = 36;
        int int52 = lista33.ultimo;
        lista0.insere((java.lang.Object) lista33);
        lista33.primeiro = (short) 10;
        ds.Lista lista56 = new ds.Lista();
        lista56.imprime();
        int int58 = lista56.primeiro;
        lista56.imprime();
        int int60 = lista56.ultimo;
        boolean boolean61 = lista56.vazia();
        lista56.imprime();
        lista33.insere((java.lang.Object) lista56);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        lista0.primeiro = (short) -1;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.ultimo;
        lista7.imprime();
        int int10 = lista7.ultimo;
        lista7.ultimo = 100;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = (-1);
        int int16 = lista13.primeiro;
        int int17 = lista13.pos;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        int int21 = lista18.ultimo;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = (short) 1;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        java.lang.Object[] objArray29 = lista27.item;
        lista22.item = objArray29;
        lista18.item = objArray29;
        lista13.item = objArray29;
        lista7.insere((java.lang.Object) objArray29);
        lista0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
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
        lista4.imprime();
        java.lang.Class<?> wildcardClass13 = lista4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.pos = '4';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, 10, 1]");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
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
        int int16 = lista14.ultimo;
        lista14.primeiro = (short) 1;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray21 = lista19.item;
        lista14.item = objArray21;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        int int25 = lista23.primeiro;
        lista23.imprime();
        int int27 = lista23.pos;
        lista23.primeiro = (byte) -1;
        java.lang.Object[] objArray30 = lista23.item;
        lista14.item = objArray30;
        lista0.item = objArray30;
        java.lang.Class<?> wildcardClass33 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.pos = (short) -1;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        lista9.imprime();
        int int13 = lista9.pos;
        lista9.primeiro = (byte) -1;
        boolean boolean16 = lista9.vazia();
        int int17 = lista9.ultimo;
        lista9.pos = (byte) 1;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        int int22 = lista20.primeiro;
        lista20.imprime();
        int int24 = lista20.pos;
        lista20.primeiro = (byte) -1;
        int int27 = lista20.ultimo;
        lista9.insere((java.lang.Object) int27);
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        lista29.ultimo = '#';
        lista29.pos = (short) 10;
        int int35 = lista29.pos;
        lista29.primeiro = 0;
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.ultimo;
        java.lang.Object[] objArray40 = lista38.item;
        java.lang.Object[] objArray41 = lista38.item;
        lista29.item = objArray41;
        ds.Lista lista43 = new ds.Lista();
        int int44 = lista43.pos;
        lista43.ultimo = '#';
        lista43.pos = (short) 0;
        ds.Lista lista49 = new ds.Lista();
        int int50 = lista49.pos;
        java.lang.Object[] objArray51 = lista49.item;
        lista43.item = objArray51;
        int int53 = lista43.ultimo;
        lista29.insere((java.lang.Object) lista43);
        java.lang.Object[] objArray55 = lista29.item;
        lista9.item = objArray55;
        lista0.item = objArray55;
        java.lang.Class<?> wildcardClass58 = objArray55.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
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
        lista7.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
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
        boolean boolean54 = lista32.vazia();
        lista32.ultimo = (short) -1;
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.primeiro = 0;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
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
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        lista0.imprime();
        lista0.insere((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.imprime();
        int int11 = lista0.pos;
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.primeiro = (byte) 1;
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista9.item = objArray13;
        lista8.item = objArray13;
        boolean boolean16 = lista8.vazia();
        int int17 = lista8.pos;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        lista18.ultimo = 10;
        int int22 = lista18.pos;
        java.lang.Object[] objArray23 = lista18.item;
        lista8.item = objArray23;
        lista0.item = objArray23;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = 1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        java.lang.Object obj12 = null;
        lista8.insere(obj12);
        int int14 = lista8.primeiro;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        lista16.ultimo = '#';
        lista16.pos = (short) 10;
        lista8.insere((java.lang.Object) (short) 10);
        lista8.primeiro = 1;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object obj26 = null;
        lista8.insere(obj26);
        java.lang.Object[] objArray28 = lista8.item;
        lista8.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        int int6 = lista0.ultimo;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.imprime();
        lista0.primeiro = '4';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
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
        lista0.pos = ' ';
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
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista6.pos;
        int int11 = lista6.primeiro;
        int int12 = lista6.ultimo;
        java.lang.Object[] objArray13 = lista6.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
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
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.primeiro = 10;
        lista15.imprime();
        lista15.imprime();
        int int22 = lista15.ultimo;
        boolean boolean23 = lista15.vazia();
        java.lang.Object[] objArray24 = lista15.item;
        lista0.insere((java.lang.Object) lista15);
        int int26 = lista15.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
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
        int int40 = lista24.ultimo;
        int int41 = lista24.primeiro;
        java.lang.Object[] objArray42 = lista24.item;
        lista24.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
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
        lista20.pos = 0;
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
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
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
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista16.primeiro = (short) 100;
        int int22 = lista16.pos;
        java.lang.Class<?> wildcardClass23 = lista16.getClass();
        lista0.insere((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
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
        java.lang.Object[] objArray46 = lista0.item;
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
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
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
        int int14 = lista13.pos;
        lista13.ultimo = '#';
        lista13.pos = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray21 = lista19.item;
        lista13.insere((java.lang.Object) lista19);
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        lista23.ultimo = '#';
        lista19.insere((java.lang.Object) lista23);
        lista19.pos = 0;
        lista19.pos = (short) 10;
        ds.Lista lista32 = new ds.Lista();
        lista32.pos = (-1);
        lista19.insere((java.lang.Object) lista32);
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.ultimo;
        java.lang.Object[] objArray38 = lista36.item;
        lista36.primeiro = (byte) 1;
        java.lang.Object[] objArray41 = lista36.item;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        ds.Lista lista45 = new ds.Lista();
        int int46 = lista45.ultimo;
        java.lang.Object[] objArray47 = lista45.item;
        lista42.item = objArray47;
        lista36.item = objArray47;
        lista19.item = objArray47;
        lista5.item = objArray47;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
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
        int int18 = lista10.pos;
        lista10.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        int int10 = lista0.ultimo;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        lista11.ultimo = 10;
        java.lang.Class<?> wildcardClass15 = lista11.getClass();
        lista0.insere((java.lang.Object) wildcardClass15);
        boolean boolean17 = lista0.vazia();
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[class ds.Lista, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[class ds.Lista, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.pos = 1;
        lista0.ultimo = ' ';
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
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
        ds.Lista lista52 = new ds.Lista();
        lista52.imprime();
        int int54 = lista52.primeiro;
        lista52.imprime();
        int int56 = lista52.pos;
        lista52.primeiro = (byte) -1;
        boolean boolean59 = lista52.vazia();
        int int60 = lista52.ultimo;
        lista52.pos = (byte) 1;
        java.lang.Object[] objArray63 = lista52.item;
        lista15.insere((java.lang.Object) objArray63);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
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
        lista32.pos = 'a';
        int int43 = lista32.pos;
        lista32.primeiro = 35;
        lista32.primeiro = 36;
        lista6.insere((java.lang.Object) 36);
        int int49 = lista6.primeiro;
        int int50 = lista6.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 98 + "'", int50 == 98);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
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
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
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
        int int23 = lista6.primeiro;
        lista6.pos = 36;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
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
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = (-1);
        lista26.imprime();
        int int30 = lista26.ultimo;
        boolean boolean31 = lista26.vazia();
        java.lang.Object[] objArray32 = lista26.item;
        lista14.item = objArray32;
        java.lang.Class<?> wildcardClass34 = objArray32.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.pos = 1;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.ultimo = 0;
        lista0.ultimo = 0;
        int int12 = lista0.primeiro;
        int int13 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (short) 10;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
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
        lista0.ultimo = (-1);
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        lista0.primeiro = 101;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
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
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        lista0.ultimo = (short) 0;
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = 52;
        int int12 = lista0.primeiro;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        lista0.ultimo = 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int5 = lista0.ultimo;
        lista0.pos = '#';
        int int8 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
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
        lista10.ultimo = (short) 100;
        int int28 = lista10.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
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
        java.lang.Object[] objArray15 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
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
        lista0.primeiro = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = 10;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = null;
        lista0.item = objArray7;
        int int9 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
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
        lista6.primeiro = '#';
        int int18 = lista6.ultimo;
        lista6.pos = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
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
        java.lang.Object[] objArray22 = lista6.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 35;
        lista0.pos = (short) -1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.pos = (short) 10;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        lista18.ultimo = '#';
        lista14.insere((java.lang.Object) lista18);
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        int int25 = lista23.primeiro;
        lista23.imprime();
        int int27 = lista23.pos;
        lista23.primeiro = (byte) -1;
        java.lang.Object[] objArray30 = lista23.item;
        lista18.item = objArray30;
        lista0.item = objArray30;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        int int35 = lista33.primeiro;
        lista33.primeiro = 10;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        int int40 = lista38.primeiro;
        java.lang.Object[] objArray41 = lista38.item;
        lista38.ultimo = 1;
        ds.Lista lista44 = new ds.Lista();
        lista38.insere((java.lang.Object) lista44);
        java.lang.Object[] objArray46 = lista38.item;
        int int47 = lista38.primeiro;
        int int48 = lista38.pos;
        ds.Lista lista49 = new ds.Lista();
        lista49.imprime();
        int int51 = lista49.primeiro;
        lista49.imprime();
        int int53 = lista49.pos;
        lista49.primeiro = (byte) -1;
        java.lang.Object[] objArray56 = lista49.item;
        lista38.item = objArray56;
        lista33.item = objArray56;
        lista33.pos = 37;
        lista33.pos = (byte) 0;
        lista0.insere((java.lang.Object) lista33);
        lista33.pos = 35;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
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
        int int41 = lista39.ultimo;
        lista39.ultimo = 10;
        lista39.pos = (byte) 10;
        boolean boolean46 = lista39.vazia();
        lista0.insere((java.lang.Object) lista39);
        int int48 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista3.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        lista9.item = objArray16;
        lista3.item = objArray16;
        lista0.item = objArray16;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        lista20.ultimo = '#';
        lista20.pos = (short) 10;
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        java.lang.Object[] objArray28 = lista26.item;
        lista20.insere((java.lang.Object) lista26);
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        lista30.ultimo = '#';
        lista26.insere((java.lang.Object) lista30);
        lista26.pos = 'a';
        lista26.primeiro = (byte) 0;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.ultimo;
        java.lang.Object[] objArray41 = lista39.item;
        lista39.primeiro = (byte) 1;
        lista26.insere((java.lang.Object) (byte) 1);
        lista26.primeiro = (byte) 100;
        lista0.insere((java.lang.Object) lista26);
        lista26.primeiro = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
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
        int int18 = lista6.primeiro;
        boolean boolean19 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        lista0.pos = (byte) 10;
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = 36;
        boolean boolean6 = lista0.vazia();
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
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
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = (short) 1;
        java.lang.Object[] objArray47 = lista42.item;
        lista0.item = objArray47;
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = '4';
        lista0.pos = ' ';
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
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
        lista0.imprime();
        int int20 = lista0.primeiro;
        int int21 = lista0.ultimo;
        int int22 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        lista0.pos = 0;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
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
        lista0.pos = (byte) -1;
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
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        lista0.ultimo = ' ';
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        boolean boolean14 = lista12.vazia();
        lista12.pos = 0;
        boolean boolean17 = lista12.vazia();
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
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
        lista0.primeiro = 1;
        lista0.insere((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
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
        int int20 = lista6.ultimo;
        lista6.primeiro = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
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
        java.lang.Class<?> wildcardClass30 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.imprime();
        int int10 = lista0.pos;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        java.lang.Object[] objArray9 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista0.primeiro = (byte) 1;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        int int6 = lista0.ultimo;
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = 1;
        int int7 = lista0.primeiro;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        lista7.ultimo = 100;
        int int12 = lista7.primeiro;
        int int13 = lista7.pos;
        int int14 = lista7.primeiro;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        lista15.ultimo = 0;
        lista15.ultimo = (short) 10;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        int int25 = lista23.ultimo;
        lista23.pos = 10;
        lista23.primeiro = 0;
        int int30 = lista23.ultimo;
        java.lang.Object[] objArray31 = lista23.item;
        lista15.item = objArray31;
        lista7.item = objArray31;
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        boolean boolean36 = lista34.vazia();
        lista34.pos = 0;
        boolean boolean39 = lista34.vazia();
        java.lang.Object[] objArray40 = lista34.item;
        lista7.item = objArray40;
        lista0.insere((java.lang.Object) objArray40);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = '#';
        java.lang.Object obj11 = null;
        lista7.insere(obj11);
        int int13 = lista7.primeiro;
        java.lang.Object[] objArray14 = lista7.item;
        lista0.item = objArray14;
        int int16 = lista0.primeiro;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
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
        lista19.imprime();
        lista19.ultimo = 36;
        lista19.pos = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        int int7 = lista0.pos;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
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
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
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
        int int19 = lista0.pos;
        int int20 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
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
        lista0.primeiro = ' ';
        int int16 = lista0.pos;
        boolean boolean17 = lista0.vazia();
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
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
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.pos = (byte) 10;
        lista0.primeiro = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
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
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
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
        boolean boolean25 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        int int8 = lista0.primeiro;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.imprime();
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
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
        lista6.imprime();
        java.lang.Class<?> wildcardClass23 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        int int6 = lista0.ultimo;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.ultimo;
        java.lang.Object[] objArray11 = lista9.item;
        lista9.primeiro = (byte) 1;
        lista0.insere((java.lang.Object) lista9);
        lista9.ultimo = 36;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        lista7.imprime();
        int int11 = lista7.pos;
        lista7.primeiro = (byte) -1;
        java.lang.Object[] objArray14 = lista7.item;
        lista7.pos = (short) 10;
        java.lang.Object[] objArray17 = lista7.item;
        int int18 = lista7.pos;
        java.lang.Class<?> wildcardClass19 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
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
        lista0.pos = 36;
        int int13 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
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
        boolean boolean14 = lista8.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        int int10 = lista0.ultimo;
        lista0.primeiro = '4';
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
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
        lista0.primeiro = 98;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        lista18.ultimo = '#';
        int int22 = lista18.pos;
        java.lang.Object[] objArray23 = lista18.item;
        lista0.item = objArray23;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
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
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        java.lang.Object[] objArray5 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test802");
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
        boolean boolean19 = lista6.vazia();
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        lista20.ultimo = '#';
        lista20.pos = (short) 10;
        int int26 = lista20.pos;
        lista20.primeiro = 0;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.ultimo;
        java.lang.Object[] objArray31 = lista29.item;
        java.lang.Object[] objArray32 = lista29.item;
        lista20.item = objArray32;
        int int34 = lista20.primeiro;
        int int35 = lista20.primeiro;
        lista6.insere((java.lang.Object) lista20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test803");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        int int10 = lista0.ultimo;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test804");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test805");
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
        lista0.primeiro = 52;
        int int19 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test806");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        int int8 = lista0.pos;
        lista0.ultimo = 2;
        lista0.primeiro = 97;
        lista0.ultimo = (byte) 100;
        lista0.pos = (short) 10;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test807");
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
        int int21 = lista0.pos;
        lista0.ultimo = 98;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test808");
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
        int int25 = lista0.primeiro;
        int int26 = lista0.pos;
        java.lang.Object[] objArray27 = lista0.item;
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test809");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        int int10 = lista0.ultimo;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test810");
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
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test811");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista6.pos;
        int int11 = lista6.primeiro;
        lista6.primeiro = (byte) 0;
        lista6.pos = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test812");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        lista0.pos = (short) 100;
        lista0.pos = 100;
        int int14 = lista0.pos;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test813");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        lista0.ultimo = 97;
        lista0.primeiro = 1;
        lista0.primeiro = (byte) -1;
        lista0.ultimo = '#';
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
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test814");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test815");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.ultimo = (short) -1;
        int int10 = lista0.primeiro;
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test816");
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
        boolean boolean11 = lista0.vazia();
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test817");
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
        int int21 = lista0.ultimo;
        int int22 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test818");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10, 1]");
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test819");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.ultimo = 35;
        lista0.pos = 0;
        lista0.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test820");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = ' ';
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test821");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.ultimo;
        lista0.insere((java.lang.Object) int8);
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.primeiro = (short) 100;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test822");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.pos;
        java.lang.Object[] objArray9 = lista6.item;
        lista0.item = objArray9;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test823");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int5 = lista0.ultimo;
        lista0.pos = '#';
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = '#';
        lista9.pos = (short) 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray17 = lista15.item;
        lista9.insere((java.lang.Object) lista15);
        int int19 = lista9.primeiro;
        boolean boolean20 = lista9.vazia();
        int int21 = lista9.ultimo;
        lista0.insere((java.lang.Object) int21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test824");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.ultimo = 35;
        int int10 = lista0.pos;
        int int11 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test825");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        int int5 = lista0.pos;
        lista0.ultimo = (byte) -1;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test826");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test827");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = 'a';
        lista0.pos = 97;
        int int15 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test828");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test829");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = null;
        lista0.item = objArray2;
        lista0.ultimo = 'a';
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        lista6.imprime();
        int int10 = lista6.pos;
        lista6.primeiro = (byte) -1;
        java.lang.Object[] objArray13 = lista6.item;
        lista6.pos = (short) 10;
        java.lang.Object[] objArray16 = lista6.item;
        lista6.pos = 'a';
        lista6.pos = 97;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.ultimo;
        java.lang.Object[] objArray23 = lista21.item;
        lista21.primeiro = (byte) 1;
        java.lang.Object[] objArray26 = lista21.item;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.ultimo;
        java.lang.Object[] objArray32 = lista30.item;
        lista27.item = objArray32;
        lista21.item = objArray32;
        lista6.item = objArray32;
        lista0.item = objArray32;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test830");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = 1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        java.lang.Object obj12 = null;
        lista8.insere(obj12);
        int int14 = lista8.primeiro;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        lista16.ultimo = '#';
        lista16.pos = (short) 10;
        lista8.insere((java.lang.Object) (short) 10);
        lista8.primeiro = 1;
        lista0.insere((java.lang.Object) lista8);
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.primeiro;
        java.lang.Object obj29 = null;
        lista26.insere(obj29);
        java.lang.Object[] objArray31 = lista26.item;
        lista26.primeiro = (short) 10;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.ultimo;
        java.lang.Object[] objArray36 = lista34.item;
        lista26.item = objArray36;
        boolean boolean38 = lista26.vazia();
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.ultimo;
        java.lang.Object[] objArray41 = lista39.item;
        lista39.primeiro = (byte) 1;
        int int44 = lista39.primeiro;
        java.lang.Object[] objArray45 = lista39.item;
        lista26.item = objArray45;
        lista0.insere((java.lang.Object) lista26);
        int int48 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test831");
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
        int int36 = lista10.pos;
        int int37 = lista10.pos;
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test832");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.pos = (short) 10;
        lista0.insere((java.lang.Object) (short) 10);
        lista0.ultimo = 0;
        lista0.ultimo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test833");
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
        lista6.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test834");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = '#';
        java.lang.Object obj11 = null;
        lista7.insere(obj11);
        int int13 = lista7.primeiro;
        java.lang.Object[] objArray14 = lista7.item;
        lista0.item = objArray14;
        int int16 = lista0.primeiro;
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test835");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        lista0.primeiro = (byte) 100;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test836");
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
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test837");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = (-1);
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test838");
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
        lista0.imprime();
        int int20 = lista0.primeiro;
        int int21 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test839");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.pos;
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test840");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        lista0.primeiro = 2;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test841");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = 1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        java.lang.Object obj12 = null;
        lista8.insere(obj12);
        int int14 = lista8.primeiro;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        lista16.ultimo = '#';
        lista16.pos = (short) 10;
        lista8.insere((java.lang.Object) (short) 10);
        lista8.primeiro = 1;
        lista0.insere((java.lang.Object) lista8);
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        int int28 = lista26.primeiro;
        lista26.primeiro = 10;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        boolean boolean33 = lista31.vazia();
        lista31.pos = 0;
        boolean boolean36 = lista31.vazia();
        java.lang.Object[] objArray37 = lista31.item;
        lista26.item = objArray37;
        lista0.insere((java.lang.Object) objArray37);
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test842");
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
        int int25 = lista0.primeiro;
        int int26 = lista0.pos;
        int int27 = lista0.pos;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.ultimo;
        java.lang.Object[] objArray30 = lista28.item;
        lista28.primeiro = (byte) 1;
        int int33 = lista28.primeiro;
        lista0.insere((java.lang.Object) int33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test843");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test844");
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
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.pos = 10;
        lista24.primeiro = 0;
        lista24.ultimo = 'a';
        lista24.pos = (short) 1;
        int int35 = lista24.primeiro;
        lista0.insere((java.lang.Object) lista24);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test845");
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
        lista19.imprime();
        lista19.ultimo = 36;
        int int27 = lista19.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test846");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.pos = (short) 10;
        lista0.insere((java.lang.Object) (short) 10);
        lista0.primeiro = 1;
        lista0.ultimo = 52;
        int int19 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test847");
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
        int int15 = lista0.pos;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test848");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.primeiro = (byte) 0;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.pos = 37;
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        lista12.pos = (short) 10;
        int int18 = lista12.pos;
        lista12.primeiro = (short) 0;
        lista12.pos = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista12.insere((java.lang.Object) objArray24);
        lista0.item = objArray24;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test849");
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
        lista6.ultimo = 0;
        boolean boolean27 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test850");
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
        int int11 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test851");
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
        int int21 = lista0.ultimo;
        lista0.pos = 36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test852");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        lista0.ultimo = (short) -1;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test853");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = '#';
        lista9.pos = (short) 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray17 = lista15.item;
        lista9.insere((java.lang.Object) lista15);
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        lista19.ultimo = '#';
        lista15.insere((java.lang.Object) lista19);
        lista15.pos = 'a';
        lista15.primeiro = (byte) 0;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.ultimo;
        java.lang.Object[] objArray30 = lista28.item;
        lista28.primeiro = (byte) 1;
        lista15.insere((java.lang.Object) (byte) 1);
        lista15.primeiro = (byte) 100;
        lista15.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test854");
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
        int int28 = lista0.primeiro;
        boolean boolean29 = lista0.vazia();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test855");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista5.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        lista12.ultimo = 0;
        lista12.ultimo = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.pos = 10;
        lista20.primeiro = 0;
        int int27 = lista20.ultimo;
        java.lang.Object[] objArray28 = lista20.item;
        lista12.item = objArray28;
        java.lang.Object[] objArray30 = lista12.item;
        lista0.insere((java.lang.Object) lista12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test856");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        lista0.primeiro = (byte) 1;
        lista0.ultimo = 0;
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test857");
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
        int int19 = lista0.pos;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test858");
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
        int int12 = lista0.ultimo;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test859");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        lista0.pos = 0;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test860");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        lista0.ultimo = (short) 0;
        lista0.pos = 2;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        int int14 = lista11.primeiro;
        lista11.pos = (-1);
        java.lang.Object[] objArray17 = lista11.item;
        lista0.item = objArray17;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.ultimo;
        java.lang.Object[] objArray24 = lista22.item;
        lista19.item = objArray24;
        lista0.insere((java.lang.Object) lista19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test861");
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
        boolean boolean21 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test862");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        int int6 = lista0.pos;
        lista0.primeiro = 36;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test863");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 98;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        int int7 = lista5.primeiro;
        lista5.ultimo = 100;
        int int10 = lista5.primeiro;
        int int11 = lista5.pos;
        int int12 = lista5.primeiro;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        lista13.ultimo = '#';
        lista13.ultimo = 0;
        lista13.ultimo = (short) 10;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.pos = 10;
        lista21.primeiro = 0;
        int int28 = lista21.ultimo;
        java.lang.Object[] objArray29 = lista21.item;
        lista13.item = objArray29;
        lista5.item = objArray29;
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        boolean boolean34 = lista32.vazia();
        lista32.pos = 0;
        boolean boolean37 = lista32.vazia();
        java.lang.Object[] objArray38 = lista32.item;
        lista5.item = objArray38;
        int int40 = lista5.primeiro;
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        int int43 = lista41.primeiro;
        java.lang.Object[] objArray44 = lista41.item;
        lista41.ultimo = 1;
        ds.Lista lista47 = new ds.Lista();
        lista41.insere((java.lang.Object) lista47);
        java.lang.Object[] objArray49 = lista41.item;
        int int50 = lista41.primeiro;
        int int51 = lista41.pos;
        ds.Lista lista52 = new ds.Lista();
        lista52.imprime();
        int int54 = lista52.primeiro;
        lista52.imprime();
        int int56 = lista52.pos;
        lista52.primeiro = (byte) -1;
        java.lang.Object[] objArray59 = lista52.item;
        lista41.item = objArray59;
        ds.Lista lista61 = new ds.Lista();
        lista61.imprime();
        boolean boolean63 = lista61.vazia();
        int int64 = lista61.primeiro;
        lista41.insere((java.lang.Object) lista61);
        java.lang.Object[] objArray66 = lista61.item;
        lista5.item = objArray66;
        lista0.item = objArray66;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test864");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.pos = 36;
        int int6 = lista0.pos;
        lista0.pos = 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test865");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista6.item = objArray13;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.imprime();
        int int19 = lista15.pos;
        lista15.primeiro = (byte) -1;
        java.lang.Object[] objArray22 = lista15.item;
        lista6.item = objArray22;
        lista0.insere((java.lang.Object) lista6);
        lista6.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test866");
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
        lista0.pos = 32;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test867");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.pos = '#';
        lista0.primeiro = (short) 10;
        lista0.imprime();
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test868");
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
        lista0.pos = '#';
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
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test869");
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
        java.lang.Object[] objArray16 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test870");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = '#';
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = (-1);
        int int12 = lista9.primeiro;
        int int13 = lista9.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        int int17 = lista14.ultimo;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = (short) 1;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        java.lang.Object[] objArray25 = lista23.item;
        lista18.item = objArray25;
        lista14.item = objArray25;
        lista9.item = objArray25;
        java.lang.Class<?> wildcardClass29 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test871");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        lista0.ultimo = (short) 0;
        lista0.pos = 2;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        int int14 = lista11.primeiro;
        lista11.pos = (-1);
        java.lang.Object[] objArray17 = lista11.item;
        lista0.item = objArray17;
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test872");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        int int6 = lista0.primeiro;
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
        int int23 = lista7.primeiro;
        int int24 = lista7.ultimo;
        lista7.pos = 36;
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        lista28.ultimo = '#';
        lista28.pos = (short) 10;
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        java.lang.Object[] objArray36 = lista34.item;
        lista28.insere((java.lang.Object) lista34);
        lista28.primeiro = (short) -1;
        lista28.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test873");
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
        lista0.ultimo = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test874");
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
        int int20 = lista0.primeiro;
        int int21 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test875");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.imprime();
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test876");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = 52;
        lista0.primeiro = (byte) 1;
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test877");
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
        lista0.ultimo = 0;
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test878");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.pos;
        int int5 = lista3.ultimo;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.ultimo;
        java.lang.Object[] objArray8 = lista6.item;
        lista3.item = objArray8;
        lista0.item = objArray8;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test879");
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
        int int26 = lista0.pos;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = (short) 1;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        lista32.ultimo = (byte) 1;
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        int int38 = lista36.primeiro;
        java.lang.Object[] objArray39 = lista36.item;
        lista32.item = objArray39;
        lista27.item = objArray39;
        lista27.pos = (short) -1;
        lista27.imprime();
        lista27.ultimo = 0;
        ds.Lista lista47 = new ds.Lista();
        int int48 = lista47.pos;
        int int49 = lista47.primeiro;
        java.lang.Object obj50 = null;
        lista47.insere(obj50);
        java.lang.Object[] objArray52 = lista47.item;
        lista27.item = objArray52;
        ds.Lista lista54 = new ds.Lista();
        int int55 = lista54.pos;
        int int56 = lista54.primeiro;
        java.lang.Object obj57 = null;
        lista54.insere(obj57);
        ds.Lista lista59 = new ds.Lista();
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray64 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista60.item = objArray64;
        lista59.item = objArray64;
        lista59.pos = (-1);
        java.lang.Object[] objArray69 = lista59.item;
        lista54.item = objArray69;
        lista27.item = objArray69;
        lista0.item = objArray69;
        int int73 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 32 + "'", int73 == 32);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test880");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = 1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        java.lang.Object obj12 = null;
        lista8.insere(obj12);
        int int14 = lista8.primeiro;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        lista16.ultimo = '#';
        lista16.pos = (short) 10;
        lista8.insere((java.lang.Object) (short) 10);
        lista8.primeiro = 1;
        lista0.insere((java.lang.Object) lista8);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test881");
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
        lista0.pos = 52;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        int int22 = lista20.primeiro;
        int int23 = lista20.primeiro;
        lista20.pos = (-1);
        java.lang.Object[] objArray26 = lista20.item;
        lista0.item = objArray26;
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test882");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.ultimo;
        lista0.insere((java.lang.Object) int8);
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        java.lang.Object[] objArray14 = lista12.item;
        lista12.imprime();
        boolean boolean16 = lista12.vazia();
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray18 = lista12.item;
        lista0.insere((java.lang.Object) lista12);
        int int20 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test883");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 0;
        boolean boolean6 = lista0.vazia();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test884");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test885");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        int int7 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test886");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        boolean boolean9 = lista7.vazia();
        int int10 = lista7.primeiro;
        lista7.pos = 36;
        lista0.insere((java.lang.Object) lista7);
        boolean boolean14 = lista0.vazia();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.insere((java.lang.Object) (-1.0f));
        lista15.pos = (-1);
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = (short) 1;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        lista27.ultimo = (byte) 1;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        int int33 = lista31.primeiro;
        java.lang.Object[] objArray34 = lista31.item;
        lista27.item = objArray34;
        lista22.item = objArray34;
        int int37 = lista22.ultimo;
        int int38 = lista22.pos;
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        java.lang.Object[] objArray41 = lista39.item;
        int int42 = lista39.primeiro;
        int int43 = lista39.primeiro;
        lista39.pos = 1;
        int int46 = lista39.primeiro;
        ds.Lista lista47 = new ds.Lista();
        int int48 = lista47.pos;
        lista47.ultimo = '#';
        java.lang.Object obj51 = null;
        lista47.insere(obj51);
        int int53 = lista47.primeiro;
        boolean boolean54 = lista47.vazia();
        ds.Lista lista55 = new ds.Lista();
        int int56 = lista55.pos;
        lista55.ultimo = '#';
        lista55.pos = (short) 10;
        lista47.insere((java.lang.Object) (short) 10);
        lista47.primeiro = 1;
        lista39.insere((java.lang.Object) lista47);
        java.lang.Object[] objArray65 = lista47.item;
        lista22.item = objArray65;
        lista15.item = objArray65;
        lista0.item = objArray65;
        int int69 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 37 + "'", int69 == 37);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test887");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        int int7 = lista0.pos;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test888");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.ultimo;
        java.lang.Object[] objArray9 = lista7.item;
        lista7.primeiro = (byte) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = (short) 1;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        lista17.ultimo = (byte) 1;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        int int23 = lista21.primeiro;
        java.lang.Object[] objArray24 = lista21.item;
        lista17.item = objArray24;
        lista12.item = objArray24;
        lista12.pos = (short) -1;
        lista12.imprime();
        lista12.ultimo = 0;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.primeiro;
        java.lang.Object obj35 = null;
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        lista12.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        int int41 = lista39.primeiro;
        lista39.imprime();
        int int43 = lista39.pos;
        lista39.primeiro = (byte) -1;
        int int46 = lista39.ultimo;
        java.lang.Object[] objArray47 = lista39.item;
        lista12.insere((java.lang.Object) objArray47);
        lista7.item = objArray47;
        lista0.item = objArray47;
        java.lang.Object[] objArray51 = lista0.item;
        int int52 = lista0.ultimo;
        int int53 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 36 + "'", int52 == 36);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test889");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.imprime();
        int int8 = lista4.ultimo;
        int int9 = lista4.ultimo;
        int int10 = lista4.ultimo;
        java.lang.Object[] objArray11 = lista4.item;
        lista0.insere((java.lang.Object) objArray11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test890");
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
        lista0.pos = 10;
        int int18 = lista0.primeiro;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista19.item = objArray23;
        lista0.item = objArray23;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1, 10, 1]");
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test891");
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
        int int24 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test892");
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
        int int28 = lista0.primeiro;
        java.lang.Object[] objArray29 = lista0.item;
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test893");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.imprime();
        int int5 = lista0.primeiro;
        lista0.ultimo = (short) -1;
        int int8 = lista0.ultimo;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test894");
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
        int int15 = lista0.pos;
        boolean boolean16 = lista0.vazia();
        java.lang.Object[] objArray17 = lista0.item;
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test895");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        lista0.ultimo = 1;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = (-1);
        int int15 = lista12.primeiro;
        int int16 = lista12.ultimo;
        lista12.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        int int20 = lista18.primeiro;
        java.lang.Object[] objArray21 = lista18.item;
        lista12.insere((java.lang.Object) lista18);
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        int int25 = lista23.primeiro;
        java.lang.Object[] objArray26 = lista23.item;
        lista23.ultimo = 1;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        java.lang.Object[] objArray31 = lista23.item;
        int int32 = lista23.primeiro;
        int int33 = lista23.pos;
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        int int36 = lista34.primeiro;
        lista34.imprime();
        int int38 = lista34.pos;
        lista34.primeiro = (byte) -1;
        java.lang.Object[] objArray41 = lista34.item;
        lista23.item = objArray41;
        java.lang.Object[] objArray43 = lista23.item;
        lista18.item = objArray43;
        lista0.item = objArray43;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test896");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = 10;
        int int14 = lista10.pos;
        java.lang.Object[] objArray15 = lista10.item;
        lista0.item = objArray15;
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test897");
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
        java.lang.Object[] objArray40 = lista15.item;
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
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test898");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 100;
        lista0.ultimo = 97;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test899");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.primeiro = 35;
        int int9 = lista0.ultimo;
        int int10 = lista0.primeiro;
        int int11 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test900");
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
        int int18 = lista11.ultimo;
        lista11.pos = '4';
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test901");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test902");
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
        lista27.imprime();
        int int29 = lista27.primeiro;
        lista27.imprime();
        int int31 = lista27.pos;
        lista27.primeiro = (byte) -1;
        int int34 = lista27.ultimo;
        java.lang.Object[] objArray35 = lista27.item;
        lista0.insere((java.lang.Object) objArray35);
        lista0.pos = 'a';
        java.lang.Class<?> wildcardClass39 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test903");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        lista0.ultimo = (short) 0;
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = 52;
        int int12 = lista0.primeiro;
        lista0.pos = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test904");
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
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        int int23 = lista21.primeiro;
        lista21.imprime();
        int int25 = lista21.pos;
        lista21.primeiro = (byte) -1;
        java.lang.Object[] objArray28 = lista21.item;
        lista21.pos = (short) 10;
        java.lang.Object[] objArray31 = lista21.item;
        java.lang.Class<?> wildcardClass32 = objArray31.getClass();
        lista0.insere((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test905");
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
        lista10.pos = 35;
        int int26 = lista10.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test906");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.ultimo = 10;
        lista7.pos = (byte) 10;
        int int14 = lista7.ultimo;
        java.lang.Object[] objArray15 = lista7.item;
        lista0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test907");
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
        lista6.ultimo = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test908");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = 1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        java.lang.Object obj12 = null;
        lista8.insere(obj12);
        int int14 = lista8.primeiro;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        lista16.ultimo = '#';
        lista16.pos = (short) 10;
        lista8.insere((java.lang.Object) (short) 10);
        lista8.primeiro = 1;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object obj26 = null;
        lista8.insere(obj26);
        lista8.ultimo = 101;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test909");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (byte) 0;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test910");
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
        lista9.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test911");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = 35;
        boolean boolean8 = lista0.vazia();
        lista0.primeiro = 98;
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test912");
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
        int int12 = lista0.primeiro;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray15 = lista13.item;
        lista13.imprime();
        boolean boolean17 = lista13.vazia();
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        lista0.ultimo = 52;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = (short) 1;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista27.item = objArray31;
        lista22.item = objArray31;
        lista0.insere((java.lang.Object) lista22);
        int int35 = lista22.ultimo;
        int int36 = lista22.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test913");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        java.lang.Object obj8 = null;
        lista0.insere(obj8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test914");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = null;
        lista0.item = objArray2;
        lista0.ultimo = 'a';
        lista0.ultimo = 101;
        lista0.pos = 0;
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test915");
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
        lista6.imprime();
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
    }
}

