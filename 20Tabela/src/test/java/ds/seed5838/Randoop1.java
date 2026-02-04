package ds.seed5838;

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
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = (short) 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        tabela9.registros = itemArray15;
        int int17 = tabela9.n;
        tabela9.n = (short) 0;
        tabela9.n = (short) 0;
        tabela9.n = (byte) -1;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela9.registros = itemArray25;
        tabela0.registros = itemArray25;
        tabela0.n = (short) 0;
        int int30 = tabela0.n;
        ds.Item item31 = null;
        int int32 = tabela0.binaria(item31);
        int int33 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = (short) 0;
        tabela4.n = 1;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela4.registros = itemArray9;
        ds.Item[] itemArray11 = tabela4.registros;
        ds.Item[] itemArray12 = tabela4.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        int int10 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        tabela0.insere(item15);
        tabela0.n = (byte) 10;
        tabela0.n = 2;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.binaria(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item item19 = null;
        tabela12.insere(item19);
        int int21 = tabela12.n;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = (short) 0;
        ds.Item item25 = null;
        tabela22.insere(item25);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        tabela22.registros = itemArray28;
        int int30 = tabela22.n;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = (short) 0;
        ds.Item item34 = null;
        tabela31.insere(item34);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela31.registros = itemArray37;
        int int39 = tabela31.n;
        tabela31.n = (short) 0;
        tabela31.n = (short) 0;
        tabela31.n = (byte) -1;
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela31.registros = itemArray47;
        tabela22.registros = itemArray47;
        tabela12.registros = itemArray47;
        tabela0.registros = itemArray47;
        ds.Tabela tabela52 = new ds.Tabela();
        tabela52.n = (short) 0;
        tabela52.n = 1;
        ds.Item item57 = null;
        tabela52.insere(item57);
        int int59 = tabela52.n;
        ds.Item item60 = null;
        tabela52.insere(item60);
        ds.Tabela tabela62 = new ds.Tabela();
        ds.Item item63 = null;
        int int64 = tabela62.binaria(item63);
        ds.Tabela tabela65 = new ds.Tabela();
        tabela65.n = (short) 0;
        ds.Item item68 = null;
        tabela65.insere(item68);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        tabela65.registros = itemArray71;
        tabela62.registros = itemArray71;
        tabela52.registros = itemArray71;
        int int75 = tabela52.n;
        ds.Item[] itemArray76 = tabela52.registros;
        ds.Tabela tabela77 = new ds.Tabela();
        ds.Item item78 = null;
        int int79 = tabela77.binaria(item78);
        ds.Tabela tabela80 = new ds.Tabela();
        tabela80.n = (short) 0;
        ds.Item item83 = null;
        tabela80.insere(item83);
        ds.Item item85 = null;
        ds.Item[] itemArray86 = new ds.Item[] { item85 };
        tabela80.registros = itemArray86;
        tabela77.registros = itemArray86;
        tabela52.registros = itemArray86;
        ds.Item[] itemArray90 = tabela52.registros;
        tabela0.registros = itemArray90;
        ds.Item[] itemArray92 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(itemArray86);
        org.junit.Assert.assertNotNull(itemArray90);
        org.junit.Assert.assertNotNull(itemArray92);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        int int12 = tabela0.n;
        int int13 = tabela0.n;
        ds.Item[] itemArray14 = null;
        tabela0.registros = itemArray14;
        tabela0.n = ' ';
        ds.Item[] itemArray18 = tabela0.registros;
        int int19 = tabela0.n;
        tabela0.n = 0;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = (short) 0;
        tabela22.n = 1;
        ds.Item item27 = null;
        tabela22.insere(item27);
        ds.Item[] itemArray29 = tabela22.registros;
        tabela0.registros = itemArray29;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        tabela0.n = 1;
        int int12 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = 10;
        tabela0.n = 10;
        tabela0.n = (byte) -1;
        int int9 = tabela0.n;
        tabela0.n = 52;
        int int12 = tabela0.n;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 0;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = (short) 0;
        tabela7.n = 1;
        ds.Item item12 = null;
        tabela7.insere(item12);
        int int14 = tabela7.n;
        ds.Item item15 = null;
        tabela7.insere(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = (short) 0;
        ds.Item item20 = null;
        tabela17.insere(item20);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela17.registros = itemArray23;
        int int25 = tabela17.n;
        tabela17.n = (short) 0;
        tabela17.n = (short) 0;
        ds.Item[] itemArray30 = tabela17.registros;
        tabela7.registros = itemArray30;
        tabela7.n = (byte) -1;
        ds.Item[] itemArray34 = tabela7.registros;
        tabela0.registros = itemArray34;
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item[] itemArray19 = tabela0.registros;
        tabela0.n = (byte) 10;
        int int22 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = (short) 0;
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela13.registros = itemArray19;
        tabela10.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray23 = tabela0.registros;
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = (short) 0;
        tabela24.n = 1;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela24.registros = itemArray29;
        ds.Item[] itemArray31 = tabela24.registros;
        ds.Item[] itemArray32 = tabela24.registros;
        tabela24.n = (byte) 0;
        ds.Item item35 = null;
        int int36 = tabela24.binaria(item35);
        ds.Tabela tabela37 = new ds.Tabela();
        int int38 = tabela37.n;
        ds.Item[] itemArray39 = tabela37.registros;
        tabela24.registros = itemArray39;
        tabela0.registros = itemArray39;
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = tabela0.pesquisa(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        int int19 = tabela0.n;
        tabela0.n = (short) 0;
        ds.Item[] itemArray22 = tabela0.registros;
        ds.Item[] itemArray23 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = 0;
        tabela0.n = 2;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = (short) 0;
        tabela13.n = 1;
        ds.Item item18 = null;
        tabela13.insere(item18);
        int int20 = tabela13.n;
        ds.Item[] itemArray21 = tabela13.registros;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray23 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = (short) 0;
        tabela7.n = 1;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela7.registros = itemArray12;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela7.n = (short) 0;
        tabela7.n = 'a';
        int int19 = tabela7.n;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        tabela20.n = 1;
        ds.Item item25 = null;
        tabela20.insere(item25);
        ds.Item item27 = null;
        tabela20.insere(item27);
        tabela20.n = 1;
        ds.Item[] itemArray31 = tabela20.registros;
        tabela7.registros = itemArray31;
        tabela0.registros = itemArray31;
        ds.Item[] itemArray34 = tabela0.registros;
        ds.Item[] itemArray35 = null;
        tabela0.registros = itemArray35;
        int int37 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = (short) 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        tabela9.registros = itemArray15;
        int int17 = tabela9.n;
        tabela9.n = (short) 0;
        tabela9.n = (short) 0;
        tabela9.n = (byte) -1;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela9.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = (short) 0;
        tabela28.n = 1;
        ds.Item[] itemArray33 = new ds.Item[] {};
        tabela28.registros = itemArray33;
        tabela0.registros = itemArray33;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = (short) 0;
        tabela36.n = 1;
        ds.Item item41 = null;
        tabela36.insere(item41);
        int int43 = tabela36.n;
        ds.Item item44 = null;
        tabela36.insere(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        int int48 = tabela46.binaria(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        tabela49.n = (short) 0;
        ds.Item item52 = null;
        tabela49.insere(item52);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        tabela49.registros = itemArray55;
        tabela46.registros = itemArray55;
        tabela36.registros = itemArray55;
        ds.Item[] itemArray59 = tabela36.registros;
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        tabela60.n = 1;
        ds.Item[] itemArray65 = new ds.Item[] {};
        tabela60.registros = itemArray65;
        ds.Item[] itemArray67 = tabela60.registros;
        ds.Item[] itemArray68 = tabela60.registros;
        tabela60.n = (byte) 0;
        ds.Item item71 = null;
        int int72 = tabela60.binaria(item71);
        ds.Tabela tabela73 = new ds.Tabela();
        int int74 = tabela73.n;
        ds.Item[] itemArray75 = tabela73.registros;
        tabela60.registros = itemArray75;
        tabela36.registros = itemArray75;
        ds.Tabela tabela78 = new ds.Tabela();
        tabela78.n = (short) 0;
        tabela78.n = 1;
        ds.Item item83 = null;
        tabela78.insere(item83);
        ds.Item item85 = null;
        tabela78.insere(item85);
        int int87 = tabela78.n;
        ds.Item[] itemArray88 = tabela78.registros;
        tabela36.registros = itemArray88;
        tabela0.registros = itemArray88;
        ds.Item item91 = null;
        tabela0.insere(item91);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 3 + "'", int87 == 3);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = (short) 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        tabela9.registros = itemArray15;
        int int17 = tabela9.n;
        tabela9.n = (short) 0;
        tabela9.n = (short) 0;
        tabela9.n = (byte) -1;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela9.registros = itemArray25;
        tabela0.registros = itemArray25;
        tabela0.n = (short) 0;
        int int30 = tabela0.n;
        ds.Item item31 = null;
        int int32 = tabela0.binaria(item31);
        tabela0.n = (byte) 100;
        int int35 = tabela0.n;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = (short) 0;
        tabela36.n = 1;
        ds.Item item41 = null;
        tabela36.insere(item41);
        ds.Item[] itemArray43 = tabela36.registros;
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = (short) 0;
        ds.Item item47 = null;
        tabela44.insere(item47);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        tabela44.registros = itemArray50;
        int int52 = tabela44.n;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = (short) 0;
        ds.Item item56 = null;
        tabela53.insere(item56);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        tabela53.registros = itemArray59;
        int int61 = tabela53.n;
        tabela53.n = (short) 0;
        tabela53.n = (short) 0;
        tabela53.n = (byte) -1;
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        tabela53.registros = itemArray69;
        tabela44.registros = itemArray69;
        ds.Tabela tabela72 = new ds.Tabela();
        tabela72.n = (short) 0;
        tabela72.n = 1;
        ds.Item[] itemArray77 = new ds.Item[] {};
        tabela72.registros = itemArray77;
        tabela44.registros = itemArray77;
        tabela36.registros = itemArray77;
        tabela0.registros = itemArray77;
        java.lang.Class<?> wildcardClass82 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = (short) 0;
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        tabela21.registros = itemArray27;
        int int29 = tabela21.n;
        tabela21.n = (short) 0;
        tabela21.n = (short) 0;
        ds.Item[] itemArray34 = tabela21.registros;
        ds.Item[] itemArray35 = tabela21.registros;
        ds.Item[] itemArray36 = tabela21.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = (short) 0;
        ds.Item[] itemArray40 = tabela37.registros;
        tabela21.registros = itemArray40;
        tabela0.registros = itemArray40;
        ds.Item item43 = null;
        int int44 = tabela0.binaria(item43);
        ds.Tabela tabela45 = new ds.Tabela();
        int int46 = tabela45.n;
        ds.Tabela tabela47 = new ds.Tabela();
        tabela47.n = (short) 0;
        tabela47.n = 1;
        ds.Tabela tabela52 = new ds.Tabela();
        tabela52.n = (short) 0;
        ds.Item item55 = null;
        tabela52.insere(item55);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        tabela52.registros = itemArray58;
        int int60 = tabela52.n;
        tabela52.n = (short) 0;
        tabela52.n = (short) 0;
        ds.Item[] itemArray65 = tabela52.registros;
        ds.Item[] itemArray66 = tabela52.registros;
        tabela47.registros = itemArray66;
        tabela45.registros = itemArray66;
        int int69 = tabela45.n;
        ds.Item[] itemArray70 = tabela45.registros;
        tabela0.registros = itemArray70;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = 0;
        tabela0.n = 2;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela11.registros = itemArray17;
        int int19 = tabela11.n;
        tabela11.n = (short) 0;
        tabela11.n = (short) 0;
        tabela11.n = (byte) -1;
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        tabela11.registros = itemArray27;
        int int29 = tabela11.n;
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
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = (short) 0;
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        tabela21.registros = itemArray27;
        tabela18.registros = itemArray27;
        tabela0.registros = itemArray27;
        int int31 = tabela0.n;
        tabela0.n = (short) 10;
        java.lang.Class<?> wildcardClass34 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        tabela8.n = 1;
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item item15 = null;
        tabela8.insere(item15);
        tabela8.n = 1;
        ds.Item[] itemArray19 = tabela8.registros;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.binaria(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = 10;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        int int13 = tabela0.n;
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        tabela16.n = 1;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela16.registros = itemArray21;
        ds.Item[] itemArray23 = tabela16.registros;
        tabela16.n = (short) 0;
        tabela16.n = 'a';
        int int28 = tabela16.n;
        int int29 = tabela16.n;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = (short) 0;
        tabela30.n = 1;
        ds.Item[] itemArray35 = new ds.Item[] {};
        tabela30.registros = itemArray35;
        ds.Item[] itemArray37 = tabela30.registros;
        ds.Item[] itemArray38 = tabela30.registros;
        tabela30.n = (byte) 0;
        ds.Item item41 = null;
        int int42 = tabela30.binaria(item41);
        ds.Tabela tabela43 = new ds.Tabela();
        int int44 = tabela43.n;
        ds.Item[] itemArray45 = tabela43.registros;
        tabela30.registros = itemArray45;
        tabela16.registros = itemArray45;
        tabela0.registros = itemArray45;
        int int49 = tabela0.n;
        ds.Item[] itemArray50 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Tabela tabela2 = new ds.Tabela();
        tabela2.n = (short) 0;
        tabela2.n = 1;
        ds.Item item7 = null;
        tabela2.insere(item7);
        int int9 = tabela2.n;
        ds.Item item10 = null;
        tabela2.insere(item10);
        tabela2.n = '4';
        ds.Item[] itemArray14 = tabela2.registros;
        tabela0.registros = itemArray14;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = (short) 0;
        ds.Item item21 = null;
        tabela18.insere(item21);
        tabela18.n = 0;
        ds.Item[] itemArray25 = tabela18.registros;
        tabela0.registros = itemArray25;
        ds.Item item27 = null;
        tabela0.insere(item27);
        ds.Item item29 = null;
        tabela0.insere(item29);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        tabela0.n = 97;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        ds.Item[] itemArray9 = tabela0.registros;
        java.lang.Class<?> wildcardClass10 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        tabela2.n = (short) 0;
        tabela2.n = 1;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = (short) 0;
        ds.Item item10 = null;
        tabela7.insere(item10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela7.registros = itemArray13;
        int int15 = tabela7.n;
        tabela7.n = (short) 0;
        tabela7.n = (short) 0;
        ds.Item[] itemArray20 = tabela7.registros;
        ds.Item[] itemArray21 = tabela7.registros;
        tabela2.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray24 = tabela0.registros;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.pesquisa(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) -1;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        int int19 = tabela0.n;
        tabela0.n = (short) 0;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = (short) 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        tabela9.registros = itemArray15;
        int int17 = tabela9.n;
        tabela9.n = (short) 0;
        tabela9.n = (short) 0;
        tabela9.n = (byte) -1;
        int int24 = tabela9.n;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = (short) 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela25.registros = itemArray31;
        int int33 = tabela25.n;
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = (short) 0;
        ds.Item item37 = null;
        tabela34.insere(item37);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        tabela34.registros = itemArray40;
        int int42 = tabela34.n;
        tabela34.n = (short) 0;
        tabela34.n = (short) 0;
        tabela34.n = (byte) -1;
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        tabela34.registros = itemArray50;
        tabela25.registros = itemArray50;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = (short) 0;
        tabela53.n = 1;
        ds.Item[] itemArray58 = new ds.Item[] {};
        tabela53.registros = itemArray58;
        tabela25.registros = itemArray58;
        tabela9.registros = itemArray58;
        ds.Tabela tabela62 = new ds.Tabela();
        tabela62.n = (short) 0;
        tabela62.n = 1;
        ds.Item item67 = null;
        tabela62.insere(item67);
        ds.Item item69 = null;
        tabela62.insere(item69);
        tabela62.n = 1;
        ds.Item[] itemArray73 = tabela62.registros;
        tabela9.registros = itemArray73;
        tabela0.registros = itemArray73;
        int int76 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item item19 = null;
        tabela12.insere(item19);
        int int21 = tabela12.n;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = (short) 0;
        ds.Item item25 = null;
        tabela22.insere(item25);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        tabela22.registros = itemArray28;
        int int30 = tabela22.n;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = (short) 0;
        ds.Item item34 = null;
        tabela31.insere(item34);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela31.registros = itemArray37;
        int int39 = tabela31.n;
        tabela31.n = (short) 0;
        tabela31.n = (short) 0;
        tabela31.n = (byte) -1;
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela31.registros = itemArray47;
        tabela22.registros = itemArray47;
        tabela12.registros = itemArray47;
        tabela0.registros = itemArray47;
        tabela0.n = (short) -1;
        ds.Item item54 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int55 = tabela0.pesquisa(item54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        tabela8.n = 1;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela8.registros = itemArray13;
        ds.Item[] itemArray15 = tabela8.registros;
        ds.Item[] itemArray16 = tabela8.registros;
        tabela8.n = (byte) 0;
        ds.Item[] itemArray19 = tabela8.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        ds.Item item23 = null;
        tabela20.insere(item23);
        tabela20.n = 0;
        ds.Item[] itemArray27 = tabela20.registros;
        tabela8.registros = itemArray27;
        tabela0.registros = itemArray27;
        java.lang.Class<?> wildcardClass30 = itemArray27.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        tabela0.n = 1;
        ds.Item[] itemArray12 = tabela0.registros;
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 1;
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        int int17 = tabela0.n;
        tabela0.n = 5;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (short) 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela12.registros = itemArray18;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        ds.Item item23 = null;
        tabela20.insere(item23);
        ds.Item item25 = null;
        tabela20.insere(item25);
        ds.Item[] itemArray27 = tabela20.registros;
        tabela12.registros = itemArray27;
        ds.Item[] itemArray29 = tabela12.registros;
        ds.Item[] itemArray30 = tabela12.registros;
        tabela0.registros = itemArray30;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = (short) 0;
        ds.Item item6 = null;
        tabela3.insere(item6);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela3.registros = itemArray9;
        tabela0.registros = itemArray9;
        tabela0.n = (byte) 0;
        int int14 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = 100;
        tabela0.n = 'a';
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = '4';
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item[] itemArray19 = tabela12.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        ds.Item item23 = null;
        tabela20.insere(item23);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        tabela20.registros = itemArray26;
        int int28 = tabela20.n;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = (short) 0;
        ds.Item item32 = null;
        tabela29.insere(item32);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela29.registros = itemArray35;
        int int37 = tabela29.n;
        tabela29.n = (short) 0;
        tabela29.n = (short) 0;
        tabela29.n = (byte) -1;
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela29.registros = itemArray45;
        tabela20.registros = itemArray45;
        ds.Tabela tabela48 = new ds.Tabela();
        tabela48.n = (short) 0;
        tabela48.n = 1;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela48.registros = itemArray53;
        tabela20.registros = itemArray53;
        tabela12.registros = itemArray53;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        ds.Item item63 = null;
        tabela60.insere(item63);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela60.registros = itemArray66;
        tabela57.registros = itemArray66;
        tabela12.registros = itemArray66;
        tabela0.registros = itemArray66;
        tabela0.n = (byte) 10;
        tabela0.n = (byte) 100;
        tabela0.n = 0;
        ds.Item item77 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item77);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = (short) 0;
        ds.Item item6 = null;
        tabela3.insere(item6);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela3.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = (short) 0;
        tabela13.n = 1;
        ds.Item[] itemArray18 = new ds.Item[] {};
        tabela13.registros = itemArray18;
        ds.Item[] itemArray20 = tabela13.registros;
        ds.Item[] itemArray21 = tabela13.registros;
        tabela13.n = (byte) 0;
        ds.Item item24 = null;
        int int25 = tabela13.binaria(item24);
        ds.Tabela tabela26 = new ds.Tabela();
        int int27 = tabela26.n;
        ds.Item[] itemArray28 = tabela26.registros;
        tabela13.registros = itemArray28;
        ds.Item[] itemArray30 = tabela13.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = (short) 0;
        ds.Item item34 = null;
        tabela31.insere(item34);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela31.registros = itemArray37;
        int int39 = tabela31.n;
        tabela31.n = (short) 0;
        tabela31.n = (short) 0;
        tabela31.n = (byte) -1;
        ds.Item item46 = null;
        tabela31.insere(item46);
        tabela31.n = (byte) 10;
        tabela31.n = 2;
        ds.Item[] itemArray52 = tabela31.registros;
        tabela13.registros = itemArray52;
        tabela13.n = (byte) 100;
        ds.Item[] itemArray56 = tabela13.registros;
        tabela0.registros = itemArray56;
        tabela0.n = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 1;
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        int int17 = tabela0.n;
        tabela0.n = 5;
        int int20 = tabela0.n;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.binaria(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = (short) 0;
        tabela4.n = 1;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela4.registros = itemArray9;
        ds.Item[] itemArray11 = tabela4.registros;
        ds.Item[] itemArray12 = tabela4.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        int int19 = tabela0.n;
        tabela0.n = (short) 0;
        ds.Item[] itemArray22 = tabela0.registros;
        java.lang.Class<?> wildcardClass23 = itemArray22.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = (short) 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        tabela9.registros = itemArray15;
        int int17 = tabela9.n;
        tabela9.n = (short) 0;
        tabela9.n = (short) 0;
        tabela9.n = (byte) -1;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela9.registros = itemArray25;
        tabela0.registros = itemArray25;
        tabela0.n = (short) 0;
        int int30 = tabela0.n;
        ds.Item item31 = null;
        int int32 = tabela0.binaria(item31);
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.pesquisa(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        tabela8.n = 1;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela8.registros = itemArray13;
        ds.Item[] itemArray15 = tabela8.registros;
        ds.Item[] itemArray16 = tabela8.registros;
        tabela8.n = (byte) 0;
        ds.Item[] itemArray19 = tabela8.registros;
        tabela0.registros = itemArray19;
        ds.Item item21 = null;
        int int22 = tabela0.binaria(item21);
        ds.Item[] itemArray23 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        int int7 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = (byte) 0;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = (short) 0;
        ds.Item item21 = null;
        tabela18.insere(item21);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela18.registros = itemArray24;
        tabela15.registros = itemArray24;
        int int27 = tabela15.n;
        ds.Item[] itemArray28 = tabela15.registros;
        tabela0.registros = itemArray28;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = 100;
        tabela0.n = '#';
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = (short) 0;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela10.registros = itemArray16;
        int int18 = tabela10.n;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = (short) 0;
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela19.registros = itemArray25;
        int int27 = tabela19.n;
        tabela19.n = (short) 0;
        tabela19.n = (short) 0;
        tabela19.n = (byte) -1;
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela19.registros = itemArray35;
        tabela10.registros = itemArray35;
        tabela0.registros = itemArray35;
        ds.Item[] itemArray39 = tabela0.registros;
        tabela0.n = (byte) 1;
        int int42 = tabela0.n;
        ds.Item[] itemArray43 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 0;
        ds.Item[] itemArray4 = tabela0.registros;
        java.lang.Class<?> wildcardClass5 = itemArray4.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        int int7 = tabela0.n;
        tabela0.n = '4';
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = (short) 0;
        ds.Item item13 = null;
        tabela10.insere(item13);
        tabela10.n = 0;
        tabela10.n = 2;
        ds.Item item19 = null;
        tabela10.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = (short) 0;
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        tabela21.registros = itemArray27;
        int int29 = tabela21.n;
        tabela21.n = (short) 0;
        tabela21.n = (short) 0;
        tabela21.n = (byte) -1;
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela21.registros = itemArray37;
        int int39 = tabela21.n;
        ds.Item[] itemArray40 = tabela21.registros;
        tabela10.registros = itemArray40;
        tabela0.registros = itemArray40;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = (short) 0;
        ds.Item item6 = null;
        tabela3.insere(item6);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela3.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 10;
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        int int24 = tabela16.n;
        tabela16.n = (short) 0;
        tabela16.n = (short) 0;
        tabela16.n = (byte) -1;
        int int31 = tabela16.n;
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = (short) 0;
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela32.registros = itemArray38;
        int int40 = tabela32.n;
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = (short) 0;
        ds.Item item44 = null;
        tabela41.insere(item44);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela41.registros = itemArray47;
        int int49 = tabela41.n;
        tabela41.n = (short) 0;
        tabela41.n = (short) 0;
        tabela41.n = (byte) -1;
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        tabela41.registros = itemArray57;
        tabela32.registros = itemArray57;
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        tabela60.n = 1;
        ds.Item[] itemArray65 = new ds.Item[] {};
        tabela60.registros = itemArray65;
        tabela32.registros = itemArray65;
        tabela16.registros = itemArray65;
        tabela0.registros = itemArray65;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = (short) 0;
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela13.registros = itemArray19;
        tabela10.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        ds.Item item25 = null;
        int int26 = tabela23.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = (short) 0;
        tabela27.n = 1;
        ds.Item[] itemArray32 = new ds.Item[] {};
        tabela27.registros = itemArray32;
        ds.Item[] itemArray34 = tabela27.registros;
        ds.Item[] itemArray35 = tabela27.registros;
        tabela23.registros = itemArray35;
        tabela0.registros = itemArray35;
        java.lang.Class<?> wildcardClass38 = itemArray35.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        tabela2.n = (short) 0;
        tabela2.n = 1;
        ds.Item item7 = null;
        tabela2.insere(item7);
        tabela2.n = 1;
        ds.Item[] itemArray11 = tabela2.registros;
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        ds.Item item19 = null;
        int int20 = tabela16.binaria(item19);
        ds.Item item21 = null;
        int int22 = tabela16.binaria(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = (short) 0;
        tabela23.n = 1;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela23.registros = itemArray28;
        ds.Item[] itemArray30 = tabela23.registros;
        ds.Item[] itemArray31 = tabela23.registros;
        tabela23.n = (byte) 0;
        ds.Item item34 = null;
        int int35 = tabela23.binaria(item34);
        ds.Tabela tabela36 = new ds.Tabela();
        int int37 = tabela36.n;
        ds.Item[] itemArray38 = tabela36.registros;
        tabela23.registros = itemArray38;
        ds.Item[] itemArray40 = tabela23.registros;
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = (short) 0;
        ds.Item item44 = null;
        tabela41.insere(item44);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela41.registros = itemArray47;
        int int49 = tabela41.n;
        tabela41.n = (short) 0;
        tabela41.n = (short) 0;
        tabela41.n = (byte) -1;
        ds.Item item56 = null;
        tabela41.insere(item56);
        tabela41.n = (byte) 10;
        tabela41.n = 2;
        ds.Item[] itemArray62 = tabela41.registros;
        tabela23.registros = itemArray62;
        tabela23.n = (byte) 100;
        ds.Item[] itemArray66 = tabela23.registros;
        tabela16.registros = itemArray66;
        tabela0.registros = itemArray66;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = (short) 0;
        int int14 = tabela0.n;
        int int15 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        tabela8.n = 1;
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item item15 = null;
        tabela8.insere(item15);
        int int17 = tabela8.n;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = (short) 0;
        ds.Item item21 = null;
        tabela18.insere(item21);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela18.registros = itemArray24;
        int int26 = tabela18.n;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = (short) 0;
        ds.Item item30 = null;
        tabela27.insere(item30);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela27.registros = itemArray33;
        int int35 = tabela27.n;
        tabela27.n = (short) 0;
        tabela27.n = (short) 0;
        tabela27.n = (byte) -1;
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        tabela27.registros = itemArray43;
        tabela18.registros = itemArray43;
        tabela8.registros = itemArray43;
        tabela0.registros = itemArray43;
        tabela0.n = (short) 10;
        java.lang.Class<?> wildcardClass50 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        int int19 = tabela12.n;
        ds.Item item20 = null;
        tabela12.insere(item20);
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = (short) 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela25.registros = itemArray31;
        tabela22.registros = itemArray31;
        tabela12.registros = itemArray31;
        int int35 = tabela12.n;
        ds.Item[] itemArray36 = tabela12.registros;
        tabela12.n = (short) 1;
        int int39 = tabela12.n;
        ds.Item[] itemArray40 = tabela12.registros;
        tabela0.registros = itemArray40;
        ds.Item item42 = null;
        int int43 = tabela0.binaria(item42);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (byte) 100;
        tabela0.n = (byte) 0;
        int int9 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        tabela0.n = (short) 1;
        int int12 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        tabela2.n = (short) 0;
        tabela2.n = 1;
        ds.Item item7 = null;
        tabela2.insere(item7);
        tabela2.n = 1;
        ds.Item[] itemArray11 = tabela2.registros;
        tabela0.registros = itemArray11;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = '4';
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item[] itemArray19 = tabela12.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        ds.Item item23 = null;
        tabela20.insere(item23);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        tabela20.registros = itemArray26;
        int int28 = tabela20.n;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = (short) 0;
        ds.Item item32 = null;
        tabela29.insere(item32);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela29.registros = itemArray35;
        int int37 = tabela29.n;
        tabela29.n = (short) 0;
        tabela29.n = (short) 0;
        tabela29.n = (byte) -1;
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela29.registros = itemArray45;
        tabela20.registros = itemArray45;
        ds.Tabela tabela48 = new ds.Tabela();
        tabela48.n = (short) 0;
        tabela48.n = 1;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela48.registros = itemArray53;
        tabela20.registros = itemArray53;
        tabela12.registros = itemArray53;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        ds.Item item63 = null;
        tabela60.insere(item63);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela60.registros = itemArray66;
        tabela57.registros = itemArray66;
        tabela12.registros = itemArray66;
        tabela0.registros = itemArray66;
        tabela0.n = (byte) 10;
        int int73 = tabela0.n;
        int int74 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 10 + "'", int74 == 10);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        tabela8.n = 1;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela8.registros = itemArray13;
        ds.Item[] itemArray15 = tabela8.registros;
        ds.Item[] itemArray16 = tabela8.registros;
        tabela8.n = (byte) 0;
        ds.Item[] itemArray19 = tabela8.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        ds.Item item23 = null;
        tabela20.insere(item23);
        tabela20.n = 0;
        ds.Item[] itemArray27 = tabela20.registros;
        tabela8.registros = itemArray27;
        tabela0.registros = itemArray27;
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela0.registros = itemArray31;
        java.lang.Class<?> wildcardClass33 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = 100;
        int int15 = tabela0.n;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        tabela16.n = 1;
        ds.Item item21 = null;
        tabela16.insere(item21);
        ds.Item item23 = null;
        tabela16.insere(item23);
        tabela16.n = (short) 10;
        int int27 = tabela16.n;
        int int28 = tabela16.n;
        tabela16.n = (byte) 10;
        ds.Item[] itemArray31 = tabela16.registros;
        tabela0.registros = itemArray31;
        ds.Item[] itemArray33 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = 10;
        tabela0.n = 10;
        tabela0.n = (byte) -1;
        int int9 = tabela0.n;
        tabela0.n = 52;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        int int19 = tabela12.n;
        ds.Item item20 = null;
        tabela12.insere(item20);
        tabela12.n = '4';
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = (short) 0;
        tabela24.n = 1;
        ds.Item item29 = null;
        tabela24.insere(item29);
        ds.Item[] itemArray31 = tabela24.registros;
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = (short) 0;
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela32.registros = itemArray38;
        int int40 = tabela32.n;
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = (short) 0;
        ds.Item item44 = null;
        tabela41.insere(item44);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela41.registros = itemArray47;
        int int49 = tabela41.n;
        tabela41.n = (short) 0;
        tabela41.n = (short) 0;
        tabela41.n = (byte) -1;
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        tabela41.registros = itemArray57;
        tabela32.registros = itemArray57;
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        tabela60.n = 1;
        ds.Item[] itemArray65 = new ds.Item[] {};
        tabela60.registros = itemArray65;
        tabela32.registros = itemArray65;
        tabela24.registros = itemArray65;
        ds.Tabela tabela69 = new ds.Tabela();
        ds.Item item70 = null;
        int int71 = tabela69.binaria(item70);
        ds.Tabela tabela72 = new ds.Tabela();
        tabela72.n = (short) 0;
        ds.Item item75 = null;
        tabela72.insere(item75);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        tabela72.registros = itemArray78;
        tabela69.registros = itemArray78;
        tabela24.registros = itemArray78;
        tabela12.registros = itemArray78;
        tabela12.n = (byte) 10;
        ds.Tabela tabela85 = new ds.Tabela();
        tabela85.n = (short) 0;
        tabela85.n = 1;
        ds.Item[] itemArray90 = new ds.Item[] {};
        tabela85.registros = itemArray90;
        ds.Item[] itemArray92 = tabela85.registros;
        int int93 = tabela85.n;
        int int94 = tabela85.n;
        ds.Item[] itemArray95 = tabela85.registros;
        tabela12.registros = itemArray95;
        tabela0.registros = itemArray95;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray90);
        org.junit.Assert.assertNotNull(itemArray92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(itemArray95);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        tabela0.n = 1;
        tabela0.n = (short) 1;
        int int14 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        tabela0.n = 0;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 0;
        int int7 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = (short) 0;
        tabela19.n = 1;
        ds.Item[] itemArray24 = new ds.Item[] {};
        tabela19.registros = itemArray24;
        ds.Item[] itemArray26 = tabela19.registros;
        tabela19.n = (short) 0;
        tabela19.n = 'a';
        int int31 = tabela19.n;
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = (short) 0;
        tabela32.n = 1;
        ds.Item item37 = null;
        tabela32.insere(item37);
        ds.Item item39 = null;
        tabela32.insere(item39);
        tabela32.n = 1;
        ds.Item[] itemArray43 = tabela32.registros;
        tabela19.registros = itemArray43;
        tabela12.registros = itemArray43;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        ds.Item item48 = null;
        int int49 = tabela0.binaria(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = (short) 0;
        ds.Item item53 = null;
        tabela50.insere(item53);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        tabela50.registros = itemArray56;
        int int58 = tabela50.n;
        tabela50.n = (short) 0;
        tabela50.n = (short) 0;
        ds.Item[] itemArray63 = tabela50.registros;
        ds.Item[] itemArray64 = tabela50.registros;
        ds.Item[] itemArray65 = tabela50.registros;
        tabela0.registros = itemArray65;
        ds.Item item67 = null;
        int int68 = tabela0.binaria(item67);
        ds.Item item69 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item69);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = (short) 0;
        ds.Item item21 = null;
        tabela18.insere(item21);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela18.registros = itemArray24;
        int int26 = tabela18.n;
        tabela18.n = (short) 0;
        tabela18.n = (short) 0;
        tabela18.n = (byte) -1;
        ds.Item item33 = null;
        tabela18.insere(item33);
        tabela18.n = (byte) 10;
        tabela18.n = 2;
        ds.Item[] itemArray39 = tabela18.registros;
        tabela0.registros = itemArray39;
        tabela0.n = (byte) 100;
        ds.Item item43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = tabela0.pesquisa(item43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = (short) 0;
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela13.registros = itemArray19;
        tabela10.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int23 = tabela0.n;
        ds.Item[] itemArray24 = tabela0.registros;
        tabela0.n = (short) 1;
        int int27 = tabela0.n;
        ds.Item[] itemArray28 = tabela0.registros;
        ds.Item[] itemArray29 = tabela0.registros;
        tabela0.n = 3;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (short) 0;
        int int7 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = (short) 0;
        tabela9.n = 1;
        ds.Item[] itemArray14 = new ds.Item[] {};
        tabela9.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        int int24 = tabela16.n;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = (short) 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela25.registros = itemArray31;
        int int33 = tabela25.n;
        tabela25.n = (short) 0;
        tabela25.n = (short) 0;
        tabela25.n = (byte) -1;
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        tabela25.registros = itemArray41;
        tabela16.registros = itemArray41;
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = (short) 0;
        tabela44.n = 1;
        ds.Item[] itemArray49 = new ds.Item[] {};
        tabela44.registros = itemArray49;
        tabela16.registros = itemArray49;
        tabela9.registros = itemArray49;
        tabela0.registros = itemArray49;
        ds.Item[] itemArray54 = tabela0.registros;
        ds.Item item55 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        int int10 = tabela0.n;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        tabela11.n = 1;
        ds.Item item16 = null;
        tabela11.insere(item16);
        int int18 = tabela11.n;
        ds.Item item19 = null;
        tabela11.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = (short) 0;
        ds.Item item27 = null;
        tabela24.insere(item27);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        tabela24.registros = itemArray30;
        tabela21.registros = itemArray30;
        tabela11.registros = itemArray30;
        int int34 = tabela11.n;
        ds.Item[] itemArray35 = tabela11.registros;
        tabela11.n = (short) 1;
        int int38 = tabela11.n;
        ds.Item[] itemArray39 = tabela11.registros;
        ds.Item[] itemArray40 = tabela11.registros;
        tabela0.registros = itemArray40;
        java.lang.Class<?> wildcardClass42 = itemArray40.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        int int10 = tabela0.n;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        tabela11.n = 1;
        ds.Item[] itemArray16 = new ds.Item[] {};
        tabela11.registros = itemArray16;
        ds.Item[] itemArray18 = tabela11.registros;
        ds.Item[] itemArray19 = tabela11.registros;
        tabela11.n = (byte) 0;
        ds.Item item22 = null;
        int int23 = tabela11.binaria(item22);
        ds.Tabela tabela24 = new ds.Tabela();
        int int25 = tabela24.n;
        ds.Item[] itemArray26 = tabela24.registros;
        tabela11.registros = itemArray26;
        ds.Item[] itemArray28 = tabela11.registros;
        tabela0.registros = itemArray28;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela12.registros = itemArray18;
        int int20 = tabela12.n;
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = (short) 0;
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        tabela21.registros = itemArray27;
        int int29 = tabela21.n;
        tabela21.n = (short) 0;
        tabela21.n = (short) 0;
        tabela21.n = (byte) -1;
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela21.registros = itemArray37;
        tabela12.registros = itemArray37;
        tabela12.n = (short) 0;
        ds.Tabela tabela42 = new ds.Tabela();
        tabela42.n = (short) 0;
        tabela42.n = 1;
        ds.Item item47 = null;
        tabela42.insere(item47);
        int int49 = tabela42.n;
        ds.Item item50 = null;
        tabela42.insere(item50);
        ds.Tabela tabela52 = new ds.Tabela();
        ds.Item item53 = null;
        int int54 = tabela52.binaria(item53);
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = (short) 0;
        ds.Item item58 = null;
        tabela55.insere(item58);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        tabela55.registros = itemArray61;
        tabela52.registros = itemArray61;
        tabela42.registros = itemArray61;
        int int65 = tabela42.n;
        ds.Item[] itemArray66 = tabela42.registros;
        ds.Item[] itemArray67 = tabela42.registros;
        tabela12.registros = itemArray67;
        tabela0.registros = itemArray67;
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = (short) 0;
        tabela17.n = 1;
        ds.Item item22 = null;
        tabela17.insere(item22);
        ds.Item item24 = null;
        tabela17.insere(item24);
        tabela17.n = 1;
        ds.Item[] itemArray28 = tabela17.registros;
        ds.Item[] itemArray29 = tabela17.registros;
        tabela0.registros = itemArray29;
        int int31 = tabela0.n;
        tabela0.n = 4;
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = (short) 0;
        ds.Item item37 = null;
        tabela34.insere(item37);
        ds.Item item39 = null;
        tabela34.insere(item39);
        ds.Item[] itemArray41 = tabela34.registros;
        int int42 = tabela34.n;
        int int43 = tabela34.n;
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = (short) 0;
        ds.Item item47 = null;
        tabela44.insere(item47);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        tabela44.registros = itemArray50;
        int int52 = tabela44.n;
        tabela44.n = (short) 0;
        tabela44.n = (short) 0;
        tabela44.n = (byte) -1;
        int int59 = tabela44.n;
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        ds.Item item63 = null;
        tabela60.insere(item63);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela60.registros = itemArray66;
        int int68 = tabela60.n;
        ds.Tabela tabela69 = new ds.Tabela();
        tabela69.n = (short) 0;
        ds.Item item72 = null;
        tabela69.insere(item72);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        tabela69.registros = itemArray75;
        int int77 = tabela69.n;
        tabela69.n = (short) 0;
        tabela69.n = (short) 0;
        tabela69.n = (byte) -1;
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        tabela69.registros = itemArray85;
        tabela60.registros = itemArray85;
        ds.Tabela tabela88 = new ds.Tabela();
        tabela88.n = (short) 0;
        tabela88.n = 1;
        ds.Item[] itemArray93 = new ds.Item[] {};
        tabela88.registros = itemArray93;
        tabela60.registros = itemArray93;
        tabela44.registros = itemArray93;
        tabela34.registros = itemArray93;
        tabela0.registros = itemArray93;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray93);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = (short) 0;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela10.registros = itemArray16;
        int int18 = tabela10.n;
        tabela10.n = (short) 0;
        tabela10.n = (short) 0;
        ds.Item[] itemArray23 = tabela10.registros;
        tabela0.registros = itemArray23;
        tabela0.n = (byte) -1;
        tabela0.n = (-1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) -1;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = (short) 0;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela10.registros = itemArray16;
        int int18 = tabela10.n;
        tabela10.n = (short) 0;
        tabela10.n = (short) 0;
        ds.Item[] itemArray23 = tabela10.registros;
        tabela0.registros = itemArray23;
        tabela0.n = 0;
        tabela0.n = 4;
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = (short) 0;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela10.registros = itemArray16;
        int int18 = tabela10.n;
        tabela10.n = (short) 0;
        tabela10.n = (short) 0;
        ds.Item[] itemArray23 = tabela10.registros;
        tabela0.registros = itemArray23;
        tabela0.n = 0;
        int int27 = tabela0.n;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = (short) 0;
        tabela28.n = 1;
        ds.Item item33 = null;
        tabela28.insere(item33);
        int int35 = tabela28.n;
        ds.Item item36 = null;
        tabela28.insere(item36);
        tabela28.n = '4';
        ds.Item[] itemArray40 = tabela28.registros;
        tabela0.registros = itemArray40;
        ds.Item item42 = null;
        tabela0.insere(item42);
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = (short) 0;
        tabela44.n = 1;
        ds.Item item49 = null;
        tabela44.insere(item49);
        ds.Item item51 = null;
        tabela44.insere(item51);
        tabela44.n = 1;
        ds.Item[] itemArray55 = tabela44.registros;
        ds.Item[] itemArray56 = tabela44.registros;
        tabela0.registros = itemArray56;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = (short) 0;
        ds.Item item21 = null;
        tabela18.insere(item21);
        tabela18.n = 0;
        ds.Item[] itemArray25 = tabela18.registros;
        tabela0.registros = itemArray25;
        int int27 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = (short) 0;
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela13.registros = itemArray19;
        tabela10.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int23 = tabela0.n;
        ds.Item[] itemArray24 = tabela0.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = (short) 0;
        ds.Item item31 = null;
        tabela28.insere(item31);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        tabela28.registros = itemArray34;
        tabela25.registros = itemArray34;
        tabela0.registros = itemArray34;
        ds.Item[] itemArray38 = tabela0.registros;
        ds.Item[] itemArray39 = null;
        tabela0.registros = itemArray39;
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item item42 = null;
        int int43 = tabela41.binaria(item42);
        ds.Item item44 = null;
        tabela41.insere(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        tabela46.n = (short) 0;
        tabela46.n = 1;
        ds.Tabela tabela51 = new ds.Tabela();
        tabela51.n = (short) 0;
        ds.Item item54 = null;
        tabela51.insere(item54);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        tabela51.registros = itemArray57;
        int int59 = tabela51.n;
        tabela51.n = (short) 0;
        tabela51.n = (short) 0;
        ds.Item[] itemArray64 = tabela51.registros;
        ds.Item[] itemArray65 = tabela51.registros;
        tabela46.registros = itemArray65;
        ds.Item[] itemArray67 = tabela46.registros;
        tabela41.registros = itemArray67;
        tabela0.registros = itemArray67;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        tabela0.n = 4;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela11.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = (short) 0;
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Item item24 = null;
        tabela19.insere(item24);
        ds.Item[] itemArray26 = tabela19.registros;
        tabela11.registros = itemArray26;
        ds.Item[] itemArray28 = tabela11.registros;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = (short) 0;
        ds.Item item32 = null;
        tabela29.insere(item32);
        tabela29.n = 0;
        ds.Item[] itemArray36 = tabela29.registros;
        tabela11.registros = itemArray36;
        tabela11.n = (short) 10;
        ds.Item[] itemArray40 = tabela11.registros;
        tabela0.registros = itemArray40;
        ds.Item[] itemArray42 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = 10;
        tabela0.n = 10;
        tabela0.n = (byte) -1;
        int int9 = tabela0.n;
        tabela0.n = 52;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = (short) 0;
        tabela19.n = 1;
        ds.Item[] itemArray24 = new ds.Item[] {};
        tabela19.registros = itemArray24;
        ds.Item[] itemArray26 = tabela19.registros;
        tabela19.n = (short) 0;
        tabela19.n = 'a';
        int int31 = tabela19.n;
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = (short) 0;
        tabela32.n = 1;
        ds.Item item37 = null;
        tabela32.insere(item37);
        ds.Item item39 = null;
        tabela32.insere(item39);
        tabela32.n = 1;
        ds.Item[] itemArray43 = tabela32.registros;
        tabela19.registros = itemArray43;
        tabela12.registros = itemArray43;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        tabela0.n = '4';
        int int50 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = (short) 0;
        ds.Item item6 = null;
        tabela3.insere(item6);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela3.registros = itemArray9;
        tabela0.registros = itemArray9;
        tabela0.n = (byte) 0;
        tabela0.n = (byte) 10;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = (short) 0;
        tabela19.n = 1;
        ds.Item[] itemArray24 = new ds.Item[] {};
        tabela19.registros = itemArray24;
        ds.Item[] itemArray26 = tabela19.registros;
        tabela19.n = (short) 0;
        tabela19.n = 'a';
        int int31 = tabela19.n;
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = (short) 0;
        tabela32.n = 1;
        ds.Item item37 = null;
        tabela32.insere(item37);
        ds.Item item39 = null;
        tabela32.insere(item39);
        tabela32.n = 1;
        ds.Item[] itemArray43 = tabela32.registros;
        tabela19.registros = itemArray43;
        tabela12.registros = itemArray43;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        ds.Item item48 = null;
        int int49 = tabela0.binaria(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = (short) 0;
        ds.Item item53 = null;
        tabela50.insere(item53);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        tabela50.registros = itemArray56;
        ds.Tabela tabela58 = new ds.Tabela();
        tabela58.n = (short) 0;
        ds.Item item61 = null;
        tabela58.insere(item61);
        ds.Item item63 = null;
        tabela58.insere(item63);
        ds.Item[] itemArray65 = tabela58.registros;
        tabela50.registros = itemArray65;
        ds.Item[] itemArray67 = tabela50.registros;
        ds.Tabela tabela68 = new ds.Tabela();
        tabela68.n = (short) 0;
        ds.Item item71 = null;
        tabela68.insere(item71);
        tabela68.n = 0;
        ds.Item[] itemArray75 = tabela68.registros;
        tabela50.registros = itemArray75;
        tabela0.registros = itemArray75;
        tabela0.n = 1;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray75);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 0;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = (short) 0;
        tabela7.n = 1;
        ds.Item item12 = null;
        tabela7.insere(item12);
        int int14 = tabela7.n;
        ds.Item item15 = null;
        tabela7.insere(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = (short) 0;
        ds.Item item20 = null;
        tabela17.insere(item20);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela17.registros = itemArray23;
        int int25 = tabela17.n;
        tabela17.n = (short) 0;
        tabela17.n = (short) 0;
        ds.Item[] itemArray30 = tabela17.registros;
        tabela7.registros = itemArray30;
        tabela7.n = (byte) -1;
        ds.Item[] itemArray34 = tabela7.registros;
        tabela0.registros = itemArray34;
        ds.Item[] itemArray36 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = 2;
        ds.Item item11 = null;
        tabela0.insere(item11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        tabela2.n = (short) 0;
        tabela2.n = 1;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = (short) 0;
        ds.Item item10 = null;
        tabela7.insere(item10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela7.registros = itemArray13;
        int int15 = tabela7.n;
        tabela7.n = (short) 0;
        tabela7.n = (short) 0;
        ds.Item[] itemArray20 = tabela7.registros;
        ds.Item[] itemArray21 = tabela7.registros;
        tabela2.registros = itemArray21;
        tabela0.registros = itemArray21;
        tabela0.n = (byte) -1;
        ds.Item item26 = null;
        tabela0.insere(item26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        int int12 = tabela0.n;
        int int13 = tabela0.n;
        int int14 = tabela0.n;
        ds.Item[] itemArray15 = tabela0.registros;
        int int16 = tabela0.n;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = (short) 0;
        ds.Item item20 = null;
        tabela17.insere(item20);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela17.registros = itemArray23;
        int int25 = tabela17.n;
        tabela17.n = (short) 0;
        tabela17.n = (short) 0;
        tabela17.n = (byte) -1;
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela17.registros = itemArray33;
        tabela0.registros = itemArray33;
        int int36 = tabela0.n;
        ds.Item[] itemArray37 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = 10;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        tabela0.registros = itemArray13;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = (short) 0;
        tabela19.n = 1;
        ds.Item[] itemArray24 = new ds.Item[] {};
        tabela19.registros = itemArray24;
        ds.Item[] itemArray26 = tabela19.registros;
        tabela19.n = (short) 0;
        tabela19.n = 'a';
        int int31 = tabela19.n;
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = (short) 0;
        tabela32.n = 1;
        ds.Item item37 = null;
        tabela32.insere(item37);
        ds.Item item39 = null;
        tabela32.insere(item39);
        tabela32.n = 1;
        ds.Item[] itemArray43 = tabela32.registros;
        tabela19.registros = itemArray43;
        tabela12.registros = itemArray43;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        ds.Item item48 = null;
        int int49 = tabela0.binaria(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = (short) 0;
        ds.Item item53 = null;
        tabela50.insere(item53);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        tabela50.registros = itemArray56;
        ds.Tabela tabela58 = new ds.Tabela();
        tabela58.n = (short) 0;
        ds.Item item61 = null;
        tabela58.insere(item61);
        ds.Item item63 = null;
        tabela58.insere(item63);
        ds.Item[] itemArray65 = tabela58.registros;
        tabela50.registros = itemArray65;
        ds.Item[] itemArray67 = tabela50.registros;
        ds.Tabela tabela68 = new ds.Tabela();
        tabela68.n = (short) 0;
        ds.Item item71 = null;
        tabela68.insere(item71);
        tabela68.n = 0;
        ds.Item[] itemArray75 = tabela68.registros;
        tabela50.registros = itemArray75;
        tabela0.registros = itemArray75;
        ds.Item item78 = null;
        int int79 = tabela0.binaria(item78);
        java.lang.Class<?> wildcardClass80 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = (short) 0;
        int int14 = tabela0.n;
        tabela0.n = (short) 0;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = '4';
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = (short) 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        tabela9.registros = itemArray15;
        int int17 = tabela9.n;
        tabela9.n = (short) 0;
        tabela9.n = (short) 0;
        tabela9.n = (byte) -1;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela9.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        tabela0.n = 0;
        int int19 = tabela0.n;
        ds.Item item20 = null;
        tabela0.insere(item20);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        tabela0.n = 4;
        int int11 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        int int19 = tabela0.n;
        tabela0.n = (short) 0;
        ds.Item[] itemArray22 = tabela0.registros;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        tabela2.n = (short) 0;
        tabela2.n = 1;
        ds.Item item7 = null;
        tabela2.insere(item7);
        tabela2.n = 1;
        ds.Item[] itemArray11 = tabela2.registros;
        tabela0.registros = itemArray11;
        tabela0.n = 100;
        int int15 = tabela0.n;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.binaria(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 'a';
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = (short) 0;
        tabela6.n = 1;
        ds.Item item11 = null;
        tabela6.insere(item11);
        ds.Item item13 = null;
        tabela6.insere(item13);
        tabela6.n = (short) 10;
        ds.Item[] itemArray17 = tabela6.registros;
        ds.Item[] itemArray18 = tabela6.registros;
        tabela0.registros = itemArray18;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = (short) 0;
        ds.Item item10 = null;
        tabela7.insere(item10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela7.registros = itemArray13;
        int int15 = tabela7.n;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        int int24 = tabela16.n;
        tabela16.n = (short) 0;
        tabela16.n = (short) 0;
        tabela16.n = (byte) -1;
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela16.registros = itemArray32;
        tabela7.registros = itemArray32;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = (short) 0;
        tabela35.n = 1;
        ds.Item[] itemArray40 = new ds.Item[] {};
        tabela35.registros = itemArray40;
        tabela7.registros = itemArray40;
        tabela0.registros = itemArray40;
        ds.Item[] itemArray44 = tabela0.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        tabela45.n = (short) 0;
        tabela45.n = 1;
        ds.Item item50 = null;
        tabela45.insere(item50);
        int int52 = tabela45.n;
        ds.Item item53 = null;
        tabela45.insere(item53);
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        int int57 = tabela55.binaria(item56);
        ds.Tabela tabela58 = new ds.Tabela();
        tabela58.n = (short) 0;
        ds.Item item61 = null;
        tabela58.insere(item61);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        tabela58.registros = itemArray64;
        tabela55.registros = itemArray64;
        tabela45.registros = itemArray64;
        int int68 = tabela45.n;
        ds.Item[] itemArray69 = tabela45.registros;
        ds.Tabela tabela70 = new ds.Tabela();
        ds.Item item71 = null;
        int int72 = tabela70.binaria(item71);
        ds.Tabela tabela73 = new ds.Tabela();
        tabela73.n = (short) 0;
        ds.Item item76 = null;
        tabela73.insere(item76);
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        tabela73.registros = itemArray79;
        tabela70.registros = itemArray79;
        tabela45.registros = itemArray79;
        ds.Item[] itemArray83 = tabela45.registros;
        tabela0.registros = itemArray83;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray83);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        tabela8.n = 1;
        ds.Item item13 = null;
        tabela8.insere(item13);
        int int15 = tabela8.n;
        ds.Item item16 = null;
        tabela8.insere(item16);
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = (short) 0;
        ds.Item item21 = null;
        tabela18.insere(item21);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela18.registros = itemArray24;
        int int26 = tabela18.n;
        tabela18.n = (short) 0;
        tabela18.n = (short) 0;
        ds.Item[] itemArray31 = tabela18.registros;
        tabela8.registros = itemArray31;
        tabela8.n = 0;
        int int35 = tabela8.n;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = (short) 0;
        tabela36.n = 1;
        ds.Item item41 = null;
        tabela36.insere(item41);
        int int43 = tabela36.n;
        ds.Item item44 = null;
        tabela36.insere(item44);
        tabela36.n = '4';
        ds.Item[] itemArray48 = tabela36.registros;
        tabela8.registros = itemArray48;
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = (short) 0;
        tabela50.n = 1;
        ds.Item item55 = null;
        tabela50.insere(item55);
        int int57 = tabela50.n;
        ds.Item item58 = null;
        tabela50.insere(item58);
        ds.Tabela tabela60 = new ds.Tabela();
        ds.Item item61 = null;
        int int62 = tabela60.binaria(item61);
        ds.Tabela tabela63 = new ds.Tabela();
        tabela63.n = (short) 0;
        ds.Item item66 = null;
        tabela63.insere(item66);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        tabela63.registros = itemArray69;
        tabela60.registros = itemArray69;
        tabela50.registros = itemArray69;
        int int73 = tabela50.n;
        ds.Item[] itemArray74 = tabela50.registros;
        ds.Tabela tabela75 = new ds.Tabela();
        ds.Item item76 = null;
        int int77 = tabela75.binaria(item76);
        ds.Tabela tabela78 = new ds.Tabela();
        tabela78.n = (short) 0;
        ds.Item item81 = null;
        tabela78.insere(item81);
        ds.Item item83 = null;
        ds.Item[] itemArray84 = new ds.Item[] { item83 };
        tabela78.registros = itemArray84;
        tabela75.registros = itemArray84;
        tabela50.registros = itemArray84;
        tabela8.registros = itemArray84;
        tabela0.registros = itemArray84;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item item17 = null;
        tabela12.insere(item17);
        int int19 = tabela12.n;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        tabela20.n = 1;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela20.registros = itemArray25;
        ds.Item[] itemArray27 = tabela20.registros;
        ds.Item[] itemArray28 = tabela20.registros;
        tabela20.n = (byte) 0;
        ds.Item[] itemArray31 = tabela20.registros;
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = (short) 0;
        ds.Item item35 = null;
        tabela32.insere(item35);
        tabela32.n = 0;
        ds.Item[] itemArray39 = tabela32.registros;
        tabela20.registros = itemArray39;
        tabela12.registros = itemArray39;
        tabela0.registros = itemArray39;
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        tabela0.n = 4;
        tabela0.n = (short) -1;
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = '4';
        ds.Item[] itemArray12 = tabela0.registros;
        tabela0.n = (-1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = (short) 0;
        ds.Item item6 = null;
        tabela3.insere(item6);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela3.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        ds.Item item15 = null;
        int int16 = tabela0.binaria(item15);
        tabela0.n = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        ds.Item[] itemArray9 = tabela0.registros;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = 1;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        tabela11.n = 1;
        ds.Item[] itemArray16 = new ds.Item[] {};
        tabela11.registros = itemArray16;
        ds.Item[] itemArray18 = tabela11.registros;
        tabela0.registros = itemArray18;
        int int20 = tabela0.n;
        ds.Item[] itemArray21 = tabela0.registros;
        tabela0.n = (short) 0;
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = '4';
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item[] itemArray19 = tabela12.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        ds.Item item23 = null;
        tabela20.insere(item23);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        tabela20.registros = itemArray26;
        int int28 = tabela20.n;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = (short) 0;
        ds.Item item32 = null;
        tabela29.insere(item32);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela29.registros = itemArray35;
        int int37 = tabela29.n;
        tabela29.n = (short) 0;
        tabela29.n = (short) 0;
        tabela29.n = (byte) -1;
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela29.registros = itemArray45;
        tabela20.registros = itemArray45;
        ds.Tabela tabela48 = new ds.Tabela();
        tabela48.n = (short) 0;
        tabela48.n = 1;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela48.registros = itemArray53;
        tabela20.registros = itemArray53;
        tabela12.registros = itemArray53;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        ds.Item item63 = null;
        tabela60.insere(item63);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela60.registros = itemArray66;
        tabela57.registros = itemArray66;
        tabela12.registros = itemArray66;
        tabela0.registros = itemArray66;
        ds.Item item71 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item71);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        tabela2.n = (short) 0;
        tabela2.n = 1;
        ds.Item item7 = null;
        tabela2.insere(item7);
        tabela2.n = 1;
        ds.Item[] itemArray11 = tabela2.registros;
        tabela0.registros = itemArray11;
        tabela0.n = 100;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela8.registros = itemArray14;
        int int16 = tabela8.n;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = (short) 0;
        ds.Item item20 = null;
        tabela17.insere(item20);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela17.registros = itemArray23;
        int int25 = tabela17.n;
        tabela17.n = (short) 0;
        tabela17.n = (short) 0;
        tabela17.n = (byte) -1;
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela17.registros = itemArray33;
        tabela8.registros = itemArray33;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = (short) 0;
        tabela36.n = 1;
        ds.Item[] itemArray41 = new ds.Item[] {};
        tabela36.registros = itemArray41;
        tabela8.registros = itemArray41;
        tabela0.registros = itemArray41;
        tabela0.n = '4';
        ds.Item[] itemArray47 = tabela0.registros;
        int int48 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = '4';
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item[] itemArray19 = tabela12.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        ds.Item item23 = null;
        tabela20.insere(item23);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        tabela20.registros = itemArray26;
        int int28 = tabela20.n;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = (short) 0;
        ds.Item item32 = null;
        tabela29.insere(item32);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela29.registros = itemArray35;
        int int37 = tabela29.n;
        tabela29.n = (short) 0;
        tabela29.n = (short) 0;
        tabela29.n = (byte) -1;
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela29.registros = itemArray45;
        tabela20.registros = itemArray45;
        ds.Tabela tabela48 = new ds.Tabela();
        tabela48.n = (short) 0;
        tabela48.n = 1;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela48.registros = itemArray53;
        tabela20.registros = itemArray53;
        tabela12.registros = itemArray53;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        ds.Item item63 = null;
        tabela60.insere(item63);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela60.registros = itemArray66;
        tabela57.registros = itemArray66;
        tabela12.registros = itemArray66;
        tabela0.registros = itemArray66;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray73 = tabela0.registros;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        tabela0.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = (short) 0;
        tabela14.n = 1;
        ds.Item item19 = null;
        tabela14.insere(item19);
        int int21 = tabela14.n;
        ds.Item item22 = null;
        tabela14.insere(item22);
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = (short) 0;
        ds.Item item27 = null;
        tabela24.insere(item27);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        tabela24.registros = itemArray30;
        int int32 = tabela24.n;
        tabela24.n = (short) 0;
        tabela24.n = (short) 0;
        ds.Item[] itemArray37 = tabela24.registros;
        tabela14.registros = itemArray37;
        tabela14.n = (byte) -1;
        ds.Item[] itemArray41 = tabela14.registros;
        ds.Item[] itemArray42 = tabela14.registros;
        tabela0.registros = itemArray42;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        tabela0.n = 0;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = '4';
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item[] itemArray19 = tabela12.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        ds.Item item23 = null;
        tabela20.insere(item23);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        tabela20.registros = itemArray26;
        int int28 = tabela20.n;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = (short) 0;
        ds.Item item32 = null;
        tabela29.insere(item32);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela29.registros = itemArray35;
        int int37 = tabela29.n;
        tabela29.n = (short) 0;
        tabela29.n = (short) 0;
        tabela29.n = (byte) -1;
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela29.registros = itemArray45;
        tabela20.registros = itemArray45;
        ds.Tabela tabela48 = new ds.Tabela();
        tabela48.n = (short) 0;
        tabela48.n = 1;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela48.registros = itemArray53;
        tabela20.registros = itemArray53;
        tabela12.registros = itemArray53;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        ds.Item item63 = null;
        tabela60.insere(item63);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela60.registros = itemArray66;
        tabela57.registros = itemArray66;
        tabela12.registros = itemArray66;
        tabela0.registros = itemArray66;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray73 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = (short) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        int int12 = tabela0.n;
        int int13 = tabela0.n;
        ds.Item[] itemArray14 = null;
        tabela0.registros = itemArray14;
        tabela0.n = ' ';
        ds.Item[] itemArray18 = tabela0.registros;
        int int19 = tabela0.n;
        tabela0.n = 0;
        ds.Item[] itemArray22 = tabela0.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = (short) 0;
        ds.Item item26 = null;
        tabela23.insere(item26);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        tabela23.registros = itemArray29;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = (short) 0;
        ds.Item item34 = null;
        tabela31.insere(item34);
        ds.Item item36 = null;
        tabela31.insere(item36);
        ds.Item[] itemArray38 = tabela31.registros;
        tabela23.registros = itemArray38;
        ds.Item[] itemArray40 = tabela23.registros;
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = (short) 0;
        ds.Item item44 = null;
        tabela41.insere(item44);
        tabela41.n = 0;
        ds.Item[] itemArray48 = tabela41.registros;
        tabela23.registros = itemArray48;
        tabela23.n = (byte) 0;
        ds.Item[] itemArray52 = tabela23.registros;
        tabela0.registros = itemArray52;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        tabela0.n = 32;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = 0;
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        int int19 = tabela0.n;
        int int20 = tabela0.n;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.binaria(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = 0;
        tabela0.n = 2;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        int int13 = tabela0.n;
        int int14 = tabela0.n;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        int int15 = tabela0.n;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        int int24 = tabela16.n;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = (short) 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela25.registros = itemArray31;
        int int33 = tabela25.n;
        tabela25.n = (short) 0;
        tabela25.n = (short) 0;
        tabela25.n = (byte) -1;
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        tabela25.registros = itemArray41;
        tabela16.registros = itemArray41;
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = (short) 0;
        tabela44.n = 1;
        ds.Item[] itemArray49 = new ds.Item[] {};
        tabela44.registros = itemArray49;
        tabela16.registros = itemArray49;
        tabela0.registros = itemArray49;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = (short) 0;
        tabela53.n = 1;
        ds.Item item58 = null;
        tabela53.insere(item58);
        ds.Item item60 = null;
        tabela53.insere(item60);
        tabela53.n = 1;
        ds.Item[] itemArray64 = tabela53.registros;
        tabela0.registros = itemArray64;
        int int66 = tabela0.n;
        ds.Item[] itemArray67 = tabela0.registros;
        int int68 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = (short) 0;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela10.registros = itemArray16;
        int int18 = tabela10.n;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = (short) 0;
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela19.registros = itemArray25;
        int int27 = tabela19.n;
        tabela19.n = (short) 0;
        tabela19.n = (short) 0;
        tabela19.n = (byte) -1;
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela19.registros = itemArray35;
        tabela10.registros = itemArray35;
        tabela0.registros = itemArray35;
        ds.Item[] itemArray39 = tabela0.registros;
        ds.Tabela tabela40 = new ds.Tabela();
        tabela40.n = (short) 0;
        ds.Item item43 = null;
        tabela40.insere(item43);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        tabela40.registros = itemArray46;
        int int48 = tabela40.n;
        tabela40.n = (short) 0;
        tabela40.n = (short) 1;
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        tabela40.registros = itemArray54;
        tabela0.registros = itemArray54;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela11.registros = itemArray17;
        int int19 = tabela11.n;
        tabela11.n = (short) 0;
        tabela11.n = (short) 0;
        tabela11.n = (byte) -1;
        int int26 = tabela11.n;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = (short) 0;
        ds.Item item30 = null;
        tabela27.insere(item30);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela27.registros = itemArray33;
        int int35 = tabela27.n;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = (short) 0;
        ds.Item item39 = null;
        tabela36.insere(item39);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        tabela36.registros = itemArray42;
        int int44 = tabela36.n;
        tabela36.n = (short) 0;
        tabela36.n = (short) 0;
        tabela36.n = (byte) -1;
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        tabela36.registros = itemArray52;
        tabela27.registros = itemArray52;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = (short) 0;
        tabela55.n = 1;
        ds.Item[] itemArray60 = new ds.Item[] {};
        tabela55.registros = itemArray60;
        tabela27.registros = itemArray60;
        tabela11.registros = itemArray60;
        int int64 = tabela11.n;
        ds.Item[] itemArray65 = tabela11.registros;
        tabela0.registros = itemArray65;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = (short) 0;
        ds.Item item10 = null;
        tabela7.insere(item10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela7.registros = itemArray13;
        int int15 = tabela7.n;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        int int24 = tabela16.n;
        tabela16.n = (short) 0;
        tabela16.n = (short) 0;
        tabela16.n = (byte) -1;
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela16.registros = itemArray32;
        tabela7.registros = itemArray32;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = (short) 0;
        tabela35.n = 1;
        ds.Item[] itemArray40 = new ds.Item[] {};
        tabela35.registros = itemArray40;
        tabela7.registros = itemArray40;
        tabela0.registros = itemArray40;
        ds.Item[] itemArray44 = tabela0.registros;
        ds.Item[] itemArray45 = null;
        tabela0.registros = itemArray45;
        ds.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int48 = tabela0.pesquisa(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = 100;
        int int15 = tabela0.n;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.binaria(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = (short) 0;
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela13.registros = itemArray19;
        tabela10.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray23 = tabela0.registros;
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = (short) 0;
        tabela24.n = 1;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela24.registros = itemArray29;
        ds.Item[] itemArray31 = tabela24.registros;
        ds.Item[] itemArray32 = tabela24.registros;
        tabela24.n = (byte) 0;
        ds.Item item35 = null;
        int int36 = tabela24.binaria(item35);
        ds.Tabela tabela37 = new ds.Tabela();
        int int38 = tabela37.n;
        ds.Item[] itemArray39 = tabela37.registros;
        tabela24.registros = itemArray39;
        tabela0.registros = itemArray39;
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = tabela0.binaria(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = (short) 0;
        tabela23.n = 1;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = (short) 0;
        ds.Item item31 = null;
        tabela28.insere(item31);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        tabela28.registros = itemArray34;
        int int36 = tabela28.n;
        tabela28.n = (short) 0;
        tabela28.n = (short) 0;
        ds.Item[] itemArray41 = tabela28.registros;
        ds.Item[] itemArray42 = tabela28.registros;
        tabela23.registros = itemArray42;
        tabela21.registros = itemArray42;
        tabela0.registros = itemArray42;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela0.registros = itemArray11;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.binaria(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        tabela0.insere(item15);
        tabela0.n = (byte) 10;
        int int19 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item[] itemArray19 = tabela0.registros;
        tabela0.n = (byte) 10;
        tabela0.n = 'a';
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        int int9 = tabela8.n;
        ds.Item[] itemArray10 = tabela8.registros;
        tabela0.registros = itemArray10;
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = (short) 0;
        ds.Item item21 = null;
        tabela18.insere(item21);
        tabela18.n = 0;
        ds.Item[] itemArray25 = tabela18.registros;
        tabela0.registros = itemArray25;
        ds.Item item27 = null;
        tabela0.insere(item27);
        int int29 = tabela0.n;
        int int30 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = (short) 0;
        ds.Item item6 = null;
        tabela3.insere(item6);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela3.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray12 = tabela0.registros;
        int int13 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = (short) 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        tabela9.registros = itemArray15;
        int int17 = tabela9.n;
        tabela9.n = (short) 0;
        tabela9.n = (short) 0;
        tabela9.n = (byte) -1;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela9.registros = itemArray25;
        tabela0.registros = itemArray25;
        tabela0.n = (short) 0;
        int int30 = tabela0.n;
        ds.Item item31 = null;
        int int32 = tabela0.binaria(item31);
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        int int36 = tabela35.n;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = (short) 0;
        tabela37.n = 1;
        ds.Tabela tabela42 = new ds.Tabela();
        tabela42.n = (short) 0;
        ds.Item item45 = null;
        tabela42.insere(item45);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        tabela42.registros = itemArray48;
        int int50 = tabela42.n;
        tabela42.n = (short) 0;
        tabela42.n = (short) 0;
        ds.Item[] itemArray55 = tabela42.registros;
        ds.Item[] itemArray56 = tabela42.registros;
        tabela37.registros = itemArray56;
        tabela35.registros = itemArray56;
        ds.Item[] itemArray59 = tabela35.registros;
        tabela0.registros = itemArray59;
        ds.Item[] itemArray61 = tabela0.registros;
        ds.Item[] itemArray62 = tabela0.registros;
        java.lang.Class<?> wildcardClass63 = itemArray62.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = (short) 0;
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela13.registros = itemArray19;
        tabela10.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int23 = tabela0.n;
        ds.Item[] itemArray24 = tabela0.registros;
        tabela0.n = (short) 1;
        int int27 = tabela0.n;
        ds.Item[] itemArray28 = tabela0.registros;
        int int29 = tabela0.n;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = tabela0.pesquisa(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = (short) 0;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela10.registros = itemArray16;
        int int18 = tabela10.n;
        tabela10.n = (short) 0;
        tabela10.n = (short) 0;
        tabela10.n = (byte) -1;
        int int25 = tabela10.n;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = (short) 0;
        ds.Item item29 = null;
        tabela26.insere(item29);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela26.registros = itemArray32;
        int int34 = tabela26.n;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = (short) 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        tabela35.registros = itemArray41;
        int int43 = tabela35.n;
        tabela35.n = (short) 0;
        tabela35.n = (short) 0;
        tabela35.n = (byte) -1;
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        tabela35.registros = itemArray51;
        tabela26.registros = itemArray51;
        ds.Tabela tabela54 = new ds.Tabela();
        tabela54.n = (short) 0;
        tabela54.n = 1;
        ds.Item[] itemArray59 = new ds.Item[] {};
        tabela54.registros = itemArray59;
        tabela26.registros = itemArray59;
        tabela10.registros = itemArray59;
        tabela0.registros = itemArray59;
        ds.Tabela tabela64 = new ds.Tabela();
        tabela64.n = (short) 0;
        tabela64.n = 1;
        ds.Item[] itemArray69 = new ds.Item[] {};
        tabela64.registros = itemArray69;
        ds.Item[] itemArray71 = tabela64.registros;
        tabela64.n = (short) 0;
        tabela64.n = 'a';
        int int76 = tabela64.n;
        int int77 = tabela64.n;
        tabela64.n = ' ';
        ds.Item[] itemArray80 = tabela64.registros;
        tabela0.registros = itemArray80;
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        tabela0.n = (short) 0;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = 100;
        int int15 = tabela0.n;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        tabela16.n = 1;
        ds.Item item21 = null;
        tabela16.insere(item21);
        ds.Item item23 = null;
        tabela16.insere(item23);
        tabela16.n = (short) 10;
        int int27 = tabela16.n;
        int int28 = tabela16.n;
        tabela16.n = (byte) 10;
        ds.Item[] itemArray31 = tabela16.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (short) 0;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        int int15 = tabela0.n;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        int int24 = tabela16.n;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = (short) 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela25.registros = itemArray31;
        int int33 = tabela25.n;
        tabela25.n = (short) 0;
        tabela25.n = (short) 0;
        tabela25.n = (byte) -1;
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        tabela25.registros = itemArray41;
        tabela16.registros = itemArray41;
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = (short) 0;
        tabela44.n = 1;
        ds.Item[] itemArray49 = new ds.Item[] {};
        tabela44.registros = itemArray49;
        tabela16.registros = itemArray49;
        tabela0.registros = itemArray49;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = (short) 0;
        tabela53.n = 1;
        ds.Item item58 = null;
        tabela53.insere(item58);
        ds.Item item60 = null;
        tabela53.insere(item60);
        tabela53.n = 1;
        ds.Item[] itemArray64 = tabela53.registros;
        tabela0.registros = itemArray64;
        tabela0.n = (byte) 10;
        int int68 = tabela0.n;
        int int69 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 1;
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        int int17 = tabela0.n;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = (short) 0;
        ds.Item item21 = null;
        tabela18.insere(item21);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela18.registros = itemArray24;
        int int26 = tabela18.n;
        tabela18.n = (short) 0;
        tabela18.n = (short) 0;
        tabela18.n = (byte) -1;
        ds.Item item33 = null;
        tabela18.insere(item33);
        tabela18.n = (byte) 10;
        tabela18.n = 2;
        ds.Item[] itemArray39 = tabela18.registros;
        tabela0.registros = itemArray39;
        int int41 = tabela0.n;
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = tabela0.pesquisa(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = (short) 0;
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        tabela21.registros = itemArray27;
        int int29 = tabela21.n;
        tabela21.n = (short) 0;
        tabela21.n = (short) 0;
        ds.Item[] itemArray34 = tabela21.registros;
        ds.Item[] itemArray35 = tabela21.registros;
        ds.Item[] itemArray36 = tabela21.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = (short) 0;
        ds.Item[] itemArray40 = tabela37.registros;
        tabela21.registros = itemArray40;
        tabela0.registros = itemArray40;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela11.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        int int21 = tabela8.binaria(item20);
        int int22 = tabela8.n;
        tabela8.n = (byte) 10;
        ds.Item[] itemArray25 = tabela8.registros;
        tabela0.registros = itemArray25;
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        tabela20.n = 1;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela20.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = (short) 0;
        tabela28.n = 1;
        ds.Item item33 = null;
        tabela28.insere(item33);
        int int35 = tabela28.n;
        ds.Item item36 = null;
        tabela28.insere(item36);
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        int int40 = tabela38.binaria(item39);
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = (short) 0;
        ds.Item item44 = null;
        tabela41.insere(item44);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela41.registros = itemArray47;
        tabela38.registros = itemArray47;
        tabela28.registros = itemArray47;
        ds.Item[] itemArray51 = tabela28.registros;
        tabela0.registros = itemArray51;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela8.registros = itemArray14;
        int int16 = tabela8.n;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = (short) 0;
        ds.Item item20 = null;
        tabela17.insere(item20);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela17.registros = itemArray23;
        int int25 = tabela17.n;
        tabela17.n = (short) 0;
        tabela17.n = (short) 0;
        tabela17.n = (byte) -1;
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela17.registros = itemArray33;
        tabela8.registros = itemArray33;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = (short) 0;
        tabela36.n = 1;
        ds.Item[] itemArray41 = new ds.Item[] {};
        tabela36.registros = itemArray41;
        tabela8.registros = itemArray41;
        tabela0.registros = itemArray41;
        tabela0.n = '4';
        tabela0.n = 97;
        int int49 = tabela0.n;
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = tabela0.binaria(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = (short) 0;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela10.registros = itemArray16;
        int int18 = tabela10.n;
        tabela10.n = (short) 0;
        tabela10.n = (short) 0;
        ds.Item[] itemArray23 = tabela10.registros;
        tabela0.registros = itemArray23;
        tabela0.n = 0;
        int int27 = tabela0.n;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = (short) 0;
        tabela28.n = 1;
        ds.Item item33 = null;
        tabela28.insere(item33);
        int int35 = tabela28.n;
        ds.Item item36 = null;
        tabela28.insere(item36);
        tabela28.n = '4';
        ds.Item[] itemArray40 = tabela28.registros;
        tabela0.registros = itemArray40;
        ds.Item item42 = null;
        tabela0.insere(item42);
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.pesquisa(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 0;
        tabela8.n = 1;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela8.registros = itemArray13;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray16 = tabela0.registros;
        int int17 = tabela0.n;
        tabela0.n = ' ';
        tabela0.n = ' ';
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        tabela0.n = 4;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela11.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = (short) 0;
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Item item24 = null;
        tabela19.insere(item24);
        ds.Item[] itemArray26 = tabela19.registros;
        tabela11.registros = itemArray26;
        ds.Item[] itemArray28 = tabela11.registros;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = (short) 0;
        ds.Item item32 = null;
        tabela29.insere(item32);
        tabela29.n = 0;
        ds.Item[] itemArray36 = tabela29.registros;
        tabela11.registros = itemArray36;
        tabela11.n = (short) 10;
        ds.Item[] itemArray40 = tabela11.registros;
        tabela0.registros = itemArray40;
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = tabela0.pesquisa(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = '4';
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item[] itemArray19 = tabela12.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        ds.Item item23 = null;
        tabela20.insere(item23);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        tabela20.registros = itemArray26;
        int int28 = tabela20.n;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = (short) 0;
        ds.Item item32 = null;
        tabela29.insere(item32);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela29.registros = itemArray35;
        int int37 = tabela29.n;
        tabela29.n = (short) 0;
        tabela29.n = (short) 0;
        tabela29.n = (byte) -1;
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela29.registros = itemArray45;
        tabela20.registros = itemArray45;
        ds.Tabela tabela48 = new ds.Tabela();
        tabela48.n = (short) 0;
        tabela48.n = 1;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela48.registros = itemArray53;
        tabela20.registros = itemArray53;
        tabela12.registros = itemArray53;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Tabela tabela60 = new ds.Tabela();
        tabela60.n = (short) 0;
        ds.Item item63 = null;
        tabela60.insere(item63);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela60.registros = itemArray66;
        tabela57.registros = itemArray66;
        tabela12.registros = itemArray66;
        tabela0.registros = itemArray66;
        int int71 = tabela0.n;
        int int72 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 52 + "'", int71 == 52);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 52 + "'", int72 == 52);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        int int10 = tabela0.n;
        tabela0.n = 5;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = (short) 0;
        tabela20.n = 1;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela20.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item[] itemArray28 = tabela0.registros;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = 10;
        tabela29.n = (short) 10;
        ds.Item[] itemArray34 = tabela29.registros;
        tabela0.registros = itemArray34;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = 0;
        tabela0.n = 2;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela11.registros = itemArray17;
        int int19 = tabela11.n;
        tabela11.n = (short) 0;
        tabela11.n = (short) 0;
        tabela11.n = (byte) -1;
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        tabela11.registros = itemArray27;
        int int29 = tabela11.n;
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        int int32 = tabela0.n;
        int int33 = tabela0.n;
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = 10;
        tabela34.n = (short) 10;
        ds.Item[] itemArray39 = tabela34.registros;
        tabela0.registros = itemArray39;
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        tabela0.n = 1;
        ds.Item[] itemArray12 = tabela0.registros;
        int int13 = tabela0.n;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = (short) 0;
        tabela14.n = 1;
        ds.Item item19 = null;
        tabela14.insere(item19);
        int int21 = tabela14.n;
        ds.Item item22 = null;
        tabela14.insere(item22);
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = (short) 0;
        ds.Item item30 = null;
        tabela27.insere(item30);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela27.registros = itemArray33;
        tabela24.registros = itemArray33;
        tabela14.registros = itemArray33;
        int int37 = tabela14.n;
        ds.Item[] itemArray38 = tabela14.registros;
        tabela0.registros = itemArray38;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tabela0.pesquisa(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 0;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 0;
        tabela0.n = 3;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 100;
        int int16 = tabela0.n;
        tabela0.n = 0;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        tabela0.n = 2;
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = (short) 0;
        ds.Item item8 = null;
        tabela5.insere(item8);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela5.registros = itemArray11;
        int int13 = tabela5.n;
        tabela5.n = (short) 0;
        tabela5.n = (short) 1;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela5.registros = itemArray19;
        ds.Item[] itemArray21 = tabela5.registros;
        tabela0.registros = itemArray21;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 100;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 1;
        tabela0.n = 0;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = (short) 0;
        tabela0.n = (short) 0;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        int int16 = tabela0.binaria(item15);
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = (short) 0;
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela13.registros = itemArray19;
        tabela10.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int23 = tabela0.n;
        ds.Item[] itemArray24 = tabela0.registros;
        tabela0.n = (short) 1;
        int int27 = tabela0.n;
        ds.Item[] itemArray28 = tabela0.registros;
        ds.Item[] itemArray29 = tabela0.registros;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = (short) 0;
        ds.Item item33 = null;
        int int34 = tabela30.binaria(item33);
        ds.Item item35 = null;
        int int36 = tabela30.binaria(item35);
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = (short) 0;
        tabela37.n = 1;
        ds.Item[] itemArray42 = new ds.Item[] {};
        tabela37.registros = itemArray42;
        ds.Item[] itemArray44 = tabela37.registros;
        int int45 = tabela37.n;
        int int46 = tabela37.n;
        ds.Item[] itemArray47 = tabela37.registros;
        tabela30.registros = itemArray47;
        tabela0.registros = itemArray47;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 'a';
        tabela0.n = 32;
        int int6 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        tabela0.n = 97;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        int int13 = tabela0.n;
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Item item16 = null;
        tabela0.insere(item16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = (short) 0;
        tabela12.n = 1;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item item19 = null;
        tabela12.insere(item19);
        int int21 = tabela12.n;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = (short) 0;
        ds.Item item25 = null;
        tabela22.insere(item25);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        tabela22.registros = itemArray28;
        int int30 = tabela22.n;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = (short) 0;
        ds.Item item34 = null;
        tabela31.insere(item34);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela31.registros = itemArray37;
        int int39 = tabela31.n;
        tabela31.n = (short) 0;
        tabela31.n = (short) 0;
        tabela31.n = (byte) -1;
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela31.registros = itemArray47;
        tabela22.registros = itemArray47;
        tabela12.registros = itemArray47;
        tabela0.registros = itemArray47;
        ds.Tabela tabela52 = new ds.Tabela();
        tabela52.n = (short) 0;
        tabela52.n = 1;
        ds.Item item57 = null;
        tabela52.insere(item57);
        int int59 = tabela52.n;
        ds.Item item60 = null;
        tabela52.insere(item60);
        ds.Tabela tabela62 = new ds.Tabela();
        ds.Item item63 = null;
        int int64 = tabela62.binaria(item63);
        ds.Tabela tabela65 = new ds.Tabela();
        tabela65.n = (short) 0;
        ds.Item item68 = null;
        tabela65.insere(item68);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        tabela65.registros = itemArray71;
        tabela62.registros = itemArray71;
        tabela52.registros = itemArray71;
        int int75 = tabela52.n;
        ds.Item[] itemArray76 = tabela52.registros;
        ds.Tabela tabela77 = new ds.Tabela();
        ds.Item item78 = null;
        int int79 = tabela77.binaria(item78);
        ds.Tabela tabela80 = new ds.Tabela();
        tabela80.n = (short) 0;
        ds.Item item83 = null;
        tabela80.insere(item83);
        ds.Item item85 = null;
        ds.Item[] itemArray86 = new ds.Item[] { item85 };
        tabela80.registros = itemArray86;
        tabela77.registros = itemArray86;
        tabela52.registros = itemArray86;
        ds.Item[] itemArray90 = tabela52.registros;
        tabela0.registros = itemArray90;
        tabela0.n = (short) 100;
        ds.Item[] itemArray94 = tabela0.registros;
        java.lang.Class<?> wildcardClass95 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(itemArray86);
        org.junit.Assert.assertNotNull(itemArray90);
        org.junit.Assert.assertNotNull(itemArray94);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }
}

