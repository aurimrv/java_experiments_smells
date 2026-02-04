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
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        tabela7.n = (byte) 100;
        tabela7.n = 1;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela17.registros = itemArray19;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela17.registros = itemArray30;
        tabela7.registros = itemArray30;
        tabela0.registros = itemArray30;
        ds.Item[] itemArray34 = tabela0.registros;
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.binaria(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        tabela0.n = 0;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = (short) 10;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        ds.Item item21 = null;
        tabela18.insere(item21);
        int int23 = tabela18.n;
        ds.Item item24 = null;
        tabela18.insere(item24);
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Item[] itemArray31 = tabela26.registros;
        tabela18.registros = itemArray31;
        tabela12.registros = itemArray31;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) -1;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int29 = tabela0.n;
        int int30 = tabela0.n;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        int int34 = tabela31.n;
        ds.Item[] itemArray35 = tabela31.registros;
        ds.Item[] itemArray36 = tabela31.registros;
        int int37 = tabela31.n;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        tabela38.insere(item39);
        ds.Item item41 = null;
        tabela38.insere(item41);
        int int43 = tabela38.n;
        tabela38.n = (byte) 100;
        tabela38.n = 1;
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        tabela48.registros = itemArray50;
        ds.Item[] itemArray52 = tabela48.registros;
        ds.Item[] itemArray53 = tabela48.registros;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        tabela54.registros = itemArray56;
        ds.Item[] itemArray58 = tabela54.registros;
        ds.Item[] itemArray59 = tabela54.registros;
        ds.Item[] itemArray60 = tabela54.registros;
        ds.Item[] itemArray61 = tabela54.registros;
        tabela48.registros = itemArray61;
        tabela38.registros = itemArray61;
        tabela31.registros = itemArray61;
        tabela0.registros = itemArray61;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        tabela7.n = (byte) 100;
        tabela7.n = 1;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela17.registros = itemArray19;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela17.registros = itemArray30;
        tabela7.registros = itemArray30;
        tabela0.registros = itemArray30;
        ds.Item[] itemArray34 = tabela0.registros;
        java.lang.Class<?> wildcardClass35 = itemArray34.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        tabela0.n = (byte) 10;
        tabela0.n = '4';
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        int int14 = tabela0.n;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        tabela0.insere(item18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        ds.Item item13 = null;
        tabela7.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Item item21 = null;
        tabela15.insere(item21);
        int int23 = tabela15.n;
        ds.Item[] itemArray24 = tabela15.registros;
        tabela7.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Item[] itemArray27 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 10;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        java.lang.Class<?> wildcardClass16 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela15.registros = itemArray28;
        tabela0.registros = itemArray28;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item item11 = null;
        tabela8.insere(item11);
        int int13 = tabela8.n;
        ds.Item item14 = null;
        tabela8.insere(item14);
        int int16 = tabela8.n;
        ds.Item[] itemArray17 = tabela8.registros;
        tabela0.registros = itemArray17;
        ds.Item item19 = null;
        tabela0.insere(item19);
        tabela0.n = (short) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        int int13 = tabela7.n;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        int int17 = tabela14.n;
        ds.Item[] itemArray18 = tabela14.registros;
        ds.Item[] itemArray19 = tabela14.registros;
        tabela7.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        ds.Item[] itemArray26 = tabela22.registros;
        ds.Item[] itemArray27 = tabela22.registros;
        tabela22.n = 100;
        tabela22.n = (short) 10;
        ds.Item[] itemArray32 = tabela22.registros;
        ds.Item[] itemArray33 = tabela22.registros;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        ds.Item[] itemArray39 = tabela34.registros;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item item43 = null;
        tabela40.insere(item43);
        int int45 = tabela40.n;
        ds.Item item46 = null;
        tabela40.insere(item46);
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item item49 = null;
        tabela48.insere(item49);
        int int51 = tabela48.n;
        ds.Item[] itemArray52 = tabela48.registros;
        ds.Item[] itemArray53 = tabela48.registros;
        tabela40.registros = itemArray53;
        tabela34.registros = itemArray53;
        tabela22.registros = itemArray53;
        tabela0.registros = itemArray53;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        tabela0.n = '#';
        tabela0.n = 32;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item[] itemArray16 = tabela11.registros;
        tabela11.n = '#';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        tabela11.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray26 = tabela0.registros;
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tabela0.binaria(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        int int16 = tabela14.binaria(item15);
        ds.Item item17 = null;
        tabela14.insere(item17);
        tabela14.n = (byte) 0;
        ds.Item item21 = null;
        int int22 = tabela14.binaria(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela14.registros = itemArray30;
        tabela0.registros = itemArray30;
        java.lang.Class<?> wildcardClass33 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item[] itemArray18 = tabela13.registros;
        ds.Item item19 = null;
        tabela13.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        ds.Item[] itemArray28 = tabela21.registros;
        tabela13.registros = itemArray28;
        tabela0.registros = itemArray28;
        int int31 = tabela0.n;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        tabela32.registros = itemArray34;
        ds.Item[] itemArray36 = tabela32.registros;
        ds.Item[] itemArray37 = tabela32.registros;
        ds.Item[] itemArray38 = tabela32.registros;
        ds.Item[] itemArray39 = tabela32.registros;
        ds.Item[] itemArray40 = tabela32.registros;
        tabela0.registros = itemArray40;
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = tabela0.binaria(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) 1;
        tabela0.n = 4;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        int int18 = tabela13.n;
        ds.Item[] itemArray19 = tabela13.registros;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela0.registros = itemArray20;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = (short) 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        tabela10.n = (byte) 100;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        int int23 = tabela17.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        tabela24.insere(item25);
        int int27 = tabela24.n;
        ds.Item[] itemArray28 = tabela24.registros;
        ds.Item[] itemArray29 = tabela24.registros;
        tabela17.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela7.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item34 = null;
        tabela0.insere(item34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela12.registros = itemArray14;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Item[] itemArray18 = tabela12.registros;
        ds.Item item19 = null;
        int int20 = tabela12.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela21.registros = itemArray32;
        tabela12.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        int int41 = tabela37.n;
        int int42 = tabela37.n;
        int int43 = tabela37.n;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        int int47 = tabela44.n;
        ds.Item[] itemArray48 = tabela44.registros;
        ds.Item[] itemArray49 = tabela44.registros;
        tabela37.registros = itemArray49;
        tabela37.n = (byte) -1;
        ds.Item[] itemArray53 = tabela37.registros;
        tabela0.registros = itemArray53;
        ds.Item[] itemArray55 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        tabela0.n = (byte) -1;
        int int13 = tabela0.n;
        tabela0.n = (short) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        tabela19.n = (byte) 100;
        tabela19.n = 1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela35.registros = itemArray37;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela29.registros = itemArray42;
        tabela19.registros = itemArray42;
        tabela12.registros = itemArray42;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        ds.Item[] itemArray48 = tabela0.registros;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        tabela49.insere(item50);
        ds.Item item52 = null;
        tabela49.insere(item52);
        int int54 = tabela49.n;
        tabela49.n = (short) -1;
        ds.Item[] itemArray57 = tabela49.registros;
        ds.Item[] itemArray58 = tabela49.registros;
        tabela0.registros = itemArray58;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        ds.Item[] itemArray14 = tabela6.registros;
        tabela0.registros = itemArray14;
        int int16 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) 1;
        tabela0.n = 4;
        ds.Item[] itemArray11 = tabela0.registros;
        java.lang.Class<?> wildcardClass12 = itemArray11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 100;
        java.lang.Class<?> wildcardClass5 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        ds.Item item15 = null;
        int int16 = tabela0.binaria(item15);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 100;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        tabela8.n = (byte) 100;
        ds.Item[] itemArray14 = tabela8.registros;
        tabela0.registros = itemArray14;
        java.lang.Class<?> wildcardClass16 = itemArray14.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.binaria(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        tabela10.n = (short) 10;
        ds.Item[] itemArray19 = tabela10.registros;
        tabela0.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        int int26 = tabela21.n;
        ds.Item item27 = null;
        tabela21.insere(item27);
        int int29 = tabela21.n;
        ds.Item item30 = null;
        tabela21.insere(item30);
        int int32 = tabela21.n;
        ds.Item[] itemArray33 = tabela21.registros;
        tabela0.registros = itemArray33;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        tabela35.insere(item36);
        ds.Item item38 = null;
        tabela35.insere(item38);
        int int40 = tabela35.n;
        tabela35.n = (short) -1;
        ds.Item[] itemArray43 = tabela35.registros;
        tabela35.n = 0;
        ds.Item[] itemArray46 = tabela35.registros;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        tabela47.insere(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item item51 = null;
        tabela50.insere(item51);
        ds.Item item53 = null;
        tabela50.insere(item53);
        int int55 = tabela50.n;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item item57 = null;
        tabela56.insere(item57);
        int int59 = tabela56.n;
        ds.Item[] itemArray60 = tabela56.registros;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        tabela61.registros = itemArray63;
        tabela56.registros = itemArray63;
        tabela50.registros = itemArray63;
        tabela50.n = ' ';
        ds.Tabela tabela69 = new ds.Tabela();
        ds.Item item70 = null;
        tabela69.insere(item70);
        ds.Item item72 = null;
        tabela69.insere(item72);
        ds.Item[] itemArray74 = tabela69.registros;
        tabela50.registros = itemArray74;
        tabela47.registros = itemArray74;
        ds.Tabela tabela77 = new ds.Tabela();
        ds.Item item78 = null;
        tabela77.insere(item78);
        ds.Item item80 = null;
        tabela77.insere(item80);
        int int82 = tabela77.n;
        ds.Item item83 = null;
        tabela77.insere(item83);
        int int85 = tabela77.n;
        ds.Item item86 = null;
        tabela77.insere(item86);
        ds.Item item88 = null;
        tabela77.insere(item88);
        ds.Item[] itemArray90 = tabela77.registros;
        tabela47.registros = itemArray90;
        tabela35.registros = itemArray90;
        tabela0.registros = itemArray90;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 3 + "'", int85 == 3);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = (short) 100;
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        tabela7.n = (short) -1;
        ds.Item[] itemArray15 = tabela7.registros;
        tabela0.registros = itemArray15;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        tabela0.n = ' ';
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.binaria(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = 100;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        tabela13.registros = itemArray15;
        ds.Item[] itemArray17 = tabela13.registros;
        ds.Item[] itemArray18 = tabela13.registros;
        ds.Item[] itemArray19 = tabela13.registros;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela7.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        ds.Item item26 = null;
        tabela23.insere(item26);
        int int28 = tabela23.n;
        ds.Item item29 = null;
        tabela23.insere(item29);
        int int31 = tabela23.n;
        ds.Item item32 = null;
        tabela23.insere(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        int int43 = tabela40.n;
        ds.Item[] itemArray44 = tabela40.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela45.registros = itemArray47;
        tabela40.registros = itemArray47;
        tabela34.registros = itemArray47;
        tabela34.n = ' ';
        ds.Item[] itemArray53 = tabela34.registros;
        tabela23.registros = itemArray53;
        tabela0.registros = itemArray53;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        tabela0.n = 3;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Item[] itemArray14 = tabela8.registros;
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        int int17 = tabela0.n;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        tabela18.registros = itemArray20;
        ds.Item[] itemArray22 = tabela18.registros;
        ds.Item[] itemArray23 = tabela18.registros;
        ds.Item[] itemArray24 = tabela18.registros;
        ds.Item[] itemArray25 = tabela18.registros;
        ds.Item[] itemArray26 = tabela18.registros;
        tabela0.registros = itemArray26;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        int int13 = tabela9.n;
        int int14 = tabela9.n;
        int int15 = tabela9.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Item[] itemArray21 = tabela16.registros;
        tabela9.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item item24 = null;
        int int25 = tabela0.binaria(item24);
        tabela0.n = (short) 10;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        tabela0.n = (byte) 100;
        tabela0.n = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        tabela34.n = (byte) 100;
        int int42 = tabela34.n;
        int int43 = tabela34.n;
        ds.Item[] itemArray44 = tabela34.registros;
        tabela0.registros = itemArray44;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        tabela46.insere(item47);
        ds.Item item49 = null;
        tabela46.insere(item49);
        int int51 = tabela46.n;
        ds.Item item52 = null;
        tabela46.insere(item52);
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        int int57 = tabela54.n;
        ds.Item[] itemArray58 = tabela54.registros;
        ds.Item[] itemArray59 = tabela54.registros;
        tabela46.registros = itemArray59;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        tabela61.registros = itemArray63;
        ds.Item[] itemArray65 = tabela61.registros;
        ds.Item[] itemArray66 = tabela61.registros;
        ds.Item[] itemArray67 = tabela61.registros;
        tabela46.registros = itemArray67;
        tabela0.registros = itemArray67;
        ds.Item item70 = null;
        tabela0.insere(item70);
        int int72 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (byte) 100;
        tabela0.n = 1;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        tabela10.registros = itemArray12;
        ds.Item[] itemArray14 = tabela10.registros;
        ds.Item[] itemArray15 = tabela10.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela16.registros = itemArray18;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Item[] itemArray22 = tabela16.registros;
        ds.Item[] itemArray23 = tabela16.registros;
        tabela10.registros = itemArray23;
        tabela0.registros = itemArray23;
        int int26 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela5.registros = itemArray7;
        tabela0.registros = itemArray7;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        tabela10.registros = itemArray12;
        ds.Item[] itemArray14 = tabela10.registros;
        ds.Item[] itemArray15 = tabela10.registros;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela17.registros = itemArray19;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela17.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela17.binaria(item32);
        ds.Item[] itemArray34 = tabela17.registros;
        tabela10.registros = itemArray34;
        tabela0.registros = itemArray34;
        java.lang.Class<?> wildcardClass37 = itemArray34.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 32;
        tabela0.n = (short) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        tabela19.n = (byte) 100;
        tabela19.n = 1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela35.registros = itemArray37;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela29.registros = itemArray42;
        tabela19.registros = itemArray42;
        tabela12.registros = itemArray42;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        tabela0.n = (byte) 10;
        int int50 = tabela0.n;
        ds.Item item51 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        tabela4.n = (short) 100;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Item[] itemArray15 = tabela9.registros;
        tabela4.registros = itemArray15;
        tabela0.registros = itemArray15;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        tabela0.insere(item19);
        tabela0.n = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = '4';
        tabela0.n = (short) 1;
        int int11 = tabela0.n;
        tabela0.n = 'a';
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela6.registros = itemArray8;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Item[] itemArray16 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        int int14 = tabela9.n;
        ds.Item item15 = null;
        tabela9.insere(item15);
        int int17 = tabela9.n;
        ds.Item[] itemArray18 = tabela9.registros;
        int int19 = tabela9.n;
        ds.Item[] itemArray20 = tabela9.registros;
        tabela0.registros = itemArray20;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        int int17 = tabela12.n;
        tabela12.n = (short) -1;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item item23 = null;
        tabela20.insere(item23);
        int int25 = tabela20.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela31.registros = itemArray33;
        tabela26.registros = itemArray33;
        tabela20.registros = itemArray33;
        ds.Item[] itemArray37 = tabela20.registros;
        tabela12.registros = itemArray37;
        tabela0.registros = itemArray37;
        tabela0.n = (byte) -1;
        int int42 = tabela0.n;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        tabela43.insere(item44);
        ds.Item item46 = null;
        tabela43.insere(item46);
        int int48 = tabela43.n;
        tabela43.n = (short) -1;
        ds.Tabela tabela51 = new ds.Tabela();
        ds.Item item52 = null;
        tabela51.insere(item52);
        ds.Item item54 = null;
        tabela51.insere(item54);
        int int56 = tabela51.n;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        tabela57.insere(item58);
        int int60 = tabela57.n;
        ds.Item[] itemArray61 = tabela57.registros;
        ds.Tabela tabela62 = new ds.Tabela();
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        tabela62.registros = itemArray64;
        tabela57.registros = itemArray64;
        tabela51.registros = itemArray64;
        ds.Item[] itemArray68 = tabela51.registros;
        tabela43.registros = itemArray68;
        tabela0.registros = itemArray68;
        ds.Item item71 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int72 = tabela0.binaria(item71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = tabela0.binaria(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        tabela0.n = '#';
        tabela0.n = 32;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item[] itemArray16 = tabela11.registros;
        tabela11.n = '#';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        tabela11.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray26 = tabela0.registros;
        java.lang.Class<?> wildcardClass27 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        java.lang.Class<?> wildcardClass4 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        java.lang.Class<?> wildcardClass11 = itemArray9.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = (short) 10;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = tabela0.registros;
        int int13 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Item[] itemArray15 = tabela7.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        tabela7.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item[] itemArray37 = tabela32.registros;
        tabela32.n = '#';
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        tabela40.registros = itemArray43;
        tabela32.registros = itemArray43;
        tabela0.registros = itemArray43;
        int int47 = tabela0.n;
        ds.Item[] itemArray48 = tabela0.registros;
        ds.Item[] itemArray49 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        tabela0.insere(item18);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        int int4 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        int int15 = tabela0.n;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        int int11 = tabela0.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela12.registros = itemArray14;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Item[] itemArray18 = tabela12.registros;
        ds.Item[] itemArray19 = tabela12.registros;
        ds.Item[] itemArray20 = tabela12.registros;
        ds.Item item21 = null;
        int int22 = tabela12.binaria(item21);
        ds.Item item23 = null;
        int int24 = tabela12.binaria(item23);
        int int25 = tabela12.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item item29 = null;
        tabela26.insere(item29);
        int int31 = tabela26.n;
        tabela26.n = (short) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        int int43 = tabela40.n;
        ds.Item[] itemArray44 = tabela40.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela45.registros = itemArray47;
        tabela40.registros = itemArray47;
        tabela34.registros = itemArray47;
        ds.Item[] itemArray51 = tabela34.registros;
        tabela26.registros = itemArray51;
        tabela12.registros = itemArray51;
        tabela0.registros = itemArray51;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela6.registros = itemArray8;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela16.registros = itemArray18;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Item[] itemArray22 = tabela16.registros;
        int int23 = tabela16.n;
        ds.Item[] itemArray24 = tabela16.registros;
        ds.Item item25 = null;
        int int26 = tabela16.binaria(item25);
        ds.Item[] itemArray27 = tabela16.registros;
        tabela0.registros = itemArray27;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        int int13 = tabela7.n;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        int int17 = tabela14.n;
        ds.Item[] itemArray18 = tabela14.registros;
        ds.Item[] itemArray19 = tabela14.registros;
        tabela7.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray22 = tabela0.registros;
        tabela0.n = 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        int int13 = tabela9.n;
        int int14 = tabela9.n;
        int int15 = tabela9.n;
        tabela9.n = (short) 10;
        int int18 = tabela9.n;
        tabela9.n = 'a';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        int int26 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        tabela29.insere(item30);
        ds.Item item32 = null;
        tabela29.insere(item32);
        int int34 = tabela29.n;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        tabela35.insere(item36);
        int int38 = tabela35.n;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        tabela40.registros = itemArray42;
        tabela35.registros = itemArray42;
        tabela29.registros = itemArray42;
        ds.Item[] itemArray46 = tabela29.registros;
        tabela21.registros = itemArray46;
        tabela9.registros = itemArray46;
        tabela9.n = (byte) -1;
        ds.Item[] itemArray51 = tabela9.registros;
        tabela0.registros = itemArray51;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        int int16 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        int int14 = tabela9.n;
        ds.Item item15 = null;
        tabela9.insere(item15);
        int int17 = tabela9.n;
        ds.Item item18 = null;
        tabela9.insere(item18);
        ds.Item[] itemArray20 = tabela9.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela21.registros = itemArray23;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        ds.Item item28 = null;
        int int29 = tabela21.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        tabela30.insere(item31);
        ds.Item item33 = null;
        tabela30.insere(item33);
        ds.Item item35 = null;
        tabela30.insere(item35);
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        ds.Item[] itemArray41 = tabela37.registros;
        tabela30.registros = itemArray41;
        tabela21.registros = itemArray41;
        tabela9.registros = itemArray41;
        tabela0.registros = itemArray41;
        ds.Item item46 = null;
        tabela0.insere(item46);
        tabela0.n = 35;
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = tabela0.binaria(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        int int10 = tabela6.n;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        int int14 = tabela11.n;
        ds.Item[] itemArray15 = tabela11.registros;
        ds.Item[] itemArray16 = tabela11.registros;
        ds.Item[] itemArray17 = tabela11.registros;
        tabela6.registros = itemArray17;
        ds.Item[] itemArray19 = tabela6.registros;
        tabela0.registros = itemArray19;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        tabela0.n = 3;
        ds.Item item15 = null;
        tabela0.insere(item15);
        tabela0.n = 6;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        tabela7.registros = itemArray16;
        ds.Item[] itemArray18 = tabela7.registros;
        tabela0.registros = itemArray18;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        tabela3.insere(item4);
        int int6 = tabela3.n;
        int int7 = tabela3.n;
        tabela3.n = (byte) 100;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        ds.Item[] itemArray14 = tabela10.registros;
        ds.Item[] itemArray15 = tabela10.registros;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        tabela10.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int26 = tabela0.n;
        ds.Item item27 = null;
        int int28 = tabela0.binaria(item27);
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = tabela0.pesquisa(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = '4';
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        int int17 = tabela14.n;
        int int18 = tabela14.n;
        int int19 = tabela14.n;
        int int20 = tabela14.n;
        tabela14.n = (short) 10;
        int int23 = tabela14.n;
        tabela14.n = 'a';
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item item29 = null;
        tabela26.insere(item29);
        int int31 = tabela26.n;
        tabela26.n = (short) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        int int43 = tabela40.n;
        ds.Item[] itemArray44 = tabela40.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela45.registros = itemArray47;
        tabela40.registros = itemArray47;
        tabela34.registros = itemArray47;
        ds.Item[] itemArray51 = tabela34.registros;
        tabela26.registros = itemArray51;
        tabela14.registros = itemArray51;
        tabela14.n = (byte) -1;
        ds.Item[] itemArray56 = tabela14.registros;
        tabela0.registros = itemArray56;
        ds.Item item58 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int59 = tabela0.binaria(item58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 32;
        java.lang.Class<?> wildcardClass14 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        tabela0.n = (byte) 10;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        ds.Item item17 = null;
        tabela14.insere(item17);
        int int19 = tabela14.n;
        ds.Item item20 = null;
        tabela14.insere(item20);
        int int22 = tabela14.n;
        ds.Item item23 = null;
        tabela14.insere(item23);
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        tabela25.insere(item26);
        ds.Item item28 = null;
        tabela25.insere(item28);
        int int30 = tabela25.n;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        int int34 = tabela31.n;
        ds.Item[] itemArray35 = tabela31.registros;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela36.registros = itemArray38;
        tabela31.registros = itemArray38;
        tabela25.registros = itemArray38;
        tabela25.n = ' ';
        ds.Item[] itemArray44 = tabela25.registros;
        tabela14.registros = itemArray44;
        tabela14.n = (byte) -1;
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        tabela48.registros = itemArray50;
        ds.Item[] itemArray52 = tabela48.registros;
        ds.Item[] itemArray53 = tabela48.registros;
        ds.Item[] itemArray54 = tabela48.registros;
        tabela14.registros = itemArray54;
        tabela0.registros = itemArray54;
        ds.Item item57 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int58 = tabela0.pesquisa(item57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (byte) 100;
        int int8 = tabela0.n;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        tabela0.n = ' ';
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        int int18 = tabela15.n;
        int int19 = tabela15.n;
        int int20 = tabela15.n;
        int int21 = tabela15.n;
        tabela15.n = (short) 10;
        int int24 = tabela15.n;
        tabela15.n = 'a';
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        ds.Item item30 = null;
        tabela27.insere(item30);
        int int32 = tabela27.n;
        tabela27.n = (short) -1;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        tabela35.insere(item36);
        ds.Item item38 = null;
        tabela35.insere(item38);
        int int40 = tabela35.n;
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item item42 = null;
        tabela41.insere(item42);
        int int44 = tabela41.n;
        ds.Item[] itemArray45 = tabela41.registros;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        tabela46.registros = itemArray48;
        tabela41.registros = itemArray48;
        tabela35.registros = itemArray48;
        ds.Item[] itemArray52 = tabela35.registros;
        tabela27.registros = itemArray52;
        tabela15.registros = itemArray52;
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        tabela55.insere(item56);
        ds.Item item58 = null;
        tabela55.insere(item58);
        int int60 = tabela55.n;
        ds.Item item61 = null;
        tabela55.insere(item61);
        int int63 = tabela55.n;
        ds.Item item64 = null;
        tabela55.insere(item64);
        ds.Item[] itemArray66 = tabela55.registros;
        ds.Tabela tabela67 = new ds.Tabela();
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        tabela67.registros = itemArray69;
        ds.Item[] itemArray71 = tabela67.registros;
        ds.Item[] itemArray72 = tabela67.registros;
        ds.Item[] itemArray73 = tabela67.registros;
        ds.Item item74 = null;
        int int75 = tabela67.binaria(item74);
        ds.Tabela tabela76 = new ds.Tabela();
        ds.Item item77 = null;
        tabela76.insere(item77);
        ds.Item item79 = null;
        tabela76.insere(item79);
        ds.Item item81 = null;
        tabela76.insere(item81);
        ds.Tabela tabela83 = new ds.Tabela();
        ds.Item item84 = null;
        tabela83.insere(item84);
        int int86 = tabela83.n;
        ds.Item[] itemArray87 = tabela83.registros;
        tabela76.registros = itemArray87;
        tabela67.registros = itemArray87;
        tabela55.registros = itemArray87;
        tabela15.registros = itemArray87;
        tabela0.registros = itemArray87;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(itemArray87);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        tabela0.n = 32;
        ds.Item[] itemArray18 = tabela0.registros;
        int int19 = tabela0.n;
        int int20 = tabela0.n;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.pesquisa(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Item[] itemArray15 = tabela7.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        tabela7.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item[] itemArray37 = tabela32.registros;
        tabela32.n = '#';
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        tabela40.registros = itemArray43;
        tabela32.registros = itemArray43;
        tabela0.registros = itemArray43;
        int int47 = tabela0.n;
        ds.Item[] itemArray48 = tabela0.registros;
        ds.Item item49 = null;
        int int50 = tabela0.binaria(item49);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        tabela19.n = (byte) 100;
        tabela19.n = 1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela35.registros = itemArray37;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela29.registros = itemArray42;
        tabela19.registros = itemArray42;
        tabela12.registros = itemArray42;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        tabela0.n = (byte) 10;
        tabela0.n = (short) 1;
        tabela0.n = (short) 100;
        tabela0.n = (byte) -1;
        ds.Item item56 = null;
        tabela0.insere(item56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        tabela0.n = 32;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item[] itemArray19 = tabela0.registros;
        java.lang.Class<?> wildcardClass20 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        int int15 = tabela0.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        int int30 = tabela16.n;
        ds.Item item31 = null;
        tabela16.insere(item31);
        ds.Item[] itemArray33 = tabela16.registros;
        tabela0.registros = itemArray33;
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.pesquisa(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        tabela19.n = (byte) 100;
        tabela19.n = 1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela35.registros = itemArray37;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela29.registros = itemArray42;
        tabela19.registros = itemArray42;
        tabela12.registros = itemArray42;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        tabela0.n = (byte) 10;
        tabela0.n = (short) 1;
        tabela0.n = (short) 100;
        tabela0.n = (byte) -1;
        ds.Item item56 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int57 = tabela0.binaria(item56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        tabela19.n = (byte) 100;
        tabela19.n = 1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela35.registros = itemArray37;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela29.registros = itemArray42;
        tabela19.registros = itemArray42;
        tabela12.registros = itemArray42;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        tabela0.n = (byte) 10;
        tabela0.n = (short) 1;
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = tabela0.pesquisa(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int29 = tabela0.n;
        int int30 = tabela0.n;
        tabela0.n = (-1);
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        int int36 = tabela33.n;
        ds.Item[] itemArray37 = tabela33.registros;
        ds.Item[] itemArray38 = tabela33.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        tabela39.insere(item40);
        int int42 = tabela39.n;
        ds.Item[] itemArray43 = tabela39.registros;
        ds.Item[] itemArray44 = tabela39.registros;
        int int45 = tabela39.n;
        ds.Item[] itemArray46 = tabela39.registros;
        tabela39.n = (byte) 1;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        tabela49.insere(item50);
        ds.Item item52 = null;
        tabela49.insere(item52);
        int int54 = tabela49.n;
        ds.Item item55 = null;
        tabela49.insere(item55);
        int int57 = tabela49.n;
        ds.Item item58 = null;
        tabela49.insere(item58);
        ds.Item[] itemArray60 = tabela49.registros;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        tabela61.registros = itemArray63;
        ds.Item[] itemArray65 = tabela61.registros;
        ds.Item[] itemArray66 = tabela61.registros;
        ds.Item[] itemArray67 = tabela61.registros;
        ds.Item item68 = null;
        int int69 = tabela61.binaria(item68);
        ds.Tabela tabela70 = new ds.Tabela();
        ds.Item item71 = null;
        tabela70.insere(item71);
        ds.Item item73 = null;
        tabela70.insere(item73);
        ds.Item item75 = null;
        tabela70.insere(item75);
        ds.Tabela tabela77 = new ds.Tabela();
        ds.Item item78 = null;
        tabela77.insere(item78);
        int int80 = tabela77.n;
        ds.Item[] itemArray81 = tabela77.registros;
        tabela70.registros = itemArray81;
        tabela61.registros = itemArray81;
        tabela49.registros = itemArray81;
        ds.Item[] itemArray85 = tabela49.registros;
        tabela39.registros = itemArray85;
        tabela33.registros = itemArray85;
        tabela0.registros = itemArray85;
        ds.Item item89 = null;
        tabela0.insere(item89);
        ds.Item item91 = null;
        int int92 = tabela0.binaria(item91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        int int11 = tabela7.n;
        tabela7.n = 100;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela14.registros = itemArray16;
        ds.Item[] itemArray18 = tabela14.registros;
        ds.Item[] itemArray19 = tabela14.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela20.registros = itemArray22;
        ds.Item[] itemArray24 = tabela20.registros;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Item[] itemArray26 = tabela20.registros;
        ds.Item[] itemArray27 = tabela20.registros;
        tabela14.registros = itemArray27;
        tabela7.registros = itemArray27;
        tabela0.registros = itemArray27;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela31.registros = itemArray33;
        ds.Item[] itemArray35 = tabela31.registros;
        ds.Item[] itemArray36 = tabela31.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        tabela37.registros = itemArray39;
        ds.Item[] itemArray41 = tabela37.registros;
        ds.Item[] itemArray42 = tabela37.registros;
        ds.Item[] itemArray43 = tabela37.registros;
        ds.Item[] itemArray44 = tabela37.registros;
        tabela31.registros = itemArray44;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        tabela46.insere(item47);
        ds.Item item49 = null;
        tabela46.insere(item49);
        tabela46.n = (byte) 10;
        ds.Tabela tabela53 = new ds.Tabela();
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        tabela53.registros = itemArray55;
        ds.Item[] itemArray57 = tabela53.registros;
        ds.Item[] itemArray58 = tabela53.registros;
        ds.Item[] itemArray59 = tabela53.registros;
        ds.Item[] itemArray60 = tabela53.registros;
        tabela46.registros = itemArray60;
        tabela31.registros = itemArray60;
        tabela0.registros = itemArray60;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray60);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 10;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        int int16 = tabela0.n;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        tabela0.n = '4';
        int int19 = tabela0.n;
        tabela0.n = 5;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        tabela0.n = 32;
        ds.Item[] itemArray18 = tabela0.registros;
        int int19 = tabela0.n;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.pesquisa(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela6.registros = itemArray8;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item[] itemArray21 = tabela16.registros;
        tabela0.registros = itemArray21;
        ds.Item item23 = null;
        tabela0.insere(item23);
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        tabela25.registros = itemArray27;
        ds.Item[] itemArray29 = tabela25.registros;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        tabela30.insere(item31);
        int int33 = tabela30.n;
        ds.Item[] itemArray34 = tabela30.registros;
        tabela25.registros = itemArray34;
        ds.Item item36 = null;
        tabela25.insere(item36);
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        tabela38.insere(item39);
        ds.Item item41 = null;
        tabela38.insere(item41);
        int int43 = tabela38.n;
        tabela38.n = (short) -1;
        ds.Item[] itemArray46 = tabela38.registros;
        tabela38.n = 0;
        ds.Item[] itemArray49 = tabela38.registros;
        tabela25.registros = itemArray49;
        tabela0.registros = itemArray49;
        java.lang.Class<?> wildcardClass52 = itemArray49.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Item[] itemArray15 = tabela7.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        tabela7.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item[] itemArray37 = tabela32.registros;
        tabela32.n = '#';
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        tabela40.registros = itemArray43;
        tabela32.registros = itemArray43;
        tabela0.registros = itemArray43;
        ds.Item[] itemArray47 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item[] itemArray10 = tabela0.registros;
        tabela0.n = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        tabela0.n = 10;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = '4';
        tabela0.n = (short) 1;
        int int11 = tabela0.n;
        tabela0.n = 'a';
        tabela0.n = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela15.registros = itemArray28;
        tabela9.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        tabela32.registros = itemArray34;
        ds.Item[] itemArray36 = tabela32.registros;
        ds.Item[] itemArray37 = tabela32.registros;
        ds.Item[] itemArray38 = tabela32.registros;
        ds.Item item39 = null;
        int int40 = tabela32.binaria(item39);
        tabela32.n = 0;
        int int43 = tabela32.n;
        ds.Item item44 = null;
        int int45 = tabela32.binaria(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        tabela46.insere(item47);
        ds.Item item49 = null;
        tabela46.insere(item49);
        int int51 = tabela46.n;
        ds.Item item52 = null;
        tabela46.insere(item52);
        int int54 = tabela46.n;
        ds.Item item55 = null;
        tabela46.insere(item55);
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        tabela57.insere(item58);
        ds.Item item60 = null;
        tabela57.insere(item60);
        int int62 = tabela57.n;
        ds.Tabela tabela63 = new ds.Tabela();
        ds.Item item64 = null;
        tabela63.insere(item64);
        int int66 = tabela63.n;
        ds.Item[] itemArray67 = tabela63.registros;
        ds.Tabela tabela68 = new ds.Tabela();
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        tabela68.registros = itemArray70;
        tabela63.registros = itemArray70;
        tabela57.registros = itemArray70;
        tabela57.n = ' ';
        ds.Item[] itemArray76 = tabela57.registros;
        tabela46.registros = itemArray76;
        tabela46.n = (byte) -1;
        ds.Tabela tabela80 = new ds.Tabela();
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        tabela80.registros = itemArray82;
        ds.Item[] itemArray84 = tabela80.registros;
        ds.Item[] itemArray85 = tabela80.registros;
        ds.Item[] itemArray86 = tabela80.registros;
        tabela46.registros = itemArray86;
        tabela32.registros = itemArray86;
        tabela0.registros = itemArray86;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray86);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item[] itemArray18 = tabela13.registros;
        ds.Item item19 = null;
        tabela13.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        ds.Item[] itemArray28 = tabela21.registros;
        tabela13.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        int int34 = tabela31.n;
        ds.Item[] itemArray35 = tabela31.registros;
        ds.Item[] itemArray36 = tabela31.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        ds.Item[] itemArray41 = tabela37.registros;
        ds.Item[] itemArray42 = tabela37.registros;
        int int43 = tabela37.n;
        ds.Item[] itemArray44 = tabela37.registros;
        tabela37.n = (byte) 1;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        tabela47.insere(item48);
        ds.Item item50 = null;
        tabela47.insere(item50);
        int int52 = tabela47.n;
        ds.Item item53 = null;
        tabela47.insere(item53);
        int int55 = tabela47.n;
        ds.Item item56 = null;
        tabela47.insere(item56);
        ds.Item[] itemArray58 = tabela47.registros;
        ds.Tabela tabela59 = new ds.Tabela();
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        tabela59.registros = itemArray61;
        ds.Item[] itemArray63 = tabela59.registros;
        ds.Item[] itemArray64 = tabela59.registros;
        ds.Item[] itemArray65 = tabela59.registros;
        ds.Item item66 = null;
        int int67 = tabela59.binaria(item66);
        ds.Tabela tabela68 = new ds.Tabela();
        ds.Item item69 = null;
        tabela68.insere(item69);
        ds.Item item71 = null;
        tabela68.insere(item71);
        ds.Item item73 = null;
        tabela68.insere(item73);
        ds.Tabela tabela75 = new ds.Tabela();
        ds.Item item76 = null;
        tabela75.insere(item76);
        int int78 = tabela75.n;
        ds.Item[] itemArray79 = tabela75.registros;
        tabela68.registros = itemArray79;
        tabela59.registros = itemArray79;
        tabela47.registros = itemArray79;
        ds.Item[] itemArray83 = tabela47.registros;
        tabela37.registros = itemArray83;
        tabela31.registros = itemArray83;
        tabela0.registros = itemArray83;
        ds.Item item87 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int88 = tabela0.pesquisa(item87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray83);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        tabela0.n = '#';
        tabela0.n = 32;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        tabela19.n = (byte) 100;
        tabela19.n = 1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela35.registros = itemArray37;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela29.registros = itemArray42;
        tabela19.registros = itemArray42;
        tabela12.registros = itemArray42;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        int int48 = tabela0.n;
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = tabela0.binaria(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(itemArray13);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        tabela0.n = ' ';
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (short) 0;
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = (byte) 100;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = 100;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        int int14 = tabela0.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela15.registros = itemArray17;
        ds.Item[] itemArray19 = tabela15.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        int int23 = tabela20.n;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela15.registros = itemArray24;
        ds.Item[] itemArray26 = null;
        tabela15.registros = itemArray26;
        int int28 = tabela15.n;
        ds.Item[] itemArray29 = tabela15.registros;
        tabela15.n = 1;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        tabela32.insere(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        int int37 = tabela32.n;
        ds.Item item38 = null;
        tabela32.insere(item38);
        int int40 = tabela32.n;
        ds.Item item41 = null;
        tabela32.insere(item41);
        ds.Item item43 = null;
        tabela32.insere(item43);
        ds.Item[] itemArray45 = tabela32.registros;
        tabela15.registros = itemArray45;
        tabela0.registros = itemArray45;
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = tabela0.pesquisa(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        tabela0.n = (byte) 100;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = '4';
        tabela0.n = 32;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        int int14 = tabela9.n;
        ds.Item item15 = null;
        tabela9.insere(item15);
        int int17 = tabela9.n;
        ds.Item item18 = null;
        tabela9.insere(item18);
        ds.Item[] itemArray20 = tabela9.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela21.registros = itemArray23;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        ds.Item item28 = null;
        int int29 = tabela21.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        tabela30.insere(item31);
        ds.Item item33 = null;
        tabela30.insere(item33);
        ds.Item item35 = null;
        tabela30.insere(item35);
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        ds.Item[] itemArray41 = tabela37.registros;
        tabela30.registros = itemArray41;
        tabela21.registros = itemArray41;
        tabela9.registros = itemArray41;
        tabela0.registros = itemArray41;
        ds.Item item46 = null;
        tabela0.insere(item46);
        tabela0.n = 35;
        java.lang.Class<?> wildcardClass50 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        tabela0.n = 4;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        int int22 = tabela19.n;
        int int23 = tabela19.n;
        tabela19.n = (byte) 100;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Item[] itemArray31 = tabela26.registros;
        int int32 = tabela26.n;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        int int36 = tabela33.n;
        ds.Item[] itemArray37 = tabela33.registros;
        ds.Item[] itemArray38 = tabela33.registros;
        tabela26.registros = itemArray38;
        tabela19.registros = itemArray38;
        tabela16.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Item item43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = tabela0.binaria(item43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item item11 = null;
        tabela8.insere(item11);
        int int13 = tabela8.n;
        ds.Item item14 = null;
        tabela8.insere(item14);
        int int16 = tabela8.n;
        ds.Item item17 = null;
        tabela8.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        tabela25.insere(item26);
        int int28 = tabela25.n;
        ds.Item[] itemArray29 = tabela25.registros;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela30.registros = itemArray32;
        tabela25.registros = itemArray32;
        tabela19.registros = itemArray32;
        tabela19.n = ' ';
        ds.Item[] itemArray38 = tabela19.registros;
        tabela8.registros = itemArray38;
        tabela8.n = (byte) -1;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        tabela42.insere(item43);
        ds.Item item45 = null;
        tabela42.insere(item45);
        int int47 = tabela42.n;
        tabela42.n = (byte) 100;
        int int50 = tabela42.n;
        int int51 = tabela42.n;
        ds.Item[] itemArray52 = tabela42.registros;
        tabela8.registros = itemArray52;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        ds.Item item57 = null;
        tabela54.insere(item57);
        int int59 = tabela54.n;
        ds.Item item60 = null;
        tabela54.insere(item60);
        ds.Tabela tabela62 = new ds.Tabela();
        ds.Item item63 = null;
        tabela62.insere(item63);
        int int65 = tabela62.n;
        ds.Item[] itemArray66 = tabela62.registros;
        ds.Item[] itemArray67 = tabela62.registros;
        tabela54.registros = itemArray67;
        ds.Tabela tabela69 = new ds.Tabela();
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        tabela69.registros = itemArray71;
        ds.Item[] itemArray73 = tabela69.registros;
        ds.Item[] itemArray74 = tabela69.registros;
        ds.Item[] itemArray75 = tabela69.registros;
        tabela54.registros = itemArray75;
        tabela8.registros = itemArray75;
        tabela0.registros = itemArray75;
        ds.Item item79 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int80 = tabela0.pesquisa(item79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray75);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = ' ';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Item[] itemArray24 = tabela19.registros;
        tabela0.registros = itemArray24;
        int int26 = tabela0.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        ds.Item item30 = null;
        tabela27.insere(item30);
        int int32 = tabela27.n;
        ds.Item item33 = null;
        tabela27.insere(item33);
        int int35 = tabela27.n;
        ds.Item item36 = null;
        tabela27.insere(item36);
        ds.Item item38 = null;
        tabela27.insere(item38);
        ds.Item[] itemArray40 = tabela27.registros;
        ds.Item[] itemArray41 = tabela27.registros;
        tabela0.registros = itemArray41;
        ds.Item[] itemArray43 = tabela0.registros;
        tabela0.n = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela6.registros = itemArray8;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        int int15 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = 10;
        int int21 = tabela0.n;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.pesquisa(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = 4;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        ds.Item[] itemArray15 = tabela11.registros;
        ds.Item[] itemArray16 = tabela11.registros;
        ds.Item item17 = null;
        int int18 = tabela11.binaria(item17);
        ds.Item[] itemArray19 = tabela11.registros;
        tabela0.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        int int24 = tabela21.n;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Item[] itemArray26 = tabela21.registros;
        int int27 = tabela21.n;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        ds.Item item31 = null;
        tabela28.insere(item31);
        int int33 = tabela28.n;
        tabela28.n = (byte) 100;
        tabela28.n = 1;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        tabela38.registros = itemArray40;
        ds.Item[] itemArray42 = tabela38.registros;
        ds.Item[] itemArray43 = tabela38.registros;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        tabela44.registros = itemArray46;
        ds.Item[] itemArray48 = tabela44.registros;
        ds.Item[] itemArray49 = tabela44.registros;
        ds.Item[] itemArray50 = tabela44.registros;
        ds.Item[] itemArray51 = tabela44.registros;
        tabela38.registros = itemArray51;
        tabela28.registros = itemArray51;
        tabela21.registros = itemArray51;
        tabela0.registros = itemArray51;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        tabela0.n = (byte) 10;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Item[] itemArray15 = tabela7.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        tabela7.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item[] itemArray37 = tabela32.registros;
        tabela32.n = '#';
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        tabela40.registros = itemArray43;
        tabela32.registros = itemArray43;
        tabela0.registros = itemArray43;
        int int47 = tabela0.n;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = ' ';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Item[] itemArray24 = tabela19.registros;
        tabela0.registros = itemArray24;
        ds.Item[] itemArray26 = tabela0.registros;
        java.lang.Class<?> wildcardClass27 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        tabela7.n = (byte) 100;
        tabela7.n = 1;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela17.registros = itemArray19;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela17.registros = itemArray30;
        tabela7.registros = itemArray30;
        tabela0.registros = itemArray30;
        ds.Item[] itemArray34 = tabela0.registros;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        ds.Item item13 = null;
        tabela7.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Item item21 = null;
        tabela15.insere(item21);
        int int23 = tabela15.n;
        ds.Item[] itemArray24 = tabela15.registros;
        tabela7.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        int int30 = tabela27.n;
        ds.Item[] itemArray31 = tabela27.registros;
        ds.Item[] itemArray32 = tabela27.registros;
        int int33 = tabela27.n;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        ds.Item[] itemArray39 = tabela34.registros;
        tabela27.registros = itemArray39;
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item item42 = null;
        tabela41.insere(item42);
        int int44 = tabela41.n;
        ds.Item[] itemArray45 = tabela41.registros;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        tabela46.registros = itemArray48;
        tabela41.registros = itemArray48;
        tabela27.registros = itemArray48;
        tabela0.registros = itemArray48;
        int int53 = tabela0.n;
        tabela0.n = '4';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        ds.Item[] itemArray14 = tabela0.registros;
        tabela0.n = 1;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        ds.Item item20 = null;
        tabela17.insere(item20);
        int int22 = tabela17.n;
        ds.Item item23 = null;
        tabela17.insere(item23);
        int int25 = tabela17.n;
        ds.Item item26 = null;
        tabela17.insere(item26);
        ds.Item item28 = null;
        tabela17.insere(item28);
        ds.Item[] itemArray30 = tabela17.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        tabela0.insere(item32);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = (short) 10;
        int int19 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        java.lang.Class<?> wildcardClass29 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = 10;
        int int21 = tabela0.n;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.binaria(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        tabela9.insere(item14);
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela9.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        tabela0.n = 1;
        int int27 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        java.lang.Class<?> wildcardClass10 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        tabela9.insere(item14);
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela9.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        ds.Item item25 = null;
        tabela0.insere(item25);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        tabela0.n = '#';
        int int9 = tabela0.n;
        tabela0.n = (short) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        tabela7.n = (byte) 100;
        tabela7.n = 1;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela17.registros = itemArray19;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela17.registros = itemArray30;
        tabela7.registros = itemArray30;
        tabela0.registros = itemArray30;
        tabela0.n = 97;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        tabela36.insere(item37);
        int int39 = tabela36.n;
        ds.Item[] itemArray40 = tabela36.registros;
        ds.Item[] itemArray41 = tabela36.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        tabela42.insere(item43);
        int int45 = tabela42.n;
        ds.Item[] itemArray46 = tabela42.registros;
        ds.Item[] itemArray47 = tabela42.registros;
        int int48 = tabela42.n;
        ds.Item[] itemArray49 = tabela42.registros;
        tabela42.n = (byte) 1;
        ds.Tabela tabela52 = new ds.Tabela();
        ds.Item item53 = null;
        tabela52.insere(item53);
        ds.Item item55 = null;
        tabela52.insere(item55);
        int int57 = tabela52.n;
        ds.Item item58 = null;
        tabela52.insere(item58);
        int int60 = tabela52.n;
        ds.Item item61 = null;
        tabela52.insere(item61);
        ds.Item[] itemArray63 = tabela52.registros;
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela64.registros = itemArray66;
        ds.Item[] itemArray68 = tabela64.registros;
        ds.Item[] itemArray69 = tabela64.registros;
        ds.Item[] itemArray70 = tabela64.registros;
        ds.Item item71 = null;
        int int72 = tabela64.binaria(item71);
        ds.Tabela tabela73 = new ds.Tabela();
        ds.Item item74 = null;
        tabela73.insere(item74);
        ds.Item item76 = null;
        tabela73.insere(item76);
        ds.Item item78 = null;
        tabela73.insere(item78);
        ds.Tabela tabela80 = new ds.Tabela();
        ds.Item item81 = null;
        tabela80.insere(item81);
        int int83 = tabela80.n;
        ds.Item[] itemArray84 = tabela80.registros;
        tabela73.registros = itemArray84;
        tabela64.registros = itemArray84;
        tabela52.registros = itemArray84;
        ds.Item[] itemArray88 = tabela52.registros;
        tabela42.registros = itemArray88;
        tabela36.registros = itemArray88;
        ds.Item[] itemArray91 = tabela36.registros;
        tabela0.registros = itemArray91;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        tabela4.n = (short) 100;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Item[] itemArray15 = tabela9.registros;
        tabela4.registros = itemArray15;
        tabela0.registros = itemArray15;
        java.lang.Class<?> wildcardClass18 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        tabela0.n = (byte) 10;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (byte) 0;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = (-1);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.pesquisa(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        tabela0.n = (short) 0;
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = 4;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        ds.Item[] itemArray15 = tabela11.registros;
        ds.Item[] itemArray16 = tabela11.registros;
        ds.Item item17 = null;
        int int18 = tabela11.binaria(item17);
        ds.Item[] itemArray19 = tabela11.registros;
        tabela0.registros = itemArray19;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.binaria(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Item[] itemArray15 = tabela7.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        tabela7.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item[] itemArray37 = tabela32.registros;
        tabela32.n = '#';
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        tabela40.registros = itemArray43;
        tabela32.registros = itemArray43;
        tabela0.registros = itemArray43;
        int int47 = tabela0.n;
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = tabela0.pesquisa(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        int int13 = tabela0.n;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item item19 = null;
        tabela16.insere(item19);
        int int21 = tabela16.n;
        ds.Item item22 = null;
        tabela16.insere(item22);
        int int24 = tabela16.n;
        ds.Item[] itemArray25 = tabela16.registros;
        ds.Item item26 = null;
        tabela16.insere(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        ds.Item[] itemArray33 = tabela28.registros;
        int int34 = tabela28.n;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        tabela35.insere(item36);
        int int38 = tabela35.n;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        tabela28.registros = itemArray40;
        ds.Item[] itemArray42 = tabela28.registros;
        tabela16.registros = itemArray42;
        ds.Item[] itemArray44 = tabela16.registros;
        tabela0.registros = itemArray44;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item[] itemArray9 = tabela0.registros;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        tabela0.n = 3;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.binaria(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        tabela0.n = 2;
        ds.Item[] itemArray12 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item item11 = null;
        tabela8.insere(item11);
        int int13 = tabela8.n;
        ds.Item item14 = null;
        tabela8.insere(item14);
        int int16 = tabela8.n;
        ds.Item[] itemArray17 = tabela8.registros;
        tabela0.registros = itemArray17;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item item21 = null;
        tabela0.insere(item21);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        tabela10.n = (short) 10;
        ds.Item[] itemArray19 = tabela10.registros;
        tabela0.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        int int26 = tabela21.n;
        ds.Item item27 = null;
        tabela21.insere(item27);
        int int29 = tabela21.n;
        ds.Item item30 = null;
        tabela21.insere(item30);
        int int32 = tabela21.n;
        ds.Item[] itemArray33 = tabela21.registros;
        tabela0.registros = itemArray33;
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.pesquisa(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray12 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        ds.Item[] itemArray10 = tabela5.registros;
        ds.Item[] itemArray11 = tabela5.registros;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray13 = tabela0.registros;
        int int14 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        int int16 = tabela13.n;
        ds.Item[] itemArray17 = tabela13.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        tabela18.registros = itemArray20;
        tabela13.registros = itemArray20;
        tabela7.registros = itemArray20;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela7.registros = itemArray25;
        tabela0.registros = itemArray25;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        int int17 = tabela12.n;
        tabela12.n = (short) -1;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item item23 = null;
        tabela20.insere(item23);
        int int25 = tabela20.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela31.registros = itemArray33;
        tabela26.registros = itemArray33;
        tabela20.registros = itemArray33;
        ds.Item[] itemArray37 = tabela20.registros;
        tabela12.registros = itemArray37;
        tabela0.registros = itemArray37;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray42 = tabela0.registros;
        int int43 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        tabela0.insere(item17);
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item[] itemArray18 = tabela13.registros;
        ds.Item item19 = null;
        tabela13.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        ds.Item[] itemArray28 = tabela21.registros;
        tabela13.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Item item31 = null;
        tabela0.insere(item31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        int int14 = tabela9.n;
        ds.Item item15 = null;
        tabela9.insere(item15);
        int int17 = tabela9.n;
        ds.Item item18 = null;
        tabela9.insere(item18);
        ds.Item[] itemArray20 = tabela9.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela21.registros = itemArray23;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        ds.Item item28 = null;
        int int29 = tabela21.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        tabela30.insere(item31);
        ds.Item item33 = null;
        tabela30.insere(item33);
        ds.Item item35 = null;
        tabela30.insere(item35);
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        ds.Item[] itemArray41 = tabela37.registros;
        tabela30.registros = itemArray41;
        tabela21.registros = itemArray41;
        tabela9.registros = itemArray41;
        tabela0.registros = itemArray41;
        ds.Item item46 = null;
        tabela0.insere(item46);
        tabela0.n = 35;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item item51 = null;
        tabela50.insere(item51);
        ds.Item item53 = null;
        tabela50.insere(item53);
        ds.Item[] itemArray55 = tabela50.registros;
        tabela0.registros = itemArray55;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        tabela0.n = '#';
        tabela0.n = 32;
        tabela0.n = 6;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        int int18 = tabela13.n;
        tabela13.n = (short) -1;
        ds.Item[] itemArray21 = tabela13.registros;
        tabela13.n = 0;
        ds.Item[] itemArray24 = tabela13.registros;
        tabela0.registros = itemArray24;
        ds.Item[] itemArray26 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        tabela3.insere(item4);
        ds.Item item6 = null;
        tabela3.insere(item6);
        int int8 = tabela3.n;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela14.registros = itemArray16;
        tabela9.registros = itemArray16;
        tabela3.registros = itemArray16;
        tabela3.n = ' ';
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        tabela22.insere(item23);
        ds.Item item25 = null;
        tabela22.insere(item25);
        ds.Item[] itemArray27 = tabela22.registros;
        tabela3.registros = itemArray27;
        tabela0.registros = itemArray27;
        int int30 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        int int36 = tabela33.n;
        ds.Item[] itemArray37 = tabela33.registros;
        ds.Item[] itemArray38 = tabela33.registros;
        int int39 = tabela33.n;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item item43 = null;
        tabela40.insere(item43);
        int int45 = tabela40.n;
        ds.Item item46 = null;
        tabela40.insere(item46);
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item item49 = null;
        tabela48.insere(item49);
        ds.Item item51 = null;
        tabela48.insere(item51);
        int int53 = tabela48.n;
        ds.Item item54 = null;
        tabela48.insere(item54);
        int int56 = tabela48.n;
        ds.Item[] itemArray57 = tabela48.registros;
        tabela40.registros = itemArray57;
        tabela33.registros = itemArray57;
        tabela0.registros = itemArray57;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = 35;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = '4';
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.binaria(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela5.registros = itemArray7;
        tabela0.registros = itemArray7;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item item13 = null;
        tabela10.insere(item13);
        int int15 = tabela10.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela21.registros = itemArray23;
        tabela16.registros = itemArray23;
        tabela10.registros = itemArray23;
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        tabela10.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        int int34 = tabela31.n;
        int int35 = tabela31.n;
        int int36 = tabela31.n;
        int int37 = tabela31.n;
        tabela31.n = (short) 10;
        int int40 = tabela31.n;
        tabela31.n = 'a';
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        tabela43.insere(item44);
        ds.Item item46 = null;
        tabela43.insere(item46);
        int int48 = tabela43.n;
        tabela43.n = (short) -1;
        ds.Tabela tabela51 = new ds.Tabela();
        ds.Item item52 = null;
        tabela51.insere(item52);
        ds.Item item54 = null;
        tabela51.insere(item54);
        int int56 = tabela51.n;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        tabela57.insere(item58);
        int int60 = tabela57.n;
        ds.Item[] itemArray61 = tabela57.registros;
        ds.Tabela tabela62 = new ds.Tabela();
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        tabela62.registros = itemArray64;
        tabela57.registros = itemArray64;
        tabela51.registros = itemArray64;
        ds.Item[] itemArray68 = tabela51.registros;
        tabela43.registros = itemArray68;
        tabela31.registros = itemArray68;
        tabela0.registros = itemArray68;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item item13 = null;
        tabela0.insere(item13);
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        tabela39.registros = itemArray41;
        tabela34.registros = itemArray41;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        ds.Item item47 = null;
        tabela44.insere(item47);
        int int49 = tabela44.n;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item item51 = null;
        tabela50.insere(item51);
        int int53 = tabela50.n;
        ds.Item[] itemArray54 = tabela50.registros;
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        tabela55.registros = itemArray57;
        tabela50.registros = itemArray57;
        tabela44.registros = itemArray57;
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        tabela44.registros = itemArray62;
        tabela34.registros = itemArray62;
        tabela0.registros = itemArray62;
        java.lang.Class<?> wildcardClass66 = itemArray62.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        tabela0.n = 32;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int29 = tabela0.n;
        int int30 = tabela0.n;
        tabela0.n = '4';
        tabela0.n = (short) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        int int15 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = (short) 10;
        tabela0.n = 'a';
        ds.Item[] itemArray21 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = 100;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        tabela0.n = (byte) 1;
        tabela0.n = ' ';
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        int int21 = tabela18.n;
        int int22 = tabela18.n;
        int int23 = tabela18.n;
        int int24 = tabela18.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        tabela25.insere(item26);
        int int28 = tabela25.n;
        ds.Item[] itemArray29 = tabela25.registros;
        ds.Item[] itemArray30 = tabela25.registros;
        tabela18.registros = itemArray30;
        int int32 = tabela18.n;
        ds.Item item33 = null;
        tabela18.insere(item33);
        ds.Item[] itemArray35 = tabela18.registros;
        tabela0.registros = itemArray35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela6.registros = itemArray8;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        tabela0.n = 4;
        int int18 = tabela0.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        int int22 = tabela19.n;
        int int23 = tabela19.n;
        tabela19.n = 100;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Item[] itemArray31 = tabela26.registros;
        tabela19.registros = itemArray31;
        tabela0.registros = itemArray31;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        tabela0.n = (-1);
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = ' ';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Item[] itemArray24 = tabela19.registros;
        tabela0.registros = itemArray24;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.binaria(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        int int13 = tabela9.n;
        int int14 = tabela9.n;
        int int15 = tabela9.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Item[] itemArray21 = tabela16.registros;
        tabela9.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        tabela24.registros = itemArray26;
        ds.Item[] itemArray28 = tabela24.registros;
        ds.Item item29 = null;
        int int30 = tabela24.binaria(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        ds.Item item34 = null;
        tabela31.insere(item34);
        int int36 = tabela31.n;
        ds.Item item37 = null;
        tabela31.insere(item37);
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        tabela39.insere(item40);
        int int42 = tabela39.n;
        ds.Item[] itemArray43 = tabela39.registros;
        ds.Item[] itemArray44 = tabela39.registros;
        tabela31.registros = itemArray44;
        tabela24.registros = itemArray44;
        tabela0.registros = itemArray44;
        ds.Item[] itemArray48 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        int int10 = tabela0.n;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item item16 = null;
        int int17 = tabela0.binaria(item16);
        java.lang.Class<?> wildcardClass18 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        tabela9.insere(item14);
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela9.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        tabela0.n = 1;
        tabela0.n = ' ';
        java.lang.Class<?> wildcardClass29 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = ' ';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Item[] itemArray24 = tabela19.registros;
        tabela0.registros = itemArray24;
        int int26 = tabela0.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        ds.Item item30 = null;
        tabela27.insere(item30);
        int int32 = tabela27.n;
        ds.Item item33 = null;
        tabela27.insere(item33);
        int int35 = tabela27.n;
        ds.Item item36 = null;
        tabela27.insere(item36);
        ds.Item item38 = null;
        tabela27.insere(item38);
        ds.Item[] itemArray40 = tabela27.registros;
        ds.Item[] itemArray41 = tabela27.registros;
        tabela0.registros = itemArray41;
        ds.Item[] itemArray43 = tabela0.registros;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        ds.Item item47 = null;
        tabela44.insere(item47);
        ds.Item[] itemArray49 = tabela44.registros;
        tabela0.registros = itemArray49;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela5.registros = itemArray7;
        tabela0.registros = itemArray7;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        tabela10.registros = itemArray12;
        ds.Item[] itemArray14 = tabela10.registros;
        ds.Item[] itemArray15 = tabela10.registros;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela17.registros = itemArray19;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela17.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela17.binaria(item32);
        ds.Item[] itemArray34 = tabela17.registros;
        tabela10.registros = itemArray34;
        tabela0.registros = itemArray34;
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = tabela0.pesquisa(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        tabela7.n = (byte) 100;
        tabela7.n = 1;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela17.registros = itemArray19;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela17.registros = itemArray30;
        tabela7.registros = itemArray30;
        tabela0.registros = itemArray30;
        ds.Item[] itemArray34 = tabela0.registros;
        java.lang.Class<?> wildcardClass35 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }
}

