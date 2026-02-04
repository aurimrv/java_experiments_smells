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
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        int int11 = tabela8.binaria(item10);
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        ds.Item item16 = null;
        tabela14.insere(item16);
        tabela14.n = 10;
        int int20 = tabela14.n;
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = 0;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        tabela21.registros = itemArray25;
        tabela14.registros = itemArray25;
        tabela8.registros = itemArray25;
        tabela0.registros = itemArray25;
        int int30 = tabela0.n;
        ds.Item[] itemArray31 = tabela0.registros;
        int int32 = tabela0.n;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item[] itemArray34 = tabela33.registros;
        ds.Item item35 = null;
        tabela33.insere(item35);
        tabela33.n = 0;
        tabela33.n = 100;
        ds.Item[] itemArray41 = tabela33.registros;
        ds.Item[] itemArray42 = tabela33.registros;
        tabela0.registros = itemArray42;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        ds.Item[] itemArray9 = tabela7.registros;
        ds.Item[] itemArray10 = tabela7.registros;
        tabela0.registros = itemArray10;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela12.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela12.binaria(item18);
        ds.Item[] itemArray20 = tabela12.registros;
        int int21 = tabela12.n;
        ds.Item item22 = null;
        tabela12.insere(item22);
        ds.Item[] itemArray24 = tabela12.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item[] itemArray26 = tabela25.registros;
        ds.Item item27 = null;
        tabela25.insere(item27);
        int int29 = tabela25.n;
        ds.Item item30 = null;
        tabela25.insere(item30);
        ds.Item[] itemArray32 = tabela25.registros;
        tabela12.registros = itemArray32;
        tabela0.registros = itemArray32;
        java.lang.Class<?> wildcardClass35 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item item6 = null;
        tabela4.insere(item6);
        tabela4.n = 0;
        tabela4.n = 100;
        ds.Item[] itemArray12 = tabela4.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item item16 = null;
        int int17 = tabela0.binaria(item16);
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.pesquisa(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item item6 = null;
        tabela4.insere(item6);
        tabela4.n = 0;
        tabela4.n = 100;
        ds.Item[] itemArray12 = tabela4.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item item16 = null;
        int int17 = tabela0.binaria(item16);
        ds.Item[] itemArray18 = tabela0.registros;
        int int19 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        tabela0.n = 0;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        int int12 = tabela11.n;
        ds.Item item13 = null;
        int int14 = tabela11.binaria(item13);
        ds.Item[] itemArray15 = tabela11.registros;
        tabela0.registros = itemArray15;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        tabela0.n = 100;
        int int13 = tabela0.n;
        int int14 = tabela0.n;
        int int15 = tabela0.n;
        int int16 = tabela0.n;
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        tabela9.n = 0;
        ds.Item item15 = null;
        int int16 = tabela9.binaria(item15);
        int int17 = tabela9.n;
        ds.Item[] itemArray18 = tabela9.registros;
        tabela0.registros = itemArray18;
        tabela0.n = (short) 1;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.pesquisa(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = 10;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = 0;
        ds.Item item14 = null;
        tabela11.insere(item14);
        tabela11.n = (short) 0;
        ds.Item[] itemArray18 = tabela11.registros;
        tabela0.registros = itemArray18;
        java.lang.Class<?> wildcardClass20 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        ds.Item[] itemArray9 = tabela7.registros;
        tabela0.registros = itemArray9;
        ds.Item item11 = null;
        tabela0.insere(item11);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = (-1);
        int int12 = tabela0.n;
        tabela0.n = ' ';
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.binaria(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        int int13 = tabela10.binaria(item12);
        ds.Item item14 = null;
        tabela10.insere(item14);
        tabela10.n = (byte) 0;
        ds.Item[] itemArray18 = tabela10.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item[] itemArray20 = tabela19.registros;
        ds.Item item21 = null;
        tabela19.insere(item21);
        ds.Item item23 = null;
        tabela19.insere(item23);
        tabela19.n = (-1);
        ds.Item[] itemArray27 = tabela19.registros;
        tabela10.registros = itemArray27;
        tabela0.registros = itemArray27;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        tabela8.registros = itemArray12;
        ds.Item item14 = null;
        int int15 = tabela8.binaria(item14);
        ds.Item[] itemArray16 = tabela8.registros;
        int int17 = tabela8.n;
        ds.Item item18 = null;
        tabela8.insere(item18);
        ds.Item[] itemArray20 = tabela8.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        ds.Item[] itemArray23 = tabela21.registros;
        tabela8.registros = itemArray23;
        tabela0.registros = itemArray23;
        ds.Item item26 = null;
        tabela0.insere(item26);
        ds.Item[] itemArray28 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        tabela11.insere(item13);
        tabela11.n = 10;
        int int17 = tabela11.n;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela18.registros = itemArray22;
        tabela11.registros = itemArray22;
        ds.Item[] itemArray25 = tabela11.registros;
        ds.Item[] itemArray26 = tabela11.registros;
        tabela0.registros = itemArray26;
        ds.Item item28 = null;
        int int29 = tabela0.binaria(item28);
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 0;
        tabela0.n = (short) 100;
        ds.Item[] itemArray11 = tabela0.registros;
        java.lang.Class<?> wildcardClass12 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 0;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        ds.Item item13 = null;
        tabela0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = 0;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        tabela11.registros = itemArray15;
        ds.Item item17 = null;
        int int18 = tabela11.binaria(item17);
        ds.Item[] itemArray19 = tabela11.registros;
        tabela0.registros = itemArray19;
        ds.Item item21 = null;
        tabela0.insere(item21);
        ds.Item item23 = null;
        tabela0.insere(item23);
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item[] itemArray8 = tabela7.registros;
        ds.Item item9 = null;
        int int10 = tabela7.binaria(item9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Item item18 = null;
        tabela15.insere(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        ds.Item item22 = null;
        int int23 = tabela20.binaria(item22);
        ds.Item item24 = null;
        tabela20.insere(item24);
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        ds.Item item28 = null;
        tabela26.insere(item28);
        tabela26.n = 10;
        int int32 = tabela26.n;
        ds.Tabela tabela33 = new ds.Tabela();
        tabela33.n = 0;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item[] itemArray37 = tabela36.registros;
        tabela33.registros = itemArray37;
        tabela26.registros = itemArray37;
        tabela20.registros = itemArray37;
        tabela15.registros = itemArray37;
        tabela0.registros = itemArray37;
        ds.Item item43 = null;
        tabela0.insere(item43);
        int int45 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item item7 = null;
        tabela5.insere(item7);
        tabela5.n = 0;
        int int11 = tabela5.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        ds.Item item14 = null;
        int int15 = tabela12.binaria(item14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        tabela12.registros = itemArray16;
        tabela5.registros = itemArray16;
        ds.Item[] itemArray19 = tabela5.registros;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item[] itemArray22 = tabela0.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        tabela23.insere(item25);
        tabela23.n = 0;
        int int29 = tabela23.n;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        int int33 = tabela30.binaria(item32);
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela30.registros = itemArray34;
        tabela23.registros = itemArray34;
        tabela23.n = '4';
        ds.Tabela tabela39 = new ds.Tabela();
        tabela39.n = 0;
        ds.Item item42 = null;
        tabela39.insere(item42);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela39.registros = itemArray45;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item[] itemArray48 = tabela47.registros;
        ds.Item item49 = null;
        int int50 = tabela47.binaria(item49);
        ds.Item item51 = null;
        tabela47.insere(item51);
        ds.Tabela tabela53 = new ds.Tabela();
        ds.Item[] itemArray54 = tabela53.registros;
        ds.Item item55 = null;
        tabela53.insere(item55);
        tabela53.n = 10;
        int int59 = tabela53.n;
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = 0;
        ds.Tabela tabela63 = new ds.Tabela();
        ds.Item[] itemArray64 = tabela63.registros;
        tabela60.registros = itemArray64;
        tabela53.registros = itemArray64;
        tabela47.registros = itemArray64;
        tabela39.registros = itemArray64;
        ds.Item[] itemArray69 = tabela39.registros;
        tabela23.registros = itemArray69;
        tabela0.registros = itemArray69;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = 0;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        tabela11.registros = itemArray15;
        ds.Item item17 = null;
        int int18 = tabela11.binaria(item17);
        ds.Item[] itemArray19 = tabela11.registros;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray21 = tabela0.registros;
        int int22 = tabela0.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        tabela23.insere(item25);
        tabela23.n = 10;
        int int29 = tabela23.n;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item[] itemArray34 = tabela33.registros;
        tabela30.registros = itemArray34;
        tabela23.registros = itemArray34;
        tabela0.registros = itemArray34;
        ds.Item[] itemArray38 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        ds.Item[] itemArray9 = tabela7.registros;
        ds.Item[] itemArray10 = tabela7.registros;
        tabela0.registros = itemArray10;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela12.registros = itemArray18;
        tabela0.registros = itemArray18;
        tabela0.n = (short) -1;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.binaria(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 0;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        int int13 = tabela10.binaria(item12);
        ds.Item item14 = null;
        tabela10.insere(item14);
        tabela10.n = (byte) 0;
        ds.Item[] itemArray18 = tabela10.registros;
        tabela10.n = (byte) 0;
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = 0;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        tabela21.registros = itemArray25;
        ds.Item item27 = null;
        int int28 = tabela21.binaria(item27);
        ds.Item[] itemArray29 = tabela21.registros;
        tabela10.registros = itemArray29;
        ds.Item[] itemArray31 = tabela10.registros;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item[] itemArray33 = tabela32.registros;
        ds.Item item34 = null;
        int int35 = tabela32.binaria(item34);
        int int36 = tabela32.n;
        tabela32.n = (short) -1;
        ds.Item item39 = null;
        tabela32.insere(item39);
        ds.Item[] itemArray41 = tabela32.registros;
        tabela10.registros = itemArray41;
        tabela0.registros = itemArray41;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item[] itemArray45 = tabela44.registros;
        ds.Item item46 = null;
        int int47 = tabela44.binaria(item46);
        ds.Item item48 = null;
        tabela44.insere(item48);
        tabela44.n = (byte) 0;
        ds.Item[] itemArray52 = tabela44.registros;
        tabela44.n = (byte) 0;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = 0;
        ds.Tabela tabela58 = new ds.Tabela();
        ds.Item[] itemArray59 = tabela58.registros;
        tabela55.registros = itemArray59;
        ds.Item item61 = null;
        int int62 = tabela55.binaria(item61);
        ds.Item[] itemArray63 = tabela55.registros;
        tabela44.registros = itemArray63;
        ds.Item[] itemArray65 = tabela44.registros;
        ds.Tabela tabela66 = new ds.Tabela();
        ds.Item[] itemArray67 = tabela66.registros;
        ds.Item item68 = null;
        int int69 = tabela66.binaria(item68);
        int int70 = tabela66.n;
        tabela66.n = (short) -1;
        ds.Item item73 = null;
        tabela66.insere(item73);
        ds.Item[] itemArray75 = tabela66.registros;
        tabela44.registros = itemArray75;
        ds.Item[] itemArray77 = tabela44.registros;
        tabela0.registros = itemArray77;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        tabela0.n = (byte) 100;
        tabela0.n = (short) -1;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        tabela11.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela11.registros = itemArray16;
        tabela0.registros = itemArray16;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.binaria(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = 0;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        tabela11.registros = itemArray15;
        ds.Item item17 = null;
        int int18 = tabela11.binaria(item17);
        ds.Item[] itemArray19 = tabela11.registros;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray21 = tabela0.registros;
        int int22 = tabela0.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        tabela23.insere(item25);
        tabela23.n = 10;
        int int29 = tabela23.n;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item[] itemArray34 = tabela33.registros;
        tabela30.registros = itemArray34;
        tabela23.registros = itemArray34;
        tabela0.registros = itemArray34;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item[] itemArray39 = tabela38.registros;
        ds.Item item40 = null;
        int int41 = tabela38.binaria(item40);
        ds.Item item42 = null;
        tabela38.insere(item42);
        tabela38.n = (byte) 0;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item[] itemArray47 = tabela46.registros;
        ds.Item item48 = null;
        tabela46.insere(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item[] itemArray51 = tabela50.registros;
        tabela46.registros = itemArray51;
        ds.Item[] itemArray53 = null;
        tabela46.registros = itemArray53;
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item[] itemArray56 = tabela55.registros;
        ds.Item item57 = null;
        tabela55.insere(item57);
        tabela55.n = 10;
        ds.Item[] itemArray61 = tabela55.registros;
        tabela46.registros = itemArray61;
        tabela38.registros = itemArray61;
        tabela0.registros = itemArray61;
        int int65 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }
}

