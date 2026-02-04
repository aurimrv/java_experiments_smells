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
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = (short) 1;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        tabela0.n = 'a';
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela12.registros = itemArray13;
        tabela11.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = (short) 10;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        tabela7.n = (-1);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        int int17 = tabela7.n;
        int int18 = tabela7.n;
        ds.Item[] itemArray19 = null;
        tabela7.registros = itemArray19;
        int int21 = tabela7.n;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = new ds.Item[] {};
        tabela23.registros = itemArray24;
        tabela22.registros = itemArray24;
        tabela7.registros = itemArray24;
        int int28 = tabela7.n;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        int int31 = tabela29.binaria(item30);
        tabela29.n = (-1);
        ds.Item item34 = null;
        tabela29.insere(item34);
        ds.Item item36 = null;
        tabela29.insere(item36);
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        int int40 = tabela38.binaria(item39);
        ds.Item[] itemArray41 = tabela38.registros;
        tabela29.registros = itemArray41;
        tabela7.registros = itemArray41;
        tabela0.registros = itemArray41;
        tabela0.n = (short) 0;
        ds.Item[] itemArray47 = tabela0.registros;
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = tabela0.pesquisa(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (byte) 0;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        tabela8.n = (-1);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        tabela15.n = (-1);
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        tabela15.registros = itemArray23;
        tabela8.registros = itemArray23;
        tabela0.registros = itemArray23;
        ds.Item item27 = null;
        tabela0.insere(item27);
        tabela0.n = 10;
        ds.Item[] itemArray31 = tabela0.registros;
        java.lang.Class<?> wildcardClass32 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        tabela8.n = (-1);
        ds.Item item13 = null;
        tabela8.insere(item13);
        tabela8.n = (short) 100;
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela8.registros = itemArray18;
        tabela0.registros = itemArray18;
        ds.Item[] itemArray21 = tabela0.registros;
        tabela0.n = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (byte) 0;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        tabela13.n = (-1);
        ds.Item[] itemArray18 = tabela13.registros;
        tabela0.registros = itemArray18;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        tabela0.n = (short) 1;
        tabela0.n = 'a';
        ds.Item[] itemArray14 = tabela0.registros;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = (short) 1;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        tabela6.n = (-1);
        ds.Item item11 = null;
        tabela6.insere(item11);
        ds.Item item13 = null;
        tabela6.insere(item13);
        ds.Item[] itemArray15 = tabela6.registros;
        ds.Item item16 = null;
        tabela6.insere(item16);
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        tabela18.n = (-1);
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        int int25 = tabela23.binaria(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        tabela18.registros = itemArray26;
        tabela18.n = (short) 1;
        int int30 = tabela18.n;
        ds.Item item31 = null;
        tabela18.insere(item31);
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela33.registros = itemArray34;
        ds.Item[] itemArray36 = tabela33.registros;
        ds.Item item37 = null;
        int int38 = tabela33.binaria(item37);
        tabela33.n = (byte) 0;
        ds.Item[] itemArray41 = tabela33.registros;
        tabela18.registros = itemArray41;
        tabela6.registros = itemArray41;
        tabela0.registros = itemArray41;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item[] itemArray13 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = new ds.Item[] {};
        tabela0.registros = itemArray1;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (short) -1;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela0.registros = itemArray8;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        tabela7.n = (-1);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray18 = tabela0.registros;
        int int19 = tabela0.n;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 'a';
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        int int25 = tabela23.binaria(item24);
        tabela23.n = (-1);
        ds.Item item28 = null;
        tabela23.insere(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        tabela30.n = (-1);
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        int int37 = tabela35.binaria(item36);
        ds.Item[] itemArray38 = tabela35.registros;
        tabela30.registros = itemArray38;
        tabela23.registros = itemArray38;
        tabela20.registros = itemArray38;
        tabela0.registros = itemArray38;
        java.lang.Class<?> wildcardClass43 = itemArray38.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        tabela6.n = (-1);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela6.registros = itemArray14;
        ds.Item[] itemArray16 = tabela6.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Item item20 = null;
        tabela0.insere(item20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        ds.Item[] itemArray2 = new ds.Item[] {};
        tabela1.registros = itemArray2;
        tabela0.registros = itemArray2;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item item9 = null;
        tabela6.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela12.registros = itemArray13;
        tabela11.registros = itemArray13;
        ds.Item[] itemArray16 = tabela11.registros;
        tabela6.registros = itemArray16;
        tabela0.registros = itemArray16;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela20.registros = itemArray21;
        tabela19.registros = itemArray21;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        tabela24.n = (-1);
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        int int31 = tabela29.binaria(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        tabela24.registros = itemArray32;
        ds.Item[] itemArray34 = tabela24.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item[] itemArray36 = new ds.Item[] {};
        tabela35.registros = itemArray36;
        tabela24.registros = itemArray36;
        tabela19.registros = itemArray36;
        tabela0.registros = itemArray36;
        tabela0.n = (byte) 1;
        int int43 = tabela0.n;
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.pesquisa(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = (short) 1;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela16.registros = itemArray17;
        tabela15.registros = itemArray17;
        ds.Item[] itemArray20 = tabela15.registros;
        tabela10.registros = itemArray20;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        tabela22.n = (-1);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela22.registros = itemArray30;
        int int32 = tabela22.n;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela33.registros = itemArray34;
        tabela22.registros = itemArray34;
        tabela10.registros = itemArray34;
        ds.Item[] itemArray38 = tabela10.registros;
        tabela0.registros = itemArray38;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 'a';
        ds.Item[] itemArray3 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        tabela7.n = (-1);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item item18 = null;
        tabela0.insere(item18);
        int int20 = tabela0.n;
        ds.Item item21 = null;
        tabela0.insere(item21);
        tabela0.n = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        ds.Item[] itemArray2 = new ds.Item[] {};
        tabela1.registros = itemArray2;
        tabela0.registros = itemArray2;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = null;
        tabela0.registros = itemArray6;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = (short) 1;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = new ds.Item[] {};
        tabela0.registros = itemArray1;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = (byte) 0;
        int int10 = tabela0.n;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = 35;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela18.registros = itemArray19;
        tabela17.registros = itemArray19;
        ds.Item[] itemArray22 = tabela17.registros;
        tabela12.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int25 = tabela0.n;
        tabela0.n = (byte) 10;
        tabela0.n = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela6.registros = itemArray7;
        tabela5.registros = itemArray7;
        ds.Item[] itemArray10 = tabela5.registros;
        tabela0.registros = itemArray10;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        tabela12.n = (-1);
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        int int19 = tabela17.binaria(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        tabela12.registros = itemArray20;
        int int22 = tabela12.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = new ds.Item[] {};
        tabela23.registros = itemArray24;
        tabela12.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Item[] itemArray28 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = (short) 100;
        int int33 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        tabela8.n = (-1);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        tabela15.n = (-1);
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        tabela15.registros = itemArray23;
        tabela8.registros = itemArray23;
        tabela0.registros = itemArray23;
        ds.Item item27 = null;
        int int28 = tabela0.binaria(item27);
        ds.Item[] itemArray29 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = new ds.Item[] {};
        tabela0.registros = itemArray1;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (short) -1;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        tabela7.n = (-1);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item item18 = null;
        tabela0.insere(item18);
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        tabela22.n = (byte) 0;
        ds.Item[] itemArray28 = tabela22.registros;
        ds.Item item29 = null;
        int int30 = tabela22.binaria(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        tabela31.n = (-1);
        ds.Item item36 = null;
        tabela31.insere(item36);
        ds.Item item38 = null;
        tabela31.insere(item38);
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        int int42 = tabela40.binaria(item41);
        ds.Item[] itemArray43 = tabela40.registros;
        tabela31.registros = itemArray43;
        tabela22.registros = itemArray43;
        tabela0.registros = itemArray43;
        java.lang.Class<?> wildcardClass47 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        tabela5.n = (-1);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        tabela5.registros = itemArray13;
        int int15 = tabela5.n;
        int int16 = tabela5.n;
        ds.Item[] itemArray17 = null;
        tabela5.registros = itemArray17;
        int int19 = tabela5.n;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela21.registros = itemArray22;
        tabela20.registros = itemArray22;
        tabela5.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item item30 = null;
        tabela27.insere(item30);
        ds.Item[] itemArray32 = tabela27.registros;
        tabela0.registros = itemArray32;
        tabela0.n = 0;
        ds.Item[] itemArray36 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        ds.Item[] itemArray12 = tabela0.registros;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela18.registros = itemArray19;
        tabela17.registros = itemArray19;
        ds.Item[] itemArray22 = tabela17.registros;
        tabela12.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int25 = tabela0.n;
        ds.Item[] itemArray26 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        tabela7.n = (-1);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item item18 = null;
        tabela0.insere(item18);
        int int20 = tabela0.n;
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item[] itemArray22 = tabela0.registros;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.pesquisa(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = (-1);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        tabela7.n = (-1);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item item18 = null;
        tabela0.insere(item18);
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        tabela22.n = (byte) 0;
        ds.Item[] itemArray28 = tabela22.registros;
        ds.Item item29 = null;
        int int30 = tabela22.binaria(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        tabela31.n = (-1);
        ds.Item item36 = null;
        tabela31.insere(item36);
        ds.Item item38 = null;
        tabela31.insere(item38);
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        int int42 = tabela40.binaria(item41);
        ds.Item[] itemArray43 = tabela40.registros;
        tabela31.registros = itemArray43;
        tabela22.registros = itemArray43;
        tabela0.registros = itemArray43;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        tabela47.n = (-1);
        ds.Tabela tabela52 = new ds.Tabela();
        ds.Item item53 = null;
        int int54 = tabela52.binaria(item53);
        ds.Item[] itemArray55 = tabela52.registros;
        tabela47.registros = itemArray55;
        int int57 = tabela47.n;
        int int58 = tabela47.n;
        ds.Item[] itemArray59 = null;
        tabela47.registros = itemArray59;
        int int61 = tabela47.n;
        ds.Tabela tabela62 = new ds.Tabela();
        ds.Tabela tabela63 = new ds.Tabela();
        ds.Item[] itemArray64 = new ds.Item[] {};
        tabela63.registros = itemArray64;
        tabela62.registros = itemArray64;
        tabela47.registros = itemArray64;
        ds.Item[] itemArray68 = tabela47.registros;
        tabela0.registros = itemArray68;
        tabela0.n = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray68);
    }
}

