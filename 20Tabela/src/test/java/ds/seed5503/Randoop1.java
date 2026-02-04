package ds.seed5503;

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
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela0.registros = itemArray9;
        int int11 = tabela0.n;
        tabela0.n = 32;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        int int16 = tabela14.binaria(item15);
        ds.Item[] itemArray17 = tabela14.registros;
        ds.Item item18 = null;
        int int19 = tabela14.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        tabela20.n = '#';
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        int int28 = tabela26.binaria(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela20.registros = itemArray29;
        tabela14.registros = itemArray29;
        int int32 = tabela14.n;
        ds.Item item33 = null;
        int int34 = tabela14.binaria(item33);
        ds.Item[] itemArray35 = tabela14.registros;
        tabela0.registros = itemArray35;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        ds.Item[] itemArray40 = tabela37.registros;
        ds.Item[] itemArray41 = tabela37.registros;
        tabela0.registros = itemArray41;
        ds.Item item43 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = ' ';
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (byte) -1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = '#';
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = (short) 100;
        ds.Item[] itemArray19 = tabela13.registros;
        tabela0.registros = itemArray19;
        tabela0.n = (short) 100;
        tabela0.n = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
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
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        tabela0.registros = itemArray8;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        tabela11.n = (-1);
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item[] itemArray23 = tabela19.registros;
        tabela11.registros = itemArray23;
        ds.Item[] itemArray25 = tabela11.registros;
        tabela0.registros = itemArray25;
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tabela0.pesquisa(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela6.n = '#';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela6.registros = itemArray15;
        tabela0.registros = itemArray15;
        int int18 = tabela0.n;
        int int19 = tabela0.n;
        ds.Item[] itemArray20 = tabela0.registros;
        ds.Item item21 = null;
        tabela0.insere(item21);
        int int23 = tabela0.n;
        tabela0.n = (byte) -1;
        tabela0.n = '#';
        tabela0.n = 'a';
        tabela0.n = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        tabela6.n = '#';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela6.registros = itemArray15;
        tabela0.registros = itemArray15;
        int int18 = tabela0.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        int int23 = tabela19.n;
        ds.Item item24 = null;
        int int25 = tabela19.binaria(item24);
        tabela19.n = 100;
        tabela19.n = (byte) 10;
        ds.Item[] itemArray30 = tabela19.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        ds.Item[] itemArray34 = tabela31.registros;
        tabela31.n = '#';
        int int37 = tabela31.n;
        int int38 = tabela31.n;
        ds.Item[] itemArray39 = tabela31.registros;
        tabela19.registros = itemArray39;
        ds.Item[] itemArray41 = tabela19.registros;
        tabela0.registros = itemArray41;
        java.lang.Class<?> wildcardClass43 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        ds.Item[] itemArray9 = tabela0.registros;
        int int10 = tabela0.n;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        tabela0.registros = itemArray10;
        tabela0.n = 0;
        tabela0.n = (-1);
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        tabela0.insere(item17);
        int int19 = tabela0.n;
        int int20 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        tabela9.n = (short) 10;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        int int16 = tabela14.binaria(item15);
        ds.Item[] itemArray17 = tabela14.registros;
        int int18 = tabela14.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        tabela14.registros = itemArray22;
        ds.Item[] itemArray24 = tabela14.registros;
        ds.Item item25 = null;
        int int26 = tabela14.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        ds.Item[] itemArray37 = tabela33.registros;
        tabela27.registros = itemArray37;
        tabela14.registros = itemArray37;
        tabela9.registros = itemArray37;
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item item42 = null;
        int int43 = tabela41.binaria(item42);
        ds.Item[] itemArray44 = tabela41.registros;
        int int45 = tabela41.n;
        ds.Item item46 = null;
        int int47 = tabela41.binaria(item46);
        tabela41.n = 100;
        tabela41.n = (byte) 10;
        ds.Item[] itemArray52 = tabela41.registros;
        tabela9.registros = itemArray52;
        tabela0.registros = itemArray52;
        ds.Item[] itemArray55 = tabela0.registros;
        tabela0.n = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        ds.Item[] itemArray9 = tabela0.registros;
        int int10 = tabela0.n;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.binaria(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (byte) -1;
        tabela0.n = 2;
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        tabela0.n = (short) 0;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Item[] itemArray16 = tabela0.registros;
        tabela0.n = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        tabela9.insere(item13);
        int int15 = tabela9.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        int int18 = tabela16.binaria(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        tabela9.registros = itemArray19;
        tabela9.n = 0;
        tabela9.n = (-1);
        ds.Item[] itemArray25 = tabela9.registros;
        tabela0.registros = itemArray25;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        ds.Item item31 = null;
        tabela27.insere(item31);
        int int33 = tabela27.n;
        ds.Item[] itemArray34 = tabela27.registros;
        int int35 = tabela27.n;
        ds.Item[] itemArray36 = tabela27.registros;
        tabela0.registros = itemArray36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = '4';
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        int int13 = tabela8.binaria(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        int int16 = tabela14.binaria(item15);
        ds.Item[] itemArray17 = tabela14.registros;
        tabela14.n = '#';
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        tabela14.registros = itemArray23;
        tabela8.registros = itemArray23;
        ds.Item[] itemArray26 = tabela8.registros;
        tabela0.registros = itemArray26;
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        tabela7.n = '#';
        int int13 = tabela7.n;
        tabela7.n = (byte) -1;
        ds.Item item16 = null;
        tabela7.insere(item16);
        ds.Item[] itemArray18 = tabela7.registros;
        tabela0.registros = itemArray18;
        ds.Item item20 = null;
        tabela0.insere(item20);
        int int22 = tabela0.n;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.pesquisa(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        tabela8.n = '#';
        int int14 = tabela8.n;
        int int15 = tabela8.n;
        ds.Item[] itemArray16 = tabela8.registros;
        ds.Item[] itemArray17 = tabela8.registros;
        tabela0.registros = itemArray17;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        tabela0.insere(item15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
    }
}

