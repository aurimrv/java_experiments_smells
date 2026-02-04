package ds.seed6733;

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
        lista0.ultimo = 10;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
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
        int int17 = lista0.ultimo;
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        lista0.primeiro = '#';
        lista0.pos = (short) 0;
        int int9 = lista0.pos;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        lista0.pos = 0;
        lista0.ultimo = (short) 0;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
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
        lista0.ultimo = (-1);
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
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
        lista0.primeiro = 0;
        lista0.ultimo = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
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
        lista0.primeiro = (byte) 1;
        java.lang.Object[] objArray22 = lista0.item;
        int int23 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
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
        int int14 = lista0.ultimo;
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
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
        lista0.ultimo = 'a';
        lista0.ultimo = (byte) 1;
        boolean boolean69 = lista0.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
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
        int int16 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
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
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
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
        java.lang.Object[] objArray20 = lista19.item;
        int int21 = lista19.pos;
        lista19.insere((java.lang.Object) 0.0d);
        lista19.insere((java.lang.Object) 0);
        lista19.pos = ' ';
        java.lang.Object[] objArray28 = lista19.item;
        lista0.insere((java.lang.Object) lista19);
        lista0.pos = (-1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
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
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray2 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
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
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
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
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
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
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        int int17 = lista15.pos;
        lista15.insere((java.lang.Object) 0.0d);
        int int20 = lista15.ultimo;
        lista15.imprime();
        int int22 = lista15.pos;
        int int23 = lista15.primeiro;
        int int24 = lista15.ultimo;
        java.lang.Object[] objArray25 = lista15.item;
        lista0.item = objArray25;
        lista0.ultimo = (-1);
        int int29 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
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
        boolean boolean39 = lista0.vazia();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        ds.Lista lista42 = new ds.Lista();
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        java.lang.Object[] objArray49 = new java.lang.Object[] { 'a', objArray45, 100.0d, (-1), 0.0d };
        lista42.item = objArray49;
        lista40.item = objArray49;
        java.lang.Object[] objArray52 = lista40.item;
        int int53 = lista40.primeiro;
        int int54 = lista40.primeiro;
        lista40.imprime();
        lista0.insere((java.lang.Object) lista40);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
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
        boolean boolean51 = lista16.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        int int10 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
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
        lista0.imprime();
        lista0.primeiro = ' ';
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
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
        lista0.imprime();
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
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
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
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
        lista0.imprime();
        boolean boolean20 = lista0.vazia();
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
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
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        int int12 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
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
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
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
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 'a', objArray38, 100.0d, (-1), 0.0d };
        lista35.item = objArray42;
        lista33.item = objArray42;
        java.lang.Object[] objArray45 = lista33.item;
        lista33.pos = (byte) 0;
        int int48 = lista33.pos;
        ds.Lista lista49 = new ds.Lista();
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        ds.Lista lista52 = new ds.Lista();
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        java.lang.Object[] objArray59 = new java.lang.Object[] { 'a', objArray55, 100.0d, (-1), 0.0d };
        lista52.item = objArray59;
        lista50.item = objArray59;
        lista49.item = objArray59;
        lista33.insere((java.lang.Object) lista49);
        lista49.pos = (byte) 1;
        lista49.pos = (short) 10;
        lista49.primeiro = 97;
        ds.Lista lista70 = new ds.Lista();
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        java.lang.Object[] objArray77 = new java.lang.Object[] { 'a', objArray73, 100.0d, (-1), 0.0d };
        lista70.item = objArray77;
        int int79 = lista70.pos;
        lista70.ultimo = 0;
        int int82 = lista70.pos;
        int int83 = lista70.pos;
        lista70.insere((java.lang.Object) 0);
        java.lang.Object[] objArray86 = lista70.item;
        lista49.item = objArray86;
        lista26.insere((java.lang.Object) objArray86);
        lista26.imprime();
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
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
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
        lista0.imprime();
        int int21 = lista0.pos;
        int int22 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
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
        int int57 = lista0.pos;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
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
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
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
        lista0.pos = 3;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
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
        int int24 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
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
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', objArray27, 100.0d, (-1), 0.0d };
        lista24.item = objArray31;
        lista22.item = objArray31;
        int int34 = lista22.ultimo;
        lista22.ultimo = 'a';
        lista22.ultimo = (-1);
        lista22.primeiro = '4';
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
        lista41.pos = (byte) 10;
        lista41.ultimo = (short) 0;
        lista41.primeiro = (byte) 1;
        java.lang.Object[] objArray80 = lista41.item;
        lista22.item = objArray80;
        lista0.item = objArray80;
        int int83 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
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
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
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
        lista0.pos = ' ';
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
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
        lista0.primeiro = (short) 100;
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
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
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
        int int55 = lista40.ultimo;
        int int56 = lista40.ultimo;
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
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
        int int65 = lista0.primeiro;
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        int int68 = lista66.pos;
        lista66.pos = (short) 1;
        lista66.primeiro = '#';
        ds.Lista lista73 = new ds.Lista();
        lista73.pos = 0;
        boolean boolean76 = lista73.vazia();
        lista73.ultimo = ' ';
        lista73.pos = (byte) -1;
        ds.Lista lista81 = new ds.Lista();
        java.lang.Object[] objArray82 = lista81.item;
        ds.Lista lista83 = new ds.Lista();
        ds.Lista lista85 = new ds.Lista();
        java.lang.Object[] objArray86 = lista85.item;
        java.lang.Object[] objArray90 = new java.lang.Object[] { 'a', objArray86, 100.0d, (-1), 0.0d };
        lista83.item = objArray90;
        lista81.item = objArray90;
        int int93 = lista81.primeiro;
        lista81.imprime();
        java.lang.Object[] objArray95 = lista81.item;
        lista73.insere((java.lang.Object) objArray95);
        lista66.item = objArray95;
        lista0.insere((java.lang.Object) objArray95);
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
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(objArray95);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
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
        lista16.imprime();
        boolean boolean42 = lista16.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.pos = (byte) 100;
        boolean boolean15 = lista0.vazia();
        java.lang.Object[] objArray16 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
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
        int int22 = lista0.pos;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
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
        java.lang.Object[] objArray71 = null;
        lista0.item = objArray71;
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
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
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
        java.lang.Object[] objArray30 = lista0.item;
        boolean boolean31 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
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
        lista0.imprime();
        lista0.primeiro = ' ';
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        lista17.item = objArray26;
        int int29 = lista17.primeiro;
        java.lang.Object[] objArray30 = lista17.item;
        lista0.insere((java.lang.Object) lista17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
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
        boolean boolean62 = lista16.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
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
        java.lang.Object[] objArray14 = lista0.item;
        lista0.imprime();
        boolean boolean16 = lista0.vazia();
        lista0.pos = 97;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
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
        int int78 = lista16.pos;
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
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
        lista16.ultimo = 35;
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
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
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
        lista0.pos = (short) -1;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
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
        int int32 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
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
        int int17 = lista0.ultimo;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        lista18.primeiro = ' ';
        lista18.pos = '#';
        lista18.ultimo = (byte) -1;
        int int33 = lista18.ultimo;
        lista18.ultimo = (short) 10;
        boolean boolean36 = lista18.vazia();
        java.lang.Object[] objArray37 = lista18.item;
        lista0.item = objArray37;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
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
        lista44.pos = 32;
        int int90 = lista44.primeiro;
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
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
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
        java.lang.Object[] objArray16 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
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
        java.lang.Object[] objArray15 = lista0.item;
        lista0.imprime();
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
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
        ds.Lista lista33 = new ds.Lista();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 'a', objArray36, 100.0d, (-1), 0.0d };
        lista33.item = objArray40;
        int int42 = lista33.ultimo;
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        int int45 = lista43.pos;
        lista43.insere((java.lang.Object) 0.0d);
        int int48 = lista43.ultimo;
        ds.Lista lista49 = new ds.Lista();
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        ds.Lista lista52 = new ds.Lista();
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        java.lang.Object[] objArray59 = new java.lang.Object[] { 'a', objArray55, 100.0d, (-1), 0.0d };
        lista52.item = objArray59;
        lista50.item = objArray59;
        lista49.item = objArray59;
        lista43.item = objArray59;
        lista33.item = objArray59;
        java.lang.Object[] objArray65 = lista33.item;
        lista33.pos = (byte) 10;
        lista33.ultimo = (short) 0;
        java.lang.Object[] objArray70 = lista33.item;
        lista0.insere((java.lang.Object) lista33);
        int int72 = lista33.pos;
        ds.Lista lista73 = new ds.Lista();
        java.lang.Object[] objArray74 = lista73.item;
        ds.Lista lista75 = new ds.Lista();
        ds.Lista lista77 = new ds.Lista();
        java.lang.Object[] objArray78 = lista77.item;
        java.lang.Object[] objArray82 = new java.lang.Object[] { 'a', objArray78, 100.0d, (-1), 0.0d };
        lista75.item = objArray82;
        lista73.item = objArray82;
        lista73.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray87 = lista73.item;
        ds.Lista lista88 = new ds.Lista();
        java.lang.Object[] objArray89 = lista88.item;
        int int90 = lista88.pos;
        lista88.insere((java.lang.Object) 0.0d);
        int int93 = lista88.ultimo;
        lista88.imprime();
        java.lang.Object[] objArray95 = lista88.item;
        lista73.item = objArray95;
        lista33.item = objArray95;
        boolean boolean98 = lista33.vazia();
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
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
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
        java.lang.Object[] objArray62 = lista0.item;
        int int63 = lista0.pos;
        int int64 = lista0.primeiro;
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
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.pos;
        int int13 = lista0.pos;
        lista0.insere((java.lang.Object) 0);
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.pos;
        ds.Lista lista18 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 'a', objArray21, 100.0d, (-1), 0.0d };
        lista18.item = objArray25;
        int int27 = lista18.ultimo;
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
        lista18.item = objArray44;
        java.lang.Object[] objArray50 = lista18.item;
        lista18.pos = (byte) 10;
        lista18.ultimo = (short) 0;
        lista18.primeiro = (byte) 1;
        java.lang.Object[] objArray57 = lista18.item;
        lista0.insere((java.lang.Object) lista18);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
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
        int int15 = lista0.primeiro;
        int int16 = lista0.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        lista17.insere((java.lang.Object) 0.0d);
        int int22 = lista17.ultimo;
        lista17.pos = 0;
        boolean boolean25 = lista17.vazia();
        lista0.insere((java.lang.Object) lista17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
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
        int int64 = lista0.primeiro;
        lista0.imprime();
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
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
        int int18 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.ultimo;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
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
        lista0.imprime();
        int int28 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
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
        lista16.imprime();
        int int42 = lista16.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
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
        int int20 = lista0.primeiro;
        int int21 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        ds.Lista lista4 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', objArray7, 100.0d, (-1), 0.0d };
        lista4.item = objArray11;
        int int13 = lista4.pos;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista14.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray28 = lista14.item;
        lista4.item = objArray28;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 'a', objArray35, 100.0d, (-1), 0.0d };
        lista32.item = objArray39;
        lista30.item = objArray39;
        lista30.insere((java.lang.Object) (byte) -1);
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista30.item = objArray45;
        lista4.item = objArray45;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        int int50 = lista48.pos;
        java.lang.Object[] objArray51 = lista48.item;
        lista4.insere((java.lang.Object) lista48);
        int int53 = lista48.ultimo;
        int int54 = lista48.primeiro;
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        ds.Lista lista57 = new ds.Lista();
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        java.lang.Object[] objArray64 = new java.lang.Object[] { 'a', objArray60, 100.0d, (-1), 0.0d };
        lista57.item = objArray64;
        lista55.item = objArray64;
        java.lang.Object[] objArray67 = lista55.item;
        lista55.pos = (byte) 0;
        int int70 = lista55.ultimo;
        ds.Lista lista71 = new ds.Lista();
        java.lang.Object[] objArray72 = lista71.item;
        ds.Lista lista73 = new ds.Lista();
        ds.Lista lista75 = new ds.Lista();
        java.lang.Object[] objArray76 = lista75.item;
        java.lang.Object[] objArray80 = new java.lang.Object[] { 'a', objArray76, 100.0d, (-1), 0.0d };
        lista73.item = objArray80;
        lista71.item = objArray80;
        lista71.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray85 = lista71.item;
        lista55.item = objArray85;
        java.lang.Object[] objArray87 = lista55.item;
        lista48.item = objArray87;
        lista0.item = objArray87;
        java.lang.Class<?> wildcardClass90 = objArray87.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
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
        int int19 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = 100;
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
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
        boolean boolean35 = lista0.vazia();
        int int36 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
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
        int int25 = lista0.pos;
        int int26 = lista0.primeiro;
        int int27 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
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
        int int25 = lista0.pos;
        int int26 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
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
        lista44.ultimo = (byte) 10;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        ds.Lista lista55 = new ds.Lista();
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 'a', objArray58, 100.0d, (-1), 0.0d };
        lista55.item = objArray62;
        lista53.item = objArray62;
        lista53.primeiro = 0;
        lista53.pos = (byte) 1;
        java.lang.Object[] objArray69 = lista53.item;
        lista44.item = objArray69;
        java.lang.Object[] objArray71 = lista44.item;
        java.lang.Object[] objArray72 = lista44.item;
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
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
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
        int int21 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
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
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 'a', objArray40, 100.0d, (-1), 0.0d };
        lista37.item = objArray44;
        lista35.item = objArray44;
        lista34.item = objArray44;
        int int48 = lista34.ultimo;
        lista34.ultimo = 0;
        int int51 = lista34.primeiro;
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 'a', objArray57, 100.0d, (-1), 0.0d };
        lista54.item = objArray61;
        lista52.item = objArray61;
        int int64 = lista52.ultimo;
        lista52.ultimo = 'a';
        lista52.primeiro = 97;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        lista52.item = objArray70;
        lista34.item = objArray70;
        int int73 = lista34.pos;
        ds.Lista lista74 = new ds.Lista();
        java.lang.Object[] objArray75 = lista74.item;
        ds.Lista lista76 = new ds.Lista();
        ds.Lista lista78 = new ds.Lista();
        java.lang.Object[] objArray79 = lista78.item;
        java.lang.Object[] objArray83 = new java.lang.Object[] { 'a', objArray79, 100.0d, (-1), 0.0d };
        lista76.item = objArray83;
        lista74.item = objArray83;
        lista74.insere((java.lang.Object) (byte) -1);
        lista34.insere((java.lang.Object) lista74);
        lista34.imprime();
        lista0.insere((java.lang.Object) lista34);
        ds.Lista lista91 = new ds.Lista();
        int int92 = lista91.pos;
        lista91.imprime();
        lista91.imprime();
        lista0.insere((java.lang.Object) lista91);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
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
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
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
        java.lang.Class<?> wildcardClass32 = objArray31.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
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
        lista0.ultimo = (short) 100;
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
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
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
        lista15.imprime();
        int int85 = lista15.primeiro;
        java.lang.Object[] objArray86 = lista15.item;
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
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
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
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
        lista0.primeiro = (short) 0;
        lista0.insere((java.lang.Object) (short) 0);
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
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
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
        java.lang.Class<?> wildcardClass40 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
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
        lista10.pos = (short) 0;
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 'a', objArray57, 100.0d, (-1), 0.0d };
        lista54.item = objArray61;
        lista52.item = objArray61;
        java.lang.Object[] objArray64 = lista52.item;
        lista52.pos = (byte) 0;
        int int67 = lista52.pos;
        ds.Lista lista68 = new ds.Lista();
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        ds.Lista lista71 = new ds.Lista();
        ds.Lista lista73 = new ds.Lista();
        java.lang.Object[] objArray74 = lista73.item;
        java.lang.Object[] objArray78 = new java.lang.Object[] { 'a', objArray74, 100.0d, (-1), 0.0d };
        lista71.item = objArray78;
        lista69.item = objArray78;
        lista68.item = objArray78;
        lista52.insere((java.lang.Object) lista68);
        lista68.pos = (byte) 1;
        lista68.pos = (short) 10;
        lista68.pos = 10;
        java.lang.Object[] objArray89 = lista68.item;
        lista10.insere((java.lang.Object) lista68);
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
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
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
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', objArray31, 100.0d, (-1), 0.0d };
        lista28.item = objArray35;
        lista26.item = objArray35;
        lista26.primeiro = 0;
        lista26.pos = (byte) 1;
        int int42 = lista26.pos;
        lista26.primeiro = 100;
        lista0.insere((java.lang.Object) 100);
        int int46 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
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
        lista0.pos = (short) 1;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
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
        lista0.pos = ' ';
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
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
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
        int int71 = lista0.pos;
        java.lang.Object[] objArray72 = lista0.item;
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
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
        lista16.primeiro = (byte) 0;
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
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
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
        int int57 = lista16.ultimo;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.pos = (-1);
        lista0.pos = (byte) 1;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
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
        java.lang.Class<?> wildcardClass45 = objArray41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
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
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
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
        java.lang.Object[] objArray61 = lista0.item;
        lista0.ultimo = 0;
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
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        lista5.item = objArray14;
        java.lang.Object[] objArray17 = lista5.item;
        java.lang.Object[] objArray18 = lista5.item;
        lista0.item = objArray18;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
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
        java.lang.Object[] objArray40 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
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
        lista0.ultimo = '#';
        lista0.primeiro = 2;
        lista0.ultimo = 1;
        ds.Lista lista72 = new ds.Lista();
        java.lang.Class<?> wildcardClass73 = lista72.getClass();
        lista0.insere((java.lang.Object) lista72);
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
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
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
        java.lang.Object[] objArray52 = lista0.item;
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
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
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
        lista0.ultimo = (short) -1;
        int int18 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
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
        int int31 = lista17.pos;
        lista0.insere((java.lang.Object) int31);
        int int33 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
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
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
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
        lista0.primeiro = 10;
        int int30 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
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
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
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
        lista0.pos = (-1);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        lista0.pos = 0;
        lista0.ultimo = (short) 0;
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', objArray10, 100.0d, (-1), 0.0d };
        lista7.item = objArray14;
        int int16 = lista7.ultimo;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        lista17.insere((java.lang.Object) 0.0d);
        int int22 = lista17.ultimo;
        ds.Lista lista23 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', objArray29, 100.0d, (-1), 0.0d };
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista23.item = objArray33;
        lista17.item = objArray33;
        lista7.item = objArray33;
        lista7.ultimo = (short) 0;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        ds.Lista lista43 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 'a', objArray46, 100.0d, (-1), 0.0d };
        lista43.item = objArray50;
        lista41.item = objArray50;
        java.lang.Object[] objArray53 = lista41.item;
        lista41.pos = (byte) 0;
        int int56 = lista41.ultimo;
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        ds.Lista lista59 = new ds.Lista();
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        java.lang.Object[] objArray66 = new java.lang.Object[] { 'a', objArray62, 100.0d, (-1), 0.0d };
        lista59.item = objArray66;
        lista57.item = objArray66;
        lista57.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray71 = lista57.item;
        lista41.item = objArray71;
        java.lang.Object[] objArray73 = lista41.item;
        java.lang.Object[] objArray74 = lista41.item;
        ds.Lista lista75 = new ds.Lista();
        java.lang.Object[] objArray76 = lista75.item;
        ds.Lista lista77 = new ds.Lista();
        ds.Lista lista79 = new ds.Lista();
        java.lang.Object[] objArray80 = lista79.item;
        java.lang.Object[] objArray84 = new java.lang.Object[] { 'a', objArray80, 100.0d, (-1), 0.0d };
        lista77.item = objArray84;
        lista75.item = objArray84;
        lista75.insere((java.lang.Object) (byte) -1);
        ds.Lista lista89 = new ds.Lista();
        java.lang.Object[] objArray90 = lista89.item;
        lista75.item = objArray90;
        java.lang.Object[] objArray92 = lista75.item;
        lista41.item = objArray92;
        lista7.item = objArray92;
        lista0.item = objArray92;
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray92);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        lista0.pos = '#';
        lista0.ultimo = (byte) -1;
        int int15 = lista0.ultimo;
        lista0.ultimo = (short) 10;
        boolean boolean18 = lista0.vazia();
        java.lang.Object[] objArray19 = lista0.item;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
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
        java.lang.Object[] objArray86 = lista15.item;
        int int87 = lista15.pos;
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
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
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
        java.lang.Object[] objArray53 = lista44.item;
        lista44.imprime();
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
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
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
        lista0.pos = 97;
        lista0.pos = (byte) -1;
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
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
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
        boolean boolean37 = lista0.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
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
        lista0.pos = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        int int10 = lista0.primeiro;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
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
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        ds.Lista lista35 = new ds.Lista();
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 'a', objArray38, 100.0d, (-1), 0.0d };
        lista35.item = objArray42;
        lista33.item = objArray42;
        lista33.insere((java.lang.Object) (byte) -1);
        int int47 = lista33.primeiro;
        lista33.primeiro = 'a';
        int int50 = lista33.pos;
        int int51 = lista33.ultimo;
        int int52 = lista33.pos;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        java.lang.Object[] objArray60 = new java.lang.Object[] { 'a', objArray56, 100.0d, (-1), 0.0d };
        lista53.item = objArray60;
        int int62 = lista53.pos;
        int int63 = lista53.ultimo;
        java.lang.Object[] objArray64 = lista53.item;
        lista33.insere((java.lang.Object) lista53);
        lista0.insere((java.lang.Object) lista53);
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray68 = lista67.item;
        int int69 = lista67.pos;
        lista67.insere((java.lang.Object) 0.0d);
        lista67.insere((java.lang.Object) 0);
        lista67.pos = ' ';
        lista67.ultimo = (short) 1;
        java.lang.Class<?> wildcardClass78 = lista67.getClass();
        lista53.insere((java.lang.Object) wildcardClass78);
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
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        int int11 = lista0.pos;
        lista0.ultimo = 0;
        lista0.primeiro = (byte) 100;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
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
        lista0.pos = (short) 0;
        lista0.ultimo = (short) 0;
        lista0.ultimo = (short) 100;
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
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
        int int14 = lista0.ultimo;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.pos = (byte) 100;
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
        boolean boolean59 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean59);
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
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
        lista0.primeiro = (byte) 0;
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
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        int int14 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
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
        lista0.pos = (short) 1;
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
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
        int int46 = lista0.primeiro;
        java.lang.Class<?> wildcardClass47 = lista0.getClass();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
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
        lista0.pos = (short) 100;
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
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
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
        boolean boolean97 = lista44.vazia();
        lista44.imprime();
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
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.primeiro;
        lista0.pos = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        int int24 = lista15.pos;
        lista15.ultimo = 0;
        int int27 = lista15.pos;
        int int28 = lista15.pos;
        ds.Lista lista29 = new ds.Lista();
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        java.lang.Object[] objArray36 = new java.lang.Object[] { 'a', objArray32, 100.0d, (-1), 0.0d };
        lista29.item = objArray36;
        int int38 = lista29.pos;
        lista29.ultimo = 0;
        int int41 = lista29.pos;
        lista29.imprime();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 'a', objArray48, 100.0d, (-1), 0.0d };
        lista45.item = objArray52;
        lista43.item = objArray52;
        java.lang.Object[] objArray55 = lista43.item;
        lista43.pos = (byte) 0;
        int int58 = lista43.pos;
        ds.Lista lista59 = new ds.Lista();
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        ds.Lista lista62 = new ds.Lista();
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        java.lang.Object[] objArray69 = new java.lang.Object[] { 'a', objArray65, 100.0d, (-1), 0.0d };
        lista62.item = objArray69;
        lista60.item = objArray69;
        lista59.item = objArray69;
        lista43.insere((java.lang.Object) lista59);
        lista59.pos = (byte) 1;
        lista59.pos = (short) 10;
        lista59.pos = 10;
        lista59.primeiro = '4';
        int int82 = lista59.primeiro;
        java.lang.Object[] objArray83 = lista59.item;
        java.lang.Object[] objArray84 = lista59.item;
        lista29.item = objArray84;
        lista15.item = objArray84;
        lista0.item = objArray84;
        int int88 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 52 + "'", int82 == 52);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
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
        lista0.pos = ' ';
        lista0.primeiro = 52;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
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
        lista0.ultimo = (-1);
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
        lista0.item = objArray44;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
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
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
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
        java.lang.Object[] objArray48 = lista33.item;
        lista15.item = objArray48;
        lista0.item = objArray48;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.ultimo;
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
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
        int int15 = lista0.primeiro;
        int int16 = lista0.pos;
        int int17 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
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
        int int32 = lista0.primeiro;
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
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
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
        int int53 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
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
        java.lang.Object[] objArray41 = lista16.item;
        java.lang.Class<?> wildcardClass42 = objArray41.getClass();
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
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.ultimo = (short) 100;
        lista0.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
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
        int int44 = lista0.pos;
        lista0.primeiro = 97;
        int int47 = lista0.pos;
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
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
        int int32 = lista0.ultimo;
        lista0.ultimo = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
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
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
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
        java.lang.Class<?> wildcardClass20 = objArray19.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
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
        int int34 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
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
        lista0.primeiro = (byte) 10;
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
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
        lista16.pos = '4';
        lista16.imprime();
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
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        int int7 = lista0.pos;
        lista0.primeiro = '4';
        lista0.pos = 97;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
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
        lista0.pos = 0;
        ds.Lista lista26 = new ds.Lista();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', objArray29, 100.0d, (-1), 0.0d };
        lista26.item = objArray33;
        int int35 = lista26.pos;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', objArray41, 100.0d, (-1), 0.0d };
        lista38.item = objArray45;
        lista36.item = objArray45;
        lista36.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray50 = lista36.item;
        lista26.item = objArray50;
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 'a', objArray57, 100.0d, (-1), 0.0d };
        lista54.item = objArray61;
        lista52.item = objArray61;
        lista52.insere((java.lang.Object) (byte) -1);
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        lista52.item = objArray67;
        lista26.item = objArray67;
        ds.Lista lista70 = new ds.Lista();
        java.lang.Object[] objArray71 = lista70.item;
        int int72 = lista70.pos;
        java.lang.Object[] objArray73 = lista70.item;
        lista26.insere((java.lang.Object) lista70);
        lista26.primeiro = 0;
        boolean boolean77 = lista26.vazia();
        int int78 = lista26.pos;
        lista0.insere((java.lang.Object) int78);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, -1, 100.0, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, -1, 100.0, -1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.primeiro;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = 100;
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
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
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
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
        lista0.imprime();
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
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
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
        int int50 = lista44.pos;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
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
        int int60 = lista0.pos;
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
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
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
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
        int int71 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass73 = lista0.getClass();
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
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
        lista16.ultimo = ' ';
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
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 'a', objArray16, 100.0d, (-1), 0.0d };
        lista13.item = objArray20;
        int int22 = lista13.pos;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 'a', objArray28, 100.0d, (-1), 0.0d };
        lista25.item = objArray32;
        lista23.item = objArray32;
        lista23.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray37 = lista23.item;
        lista13.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        ds.Lista lista41 = new ds.Lista();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        java.lang.Object[] objArray48 = new java.lang.Object[] { 'a', objArray44, 100.0d, (-1), 0.0d };
        lista41.item = objArray48;
        lista39.item = objArray48;
        lista39.insere((java.lang.Object) (byte) -1);
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        lista39.item = objArray54;
        lista13.item = objArray54;
        lista13.ultimo = 10;
        int int59 = lista13.primeiro;
        lista0.insere((java.lang.Object) lista13);
        boolean boolean61 = lista13.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        lista0.primeiro = '#';
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
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
        ds.Lista lista40 = new ds.Lista();
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        java.lang.Object[] objArray47 = new java.lang.Object[] { 'a', objArray43, 100.0d, (-1), 0.0d };
        lista40.item = objArray47;
        int int49 = lista40.ultimo;
        boolean boolean50 = lista40.vazia();
        java.lang.Object[] objArray51 = lista40.item;
        int int52 = lista40.ultimo;
        ds.Lista lista53 = new ds.Lista();
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        java.lang.Object[] objArray60 = new java.lang.Object[] { 'a', objArray56, 100.0d, (-1), 0.0d };
        lista53.item = objArray60;
        int int62 = lista53.ultimo;
        boolean boolean63 = lista53.vazia();
        java.lang.Object[] objArray64 = lista53.item;
        lista40.item = objArray64;
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        int int68 = lista66.pos;
        java.lang.Object[] objArray69 = lista66.item;
        int int70 = lista66.ultimo;
        ds.Lista lista71 = new ds.Lista();
        lista71.pos = 0;
        boolean boolean74 = lista71.vazia();
        lista71.ultimo = ' ';
        lista71.pos = (byte) -1;
        lista66.insere((java.lang.Object) (byte) -1);
        lista40.insere((java.lang.Object) lista66);
        lista0.insere((java.lang.Object) lista40);
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
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
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
        lista16.primeiro = 2;
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
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
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
        lista0.ultimo = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
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
        int int56 = lista0.ultimo;
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
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
        lista0.ultimo = (-1);
        int int20 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
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
        int int53 = lista16.ultimo;
        boolean boolean54 = lista16.vazia();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
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
        lista0.pos = (short) 100;
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
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
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
        int int38 = lista16.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
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
        int int28 = lista0.primeiro;
        java.lang.Class<?> wildcardClass29 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
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
        ds.Lista lista16 = new ds.Lista();
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', objArray19, 100.0d, (-1), 0.0d };
        lista16.item = objArray23;
        lista16.primeiro = ' ';
        lista16.pos = '#';
        lista0.insere((java.lang.Object) '#');
        lista0.ultimo = (byte) 1;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, #, 100.0, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, #, 100.0, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1, #, 100.0, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1, #, 100.0, -1, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
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
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
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
        boolean boolean51 = lista16.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
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
        int int23 = lista0.ultimo;
        lista0.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
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
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', objArray23, 100.0d, (-1), 0.0d };
        lista20.item = objArray27;
        lista18.item = objArray27;
        java.lang.Object[] objArray30 = lista18.item;
        lista18.pos = (byte) 0;
        int int33 = lista18.pos;
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
        lista18.insere((java.lang.Object) lista34);
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        ds.Lista lista51 = new ds.Lista();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 'a', objArray54, 100.0d, (-1), 0.0d };
        lista51.item = objArray58;
        lista49.item = objArray58;
        int int61 = lista49.primeiro;
        lista49.insere((java.lang.Object) (-1L));
        lista49.primeiro = (byte) 10;
        lista49.primeiro = 'a';
        java.lang.Object[] objArray68 = lista49.item;
        lista18.item = objArray68;
        lista0.item = objArray68;
        int int71 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
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
        lista0.imprime();
        int int62 = lista0.ultimo;
        java.lang.Object[] objArray63 = lista0.item;
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
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
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 'a', objArray40, 100.0d, (-1), 0.0d };
        lista37.item = objArray44;
        lista35.item = objArray44;
        lista34.item = objArray44;
        int int48 = lista34.ultimo;
        lista34.ultimo = 0;
        int int51 = lista34.primeiro;
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        ds.Lista lista54 = new ds.Lista();
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 'a', objArray57, 100.0d, (-1), 0.0d };
        lista54.item = objArray61;
        lista52.item = objArray61;
        int int64 = lista52.ultimo;
        lista52.ultimo = 'a';
        lista52.primeiro = 97;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        lista52.item = objArray70;
        lista34.item = objArray70;
        int int73 = lista34.pos;
        ds.Lista lista74 = new ds.Lista();
        java.lang.Object[] objArray75 = lista74.item;
        ds.Lista lista76 = new ds.Lista();
        ds.Lista lista78 = new ds.Lista();
        java.lang.Object[] objArray79 = lista78.item;
        java.lang.Object[] objArray83 = new java.lang.Object[] { 'a', objArray79, 100.0d, (-1), 0.0d };
        lista76.item = objArray83;
        lista74.item = objArray83;
        lista74.insere((java.lang.Object) (byte) -1);
        lista34.insere((java.lang.Object) lista74);
        lista34.imprime();
        lista0.insere((java.lang.Object) lista34);
        lista0.pos = '4';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
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
        lista0.pos = '#';
        lista0.ultimo = (byte) 0;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
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
        lista16.primeiro = 'a';
        int int36 = lista16.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Object obj13 = null;
        lista0.insere(obj13);
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
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
        ds.Lista lista39 = new ds.Lista();
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        ds.Lista lista42 = new ds.Lista();
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        java.lang.Object[] objArray49 = new java.lang.Object[] { 'a', objArray45, 100.0d, (-1), 0.0d };
        lista42.item = objArray49;
        lista40.item = objArray49;
        lista39.item = objArray49;
        int int53 = lista39.ultimo;
        lista39.ultimo = 0;
        int int56 = lista39.primeiro;
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        ds.Lista lista59 = new ds.Lista();
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        java.lang.Object[] objArray66 = new java.lang.Object[] { 'a', objArray62, 100.0d, (-1), 0.0d };
        lista59.item = objArray66;
        lista57.item = objArray66;
        int int69 = lista57.ultimo;
        lista57.ultimo = 'a';
        lista57.primeiro = 97;
        ds.Lista lista74 = new ds.Lista();
        java.lang.Object[] objArray75 = lista74.item;
        lista57.item = objArray75;
        lista39.item = objArray75;
        lista16.item = objArray75;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
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
        java.lang.Object obj23 = null;
        lista0.insere(obj23);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        int int11 = lista0.pos;
        lista0.ultimo = 0;
        lista0.primeiro = (byte) 100;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
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
        lista0.primeiro = 2;
        int int46 = lista0.primeiro;
        int int47 = lista0.pos;
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
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
        lista0.primeiro = 3;
        lista0.ultimo = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        int int12 = lista0.primeiro;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.ultimo;
        java.lang.Object[] objArray17 = lista0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
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
        lista0.primeiro = (byte) 0;
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
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
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
        lista17.pos = (byte) 0;
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
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
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
        lista0.ultimo = (byte) 0;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
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
        int int22 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
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
        int int18 = lista0.pos;
        java.lang.Object[] objArray19 = lista0.item;
        int int20 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.primeiro;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
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
        int int23 = lista0.ultimo;
        ds.Lista lista24 = new ds.Lista();
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', objArray27, 100.0d, (-1), 0.0d };
        lista24.item = objArray31;
        int int33 = lista24.pos;
        lista24.ultimo = 0;
        java.lang.Object[] objArray36 = lista24.item;
        lista24.pos = ' ';
        lista24.imprime();
        java.lang.Object[] objArray40 = lista24.item;
        int int41 = lista24.ultimo;
        lista0.insere((java.lang.Object) lista24);
        ds.Lista lista43 = new ds.Lista();
        int int44 = lista43.pos;
        lista43.imprime();
        java.lang.Object[] objArray46 = lista43.item;
        boolean boolean47 = lista43.vazia();
        lista43.imprime();
        lista43.imprime();
        lista24.insere((java.lang.Object) lista43);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        lista0.ultimo = 3;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
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
        boolean boolean33 = lista26.vazia();
        int int34 = lista26.ultimo;
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
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
        lista0.primeiro = 1;
        int int62 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
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
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
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
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', objArray23, 100.0d, (-1), 0.0d };
        lista20.item = objArray27;
        lista18.item = objArray27;
        java.lang.Object[] objArray30 = lista18.item;
        lista18.pos = (byte) 0;
        int int33 = lista18.pos;
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
        lista18.insere((java.lang.Object) lista34);
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        ds.Lista lista51 = new ds.Lista();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 'a', objArray54, 100.0d, (-1), 0.0d };
        lista51.item = objArray58;
        lista49.item = objArray58;
        int int61 = lista49.primeiro;
        lista49.insere((java.lang.Object) (-1L));
        lista49.primeiro = (byte) 10;
        lista49.primeiro = 'a';
        java.lang.Object[] objArray68 = lista49.item;
        lista18.item = objArray68;
        lista0.item = objArray68;
        java.lang.Object[] objArray71 = lista0.item;
        lista0.pos = ' ';
        lista0.pos = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (byte) 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
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
        java.lang.Object[] objArray20 = lista19.item;
        int int21 = lista19.pos;
        lista19.insere((java.lang.Object) 0.0d);
        lista19.insere((java.lang.Object) 0);
        lista19.pos = ' ';
        java.lang.Object[] objArray28 = lista19.item;
        lista0.insere((java.lang.Object) lista19);
        lista0.pos = '#';
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
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
        lista0.imprime();
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
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
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
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', objArray22, 100.0d, (-1), 0.0d };
        lista19.item = objArray26;
        int int28 = lista19.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 'a', objArray34, 100.0d, (-1), 0.0d };
        lista31.item = objArray38;
        lista29.item = objArray38;
        lista29.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray43 = lista29.item;
        lista19.item = objArray43;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        java.lang.Object[] objArray54 = new java.lang.Object[] { 'a', objArray50, 100.0d, (-1), 0.0d };
        lista47.item = objArray54;
        lista45.item = objArray54;
        lista45.insere((java.lang.Object) (byte) -1);
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        lista45.item = objArray60;
        lista19.item = objArray60;
        lista19.primeiro = 2;
        int int65 = lista19.primeiro;
        lista0.insere((java.lang.Object) lista19);
        java.lang.Object[] objArray67 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
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
        lista0.ultimo = (-1);
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
        lista0.item = objArray44;
        java.lang.Class<?> wildcardClass47 = objArray44.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
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
        lista0.imprime();
        boolean boolean20 = lista0.vazia();
        int int21 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
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
        boolean boolean22 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        lista24.insere((java.lang.Object) 0.0d);
        lista24.insere((java.lang.Object) 0);
        lista24.pos = ' ';
        lista24.ultimo = (byte) 1;
        java.lang.Class<?> wildcardClass35 = lista24.getClass();
        lista0.insere((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) 1;
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) 0;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
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
        lista16.imprime();
        int int52 = lista16.pos;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        ds.Lista lista13 = new ds.Lista();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 'a', objArray16, 100.0d, (-1), 0.0d };
        lista13.item = objArray20;
        lista11.item = objArray20;
        java.lang.Object[] objArray23 = lista11.item;
        lista11.pos = (byte) 0;
        int int26 = lista11.pos;
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 'a', objArray33, 100.0d, (-1), 0.0d };
        lista30.item = objArray37;
        lista28.item = objArray37;
        lista27.item = objArray37;
        lista11.insere((java.lang.Object) lista27);
        lista27.pos = (byte) 1;
        lista27.pos = (short) 10;
        lista27.pos = 10;
        java.lang.Object[] objArray48 = lista27.item;
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
        lista49.pos = (byte) 10;
        lista49.ultimo = (short) 0;
        java.lang.Object[] objArray86 = lista49.item;
        lista27.item = objArray86;
        lista0.insere((java.lang.Object) lista27);
        boolean boolean89 = lista27.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray48);
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
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
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
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        int int17 = lista15.pos;
        lista15.insere((java.lang.Object) 0.0d);
        int int20 = lista15.ultimo;
        lista15.imprime();
        int int22 = lista15.pos;
        int int23 = lista15.primeiro;
        int int24 = lista15.ultimo;
        java.lang.Object[] objArray25 = lista15.item;
        lista0.item = objArray25;
        lista0.ultimo = (-1);
        lista0.primeiro = 32;
        lista0.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
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
        lista0.imprime();
        int int21 = lista0.pos;
        int int22 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        java.lang.Object[] objArray11 = lista0.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        int int14 = lista12.pos;
        lista12.insere((java.lang.Object) 0.0d);
        lista12.insere((java.lang.Object) 0);
        lista12.pos = ' ';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        ds.Lista lista23 = new ds.Lista();
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        java.lang.Object[] objArray30 = new java.lang.Object[] { 'a', objArray26, 100.0d, (-1), 0.0d };
        lista23.item = objArray30;
        lista21.item = objArray30;
        lista21.insere((java.lang.Object) (byte) -1);
        int int35 = lista21.primeiro;
        java.lang.Object[] objArray36 = lista21.item;
        lista12.insere((java.lang.Object) objArray36);
        lista12.imprime();
        int int39 = lista12.primeiro;
        lista0.insere((java.lang.Object) lista12);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.ultimo = 0;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.imprime();
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
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
        int int40 = lista16.ultimo;
        ds.Lista lista41 = new ds.Lista();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        java.lang.Object[] objArray48 = new java.lang.Object[] { 'a', objArray44, 100.0d, (-1), 0.0d };
        lista41.item = objArray48;
        int int50 = lista41.pos;
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
        lista41.item = objArray65;
        java.lang.Object[] objArray67 = lista41.item;
        lista16.item = objArray67;
        int int69 = lista16.primeiro;
        boolean boolean70 = lista16.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 52 + "'", int69 == 52);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
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
        int int17 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
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
        lista0.primeiro = 32;
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
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
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
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
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0);
        lista0.pos = ' ';
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', objArray18, 100.0d, (-1), 0.0d };
        lista15.item = objArray22;
        lista13.item = objArray22;
        lista12.item = objArray22;
        int int26 = lista12.ultimo;
        lista12.ultimo = 0;
        lista12.insere((java.lang.Object) 0L);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        lista31.insere((java.lang.Object) 0.0d);
        int int36 = lista31.ultimo;
        lista31.imprime();
        int int38 = lista31.pos;
        int int39 = lista31.primeiro;
        int int40 = lista31.ultimo;
        java.lang.Object[] objArray41 = lista31.item;
        lista12.item = objArray41;
        lista0.item = objArray41;
        java.lang.Class<?> wildcardClass44 = objArray41.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
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
        lista44.imprime();
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
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        lista0.primeiro = ' ';
        lista0.pos = '#';
        lista0.ultimo = (byte) -1;
        int int15 = lista0.ultimo;
        lista0.ultimo = (short) 10;
        boolean boolean18 = lista0.vazia();
        lista0.primeiro = 'a';
        int int21 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
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
        int int33 = lista0.primeiro;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.insere((java.lang.Object) 0.0d);
        int int5 = lista0.ultimo;
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
        lista22.pos = 10;
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 'a', objArray48, 100.0d, (-1), 0.0d };
        lista45.item = objArray52;
        lista43.item = objArray52;
        java.lang.Object[] objArray55 = lista43.item;
        lista43.pos = (byte) 0;
        int int58 = lista43.pos;
        ds.Lista lista59 = new ds.Lista();
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        ds.Lista lista62 = new ds.Lista();
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        java.lang.Object[] objArray69 = new java.lang.Object[] { 'a', objArray65, 100.0d, (-1), 0.0d };
        lista62.item = objArray69;
        lista60.item = objArray69;
        lista59.item = objArray69;
        lista43.insere((java.lang.Object) lista59);
        lista59.pos = (byte) 1;
        lista59.pos = (short) 10;
        lista59.pos = 10;
        java.lang.Object[] objArray80 = lista59.item;
        lista22.item = objArray80;
        lista0.item = objArray80;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
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
        java.lang.Object[] objArray39 = lista16.item;
        java.lang.Class<?> wildcardClass40 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
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
        boolean boolean22 = lista0.vazia();
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
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
        lista22.ultimo = 52;
        java.lang.Class<?> wildcardClass28 = lista22.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', objArray3, 100.0d, (-1), 0.0d };
        lista0.item = objArray7;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
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
        lista0.ultimo = '#';
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray69 = lista68.item;
        int int70 = lista68.pos;
        lista68.insere((java.lang.Object) 0.0d);
        int int73 = lista68.ultimo;
        lista68.imprime();
        java.lang.Object[] objArray75 = lista68.item;
        lista0.item = objArray75;
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(objArray75);
    }
}

