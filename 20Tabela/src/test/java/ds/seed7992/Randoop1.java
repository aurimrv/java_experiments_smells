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
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Tabela tabela2 = new ds.Tabela();
        ds.Item item3 = null;
        int int4 = tabela2.binaria(item3);
        ds.Item[] itemArray5 = tabela2.registros;
        ds.Item[] itemArray6 = tabela2.registros;
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        tabela0.registros = itemArray11;
        tabela0.n = (short) 100;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela15.n = (short) -1;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela21.registros = itemArray24;
        ds.Item[] itemArray26 = tabela21.registros;
        tabela15.registros = itemArray26;
        tabela0.registros = itemArray26;
        java.lang.Class<?> wildcardClass29 = itemArray26.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        tabela12.registros = itemArray15;
        int int17 = tabela12.n;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela21.registros = itemArray24;
        tabela18.registros = itemArray24;
        tabela12.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Item item29 = null;
        tabela0.insere(item29);
        ds.Item[] itemArray31 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        tabela0.n = 1;
        ds.Item[] itemArray16 = tabela0.registros;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        int int10 = tabela0.n;
        tabela0.n = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        tabela0.n = (byte) -1;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item item14 = null;
        int int15 = tabela11.binaria(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = ' ';
        tabela17.n = 32;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        int int25 = tabela23.n;
        tabela23.n = 32;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item[] itemArray29 = tabela28.registros;
        ds.Item[] itemArray30 = tabela28.registros;
        ds.Item[] itemArray31 = tabela28.registros;
        tabela23.registros = itemArray31;
        tabela17.registros = itemArray31;
        tabela11.registros = itemArray31;
        tabela0.registros = itemArray31;
        ds.Item item36 = null;
        tabela0.insere(item36);
        ds.Item item38 = null;
        tabela0.insere(item38);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item item16 = null;
        int int17 = tabela0.binaria(item16);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        tabela8.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela0.registros = itemArray22;
        tabela0.n = 100;
        java.lang.Class<?> wildcardClass26 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        tabela7.n = 32;
        tabela7.n = (-1);
        ds.Item item14 = null;
        tabela7.insere(item14);
        int int16 = tabela7.n;
        ds.Item[] itemArray17 = tabela7.registros;
        tabela0.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item[] itemArray23 = tabela19.registros;
        tabela0.registros = itemArray23;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = (short) 0;
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = null;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        int int20 = tabela0.n;
        int int21 = tabela0.n;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        int int3 = tabela0.n;
        tabela0.n = 2;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        int int10 = tabela6.n;
        ds.Item item11 = null;
        tabela6.insere(item11);
        tabela6.n = (byte) -1;
        ds.Item[] itemArray15 = tabela6.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = ' ';
        tabela6.n = 32;
        tabela6.n = (-1);
        ds.Item item13 = null;
        tabela6.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = ' ';
        tabela15.n = 32;
        ds.Item[] itemArray20 = tabela15.registros;
        tabela6.registros = itemArray20;
        ds.Item[] itemArray22 = tabela6.registros;
        ds.Item item23 = null;
        int int24 = tabela6.binaria(item23);
        tabela6.n = 32;
        int int27 = tabela6.n;
        tabela6.n = 'a';
        ds.Item[] itemArray30 = tabela6.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = ' ';
        tabela31.n = 32;
        tabela31.n = (-1);
        ds.Item item38 = null;
        tabela31.insere(item38);
        int int40 = tabela31.n;
        ds.Item[] itemArray41 = tabela31.registros;
        ds.Item item42 = null;
        int int43 = tabela31.binaria(item42);
        ds.Item[] itemArray44 = tabela31.registros;
        ds.Item[] itemArray45 = tabela31.registros;
        ds.Item[] itemArray46 = tabela31.registros;
        tabela6.registros = itemArray46;
        tabela0.registros = itemArray46;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela0.registros = itemArray7;
        tabela0.n = (short) -1;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = ' ';
        tabela3.n = 32;
        tabela3.n = (-1);
        tabela3.n = (short) 10;
        ds.Item[] itemArray12 = tabela3.registros;
        tabela0.registros = itemArray12;
        tabela0.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        int int20 = tabela16.n;
        ds.Item item21 = null;
        tabela16.insere(item21);
        tabela16.n = (byte) -1;
        ds.Item[] itemArray25 = tabela16.registros;
        tabela0.registros = itemArray25;
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item[] itemArray7 = tabela5.registros;
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        tabela0.n = ' ';
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = ' ';
        tabela15.n = (-1);
        ds.Item[] itemArray20 = tabela15.registros;
        ds.Item[] itemArray21 = tabela15.registros;
        tabela0.registros = itemArray21;
        int int23 = tabela0.n;
        java.lang.Class<?> wildcardClass24 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (byte) -1;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (short) -1;
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = 'a';
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = ' ';
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item[] itemArray8 = tabela4.registros;
        ds.Item[] itemArray9 = tabela4.registros;
        tabela4.n = 0;
        ds.Item[] itemArray12 = tabela4.registros;
        tabela0.registros = itemArray12;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item[] itemArray14 = tabela10.registros;
        tabela0.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = ' ';
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela0.registros = itemArray20;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        tabela22.insere(item23);
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = ' ';
        tabela25.n = 32;
        tabela25.n = (-1);
        tabela25.n = (short) 10;
        ds.Item[] itemArray34 = tabela25.registros;
        tabela22.registros = itemArray34;
        tabela0.registros = itemArray34;
        ds.Item item37 = null;
        tabela0.insere(item37);
        ds.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = tabela0.binaria(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = ' ';
        tabela15.n = (-1);
        ds.Item[] itemArray20 = tabela15.registros;
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = ' ';
        tabela23.n = (-1);
        ds.Item[] itemArray28 = tabela23.registros;
        tabela15.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = tabela0.pesquisa(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        tabela0.n = (byte) 0;
        ds.Item item12 = null;
        tabela0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Item[] itemArray16 = tabela0.registros;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        int int16 = tabela0.n;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = 100;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        tabela9.n = (-1);
        tabela9.n = (short) 10;
        ds.Item[] itemArray18 = tabela9.registros;
        tabela6.registros = itemArray18;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = ' ';
        tabela20.n = 32;
        tabela20.n = (-1);
        tabela20.n = 2;
        tabela20.n = (byte) -1;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        ds.Item item34 = null;
        int int35 = tabela31.binaria(item34);
        int int36 = tabela31.n;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = ' ';
        tabela37.n = 32;
        ds.Item[] itemArray42 = tabela37.registros;
        ds.Tabela tabela43 = new ds.Tabela();
        int int44 = tabela43.n;
        int int45 = tabela43.n;
        tabela43.n = 32;
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item[] itemArray49 = tabela48.registros;
        ds.Item[] itemArray50 = tabela48.registros;
        ds.Item[] itemArray51 = tabela48.registros;
        tabela43.registros = itemArray51;
        tabela37.registros = itemArray51;
        tabela31.registros = itemArray51;
        tabela20.registros = itemArray51;
        tabela6.registros = itemArray51;
        tabela0.registros = itemArray51;
        ds.Item item58 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int59 = tabela0.pesquisa(item58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        tabela0.n = 32;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = 10;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.binaria(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        tabela0.insere(item14);
        int int16 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = itemArray8.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        tabela0.n = (short) 10;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        tabela0.n = 32;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = ' ';
        tabela14.n = 32;
        tabela14.n = (-1);
        tabela14.n = 2;
        tabela14.n = (byte) -1;
        ds.Item[] itemArray25 = tabela14.registros;
        tabela0.registros = itemArray25;
        tabela0.n = 1;
        java.lang.Class<?> wildcardClass29 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela0.registros = itemArray9;
        tabela0.n = (short) 100;
        int int13 = tabela0.n;
        int int14 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        tabela0.n = (byte) -1;
        ds.Item item18 = null;
        tabela0.insere(item18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        tabela0.n = 32;
        tabela0.n = (byte) -1;
        ds.Item item15 = null;
        tabela0.insere(item15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (short) -1;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        ds.Item[] itemArray9 = null;
        tabela0.registros = itemArray9;
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (-1);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        int int10 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        tabela0.n = (byte) 0;
        tabela0.n = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        tabela0.n = 32;
        int int21 = tabela0.n;
        tabela0.n = 'a';
        ds.Item[] itemArray24 = tabela0.registros;
        tabela0.n = '4';
        java.lang.Class<?> wildcardClass27 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        tabela0.n = 1;
        ds.Item[] itemArray16 = tabela0.registros;
        tabela0.n = (byte) 1;
        tabela0.n = (byte) 1;
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = (short) 0;
        tabela0.n = (-1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        java.lang.Class<?> wildcardClass7 = itemArray6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        int int3 = tabela0.n;
        tabela0.n = 1;
        int int6 = tabela0.n;
        tabela0.n = 0;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = ' ';
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        tabela5.registros = itemArray12;
        int int14 = tabela5.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item[] itemArray19 = tabela15.registros;
        tabela5.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        tabela21.insere(item25);
        ds.Item[] itemArray27 = new ds.Item[] {};
        tabela21.registros = itemArray27;
        tabela5.registros = itemArray27;
        ds.Item[] itemArray30 = tabela5.registros;
        tabela0.registros = itemArray30;
        ds.Item[] itemArray32 = tabela0.registros;
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = tabela0.binaria(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        int int14 = tabela0.n;
        ds.Item item15 = null;
        int int16 = tabela0.binaria(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Tabela tabela2 = new ds.Tabela();
        ds.Item item3 = null;
        int int4 = tabela2.binaria(item3);
        ds.Item[] itemArray5 = tabela2.registros;
        ds.Item[] itemArray6 = tabela2.registros;
        tabela0.registros = itemArray6;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        int int10 = tabela9.n;
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        tabela9.registros = itemArray12;
        int int14 = tabela9.n;
        ds.Item item15 = null;
        int int16 = tabela9.binaria(item15);
        tabela9.n = 0;
        ds.Item item19 = null;
        int int20 = tabela9.binaria(item19);
        tabela9.n = (short) 0;
        int int23 = tabela9.n;
        ds.Item item24 = null;
        int int25 = tabela9.binaria(item24);
        ds.Item[] itemArray26 = tabela9.registros;
        ds.Tabela tabela27 = new ds.Tabela();
        int int28 = tabela27.n;
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        tabela27.registros = itemArray30;
        int int32 = tabela27.n;
        ds.Item item33 = null;
        int int34 = tabela27.binaria(item33);
        tabela27.n = 0;
        ds.Item item37 = null;
        int int38 = tabela27.binaria(item37);
        tabela27.n = (short) 0;
        int int41 = tabela27.n;
        ds.Item item42 = null;
        int int43 = tabela27.binaria(item42);
        ds.Item[] itemArray44 = tabela27.registros;
        tabela9.registros = itemArray44;
        tabela0.registros = itemArray44;
        java.lang.Class<?> wildcardClass47 = itemArray44.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        int int14 = tabela0.n;
        int int15 = tabela0.n;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        ds.Item item13 = null;
        tabela0.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = ' ';
        tabela15.n = 32;
        tabela15.n = (-1);
        tabela15.n = 2;
        tabela15.n = (byte) -1;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        int int28 = tabela26.binaria(item27);
        ds.Item item29 = null;
        int int30 = tabela26.binaria(item29);
        int int31 = tabela26.n;
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = ' ';
        tabela32.n = 32;
        ds.Item[] itemArray37 = tabela32.registros;
        ds.Tabela tabela38 = new ds.Tabela();
        int int39 = tabela38.n;
        int int40 = tabela38.n;
        tabela38.n = 32;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item[] itemArray44 = tabela43.registros;
        ds.Item[] itemArray45 = tabela43.registros;
        ds.Item[] itemArray46 = tabela43.registros;
        tabela38.registros = itemArray46;
        tabela32.registros = itemArray46;
        tabela26.registros = itemArray46;
        tabela15.registros = itemArray46;
        ds.Item[] itemArray51 = tabela15.registros;
        tabela0.registros = itemArray51;
        tabela0.n = (byte) 100;
        ds.Item item55 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        int int4 = tabela3.n;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela3.registros = itemArray6;
        tabela0.registros = itemArray6;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        tabela0.n = (short) 100;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = (short) 100;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = (byte) 10;
        tabela0.n = (byte) 100;
        int int10 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        tabela0.n = (short) 10;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        tabela0.n = 0;
        tabela0.n = (byte) 0;
        int int13 = tabela0.n;
        ds.Item item14 = null;
        tabela0.insere(item14);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = ' ';
        tabela11.n = 32;
        tabela11.n = (-1);
        tabela11.n = (short) 10;
        ds.Item[] itemArray20 = tabela11.registros;
        tabela8.registros = itemArray20;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = ' ';
        tabela22.n = 32;
        tabela22.n = (-1);
        tabela22.n = 2;
        tabela22.n = (byte) -1;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item item36 = null;
        int int37 = tabela33.binaria(item36);
        int int38 = tabela33.n;
        ds.Tabela tabela39 = new ds.Tabela();
        tabela39.n = ' ';
        tabela39.n = 32;
        ds.Item[] itemArray44 = tabela39.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        int int46 = tabela45.n;
        int int47 = tabela45.n;
        tabela45.n = 32;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item[] itemArray51 = tabela50.registros;
        ds.Item[] itemArray52 = tabela50.registros;
        ds.Item[] itemArray53 = tabela50.registros;
        tabela45.registros = itemArray53;
        tabela39.registros = itemArray53;
        tabela33.registros = itemArray53;
        tabela22.registros = itemArray53;
        tabela8.registros = itemArray53;
        tabela0.registros = itemArray53;
        java.lang.Class<?> wildcardClass60 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        tabela11.n = (short) -1;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        int int18 = tabela17.n;
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        tabela17.registros = itemArray20;
        ds.Item[] itemArray22 = tabela17.registros;
        tabela11.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Item[] itemArray26 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = ' ';
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        java.lang.Class<?> wildcardClass11 = itemArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        tabela0.registros = itemArray11;
        tabela0.n = (short) 100;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela15.n = (short) -1;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela21.registros = itemArray24;
        ds.Item[] itemArray26 = tabela21.registros;
        tabela15.registros = itemArray26;
        tabela0.registros = itemArray26;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        tabela29.insere(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela29.registros = itemArray36;
        int int38 = tabela29.n;
        tabela29.n = (short) -1;
        ds.Tabela tabela41 = new ds.Tabela();
        int int42 = tabela41.n;
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        tabela41.registros = itemArray44;
        int int46 = tabela41.n;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        int int51 = tabela50.n;
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        tabela50.registros = itemArray53;
        tabela47.registros = itemArray53;
        tabela41.registros = itemArray53;
        tabela29.registros = itemArray53;
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        tabela29.registros = itemArray59;
        tabela0.registros = itemArray59;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = 1;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = '4';
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela0.registros = itemArray9;
        tabela0.n = 0;
        tabela0.n = (short) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = (byte) 10;
        tabela0.n = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        int int4 = tabela3.n;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela3.registros = itemArray6;
        tabela0.registros = itemArray6;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela11.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = ' ';
        tabela19.n = (-1);
        ds.Item[] itemArray24 = tabela19.registros;
        tabela11.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Item[] itemArray27 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        tabela0.n = 100;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        tabela6.n = (short) -1;
        ds.Item item10 = null;
        tabela6.insere(item10);
        ds.Item item12 = null;
        tabela6.insere(item12);
        ds.Item item14 = null;
        tabela6.insere(item14);
        ds.Item[] itemArray16 = tabela6.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = ' ';
        ds.Item[] itemArray20 = tabela17.registros;
        ds.Item[] itemArray21 = tabela17.registros;
        tabela17.n = 10;
        int int24 = tabela17.n;
        int int25 = tabela17.n;
        ds.Tabela tabela26 = new ds.Tabela();
        int int27 = tabela26.n;
        int int28 = tabela26.n;
        ds.Item item29 = null;
        tabela26.insere(item29);
        int int31 = tabela26.n;
        ds.Item[] itemArray32 = tabela26.registros;
        tabela17.registros = itemArray32;
        tabela6.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = tabela0.pesquisa(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        tabela7.n = 32;
        tabela7.n = (-1);
        ds.Item item14 = null;
        tabela7.insere(item14);
        int int16 = tabela7.n;
        ds.Item[] itemArray17 = tabela7.registros;
        tabela0.registros = itemArray17;
        int int19 = tabela0.n;
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Item item22 = null;
        tabela0.insere(item22);
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        tabela24.insere(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        tabela24.registros = itemArray31;
        int int33 = tabela24.n;
        tabela24.n = (short) -1;
        ds.Tabela tabela36 = new ds.Tabela();
        int int37 = tabela36.n;
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        tabela36.registros = itemArray39;
        int int41 = tabela36.n;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        int int44 = tabela42.binaria(item43);
        ds.Tabela tabela45 = new ds.Tabela();
        int int46 = tabela45.n;
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        tabela45.registros = itemArray48;
        tabela42.registros = itemArray48;
        tabela36.registros = itemArray48;
        tabela24.registros = itemArray48;
        tabela0.registros = itemArray48;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.binaria(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        tabela0.n = (short) 10;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        tabela0.n = (byte) -1;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item[] itemArray11 = tabela0.registros;
        java.lang.Class<?> wildcardClass12 = itemArray11.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        tabela0.n = (byte) 0;
        ds.Item item12 = null;
        tabela0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        tabela0.n = (byte) -1;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item item14 = null;
        int int15 = tabela11.binaria(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = ' ';
        tabela17.n = 32;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        int int25 = tabela23.n;
        tabela23.n = 32;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item[] itemArray29 = tabela28.registros;
        ds.Item[] itemArray30 = tabela28.registros;
        ds.Item[] itemArray31 = tabela28.registros;
        tabela23.registros = itemArray31;
        tabela17.registros = itemArray31;
        tabela11.registros = itemArray31;
        tabela0.registros = itemArray31;
        tabela0.n = 0;
        ds.Item item38 = null;
        tabela0.insere(item38);
        ds.Tabela tabela40 = new ds.Tabela();
        tabela40.n = ' ';
        tabela40.n = 32;
        ds.Item[] itemArray45 = tabela40.registros;
        ds.Tabela tabela46 = new ds.Tabela();
        int int47 = tabela46.n;
        int int48 = tabela46.n;
        tabela46.n = 32;
        ds.Tabela tabela51 = new ds.Tabela();
        ds.Item[] itemArray52 = tabela51.registros;
        ds.Item[] itemArray53 = tabela51.registros;
        ds.Item[] itemArray54 = tabela51.registros;
        tabela46.registros = itemArray54;
        tabela40.registros = itemArray54;
        tabela0.registros = itemArray54;
        ds.Item[] itemArray58 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = ' ';
        tabela8.n = (-1);
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        tabela0.registros = itemArray20;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        int int14 = tabela0.n;
        int int15 = tabela0.n;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        tabela0.n = 0;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) 100;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela0.registros = itemArray9;
        tabela0.n = (short) 100;
        tabela0.n = (byte) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item[] itemArray7 = tabela5.registros;
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        tabela0.n = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = ' ';
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela5.n = 10;
        int int12 = tabela5.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela13.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item[] itemArray25 = tabela21.registros;
        tabela13.registros = itemArray25;
        ds.Item[] itemArray27 = tabela13.registros;
        tabela5.registros = itemArray27;
        tabela5.n = 100;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item[] itemArray32 = tabela31.registros;
        ds.Item item33 = null;
        tabela31.insere(item33);
        ds.Item[] itemArray35 = tabela31.registros;
        tabela5.registros = itemArray35;
        tabela0.registros = itemArray35;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        tabela9.n = (-1);
        tabela9.n = 2;
        tabela9.n = (byte) -1;
        ds.Item[] itemArray20 = tabela9.registros;
        tabela0.registros = itemArray20;
        ds.Item item22 = null;
        tabela0.insere(item22);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela0.registros = itemArray9;
        tabela0.n = 0;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = ' ';
        tabela14.n = 32;
        tabela14.n = (-1);
        ds.Item item21 = null;
        tabela14.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = ' ';
        tabela23.n = 32;
        tabela23.n = (-1);
        tabela23.n = 2;
        tabela23.n = (byte) -1;
        ds.Item[] itemArray34 = tabela23.registros;
        tabela14.registros = itemArray34;
        ds.Item[] itemArray36 = tabela14.registros;
        tabela0.registros = itemArray36;
        ds.Item[] itemArray38 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = ' ';
        tabela6.n = 32;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        int int14 = tabela12.n;
        tabela12.n = 32;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item[] itemArray19 = tabela17.registros;
        ds.Item[] itemArray20 = tabela17.registros;
        tabela12.registros = itemArray20;
        tabela6.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = ' ';
        tabela24.n = 32;
        tabela24.n = (-1);
        ds.Item item31 = null;
        tabela24.insere(item31);
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item item36 = null;
        int int37 = tabela33.binaria(item36);
        int int38 = tabela33.n;
        ds.Tabela tabela39 = new ds.Tabela();
        tabela39.n = ' ';
        tabela39.n = 32;
        ds.Item[] itemArray44 = tabela39.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        int int46 = tabela45.n;
        int int47 = tabela45.n;
        tabela45.n = 32;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item[] itemArray51 = tabela50.registros;
        ds.Item[] itemArray52 = tabela50.registros;
        ds.Item[] itemArray53 = tabela50.registros;
        tabela45.registros = itemArray53;
        tabela39.registros = itemArray53;
        tabela33.registros = itemArray53;
        int int57 = tabela33.n;
        ds.Tabela tabela58 = new ds.Tabela();
        int int59 = tabela58.n;
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        tabela58.registros = itemArray61;
        ds.Item item63 = null;
        int int64 = tabela58.binaria(item63);
        ds.Tabela tabela65 = new ds.Tabela();
        tabela65.n = 32;
        int int68 = tabela65.n;
        tabela65.n = 1;
        ds.Item[] itemArray71 = tabela65.registros;
        tabela58.registros = itemArray71;
        tabela33.registros = itemArray71;
        tabela24.registros = itemArray71;
        ds.Item[] itemArray75 = tabela24.registros;
        tabela0.registros = itemArray75;
        int int77 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 32 + "'", int68 == 32);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        int int12 = tabela11.n;
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela11.registros = itemArray14;
        int int16 = tabela11.n;
        ds.Item item17 = null;
        int int18 = tabela11.binaria(item17);
        tabela11.n = 0;
        ds.Item item21 = null;
        int int22 = tabela11.binaria(item21);
        tabela11.n = (short) 0;
        int int25 = tabela11.n;
        ds.Item item26 = null;
        int int27 = tabela11.binaria(item26);
        ds.Item[] itemArray28 = tabela11.registros;
        tabela0.registros = itemArray28;
        java.lang.Class<?> wildcardClass30 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (short) 0;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 1;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.binaria(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        tabela7.n = 32;
        tabela7.n = (-1);
        ds.Item item14 = null;
        tabela7.insere(item14);
        int int16 = tabela7.n;
        ds.Item[] itemArray17 = tabela7.registros;
        tabela0.registros = itemArray17;
        int int19 = tabela0.n;
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Item item22 = null;
        tabela0.insere(item22);
        ds.Item[] itemArray24 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        ds.Item item13 = null;
        tabela0.insere(item13);
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.binaria(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        tabela0.n = 0;
        ds.Item item18 = null;
        tabela0.insere(item18);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = (short) -1;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = ' ';
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item[] itemArray19 = tabela15.registros;
        tabela0.registros = itemArray19;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        tabela0.n = 0;
        tabela0.n = '#';
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        tabela0.n = 32;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        tabela0.n = (byte) 100;
        ds.Item[] itemArray21 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = ' ';
        tabela17.n = 32;
        tabela17.n = (-1);
        tabela17.n = 2;
        tabela17.n = (byte) -1;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item item31 = null;
        int int32 = tabela28.binaria(item31);
        int int33 = tabela28.n;
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = ' ';
        tabela34.n = 32;
        ds.Item[] itemArray39 = tabela34.registros;
        ds.Tabela tabela40 = new ds.Tabela();
        int int41 = tabela40.n;
        int int42 = tabela40.n;
        tabela40.n = 32;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item[] itemArray46 = tabela45.registros;
        ds.Item[] itemArray47 = tabela45.registros;
        ds.Item[] itemArray48 = tabela45.registros;
        tabela40.registros = itemArray48;
        tabela34.registros = itemArray48;
        tabela28.registros = itemArray48;
        tabela17.registros = itemArray48;
        ds.Item[] itemArray53 = tabela17.registros;
        tabela0.registros = itemArray53;
        ds.Item item55 = null;
        tabela0.insere(item55);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        ds.Item item9 = null;
        tabela0.insere(item9);
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        int int4 = tabela3.n;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela3.registros = itemArray6;
        tabela0.registros = itemArray6;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        java.lang.Class<?> wildcardClass15 = itemArray13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela0.registros = itemArray7;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        int int16 = tabela0.n;
        int int17 = tabela0.n;
        int int18 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tabela0.pesquisa(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        tabela0.n = (byte) 10;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        int int9 = tabela5.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item item14 = null;
        tabela10.insere(item14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        tabela10.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = ' ';
        tabela18.n = (-1);
        ds.Item[] itemArray23 = tabela18.registros;
        tabela10.registros = itemArray23;
        ds.Item item25 = null;
        tabela10.insere(item25);
        ds.Item[] itemArray27 = tabela10.registros;
        ds.Item[] itemArray28 = tabela10.registros;
        tabela5.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = tabela0.binaria(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item item21 = null;
        tabela0.insere(item21);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = (short) -1;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item[] itemArray14 = tabela10.registros;
        tabela0.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item item20 = null;
        tabela16.insere(item20);
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela16.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.pesquisa(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item item14 = null;
        tabela10.insere(item14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        tabela10.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = ' ';
        tabela18.n = (-1);
        ds.Item[] itemArray23 = tabela18.registros;
        tabela10.registros = itemArray23;
        ds.Item item25 = null;
        tabela10.insere(item25);
        ds.Item[] itemArray27 = tabela10.registros;
        ds.Item[] itemArray28 = tabela10.registros;
        tabela0.registros = itemArray28;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 2;
        tabela0.n = 10;
        ds.Item[] itemArray16 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 0;
        int int5 = tabela0.n;
        tabela0.n = (-1);
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        int int14 = tabela0.n;
        ds.Item item15 = null;
        int int16 = tabela0.binaria(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        tabela8.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray24 = tabela0.registros;
        java.lang.Class<?> wildcardClass25 = itemArray24.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        tabela0.n = (byte) 100;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item item12 = null;
        int int13 = tabela9.binaria(item12);
        int int14 = tabela9.n;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = ' ';
        tabela15.n = 32;
        ds.Item[] itemArray20 = tabela15.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        int int23 = tabela21.n;
        tabela21.n = 32;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        ds.Item[] itemArray28 = tabela26.registros;
        ds.Item[] itemArray29 = tabela26.registros;
        tabela21.registros = itemArray29;
        tabela15.registros = itemArray29;
        tabela9.registros = itemArray29;
        int int33 = tabela9.n;
        ds.Tabela tabela34 = new ds.Tabela();
        int int35 = tabela34.n;
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela34.registros = itemArray37;
        ds.Item item39 = null;
        int int40 = tabela34.binaria(item39);
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = 32;
        int int44 = tabela41.n;
        tabela41.n = 1;
        ds.Item[] itemArray47 = tabela41.registros;
        tabela34.registros = itemArray47;
        tabela9.registros = itemArray47;
        tabela0.registros = itemArray47;
        java.lang.Class<?> wildcardClass51 = itemArray47.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 0;
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item[] itemArray14 = tabela10.registros;
        tabela0.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item item20 = null;
        tabela16.insere(item20);
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela16.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela26.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item item35 = null;
        tabela0.insere(item35);
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = tabela0.pesquisa(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 0;
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = itemArray8.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        tabela0.registros = itemArray4;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (short) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 2;
        tabela0.n = 10;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item[] itemArray14 = tabela10.registros;
        tabela0.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = ' ';
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray22 = tabela0.registros;
        ds.Item item23 = null;
        tabela0.insere(item23);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        tabela0.n = 0;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        java.lang.Class<?> wildcardClass14 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        int int3 = tabela0.n;
        tabela0.n = 2;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.binaria(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        ds.Item item13 = null;
        tabela0.insere(item13);
        ds.Item item15 = null;
        tabela0.insere(item15);
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item[] itemArray14 = tabela10.registros;
        tabela0.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item item20 = null;
        tabela16.insere(item20);
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela16.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela26.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = ' ';
        tabela35.n = 32;
        tabela35.n = (-1);
        ds.Item item42 = null;
        tabela35.insere(item42);
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        int int46 = tabela44.binaria(item45);
        ds.Item item47 = null;
        int int48 = tabela44.binaria(item47);
        int int49 = tabela44.n;
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = ' ';
        tabela50.n = 32;
        ds.Item[] itemArray55 = tabela50.registros;
        ds.Tabela tabela56 = new ds.Tabela();
        int int57 = tabela56.n;
        int int58 = tabela56.n;
        tabela56.n = 32;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item[] itemArray62 = tabela61.registros;
        ds.Item[] itemArray63 = tabela61.registros;
        ds.Item[] itemArray64 = tabela61.registros;
        tabela56.registros = itemArray64;
        tabela50.registros = itemArray64;
        tabela44.registros = itemArray64;
        int int68 = tabela44.n;
        ds.Tabela tabela69 = new ds.Tabela();
        int int70 = tabela69.n;
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        tabela69.registros = itemArray72;
        ds.Item item74 = null;
        int int75 = tabela69.binaria(item74);
        ds.Tabela tabela76 = new ds.Tabela();
        tabela76.n = 32;
        int int79 = tabela76.n;
        tabela76.n = 1;
        ds.Item[] itemArray82 = tabela76.registros;
        tabela69.registros = itemArray82;
        tabela44.registros = itemArray82;
        tabela35.registros = itemArray82;
        ds.Item[] itemArray86 = tabela35.registros;
        tabela0.registros = itemArray86;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 32 + "'", int79 == 32);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray86);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item[] itemArray7 = tabela5.registros;
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        tabela0.n = ' ';
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = (short) -1;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = ' ';
        tabela10.n = 32;
        tabela10.n = (-1);
        ds.Item item17 = null;
        tabela10.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = ' ';
        tabela19.n = 32;
        tabela19.n = (-1);
        tabela19.n = 2;
        tabela19.n = (byte) -1;
        ds.Item[] itemArray30 = tabela19.registros;
        tabela10.registros = itemArray30;
        ds.Item[] itemArray32 = tabela10.registros;
        tabela0.registros = itemArray32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item item11 = null;
        int int12 = tabela8.binaria(item11);
        tabela8.n = (short) 1;
        int int15 = tabela8.n;
        ds.Item[] itemArray16 = tabela8.registros;
        int int17 = tabela8.n;
        tabela8.n = 0;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        tabela20.registros = itemArray27;
        tabela20.n = (short) -1;
        ds.Item[] itemArray31 = tabela20.registros;
        tabela8.registros = itemArray31;
        tabela0.registros = itemArray31;
        ds.Item item34 = null;
        tabela0.insere(item34);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        tabela0.registros = itemArray4;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item[] itemArray8 = tabela7.registros;
        ds.Item[] itemArray9 = tabela7.registros;
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        tabela0.registros = itemArray11;
        java.lang.Class<?> wildcardClass13 = itemArray11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        tabela0.n = 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        int int3 = tabela0.n;
        tabela0.n = 2;
        tabela0.n = 0;
        int int8 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        tabela0.n = (byte) -1;
        int int18 = tabela0.n;
        tabela0.n = '4';
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.pesquisa(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item[] itemArray7 = tabela5.registros;
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        int int9 = tabela8.n;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela8.registros = itemArray11;
        int int13 = tabela8.n;
        ds.Item item14 = null;
        int int15 = tabela8.binaria(item14);
        tabela8.n = 0;
        ds.Item item18 = null;
        int int19 = tabela8.binaria(item18);
        ds.Item[] itemArray20 = tabela8.registros;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray22 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        tabela0.insere(item14);
        tabela0.n = (short) 0;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.pesquisa(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela11.registros = itemArray18;
        int int20 = tabela11.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item[] itemArray25 = tabela21.registros;
        tabela11.registros = itemArray25;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        ds.Item item31 = null;
        tabela27.insere(item31);
        ds.Item[] itemArray33 = new ds.Item[] {};
        tabela27.registros = itemArray33;
        tabela11.registros = itemArray33;
        ds.Item[] itemArray36 = tabela11.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item[] itemArray38 = tabela37.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        int int41 = tabela39.binaria(item40);
        ds.Item[] itemArray42 = tabela39.registros;
        ds.Item[] itemArray43 = tabela39.registros;
        tabela37.registros = itemArray43;
        tabela11.registros = itemArray43;
        ds.Item[] itemArray46 = tabela11.registros;
        tabela0.registros = itemArray46;
        java.lang.Class<?> wildcardClass48 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        int int4 = tabela3.n;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela3.registros = itemArray6;
        tabela0.registros = itemArray6;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        tabela0.n = (short) 100;
        int int17 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = (short) 0;
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = null;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        int int20 = tabela0.n;
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item item22 = null;
        int int23 = tabela0.binaria(item22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        int int4 = tabela3.n;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela3.registros = itemArray6;
        tabela0.registros = itemArray6;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        int int15 = tabela0.n;
        java.lang.Class<?> wildcardClass16 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        int int14 = tabela0.n;
        ds.Item item15 = null;
        int int16 = tabela0.binaria(item15);
        tabela0.n = (-1);
        ds.Tabela tabela19 = new ds.Tabela();
        int int20 = tabela19.n;
        int int21 = tabela19.n;
        tabela19.n = 32;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item[] itemArray26 = tabela24.registros;
        ds.Item[] itemArray27 = tabela24.registros;
        tabela19.registros = itemArray27;
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        tabela19.registros = itemArray30;
        tabela19.n = ' ';
        ds.Item[] itemArray34 = tabela19.registros;
        tabela0.registros = itemArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        tabela0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        ds.Item item21 = null;
        tabela17.insere(item21);
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela17.registros = itemArray23;
        tabela0.registros = itemArray23;
        ds.Item item26 = null;
        int int27 = tabela0.binaria(item26);
        int int28 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        int int12 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        int int10 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = ' ';
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = ' ';
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = ' ';
        tabela11.n = 32;
        tabela11.n = (-1);
        tabela11.n = (short) 10;
        tabela11.n = 0;
        ds.Item item22 = null;
        int int23 = tabela11.binaria(item22);
        ds.Item[] itemArray24 = tabela11.registros;
        tabela0.registros = itemArray24;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        tabela0.n = (byte) -1;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.binaria(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = (short) -1;
        int int10 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        tabela0.insere(item12);
        tabela0.n = 10;
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        int int4 = tabela3.n;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela3.registros = itemArray6;
        tabela0.registros = itemArray6;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        int int15 = tabela0.n;
        ds.Item item16 = null;
        tabela0.insere(item16);
        tabela0.n = 10;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.binaria(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (byte) 1;
        tabela0.n = ' ';
        int int9 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela0.registros = itemArray9;
        tabela0.n = 0;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = ' ';
        tabela13.n = 32;
        tabela13.n = (-1);
        tabela13.n = (short) 10;
        tabela13.n = 0;
        ds.Item item24 = null;
        int int25 = tabela13.binaria(item24);
        tabela13.n = (short) 0;
        int int28 = tabela13.n;
        ds.Item[] itemArray29 = null;
        tabela13.registros = itemArray29;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = ' ';
        tabela34.n = 32;
        tabela34.n = (-1);
        tabela34.n = (short) 10;
        ds.Item[] itemArray43 = tabela34.registros;
        tabela31.registros = itemArray43;
        ds.Tabela tabela45 = new ds.Tabela();
        tabela45.n = ' ';
        tabela45.n = 32;
        tabela45.n = (-1);
        tabela45.n = 2;
        tabela45.n = (byte) -1;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item item57 = null;
        int int58 = tabela56.binaria(item57);
        ds.Item item59 = null;
        int int60 = tabela56.binaria(item59);
        int int61 = tabela56.n;
        ds.Tabela tabela62 = new ds.Tabela();
        tabela62.n = ' ';
        tabela62.n = 32;
        ds.Item[] itemArray67 = tabela62.registros;
        ds.Tabela tabela68 = new ds.Tabela();
        int int69 = tabela68.n;
        int int70 = tabela68.n;
        tabela68.n = 32;
        ds.Tabela tabela73 = new ds.Tabela();
        ds.Item[] itemArray74 = tabela73.registros;
        ds.Item[] itemArray75 = tabela73.registros;
        ds.Item[] itemArray76 = tabela73.registros;
        tabela68.registros = itemArray76;
        tabela62.registros = itemArray76;
        tabela56.registros = itemArray76;
        tabela45.registros = itemArray76;
        tabela31.registros = itemArray76;
        tabela13.registros = itemArray76;
        tabela0.registros = itemArray76;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray76);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        tabela0.n = 32;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        tabela0.n = 1;
        ds.Item[] itemArray16 = tabela0.registros;
        java.lang.Class<?> wildcardClass17 = itemArray16.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = ' ';
        tabela11.n = (-1);
        ds.Item[] itemArray16 = tabela11.registros;
        ds.Item[] itemArray17 = tabela11.registros;
        ds.Item[] itemArray18 = tabela11.registros;
        tabela0.registros = itemArray18;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = ' ';
        tabela6.n = 32;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        int int14 = tabela12.n;
        tabela12.n = 32;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item[] itemArray19 = tabela17.registros;
        ds.Item[] itemArray20 = tabela17.registros;
        tabela12.registros = itemArray20;
        tabela6.registros = itemArray20;
        tabela0.registros = itemArray20;
        int int24 = tabela0.n;
        ds.Item item25 = null;
        int int26 = tabela0.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = ' ';
        ds.Item[] itemArray30 = tabela27.registros;
        ds.Item[] itemArray31 = tabela27.registros;
        tabela27.n = 10;
        int int34 = tabela27.n;
        ds.Item[] itemArray35 = tabela27.registros;
        ds.Item[] itemArray36 = tabela27.registros;
        tabela0.registros = itemArray36;
        java.lang.Class<?> wildcardClass38 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = ' ';
        tabela3.n = 32;
        tabela3.n = (-1);
        tabela3.n = (short) 10;
        ds.Item[] itemArray12 = tabela3.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        tabela0.insere(item14);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        int int16 = tabela0.n;
        int int17 = tabela0.n;
        ds.Item item18 = null;
        tabela0.insere(item18);
        java.lang.Class<?> wildcardClass20 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        tabela0.n = 32;
        tabela0.n = '4';
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (-1);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (short) 0;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela0.registros = itemArray7;
        ds.Item[] itemArray9 = tabela0.registros;
        java.lang.Class<?> wildcardClass10 = itemArray9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        ds.Item item13 = null;
        tabela0.insere(item13);
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        tabela0.n = '#';
        java.lang.Class<?> wildcardClass20 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        tabela0.n = (byte) -1;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item item14 = null;
        tabela10.insere(item14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        tabela10.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        ds.Item[] itemArray22 = tabela18.registros;
        tabela10.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = ' ';
        tabela24.n = 32;
        tabela24.n = (-1);
        tabela24.n = 2;
        tabela24.n = (byte) -1;
        ds.Item[] itemArray35 = tabela24.registros;
        tabela10.registros = itemArray35;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = ' ';
        tabela37.n = (short) -1;
        int int42 = tabela37.n;
        ds.Item[] itemArray43 = tabela37.registros;
        tabela10.registros = itemArray43;
        tabela0.registros = itemArray43;
        ds.Item item46 = null;
        int int47 = tabela0.binaria(item46);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        tabela0.n = 32;
        int int21 = tabela0.n;
        tabela0.n = 'a';
        int int24 = tabela0.n;
        int int25 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        tabela0.n = 100;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        tabela6.n = (short) -1;
        ds.Item item10 = null;
        tabela6.insere(item10);
        ds.Item item12 = null;
        tabela6.insere(item12);
        ds.Item item14 = null;
        tabela6.insere(item14);
        ds.Item[] itemArray16 = tabela6.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = ' ';
        ds.Item[] itemArray20 = tabela17.registros;
        ds.Item[] itemArray21 = tabela17.registros;
        tabela17.n = 10;
        int int24 = tabela17.n;
        int int25 = tabela17.n;
        ds.Tabela tabela26 = new ds.Tabela();
        int int27 = tabela26.n;
        int int28 = tabela26.n;
        ds.Item item29 = null;
        tabela26.insere(item29);
        int int31 = tabela26.n;
        ds.Item[] itemArray32 = tabela26.registros;
        tabela17.registros = itemArray32;
        tabela6.registros = itemArray32;
        tabela0.registros = itemArray32;
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = (byte) 10;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        int int16 = tabela0.n;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = (short) 1;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        tabela0.insere(item10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela0.registros = itemArray9;
        tabela0.n = (short) 100;
        ds.Item[] itemArray13 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        tabela5.registros = itemArray12;
        int int14 = tabela5.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item[] itemArray19 = tabela15.registros;
        tabela5.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        tabela21.insere(item25);
        ds.Item[] itemArray27 = new ds.Item[] {};
        tabela21.registros = itemArray27;
        tabela5.registros = itemArray27;
        ds.Item[] itemArray30 = tabela5.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = tabela0.pesquisa(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        tabela0.n = 100;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        tabela8.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela0.registros = itemArray22;
        int int24 = tabela0.n;
        int int25 = tabela0.n;
        ds.Tabela tabela26 = new ds.Tabela();
        int int27 = tabela26.n;
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        tabela26.registros = itemArray29;
        ds.Item[] itemArray31 = tabela26.registros;
        tabela0.registros = itemArray31;
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = 1;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = ' ';
        tabela6.n = 32;
        tabela6.n = (-1);
        ds.Item item13 = null;
        tabela6.insere(item13);
        int int15 = tabela6.n;
        ds.Item[] itemArray16 = tabela6.registros;
        ds.Item[] itemArray17 = tabela6.registros;
        ds.Item[] itemArray18 = tabela6.registros;
        tabela0.registros = itemArray18;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (short) -1;
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item[] itemArray11 = tabela7.registros;
        tabela7.n = 10;
        int int14 = tabela7.n;
        int int15 = tabela7.n;
        ds.Tabela tabela16 = new ds.Tabela();
        int int17 = tabela16.n;
        int int18 = tabela16.n;
        ds.Item item19 = null;
        tabela16.insere(item19);
        int int21 = tabela16.n;
        ds.Item[] itemArray22 = tabela16.registros;
        tabela7.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Item[] itemArray26 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        tabela0.n = (byte) -1;
        int int18 = tabela0.n;
        tabela0.n = '4';
        tabela0.n = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (short) 0;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item item13 = null;
        tabela0.insere(item13);
        int int15 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        ds.Item item15 = null;
        int int16 = tabela0.binaria(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = 0;
        ds.Item[] itemArray15 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        tabela0.n = 1;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        tabela7.n = 32;
        tabela7.n = (-1);
        ds.Item item14 = null;
        tabela7.insere(item14);
        int int16 = tabela7.n;
        ds.Item[] itemArray17 = tabela7.registros;
        tabela0.registros = itemArray17;
        int int19 = tabela0.n;
        ds.Item item20 = null;
        tabela0.insere(item20);
        tabela0.n = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (-1);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        tabela0.n = (short) 0;
        ds.Item item10 = null;
        tabela0.insere(item10);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = (short) 0;
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = null;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        int int20 = tabela0.n;
        int int21 = tabela0.n;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.pesquisa(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Tabela tabela2 = new ds.Tabela();
        ds.Item item3 = null;
        int int4 = tabela2.binaria(item3);
        ds.Item[] itemArray5 = tabela2.registros;
        ds.Item[] itemArray6 = tabela2.registros;
        tabela0.registros = itemArray6;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        tabela0.n = 100;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = (-1);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        int int9 = tabela8.n;
        int int10 = tabela8.n;
        tabela8.n = 0;
        int int13 = tabela8.n;
        ds.Item[] itemArray14 = tabela8.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        tabela15.registros = itemArray22;
        tabela15.n = 0;
        ds.Item item26 = null;
        tabela15.insere(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        int int29 = tabela28.n;
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela28.registros = itemArray31;
        tabela15.registros = itemArray31;
        tabela8.registros = itemArray31;
        tabela0.registros = itemArray31;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 32;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        int int14 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        int int10 = tabela9.n;
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        tabela9.registros = itemArray12;
        int int14 = tabela9.n;
        ds.Item item15 = null;
        int int16 = tabela9.binaria(item15);
        tabela9.n = 0;
        ds.Item item19 = null;
        int int20 = tabela9.binaria(item19);
        tabela9.n = (short) 0;
        int int23 = tabela9.n;
        ds.Item item24 = null;
        int int25 = tabela9.binaria(item24);
        ds.Item[] itemArray26 = tabela9.registros;
        ds.Tabela tabela27 = new ds.Tabela();
        int int28 = tabela27.n;
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        tabela27.registros = itemArray30;
        int int32 = tabela27.n;
        ds.Item item33 = null;
        int int34 = tabela27.binaria(item33);
        tabela27.n = 0;
        ds.Item item37 = null;
        int int38 = tabela27.binaria(item37);
        tabela27.n = (short) 0;
        int int41 = tabela27.n;
        ds.Item item42 = null;
        int int43 = tabela27.binaria(item42);
        ds.Item[] itemArray44 = tabela27.registros;
        tabela9.registros = itemArray44;
        tabela0.registros = itemArray44;
        java.lang.Class<?> wildcardClass47 = itemArray44.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        tabela7.n = 32;
        tabela7.n = (-1);
        ds.Item item14 = null;
        tabela7.insere(item14);
        int int16 = tabela7.n;
        ds.Item[] itemArray17 = tabela7.registros;
        tabela0.registros = itemArray17;
        int int19 = tabela0.n;
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Item item22 = null;
        tabela0.insere(item22);
        int int24 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela11.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item[] itemArray23 = tabela19.registros;
        tabela11.registros = itemArray23;
        tabela0.registros = itemArray23;
        int int26 = tabela0.n;
        tabela0.n = (short) -1;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        int int3 = tabela0.n;
        tabela0.n = 2;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        int int10 = tabela6.n;
        ds.Item item11 = null;
        tabela6.insere(item11);
        tabela6.n = (byte) -1;
        ds.Item[] itemArray15 = tabela6.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        tabela8.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela0.registros = itemArray22;
        tabela0.n = (byte) 10;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.pesquisa(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (short) 0;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = (-1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 32;
        int int3 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela0.registros = itemArray9;
        tabela0.n = (short) 100;
        int int13 = tabela0.n;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.binaria(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        tabela2.n = ' ';
        tabela2.n = 32;
        tabela2.n = (-1);
        tabela2.n = 2;
        tabela2.n = (byte) -1;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item item16 = null;
        int int17 = tabela13.binaria(item16);
        int int18 = tabela13.n;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = ' ';
        tabela19.n = 32;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        int int26 = tabela25.n;
        int int27 = tabela25.n;
        tabela25.n = 32;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item[] itemArray32 = tabela30.registros;
        ds.Item[] itemArray33 = tabela30.registros;
        tabela25.registros = itemArray33;
        tabela19.registros = itemArray33;
        tabela13.registros = itemArray33;
        tabela2.registros = itemArray33;
        ds.Item[] itemArray38 = tabela2.registros;
        tabela0.registros = itemArray38;
        int int40 = tabela0.n;
        ds.Item item41 = null;
        int int42 = tabela0.binaria(item41);
        ds.Tabela tabela43 = new ds.Tabela();
        tabela43.n = 32;
        int int46 = tabela43.n;
        tabela43.n = 32;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        int int51 = tabela49.binaria(item50);
        ds.Item[] itemArray52 = tabela49.registros;
        tabela43.registros = itemArray52;
        tabela43.n = (short) 100;
        int int56 = tabela43.n;
        ds.Item[] itemArray57 = tabela43.registros;
        tabela0.registros = itemArray57;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = ' ';
        tabela10.n = 32;
        tabela10.n = (-1);
        ds.Item item17 = null;
        tabela10.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = ' ';
        tabela19.n = 32;
        ds.Item[] itemArray24 = tabela19.registros;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int27 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = 0;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        tabela0.n = (byte) 100;
        tabela0.n = '4';
        ds.Item[] itemArray12 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        ds.Item[] itemArray14 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item item8 = null;
        tabela0.insere(item8);
        int int10 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (short) 0;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = ' ';
        tabela13.n = (short) -1;
        int int18 = tabela13.n;
        ds.Item[] itemArray19 = tabela13.registros;
        tabela0.registros = itemArray19;
        tabela0.n = 97;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.binaria(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (short) -1;
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item[] itemArray11 = tabela7.registros;
        tabela7.n = 10;
        int int14 = tabela7.n;
        int int15 = tabela7.n;
        ds.Tabela tabela16 = new ds.Tabela();
        int int17 = tabela16.n;
        int int18 = tabela16.n;
        ds.Item item19 = null;
        tabela16.insere(item19);
        int int21 = tabela16.n;
        ds.Item[] itemArray22 = tabela16.registros;
        tabela7.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item item25 = null;
        tabela0.insere(item25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = ' ';
        tabela14.n = 32;
        tabela14.n = (-1);
        tabela14.n = 2;
        tabela14.n = (byte) -1;
        ds.Item[] itemArray25 = tabela14.registros;
        tabela0.registros = itemArray25;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = ' ';
        tabela27.n = (short) -1;
        int int32 = tabela27.n;
        ds.Item[] itemArray33 = tabela27.registros;
        tabela0.registros = itemArray33;
        ds.Item item35 = null;
        tabela0.insere(item35);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        tabela0.registros = itemArray11;
        tabela0.n = (short) 100;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela15.n = (short) -1;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela21.registros = itemArray24;
        ds.Item[] itemArray26 = tabela21.registros;
        tabela15.registros = itemArray26;
        tabela0.registros = itemArray26;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = ' ';
        tabela29.n = 32;
        tabela29.n = (-1);
        tabela29.n = 2;
        int int38 = tabela29.n;
        ds.Item[] itemArray39 = tabela29.registros;
        tabela0.registros = itemArray39;
        int int41 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        tabela0.n = 1;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.binaria(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = (byte) 10;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = ' ';
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (short) 0;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = ' ';
        tabela13.n = (short) -1;
        int int18 = tabela13.n;
        ds.Item[] itemArray19 = tabela13.registros;
        tabela0.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = ' ';
        tabela21.n = 32;
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Tabela tabela27 = new ds.Tabela();
        int int28 = tabela27.n;
        int int29 = tabela27.n;
        tabela27.n = 32;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item[] itemArray33 = tabela32.registros;
        ds.Item[] itemArray34 = tabela32.registros;
        ds.Item[] itemArray35 = tabela32.registros;
        tabela27.registros = itemArray35;
        tabela21.registros = itemArray35;
        tabela0.registros = itemArray35;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (-1);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = itemArray7.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        tabela8.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela0.registros = itemArray22;
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tabela0.binaria(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = ' ';
        tabela8.n = 32;
        tabela8.n = (-1);
        tabela8.n = 2;
        int int17 = tabela8.n;
        ds.Item[] itemArray18 = tabela8.registros;
        tabela0.registros = itemArray18;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = ' ';
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item[] itemArray15 = tabela11.registros;
        tabela11.n = 10;
        int int18 = tabela11.n;
        int int19 = tabela11.n;
        ds.Tabela tabela20 = new ds.Tabela();
        int int21 = tabela20.n;
        int int22 = tabela20.n;
        ds.Item item23 = null;
        tabela20.insere(item23);
        int int25 = tabela20.n;
        ds.Item[] itemArray26 = tabela20.registros;
        tabela11.registros = itemArray26;
        tabela0.registros = itemArray26;
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = tabela0.binaria(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        ds.Item[] itemArray9 = tabela0.registros;
        int int10 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = ' ';
        tabela13.n = 32;
        tabela13.n = (-1);
        ds.Item item20 = null;
        tabela13.insere(item20);
        int int22 = tabela13.n;
        ds.Item[] itemArray23 = tabela13.registros;
        ds.Item item24 = null;
        int int25 = tabela13.binaria(item24);
        ds.Item item26 = null;
        int int27 = tabela13.binaria(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = ' ';
        tabela28.n = (-1);
        ds.Item[] itemArray33 = tabela28.registros;
        ds.Item item34 = null;
        tabela28.insere(item34);
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = ' ';
        tabela36.n = (-1);
        ds.Item[] itemArray41 = tabela36.registros;
        tabela28.registros = itemArray41;
        tabela13.registros = itemArray41;
        tabela0.registros = itemArray41;
        ds.Tabela tabela45 = new ds.Tabela();
        tabela45.n = ' ';
        tabela45.n = (-1);
        ds.Item[] itemArray50 = tabela45.registros;
        ds.Item item51 = null;
        tabela45.insere(item51);
        ds.Tabela tabela53 = new ds.Tabela();
        ds.Item[] itemArray54 = tabela53.registros;
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        int int57 = tabela55.binaria(item56);
        ds.Item[] itemArray58 = tabela55.registros;
        ds.Item[] itemArray59 = tabela55.registros;
        tabela53.registros = itemArray59;
        tabela45.registros = itemArray59;
        tabela0.registros = itemArray59;
        tabela0.n = 97;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        tabela0.registros = itemArray11;
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = ' ';
        tabela15.n = (-1);
        ds.Item[] itemArray20 = tabela15.registros;
        ds.Item[] itemArray21 = tabela15.registros;
        ds.Item[] itemArray22 = tabela15.registros;
        tabela0.registros = itemArray22;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        tabela0.n = (byte) -1;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        tabela18.registros = itemArray25;
        tabela0.registros = itemArray25;
        java.lang.Class<?> wildcardClass28 = itemArray25.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        int int8 = tabela6.n;
        tabela6.n = 32;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item[] itemArray13 = tabela11.registros;
        ds.Item[] itemArray14 = tabela11.registros;
        tabela6.registros = itemArray14;
        tabela0.registros = itemArray14;
        tabela0.n = 0;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item item21 = null;
        tabela0.insere(item21);
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.binaria(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (-1);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = ' ';
        tabela8.n = (-1);
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        tabela6.registros = itemArray10;
        tabela0.registros = itemArray10;
        int int13 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        tabela0.n = 32;
        int int21 = tabela0.n;
        tabela0.n = 'a';
        ds.Item[] itemArray24 = tabela0.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = ' ';
        tabela25.n = 32;
        tabela25.n = (-1);
        ds.Item item32 = null;
        tabela25.insere(item32);
        int int34 = tabela25.n;
        ds.Item[] itemArray35 = tabela25.registros;
        ds.Item item36 = null;
        int int37 = tabela25.binaria(item36);
        ds.Item[] itemArray38 = tabela25.registros;
        ds.Item[] itemArray39 = tabela25.registros;
        ds.Item[] itemArray40 = tabela25.registros;
        tabela0.registros = itemArray40;
        ds.Item[] itemArray42 = tabela0.registros;
        ds.Item item43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = tabela0.pesquisa(item43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = (short) -1;
        ds.Item item5 = null;
        tabela0.insere(item5);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela7.n = 0;
        ds.Item[] itemArray15 = tabela7.registros;
        tabela0.registros = itemArray15;
        tabela0.n = (short) 0;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 0;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        tabela0.n = (byte) -1;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item item14 = null;
        int int15 = tabela11.binaria(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = ' ';
        tabela17.n = 32;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        int int25 = tabela23.n;
        tabela23.n = 32;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item[] itemArray29 = tabela28.registros;
        ds.Item[] itemArray30 = tabela28.registros;
        ds.Item[] itemArray31 = tabela28.registros;
        tabela23.registros = itemArray31;
        tabela17.registros = itemArray31;
        tabela11.registros = itemArray31;
        tabela0.registros = itemArray31;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = ' ';
        tabela37.n = 32;
        tabela37.n = (-1);
        ds.Item item44 = null;
        tabela37.insere(item44);
        int int46 = tabela37.n;
        ds.Item[] itemArray47 = tabela37.registros;
        tabela0.registros = itemArray47;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        int int3 = tabela0.n;
        tabela0.n = 2;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        int int10 = tabela6.n;
        ds.Item item11 = null;
        tabela6.insere(item11);
        tabela6.n = (byte) -1;
        ds.Item[] itemArray15 = tabela6.registros;
        tabela0.registros = itemArray15;
        java.lang.Class<?> wildcardClass17 = itemArray15.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = (short) -1;
        tabela0.n = (byte) -1;
        int int17 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 32;
        int int8 = tabela5.n;
        tabela5.n = (-1);
        ds.Item[] itemArray11 = tabela5.registros;
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = ' ';
        tabela15.n = 32;
        tabela15.n = (-1);
        ds.Item item22 = null;
        tabela15.insere(item22);
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = ' ';
        tabela24.n = 32;
        ds.Item[] itemArray29 = tabela24.registros;
        tabela15.registros = itemArray29;
        ds.Item[] itemArray31 = tabela15.registros;
        tabela0.registros = itemArray31;
        int int33 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 32;
        int int8 = tabela5.n;
        tabela5.n = (-1);
        ds.Item[] itemArray11 = tabela5.registros;
        tabela0.registros = itemArray11;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        int int15 = tabela13.n;
        tabela13.n = 32;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        ds.Item[] itemArray20 = tabela18.registros;
        ds.Item[] itemArray21 = tabela18.registros;
        tabela13.registros = itemArray21;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela13.registros = itemArray24;
        tabela13.n = ' ';
        ds.Item[] itemArray28 = tabela13.registros;
        tabela0.registros = itemArray28;
        int int30 = tabela0.n;
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = tabela0.pesquisa(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) -1;
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        tabela0.n = 100;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        tabela0.n = 52;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        int int16 = tabela14.binaria(item15);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela14.registros = itemArray18;
        ds.Item[] itemArray20 = tabela14.registros;
        tabela0.registros = itemArray20;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 1;
        ds.Item[] itemArray16 = tabela0.registros;
        tabela0.n = (short) 1;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item[] itemArray7 = tabela5.registros;
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = ' ';
        tabela10.n = 32;
        tabela10.n = (-1);
        ds.Item item17 = null;
        tabela10.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = ' ';
        tabela19.n = 32;
        ds.Item[] itemArray24 = tabela19.registros;
        tabela10.registros = itemArray24;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        ds.Item item30 = null;
        tabela26.insere(item30);
        ds.Item item32 = null;
        tabela26.insere(item32);
        tabela26.n = 0;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = ' ';
        tabela36.n = 32;
        tabela36.n = (-1);
        tabela36.n = 2;
        tabela36.n = (byte) -1;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        ds.Item item50 = null;
        int int51 = tabela47.binaria(item50);
        int int52 = tabela47.n;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = ' ';
        tabela53.n = 32;
        ds.Item[] itemArray58 = tabela53.registros;
        ds.Tabela tabela59 = new ds.Tabela();
        int int60 = tabela59.n;
        int int61 = tabela59.n;
        tabela59.n = 32;
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item[] itemArray65 = tabela64.registros;
        ds.Item[] itemArray66 = tabela64.registros;
        ds.Item[] itemArray67 = tabela64.registros;
        tabela59.registros = itemArray67;
        tabela53.registros = itemArray67;
        tabela47.registros = itemArray67;
        tabela36.registros = itemArray67;
        ds.Item[] itemArray72 = tabela36.registros;
        tabela26.registros = itemArray72;
        tabela10.registros = itemArray72;
        ds.Item[] itemArray75 = tabela10.registros;
        tabela0.registros = itemArray75;
        java.lang.Class<?> wildcardClass77 = itemArray75.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Tabela tabela2 = new ds.Tabela();
        ds.Item item3 = null;
        int int4 = tabela2.binaria(item3);
        ds.Item[] itemArray5 = tabela2.registros;
        ds.Item[] itemArray6 = tabela2.registros;
        tabela0.registros = itemArray6;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item item10 = null;
        tabela0.insere(item10);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        tabela0.n = 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        tabela7.n = 32;
        tabela7.n = (-1);
        ds.Item item14 = null;
        tabela7.insere(item14);
        int int16 = tabela7.n;
        ds.Item[] itemArray17 = tabela7.registros;
        ds.Item[] itemArray18 = tabela7.registros;
        ds.Item[] itemArray19 = tabela7.registros;
        ds.Item[] itemArray20 = tabela7.registros;
        tabela0.registros = itemArray20;
        ds.Item item22 = null;
        tabela0.insere(item22);
        ds.Item[] itemArray24 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela0.registros = itemArray7;
        tabela0.n = (short) -1;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        tabela0.n = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (short) 0;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela11.registros = itemArray18;
        int int20 = tabela11.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item[] itemArray25 = tabela21.registros;
        tabela11.registros = itemArray25;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        ds.Item item31 = null;
        tabela27.insere(item31);
        ds.Item[] itemArray33 = new ds.Item[] {};
        tabela27.registros = itemArray33;
        tabela11.registros = itemArray33;
        ds.Item[] itemArray36 = tabela11.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item[] itemArray38 = tabela37.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        int int41 = tabela39.binaria(item40);
        ds.Item[] itemArray42 = tabela39.registros;
        ds.Item[] itemArray43 = tabela39.registros;
        tabela37.registros = itemArray43;
        tabela11.registros = itemArray43;
        ds.Item[] itemArray46 = tabela11.registros;
        tabela0.registros = itemArray46;
        int int48 = tabela0.n;
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = tabela0.pesquisa(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        int int3 = tabela0.n;
        tabela0.n = 2;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = 32;
        int int14 = tabela11.n;
        tabela11.n = (-1);
        ds.Item[] itemArray17 = tabela11.registros;
        tabela6.registros = itemArray17;
        int int19 = tabela6.n;
        ds.Item[] itemArray20 = tabela6.registros;
        tabela0.registros = itemArray20;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (short) 0;
        ds.Item item9 = null;
        tabela0.insere(item9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        tabela2.n = ' ';
        tabela2.n = 32;
        tabela2.n = (-1);
        ds.Item item9 = null;
        tabela2.insere(item9);
        int int11 = tabela2.n;
        ds.Item[] itemArray12 = tabela2.registros;
        ds.Item[] itemArray13 = tabela2.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        int int16 = tabela0.binaria(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        int int18 = tabela17.n;
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        tabela17.registros = itemArray20;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        int int25 = tabela23.n;
        tabela23.n = 32;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item[] itemArray29 = tabela28.registros;
        ds.Item[] itemArray30 = tabela28.registros;
        ds.Item[] itemArray31 = tabela28.registros;
        tabela23.registros = itemArray31;
        tabela17.registros = itemArray31;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = ' ';
        tabela8.n = 32;
        tabela8.n = (-1);
        tabela8.n = 2;
        tabela8.n = (byte) -1;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item item22 = null;
        int int23 = tabela19.binaria(item22);
        int int24 = tabela19.n;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = ' ';
        tabela25.n = 32;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        int int32 = tabela31.n;
        int int33 = tabela31.n;
        tabela31.n = 32;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item[] itemArray37 = tabela36.registros;
        ds.Item[] itemArray38 = tabela36.registros;
        ds.Item[] itemArray39 = tabela36.registros;
        tabela31.registros = itemArray39;
        tabela25.registros = itemArray39;
        tabela19.registros = itemArray39;
        tabela8.registros = itemArray39;
        ds.Item[] itemArray44 = tabela8.registros;
        tabela6.registros = itemArray44;
        ds.Item[] itemArray46 = tabela6.registros;
        tabela0.registros = itemArray46;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        tabela8.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela0.registros = itemArray22;
        tabela0.n = 100;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela26.registros = itemArray32;
        ds.Item item34 = null;
        int int35 = tabela26.binaria(item34);
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = ' ';
        tabela36.n = (-1);
        ds.Item[] itemArray41 = tabela36.registros;
        ds.Item item42 = null;
        tabela36.insere(item42);
        ds.Item[] itemArray44 = tabela36.registros;
        tabela26.registros = itemArray44;
        ds.Item[] itemArray46 = tabela26.registros;
        tabela0.registros = itemArray46;
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = tabela0.pesquisa(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        tabela0.n = 'a';
        tabela0.n = (byte) -1;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        tabela18.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = 32;
        int int31 = tabela28.n;
        tabela28.n = 32;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        int int36 = tabela34.binaria(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        tabela28.registros = itemArray37;
        tabela28.n = 0;
        ds.Item[] itemArray41 = tabela28.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        tabela42.n = ' ';
        tabela42.n = 32;
        tabela42.n = (-1);
        ds.Item item49 = null;
        tabela42.insere(item49);
        ds.Tabela tabela51 = new ds.Tabela();
        tabela51.n = ' ';
        tabela51.n = 32;
        tabela51.n = (-1);
        tabela51.n = 2;
        tabela51.n = (byte) -1;
        ds.Item[] itemArray62 = tabela51.registros;
        tabela42.registros = itemArray62;
        ds.Item[] itemArray64 = tabela42.registros;
        tabela28.registros = itemArray64;
        tabela0.registros = itemArray64;
        ds.Item[] itemArray67 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        tabela0.n = (short) 100;
        int int18 = tabela0.n;
        int int19 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = 2;
        ds.Item item9 = null;
        tabela0.insere(item9);
        tabela0.n = 0;
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        tabela0.n = (short) 0;
        int int12 = tabela0.n;
        ds.Item item13 = null;
        tabela0.insere(item13);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = (byte) 10;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (byte) -1;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item[] itemArray16 = tabela12.registros;
        tabela10.registros = itemArray16;
        tabela0.registros = itemArray16;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item item23 = null;
        tabela19.insere(item23);
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela19.registros = itemArray25;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        ds.Item[] itemArray31 = tabela27.registros;
        tabela19.registros = itemArray31;
        ds.Tabela tabela33 = new ds.Tabela();
        tabela33.n = ' ';
        tabela33.n = 32;
        tabela33.n = (-1);
        tabela33.n = 2;
        tabela33.n = (byte) -1;
        ds.Item[] itemArray44 = tabela33.registros;
        tabela19.registros = itemArray44;
        tabela19.n = 1;
        tabela19.n = 2;
        ds.Item[] itemArray50 = tabela19.registros;
        tabela0.registros = itemArray50;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        java.lang.Class<?> wildcardClass10 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = (short) 0;
        int int15 = tabela0.n;
        ds.Item item16 = null;
        int int17 = tabela0.binaria(item16);
        ds.Item item18 = null;
        tabela0.insere(item18);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.pesquisa(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item[] itemArray7 = tabela5.registros;
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        tabela0.n = ' ';
        int int15 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.binaria(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        tabela0.insere(item14);
        tabela0.n = (byte) 100;
        tabela0.n = 97;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = ' ';
        tabela7.n = 32;
        tabela7.n = (-1);
        ds.Item item14 = null;
        tabela7.insere(item14);
        int int16 = tabela7.n;
        ds.Item[] itemArray17 = tabela7.registros;
        tabela0.registros = itemArray17;
        int int19 = tabela0.n;
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Item item22 = null;
        tabela0.insere(item22);
        tabela0.n = (short) 10;
        java.lang.Class<?> wildcardClass26 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 0;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        tabela0.n = 52;
        int int14 = tabela0.n;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 10;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = null;
        tabela0.registros = itemArray9;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (short) 0;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = ' ';
        tabela9.n = 32;
        ds.Item[] itemArray14 = tabela9.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = ' ';
        tabela17.n = 32;
        tabela17.n = (-1);
        tabela17.n = 2;
        tabela17.n = (byte) -1;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item item31 = null;
        int int32 = tabela28.binaria(item31);
        int int33 = tabela28.n;
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = ' ';
        tabela34.n = 32;
        ds.Item[] itemArray39 = tabela34.registros;
        ds.Tabela tabela40 = new ds.Tabela();
        int int41 = tabela40.n;
        int int42 = tabela40.n;
        tabela40.n = 32;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item[] itemArray46 = tabela45.registros;
        ds.Item[] itemArray47 = tabela45.registros;
        ds.Item[] itemArray48 = tabela45.registros;
        tabela40.registros = itemArray48;
        tabela34.registros = itemArray48;
        tabela28.registros = itemArray48;
        tabela17.registros = itemArray48;
        ds.Item[] itemArray53 = tabela17.registros;
        tabela0.registros = itemArray53;
        ds.Item item55 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int56 = tabela0.pesquisa(item55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        tabela0.n = 2;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        tabela0.n = 32;
        tabela0.n = (-1);
        tabela0.n = (short) 10;
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        tabela0.n = (short) 0;
        int int15 = tabela0.n;
        ds.Item item16 = null;
        int int17 = tabela0.binaria(item16);
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = ' ';
        tabela18.n = 32;
        tabela18.n = (-1);
        ds.Item item25 = null;
        tabela18.insere(item25);
        int int27 = tabela18.n;
        ds.Item[] itemArray28 = tabela18.registros;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        tabela29.insere(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        ds.Item item33 = null;
        tabela29.insere(item33);
        ds.Item[] itemArray35 = new ds.Item[] {};
        tabela29.registros = itemArray35;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        ds.Item[] itemArray40 = tabela37.registros;
        ds.Item[] itemArray41 = tabela37.registros;
        tabela29.registros = itemArray41;
        tabela18.registros = itemArray41;
        int int44 = tabela18.n;
        ds.Item[] itemArray45 = tabela18.registros;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        tabela46.insere(item47);
        ds.Item[] itemArray49 = tabela46.registros;
        ds.Item item50 = null;
        tabela46.insere(item50);
        ds.Item[] itemArray52 = new ds.Item[] {};
        tabela46.registros = itemArray52;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        ds.Item[] itemArray57 = tabela54.registros;
        ds.Item[] itemArray58 = tabela54.registros;
        tabela46.registros = itemArray58;
        tabela46.n = 1;
        ds.Item[] itemArray62 = tabela46.registros;
        tabela18.registros = itemArray62;
        tabela0.registros = itemArray62;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
    }
}

