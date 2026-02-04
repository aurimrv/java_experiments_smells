package ds.seed6733;

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
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.imprime();
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        java.lang.Class<?> wildcardClass21 = objArray16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        java.lang.Object[] objArray17 = lista0.item;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        lista0.ultimo = 'a';
        java.lang.Class<?> wildcardClass62 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 100;
        int int15 = lista0.ultimo;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        int int16 = lista7.pos;
        int int17 = lista7.pos;
        java.lang.Class<?> wildcardClass18 = lista7.getClass();
        lista0.insere((java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = objArray15.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        boolean boolean3 = lista0.vazia();
        lista0.ultimo = ' ';
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        boolean boolean26 = lista0.vazia();
        lista0.pos = (byte) 0;
        java.lang.Class<?> wildcardClass29 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        int int14 = lista12.pos;
        lista12.insere((java.lang.Object) 0.0d);
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        lista18.item = objArray28;
        lista12.item = objArray28;
        lista0.item = objArray28;
        java.lang.Class<?> wildcardClass34 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        java.lang.Object[] objArray17 = lista0.item;
        java.lang.Class<?> wildcardClass18 = objArray17.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        boolean boolean31 = lista0.vazia();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        lista32.primeiro = 0;
        lista0.insere((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        lista0.pos = (byte) 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        lista15.item = objArray24;
        lista0.item = objArray24;
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        lista44.primeiro = (byte) 100;
        java.lang.Class<?> wildcardClass51 = lista44.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 'a', objArray13, 100.0d, (-1), 0.0d };
        lista10.item = objArray17;
        lista8.item = objArray17;
        java.lang.Object[] objArray20 = lista8.item;
        lista8.pos = (byte) 0;
        int int23 = lista8.pos;
        lista0.insere((java.lang.Object) int23);
        int int25 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = null;
        lista0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.pos = 'a';
        lista0.ultimo = '#';
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.pos = (byte) 10;
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        lista0.pos = '#';
        lista0.ultimo = (byte) -1;
        int int15 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        lista0.pos = (-1);
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        lista5.item = objArray14;
        lista5.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray19 = lista5.item;
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', objArray23, 100.0d, (-1), 0.0d };
        lista20.item = objArray27;
        int int29 = lista20.pos;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 'a', objArray35, 100.0d, (-1), 0.0d };
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista30.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray44 = lista30.item;
        lista20.item = objArray44;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        java.lang.Object[] objArray55 = new java.lang.Object[] { 'a', objArray51, 100.0d, (-1), 0.0d };
        lista48.item = objArray55;
        lista46.item = objArray55;
        lista46.insere((java.lang.Object) (byte) -1);
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        lista46.item = objArray61;
        lista20.item = objArray61;
        lista5.insere((java.lang.Object) lista20);
        ds.Lista lista65 = new ds.Lista();
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        ds.Lista lista68 = new ds.Lista();
        ds.Lista lista70 = new ds.Lista();
        java.lang.Object[] objArray71 = lista70.item;
        java.lang.Object[] objArray75 = new java.lang.Object[] { 'a', objArray71, 100.0d, (-1), 0.0d };
        lista68.item = objArray75;
        lista66.item = objArray75;
        lista65.item = objArray75;
        int int79 = lista65.ultimo;
        lista65.ultimo = 0;
        ds.Lista lista82 = new ds.Lista();
        java.lang.Object[] objArray83 = lista82.item;
        int int84 = lista82.pos;
        java.lang.Object[] objArray85 = lista82.item;
        lista65.insere((java.lang.Object) objArray85);
        lista20.insere((java.lang.Object) objArray85);
        lista0.insere((java.lang.Object) objArray85);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 100;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        lista14.insere((java.lang.Object) 0.0d);
        int int19 = lista14.ultimo;
        lista14.imprime();
        java.lang.Object[] objArray21 = lista14.item;
        lista0.item = objArray21;
        java.lang.Class<?> wildcardClass23 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.pos = 0;
        boolean boolean8 = lista5.vazia();
        lista0.insere((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass31 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.ultimo;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        int int27 = lista25.pos;
        lista25.insere((java.lang.Object) 0.0d);
        int int30 = lista25.ultimo;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        lista31.item = objArray41;
        lista25.item = objArray41;
        lista15.item = objArray41;
        java.lang.Object[] objArray47 = lista15.item;
        lista0.item = objArray47;
        java.lang.Class<?> wildcardClass49 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        int int17 = lista15.pos;
        lista15.insere((java.lang.Object) 0.0d);
        int int20 = lista15.ultimo;
        lista15.imprime();
        java.lang.Object[] objArray22 = lista15.item;
        lista0.item = objArray22;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.primeiro = 100;
        lista0.primeiro = (short) 10;
        int int18 = lista0.primeiro;
        lista0.pos = (short) 10;
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        java.lang.Class<?> wildcardClass32 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        int int19 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        java.lang.Object[] objArray32 = lista0.item;
        java.lang.Object[] objArray33 = lista0.item;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', objArray39, 100.0d, (-1), 0.0d };
        lista36.item = objArray43;
        lista34.item = objArray43;
        lista34.insere((java.lang.Object) (byte) -1);
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista34.item = objArray49;
        java.lang.Object[] objArray51 = lista34.item;
        lista0.item = objArray51;
        lista0.pos = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        lista0.primeiro = (byte) 100;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.primeiro;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        java.lang.Object[] objArray21 = lista0.item;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.primeiro = 0;
        lista0.insere((java.lang.Object) lista10);
        boolean boolean25 = lista10.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 'a', objArray35, 100.0d, (-1), 0.0d };
        lista32.item = objArray39;
        int int41 = lista32.pos;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        ds.Lista lista44 = new ds.Lista();
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        java.lang.Object[] objArray51 = new java.lang.Object[] { 'a', objArray47, 100.0d, (-1), 0.0d };
        lista44.item = objArray51;
        lista42.item = objArray51;
        lista42.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray56 = lista42.item;
        lista32.item = objArray56;
        java.lang.Object[] objArray58 = lista32.item;
        lista16.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray60 = lista32.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.primeiro = '4';
        int int39 = lista16.pos;
        lista16.primeiro = 0;
        java.lang.Class<?> wildcardClass42 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.insere((java.lang.Object) objArray18);
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.pos = '4';
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        int int50 = lista44.primeiro;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        java.lang.Object[] objArray60 = new java.lang.Object[] { 'a', objArray56, 100.0d, (-1), 0.0d };
        lista53.item = objArray60;
        lista51.item = objArray60;
        java.lang.Object[] objArray63 = lista51.item;
        lista51.pos = (byte) 0;
        int int66 = lista51.ultimo;
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray68 = lista67.item;
        ds.Lista lista69 = new ds.Lista();
        ds.Lista lista71 = new ds.Lista();
        java.lang.Object[] objArray72 = lista71.item;
        java.lang.Object[] objArray76 = new java.lang.Object[] { 'a', objArray72, 100.0d, (-1), 0.0d };
        lista69.item = objArray76;
        lista67.item = objArray76;
        lista67.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray81 = lista67.item;
        lista51.item = objArray81;
        java.lang.Object[] objArray83 = lista51.item;
        lista44.item = objArray83;
        ds.Lista lista85 = new ds.Lista();
        java.lang.Object[] objArray86 = lista85.item;
        int int87 = lista85.pos;
        lista85.insere((java.lang.Object) 0.0d);
        int int90 = lista85.ultimo;
        lista85.imprime();
        int int92 = lista85.pos;
        int int93 = lista85.primeiro;
        int int94 = lista85.ultimo;
        java.lang.Object[] objArray95 = lista85.item;
        lista44.insere((java.lang.Object) lista85);
        lista44.ultimo = (byte) 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(objArray95);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        int int17 = lista0.primeiro;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        lista18.insere((java.lang.Object) 0.0d);
        lista18.insere((java.lang.Object) 0);
        lista18.pos = ' ';
        java.lang.Object[] objArray27 = lista18.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 'a', objArray33, 100.0d, (-1), 0.0d };
        lista30.item = objArray37;
        lista28.item = objArray37;
        lista28.primeiro = 0;
        lista18.insere((java.lang.Object) lista28);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        boolean boolean31 = lista0.vazia();
        java.lang.Object[] objArray32 = lista0.item;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        java.lang.Object[] objArray32 = lista0.item;
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        int int31 = lista22.pos;
        int int32 = lista22.ultimo;
        lista0.insere((java.lang.Object) lista22);
        lista22.primeiro = (short) 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.primeiro = 100;
        lista0.primeiro = (short) 10;
        int int18 = lista0.primeiro;
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.insere((java.lang.Object) objArray18);
        lista0.pos = 97;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.primeiro = '4';
        lista16.pos = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        lista0.pos = (short) 0;
        int int28 = lista0.ultimo;
        lista0.primeiro = 10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        lista0.pos = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = null;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista17.insere((java.lang.Object) (byte) -1);
        int int31 = lista17.primeiro;
        java.lang.Object[] objArray32 = lista17.item;
        lista0.item = objArray32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.pos;
        lista0.pos = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        lista0.primeiro = '#';
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 0;
        boolean boolean10 = lista7.vazia();
        lista7.ultimo = ' ';
        lista7.pos = (byte) -1;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        lista15.item = objArray24;
        int int27 = lista15.primeiro;
        lista15.imprime();
        java.lang.Object[] objArray29 = lista15.item;
        lista7.insere((java.lang.Object) objArray29);
        lista0.item = objArray29;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        int int15 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        int int16 = lista7.pos;
        int int17 = lista7.pos;
        java.lang.Class<?> wildcardClass18 = lista7.getClass();
        lista0.insere((java.lang.Object) wildcardClass18);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        lista20.item = objArray29;
        java.lang.Object[] objArray32 = lista20.item;
        lista20.pos = (byte) 0;
        int int35 = lista20.pos;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 'a', objArray42, 100.0d, (-1), 0.0d };
        lista39.item = objArray46;
        lista37.item = objArray46;
        lista36.item = objArray46;
        lista20.insere((java.lang.Object) lista36);
        lista36.imprime();
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 'a', objArray57, 100.0d, (-1), 0.0d };
        lista54.item = objArray61;
        lista52.item = objArray61;
        int int64 = lista52.primeiro;
        lista52.imprime();
        java.lang.Object[] objArray66 = lista52.item;
        lista36.insere((java.lang.Object) objArray66);
        lista0.item = objArray66;
        lista0.primeiro = (short) 0;
        java.lang.Class<?> wildcardClass71 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.ultimo;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        int int35 = lista16.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.ultimo;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        int int27 = lista25.pos;
        lista25.insere((java.lang.Object) 0.0d);
        int int30 = lista25.ultimo;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        lista31.item = objArray41;
        lista25.item = objArray41;
        lista15.item = objArray41;
        java.lang.Object[] objArray47 = lista15.item;
        lista0.item = objArray47;
        int int49 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.primeiro;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        boolean boolean3 = lista0.vazia();
        lista0.ultimo = ' ';
        lista0.pos = (byte) -1;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray14 = lista0.item;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.ultimo = (short) 100;
        ds.Lista lista11 = new ds.Lista();
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 'a', objArray14, 100.0d, (-1), 0.0d };
        lista11.item = objArray18;
        lista11.primeiro = ' ';
        java.lang.Object[] objArray22 = lista11.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        boolean boolean17 = lista0.vazia();
        int int18 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.primeiro = '4';
        int int39 = lista16.primeiro;
        java.lang.Object[] objArray40 = lista16.item;
        java.lang.Class<?> wildcardClass41 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = 100;
        lista0.primeiro = '4';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray19 = lista0.item;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 100;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista14 = new ds.Lista();
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', objArray17, 100.0d, (-1), 0.0d };
        lista14.item = objArray21;
        int int23 = lista14.pos;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', objArray29, 100.0d, (-1), 0.0d };
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista24.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray38 = lista24.item;
        lista14.item = objArray38;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        ds.Lista lista42 = new ds.Lista();
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        java.lang.Object[] objArray49 = new java.lang.Object[] { 'a', objArray45, 100.0d, (-1), 0.0d };
        lista42.item = objArray49;
        lista40.item = objArray49;
        lista40.insere((java.lang.Object) (byte) -1);
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        lista40.item = objArray55;
        lista14.item = objArray55;
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        int int60 = lista58.pos;
        java.lang.Object[] objArray61 = lista58.item;
        lista14.insere((java.lang.Object) lista58);
        int int63 = lista58.ultimo;
        int int64 = lista58.primeiro;
        ds.Lista lista65 = new ds.Lista();
        java.lang.Object[] objArray66 = lista65.item;
        ds.Lista lista67 = new ds.Lista();
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        java.lang.Object[] objArray74 = new java.lang.Object[] { 'a', objArray70, 100.0d, (-1), 0.0d };
        lista67.item = objArray74;
        lista65.item = objArray74;
        java.lang.Object[] objArray77 = lista65.item;
        lista65.pos = (byte) 0;
        int int80 = lista65.ultimo;
        ds.Lista lista81 = new ds.Lista();
        java.lang.Object[] objArray82 = lista81.item;
        ds.Lista lista83 = new ds.Lista();
        ds.Lista lista85 = new ds.Lista();
        java.lang.Object[] objArray86 = lista85.item;
        java.lang.Object[] objArray90 = new java.lang.Object[] { 'a', objArray86, 100.0d, (-1), 0.0d };
        lista83.item = objArray90;
        lista81.item = objArray90;
        lista81.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray95 = lista81.item;
        lista65.item = objArray95;
        java.lang.Object[] objArray97 = lista65.item;
        lista58.item = objArray97;
        lista0.item = objArray97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertNotNull(objArray97);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        int int21 = lista19.pos;
        lista19.insere((java.lang.Object) 0.0d);
        int int24 = lista19.ultimo;
        lista19.imprime();
        int int26 = lista19.pos;
        lista0.insere((java.lang.Object) lista19);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 'a', objArray33, 100.0d, (-1), 0.0d };
        lista30.item = objArray37;
        lista28.item = objArray37;
        lista28.primeiro = 0;
        lista28.pos = (byte) 1;
        java.lang.Object[] objArray44 = lista28.item;
        lista19.item = objArray44;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.insere((java.lang.Object) objArray6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 'a', objArray13, 100.0d, (-1), 0.0d };
        lista10.item = objArray17;
        lista8.item = objArray17;
        lista8.insere((java.lang.Object) (byte) -1);
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista8.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista8.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 'a', objArray34, 100.0d, (-1), 0.0d };
        lista31.item = objArray38;
        lista29.item = objArray38;
        java.lang.Object[] objArray41 = lista29.item;
        lista29.pos = (byte) 0;
        int int44 = lista29.ultimo;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        java.lang.Object[] objArray54 = new java.lang.Object[] { 'a', objArray50, 100.0d, (-1), 0.0d };
        lista47.item = objArray54;
        lista45.item = objArray54;
        lista45.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray59 = lista45.item;
        lista29.item = objArray59;
        lista0.insere((java.lang.Object) lista29);
        lista0.primeiro = (short) -1;
        lista0.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        lista0.ultimo = 10;
        lista0.primeiro = ' ';
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 'a', objArray35, 100.0d, (-1), 0.0d };
        lista32.item = objArray39;
        int int41 = lista32.pos;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        ds.Lista lista44 = new ds.Lista();
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        java.lang.Object[] objArray51 = new java.lang.Object[] { 'a', objArray47, 100.0d, (-1), 0.0d };
        lista44.item = objArray51;
        lista42.item = objArray51;
        lista42.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray56 = lista42.item;
        lista32.item = objArray56;
        java.lang.Object[] objArray58 = lista32.item;
        lista16.insere((java.lang.Object) lista32);
        lista16.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        lista0.pos = (short) 0;
        lista0.imprime();
        int int29 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.primeiro = 1;
        int int24 = lista0.primeiro;
        int int25 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = 0;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        java.lang.Object[] objArray17 = lista0.item;
        lista0.imprime();
        int int19 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        int int32 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray35 = null;
        lista0.item = objArray35;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        int int35 = lista16.primeiro;
        lista16.imprime();
        lista16.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        int int14 = lista0.primeiro;
        lista0.imprime();
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        java.lang.Object[] objArray32 = lista0.item;
        java.lang.Object[] objArray33 = lista0.item;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', objArray39, 100.0d, (-1), 0.0d };
        lista36.item = objArray43;
        lista34.item = objArray43;
        lista34.insere((java.lang.Object) (byte) -1);
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista34.item = objArray49;
        java.lang.Object[] objArray51 = lista34.item;
        lista0.item = objArray51;
        lista0.pos = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Object[] objArray13 = lista0.item;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        lista0.ultimo = (short) 1;
        java.lang.Object obj11 = null;
        lista0.insere(obj11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        lista0.primeiro = (byte) 100;
        java.lang.Object[] objArray16 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        int int32 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = '#';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        int int50 = lista44.primeiro;
        ds.Lista lista51 = new ds.Lista();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 'a', objArray54, 100.0d, (-1), 0.0d };
        lista51.item = objArray58;
        int int60 = lista51.ultimo;
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        int int63 = lista61.pos;
        lista61.insere((java.lang.Object) 0.0d);
        int int66 = lista61.ultimo;
        ds.Lista lista67 = new ds.Lista();
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray69 = lista68.item;
        ds.Lista lista70 = new ds.Lista();
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        java.lang.Object[] objArray77 = new java.lang.Object[] { 'a', objArray73, 100.0d, (-1), 0.0d };
        lista70.item = objArray77;
        lista68.item = objArray77;
        lista67.item = objArray77;
        lista61.item = objArray77;
        lista51.item = objArray77;
        int int83 = lista51.primeiro;
        lista51.imprime();
        lista51.imprime();
        lista44.insere((java.lang.Object) lista51);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        lista15.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        int int30 = lista28.pos;
        lista28.insere((java.lang.Object) 0.0d);
        int int33 = lista28.ultimo;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 'a', objArray40, 100.0d, (-1), 0.0d };
        lista37.item = objArray44;
        lista35.item = objArray44;
        lista34.item = objArray44;
        lista28.item = objArray44;
        lista0.item = objArray44;
        lista0.pos = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = 0;
        int int12 = lista0.ultimo;
        boolean boolean13 = lista0.vazia();
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        lista0.primeiro = '#';
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        int int16 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        lista0.primeiro = '#';
        lista0.pos = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        java.lang.Object[] objArray32 = lista0.item;
        java.lang.Object[] objArray33 = lista0.item;
        int int34 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.ultimo;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        int int27 = lista25.pos;
        lista25.insere((java.lang.Object) 0.0d);
        int int30 = lista25.ultimo;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        lista31.item = objArray41;
        lista25.item = objArray41;
        lista15.item = objArray41;
        java.lang.Object[] objArray47 = lista15.item;
        lista0.item = objArray47;
        lista0.imprime();
        int int50 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        java.lang.Object[] objArray21 = lista0.item;
        boolean boolean22 = lista0.vazia();
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        int int21 = lista19.pos;
        lista19.insere((java.lang.Object) 0.0d);
        lista19.insere((java.lang.Object) 0);
        lista19.pos = ' ';
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 'a', objArray33, 100.0d, (-1), 0.0d };
        lista30.item = objArray37;
        lista28.item = objArray37;
        lista28.insere((java.lang.Object) (byte) -1);
        int int42 = lista28.primeiro;
        java.lang.Object[] objArray43 = lista28.item;
        lista19.insere((java.lang.Object) objArray43);
        lista0.item = objArray43;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        int int16 = lista7.pos;
        int int17 = lista7.pos;
        java.lang.Class<?> wildcardClass18 = lista7.getClass();
        lista0.insere((java.lang.Object) wildcardClass18);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        lista20.item = objArray29;
        java.lang.Object[] objArray32 = lista20.item;
        lista20.pos = (byte) 0;
        int int35 = lista20.pos;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 'a', objArray42, 100.0d, (-1), 0.0d };
        lista39.item = objArray46;
        lista37.item = objArray46;
        lista36.item = objArray46;
        lista20.insere((java.lang.Object) lista36);
        lista36.imprime();
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 'a', objArray57, 100.0d, (-1), 0.0d };
        lista54.item = objArray61;
        lista52.item = objArray61;
        int int64 = lista52.primeiro;
        lista52.imprime();
        java.lang.Object[] objArray66 = lista52.item;
        lista36.insere((java.lang.Object) objArray66);
        lista0.item = objArray66;
        lista0.primeiro = (short) 0;
        boolean boolean71 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        int int14 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.primeiro;
        lista0.pos = (byte) 0;
        lista0.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        lista0.pos = (-1);
        ds.Lista lista5 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', objArray11, 100.0d, (-1), 0.0d };
        lista8.item = objArray15;
        lista6.item = objArray15;
        lista5.item = objArray15;
        int int19 = lista5.ultimo;
        lista5.ultimo = 0;
        int int22 = lista5.primeiro;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 'a', objArray28, 100.0d, (-1), 0.0d };
        lista25.item = objArray32;
        lista23.item = objArray32;
        int int35 = lista23.ultimo;
        lista23.ultimo = 'a';
        lista23.primeiro = 97;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista23.item = objArray41;
        lista5.item = objArray41;
        lista0.item = objArray41;
        int int45 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray19 = lista0.item;
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        int int16 = lista0.pos;
        lista0.pos = (short) -1;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        java.lang.Object[] objArray32 = lista0.item;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray14 = lista0.item;
        lista0.ultimo = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.insere((java.lang.Object) 0L);
        java.lang.Object[] objArray19 = null;
        lista0.item = objArray19;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.insere((java.lang.Object) objArray18);
        lista0.pos = 3;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 'a', objArray28, 100.0d, (-1), 0.0d };
        lista25.item = objArray32;
        lista23.item = objArray32;
        lista22.item = objArray32;
        int int36 = lista22.ultimo;
        lista22.ultimo = 10;
        lista22.pos = 1;
        lista0.insere((java.lang.Object) lista22);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        java.lang.Object[] objArray32 = lista0.item;
        lista0.pos = (byte) 10;
        lista0.ultimo = (short) 0;
        java.lang.Object[] objArray37 = lista0.item;
        java.lang.Object[] objArray38 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.primeiro = 10;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = 2;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        int int18 = lista9.pos;
        lista9.ultimo = 0;
        int int21 = lista9.pos;
        int int22 = lista9.pos;
        lista9.insere((java.lang.Object) 0);
        java.lang.Object[] objArray25 = lista9.item;
        lista0.item = objArray25;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 100;
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        int int26 = lista17.pos;
        lista17.ultimo = 0;
        int int29 = lista17.pos;
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        lista17.ultimo = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        boolean boolean60 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.insere((java.lang.Object) objArray6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 'a', objArray13, 100.0d, (-1), 0.0d };
        lista10.item = objArray17;
        lista8.item = objArray17;
        lista8.insere((java.lang.Object) (byte) -1);
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista8.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista8.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 'a', objArray34, 100.0d, (-1), 0.0d };
        lista31.item = objArray38;
        lista29.item = objArray38;
        java.lang.Object[] objArray41 = lista29.item;
        lista29.pos = (byte) 0;
        int int44 = lista29.ultimo;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        java.lang.Object[] objArray54 = new java.lang.Object[] { 'a', objArray50, 100.0d, (-1), 0.0d };
        lista47.item = objArray54;
        lista45.item = objArray54;
        lista45.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray59 = lista45.item;
        lista29.item = objArray59;
        lista0.insere((java.lang.Object) lista29);
        java.lang.Class<?> wildcardClass62 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.primeiro = 0;
        lista0.insere((java.lang.Object) lista10);
        int int25 = lista10.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.imprime();
        int int14 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.pos;
        lista0.ultimo = 97;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        java.lang.Object[] objArray26 = lista14.item;
        lista14.pos = (byte) 0;
        int int29 = lista14.pos;
        ds.Lista lista30 = new ds.Lista();
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 'a', objArray36, 100.0d, (-1), 0.0d };
        lista33.item = objArray40;
        lista31.item = objArray40;
        lista30.item = objArray40;
        lista14.insere((java.lang.Object) lista30);
        lista30.pos = (byte) 1;
        lista30.pos = (short) 10;
        lista30.primeiro = 97;
        ds.Lista lista51 = new ds.Lista();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 'a', objArray54, 100.0d, (-1), 0.0d };
        lista51.item = objArray58;
        int int60 = lista51.pos;
        lista51.ultimo = 0;
        int int63 = lista51.pos;
        int int64 = lista51.pos;
        lista51.insere((java.lang.Object) 0);
        java.lang.Object[] objArray67 = lista51.item;
        lista30.item = objArray67;
        lista0.item = objArray67;
        java.lang.Object[] objArray70 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 100;
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        int int26 = lista17.pos;
        lista17.ultimo = 0;
        int int29 = lista17.pos;
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        lista17.insere((java.lang.Object) "");
        int int34 = lista17.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        java.lang.Object[] objArray19 = lista0.item;
        int int20 = lista0.primeiro;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 0;
        java.lang.Object[] objArray24 = lista21.item;
        ds.Lista lista25 = new ds.Lista();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 'a', objArray28, 100.0d, (-1), 0.0d };
        lista25.item = objArray32;
        int int34 = lista25.pos;
        lista25.ultimo = 0;
        java.lang.Object[] objArray37 = lista25.item;
        lista25.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { objArray24, lista25 };
        lista0.item = objArray24;
        lista0.insere((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.primeiro = 'a';
        java.lang.Object[] objArray37 = lista16.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 100;
        lista0.imprime();
        int int16 = lista0.pos;
        int int17 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista60 = new ds.Lista();
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        ds.Lista lista63 = new ds.Lista();
        ds.Lista lista65 = new ds.Lista();
        java.lang.Object[] objArray66 = lista65.item;
        java.lang.Object[] objArray70 = new java.lang.Object[] { 'a', objArray66, 100.0d, (-1), 0.0d };
        lista63.item = objArray70;
        lista61.item = objArray70;
        lista60.item = objArray70;
        int int74 = lista60.ultimo;
        lista60.ultimo = 0;
        ds.Lista lista77 = new ds.Lista();
        java.lang.Object[] objArray78 = lista77.item;
        int int79 = lista77.pos;
        java.lang.Object[] objArray80 = lista77.item;
        lista60.insere((java.lang.Object) objArray80);
        lista15.insere((java.lang.Object) objArray80);
        java.lang.Class<?> wildcardClass83 = objArray80.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 100;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        int int18 = lista0.ultimo;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        lista44.pos = (byte) 1;
        java.lang.Class<?> wildcardClass52 = lista44.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = 100;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista15.item = objArray25;
        int int29 = lista15.ultimo;
        lista15.ultimo = 0;
        lista15.primeiro = '4';
        lista15.imprime();
        lista15.primeiro = (byte) 100;
        lista15.pos = 52;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        lista0.item = objArray41;
        java.lang.Class<?> wildcardClass45 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        boolean boolean22 = lista0.vazia();
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 'a', objArray36, 100.0d, (-1), 0.0d };
        lista33.item = objArray40;
        lista31.item = objArray40;
        int int43 = lista31.primeiro;
        lista31.insere((java.lang.Object) (-1L));
        lista31.primeiro = (byte) 10;
        lista31.primeiro = 'a';
        java.lang.Object[] objArray50 = lista31.item;
        lista0.item = objArray50;
        java.lang.Class<?> wildcardClass52 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        int int16 = lista0.pos;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        int int50 = lista44.primeiro;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        java.lang.Object[] objArray60 = new java.lang.Object[] { 'a', objArray56, 100.0d, (-1), 0.0d };
        lista53.item = objArray60;
        lista51.item = objArray60;
        java.lang.Object[] objArray63 = lista51.item;
        lista51.pos = (byte) 0;
        int int66 = lista51.ultimo;
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray68 = lista67.item;
        ds.Lista lista69 = new ds.Lista();
        ds.Lista lista71 = new ds.Lista();
        java.lang.Object[] objArray72 = lista71.item;
        java.lang.Object[] objArray76 = new java.lang.Object[] { 'a', objArray72, 100.0d, (-1), 0.0d };
        lista69.item = objArray76;
        lista67.item = objArray76;
        lista67.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray81 = lista67.item;
        lista51.item = objArray81;
        java.lang.Object[] objArray83 = lista51.item;
        lista44.item = objArray83;
        ds.Lista lista85 = new ds.Lista();
        lista85.ultimo = (byte) 1;
        lista85.pos = (short) 1;
        lista44.insere((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.pos;
        lista0.primeiro = (short) 10;
        java.lang.Object obj15 = null;
        lista0.insere(obj15);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        int int14 = lista0.primeiro;
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        java.lang.Object[] objArray26 = lista0.item;
        boolean boolean27 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        lista0.primeiro = '#';
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        int int44 = lista32.primeiro;
        lista32.imprime();
        java.lang.Object[] objArray46 = lista32.item;
        lista16.insere((java.lang.Object) objArray46);
        int int48 = lista16.ultimo;
        lista16.ultimo = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        int int44 = lista32.primeiro;
        lista32.imprime();
        java.lang.Object[] objArray46 = lista32.item;
        lista16.insere((java.lang.Object) objArray46);
        int int48 = lista16.ultimo;
        lista16.ultimo = (-1);
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        java.lang.Object[] objArray60 = new java.lang.Object[] { 'a', objArray56, 100.0d, (-1), 0.0d };
        lista53.item = objArray60;
        lista51.item = objArray60;
        int int63 = lista51.primeiro;
        lista51.insere((java.lang.Object) (-1L));
        lista51.primeiro = (byte) 10;
        lista51.primeiro = 'a';
        java.lang.Object[] objArray70 = lista51.item;
        lista16.item = objArray70;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        int int17 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        lista0.primeiro = '4';
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        lista0.primeiro = '4';
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        int int28 = lista19.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        int int31 = lista29.pos;
        lista29.insere((java.lang.Object) 0.0d);
        int int34 = lista29.ultimo;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        lista36.item = objArray45;
        lista35.item = objArray45;
        lista29.item = objArray45;
        lista19.item = objArray45;
        java.lang.Object[] objArray51 = lista19.item;
        lista19.pos = (byte) 10;
        lista19.ultimo = (short) 0;
        lista19.primeiro = (byte) 1;
        java.lang.Object[] objArray58 = lista19.item;
        lista0.item = objArray58;
        int int60 = lista0.pos;
        ds.Lista lista61 = new ds.Lista();
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        ds.Lista lista64 = new ds.Lista();
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { 'a', objArray67, 100.0d, (-1), 0.0d };
        lista64.item = objArray71;
        lista62.item = objArray71;
        lista61.item = objArray71;
        java.lang.Object[] objArray75 = lista61.item;
        lista0.item = objArray75;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        int int2 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        java.lang.Object[] objArray22 = lista0.item;
        lista0.pos = 'a';
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.pos = (-1);
        int int7 = lista0.primeiro;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        lista0.primeiro = (byte) 100;
        boolean boolean16 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        lista0.pos = (short) 1;
        java.lang.Class<?> wildcardClass34 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.item = objArray18;
        lista0.pos = (byte) 0;
        lista0.ultimo = 3;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        lista0.insere((java.lang.Object) lista24);
        lista24.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        java.lang.Object[] objArray32 = lista0.item;
        boolean boolean33 = lista0.vazia();
        int int34 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.primeiro = '4';
        java.lang.Class<?> wildcardClass39 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        int int21 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        lista0.ultimo = 'a';
        int int62 = lista0.ultimo;
        java.lang.Class<?> wildcardClass63 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 'a', objArray42, 100.0d, (-1), 0.0d };
        lista39.item = objArray46;
        lista37.item = objArray46;
        java.lang.Object[] objArray49 = lista37.item;
        lista37.pos = (byte) 0;
        int int52 = lista37.pos;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        ds.Lista lista56 = new ds.Lista();
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        java.lang.Object[] objArray63 = new java.lang.Object[] { 'a', objArray59, 100.0d, (-1), 0.0d };
        lista56.item = objArray63;
        lista54.item = objArray63;
        lista53.item = objArray63;
        lista37.insere((java.lang.Object) lista53);
        lista53.pos = (byte) 1;
        lista53.pos = (short) 10;
        lista53.pos = 10;
        java.lang.Object[] objArray74 = lista53.item;
        lista16.item = objArray74;
        lista16.ultimo = 52;
        ds.Lista lista78 = new ds.Lista();
        ds.Lista lista80 = new ds.Lista();
        java.lang.Object[] objArray81 = lista80.item;
        java.lang.Object[] objArray85 = new java.lang.Object[] { 'a', objArray81, 100.0d, (-1), 0.0d };
        lista78.item = objArray85;
        int int87 = lista78.pos;
        lista78.ultimo = 0;
        int int90 = lista78.ultimo;
        java.lang.Class<?> wildcardClass91 = lista78.getClass();
        // The following exception was thrown during execution in test generation
        try {
            lista16.insere((java.lang.Object) lista78);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        int int22 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        lista0.pos = '#';
        lista0.ultimo = (byte) -1;
        lista0.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 100;
        lista0.ultimo = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        int int17 = lista0.primeiro;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', objArray23, 100.0d, (-1), 0.0d };
        lista20.item = objArray27;
        lista18.item = objArray27;
        int int30 = lista18.ultimo;
        lista18.ultimo = 'a';
        lista18.primeiro = 97;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista18.item = objArray36;
        lista0.item = objArray36;
        int int39 = lista0.pos;
        int int40 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 1;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.pos = (byte) 10;
        int int21 = lista0.pos;
        lista0.imprime();
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.primeiro = 0;
        lista0.insere((java.lang.Object) lista10);
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        int int14 = lista12.pos;
        lista12.insere((java.lang.Object) 0.0d);
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        lista18.item = objArray28;
        lista12.item = objArray28;
        lista0.item = objArray28;
        int int34 = lista0.ultimo;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        lista36.item = objArray45;
        lista35.item = objArray45;
        int int49 = lista35.ultimo;
        lista35.ultimo = 0;
        lista35.insere((java.lang.Object) 0L);
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        int int56 = lista54.pos;
        lista54.insere((java.lang.Object) 0.0d);
        int int59 = lista54.ultimo;
        lista54.imprime();
        int int61 = lista54.pos;
        int int62 = lista54.primeiro;
        int int63 = lista54.ultimo;
        java.lang.Object[] objArray64 = lista54.item;
        lista35.item = objArray64;
        lista0.item = objArray64;
        ds.Lista lista67 = new ds.Lista();
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray69 = lista68.item;
        ds.Lista lista70 = new ds.Lista();
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        java.lang.Object[] objArray77 = new java.lang.Object[] { 'a', objArray73, 100.0d, (-1), 0.0d };
        lista70.item = objArray77;
        lista68.item = objArray77;
        lista67.item = objArray77;
        lista67.primeiro = 100;
        lista67.primeiro = (short) 10;
        int int85 = lista67.primeiro;
        lista67.pos = (short) 10;
        ds.Lista lista88 = new ds.Lista();
        ds.Lista lista90 = new ds.Lista();
        java.lang.Object[] objArray91 = lista90.item;
        java.lang.Object[] objArray95 = new java.lang.Object[] { 'a', objArray91, 100.0d, (-1), 0.0d };
        lista88.item = objArray95;
        lista67.item = objArray95;
        lista0.insere((java.lang.Object) objArray95);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(objArray95);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        int int3 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = null;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        java.lang.Object[] objArray29 = lista17.item;
        lista17.pos = (byte) 0;
        int int32 = lista17.pos;
        ds.Lista lista33 = new ds.Lista();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', objArray39, 100.0d, (-1), 0.0d };
        lista36.item = objArray43;
        lista34.item = objArray43;
        lista33.item = objArray43;
        lista17.insere((java.lang.Object) lista33);
        lista33.pos = (byte) 1;
        lista33.pos = (short) 10;
        lista33.pos = 10;
        java.lang.Object[] objArray54 = lista33.item;
        ds.Lista lista55 = new ds.Lista();
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 'a', objArray58, 100.0d, (-1), 0.0d };
        lista55.item = objArray62;
        int int64 = lista55.ultimo;
        ds.Lista lista65 = new ds.Lista();
        java.lang.Object[] objArray66 = lista65.item;
        int int67 = lista65.pos;
        lista65.insere((java.lang.Object) 0.0d);
        int int70 = lista65.ultimo;
        ds.Lista lista71 = new ds.Lista();
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        ds.Lista lista74 = new ds.Lista();
        ds.Lista lista76 = new ds.Lista();
        java.lang.Object[] objArray77 = lista76.item;
        java.lang.Object[] objArray81 = new java.lang.Object[] { 'a', objArray77, 100.0d, (-1), 0.0d };
        lista74.item = objArray81;
        lista72.item = objArray81;
        lista71.item = objArray81;
        lista65.item = objArray81;
        lista55.item = objArray81;
        java.lang.Object[] objArray87 = lista55.item;
        lista55.pos = (byte) 10;
        lista55.ultimo = (short) 0;
        java.lang.Object[] objArray92 = lista55.item;
        lista33.item = objArray92;
        lista0.item = objArray92;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(objArray92);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        int int44 = lista32.primeiro;
        lista32.imprime();
        java.lang.Object[] objArray46 = lista32.item;
        lista16.insere((java.lang.Object) objArray46);
        java.lang.Object[] objArray48 = lista16.item;
        java.lang.Class<?> wildcardClass49 = objArray48.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.pos;
        lista0.ultimo = (byte) 100;
        int int15 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        int int16 = lista7.pos;
        int int17 = lista7.pos;
        java.lang.Class<?> wildcardClass18 = lista7.getClass();
        lista0.insere((java.lang.Object) wildcardClass18);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        lista20.item = objArray29;
        java.lang.Object[] objArray32 = lista20.item;
        lista20.pos = (byte) 0;
        int int35 = lista20.pos;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 'a', objArray42, 100.0d, (-1), 0.0d };
        lista39.item = objArray46;
        lista37.item = objArray46;
        lista36.item = objArray46;
        lista20.insere((java.lang.Object) lista36);
        lista36.imprime();
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 'a', objArray57, 100.0d, (-1), 0.0d };
        lista54.item = objArray61;
        lista52.item = objArray61;
        int int64 = lista52.primeiro;
        lista52.imprime();
        java.lang.Object[] objArray66 = lista52.item;
        lista36.insere((java.lang.Object) objArray66);
        lista0.item = objArray66;
        lista0.pos = (short) 10;
        int int71 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        int int7 = lista0.primeiro;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 'a', objArray42, 100.0d, (-1), 0.0d };
        lista39.item = objArray46;
        lista37.item = objArray46;
        java.lang.Object[] objArray49 = lista37.item;
        lista37.pos = (byte) 0;
        int int52 = lista37.pos;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        ds.Lista lista56 = new ds.Lista();
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        java.lang.Object[] objArray63 = new java.lang.Object[] { 'a', objArray59, 100.0d, (-1), 0.0d };
        lista56.item = objArray63;
        lista54.item = objArray63;
        lista53.item = objArray63;
        lista37.insere((java.lang.Object) lista53);
        lista53.pos = (byte) 1;
        lista53.pos = (short) 10;
        lista53.pos = 10;
        java.lang.Object[] objArray74 = lista53.item;
        lista16.item = objArray74;
        lista16.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.primeiro = 100;
        lista0.primeiro = (short) 10;
        int int18 = lista0.primeiro;
        lista0.pos = (short) 10;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista0.item = objArray28;
        java.lang.Class<?> wildcardClass31 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.item = objArray18;
        lista0.pos = (byte) 0;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 'a', objArray28, 100.0d, (-1), 0.0d };
        lista25.item = objArray32;
        lista23.item = objArray32;
        lista22.item = objArray32;
        int int36 = lista22.ultimo;
        lista22.ultimo = 10;
        lista22.pos = 1;
        int int41 = lista22.primeiro;
        java.lang.Object[] objArray42 = lista22.item;
        lista0.insere((java.lang.Object) lista22);
        int int44 = lista22.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 100;
        lista0.ultimo = (byte) 100;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.primeiro = '4';
        int int39 = lista16.ultimo;
        int int40 = lista16.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 100;
        lista0.ultimo = (byte) 100;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        java.lang.Object[] objArray28 = lista16.item;
        lista16.pos = (byte) 0;
        int int31 = lista16.pos;
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 'a', objArray38, 100.0d, (-1), 0.0d };
        lista35.item = objArray42;
        lista33.item = objArray42;
        lista32.item = objArray42;
        lista16.insere((java.lang.Object) lista32);
        lista32.pos = (byte) 1;
        lista32.pos = (short) 10;
        lista32.pos = 10;
        lista32.primeiro = '4';
        int int55 = lista32.pos;
        lista32.primeiro = 0;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 10;
        lista0.pos = 1;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        int int31 = lista19.primeiro;
        lista19.insere((java.lang.Object) (-1L));
        lista19.primeiro = (byte) 10;
        lista19.primeiro = 'a';
        java.lang.Object[] objArray38 = lista19.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista19);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        lista0.imprime();
        int int13 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        lista0.primeiro = '#';
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 0;
        boolean boolean10 = lista7.vazia();
        lista7.ultimo = ' ';
        lista7.pos = (byte) -1;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        lista15.item = objArray24;
        int int27 = lista15.primeiro;
        lista15.imprime();
        java.lang.Object[] objArray29 = lista15.item;
        lista7.insere((java.lang.Object) objArray29);
        lista0.item = objArray29;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 'a', objArray28, 100.0d, (-1), 0.0d };
        lista25.item = objArray32;
        lista25.primeiro = ' ';
        java.lang.Object[] objArray36 = lista25.item;
        lista16.insere((java.lang.Object) objArray36);
        lista16.pos = 'a';
        lista16.ultimo = '#';
        lista0.insere((java.lang.Object) '#');
        int int43 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, #, 100.0, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, #, 100.0, -1, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        int int7 = lista0.pos;
        lista0.primeiro = '4';
        lista0.pos = 97;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        boolean boolean26 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int29 = lista0.primeiro;
        lista0.pos = 'a';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        boolean boolean31 = lista0.vazia();
        java.lang.Object[] objArray32 = lista0.item;
        java.lang.Class<?> wildcardClass33 = objArray32.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray60 = lista0.item;
        lista0.ultimo = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.pos = (short) 1;
        boolean boolean39 = lista16.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        lista0.ultimo = 10;
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', objArray29, 100.0d, (-1), 0.0d };
        lista26.item = objArray33;
        lista26.primeiro = ' ';
        java.lang.Object[] objArray37 = lista26.item;
        lista17.insere((java.lang.Object) objArray37);
        lista0.item = objArray37;
        lista0.primeiro = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        java.lang.Object[] objArray32 = lista0.item;
        lista0.pos = (byte) 10;
        lista0.ultimo = (short) 0;
        java.lang.Object[] objArray37 = lista0.item;
        int int38 = lista0.primeiro;
        ds.Lista lista39 = new ds.Lista();
        lista39.pos = 0;
        java.lang.Object[] objArray42 = lista39.item;
        int int43 = lista39.pos;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista39.insere((java.lang.Object) objArray45);
        lista0.item = objArray45;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        int int11 = lista2.pos;
        lista2.ultimo = 0;
        int int14 = lista2.pos;
        int int15 = lista2.pos;
        lista2.insere((java.lang.Object) 0);
        java.lang.Object[] objArray18 = lista2.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        lista20.item = objArray29;
        lista20.insere((java.lang.Object) (byte) -1);
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista20.item = objArray35;
        java.lang.Object[] objArray37 = lista20.item;
        lista0.insere((java.lang.Object) objArray37);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        lista13.item = objArray22;
        java.lang.Object[] objArray25 = lista13.item;
        lista0.item = objArray25;
        int int27 = lista0.pos;
        boolean boolean28 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.pos;
        lista0.pos = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        boolean boolean22 = lista0.vazia();
        int int23 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Class<?> wildcardClass50 = lista44.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        lista0.pos = 52;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        boolean boolean19 = lista0.vazia();
        boolean boolean20 = lista0.vazia();
        int int21 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', objArray7, 100.0d, (-1), 0.0d };
        lista4.item = objArray11;
        int int13 = lista4.ultimo;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        lista14.insere((java.lang.Object) 0.0d);
        int int19 = lista14.ultimo;
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        ds.Lista lista23 = new ds.Lista();
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        java.lang.Object[] objArray30 = new java.lang.Object[] { 'a', objArray26, 100.0d, (-1), 0.0d };
        lista23.item = objArray30;
        lista21.item = objArray30;
        lista20.item = objArray30;
        lista14.item = objArray30;
        lista4.item = objArray30;
        java.lang.Object[] objArray36 = lista4.item;
        lista4.pos = (byte) 10;
        lista4.ultimo = (short) 0;
        java.lang.Object[] objArray41 = lista4.item;
        lista0.item = objArray41;
        java.lang.Class<?> wildcardClass43 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        int int31 = lista16.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', objArray11, 100.0d, (-1), 0.0d };
        lista8.item = objArray15;
        lista6.item = objArray15;
        java.lang.Object[] objArray18 = lista6.item;
        lista6.pos = (byte) 0;
        int int21 = lista6.pos;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 'a', objArray28, 100.0d, (-1), 0.0d };
        lista25.item = objArray32;
        lista23.item = objArray32;
        lista22.item = objArray32;
        lista6.insere((java.lang.Object) lista22);
        lista22.pos = (byte) 1;
        lista22.pos = (short) 10;
        int int41 = lista22.primeiro;
        java.lang.Object obj42 = null;
        lista22.insere(obj42);
        lista0.insere(obj42);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        java.lang.Object[] objArray38 = lista26.item;
        lista26.pos = (byte) 0;
        ds.Lista lista41 = new ds.Lista();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        java.lang.Object[] objArray48 = new java.lang.Object[] { 'a', objArray44, 100.0d, (-1), 0.0d };
        lista41.item = objArray48;
        int int50 = lista41.ultimo;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        int int53 = lista51.pos;
        lista51.insere((java.lang.Object) 0.0d);
        int int56 = lista51.ultimo;
        ds.Lista lista57 = new ds.Lista();
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        ds.Lista lista60 = new ds.Lista();
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        java.lang.Object[] objArray67 = new java.lang.Object[] { 'a', objArray63, 100.0d, (-1), 0.0d };
        lista60.item = objArray67;
        lista58.item = objArray67;
        lista57.item = objArray67;
        lista51.item = objArray67;
        lista41.item = objArray67;
        java.lang.Object[] objArray73 = lista41.item;
        lista26.item = objArray73;
        lista0.item = objArray73;
        int int76 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.item = objArray18;
        int int20 = lista0.pos;
        lista0.primeiro = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        boolean boolean32 = lista16.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        ds.Lista lista52 = new ds.Lista();
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        java.lang.Object[] objArray59 = new java.lang.Object[] { 'a', objArray55, 100.0d, (-1), 0.0d };
        lista52.item = objArray59;
        lista50.item = objArray59;
        lista50.insere((java.lang.Object) (byte) -1);
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        lista50.item = objArray65;
        lista44.item = objArray65;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        int int35 = lista16.primeiro;
        lista16.imprime();
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.pos;
        lista37.imprime();
        java.lang.Object[] objArray40 = lista37.item;
        lista16.item = objArray40;
        int int42 = lista16.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista60 = new ds.Lista();
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        ds.Lista lista63 = new ds.Lista();
        ds.Lista lista65 = new ds.Lista();
        java.lang.Object[] objArray66 = lista65.item;
        java.lang.Object[] objArray70 = new java.lang.Object[] { 'a', objArray66, 100.0d, (-1), 0.0d };
        lista63.item = objArray70;
        lista61.item = objArray70;
        lista60.item = objArray70;
        int int74 = lista60.ultimo;
        lista60.ultimo = 0;
        ds.Lista lista77 = new ds.Lista();
        java.lang.Object[] objArray78 = lista77.item;
        int int79 = lista77.pos;
        java.lang.Object[] objArray80 = lista77.item;
        lista60.insere((java.lang.Object) objArray80);
        lista15.insere((java.lang.Object) objArray80);
        int int83 = lista15.primeiro;
        lista15.ultimo = (short) 100;
        lista15.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        lista0.pos = (byte) 10;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        lista13.item = objArray22;
        java.lang.Object[] objArray25 = lista13.item;
        lista13.pos = (byte) 0;
        int int28 = lista13.pos;
        ds.Lista lista29 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 'a', objArray35, 100.0d, (-1), 0.0d };
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista29.item = objArray39;
        lista13.insere((java.lang.Object) lista29);
        lista29.pos = (byte) 1;
        lista29.pos = (short) 10;
        lista29.pos = 10;
        java.lang.Object[] objArray50 = lista29.item;
        lista0.item = objArray50;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        lista0.pos = (short) 0;
        lista0.imprime();
        int int29 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        int int22 = lista0.ultimo;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.insere((java.lang.Object) objArray6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 'a', objArray13, 100.0d, (-1), 0.0d };
        lista10.item = objArray17;
        lista8.item = objArray17;
        lista8.insere((java.lang.Object) (byte) -1);
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista8.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista8.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 'a', objArray34, 100.0d, (-1), 0.0d };
        lista31.item = objArray38;
        lista29.item = objArray38;
        java.lang.Object[] objArray41 = lista29.item;
        lista29.pos = (byte) 0;
        int int44 = lista29.ultimo;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        java.lang.Object[] objArray54 = new java.lang.Object[] { 'a', objArray50, 100.0d, (-1), 0.0d };
        lista47.item = objArray54;
        lista45.item = objArray54;
        lista45.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray59 = lista45.item;
        lista29.item = objArray59;
        lista0.insere((java.lang.Object) lista29);
        lista29.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        java.lang.Object[] objArray31 = lista16.item;
        lista16.primeiro = '#';
        int int34 = lista16.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = ' ';
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.ultimo;
        int int15 = lista0.pos;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.pos = 32;
        java.lang.Class<?> wildcardClass39 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.pos;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.primeiro = 100;
        lista0.primeiro = (short) 10;
        int int18 = lista0.primeiro;
        lista0.pos = (short) 10;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista0.item = objArray28;
        java.lang.Object[] objArray31 = lista0.item;
        java.lang.Object[] objArray32 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray16 = lista0.item;
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        lista0.pos = (byte) 10;
        lista0.imprime();
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.item = objArray18;
        lista0.pos = (byte) 0;
        lista0.ultimo = 3;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        lista0.insere((java.lang.Object) lista24);
        int int29 = lista24.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        java.lang.Object[] objArray21 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.primeiro = 0;
        lista0.insere((java.lang.Object) lista10);
        lista10.pos = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 10;
        lista0.pos = 1;
        int int19 = lista0.primeiro;
        int int20 = lista0.ultimo;
        lista0.pos = (short) 10;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        java.lang.Object[] objArray26 = lista14.item;
        lista14.pos = (byte) 0;
        int int29 = lista14.pos;
        ds.Lista lista30 = new ds.Lista();
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 'a', objArray36, 100.0d, (-1), 0.0d };
        lista33.item = objArray40;
        lista31.item = objArray40;
        lista30.item = objArray40;
        lista14.insere((java.lang.Object) lista30);
        lista30.pos = (byte) 1;
        lista30.pos = (short) 10;
        lista30.primeiro = 97;
        ds.Lista lista51 = new ds.Lista();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 'a', objArray54, 100.0d, (-1), 0.0d };
        lista51.item = objArray58;
        int int60 = lista51.pos;
        lista51.ultimo = 0;
        int int63 = lista51.pos;
        int int64 = lista51.pos;
        lista51.insere((java.lang.Object) 0);
        java.lang.Object[] objArray67 = lista51.item;
        lista30.item = objArray67;
        lista0.item = objArray67;
        lista0.pos = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        lista0.pos = (byte) 10;
        lista0.imprime();
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        java.lang.Object[] objArray21 = lista0.item;
        boolean boolean22 = lista0.vazia();
        lista0.ultimo = (byte) 0;
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        lista0.primeiro = '4';
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        int int28 = lista19.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        int int31 = lista29.pos;
        lista29.insere((java.lang.Object) 0.0d);
        int int34 = lista29.ultimo;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        lista36.item = objArray45;
        lista35.item = objArray45;
        lista29.item = objArray45;
        lista19.item = objArray45;
        java.lang.Object[] objArray51 = lista19.item;
        lista19.pos = (byte) 10;
        lista19.ultimo = (short) 0;
        lista19.primeiro = (byte) 1;
        java.lang.Object[] objArray58 = lista19.item;
        lista0.item = objArray58;
        int int60 = lista0.pos;
        lista0.pos = 100;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.ultimo;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista18.primeiro = ' ';
        int int29 = lista18.pos;
        lista0.insere((java.lang.Object) int29);
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        java.lang.Object[] objArray32 = lista0.item;
        java.lang.Object[] objArray33 = lista0.item;
        int int34 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        int int16 = lista7.pos;
        int int17 = lista7.pos;
        java.lang.Class<?> wildcardClass18 = lista7.getClass();
        lista0.insere((java.lang.Object) wildcardClass18);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        lista20.item = objArray29;
        java.lang.Object[] objArray32 = lista20.item;
        lista20.pos = (byte) 0;
        int int35 = lista20.pos;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 'a', objArray42, 100.0d, (-1), 0.0d };
        lista39.item = objArray46;
        lista37.item = objArray46;
        lista36.item = objArray46;
        lista20.insere((java.lang.Object) lista36);
        lista36.imprime();
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 'a', objArray57, 100.0d, (-1), 0.0d };
        lista54.item = objArray61;
        lista52.item = objArray61;
        int int64 = lista52.primeiro;
        lista52.imprime();
        java.lang.Object[] objArray66 = lista52.item;
        lista36.insere((java.lang.Object) objArray66);
        lista0.item = objArray66;
        int int69 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        int int14 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.pos = 0;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        lista0.pos = (short) 0;
        lista0.imprime();
        lista0.pos = (short) 10;
        lista0.pos = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        lista5.item = objArray14;
        lista4.item = objArray14;
        int int18 = lista4.ultimo;
        lista4.ultimo = 0;
        lista4.insere((java.lang.Object) 0L);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        lista23.insere((java.lang.Object) 0.0d);
        int int28 = lista23.ultimo;
        lista23.imprime();
        int int30 = lista23.pos;
        int int31 = lista23.primeiro;
        int int32 = lista23.ultimo;
        java.lang.Object[] objArray33 = lista23.item;
        lista4.item = objArray33;
        lista0.item = objArray33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        int int14 = lista12.pos;
        lista12.insere((java.lang.Object) 0.0d);
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        lista18.item = objArray28;
        lista12.item = objArray28;
        lista0.item = objArray28;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        lista0.primeiro = '4';
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        int int28 = lista19.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        int int31 = lista29.pos;
        lista29.insere((java.lang.Object) 0.0d);
        int int34 = lista29.ultimo;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        lista36.item = objArray45;
        lista35.item = objArray45;
        lista29.item = objArray45;
        lista19.item = objArray45;
        java.lang.Object[] objArray51 = lista19.item;
        lista19.pos = (byte) 10;
        lista19.ultimo = (short) 0;
        lista19.primeiro = (byte) 1;
        java.lang.Object[] objArray58 = lista19.item;
        lista0.item = objArray58;
        boolean boolean60 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        lista0.pos = 52;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 1;
        lista0.ultimo = 100;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        lista0.pos = (short) 0;
        int int28 = lista0.primeiro;
        int int29 = lista0.pos;
        lista0.pos = 32;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.primeiro;
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        java.lang.Object[] objArray28 = lista16.item;
        lista16.pos = (byte) 0;
        int int31 = lista16.pos;
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 'a', objArray38, 100.0d, (-1), 0.0d };
        lista35.item = objArray42;
        lista33.item = objArray42;
        lista32.item = objArray42;
        lista16.insere((java.lang.Object) lista32);
        lista32.pos = (byte) 1;
        lista32.pos = (short) 10;
        lista0.insere((java.lang.Object) lista32);
        int int52 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.primeiro = 100;
        lista0.primeiro = (short) 10;
        int int18 = lista0.primeiro;
        lista0.pos = (short) 10;
        lista0.ultimo = '#';
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        int int35 = lista16.primeiro;
        boolean boolean36 = lista16.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray19 = lista0.item;
        lista0.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = 0;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        java.lang.Object[] objArray19 = lista0.item;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.imprime();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        java.lang.Object[] objArray38 = lista26.item;
        lista26.pos = (byte) 0;
        ds.Lista lista41 = new ds.Lista();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        java.lang.Object[] objArray48 = new java.lang.Object[] { 'a', objArray44, 100.0d, (-1), 0.0d };
        lista41.item = objArray48;
        int int50 = lista41.ultimo;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        int int53 = lista51.pos;
        lista51.insere((java.lang.Object) 0.0d);
        int int56 = lista51.ultimo;
        ds.Lista lista57 = new ds.Lista();
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        ds.Lista lista60 = new ds.Lista();
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        java.lang.Object[] objArray67 = new java.lang.Object[] { 'a', objArray63, 100.0d, (-1), 0.0d };
        lista60.item = objArray67;
        lista58.item = objArray67;
        lista57.item = objArray67;
        lista51.item = objArray67;
        lista41.item = objArray67;
        java.lang.Object[] objArray73 = lista41.item;
        lista26.item = objArray73;
        lista0.item = objArray73;
        lista0.imprime();
        lista0.imprime();
        int int78 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        int int16 = lista0.pos;
        lista0.pos = (short) -1;
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.pos = 'a';
        lista0.ultimo = '#';
        lista0.ultimo = (byte) -1;
        lista0.primeiro = '4';
        java.lang.Class<?> wildcardClass30 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        int int11 = lista2.pos;
        lista2.ultimo = 0;
        int int14 = lista2.pos;
        int int15 = lista2.pos;
        lista2.insere((java.lang.Object) 0);
        java.lang.Object[] objArray18 = lista2.item;
        lista0.item = objArray18;
        lista0.ultimo = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 'a', objArray42, 100.0d, (-1), 0.0d };
        lista39.item = objArray46;
        lista37.item = objArray46;
        java.lang.Object[] objArray49 = lista37.item;
        lista37.pos = (byte) 0;
        int int52 = lista37.pos;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        ds.Lista lista56 = new ds.Lista();
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        java.lang.Object[] objArray63 = new java.lang.Object[] { 'a', objArray59, 100.0d, (-1), 0.0d };
        lista56.item = objArray63;
        lista54.item = objArray63;
        lista53.item = objArray63;
        lista37.insere((java.lang.Object) lista53);
        lista53.pos = (byte) 1;
        lista53.pos = (short) 10;
        lista53.pos = 10;
        java.lang.Object[] objArray74 = lista53.item;
        lista16.item = objArray74;
        java.lang.Object[] objArray76 = lista16.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.pos = 0;
        int int8 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        ds.Lista lista14 = new ds.Lista();
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', objArray17, 100.0d, (-1), 0.0d };
        lista14.item = objArray21;
        int int23 = lista14.pos;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', objArray29, 100.0d, (-1), 0.0d };
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista24.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray38 = lista24.item;
        lista14.item = objArray38;
        boolean boolean40 = lista14.vazia();
        lista0.insere((java.lang.Object) boolean40);
        ds.Lista lista42 = new ds.Lista();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 'a', objArray48, 100.0d, (-1), 0.0d };
        lista45.item = objArray52;
        lista43.item = objArray52;
        lista42.item = objArray52;
        int int56 = lista42.ultimo;
        lista42.ultimo = 0;
        int int59 = lista42.primeiro;
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        ds.Lista lista62 = new ds.Lista();
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        java.lang.Object[] objArray69 = new java.lang.Object[] { 'a', objArray65, 100.0d, (-1), 0.0d };
        lista62.item = objArray69;
        lista60.item = objArray69;
        int int72 = lista60.ultimo;
        lista60.ultimo = 'a';
        lista60.primeiro = 97;
        ds.Lista lista77 = new ds.Lista();
        java.lang.Object[] objArray78 = lista77.item;
        lista60.item = objArray78;
        lista42.item = objArray78;
        int int81 = lista42.pos;
        ds.Lista lista82 = new ds.Lista();
        java.lang.Object[] objArray83 = lista82.item;
        ds.Lista lista84 = new ds.Lista();
        ds.Lista lista86 = new ds.Lista();
        java.lang.Object[] objArray87 = lista86.item;
        java.lang.Object[] objArray91 = new java.lang.Object[] { 'a', objArray87, 100.0d, (-1), 0.0d };
        lista84.item = objArray91;
        lista82.item = objArray91;
        lista82.insere((java.lang.Object) (byte) -1);
        lista42.insere((java.lang.Object) lista82);
        lista42.imprime();
        lista0.insere((java.lang.Object) lista42);
        int int99 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', objArray7, 100.0d, (-1), 0.0d };
        lista4.item = objArray11;
        lista2.item = objArray11;
        java.lang.Object[] objArray14 = lista2.item;
        lista2.pos = (byte) 0;
        int int17 = lista2.pos;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        lista18.item = objArray28;
        lista2.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray33 = lista18.item;
        lista0.item = objArray33;
        int int35 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        lista0.ultimo = 10;
        java.lang.Object[] objArray46 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', objArray7, 100.0d, (-1), 0.0d };
        lista4.item = objArray11;
        lista2.item = objArray11;
        java.lang.Object[] objArray14 = lista2.item;
        lista2.pos = (byte) 0;
        int int17 = lista2.pos;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        lista18.item = objArray28;
        lista2.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray33 = lista18.item;
        lista0.item = objArray33;
        int int35 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.ultimo;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        int int27 = lista25.pos;
        lista25.insere((java.lang.Object) 0.0d);
        int int30 = lista25.ultimo;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        lista31.item = objArray41;
        lista25.item = objArray41;
        lista15.item = objArray41;
        java.lang.Object[] objArray47 = lista15.item;
        lista0.item = objArray47;
        lista0.primeiro = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        lista0.primeiro = '4';
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        int int28 = lista19.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        int int31 = lista29.pos;
        lista29.insere((java.lang.Object) 0.0d);
        int int34 = lista29.ultimo;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        lista36.item = objArray45;
        lista35.item = objArray45;
        lista29.item = objArray45;
        lista19.item = objArray45;
        java.lang.Object[] objArray51 = lista19.item;
        lista19.pos = (byte) 10;
        lista19.ultimo = (short) 0;
        lista19.primeiro = (byte) 1;
        java.lang.Object[] objArray58 = lista19.item;
        lista0.item = objArray58;
        int int60 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        java.lang.Object[] objArray31 = lista16.item;
        lista16.primeiro = '#';
        int int34 = lista16.pos;
        ds.Lista lista35 = new ds.Lista();
        int int36 = lista35.pos;
        int int37 = lista35.primeiro;
        lista35.pos = (-1);
        ds.Lista lista40 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista40.item = objArray50;
        int int54 = lista40.ultimo;
        lista40.ultimo = 0;
        int int57 = lista40.primeiro;
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        ds.Lista lista60 = new ds.Lista();
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        java.lang.Object[] objArray67 = new java.lang.Object[] { 'a', objArray63, 100.0d, (-1), 0.0d };
        lista60.item = objArray67;
        lista58.item = objArray67;
        int int70 = lista58.ultimo;
        lista58.ultimo = 'a';
        lista58.primeiro = 97;
        ds.Lista lista75 = new ds.Lista();
        java.lang.Object[] objArray76 = lista75.item;
        lista58.item = objArray76;
        lista40.item = objArray76;
        lista35.item = objArray76;
        lista16.item = objArray76;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 10;
        lista0.pos = 1;
        int int19 = lista0.primeiro;
        int int20 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        int int15 = lista0.pos;
        int int16 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        lista0.primeiro = '4';
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        int int28 = lista19.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        int int31 = lista29.pos;
        lista29.insere((java.lang.Object) 0.0d);
        int int34 = lista29.ultimo;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        lista36.item = objArray45;
        lista35.item = objArray45;
        lista29.item = objArray45;
        lista19.item = objArray45;
        java.lang.Object[] objArray51 = lista19.item;
        lista19.pos = (byte) 10;
        lista19.ultimo = (short) 0;
        lista19.primeiro = (byte) 1;
        java.lang.Object[] objArray58 = lista19.item;
        lista0.item = objArray58;
        int int60 = lista0.pos;
        lista0.primeiro = (short) 0;
        boolean boolean63 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        int int15 = lista0.pos;
        int int16 = lista0.ultimo;
        lista0.pos = 'a';
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        int int31 = lista22.pos;
        int int32 = lista22.ultimo;
        lista0.insere((java.lang.Object) lista22);
        boolean boolean34 = lista0.vazia();
        int int35 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 0;
        lista0.pos = 35;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        java.lang.Object[] objArray32 = lista0.item;
        lista0.pos = (byte) 10;
        lista0.ultimo = (short) 0;
        java.lang.Object[] objArray37 = lista0.item;
        int int38 = lista0.primeiro;
        int int39 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        java.lang.Object[] objArray32 = lista0.item;
        boolean boolean33 = lista0.vazia();
        java.lang.Class<?> wildcardClass34 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        lista0.primeiro = '#';
        lista0.pos = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 'a', objArray9, 100.0d, (-1), 0.0d };
        lista6.item = objArray13;
        lista4.item = objArray13;
        lista4.insere((java.lang.Object) (byte) -1);
        int int18 = lista4.primeiro;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        lista4.item = objArray28;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.primeiro = 1;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.ultimo;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista18.primeiro = ' ';
        int int29 = lista18.pos;
        lista0.insere((java.lang.Object) int29);
        int int31 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.primeiro = 97;
        ds.Lista lista37 = new ds.Lista();
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 'a', objArray40, 100.0d, (-1), 0.0d };
        lista37.item = objArray44;
        int int46 = lista37.pos;
        lista37.ultimo = 0;
        int int49 = lista37.pos;
        int int50 = lista37.pos;
        lista37.insere((java.lang.Object) 0);
        java.lang.Object[] objArray53 = lista37.item;
        lista16.item = objArray53;
        lista16.primeiro = ' ';
        lista16.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        int int60 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        int int14 = lista0.primeiro;
        lista0.primeiro = 'a';
        int int17 = lista0.pos;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 1;
        java.lang.Object[] objArray23 = lista0.item;
        int int24 = lista0.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        java.lang.Object[] objArray37 = lista25.item;
        lista25.primeiro = (short) 100;
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        lista0.primeiro = (byte) 100;
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        int int14 = lista0.primeiro;
        lista0.primeiro = 'a';
        int int17 = lista0.pos;
        int int18 = lista0.ultimo;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        int int31 = lista19.ultimo;
        lista19.ultimo = 'a';
        lista19.primeiro = 97;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista19.item = objArray37;
        lista19.pos = (byte) 0;
        ds.Lista lista41 = new ds.Lista();
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        ds.Lista lista44 = new ds.Lista();
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        java.lang.Object[] objArray51 = new java.lang.Object[] { 'a', objArray47, 100.0d, (-1), 0.0d };
        lista44.item = objArray51;
        lista42.item = objArray51;
        lista41.item = objArray51;
        int int55 = lista41.ultimo;
        lista41.ultimo = 10;
        lista41.pos = 1;
        int int60 = lista41.primeiro;
        java.lang.Object[] objArray61 = lista41.item;
        lista19.insere((java.lang.Object) lista41);
        ds.Lista lista63 = new ds.Lista();
        lista63.pos = 0;
        lista19.insere((java.lang.Object) 0);
        lista0.insere((java.lang.Object) lista19);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.primeiro = 1;
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        int int12 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.pos = (short) 0;
        int int19 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = (byte) 1;
        lista0.insere((java.lang.Object) lista22);
        lista22.pos = '4';
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        lista0.ultimo = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        lista5.item = objArray14;
        java.lang.Object[] objArray17 = lista5.item;
        lista5.pos = (byte) 0;
        int int20 = lista5.pos;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', objArray27, 100.0d, (-1), 0.0d };
        lista24.item = objArray31;
        lista22.item = objArray31;
        lista21.item = objArray31;
        lista5.insere((java.lang.Object) lista21);
        lista21.imprime();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 'a', objArray42, 100.0d, (-1), 0.0d };
        lista39.item = objArray46;
        lista37.item = objArray46;
        int int49 = lista37.primeiro;
        lista37.imprime();
        java.lang.Object[] objArray51 = lista37.item;
        lista21.insere((java.lang.Object) objArray51);
        int int53 = lista21.ultimo;
        lista21.ultimo = (-1);
        lista0.insere((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        java.lang.Object[] objArray26 = lista14.item;
        lista14.pos = (byte) 0;
        int int29 = lista14.pos;
        ds.Lista lista30 = new ds.Lista();
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 'a', objArray36, 100.0d, (-1), 0.0d };
        lista33.item = objArray40;
        lista31.item = objArray40;
        lista30.item = objArray40;
        lista14.insere((java.lang.Object) lista30);
        lista30.pos = (byte) 1;
        lista30.pos = (short) 10;
        lista30.primeiro = 97;
        ds.Lista lista51 = new ds.Lista();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 'a', objArray54, 100.0d, (-1), 0.0d };
        lista51.item = objArray58;
        int int60 = lista51.pos;
        lista51.ultimo = 0;
        int int63 = lista51.pos;
        int int64 = lista51.pos;
        lista51.insere((java.lang.Object) 0);
        java.lang.Object[] objArray67 = lista51.item;
        lista30.item = objArray67;
        lista0.item = objArray67;
        java.lang.Class<?> wildcardClass70 = objArray67.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        lista0.primeiro = (byte) 100;
        int int16 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        int int52 = lista50.pos;
        lista50.pos = (short) 1;
        lista50.primeiro = '#';
        ds.Lista lista57 = new ds.Lista();
        lista57.pos = 0;
        boolean boolean60 = lista57.vazia();
        lista57.ultimo = ' ';
        lista57.pos = (byte) -1;
        ds.Lista lista65 = new ds.Lista();
        java.lang.Object[] objArray66 = lista65.item;
        ds.Lista lista67 = new ds.Lista();
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        java.lang.Object[] objArray74 = new java.lang.Object[] { 'a', objArray70, 100.0d, (-1), 0.0d };
        lista67.item = objArray74;
        lista65.item = objArray74;
        int int77 = lista65.primeiro;
        lista65.imprime();
        java.lang.Object[] objArray79 = lista65.item;
        lista57.insere((java.lang.Object) objArray79);
        lista50.item = objArray79;
        lista44.item = objArray79;
        boolean boolean83 = lista44.vazia();
        boolean boolean84 = lista44.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        java.lang.Object[] objArray31 = lista16.item;
        lista16.primeiro = '#';
        java.lang.Class<?> wildcardClass34 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 1;
        boolean boolean23 = lista0.vazia();
        java.lang.Object[] objArray24 = lista0.item;
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.imprime();
        boolean boolean18 = lista0.vazia();
        lista0.pos = 3;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 0;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.pos;
        lista0.pos = 10;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 1;
        boolean boolean23 = lista0.vazia();
        ds.Lista lista24 = new ds.Lista();
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', objArray27, 100.0d, (-1), 0.0d };
        lista24.item = objArray31;
        int int33 = lista24.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', objArray39, 100.0d, (-1), 0.0d };
        lista36.item = objArray43;
        lista34.item = objArray43;
        lista34.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray48 = lista34.item;
        lista24.item = objArray48;
        java.lang.Object[] objArray50 = lista24.item;
        lista0.insere((java.lang.Object) lista24);
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = (byte) 1;
        lista0.insere((java.lang.Object) lista22);
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 0;
        java.lang.Object[] objArray29 = lista26.item;
        int int30 = lista26.pos;
        boolean boolean31 = lista26.vazia();
        lista22.insere((java.lang.Object) lista26);
        java.lang.Class<?> wildcardClass33 = lista26.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray19 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        java.lang.Object[] objArray26 = lista14.item;
        lista14.pos = (byte) 0;
        ds.Lista lista29 = new ds.Lista();
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        java.lang.Object[] objArray36 = new java.lang.Object[] { 'a', objArray32, 100.0d, (-1), 0.0d };
        lista29.item = objArray36;
        int int38 = lista29.ultimo;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        int int41 = lista39.pos;
        lista39.insere((java.lang.Object) 0.0d);
        int int44 = lista39.ultimo;
        ds.Lista lista45 = new ds.Lista();
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        java.lang.Object[] objArray55 = new java.lang.Object[] { 'a', objArray51, 100.0d, (-1), 0.0d };
        lista48.item = objArray55;
        lista46.item = objArray55;
        lista45.item = objArray55;
        lista39.item = objArray55;
        lista29.item = objArray55;
        java.lang.Object[] objArray61 = lista29.item;
        lista14.item = objArray61;
        lista0.item = objArray61;
        boolean boolean64 = lista0.vazia();
        boolean boolean65 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.primeiro = 100;
        lista0.primeiro = (short) 10;
        int int18 = lista0.primeiro;
        lista0.pos = (short) 10;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista0.item = objArray28;
        java.lang.Object[] objArray31 = lista0.item;
        int int32 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.primeiro = '4';
        int int39 = lista16.pos;
        int int40 = lista16.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.pos = 97;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        lista0.pos = 'a';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = 100;
        lista0.pos = 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        int int32 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.primeiro = '4';
        int int39 = lista16.ultimo;
        lista16.pos = 100;
        java.lang.Object[] objArray42 = lista16.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        int int14 = lista0.primeiro;
        lista0.primeiro = 'a';
        int int17 = lista0.pos;
        int int18 = lista0.ultimo;
        int int19 = lista0.pos;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        lista0.ultimo = (byte) 1;
        lista0.pos = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista16.primeiro = ' ';
        java.lang.Object[] objArray27 = lista16.item;
        lista0.insere((java.lang.Object) objArray27);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        lista0.ultimo = (byte) 1;
        int int11 = lista0.primeiro;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        int int14 = lista12.pos;
        lista12.insere((java.lang.Object) 0.0d);
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        lista18.item = objArray28;
        lista12.item = objArray28;
        lista0.item = objArray28;
        int int34 = lista0.ultimo;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        lista36.item = objArray45;
        lista35.item = objArray45;
        int int49 = lista35.ultimo;
        lista35.ultimo = 0;
        lista35.insere((java.lang.Object) 0L);
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        int int56 = lista54.pos;
        lista54.insere((java.lang.Object) 0.0d);
        int int59 = lista54.ultimo;
        lista54.imprime();
        int int61 = lista54.pos;
        int int62 = lista54.primeiro;
        int int63 = lista54.ultimo;
        java.lang.Object[] objArray64 = lista54.item;
        lista35.item = objArray64;
        lista0.item = objArray64;
        lista0.ultimo = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = (byte) 1;
        lista0.pos = (short) 1;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        lista44.primeiro = (byte) 100;
        lista44.ultimo = 1;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        ds.Lista lista55 = new ds.Lista();
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 'a', objArray58, 100.0d, (-1), 0.0d };
        lista55.item = objArray62;
        lista53.item = objArray62;
        java.lang.Object[] objArray65 = lista53.item;
        lista53.pos = (byte) 0;
        int int68 = lista53.pos;
        ds.Lista lista69 = new ds.Lista();
        ds.Lista lista70 = new ds.Lista();
        java.lang.Object[] objArray71 = lista70.item;
        ds.Lista lista72 = new ds.Lista();
        ds.Lista lista74 = new ds.Lista();
        java.lang.Object[] objArray75 = lista74.item;
        java.lang.Object[] objArray79 = new java.lang.Object[] { 'a', objArray75, 100.0d, (-1), 0.0d };
        lista72.item = objArray79;
        lista70.item = objArray79;
        lista69.item = objArray79;
        lista53.insere((java.lang.Object) lista69);
        lista69.pos = (byte) 1;
        lista69.pos = (short) 10;
        lista69.pos = 10;
        lista69.primeiro = '4';
        int int92 = lista69.pos;
        lista44.insere((java.lang.Object) int92);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.primeiro = 0;
        lista0.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray25 = lista0.item;
        int int26 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista14.insere((java.lang.Object) (byte) -1);
        int int28 = lista14.primeiro;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 'a', objArray34, 100.0d, (-1), 0.0d };
        lista31.item = objArray38;
        lista29.item = objArray38;
        lista14.item = objArray38;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        int int44 = lista42.pos;
        lista42.insere((java.lang.Object) 0.0d);
        int int47 = lista42.ultimo;
        ds.Lista lista48 = new ds.Lista();
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        ds.Lista lista51 = new ds.Lista();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 'a', objArray54, 100.0d, (-1), 0.0d };
        lista51.item = objArray58;
        lista49.item = objArray58;
        lista48.item = objArray58;
        lista42.item = objArray58;
        lista14.item = objArray58;
        lista0.item = objArray58;
        boolean boolean65 = lista0.vazia();
        ds.Lista lista66 = new ds.Lista();
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray69 = lista68.item;
        java.lang.Object[] objArray73 = new java.lang.Object[] { 'a', objArray69, 100.0d, (-1), 0.0d };
        lista66.item = objArray73;
        int int75 = lista66.ultimo;
        boolean boolean76 = lista66.vazia();
        java.lang.Object[] objArray77 = lista66.item;
        int int78 = lista66.ultimo;
        ds.Lista lista79 = new ds.Lista();
        ds.Lista lista81 = new ds.Lista();
        java.lang.Object[] objArray82 = lista81.item;
        java.lang.Object[] objArray86 = new java.lang.Object[] { 'a', objArray82, 100.0d, (-1), 0.0d };
        lista79.item = objArray86;
        int int88 = lista79.ultimo;
        boolean boolean89 = lista79.vazia();
        java.lang.Object[] objArray90 = lista79.item;
        lista66.item = objArray90;
        lista0.item = objArray90;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(objArray90);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.pos = ' ';
        int int19 = lista0.pos;
        lista0.ultimo = 3;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 10;
        lista0.pos = 1;
        int int19 = lista0.primeiro;
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        lista44.primeiro = (byte) 100;
        java.lang.Object[] objArray51 = lista44.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        lista0.ultimo = 10;
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        int int26 = lista17.pos;
        lista17.ultimo = 0;
        int int29 = lista17.pos;
        int int30 = lista17.pos;
        lista17.insere((java.lang.Object) 0);
        java.lang.Object[] objArray33 = lista17.item;
        lista0.item = objArray33;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        int int19 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        int int44 = lista32.primeiro;
        lista32.imprime();
        java.lang.Object[] objArray46 = lista32.item;
        lista16.insere((java.lang.Object) objArray46);
        java.lang.Object[] objArray48 = lista16.item;
        boolean boolean49 = lista16.vazia();
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        int int52 = lista50.pos;
        lista50.insere((java.lang.Object) 0.0d);
        lista50.insere((java.lang.Object) 0);
        lista50.pos = ' ';
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        ds.Lista lista61 = new ds.Lista();
        ds.Lista lista63 = new ds.Lista();
        java.lang.Object[] objArray64 = lista63.item;
        java.lang.Object[] objArray68 = new java.lang.Object[] { 'a', objArray64, 100.0d, (-1), 0.0d };
        lista61.item = objArray68;
        lista59.item = objArray68;
        lista59.insere((java.lang.Object) (byte) -1);
        int int73 = lista59.primeiro;
        java.lang.Object[] objArray74 = lista59.item;
        lista50.insere((java.lang.Object) objArray74);
        lista16.item = objArray74;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.pos = 52;
        int int24 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.insere((java.lang.Object) 0L);
        int int19 = lista0.pos;
        lista0.primeiro = (short) 100;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        java.lang.Object[] objArray37 = lista16.item;
        lista16.primeiro = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.primeiro = 1;
        int int24 = lista0.primeiro;
        int int25 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        lista0.imprime();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        int int29 = lista17.primeiro;
        lista17.imprime();
        java.lang.Object[] objArray31 = lista17.item;
        lista0.item = objArray31;
        lista0.imprime();
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.primeiro;
        java.lang.Object[] objArray36 = lista34.item;
        lista0.insere((java.lang.Object) objArray36);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        lista0.primeiro = 'a';
        lista0.pos = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 1;
        boolean boolean23 = lista0.vazia();
        java.lang.Object[] objArray24 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        int int17 = lista15.pos;
        lista15.insere((java.lang.Object) 0.0d);
        lista15.insere((java.lang.Object) 0);
        lista15.pos = ' ';
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', objArray29, 100.0d, (-1), 0.0d };
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista24.insere((java.lang.Object) (byte) -1);
        int int38 = lista24.primeiro;
        java.lang.Object[] objArray39 = lista24.item;
        lista15.insere((java.lang.Object) objArray39);
        lista15.imprime();
        int int42 = lista15.primeiro;
        lista15.pos = (short) -1;
        lista0.insere((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 'a', objArray36, 100.0d, (-1), 0.0d };
        lista33.item = objArray40;
        lista31.item = objArray40;
        int int43 = lista31.ultimo;
        lista31.ultimo = 'a';
        lista31.primeiro = 97;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista31.item = objArray49;
        lista16.item = objArray49;
        lista16.ultimo = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        int int31 = lista0.ultimo;
        int int32 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        int int21 = lista19.pos;
        lista19.insere((java.lang.Object) 0.0d);
        int int24 = lista19.ultimo;
        lista19.imprime();
        int int26 = lista19.pos;
        lista0.insere((java.lang.Object) lista19);
        lista0.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.pos = 32;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.pos;
        int int41 = lista39.primeiro;
        lista39.pos = (-1);
        lista39.pos = (-1);
        int int46 = lista39.primeiro;
        lista16.insere((java.lang.Object) int46);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        java.lang.Object[] objArray19 = lista0.item;
        int int20 = lista0.pos;
        int int21 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        int int21 = lista19.pos;
        lista19.insere((java.lang.Object) 0.0d);
        int int24 = lista19.ultimo;
        lista19.imprime();
        int int26 = lista19.pos;
        lista0.insere((java.lang.Object) lista19);
        int int28 = lista19.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.imprime();
        int int14 = lista0.pos;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        lista15.item = objArray24;
        java.lang.Object[] objArray27 = lista15.item;
        lista15.pos = (byte) 0;
        int int30 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        int int32 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.primeiro = 97;
        lista16.imprime();
        lista16.pos = 100;
        ds.Lista lista40 = new ds.Lista();
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista40.item = objArray50;
        int int54 = lista40.ultimo;
        lista40.ultimo = 10;
        lista40.pos = 1;
        int int59 = lista40.primeiro;
        int int60 = lista40.ultimo;
        lista16.insere((java.lang.Object) lista40);
        lista16.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        int int7 = lista0.primeiro;
        lista0.primeiro = (byte) 10;
        lista0.imprime();
        int int11 = lista0.pos;
        int int12 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.primeiro = 1;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        lista0.pos = (short) 0;
        int int28 = lista0.primeiro;
        int int29 = lista0.primeiro;
        boolean boolean30 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        lista16.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        lista44.primeiro = (byte) 100;
        boolean boolean51 = lista44.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        int int31 = lista22.pos;
        int int32 = lista22.ultimo;
        lista0.insere((java.lang.Object) lista22);
        boolean boolean34 = lista0.vazia();
        int int35 = lista0.primeiro;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        int int38 = lista36.pos;
        lista36.insere((java.lang.Object) 0.0d);
        int int41 = lista36.ultimo;
        lista36.imprime();
        int int43 = lista36.pos;
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.pos;
        lista44.imprime();
        java.lang.Object[] objArray47 = lista44.item;
        boolean boolean48 = lista44.vazia();
        lista44.imprime();
        java.lang.Object[] objArray50 = lista44.item;
        lista36.item = objArray50;
        lista0.item = objArray50;
        int int53 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', objArray24, 100.0d, (-1), 0.0d };
        lista21.item = objArray28;
        lista19.item = objArray28;
        lista0.item = objArray28;
        lista0.primeiro = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        java.lang.Object[] objArray32 = lista0.item;
        java.lang.Object[] objArray33 = null;
        lista0.item = objArray33;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        int int32 = lista0.primeiro;
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.primeiro = 97;
        lista16.imprime();
        lista16.pos = 100;
        int int40 = lista16.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.primeiro = 10;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = ' ';
        lista0.imprime();
        int int16 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        int int32 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.pos;
        lista3.imprime();
        int int6 = lista3.primeiro;
        java.lang.Object[] objArray7 = lista3.item;
        lista0.insere((java.lang.Object) objArray7);
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        int int44 = lista32.primeiro;
        lista32.imprime();
        java.lang.Object[] objArray46 = lista32.item;
        lista16.insere((java.lang.Object) objArray46);
        java.lang.Object[] objArray48 = lista16.item;
        lista16.pos = 52;
        java.lang.Class<?> wildcardClass51 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        java.lang.Object[] objArray32 = lista0.item;
        lista0.pos = (byte) 10;
        lista0.ultimo = (short) 0;
        lista0.primeiro = (byte) 1;
        java.lang.Object[] objArray39 = lista0.item;
        boolean boolean40 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        ds.Lista lista11 = new ds.Lista();
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 'a', objArray14, 100.0d, (-1), 0.0d };
        lista11.item = objArray18;
        lista9.item = objArray18;
        lista9.insere((java.lang.Object) (byte) -1);
        int int23 = lista9.primeiro;
        java.lang.Object[] objArray24 = lista9.item;
        lista0.insere((java.lang.Object) objArray24);
        lista0.imprime();
        int int27 = lista0.primeiro;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 'a', objArray33, 100.0d, (-1), 0.0d };
        lista30.item = objArray37;
        lista28.item = objArray37;
        java.lang.Object[] objArray40 = lista28.item;
        lista28.pos = (byte) 0;
        int int43 = lista28.pos;
        ds.Lista lista44 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        java.lang.Object[] objArray54 = new java.lang.Object[] { 'a', objArray50, 100.0d, (-1), 0.0d };
        lista47.item = objArray54;
        lista45.item = objArray54;
        lista44.item = objArray54;
        lista28.insere((java.lang.Object) lista44);
        lista44.pos = (byte) 1;
        lista44.pos = (short) 10;
        lista44.pos = 10;
        java.lang.Object[] objArray65 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        lista44.insere((java.lang.Object) 0.0d);
        int int49 = lista44.ultimo;
        lista44.imprime();
        lista44.imprime();
        java.lang.Object[] objArray52 = lista44.item;
        lista0.item = objArray52;
        int int54 = lista0.ultimo;
        ds.Lista lista55 = new ds.Lista();
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 'a', objArray58, 100.0d, (-1), 0.0d };
        lista55.item = objArray62;
        int int64 = lista55.ultimo;
        ds.Lista lista65 = new ds.Lista();
        java.lang.Object[] objArray66 = lista65.item;
        int int67 = lista65.pos;
        lista65.insere((java.lang.Object) 0.0d);
        int int70 = lista65.ultimo;
        ds.Lista lista71 = new ds.Lista();
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        ds.Lista lista74 = new ds.Lista();
        ds.Lista lista76 = new ds.Lista();
        java.lang.Object[] objArray77 = lista76.item;
        java.lang.Object[] objArray81 = new java.lang.Object[] { 'a', objArray77, 100.0d, (-1), 0.0d };
        lista74.item = objArray81;
        lista72.item = objArray81;
        lista71.item = objArray81;
        lista65.item = objArray81;
        lista55.item = objArray81;
        lista0.item = objArray81;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        java.lang.Object[] objArray31 = lista16.item;
        lista16.primeiro = '#';
        int int34 = lista16.pos;
        java.lang.Class<?> wildcardClass35 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        lista44.insere((java.lang.Object) 0.0d);
        int int49 = lista44.ultimo;
        lista44.imprime();
        lista44.imprime();
        java.lang.Object[] objArray52 = lista44.item;
        lista0.item = objArray52;
        lista0.ultimo = 0;
        java.lang.Class<?> wildcardClass56 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        java.lang.Object[] objArray26 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.ultimo = (byte) 10;
        boolean boolean31 = lista0.vazia();
        java.lang.Object[] objArray32 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        java.lang.Object[] objArray26 = lista14.item;
        lista14.pos = (byte) 0;
        int int29 = lista14.ultimo;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 'a', objArray35, 100.0d, (-1), 0.0d };
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista30.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray44 = lista30.item;
        lista14.item = objArray44;
        java.lang.Object[] objArray46 = lista14.item;
        java.lang.Object[] objArray47 = lista14.item;
        lista0.insere((java.lang.Object) objArray47);
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        ds.Lista lista51 = new ds.Lista();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 'a', objArray54, 100.0d, (-1), 0.0d };
        lista51.item = objArray58;
        lista49.item = objArray58;
        int int61 = lista49.primeiro;
        int int62 = lista49.ultimo;
        java.lang.Object[] objArray63 = lista49.item;
        lista0.item = objArray63;
        int int65 = lista0.pos;
        java.lang.Class<?> wildcardClass66 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.ultimo = 3;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = 10;
        lista0.pos = 32;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        lista0.primeiro = (short) -1;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        ds.Lista lista23 = new ds.Lista();
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        java.lang.Object[] objArray30 = new java.lang.Object[] { 'a', objArray26, 100.0d, (-1), 0.0d };
        lista23.item = objArray30;
        lista21.item = objArray30;
        java.lang.Object[] objArray33 = lista21.item;
        lista21.pos = (byte) 0;
        int int36 = lista21.pos;
        ds.Lista lista37 = new ds.Lista();
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        ds.Lista lista40 = new ds.Lista();
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        java.lang.Object[] objArray47 = new java.lang.Object[] { 'a', objArray43, 100.0d, (-1), 0.0d };
        lista40.item = objArray47;
        lista38.item = objArray47;
        lista37.item = objArray47;
        lista21.insere((java.lang.Object) lista37);
        lista37.pos = (byte) 1;
        lista37.pos = (short) 10;
        lista37.pos = 10;
        java.lang.Object[] objArray58 = lista37.item;
        lista0.item = objArray58;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.item = objArray18;
        lista0.primeiro = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        lista0.primeiro = '4';
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        int int28 = lista19.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        int int31 = lista29.pos;
        lista29.insere((java.lang.Object) 0.0d);
        int int34 = lista29.ultimo;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        lista36.item = objArray45;
        lista35.item = objArray45;
        lista29.item = objArray45;
        lista19.item = objArray45;
        java.lang.Object[] objArray51 = lista19.item;
        lista19.pos = (byte) 10;
        lista19.ultimo = (short) 0;
        lista19.primeiro = (byte) 1;
        java.lang.Object[] objArray58 = lista19.item;
        lista0.item = objArray58;
        int int60 = lista0.pos;
        lista0.pos = 100;
        java.lang.Object[] objArray63 = lista0.item;
        lista0.ultimo = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        java.lang.Object[] objArray17 = lista0.item;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista60 = new ds.Lista();
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        ds.Lista lista63 = new ds.Lista();
        ds.Lista lista65 = new ds.Lista();
        java.lang.Object[] objArray66 = lista65.item;
        java.lang.Object[] objArray70 = new java.lang.Object[] { 'a', objArray66, 100.0d, (-1), 0.0d };
        lista63.item = objArray70;
        lista61.item = objArray70;
        lista60.item = objArray70;
        int int74 = lista60.ultimo;
        lista60.ultimo = 0;
        ds.Lista lista77 = new ds.Lista();
        java.lang.Object[] objArray78 = lista77.item;
        int int79 = lista77.pos;
        java.lang.Object[] objArray80 = lista77.item;
        lista60.insere((java.lang.Object) objArray80);
        lista15.insere((java.lang.Object) objArray80);
        lista15.pos = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        java.lang.Object[] objArray26 = lista14.item;
        lista14.pos = (byte) 0;
        int int29 = lista14.ultimo;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 'a', objArray35, 100.0d, (-1), 0.0d };
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista30.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray44 = lista30.item;
        lista14.item = objArray44;
        java.lang.Object[] objArray46 = lista14.item;
        java.lang.Object[] objArray47 = lista14.item;
        lista0.insere((java.lang.Object) objArray47);
        java.lang.Object[] objArray49 = lista0.item;
        boolean boolean50 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        lista0.primeiro = '4';
        lista0.primeiro = (-1);
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        ds.Lista lista23 = new ds.Lista();
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        java.lang.Object[] objArray30 = new java.lang.Object[] { 'a', objArray26, 100.0d, (-1), 0.0d };
        lista23.item = objArray30;
        lista21.item = objArray30;
        int int33 = lista21.primeiro;
        lista21.insere((java.lang.Object) (-1L));
        lista21.ultimo = 3;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 0;
        java.lang.Object[] objArray19 = lista16.item;
        int int20 = lista16.pos;
        boolean boolean21 = lista16.vazia();
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        java.lang.Object[] objArray26 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.ultimo = (byte) 10;
        boolean boolean31 = lista0.vazia();
        int int32 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.ultimo;
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        lista0.primeiro = '4';
        java.lang.Object[] objArray19 = lista0.item;
        int int20 = lista0.pos;
        lista0.pos = 10;
        lista0.ultimo = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.primeiro = '4';
        int int39 = lista16.pos;
        lista16.primeiro = 0;
        lista16.ultimo = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        java.lang.Object[] objArray38 = lista26.item;
        lista26.pos = (byte) 0;
        ds.Lista lista41 = new ds.Lista();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        java.lang.Object[] objArray48 = new java.lang.Object[] { 'a', objArray44, 100.0d, (-1), 0.0d };
        lista41.item = objArray48;
        int int50 = lista41.ultimo;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        int int53 = lista51.pos;
        lista51.insere((java.lang.Object) 0.0d);
        int int56 = lista51.ultimo;
        ds.Lista lista57 = new ds.Lista();
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        ds.Lista lista60 = new ds.Lista();
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        java.lang.Object[] objArray67 = new java.lang.Object[] { 'a', objArray63, 100.0d, (-1), 0.0d };
        lista60.item = objArray67;
        lista58.item = objArray67;
        lista57.item = objArray67;
        lista51.item = objArray67;
        lista41.item = objArray67;
        java.lang.Object[] objArray73 = lista41.item;
        lista26.item = objArray73;
        lista0.item = objArray73;
        lista0.imprime();
        lista0.imprime();
        boolean boolean78 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.item = objArray18;
        int int20 = lista0.pos;
        java.lang.Object[] objArray21 = lista0.item;
        java.lang.Class<?> wildcardClass22 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        int int28 = lista19.pos;
        lista19.ultimo = 0;
        java.lang.Object[] objArray31 = lista19.item;
        lista19.pos = ' ';
        lista19.imprime();
        java.lang.Object[] objArray35 = lista19.item;
        lista0.item = objArray35;
        ds.Lista lista37 = new ds.Lista();
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 'a', objArray40, 100.0d, (-1), 0.0d };
        lista37.item = objArray44;
        ds.Lista lista46 = new ds.Lista();
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        java.lang.Object[] objArray53 = new java.lang.Object[] { 'a', objArray49, 100.0d, (-1), 0.0d };
        lista46.item = objArray53;
        lista46.primeiro = ' ';
        java.lang.Object[] objArray57 = lista46.item;
        lista37.insere((java.lang.Object) objArray57);
        boolean boolean59 = lista37.vazia();
        lista0.insere((java.lang.Object) boolean59);
        java.lang.Class<?> wildcardClass61 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.primeiro;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.pos = 97;
        int int16 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        java.lang.Class<?> wildcardClass32 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 100;
        lista0.primeiro = (short) 1;
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 100;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        lista14.insere((java.lang.Object) 0.0d);
        int int19 = lista14.ultimo;
        lista14.imprime();
        java.lang.Object[] objArray21 = lista14.item;
        lista0.item = objArray21;
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 10;
        boolean boolean17 = lista0.vazia();
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        java.lang.Object[] objArray17 = lista0.item;
        int int18 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.pos = 52;
        java.lang.Object[] objArray24 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        int int50 = lista44.primeiro;
        int int51 = lista44.primeiro;
        java.lang.Object[] objArray52 = lista44.item;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        int int55 = lista53.pos;
        lista53.insere((java.lang.Object) 0.0d);
        int int58 = lista53.ultimo;
        lista53.imprime();
        int int60 = lista53.pos;
        int int61 = lista53.primeiro;
        int int62 = lista53.ultimo;
        java.lang.Object[] objArray63 = lista53.item;
        int int64 = lista53.pos;
        java.lang.Object[] objArray65 = new java.lang.Object[] {};
        lista53.item = objArray65;
        lista44.insere((java.lang.Object) lista53);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = (byte) 1;
        lista0.pos = (short) 1;
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        int int32 = lista0.primeiro;
        lista0.pos = '#';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 'a', objArray40, 100.0d, (-1), 0.0d };
        lista37.item = objArray44;
        lista35.item = objArray44;
        java.lang.Object[] objArray47 = lista35.item;
        lista35.pos = (byte) 0;
        int int50 = lista35.ultimo;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        java.lang.Object[] objArray60 = new java.lang.Object[] { 'a', objArray56, 100.0d, (-1), 0.0d };
        lista53.item = objArray60;
        lista51.item = objArray60;
        lista51.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray65 = lista51.item;
        lista35.item = objArray65;
        java.lang.Object[] objArray67 = lista35.item;
        java.lang.Class<?> wildcardClass68 = objArray67.getClass();
        lista0.insere((java.lang.Object) objArray67);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        lista0.ultimo = 10;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        java.lang.Object[] objArray37 = lista16.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        int int47 = lista38.ultimo;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        int int50 = lista48.pos;
        lista48.insere((java.lang.Object) 0.0d);
        int int53 = lista48.ultimo;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        ds.Lista lista57 = new ds.Lista();
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        java.lang.Object[] objArray64 = new java.lang.Object[] { 'a', objArray60, 100.0d, (-1), 0.0d };
        lista57.item = objArray64;
        lista55.item = objArray64;
        lista54.item = objArray64;
        lista48.item = objArray64;
        lista38.item = objArray64;
        java.lang.Object[] objArray70 = lista38.item;
        lista38.pos = (byte) 10;
        lista38.ultimo = (short) 0;
        java.lang.Object[] objArray75 = lista38.item;
        lista16.item = objArray75;
        boolean boolean77 = lista16.vazia();
        lista16.ultimo = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        int int31 = lista22.pos;
        int int32 = lista22.ultimo;
        lista0.insere((java.lang.Object) lista22);
        boolean boolean34 = lista0.vazia();
        int int35 = lista0.primeiro;
        lista0.imprime();
        boolean boolean37 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = (short) 100;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        int int19 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = 0;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = 0;
        int int12 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        lista0.pos = (short) 1;
        int int34 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        int int50 = lista44.primeiro;
        int int51 = lista44.primeiro;
        java.lang.Class<?> wildcardClass52 = lista44.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        lista0.primeiro = 'a';
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista0.ultimo;
        boolean boolean50 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = (byte) 1;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        ds.Lista lista5 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        java.lang.Object[] objArray12 = new java.lang.Object[] { 'a', objArray8, 100.0d, (-1), 0.0d };
        lista5.item = objArray12;
        lista3.item = objArray12;
        java.lang.Object[] objArray15 = lista3.item;
        lista3.pos = (byte) 0;
        int int18 = lista3.pos;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        lista20.item = objArray29;
        lista19.item = objArray29;
        lista3.insere((java.lang.Object) lista19);
        lista19.pos = (byte) 1;
        lista19.pos = (short) 10;
        lista19.pos = 10;
        lista19.primeiro = '4';
        int int42 = lista19.pos;
        lista0.insere((java.lang.Object) int42);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        int int17 = lista15.pos;
        lista15.insere((java.lang.Object) 0.0d);
        int int20 = lista15.ultimo;
        lista15.imprime();
        java.lang.Object[] objArray22 = lista15.item;
        lista0.item = objArray22;
        lista0.imprime();
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        lista0.ultimo = (short) 0;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', objArray39, 100.0d, (-1), 0.0d };
        lista36.item = objArray43;
        lista34.item = objArray43;
        java.lang.Object[] objArray46 = lista34.item;
        lista34.pos = (byte) 0;
        int int49 = lista34.ultimo;
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        ds.Lista lista52 = new ds.Lista();
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        java.lang.Object[] objArray59 = new java.lang.Object[] { 'a', objArray55, 100.0d, (-1), 0.0d };
        lista52.item = objArray59;
        lista50.item = objArray59;
        lista50.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray64 = lista50.item;
        lista34.item = objArray64;
        java.lang.Object[] objArray66 = lista34.item;
        java.lang.Object[] objArray67 = lista34.item;
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray69 = lista68.item;
        ds.Lista lista70 = new ds.Lista();
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        java.lang.Object[] objArray77 = new java.lang.Object[] { 'a', objArray73, 100.0d, (-1), 0.0d };
        lista70.item = objArray77;
        lista68.item = objArray77;
        lista68.insere((java.lang.Object) (byte) -1);
        ds.Lista lista82 = new ds.Lista();
        java.lang.Object[] objArray83 = lista82.item;
        lista68.item = objArray83;
        java.lang.Object[] objArray85 = lista68.item;
        lista34.item = objArray85;
        lista0.item = objArray85;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        lista0.imprime();
        lista0.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = ' ';
        lista0.imprime();
        java.lang.Object[] objArray16 = lista0.item;
        lista0.pos = 'a';
        int int19 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        int int11 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        int int31 = lista22.pos;
        int int32 = lista22.ultimo;
        lista0.insere((java.lang.Object) lista22);
        lista22.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        lista0.pos = (short) 1;
        boolean boolean34 = lista0.vazia();
        boolean boolean35 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 100;
        lista0.ultimo = (byte) 10;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        lista0.imprime();
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        boolean boolean19 = lista0.vazia();
        boolean boolean20 = lista0.vazia();
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.pos = 'a';
        lista0.ultimo = '#';
        lista0.ultimo = (byte) -1;
        lista0.primeiro = '4';
        int int30 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        int int31 = lista22.pos;
        int int32 = lista22.ultimo;
        lista0.insere((java.lang.Object) lista22);
        boolean boolean34 = lista0.vazia();
        lista0.ultimo = (-1);
        java.lang.Object[] objArray37 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.primeiro = 0;
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 0;
        boolean boolean28 = lista25.vazia();
        lista25.ultimo = ' ';
        lista25.pos = (byte) -1;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 'a', objArray38, 100.0d, (-1), 0.0d };
        lista35.item = objArray42;
        lista33.item = objArray42;
        int int45 = lista33.primeiro;
        lista33.imprime();
        java.lang.Object[] objArray47 = lista33.item;
        lista25.insere((java.lang.Object) objArray47);
        lista10.insere((java.lang.Object) lista25);
        lista25.pos = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 100;
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        int int26 = lista17.pos;
        lista17.ultimo = 0;
        int int29 = lista17.pos;
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        int int32 = lista17.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista16.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = lista16.item;
        lista0.item = objArray30;
        lista0.pos = (short) 1;
        boolean boolean34 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.item = objArray18;
        lista0.pos = (byte) 0;
        lista0.ultimo = 3;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        lista0.insere((java.lang.Object) lista24);
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        int int17 = lista0.primeiro;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', objArray23, 100.0d, (-1), 0.0d };
        lista20.item = objArray27;
        lista18.item = objArray27;
        int int30 = lista18.ultimo;
        lista18.ultimo = 'a';
        lista18.primeiro = 97;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista18.item = objArray36;
        lista0.item = objArray36;
        int int39 = lista0.pos;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        ds.Lista lista42 = new ds.Lista();
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        java.lang.Object[] objArray49 = new java.lang.Object[] { 'a', objArray45, 100.0d, (-1), 0.0d };
        lista42.item = objArray49;
        lista40.item = objArray49;
        lista40.insere((java.lang.Object) (byte) -1);
        lista0.insere((java.lang.Object) lista40);
        lista0.imprime();
        lista0.primeiro = ' ';
        boolean boolean58 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista9.primeiro = ' ';
        java.lang.Object[] objArray20 = lista9.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.insere((java.lang.Object) (short) -1);
        int int24 = lista0.pos;
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.pos = (short) 1;
        int int39 = lista16.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.primeiro = 100;
        lista0.primeiro = (short) 10;
        int int18 = lista0.primeiro;
        lista0.pos = (short) 10;
        int int21 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.primeiro = 0;
        lista0.pos = (byte) 1;
        int int16 = lista0.pos;
        lista0.pos = (short) -1;
        lista0.primeiro = (byte) 1;
        int int21 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.imprime();
        int int14 = lista0.pos;
        lista0.ultimo = 1;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        java.lang.Object[] objArray26 = lista14.item;
        lista14.pos = (byte) 0;
        ds.Lista lista29 = new ds.Lista();
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        java.lang.Object[] objArray36 = new java.lang.Object[] { 'a', objArray32, 100.0d, (-1), 0.0d };
        lista29.item = objArray36;
        int int38 = lista29.ultimo;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        int int41 = lista39.pos;
        lista39.insere((java.lang.Object) 0.0d);
        int int44 = lista39.ultimo;
        ds.Lista lista45 = new ds.Lista();
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        java.lang.Object[] objArray55 = new java.lang.Object[] { 'a', objArray51, 100.0d, (-1), 0.0d };
        lista48.item = objArray55;
        lista46.item = objArray55;
        lista45.item = objArray55;
        lista39.item = objArray55;
        lista29.item = objArray55;
        java.lang.Object[] objArray61 = lista29.item;
        lista14.item = objArray61;
        lista0.item = objArray61;
        boolean boolean64 = lista0.vazia();
        lista0.primeiro = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        int int11 = lista0.pos;
        int int12 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        lista0.primeiro = 0;
        boolean boolean51 = lista0.vazia();
        int int52 = lista0.pos;
        lista0.primeiro = 3;
        lista0.pos = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        int int15 = lista0.ultimo;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.ultimo;
        lista0.primeiro = 3;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Object[] objArray13 = lista0.item;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        lista13.item = objArray22;
        java.lang.Object[] objArray25 = lista13.item;
        lista0.item = objArray25;
        int int27 = lista0.pos;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        int int61 = lista59.pos;
        java.lang.Object[] objArray62 = lista59.item;
        lista15.insere((java.lang.Object) lista59);
        lista59.primeiro = (byte) 100;
        lista59.ultimo = (byte) 10;
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray69 = lista68.item;
        ds.Lista lista70 = new ds.Lista();
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        java.lang.Object[] objArray77 = new java.lang.Object[] { 'a', objArray73, 100.0d, (-1), 0.0d };
        lista70.item = objArray77;
        lista68.item = objArray77;
        lista68.primeiro = 0;
        lista68.pos = (byte) 1;
        java.lang.Object[] objArray84 = lista68.item;
        lista59.item = objArray84;
        java.lang.Object[] objArray86 = lista59.item;
        lista0.item = objArray86;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (short) 100;
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        ds.Lista lista17 = new ds.Lista();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', objArray20, 100.0d, (-1), 0.0d };
        lista17.item = objArray24;
        int int26 = lista17.pos;
        lista17.ultimo = 0;
        int int29 = lista17.pos;
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        int int14 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista0.insere((java.lang.Object) objArray20);
        int int22 = lista0.pos;
        int int23 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista14.insere((java.lang.Object) (byte) -1);
        int int28 = lista14.primeiro;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 'a', objArray34, 100.0d, (-1), 0.0d };
        lista31.item = objArray38;
        lista29.item = objArray38;
        lista14.item = objArray38;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        int int44 = lista42.pos;
        lista42.insere((java.lang.Object) 0.0d);
        int int47 = lista42.ultimo;
        ds.Lista lista48 = new ds.Lista();
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        ds.Lista lista51 = new ds.Lista();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 'a', objArray54, 100.0d, (-1), 0.0d };
        lista51.item = objArray58;
        lista49.item = objArray58;
        lista48.item = objArray58;
        lista42.item = objArray58;
        lista14.item = objArray58;
        lista0.item = objArray58;
        int int65 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        int int11 = lista0.pos;
        lista0.ultimo = 0;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.primeiro = (short) -1;
        lista0.ultimo = (byte) 100;
        int int18 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        java.lang.Object[] objArray17 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = (short) 1;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        lista16.pos = 32;
        lista16.primeiro = 2;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        int int53 = lista41.ultimo;
        lista41.ultimo = 'a';
        lista41.primeiro = 97;
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        lista41.item = objArray59;
        boolean boolean61 = lista41.vazia();
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        ds.Lista lista64 = new ds.Lista();
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { 'a', objArray67, 100.0d, (-1), 0.0d };
        lista64.item = objArray71;
        lista62.item = objArray71;
        lista62.insere((java.lang.Object) (byte) -1);
        ds.Lista lista76 = new ds.Lista();
        java.lang.Object[] objArray77 = lista76.item;
        lista62.item = objArray77;
        lista41.item = objArray77;
        lista16.item = objArray77;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.primeiro = 97;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', objArray25, 100.0d, (-1), 0.0d };
        lista22.item = objArray29;
        lista20.item = objArray29;
        int int32 = lista20.ultimo;
        lista20.imprime();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', objArray39, 100.0d, (-1), 0.0d };
        lista36.item = objArray43;
        lista34.item = objArray43;
        java.lang.Object[] objArray46 = lista34.item;
        lista34.pos = (byte) 0;
        ds.Lista lista49 = new ds.Lista();
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 'a', objArray52, 100.0d, (-1), 0.0d };
        lista49.item = objArray56;
        int int58 = lista49.ultimo;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        int int61 = lista59.pos;
        lista59.insere((java.lang.Object) 0.0d);
        int int64 = lista59.ultimo;
        ds.Lista lista65 = new ds.Lista();
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        ds.Lista lista68 = new ds.Lista();
        ds.Lista lista70 = new ds.Lista();
        java.lang.Object[] objArray71 = lista70.item;
        java.lang.Object[] objArray75 = new java.lang.Object[] { 'a', objArray71, 100.0d, (-1), 0.0d };
        lista68.item = objArray75;
        lista66.item = objArray75;
        lista65.item = objArray75;
        lista59.item = objArray75;
        lista49.item = objArray75;
        java.lang.Object[] objArray81 = lista49.item;
        lista34.item = objArray81;
        lista20.item = objArray81;
        lista0.item = objArray81;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        lista44.pos = (byte) 1;
        boolean boolean52 = lista44.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.primeiro;
        java.lang.Object[] objArray13 = lista0.item;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        java.lang.Object[] objArray26 = lista14.item;
        lista14.pos = (byte) 0;
        int int29 = lista14.pos;
        ds.Lista lista30 = new ds.Lista();
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 'a', objArray36, 100.0d, (-1), 0.0d };
        lista33.item = objArray40;
        lista31.item = objArray40;
        lista30.item = objArray40;
        lista14.insere((java.lang.Object) lista30);
        lista30.pos = (byte) 1;
        lista30.pos = (short) 10;
        int int49 = lista30.primeiro;
        lista30.imprime();
        ds.Lista lista51 = new ds.Lista();
        int int52 = lista51.pos;
        lista51.imprime();
        java.lang.Object[] objArray54 = lista51.item;
        lista30.item = objArray54;
        lista0.insere((java.lang.Object) lista30);
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        int int59 = lista57.pos;
        lista57.insere((java.lang.Object) 0.0d);
        int int62 = lista57.ultimo;
        ds.Lista lista63 = new ds.Lista();
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        ds.Lista lista66 = new ds.Lista();
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray69 = lista68.item;
        java.lang.Object[] objArray73 = new java.lang.Object[] { 'a', objArray69, 100.0d, (-1), 0.0d };
        lista66.item = objArray73;
        lista64.item = objArray73;
        lista63.item = objArray73;
        lista57.item = objArray73;
        lista57.pos = 1;
        java.lang.Object[] objArray80 = lista57.item;
        lista0.item = objArray80;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        boolean boolean31 = lista0.vazia();
        int int32 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray2 = lista1.item;
        ds.Lista lista3 = new ds.Lista();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', objArray6, 100.0d, (-1), 0.0d };
        lista3.item = objArray10;
        lista1.item = objArray10;
        lista0.item = objArray10;
        lista0.primeiro = (short) -1;
        lista0.ultimo = (byte) 100;
        java.lang.Object[] objArray18 = lista0.item;
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (byte) 10;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray19 = lista0.item;
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', objArray23, 100.0d, (-1), 0.0d };
        lista20.item = objArray27;
        int int29 = lista20.pos;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 'a', objArray35, 100.0d, (-1), 0.0d };
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista30.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray44 = lista30.item;
        lista20.item = objArray44;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        java.lang.Object[] objArray55 = new java.lang.Object[] { 'a', objArray51, 100.0d, (-1), 0.0d };
        lista48.item = objArray55;
        lista46.item = objArray55;
        lista46.insere((java.lang.Object) (byte) -1);
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        lista46.item = objArray61;
        lista20.item = objArray61;
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        int int66 = lista64.pos;
        java.lang.Object[] objArray67 = lista64.item;
        lista20.insere((java.lang.Object) lista64);
        java.lang.Object[] objArray69 = lista64.item;
        lista0.item = objArray69;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.ultimo = (-1);
        int int17 = lista0.primeiro;
        int int18 = lista0.ultimo;
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.insere((java.lang.Object) objArray6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 'a', objArray13, 100.0d, (-1), 0.0d };
        lista10.item = objArray17;
        lista8.item = objArray17;
        lista8.insere((java.lang.Object) (byte) -1);
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista8.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista8.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 'a', objArray34, 100.0d, (-1), 0.0d };
        lista31.item = objArray38;
        lista29.item = objArray38;
        java.lang.Object[] objArray41 = lista29.item;
        lista29.pos = (byte) 0;
        int int44 = lista29.ultimo;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        java.lang.Object[] objArray54 = new java.lang.Object[] { 'a', objArray50, 100.0d, (-1), 0.0d };
        lista47.item = objArray54;
        lista45.item = objArray54;
        lista45.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray59 = lista45.item;
        lista29.item = objArray59;
        lista0.insere((java.lang.Object) lista29);
        lista0.pos = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.insere((java.lang.Object) 0.0d);
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista10.item = objArray26;
        lista0.item = objArray26;
        int int32 = lista0.primeiro;
        int int33 = lista0.pos;
        java.lang.Object[] objArray34 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', objArray11, 100.0d, (-1), 0.0d };
        lista8.item = objArray15;
        lista6.item = objArray15;
        lista5.item = objArray15;
        lista0.item = objArray15;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        ds.Lista lista14 = new ds.Lista();
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', objArray17, 100.0d, (-1), 0.0d };
        lista14.item = objArray21;
        int int23 = lista14.pos;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', objArray29, 100.0d, (-1), 0.0d };
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista24.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray38 = lista24.item;
        lista14.item = objArray38;
        boolean boolean40 = lista14.vazia();
        lista0.insere((java.lang.Object) boolean40);
        boolean boolean42 = lista0.vazia();
        boolean boolean43 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        int int5 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        int int7 = lista0.primeiro;
        lista0.primeiro = (byte) 10;
        lista0.imprime();
        int int11 = lista0.pos;
        lista0.pos = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        lista0.pos = '#';
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 'a', objArray16, 100.0d, (-1), 0.0d };
        lista13.item = objArray20;
        int int22 = lista13.ultimo;
        boolean boolean23 = lista13.vazia();
        java.lang.Object[] objArray24 = lista13.item;
        lista0.item = objArray24;
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (short) 0;
        int int8 = lista0.primeiro;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        int int6 = lista4.pos;
        java.lang.Object[] objArray7 = lista4.item;
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', objArray11, 100.0d, (-1), 0.0d };
        lista8.item = objArray15;
        int int17 = lista8.pos;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', objArray23, 100.0d, (-1), 0.0d };
        lista20.item = objArray27;
        lista18.item = objArray27;
        lista18.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray32 = lista18.item;
        lista8.item = objArray32;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', objArray39, 100.0d, (-1), 0.0d };
        lista36.item = objArray43;
        lista34.item = objArray43;
        lista34.insere((java.lang.Object) (byte) -1);
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista34.item = objArray49;
        lista8.item = objArray49;
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        int int54 = lista52.pos;
        java.lang.Object[] objArray55 = lista52.item;
        lista8.insere((java.lang.Object) lista52);
        int int57 = lista52.ultimo;
        int int58 = lista52.primeiro;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        ds.Lista lista61 = new ds.Lista();
        ds.Lista lista63 = new ds.Lista();
        java.lang.Object[] objArray64 = lista63.item;
        java.lang.Object[] objArray68 = new java.lang.Object[] { 'a', objArray64, 100.0d, (-1), 0.0d };
        lista61.item = objArray68;
        lista59.item = objArray68;
        java.lang.Object[] objArray71 = lista59.item;
        lista59.pos = (byte) 0;
        int int74 = lista59.ultimo;
        ds.Lista lista75 = new ds.Lista();
        java.lang.Object[] objArray76 = lista75.item;
        ds.Lista lista77 = new ds.Lista();
        ds.Lista lista79 = new ds.Lista();
        java.lang.Object[] objArray80 = lista79.item;
        java.lang.Object[] objArray84 = new java.lang.Object[] { 'a', objArray80, 100.0d, (-1), 0.0d };
        lista77.item = objArray84;
        lista75.item = objArray84;
        lista75.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray89 = lista75.item;
        lista59.item = objArray89;
        java.lang.Object[] objArray91 = lista59.item;
        lista52.item = objArray91;
        lista4.item = objArray91;
        lista0.item = objArray91;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', objArray15, 100.0d, (-1), 0.0d };
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista10.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = lista10.item;
        lista0.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.insere((java.lang.Object) (byte) -1);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista26.item = objArray41;
        lista0.item = objArray41;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        java.lang.Object[] objArray47 = lista44.item;
        lista0.insere((java.lang.Object) lista44);
        int int49 = lista44.ultimo;
        int int50 = lista44.primeiro;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        java.lang.Object[] objArray60 = new java.lang.Object[] { 'a', objArray56, 100.0d, (-1), 0.0d };
        lista53.item = objArray60;
        lista51.item = objArray60;
        java.lang.Object[] objArray63 = lista51.item;
        lista51.pos = (byte) 0;
        int int66 = lista51.ultimo;
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray68 = lista67.item;
        ds.Lista lista69 = new ds.Lista();
        ds.Lista lista71 = new ds.Lista();
        java.lang.Object[] objArray72 = lista71.item;
        java.lang.Object[] objArray76 = new java.lang.Object[] { 'a', objArray72, 100.0d, (-1), 0.0d };
        lista69.item = objArray76;
        lista67.item = objArray76;
        lista67.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray81 = lista67.item;
        lista51.item = objArray81;
        java.lang.Object[] objArray83 = lista51.item;
        lista44.item = objArray83;
        lista44.primeiro = (byte) -1;
        int int87 = lista44.ultimo;
        java.lang.Class<?> wildcardClass88 = lista44.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', objArray37, 100.0d, (-1), 0.0d };
        lista34.item = objArray41;
        lista32.item = objArray41;
        int int44 = lista32.primeiro;
        lista32.imprime();
        java.lang.Object[] objArray46 = lista32.item;
        lista16.insere((java.lang.Object) objArray46);
        int int48 = lista16.ultimo;
        lista16.ultimo = (-1);
        int int51 = lista16.ultimo;
        int int52 = lista16.primeiro;
        int int53 = lista16.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', objArray12, 100.0d, (-1), 0.0d };
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista6.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 1;
        lista0.ultimo = 10;
        int int25 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 'a', objArray36, 100.0d, (-1), 0.0d };
        lista33.item = objArray40;
        lista31.item = objArray40;
        int int43 = lista31.ultimo;
        lista31.ultimo = 'a';
        lista31.primeiro = 97;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista31.item = objArray49;
        lista16.item = objArray49;
        boolean boolean52 = lista16.vazia();
        boolean boolean53 = lista16.vazia();
        lista16.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', objArray30, 100.0d, (-1), 0.0d };
        lista27.item = objArray34;
        lista25.item = objArray34;
        lista25.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = lista25.item;
        lista15.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        lista41.insere((java.lang.Object) (byte) -1);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista41.item = objArray56;
        lista15.item = objArray56;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray60 = lista0.item;
        int int61 = lista0.primeiro;
        java.lang.Object[] objArray62 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        lista16.item = objArray26;
        lista0.insere((java.lang.Object) lista16);
        lista16.pos = (byte) 1;
        lista16.pos = (short) 10;
        lista16.pos = 10;
        java.lang.Object[] objArray37 = lista16.item;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        ds.Lista lista40 = new ds.Lista();
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        java.lang.Object[] objArray47 = new java.lang.Object[] { 'a', objArray43, 100.0d, (-1), 0.0d };
        lista40.item = objArray47;
        lista38.item = objArray47;
        java.lang.Object[] objArray50 = lista38.item;
        lista38.pos = (byte) 0;
        int int53 = lista38.pos;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        ds.Lista lista57 = new ds.Lista();
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        java.lang.Object[] objArray64 = new java.lang.Object[] { 'a', objArray60, 100.0d, (-1), 0.0d };
        lista57.item = objArray64;
        lista55.item = objArray64;
        lista54.item = objArray64;
        lista38.insere((java.lang.Object) lista54);
        lista54.pos = (byte) 1;
        lista54.pos = (short) 10;
        lista54.pos = 10;
        lista54.primeiro = '4';
        int int77 = lista54.primeiro;
        java.lang.Object[] objArray78 = lista54.item;
        java.lang.Object[] objArray79 = lista54.item;
        lista16.item = objArray79;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 52 + "'", int77 == 52);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray79);
    }
}

