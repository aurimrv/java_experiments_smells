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
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 0;
        tabela0.n = 32;
        int int13 = tabela0.n;
        int int14 = tabela0.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        int int23 = tabela15.n;
        tabela15.n = (byte) 0;
        int int26 = tabela15.n;
        ds.Item item27 = null;
        int int28 = tabela15.binaria(item27);
        ds.Item item29 = null;
        int int30 = tabela15.binaria(item29);
        ds.Item[] itemArray31 = tabela15.registros;
        ds.Item[] itemArray32 = tabela15.registros;
        tabela15.n = '4';
        ds.Item[] itemArray35 = tabela15.registros;
        tabela0.registros = itemArray35;
        int int37 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        java.lang.Class<?> wildcardClass6 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        ds.Item[] itemArray5 = tabela3.registros;
        ds.Item item6 = null;
        tabela3.insere(item6);
        tabela3.n = 3;
        ds.Tabela tabela10 = new ds.Tabela();
        int int11 = tabela10.n;
        int int12 = tabela10.n;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item item15 = null;
        tabela10.insere(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        int int18 = tabela17.n;
        ds.Item item19 = null;
        tabela17.insere(item19);
        tabela17.n = 32;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item item28 = null;
        tabela23.insere(item28);
        ds.Item item30 = null;
        tabela23.insere(item30);
        ds.Item[] itemArray32 = tabela23.registros;
        tabela17.registros = itemArray32;
        tabela10.registros = itemArray32;
        tabela3.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray37 = tabela0.registros;
        ds.Item[] itemArray38 = tabela0.registros;
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        int int5 = tabela0.n;
        tabela0.n = 0;
        int int8 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item item14 = null;
        tabela10.insere(item14);
        ds.Item item16 = null;
        tabela10.insere(item16);
        int int18 = tabela10.n;
        tabela10.n = (byte) 0;
        ds.Item[] itemArray21 = tabela10.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        int int23 = tabela22.n;
        int int24 = tabela22.n;
        ds.Item[] itemArray25 = tabela22.registros;
        tabela22.n = (byte) 0;
        ds.Item[] itemArray28 = tabela22.registros;
        tabela22.n = (short) 10;
        ds.Tabela tabela31 = new ds.Tabela();
        int int32 = tabela31.n;
        int int33 = tabela31.n;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        ds.Item[] itemArray36 = tabela34.registros;
        ds.Item item37 = null;
        int int38 = tabela34.binaria(item37);
        ds.Item item39 = null;
        tabela34.insere(item39);
        ds.Item[] itemArray41 = tabela34.registros;
        tabela31.registros = itemArray41;
        ds.Item[] itemArray43 = tabela31.registros;
        tabela22.registros = itemArray43;
        tabela10.registros = itemArray43;
        tabela0.registros = itemArray43;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        java.lang.Class<?> wildcardClass3 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        ds.Item[] itemArray5 = tabela3.registros;
        ds.Item item6 = null;
        int int7 = tabela3.binaria(item6);
        ds.Item item8 = null;
        tabela3.insere(item8);
        ds.Item[] itemArray10 = tabela3.registros;
        tabela0.registros = itemArray10;
        int int12 = tabela0.n;
        tabela0.n = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        tabela0.insere(item33);
        tabela0.n = (byte) 100;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 0;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Item item17 = null;
        tabela11.insere(item17);
        int int19 = tabela11.n;
        tabela11.n = (byte) 0;
        int int22 = tabela11.n;
        ds.Item item23 = null;
        int int24 = tabela11.binaria(item23);
        ds.Item[] itemArray25 = tabela11.registros;
        tabela0.registros = itemArray25;
        ds.Item item27 = null;
        tabela0.insere(item27);
        ds.Item item29 = null;
        tabela0.insere(item29);
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = tabela0.pesquisa(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = ' ';
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = 100;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 10;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item[] itemArray15 = tabela11.registros;
        tabela11.n = 100;
        ds.Item[] itemArray18 = tabela11.registros;
        tabela0.registros = itemArray18;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item item9 = null;
        tabela5.insere(item9);
        ds.Item item11 = null;
        tabela5.insere(item11);
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela5.registros = itemArray13;
        tabela0.registros = itemArray13;
        java.lang.Class<?> wildcardClass16 = itemArray13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = (byte) 100;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        int int6 = tabela5.n;
        int int7 = tabela5.n;
        ds.Item[] itemArray8 = tabela5.registros;
        tabela5.n = 100;
        ds.Item[] itemArray11 = tabela5.registros;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray13 = tabela0.registros;
        java.lang.Class<?> wildcardClass14 = itemArray13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 100;
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela4.registros = itemArray12;
        ds.Item[] itemArray14 = tabela4.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        tabela9.insere(item13);
        ds.Item item15 = null;
        tabela9.insere(item15);
        int int17 = tabela9.n;
        tabela9.n = (byte) 0;
        int int20 = tabela9.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela9.registros = itemArray30;
        tabela0.registros = itemArray30;
        ds.Item item33 = null;
        tabela0.insere(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        tabela35.insere(item36);
        ds.Item[] itemArray38 = tabela35.registros;
        ds.Item item39 = null;
        tabela35.insere(item39);
        ds.Item item41 = null;
        tabela35.insere(item41);
        ds.Item item43 = null;
        tabela35.insere(item43);
        tabela35.n = 0;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        tabela47.insere(item48);
        ds.Item[] itemArray50 = tabela47.registros;
        ds.Item item51 = null;
        tabela47.insere(item51);
        ds.Item item53 = null;
        tabela47.insere(item53);
        ds.Item[] itemArray55 = new ds.Item[] {};
        tabela47.registros = itemArray55;
        int int57 = tabela47.n;
        ds.Item[] itemArray58 = tabela47.registros;
        ds.Item[] itemArray59 = tabela47.registros;
        tabela35.registros = itemArray59;
        ds.Item[] itemArray61 = tabela35.registros;
        tabela0.registros = itemArray61;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        int int9 = tabela7.n;
        tabela7.n = 'a';
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        java.lang.Class<?> wildcardClass14 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item item14 = null;
        tabela8.insere(item14);
        ds.Item item16 = null;
        tabela8.insere(item16);
        tabela8.n = 0;
        ds.Item[] itemArray20 = tabela8.registros;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray22 = null;
        tabela0.registros = itemArray22;
        int int24 = tabela0.n;
        int int25 = tabela0.n;
        tabela0.n = 4;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = (short) -1;
        tabela0.n = ' ';
        java.lang.Class<?> wildcardClass37 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        int int8 = tabela6.n;
        ds.Item item9 = null;
        tabela6.insere(item9);
        ds.Item item11 = null;
        tabela6.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item item15 = null;
        tabela13.insere(item15);
        tabela13.n = 32;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item[] itemArray23 = tabela19.registros;
        ds.Item item24 = null;
        tabela19.insere(item24);
        ds.Item item26 = null;
        tabela19.insere(item26);
        ds.Item[] itemArray28 = tabela19.registros;
        tabela13.registros = itemArray28;
        tabela6.registros = itemArray28;
        tabela0.registros = itemArray28;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = 0;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        tabela0.n = (short) 0;
        tabela0.n = 0;
        ds.Item[] itemArray18 = tabela0.registros;
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item[] itemArray17 = tabela13.registros;
        ds.Item item18 = null;
        tabela13.insere(item18);
        ds.Item item20 = null;
        tabela13.insere(item20);
        ds.Item[] itemArray22 = tabela13.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        ds.Item item27 = null;
        tabela23.insere(item27);
        ds.Item item29 = null;
        tabela23.insere(item29);
        tabela23.n = 2;
        ds.Item[] itemArray33 = tabela23.registros;
        tabela13.registros = itemArray33;
        tabela0.registros = itemArray33;
        ds.Item item36 = null;
        tabela0.insere(item36);
        ds.Item item38 = null;
        tabela0.insere(item38);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = (byte) 10;
        tabela0.n = 0;
        int int37 = tabela0.n;
        ds.Item[] itemArray38 = tabela0.registros;
        ds.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = tabela0.pesquisa(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        int int10 = tabela9.n;
        int int11 = tabela9.n;
        ds.Item[] itemArray12 = tabela9.registros;
        tabela9.n = (byte) 0;
        ds.Item[] itemArray15 = tabela9.registros;
        ds.Item[] itemArray16 = tabela9.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        ds.Item[] itemArray22 = tabela20.registros;
        ds.Item item23 = null;
        int int24 = tabela20.binaria(item23);
        ds.Item item25 = null;
        tabela20.insere(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        int int28 = tabela27.n;
        int int29 = tabela27.n;
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = (byte) 0;
        ds.Item[] itemArray33 = tabela27.registros;
        ds.Item[] itemArray34 = tabela27.registros;
        tabela20.registros = itemArray34;
        tabela0.registros = itemArray34;
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = tabela0.binaria(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela4.registros = itemArray12;
        tabela0.registros = itemArray12;
        tabela0.n = 'a';
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass17);
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
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item[] itemArray17 = tabela0.registros;
        tabela0.n = '4';
        ds.Item[] itemArray20 = tabela0.registros;
        tabela0.n = ' ';
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        tabela3.insere(item4);
        ds.Item[] itemArray6 = tabela3.registros;
        ds.Item[] itemArray7 = tabela3.registros;
        tabela0.registros = itemArray7;
        tabela0.n = (-1);
        tabela0.n = 3;
        ds.Item item13 = null;
        tabela0.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = (short) 1;
        ds.Item item18 = null;
        tabela15.insere(item18);
        ds.Item[] itemArray20 = tabela15.registros;
        ds.Item[] itemArray21 = tabela15.registros;
        tabela0.registros = itemArray21;
        ds.Item item23 = null;
        tabela0.insere(item23);
        int int25 = tabela0.n;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 1;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        int int9 = tabela8.n;
        int int10 = tabela8.n;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        int int16 = tabela8.n;
        ds.Item[] itemArray17 = tabela8.registros;
        tabela0.registros = itemArray17;
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(itemArray17);
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
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        tabela0.n = 0;
        ds.Item[] itemArray15 = tabela0.registros;
        java.lang.Class<?> wildcardClass16 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = 'a';
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item item12 = null;
        tabela4.insere(item12);
        int int14 = tabela4.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela4.registros = itemArray18;
        tabela0.registros = itemArray18;
        ds.Item item21 = null;
        int int22 = tabela0.binaria(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        int int25 = tabela23.n;
        tabela23.n = (byte) 1;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        ds.Item item32 = null;
        tabela28.insere(item32);
        ds.Item item34 = null;
        tabela28.insere(item34);
        ds.Item item36 = null;
        tabela28.insere(item36);
        tabela28.n = 0;
        ds.Item[] itemArray40 = tabela28.registros;
        ds.Tabela tabela41 = new ds.Tabela();
        int int42 = tabela41.n;
        int int43 = tabela41.n;
        ds.Tabela tabela44 = new ds.Tabela();
        int int45 = tabela44.n;
        int int46 = tabela44.n;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        tabela47.insere(item48);
        ds.Item[] itemArray50 = tabela47.registros;
        ds.Item[] itemArray51 = tabela47.registros;
        tabela44.registros = itemArray51;
        tabela41.registros = itemArray51;
        tabela28.registros = itemArray51;
        tabela23.registros = itemArray51;
        ds.Item[] itemArray56 = tabela23.registros;
        tabela0.registros = itemArray56;
        java.lang.Class<?> wildcardClass58 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item[] itemArray8 = tabela7.registros;
        tabela7.n = (short) -1;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Item item17 = null;
        tabela11.insere(item17);
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela11.registros = itemArray19;
        tabela7.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray23 = tabela0.registros;
        int int24 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        tabela0.insere(item33);
        java.lang.Class<?> wildcardClass35 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item[] itemArray34 = tabela33.registros;
        int int35 = tabela33.n;
        ds.Item[] itemArray36 = tabela33.registros;
        tabela0.registros = itemArray36;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        tabela38.insere(item39);
        tabela38.n = (short) 10;
        tabela38.n = 100;
        ds.Tabela tabela45 = new ds.Tabela();
        int int46 = tabela45.n;
        int int47 = tabela45.n;
        ds.Item[] itemArray48 = tabela45.registros;
        ds.Item[] itemArray49 = tabela45.registros;
        ds.Item item50 = null;
        tabela45.insere(item50);
        ds.Tabela tabela52 = new ds.Tabela();
        ds.Item[] itemArray53 = tabela52.registros;
        tabela52.n = (short) -1;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item item57 = null;
        tabela56.insere(item57);
        ds.Item[] itemArray59 = tabela56.registros;
        ds.Item item60 = null;
        tabela56.insere(item60);
        ds.Item item62 = null;
        tabela56.insere(item62);
        ds.Item[] itemArray64 = new ds.Item[] {};
        tabela56.registros = itemArray64;
        tabela52.registros = itemArray64;
        tabela45.registros = itemArray64;
        tabela38.registros = itemArray64;
        tabela38.n = (byte) 0;
        int int71 = tabela38.n;
        ds.Item[] itemArray72 = tabela38.registros;
        tabela0.registros = itemArray72;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        tabela0.insere(item9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        int int6 = tabela5.n;
        int int7 = tabela5.n;
        ds.Item[] itemArray8 = tabela5.registros;
        tabela5.n = 100;
        ds.Item[] itemArray11 = tabela5.registros;
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item item12 = null;
        tabela4.insere(item12);
        int int14 = tabela4.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela4.registros = itemArray18;
        tabela0.registros = itemArray18;
        ds.Item item21 = null;
        int int22 = tabela0.binaria(item21);
        ds.Item[] itemArray23 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 10;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        ds.Item item19 = null;
        tabela13.insere(item19);
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela13.registros = itemArray21;
        ds.Item[] itemArray23 = tabela13.registros;
        tabela13.n = (byte) 10;
        tabela13.n = (short) 100;
        ds.Item[] itemArray28 = tabela13.registros;
        tabela0.registros = itemArray28;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (byte) 0;
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        int int14 = tabela12.n;
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = (byte) 0;
        ds.Item[] itemArray18 = tabela12.registros;
        tabela12.n = (short) 10;
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        int int23 = tabela21.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item[] itemArray26 = tabela24.registros;
        ds.Item item27 = null;
        int int28 = tabela24.binaria(item27);
        ds.Item item29 = null;
        tabela24.insere(item29);
        ds.Item[] itemArray31 = tabela24.registros;
        tabela21.registros = itemArray31;
        ds.Item[] itemArray33 = tabela21.registros;
        tabela12.registros = itemArray33;
        tabela0.registros = itemArray33;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Item item37 = null;
        int int38 = tabela0.binaria(item37);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        tabela0.n = 100;
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        int int9 = tabela7.n;
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item item12 = null;
        tabela7.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        tabela14.n = (short) -1;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        ds.Item item22 = null;
        tabela18.insere(item22);
        ds.Item item24 = null;
        tabela18.insere(item24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        tabela18.registros = itemArray26;
        tabela14.registros = itemArray26;
        tabela7.registros = itemArray26;
        tabela0.registros = itemArray26;
        tabela0.n = (byte) 0;
        int int33 = tabela0.n;
        java.lang.Class<?> wildcardClass34 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = 0;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item[] itemArray11 = tabela9.registros;
        int int12 = tabela9.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        ds.Item item19 = null;
        tabela13.insere(item19);
        int int21 = tabela13.n;
        tabela13.n = (byte) 0;
        int int24 = tabela13.n;
        ds.Item item25 = null;
        int int26 = tabela13.binaria(item25);
        ds.Item[] itemArray27 = tabela13.registros;
        tabela9.registros = itemArray27;
        tabela0.registros = itemArray27;
        java.lang.Class<?> wildcardClass30 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = 0;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item[] itemArray11 = tabela9.registros;
        int int12 = tabela9.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        ds.Item item19 = null;
        tabela13.insere(item19);
        int int21 = tabela13.n;
        tabela13.n = (byte) 0;
        int int24 = tabela13.n;
        ds.Item item25 = null;
        int int26 = tabela13.binaria(item25);
        ds.Item[] itemArray27 = tabela13.registros;
        tabela9.registros = itemArray27;
        tabela0.registros = itemArray27;
        tabela0.n = 10;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item[] itemArray8 = tabela6.registros;
        tabela0.registros = itemArray8;
        ds.Item[] itemArray10 = tabela0.registros;
        tabela0.n = 'a';
        int int13 = tabela0.n;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item[] itemArray9 = null;
        tabela0.registros = itemArray9;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Item item17 = null;
        tabela11.insere(item17);
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela11.registros = itemArray19;
        ds.Item[] itemArray21 = tabela11.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        int int23 = tabela22.n;
        int int24 = tabela22.n;
        ds.Item[] itemArray25 = tabela22.registros;
        ds.Item[] itemArray26 = tabela22.registros;
        ds.Item item27 = null;
        tabela22.insere(item27);
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item[] itemArray30 = tabela29.registros;
        tabela29.n = (short) -1;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        ds.Item item37 = null;
        tabela33.insere(item37);
        ds.Item item39 = null;
        tabela33.insere(item39);
        ds.Item[] itemArray41 = new ds.Item[] {};
        tabela33.registros = itemArray41;
        tabela29.registros = itemArray41;
        tabela22.registros = itemArray41;
        tabela11.registros = itemArray41;
        tabela0.registros = itemArray41;
        java.lang.Class<?> wildcardClass47 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (byte) 100;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.binaria(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 1;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        int int10 = tabela9.n;
        ds.Item item11 = null;
        tabela9.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        int int15 = tabela13.n;
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item[] itemArray17 = tabela13.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        int int19 = tabela18.n;
        int int20 = tabela18.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item[] itemArray23 = tabela21.registros;
        ds.Item item24 = null;
        int int25 = tabela21.binaria(item24);
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Item[] itemArray28 = tabela21.registros;
        tabela18.registros = itemArray28;
        tabela13.registros = itemArray28;
        tabela9.registros = itemArray28;
        tabela0.registros = itemArray28;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = (short) -1;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = (byte) 10;
        int int35 = tabela0.n;
        java.lang.Class<?> wildcardClass36 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.binaria(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        tabela0.n = 100;
        tabela0.n = ' ';
        int int9 = tabela0.n;
        java.lang.Class<?> wildcardClass10 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = 100;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = (short) -1;
        ds.Item[] itemArray35 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 0;
        ds.Item item11 = null;
        tabela0.insere(item11);
        int int13 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        int int14 = tabela12.n;
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = (byte) 0;
        ds.Item[] itemArray18 = tabela12.registros;
        tabela12.n = (short) 10;
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        int int23 = tabela21.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item[] itemArray26 = tabela24.registros;
        ds.Item item27 = null;
        int int28 = tabela24.binaria(item27);
        ds.Item item29 = null;
        tabela24.insere(item29);
        ds.Item[] itemArray31 = tabela24.registros;
        tabela21.registros = itemArray31;
        ds.Item[] itemArray33 = tabela21.registros;
        tabela12.registros = itemArray33;
        tabela0.registros = itemArray33;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Item item37 = null;
        tabela0.insere(item37);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item item14 = null;
        tabela8.insere(item14);
        ds.Item item16 = null;
        tabela8.insere(item16);
        tabela8.n = 0;
        ds.Item[] itemArray20 = tabela8.registros;
        tabela0.registros = itemArray20;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        tabela0.insere(item23);
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.binaria(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        int int5 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = ' ';
        ds.Item[] itemArray6 = tabela0.registros;
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 0;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Item item17 = null;
        tabela11.insere(item17);
        int int19 = tabela11.n;
        tabela11.n = (byte) 0;
        int int22 = tabela11.n;
        ds.Item item23 = null;
        int int24 = tabela11.binaria(item23);
        ds.Item[] itemArray25 = tabela11.registros;
        tabela0.registros = itemArray25;
        ds.Item item27 = null;
        tabela0.insere(item27);
        ds.Item item29 = null;
        tabela0.insere(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        int int32 = tabela31.n;
        tabela31.n = '#';
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        int int37 = tabela35.binaria(item36);
        ds.Item item38 = null;
        tabela35.insere(item38);
        ds.Item item40 = null;
        tabela35.insere(item40);
        tabela35.n = 3;
        ds.Item item44 = null;
        tabela35.insere(item44);
        ds.Item[] itemArray46 = tabela35.registros;
        tabela31.registros = itemArray46;
        tabela0.registros = itemArray46;
        int int49 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela4.registros = itemArray12;
        tabela0.registros = itemArray12;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela15.n = (short) 10;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item[] itemArray20 = tabela19.registros;
        ds.Item[] itemArray21 = tabela19.registros;
        ds.Item item22 = null;
        int int23 = tabela19.binaria(item22);
        ds.Item item24 = null;
        tabela19.insere(item24);
        ds.Item[] itemArray26 = tabela19.registros;
        tabela15.registros = itemArray26;
        tabela0.registros = itemArray26;
        ds.Item item29 = null;
        tabela0.insere(item29);
        ds.Item item31 = null;
        int int32 = tabela0.binaria(item31);
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        java.lang.Class<?> wildcardClass12 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item item19 = null;
        tabela12.insere(item19);
        ds.Item[] itemArray21 = tabela12.registros;
        tabela0.registros = itemArray21;
        int int23 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = (short) -1;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        tabela0.insere(item13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela4.registros = itemArray12;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray15 = tabela0.registros;
        int int16 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        ds.Item[] itemArray2 = tabela1.registros;
        ds.Item[] itemArray3 = tabela1.registros;
        ds.Item item4 = null;
        int int5 = tabela1.binaria(item4);
        ds.Item item6 = null;
        tabela1.insere(item6);
        ds.Item[] itemArray8 = tabela1.registros;
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item item11 = null;
        tabela0.insere(item11);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        int int5 = tabela0.n;
        tabela0.n = 0;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        int int11 = tabela10.n;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item[] itemArray15 = tabela10.registros;
        tabela0.registros = itemArray15;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        int int12 = tabela6.n;
        int int13 = tabela6.n;
        ds.Item[] itemArray14 = tabela6.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        int int18 = tabela17.n;
        int int19 = tabela17.n;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela17.registros = itemArray24;
        tabela0.registros = itemArray24;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
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
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (short) 100;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 100;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item[] itemArray8 = tabela7.registros;
        tabela7.n = (short) -1;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Item item17 = null;
        tabela11.insere(item17);
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela11.registros = itemArray19;
        tabela7.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.binaria(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        ds.Item[] itemArray10 = tabela0.registros;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = 0;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        int int15 = tabela13.n;
        ds.Tabela tabela16 = new ds.Tabela();
        int int17 = tabela16.n;
        int int18 = tabela16.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item[] itemArray23 = tabela19.registros;
        tabela16.registros = itemArray23;
        tabela13.registros = itemArray23;
        tabela0.registros = itemArray23;
        tabela0.n = (byte) -1;
        ds.Item item29 = null;
        tabela0.insere(item29);
        ds.Item item31 = null;
        tabela0.insere(item31);
        ds.Item item33 = null;
        tabela0.insere(item33);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Tabela tabela3 = new ds.Tabela();
        int int4 = tabela3.n;
        int int5 = tabela3.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela3.registros = itemArray10;
        tabela0.registros = itemArray10;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        tabela0.n = 100;
        int int7 = tabela0.n;
        tabela0.n = (byte) 100;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        tabela0.n = ' ';
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = 0;
        int int16 = tabela0.n;
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 1;
        ds.Item[] itemArray8 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = 0;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        int int15 = tabela13.n;
        ds.Tabela tabela16 = new ds.Tabela();
        int int17 = tabela16.n;
        int int18 = tabela16.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item[] itemArray23 = tabela19.registros;
        tabela16.registros = itemArray23;
        tabela13.registros = itemArray23;
        tabela0.registros = itemArray23;
        tabela0.n = (byte) -1;
        ds.Item item29 = null;
        tabela0.insere(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        ds.Item[] itemArray34 = tabela31.registros;
        ds.Item[] itemArray35 = tabela31.registros;
        tabela31.n = 100;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item[] itemArray39 = tabela38.registros;
        tabela38.n = (short) -1;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        tabela42.insere(item43);
        ds.Item[] itemArray45 = tabela42.registros;
        ds.Item item46 = null;
        tabela42.insere(item46);
        ds.Item item48 = null;
        tabela42.insere(item48);
        ds.Item[] itemArray50 = new ds.Item[] {};
        tabela42.registros = itemArray50;
        tabela38.registros = itemArray50;
        tabela31.registros = itemArray50;
        tabela0.registros = itemArray50;
        ds.Item item55 = null;
        int int56 = tabela0.binaria(item55);
        tabela0.n = 32;
        ds.Item[] itemArray59 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item item62 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = (byte) 10;
        tabela0.n = 0;
        ds.Item item37 = null;
        int int38 = tabela0.binaria(item37);
        ds.Tabela tabela39 = new ds.Tabela();
        int int40 = tabela39.n;
        int int41 = tabela39.n;
        ds.Item[] itemArray42 = tabela39.registros;
        ds.Item[] itemArray43 = tabela39.registros;
        ds.Item item44 = null;
        tabela39.insere(item44);
        ds.Item item46 = null;
        tabela39.insere(item46);
        tabela39.n = (short) 0;
        tabela39.n = 32;
        int int52 = tabela39.n;
        int int53 = tabela39.n;
        tabela39.n = (byte) 10;
        ds.Item[] itemArray56 = tabela39.registros;
        tabela0.registros = itemArray56;
        java.lang.Class<?> wildcardClass58 = itemArray56.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item item17 = null;
        tabela12.insere(item17);
        ds.Item item19 = null;
        tabela12.insere(item19);
        ds.Item[] itemArray21 = tabela12.registros;
        tabela0.registros = itemArray21;
        tabela0.n = (short) 0;
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (byte) 10;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item item11 = null;
        tabela7.insere(item11);
        ds.Item item13 = null;
        tabela7.insere(item13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela7.registros = itemArray15;
        int int17 = tabela7.n;
        ds.Item[] itemArray18 = tabela7.registros;
        ds.Item[] itemArray19 = tabela7.registros;
        ds.Item[] itemArray20 = tabela7.registros;
        tabela0.registros = itemArray20;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        tabela22.n = (short) -1;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        ds.Item item30 = null;
        tabela26.insere(item30);
        ds.Item item32 = null;
        tabela26.insere(item32);
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela26.registros = itemArray34;
        tabela22.registros = itemArray34;
        int int37 = tabela22.n;
        ds.Item[] itemArray38 = tabela22.registros;
        tabela0.registros = itemArray38;
        ds.Item[] itemArray40 = tabela0.registros;
        tabela0.n = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        int int6 = tabela5.n;
        int int7 = tabela5.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item[] itemArray10 = tabela8.registros;
        ds.Item item11 = null;
        int int12 = tabela8.binaria(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        tabela5.registros = itemArray15;
        tabela0.registros = itemArray15;
        tabela0.n = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        ds.Item[] itemArray2 = tabela1.registros;
        ds.Item[] itemArray3 = tabela1.registros;
        ds.Item item4 = null;
        int int5 = tabela1.binaria(item4);
        ds.Item item6 = null;
        tabela1.insere(item6);
        ds.Item[] itemArray8 = tabela1.registros;
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 32;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = (short) 1;
        ds.Item item9 = null;
        tabela6.insere(item9);
        ds.Item item11 = null;
        tabela6.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        int int15 = tabela13.n;
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = (byte) 0;
        ds.Item[] itemArray19 = tabela13.registros;
        tabela6.registros = itemArray19;
        ds.Item[] itemArray21 = tabela6.registros;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray23 = tabela0.registros;
        ds.Item[] itemArray24 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        ds.Item item12 = null;
        tabela0.insere(item12);
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item item14 = null;
        tabela8.insere(item14);
        ds.Item item16 = null;
        tabela8.insere(item16);
        tabela8.n = 0;
        ds.Item[] itemArray20 = tabela8.registros;
        tabela0.registros = itemArray20;
        int int22 = tabela0.n;
        java.lang.Class<?> wildcardClass23 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 'a';
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 'a';
        ds.Item[] itemArray9 = tabela0.registros;
        java.lang.Class<?> wildcardClass10 = itemArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = 100;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        tabela3.insere(item4);
        ds.Item[] itemArray6 = tabela3.registros;
        ds.Item[] itemArray7 = tabela3.registros;
        tabela0.registros = itemArray7;
        tabela0.n = (-1);
        tabela0.n = 3;
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (byte) 10;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item item11 = null;
        tabela7.insere(item11);
        ds.Item item13 = null;
        tabela7.insere(item13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela7.registros = itemArray15;
        int int17 = tabela7.n;
        ds.Item[] itemArray18 = tabela7.registros;
        ds.Item[] itemArray19 = tabela7.registros;
        ds.Item[] itemArray20 = tabela7.registros;
        tabela0.registros = itemArray20;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        tabela22.n = (short) -1;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        ds.Item item30 = null;
        tabela26.insere(item30);
        ds.Item item32 = null;
        tabela26.insere(item32);
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela26.registros = itemArray34;
        tabela22.registros = itemArray34;
        int int37 = tabela22.n;
        ds.Item[] itemArray38 = tabela22.registros;
        tabela0.registros = itemArray38;
        ds.Item[] itemArray40 = tabela0.registros;
        ds.Item item41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = tabela0.binaria(item41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (byte) 100;
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        int int9 = tabela7.n;
        ds.Tabela tabela10 = new ds.Tabela();
        int int11 = tabela10.n;
        int int12 = tabela10.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item[] itemArray17 = tabela13.registros;
        tabela10.registros = itemArray17;
        tabela7.registros = itemArray17;
        tabela0.registros = itemArray17;
        int int21 = tabela0.n;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        tabela0.n = 100;
        int int7 = tabela0.n;
        tabela0.n = (byte) 100;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        tabela0.n = ' ';
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        ds.Item[] itemArray17 = tabela14.registros;
        ds.Item[] itemArray18 = tabela14.registros;
        tabela14.n = (short) 100;
        ds.Item[] itemArray21 = tabela14.registros;
        tabela0.registros = itemArray21;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela4.registros = itemArray12;
        tabela0.registros = itemArray12;
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.binaria(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = (short) -1;
        int int35 = tabela0.n;
        ds.Item item36 = null;
        tabela0.insere(item36);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item[] itemArray17 = tabela13.registros;
        ds.Item item18 = null;
        tabela13.insere(item18);
        ds.Item item20 = null;
        tabela13.insere(item20);
        ds.Item[] itemArray22 = tabela13.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        ds.Item item27 = null;
        tabela23.insere(item27);
        ds.Item item29 = null;
        tabela23.insere(item29);
        tabela23.n = 2;
        ds.Item[] itemArray33 = tabela23.registros;
        tabela13.registros = itemArray33;
        tabela0.registros = itemArray33;
        ds.Item item36 = null;
        tabela0.insere(item36);
        ds.Item[] itemArray38 = tabela0.registros;
        java.lang.Class<?> wildcardClass39 = itemArray38.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        int int6 = tabela5.n;
        int int7 = tabela5.n;
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item[] itemArray9 = tabela5.registros;
        ds.Item item10 = null;
        tabela5.insere(item10);
        ds.Item item12 = null;
        tabela5.insere(item12);
        tabela5.n = (short) 0;
        tabela5.n = 32;
        int int18 = tabela5.n;
        int int19 = tabela5.n;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item item24 = null;
        tabela20.insere(item24);
        ds.Item item26 = null;
        tabela20.insere(item26);
        int int28 = tabela20.n;
        tabela20.n = (byte) 0;
        int int31 = tabela20.n;
        ds.Item item32 = null;
        int int33 = tabela20.binaria(item32);
        ds.Item item34 = null;
        int int35 = tabela20.binaria(item34);
        ds.Item[] itemArray36 = tabela20.registros;
        ds.Item[] itemArray37 = tabela20.registros;
        tabela20.n = '4';
        ds.Item[] itemArray40 = tabela20.registros;
        tabela5.registros = itemArray40;
        tabela0.registros = itemArray40;
        java.lang.Class<?> wildcardClass43 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item item14 = null;
        tabela10.insere(item14);
        ds.Item item16 = null;
        tabela10.insere(item16);
        ds.Item item18 = null;
        tabela10.insere(item18);
        tabela10.n = 0;
        ds.Item[] itemArray22 = tabela10.registros;
        tabela0.registros = itemArray22;
        tabela0.n = (byte) 1;
        tabela0.n = 100;
        tabela0.n = 3;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item item9 = null;
        tabela5.insere(item9);
        ds.Item item11 = null;
        tabela5.insere(item11);
        ds.Item item13 = null;
        tabela5.insere(item13);
        int int15 = tabela5.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        tabela5.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        tabela22.insere(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        ds.Item item26 = null;
        tabela22.insere(item26);
        ds.Item item28 = null;
        tabela22.insere(item28);
        ds.Item item30 = null;
        tabela22.insere(item30);
        tabela22.n = 0;
        ds.Item[] itemArray34 = tabela22.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        int int36 = tabela35.n;
        int int37 = tabela35.n;
        ds.Tabela tabela38 = new ds.Tabela();
        int int39 = tabela38.n;
        int int40 = tabela38.n;
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item item42 = null;
        tabela41.insere(item42);
        ds.Item[] itemArray44 = tabela41.registros;
        ds.Item[] itemArray45 = tabela41.registros;
        tabela38.registros = itemArray45;
        tabela35.registros = itemArray45;
        tabela22.registros = itemArray45;
        tabela22.n = (byte) -1;
        ds.Item item51 = null;
        tabela22.insere(item51);
        ds.Tabela tabela53 = new ds.Tabela();
        ds.Item item54 = null;
        tabela53.insere(item54);
        ds.Item[] itemArray56 = tabela53.registros;
        ds.Item[] itemArray57 = tabela53.registros;
        tabela53.n = 100;
        ds.Tabela tabela60 = new ds.Tabela();
        ds.Item[] itemArray61 = tabela60.registros;
        tabela60.n = (short) -1;
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item item65 = null;
        tabela64.insere(item65);
        ds.Item[] itemArray67 = tabela64.registros;
        ds.Item item68 = null;
        tabela64.insere(item68);
        ds.Item item70 = null;
        tabela64.insere(item70);
        ds.Item[] itemArray72 = new ds.Item[] {};
        tabela64.registros = itemArray72;
        tabela60.registros = itemArray72;
        tabela53.registros = itemArray72;
        tabela22.registros = itemArray72;
        tabela0.registros = itemArray72;
        tabela0.n = (byte) -1;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = (short) -1;
        ds.Item item12 = null;
        tabela0.insere(item12);
        java.lang.Class<?> wildcardClass14 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (short) 0;
        tabela0.n = 32;
        int int13 = tabela0.n;
        int int14 = tabela0.n;
        tabela0.n = (byte) 10;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = (short) -1;
        int int9 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        int int10 = tabela0.n;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        tabela0.insere(item17);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.binaria(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (short) 100;
        tabela0.n = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = (short) -1;
        ds.Item item35 = null;
        tabela0.insere(item35);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        ds.Item item14 = null;
        tabela0.insere(item14);
        tabela0.n = 32;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item[] itemArray14 = tabela0.registros;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = 100;
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        int int8 = tabela6.n;
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        tabela0.n = (byte) 1;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        ds.Item[] itemArray17 = tabela14.registros;
        ds.Item item18 = null;
        tabela14.insere(item18);
        ds.Item item20 = null;
        tabela14.insere(item20);
        ds.Item item22 = null;
        tabela14.insere(item22);
        tabela14.n = 0;
        ds.Item[] itemArray26 = tabela14.registros;
        ds.Tabela tabela27 = new ds.Tabela();
        int int28 = tabela27.n;
        int int29 = tabela27.n;
        ds.Tabela tabela30 = new ds.Tabela();
        int int31 = tabela30.n;
        int int32 = tabela30.n;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        ds.Item[] itemArray37 = tabela33.registros;
        tabela30.registros = itemArray37;
        tabela27.registros = itemArray37;
        tabela14.registros = itemArray37;
        tabela14.n = (byte) -1;
        ds.Item item43 = null;
        tabela14.insere(item43);
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item item46 = null;
        tabela45.insere(item46);
        ds.Item[] itemArray48 = tabela45.registros;
        ds.Item[] itemArray49 = tabela45.registros;
        tabela45.n = 100;
        ds.Tabela tabela52 = new ds.Tabela();
        ds.Item[] itemArray53 = tabela52.registros;
        tabela52.n = (short) -1;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item item57 = null;
        tabela56.insere(item57);
        ds.Item[] itemArray59 = tabela56.registros;
        ds.Item item60 = null;
        tabela56.insere(item60);
        ds.Item item62 = null;
        tabela56.insere(item62);
        ds.Item[] itemArray64 = new ds.Item[] {};
        tabela56.registros = itemArray64;
        tabela52.registros = itemArray64;
        tabela45.registros = itemArray64;
        tabela14.registros = itemArray64;
        ds.Item[] itemArray69 = tabela14.registros;
        tabela0.registros = itemArray69;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela4.registros = itemArray12;
        tabela0.registros = itemArray12;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela15.n = (short) 10;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item[] itemArray20 = tabela19.registros;
        ds.Item[] itemArray21 = tabela19.registros;
        ds.Item item22 = null;
        int int23 = tabela19.binaria(item22);
        ds.Item item24 = null;
        tabela19.insere(item24);
        ds.Item[] itemArray26 = tabela19.registros;
        tabela15.registros = itemArray26;
        tabela0.registros = itemArray26;
        ds.Item item29 = null;
        tabela0.insere(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item[] itemArray32 = tabela31.registros;
        tabela31.n = (short) -1;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        tabela35.insere(item36);
        ds.Item[] itemArray38 = tabela35.registros;
        ds.Item item39 = null;
        tabela35.insere(item39);
        ds.Item item41 = null;
        tabela35.insere(item41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        tabela35.registros = itemArray43;
        tabela31.registros = itemArray43;
        int int46 = tabela31.n;
        ds.Item[] itemArray47 = tabela31.registros;
        tabela0.registros = itemArray47;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item item12 = null;
        tabela4.insere(item12);
        int int14 = tabela4.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela4.registros = itemArray18;
        tabela0.registros = itemArray18;
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        int int23 = tabela21.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item[] itemArray26 = tabela24.registros;
        ds.Item item27 = null;
        int int28 = tabela24.binaria(item27);
        ds.Item item29 = null;
        tabela24.insere(item29);
        ds.Item[] itemArray31 = tabela24.registros;
        tabela21.registros = itemArray31;
        tabela0.registros = itemArray31;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item[] itemArray36 = tabela35.registros;
        ds.Item[] itemArray37 = tabela35.registros;
        ds.Item item38 = null;
        int int39 = tabela35.binaria(item38);
        ds.Item item40 = null;
        tabela35.insere(item40);
        ds.Item[] itemArray42 = tabela35.registros;
        tabela34.registros = itemArray42;
        tabela0.registros = itemArray42;
        tabela0.n = (-1);
        int int47 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = itemArray8.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = 0;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item[] itemArray13 = tabela0.registros;
        int int14 = tabela0.n;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item item17 = null;
        tabela0.insere(item17);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        int int10 = tabela9.n;
        int int11 = tabela9.n;
        ds.Item[] itemArray12 = tabela9.registros;
        tabela9.n = (byte) 0;
        ds.Item[] itemArray15 = tabela9.registros;
        ds.Item[] itemArray16 = tabela9.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        tabela0.n = 0;
        tabela0.n = (short) 0;
        int int23 = tabela0.n;
        java.lang.Class<?> wildcardClass24 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        int int5 = tabela4.n;
        ds.Item item6 = null;
        tabela4.insere(item6);
        tabela4.n = 32;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item[] itemArray14 = tabela10.registros;
        ds.Item item15 = null;
        tabela10.insere(item15);
        ds.Item item17 = null;
        tabela10.insere(item17);
        ds.Item[] itemArray19 = tabela10.registros;
        tabela4.registros = itemArray19;
        tabela0.registros = itemArray19;
        tabela0.n = '#';
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        int int5 = tabela0.n;
        tabela0.n = 0;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item[] itemArray9 = null;
        tabela0.registros = itemArray9;
        tabela0.n = 1;
        int int13 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        int int9 = tabela8.n;
        int int10 = tabela8.n;
        tabela8.n = (byte) 1;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Item[] itemArray14 = tabela8.registros;
        tabela0.registros = itemArray14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        tabela8.n = (short) -1;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item item16 = null;
        tabela12.insere(item16);
        ds.Item item18 = null;
        tabela12.insere(item18);
        ds.Item[] itemArray20 = new ds.Item[] {};
        tabela12.registros = itemArray20;
        tabela8.registros = itemArray20;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        tabela23.n = (short) 10;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item[] itemArray28 = tabela27.registros;
        ds.Item[] itemArray29 = tabela27.registros;
        ds.Item item30 = null;
        int int31 = tabela27.binaria(item30);
        ds.Item item32 = null;
        tabela27.insere(item32);
        ds.Item[] itemArray34 = tabela27.registros;
        tabela23.registros = itemArray34;
        tabela8.registros = itemArray34;
        tabela0.registros = itemArray34;
        java.lang.Class<?> wildcardClass38 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = (short) -1;
        tabela0.n = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 100;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = 0;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        int int15 = tabela13.n;
        ds.Tabela tabela16 = new ds.Tabela();
        int int17 = tabela16.n;
        int int18 = tabela16.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item[] itemArray23 = tabela19.registros;
        tabela16.registros = itemArray23;
        tabela13.registros = itemArray23;
        tabela0.registros = itemArray23;
        tabela0.n = (short) 0;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = (short) 10;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Item item17 = null;
        tabela11.insere(item17);
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela11.registros = itemArray19;
        ds.Item[] itemArray21 = tabela11.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        int int23 = tabela22.n;
        int int24 = tabela22.n;
        ds.Item[] itemArray25 = tabela22.registros;
        ds.Item[] itemArray26 = tabela22.registros;
        ds.Item item27 = null;
        tabela22.insere(item27);
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item[] itemArray30 = tabela29.registros;
        tabela29.n = (short) -1;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        ds.Item item37 = null;
        tabela33.insere(item37);
        ds.Item item39 = null;
        tabela33.insere(item39);
        ds.Item[] itemArray41 = new ds.Item[] {};
        tabela33.registros = itemArray41;
        tabela29.registros = itemArray41;
        tabela22.registros = itemArray41;
        tabela11.registros = itemArray41;
        int int46 = tabela11.n;
        ds.Tabela tabela47 = new ds.Tabela();
        int int48 = tabela47.n;
        int int49 = tabela47.n;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item item51 = null;
        tabela50.insere(item51);
        ds.Item[] itemArray53 = tabela50.registros;
        ds.Item[] itemArray54 = tabela50.registros;
        tabela47.registros = itemArray54;
        tabela11.registros = itemArray54;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        tabela57.insere(item58);
        ds.Item[] itemArray60 = tabela57.registros;
        ds.Item[] itemArray61 = tabela57.registros;
        ds.Item[] itemArray62 = tabela57.registros;
        int int63 = tabela57.n;
        ds.Item item64 = null;
        tabela57.insere(item64);
        ds.Tabela tabela66 = new ds.Tabela();
        ds.Item[] itemArray67 = tabela66.registros;
        tabela66.n = (short) 10;
        int int70 = tabela66.n;
        ds.Tabela tabela71 = new ds.Tabela();
        ds.Item[] itemArray72 = tabela71.registros;
        tabela66.registros = itemArray72;
        ds.Item[] itemArray74 = tabela66.registros;
        tabela57.registros = itemArray74;
        tabela11.registros = itemArray74;
        tabela0.registros = itemArray74;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item item8 = null;
        tabela4.insere(item8);
        ds.Item item10 = null;
        tabela4.insere(item10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela4.registros = itemArray12;
        ds.Item[] itemArray14 = tabela4.registros;
        tabela0.registros = itemArray14;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = 100;
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        int int8 = tabela6.n;
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        tabela0.n = (byte) 1;
        tabela0.n = 2;
        tabela0.n = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        int int10 = tabela9.n;
        ds.Item[] itemArray11 = tabela9.registros;
        tabela0.registros = itemArray11;
        ds.Item item13 = null;
        tabela0.insere(item13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 10;
        int int4 = tabela0.n;
        tabela0.n = 0;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item[] itemArray11 = tabela7.registros;
        tabela7.n = 100;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        int int23 = tabela15.n;
        ds.Item[] itemArray24 = tabela15.registros;
        ds.Item item25 = null;
        tabela15.insere(item25);
        ds.Item[] itemArray27 = tabela15.registros;
        tabela7.registros = itemArray27;
        ds.Tabela tabela29 = new ds.Tabela();
        int int30 = tabela29.n;
        ds.Item item31 = null;
        tabela29.insere(item31);
        ds.Tabela tabela33 = new ds.Tabela();
        int int34 = tabela33.n;
        int int35 = tabela33.n;
        ds.Item[] itemArray36 = tabela33.registros;
        ds.Item[] itemArray37 = tabela33.registros;
        ds.Tabela tabela38 = new ds.Tabela();
        int int39 = tabela38.n;
        int int40 = tabela38.n;
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item[] itemArray42 = tabela41.registros;
        ds.Item[] itemArray43 = tabela41.registros;
        ds.Item item44 = null;
        int int45 = tabela41.binaria(item44);
        ds.Item item46 = null;
        tabela41.insere(item46);
        ds.Item[] itemArray48 = tabela41.registros;
        tabela38.registros = itemArray48;
        tabela33.registros = itemArray48;
        tabela29.registros = itemArray48;
        tabela7.registros = itemArray48;
        tabela0.registros = itemArray48;
        java.lang.Class<?> wildcardClass54 = itemArray48.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item[] itemArray34 = tabela33.registros;
        int int35 = tabela33.n;
        ds.Item[] itemArray36 = tabela33.registros;
        tabela0.registros = itemArray36;
        int int38 = tabela0.n;
        ds.Item item39 = null;
        tabela0.insere(item39);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        tabela0.n = 32;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 1;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        int int16 = tabela15.n;
        int int17 = tabela15.n;
        ds.Item[] itemArray18 = tabela15.registros;
        tabela15.n = (byte) 0;
        ds.Item[] itemArray21 = tabela15.registros;
        tabela8.registros = itemArray21;
        ds.Item[] itemArray23 = tabela8.registros;
        tabela0.registros = itemArray23;
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
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
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        int int12 = tabela11.n;
        int int13 = tabela11.n;
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item[] itemArray15 = tabela11.registros;
        ds.Item item16 = null;
        tabela11.insere(item16);
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela18.n = (short) -1;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        tabela22.insere(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        ds.Item item26 = null;
        tabela22.insere(item26);
        ds.Item item28 = null;
        tabela22.insere(item28);
        ds.Item[] itemArray30 = new ds.Item[] {};
        tabela22.registros = itemArray30;
        tabela18.registros = itemArray30;
        tabela11.registros = itemArray30;
        tabela0.registros = itemArray30;
        int int35 = tabela0.n;
        ds.Tabela tabela36 = new ds.Tabela();
        int int37 = tabela36.n;
        int int38 = tabela36.n;
        tabela36.n = (byte) 1;
        ds.Item[] itemArray41 = tabela36.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        int int43 = tabela42.n;
        ds.Item item44 = null;
        tabela42.insere(item44);
        tabela42.n = ' ';
        ds.Item[] itemArray48 = tabela42.registros;
        tabela36.registros = itemArray48;
        tabela0.registros = itemArray48;
        ds.Tabela tabela51 = new ds.Tabela();
        ds.Item item52 = null;
        tabela51.insere(item52);
        tabela51.n = (short) 10;
        int int56 = tabela51.n;
        int int57 = tabela51.n;
        ds.Item[] itemArray58 = tabela51.registros;
        tabela0.registros = itemArray58;
        ds.Item item60 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int61 = tabela0.pesquisa(item60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        int int6 = tabela5.n;
        int int7 = tabela5.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item[] itemArray10 = tabela8.registros;
        ds.Item item11 = null;
        int int12 = tabela8.binaria(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        tabela5.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item item18 = null;
        tabela0.insere(item18);
        tabela0.n = 3;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = (short) 1;
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        int int16 = tabela15.n;
        int int17 = tabela15.n;
        ds.Item[] itemArray18 = tabela15.registros;
        tabela15.n = (byte) 0;
        ds.Item[] itemArray21 = tabela15.registros;
        tabela8.registros = itemArray21;
        ds.Item[] itemArray23 = tabela8.registros;
        tabela0.registros = itemArray23;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.binaria(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        tabela0.n = '#';
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item item7 = null;
        tabela4.insere(item7);
        ds.Item item9 = null;
        tabela4.insere(item9);
        tabela4.n = 3;
        ds.Item item13 = null;
        tabela4.insere(item13);
        ds.Item[] itemArray15 = tabela4.registros;
        tabela0.registros = itemArray15;
        java.lang.Class<?> wildcardClass17 = itemArray15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item item14 = null;
        tabela8.insere(item14);
        ds.Item item16 = null;
        tabela8.insere(item16);
        tabela8.n = 0;
        ds.Item[] itemArray20 = tabela8.registros;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray22 = null;
        tabela0.registros = itemArray22;
        int int24 = tabela0.n;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray4 = null;
        tabela0.registros = itemArray4;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item[] itemArray8 = tabela6.registros;
        int int9 = tabela6.n;
        ds.Tabela tabela10 = new ds.Tabela();
        int int11 = tabela10.n;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 32;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Item item21 = null;
        tabela16.insere(item21);
        ds.Item item23 = null;
        tabela16.insere(item23);
        ds.Item[] itemArray25 = tabela16.registros;
        tabela10.registros = itemArray25;
        tabela6.registros = itemArray25;
        tabela0.registros = itemArray25;
        tabela0.n = 4;
        ds.Item[] itemArray31 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item[] itemArray8 = tabela6.registros;
        tabela0.registros = itemArray8;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        int int17 = tabela16.n;
        int int18 = tabela16.n;
        int int19 = tabela16.n;
        ds.Item item20 = null;
        int int21 = tabela16.binaria(item20);
        ds.Item item22 = null;
        int int23 = tabela16.binaria(item22);
        ds.Item item24 = null;
        tabela16.insere(item24);
        tabela16.n = (short) -1;
        ds.Item[] itemArray28 = tabela16.registros;
        tabela0.registros = itemArray28;
        tabela0.n = (byte) 10;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        tabela32.insere(item33);
        ds.Item[] itemArray35 = tabela32.registros;
        ds.Item item36 = null;
        tabela32.insere(item36);
        ds.Item item38 = null;
        tabela32.insere(item38);
        ds.Item[] itemArray40 = new ds.Item[] {};
        tabela32.registros = itemArray40;
        ds.Item[] itemArray42 = tabela32.registros;
        tabela32.n = (byte) 10;
        ds.Item[] itemArray45 = tabela32.registros;
        tabela0.registros = itemArray45;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item item10 = null;
        tabela6.insere(item10);
        ds.Item item12 = null;
        tabela6.insere(item12);
        ds.Item item14 = null;
        tabela6.insere(item14);
        int int16 = tabela6.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        tabela6.registros = itemArray20;
        ds.Item[] itemArray22 = tabela6.registros;
        tabela0.registros = itemArray22;
        ds.Item item24 = null;
        tabela0.insere(item24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = 3;
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        int int9 = tabela7.n;
        ds.Item item10 = null;
        tabela7.insere(item10);
        ds.Item item12 = null;
        tabela7.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        int int15 = tabela14.n;
        ds.Item item16 = null;
        tabela14.insere(item16);
        tabela14.n = 32;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        ds.Item item25 = null;
        tabela20.insere(item25);
        ds.Item item27 = null;
        tabela20.insere(item27);
        ds.Item[] itemArray29 = tabela20.registros;
        tabela14.registros = itemArray29;
        tabela7.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item[] itemArray33 = tabela0.registros;
        int int34 = tabela0.n;
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        int int9 = tabela7.n;
        ds.Item[] itemArray10 = tabela7.registros;
        tabela7.n = (byte) 0;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = (short) 1;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        tabela16.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        int int25 = tabela23.n;
        ds.Item[] itemArray26 = tabela23.registros;
        tabela23.n = (byte) 0;
        ds.Item[] itemArray29 = tabela23.registros;
        tabela16.registros = itemArray29;
        tabela0.registros = itemArray29;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        int int17 = tabela16.n;
        int int18 = tabela16.n;
        int int19 = tabela16.n;
        ds.Item item20 = null;
        int int21 = tabela16.binaria(item20);
        ds.Item item22 = null;
        int int23 = tabela16.binaria(item22);
        ds.Item item24 = null;
        tabela16.insere(item24);
        tabela16.n = (short) -1;
        ds.Item[] itemArray28 = tabela16.registros;
        tabela0.registros = itemArray28;
        ds.Item item30 = null;
        int int31 = tabela0.binaria(item30);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        ds.Item[] itemArray16 = tabela8.registros;
        tabela0.registros = itemArray16;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        tabela0.insere(item19);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        ds.Item[] itemArray2 = tabela1.registros;
        ds.Item[] itemArray3 = tabela1.registros;
        ds.Item item4 = null;
        int int5 = tabela1.binaria(item4);
        ds.Item item6 = null;
        tabela1.insere(item6);
        ds.Item[] itemArray8 = tabela1.registros;
        tabela0.registros = itemArray8;
        tabela0.n = 0;
        int int12 = tabela0.n;
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Item item16 = null;
        tabela0.insere(item16);
        ds.Item item18 = null;
        tabela0.insere(item18);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        ds.Item[] itemArray2 = tabela1.registros;
        ds.Item[] itemArray3 = tabela1.registros;
        ds.Item item4 = null;
        int int5 = tabela1.binaria(item4);
        ds.Item item6 = null;
        tabela1.insere(item6);
        ds.Item[] itemArray8 = tabela1.registros;
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        ds.Item[] itemArray17 = tabela14.registros;
        ds.Item item18 = null;
        tabela14.insere(item18);
        ds.Item item20 = null;
        tabela14.insere(item20);
        ds.Item item22 = null;
        tabela14.insere(item22);
        ds.Item[] itemArray24 = tabela14.registros;
        tabela0.registros = itemArray24;
        ds.Item item26 = null;
        tabela0.insere(item26);
        tabela0.n = '4';
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item item14 = null;
        tabela10.insere(item14);
        ds.Item item16 = null;
        tabela10.insere(item16);
        tabela10.n = 2;
        ds.Item[] itemArray20 = tabela10.registros;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray22 = tabela0.registros;
        int int23 = tabela0.n;
        ds.Item item24 = null;
        tabela0.insere(item24);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
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
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item[] itemArray6 = tabela4.registros;
        ds.Item item7 = null;
        int int8 = tabela4.binaria(item7);
        ds.Item item9 = null;
        tabela4.insere(item9);
        ds.Item[] itemArray11 = tabela4.registros;
        tabela0.registros = itemArray11;
        tabela0.n = (byte) 10;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 10;
        int int4 = tabela0.n;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        tabela0.registros = itemArray6;
        tabela0.n = (short) 100;
        ds.Tabela tabela10 = new ds.Tabela();
        int int11 = tabela10.n;
        int int12 = tabela10.n;
        tabela10.n = (byte) 1;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        tabela15.n = 0;
        ds.Item[] itemArray27 = tabela15.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        int int29 = tabela28.n;
        int int30 = tabela28.n;
        ds.Tabela tabela31 = new ds.Tabela();
        int int32 = tabela31.n;
        int int33 = tabela31.n;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        ds.Item[] itemArray38 = tabela34.registros;
        tabela31.registros = itemArray38;
        tabela28.registros = itemArray38;
        tabela15.registros = itemArray38;
        tabela10.registros = itemArray38;
        ds.Item[] itemArray43 = tabela10.registros;
        tabela0.registros = itemArray43;
        java.lang.Class<?> wildcardClass45 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        tabela0.n = 32;
        tabela0.n = 3;
        ds.Item item18 = null;
        tabela0.insere(item18);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = (byte) 1;
        ds.Item[] itemArray5 = tabela0.registros;
        java.lang.Class<?> wildcardClass6 = itemArray5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item[] itemArray12 = tabela10.registros;
        ds.Item item13 = null;
        int int14 = tabela10.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Item item23 = null;
        tabela15.insere(item23);
        int int25 = tabela15.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela15.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = (byte) 10;
        tabela0.n = 0;
        ds.Item item37 = null;
        int int38 = tabela0.binaria(item37);
        int int39 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 3;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        ds.Item item17 = null;
        tabela11.insere(item17);
        int int19 = tabela11.n;
        ds.Item[] itemArray20 = tabela11.registros;
        tabela0.registros = itemArray20;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        int int6 = tabela5.n;
        int int7 = tabela5.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item[] itemArray10 = tabela8.registros;
        ds.Item item11 = null;
        int int12 = tabela8.binaria(item11);
        ds.Item item13 = null;
        tabela8.insere(item13);
        ds.Item[] itemArray15 = tabela8.registros;
        tabela5.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item item18 = null;
        tabela0.insere(item18);
        int int20 = tabela0.n;
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        int int23 = tabela21.n;
        tabela21.n = 'a';
        ds.Item[] itemArray26 = tabela21.registros;
        tabela0.registros = itemArray26;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        int int17 = tabela16.n;
        int int18 = tabela16.n;
        int int19 = tabela16.n;
        ds.Item item20 = null;
        int int21 = tabela16.binaria(item20);
        ds.Item item22 = null;
        int int23 = tabela16.binaria(item22);
        ds.Item item24 = null;
        tabela16.insere(item24);
        tabela16.n = (short) -1;
        ds.Item[] itemArray28 = tabela16.registros;
        tabela0.registros = itemArray28;
        tabela0.n = (byte) 10;
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = tabela0.binaria(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        tabela0.n = 100;
        int int7 = tabela0.n;
        tabela0.n = (byte) 10;
        int int10 = tabela0.n;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        ds.Item[] itemArray5 = tabela3.registros;
        ds.Item item6 = null;
        tabela3.insere(item6);
        tabela3.n = 3;
        ds.Tabela tabela10 = new ds.Tabela();
        int int11 = tabela10.n;
        int int12 = tabela10.n;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item item15 = null;
        tabela10.insere(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        int int18 = tabela17.n;
        ds.Item item19 = null;
        tabela17.insere(item19);
        tabela17.n = 32;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item item28 = null;
        tabela23.insere(item28);
        ds.Item item30 = null;
        tabela23.insere(item30);
        ds.Item[] itemArray32 = tabela23.registros;
        tabela17.registros = itemArray32;
        tabela10.registros = itemArray32;
        tabela3.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray37 = tabela0.registros;
        ds.Item item38 = null;
        tabela0.insere(item38);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = 3;
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        int int9 = tabela7.n;
        ds.Item item10 = null;
        tabela7.insere(item10);
        ds.Item item12 = null;
        tabela7.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        int int15 = tabela14.n;
        ds.Item item16 = null;
        tabela14.insere(item16);
        tabela14.n = 32;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        ds.Item item25 = null;
        tabela20.insere(item25);
        ds.Item item27 = null;
        tabela20.insere(item27);
        ds.Item[] itemArray29 = tabela20.registros;
        tabela14.registros = itemArray29;
        tabela7.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item[] itemArray33 = tabela0.registros;
        ds.Item item34 = null;
        tabela0.insere(item34);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 10;
        tabela0.n = (short) 100;
        ds.Tabela tabela9 = new ds.Tabela();
        int int10 = tabela9.n;
        int int11 = tabela9.n;
        ds.Item[] itemArray12 = tabela9.registros;
        tabela9.n = (byte) 0;
        ds.Item[] itemArray15 = tabela9.registros;
        ds.Item item16 = null;
        tabela9.insere(item16);
        ds.Tabela tabela18 = new ds.Tabela();
        int int19 = tabela18.n;
        int int20 = tabela18.n;
        ds.Item[] itemArray21 = tabela18.registros;
        tabela18.n = (byte) 0;
        ds.Item[] itemArray24 = tabela18.registros;
        ds.Item[] itemArray25 = tabela18.registros;
        tabela9.registros = itemArray25;
        tabela0.registros = itemArray25;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 10;
        int int4 = tabela0.n;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        tabela0.registros = itemArray6;
        tabela0.n = (short) 100;
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray4 = null;
        tabela0.registros = itemArray4;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item[] itemArray8 = tabela6.registros;
        int int9 = tabela6.n;
        ds.Tabela tabela10 = new ds.Tabela();
        int int11 = tabela10.n;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 32;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Item item21 = null;
        tabela16.insere(item21);
        ds.Item item23 = null;
        tabela16.insere(item23);
        ds.Item[] itemArray25 = tabela16.registros;
        tabela10.registros = itemArray25;
        tabela6.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela29 = new ds.Tabela();
        int int30 = tabela29.n;
        int int31 = tabela29.n;
        tabela29.n = (byte) 1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        ds.Item item38 = null;
        tabela34.insere(item38);
        ds.Item item40 = null;
        tabela34.insere(item40);
        ds.Item item42 = null;
        tabela34.insere(item42);
        tabela34.n = 0;
        ds.Item[] itemArray46 = tabela34.registros;
        ds.Tabela tabela47 = new ds.Tabela();
        int int48 = tabela47.n;
        int int49 = tabela47.n;
        ds.Tabela tabela50 = new ds.Tabela();
        int int51 = tabela50.n;
        int int52 = tabela50.n;
        ds.Tabela tabela53 = new ds.Tabela();
        ds.Item item54 = null;
        tabela53.insere(item54);
        ds.Item[] itemArray56 = tabela53.registros;
        ds.Item[] itemArray57 = tabela53.registros;
        tabela50.registros = itemArray57;
        tabela47.registros = itemArray57;
        tabela34.registros = itemArray57;
        tabela29.registros = itemArray57;
        ds.Item[] itemArray62 = tabela29.registros;
        tabela0.registros = itemArray62;
        ds.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item64);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        int int12 = tabela11.n;
        int int13 = tabela11.n;
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item[] itemArray15 = tabela11.registros;
        ds.Item item16 = null;
        tabela11.insere(item16);
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela18.n = (short) -1;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        tabela22.insere(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        ds.Item item26 = null;
        tabela22.insere(item26);
        ds.Item item28 = null;
        tabela22.insere(item28);
        ds.Item[] itemArray30 = new ds.Item[] {};
        tabela22.registros = itemArray30;
        tabela18.registros = itemArray30;
        tabela11.registros = itemArray30;
        tabela0.registros = itemArray30;
        int int35 = tabela0.n;
        ds.Tabela tabela36 = new ds.Tabela();
        int int37 = tabela36.n;
        int int38 = tabela36.n;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        tabela39.insere(item40);
        ds.Item[] itemArray42 = tabela39.registros;
        ds.Item[] itemArray43 = tabela39.registros;
        tabela36.registros = itemArray43;
        tabela0.registros = itemArray43;
        tabela0.n = (short) 100;
        ds.Item[] itemArray48 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        tabela0.n = (byte) 1;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item item9 = null;
        tabela5.insere(item9);
        ds.Item item11 = null;
        tabela5.insere(item11);
        ds.Item item13 = null;
        tabela5.insere(item13);
        tabela5.n = 0;
        ds.Item[] itemArray17 = tabela5.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        int int19 = tabela18.n;
        int int20 = tabela18.n;
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        int int23 = tabela21.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        tabela24.insere(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item[] itemArray28 = tabela24.registros;
        tabela21.registros = itemArray28;
        tabela18.registros = itemArray28;
        tabela5.registros = itemArray28;
        tabela0.registros = itemArray28;
        int int33 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = (byte) 10;
        tabela0.n = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        ds.Item[] itemArray2 = tabela1.registros;
        ds.Item[] itemArray3 = tabela1.registros;
        ds.Item item4 = null;
        int int5 = tabela1.binaria(item4);
        ds.Item item6 = null;
        tabela1.insere(item6);
        ds.Item[] itemArray8 = tabela1.registros;
        tabela0.registros = itemArray8;
        int int10 = tabela0.n;
        ds.Item[] itemArray11 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        ds.Item[] itemArray2 = tabela1.registros;
        ds.Item[] itemArray3 = tabela1.registros;
        ds.Item item4 = null;
        int int5 = tabela1.binaria(item4);
        ds.Item item6 = null;
        tabela1.insere(item6);
        ds.Item[] itemArray8 = tabela1.registros;
        tabela0.registros = itemArray8;
        tabela0.n = 0;
        int int12 = tabela0.n;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
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
        tabela0.n = (short) 100;
        int int7 = tabela0.n;
        tabela0.n = 32;
        tabela0.n = 'a';
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        int int14 = tabela12.n;
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = (byte) 0;
        ds.Item[] itemArray18 = tabela12.registros;
        tabela12.n = (short) 10;
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        int int23 = tabela21.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item[] itemArray26 = tabela24.registros;
        ds.Item item27 = null;
        int int28 = tabela24.binaria(item27);
        ds.Item item29 = null;
        tabela24.insere(item29);
        ds.Item[] itemArray31 = tabela24.registros;
        tabela21.registros = itemArray31;
        ds.Item[] itemArray33 = tabela21.registros;
        tabela12.registros = itemArray33;
        tabela0.registros = itemArray33;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Item[] itemArray37 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        int int11 = tabela10.n;
        int int12 = tabela10.n;
        ds.Item[] itemArray13 = tabela10.registros;
        tabela10.n = 100;
        int int16 = tabela10.n;
        tabela10.n = (byte) 100;
        int int19 = tabela10.n;
        ds.Item[] itemArray20 = tabela10.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        tabela21.insere(item25);
        ds.Item item27 = null;
        tabela21.insere(item27);
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela21.registros = itemArray29;
        ds.Item[] itemArray31 = tabela21.registros;
        ds.Tabela tabela32 = new ds.Tabela();
        int int33 = tabela32.n;
        int int34 = tabela32.n;
        ds.Item[] itemArray35 = tabela32.registros;
        ds.Item[] itemArray36 = tabela32.registros;
        ds.Item item37 = null;
        tabela32.insere(item37);
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item[] itemArray40 = tabela39.registros;
        tabela39.n = (short) -1;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        tabela43.insere(item44);
        ds.Item[] itemArray46 = tabela43.registros;
        ds.Item item47 = null;
        tabela43.insere(item47);
        ds.Item item49 = null;
        tabela43.insere(item49);
        ds.Item[] itemArray51 = new ds.Item[] {};
        tabela43.registros = itemArray51;
        tabela39.registros = itemArray51;
        tabela32.registros = itemArray51;
        tabela21.registros = itemArray51;
        int int56 = tabela21.n;
        ds.Tabela tabela57 = new ds.Tabela();
        int int58 = tabela57.n;
        int int59 = tabela57.n;
        ds.Tabela tabela60 = new ds.Tabela();
        ds.Item item61 = null;
        tabela60.insere(item61);
        ds.Item[] itemArray63 = tabela60.registros;
        ds.Item[] itemArray64 = tabela60.registros;
        tabela57.registros = itemArray64;
        tabela21.registros = itemArray64;
        tabela10.registros = itemArray64;
        tabela0.registros = itemArray64;
        ds.Item item69 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int70 = tabela0.binaria(item69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        tabela0.registros = itemArray8;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        ds.Item item14 = null;
        tabela10.insere(item14);
        ds.Item item16 = null;
        tabela10.insere(item16);
        ds.Item item18 = null;
        tabela10.insere(item18);
        tabela10.n = 0;
        ds.Item[] itemArray22 = tabela10.registros;
        tabela0.registros = itemArray22;
        tabela0.n = (byte) 1;
        ds.Item item26 = null;
        tabela0.insere(item26);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = 'a';
        tabela0.n = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        ds.Item[] itemArray5 = tabela3.registros;
        ds.Item item6 = null;
        int int7 = tabela3.binaria(item6);
        ds.Item item8 = null;
        tabela3.insere(item8);
        ds.Item[] itemArray10 = tabela3.registros;
        tabela0.registros = itemArray10;
        ds.Item[] itemArray12 = tabela0.registros;
        tabela0.n = (short) 100;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        tabela0.n = 100;
        int int7 = tabela0.n;
        tabela0.n = (byte) 100;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        tabela0.n = ' ';
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item[] itemArray17 = tabela0.registros;
        tabela0.n = '4';
        java.lang.Class<?> wildcardClass20 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        int int5 = tabela4.n;
        int int6 = tabela4.n;
        tabela4.n = 'a';
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        tabela9.insere(item13);
        ds.Item item15 = null;
        tabela9.insere(item15);
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela9.registros = itemArray17;
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Tabela tabela21 = new ds.Tabela();
        int int22 = tabela21.n;
        int int23 = tabela21.n;
        tabela21.n = (byte) 1;
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        tabela0.registros = itemArray27;
        ds.Item item29 = null;
        tabela0.insere(item29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        tabela9.insere(item13);
        ds.Item item15 = null;
        tabela9.insere(item15);
        int int17 = tabela9.n;
        tabela9.n = (byte) 0;
        int int20 = tabela9.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela9.registros = itemArray30;
        tabela0.registros = itemArray30;
        ds.Item item33 = null;
        tabela0.insere(item33);
        int int35 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }
}

