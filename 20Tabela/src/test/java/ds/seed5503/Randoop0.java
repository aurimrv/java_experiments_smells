package ds.seed5503;

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
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        java.lang.Class<?> wildcardClass6 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tabela0.binaria(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        java.lang.Class<?> wildcardClass5 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.binaria(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
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
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
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
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
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
        int int15 = tabela0.n;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.binaria(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = '4';
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = (byte) 100;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = ' ';
        int int8 = tabela0.n;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = tabela0.pesquisa(item1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
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
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
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
        java.lang.Class<?> wildcardClass12 = itemArray10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
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
        java.lang.Class<?> wildcardClass18 = itemArray15.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.binaria(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
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
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
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
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        java.lang.Class<?> wildcardClass4 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
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
        int int14 = tabela0.n;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.pesquisa(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
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
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
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
        java.lang.Class<?> wildcardClass10 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
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
        ds.Item item16 = null;
        tabela0.insere(item16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 1;
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tabela0.binaria(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
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
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
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
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = ' ';
        int int8 = tabela0.n;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
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
        java.lang.Class<?> wildcardClass15 = itemArray14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = (byte) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = '4';
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 1;
        java.lang.Class<?> wildcardClass14 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
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
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        int int8 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
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
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
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
        java.lang.Class<?> wildcardClass17 = itemArray16.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (short) 100;
        int int6 = tabela0.n;
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = tabela0.pesquisa(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
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
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
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
        ds.Item[] itemArray18 = tabela0.registros;
        java.lang.Class<?> wildcardClass19 = itemArray18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
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
        java.lang.Class<?> wildcardClass28 = itemArray26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = '#';
        int int18 = tabela12.n;
        int int19 = tabela12.n;
        ds.Item[] itemArray20 = tabela12.registros;
        tabela0.registros = itemArray20;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = '#';
        int int10 = tabela0.n;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        int int7 = tabela0.n;
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        int int19 = tabela13.n;
        tabela13.n = (byte) -1;
        ds.Item item22 = null;
        tabela13.insere(item22);
        ds.Item[] itemArray24 = tabela13.registros;
        tabela0.registros = itemArray24;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.pesquisa(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
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
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        java.lang.Class<?> wildcardClass4 = itemArray3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
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
        ds.Item item24 = null;
        tabela0.insere(item24);
        ds.Item item26 = null;
        tabela0.insere(item26);
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tabela0.binaria(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
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
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (short) 100;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela0.registros = itemArray24;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.pesquisa(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = '4';
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tabela0.pesquisa(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
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
        int int21 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tabela0.pesquisa(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        tabela0.n = (short) 0;
        int int10 = tabela0.n;
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
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
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        java.lang.Class<?> wildcardClass14 = itemArray13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        java.lang.Class<?> wildcardClass5 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
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
        int int14 = tabela0.n;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
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
        tabela0.n = 1;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.binaria(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela0.registros = itemArray24;
        java.lang.Class<?> wildcardClass26 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
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
        ds.Item[] itemArray12 = tabela0.registros;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.pesquisa(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        int int19 = tabela13.n;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela13.n = (byte) 1;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela13.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.binaria(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        int int10 = tabela0.n;
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = (byte) 100;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
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
        ds.Item item24 = null;
        tabela0.insere(item24);
        ds.Item[] itemArray26 = null;
        tabela0.registros = itemArray26;
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tabela0.pesquisa(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = (byte) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
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
        int int21 = tabela0.n;
        java.lang.Class<?> wildcardClass22 = tabela0.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
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
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
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
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
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
        ds.Item item11 = null;
        tabela7.insere(item11);
        tabela7.n = (-1);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item[] itemArray19 = tabela15.registros;
        tabela7.registros = itemArray19;
        ds.Item[] itemArray21 = tabela7.registros;
        ds.Item[] itemArray22 = tabela7.registros;
        tabela0.registros = itemArray22;
        tabela0.n = '4';
        java.lang.Class<?> wildcardClass26 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        int int19 = tabela13.n;
        tabela13.n = (byte) -1;
        ds.Item item22 = null;
        tabela13.insere(item22);
        ds.Item[] itemArray24 = tabela13.registros;
        tabela0.registros = itemArray24;
        tabela0.n = (byte) 1;
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tabela0.pesquisa(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
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
        java.lang.Class<?> wildcardClass12 = itemArray11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
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
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tabela0.binaria(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        tabela0.insere(item9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tabela0.pesquisa(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        tabela0.n = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        tabela0.registros = itemArray11;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        java.lang.Class<?> wildcardClass6 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = null;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(itemArray14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = ' ';
        tabela0.n = 'a';
        int int10 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item item13 = null;
        tabela0.insere(item13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
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
        tabela0.n = 10;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = tabela0.binaria(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        int int19 = tabela13.n;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela13.n = (byte) 1;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela13.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tabela0.binaria(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        int int12 = tabela0.n;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
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
        java.lang.Class<?> wildcardClass30 = tabela0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        tabela0.insere(item14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = tabela0.pesquisa(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
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
        ds.Item[] itemArray12 = tabela0.registros;
        int int13 = tabela0.n;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = ' ';
        tabela0.n = 'a';
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
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
        ds.Item item11 = null;
        tabela7.insere(item11);
        tabela7.n = (-1);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item[] itemArray19 = tabela15.registros;
        tabela7.registros = itemArray19;
        ds.Item[] itemArray21 = tabela7.registros;
        ds.Item[] itemArray22 = tabela7.registros;
        tabela0.registros = itemArray22;
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tabela0.binaria(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
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
        int int15 = tabela0.n;
        ds.Item item16 = null;
        tabela0.insere(item16);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.pesquisa(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
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
        tabela0.n = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Tabela tabela0 = new ds.Tabela();
        java.lang.Class<?> wildcardClass1 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        tabela0.n = (short) 0;
        int int10 = tabela0.n;
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (short) -1;
        int int11 = tabela0.n;
        ds.Item[] itemArray12 = tabela0.registros;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = '#';
        java.lang.Class<?> wildcardClass10 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        tabela9.n = '#';
        int int15 = tabela9.n;
        ds.Item[] itemArray16 = tabela9.registros;
        tabela9.n = '#';
        int int19 = tabela9.n;
        ds.Item[] itemArray20 = tabela9.registros;
        tabela0.registros = itemArray20;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.pesquisa(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = null;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
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
        java.lang.Class<?> wildcardClass20 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
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
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
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
        ds.Item[] itemArray33 = tabela14.registros;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        ds.Item[] itemArray38 = tabela34.registros;
        tabela14.registros = itemArray38;
        tabela0.registros = itemArray38;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        ds.Item[] itemArray50 = tabela47.registros;
        ds.Item item51 = null;
        int int52 = tabela47.binaria(item51);
        ds.Item item53 = null;
        int int54 = tabela47.binaria(item53);
        ds.Item[] itemArray55 = tabela47.registros;
        tabela0.registros = itemArray55;
        ds.Item item57 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int58 = tabela0.pesquisa(item57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
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
        tabela0.n = 1;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.binaria(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item item9 = null;
        tabela5.insere(item9);
        int int11 = tabela5.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item item16 = null;
        tabela12.insere(item16);
        tabela12.n = (-1);
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela12.registros = itemArray24;
        ds.Item[] itemArray26 = tabela12.registros;
        ds.Item[] itemArray27 = tabela12.registros;
        tabela5.registros = itemArray27;
        tabela0.registros = itemArray27;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        tabela8.n = '#';
        int int14 = tabela8.n;
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        java.lang.Class<?> wildcardClass17 = itemArray15.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
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
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela0.registros = itemArray24;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.pesquisa(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 1;
        int int3 = tabela0.n;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        int int14 = tabela9.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela15.n = '#';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        tabela15.registros = itemArray24;
        tabela9.registros = itemArray24;
        int int27 = tabela9.n;
        ds.Item[] itemArray28 = tabela9.registros;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        tabela29.insere(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        ds.Item[] itemArray33 = tabela29.registros;
        tabela9.registros = itemArray33;
        tabela0.registros = itemArray33;
        java.lang.Class<?> wildcardClass36 = itemArray33.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        int int14 = tabela9.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela15.n = '#';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        tabela15.registros = itemArray24;
        tabela9.registros = itemArray24;
        int int27 = tabela9.n;
        ds.Item[] itemArray28 = tabela9.registros;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        tabela29.insere(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        ds.Item[] itemArray33 = tabela29.registros;
        tabela9.registros = itemArray33;
        tabela0.registros = itemArray33;
        ds.Item[] itemArray36 = tabela0.registros;
        int int37 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 1;
        int int14 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
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
        tabela0.n = 1;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        int int19 = tabela13.n;
        tabela13.n = (byte) -1;
        ds.Item item22 = null;
        tabela13.insere(item22);
        ds.Item[] itemArray24 = tabela13.registros;
        tabela0.registros = itemArray24;
        int int26 = tabela0.n;
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
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
        int int22 = tabela0.binaria(item21);
        ds.Item[] itemArray23 = tabela0.registros;
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = '4';
        ds.Item[] itemArray8 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        tabela0.n = 1;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
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
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tabela0.pesquisa(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
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
        tabela0.n = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        java.lang.Class<?> wildcardClass24 = itemArray22.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        tabela0.n = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        tabela0.n = (-1);
        tabela0.n = (byte) 1;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        ds.Item[] itemArray50 = tabela47.registros;
        ds.Item item51 = null;
        int int52 = tabela47.binaria(item51);
        ds.Item item53 = null;
        int int54 = tabela47.binaria(item53);
        ds.Item[] itemArray55 = tabela47.registros;
        tabela0.registros = itemArray55;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Item[] itemArray60 = tabela57.registros;
        ds.Item item61 = null;
        tabela57.insere(item61);
        tabela57.n = (-1);
        ds.Tabela tabela65 = new ds.Tabela();
        ds.Item item66 = null;
        int int67 = tabela65.binaria(item66);
        ds.Item[] itemArray68 = tabela65.registros;
        ds.Item[] itemArray69 = tabela65.registros;
        tabela57.registros = itemArray69;
        tabela0.registros = itemArray69;
        java.lang.Class<?> wildcardClass72 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        int int24 = tabela20.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        tabela20.registros = itemArray28;
        tabela0.registros = itemArray28;
        tabela0.n = (byte) 100;
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = tabela0.binaria(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
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
        java.lang.Class<?> wildcardClass21 = itemArray20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
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
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item item21 = null;
        tabela0.insere(item21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
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
        ds.Item[] itemArray19 = tabela0.registros;
        java.lang.Class<?> wildcardClass20 = itemArray19.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item14 = null;
        tabela0.insere(item14);
        int int16 = tabela0.n;
        int int17 = tabela0.n;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
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
        tabela0.n = (short) 100;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.binaria(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 100;
        tabela0.n = ' ';
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item item9 = null;
        int int10 = tabela5.binaria(item9);
        ds.Item[] itemArray11 = tabela5.registros;
        ds.Item[] itemArray12 = tabela5.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        int int18 = tabela13.binaria(item17);
        ds.Item[] itemArray19 = tabela13.registros;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela5.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.pesquisa(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
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
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        int int26 = tabela22.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela22.registros = itemArray30;
        ds.Item[] itemArray32 = tabela22.registros;
        ds.Item item33 = null;
        int int34 = tabela22.binaria(item33);
        ds.Item[] itemArray35 = tabela22.registros;
        ds.Item item36 = null;
        int int37 = tabela22.binaria(item36);
        ds.Item[] itemArray38 = tabela22.registros;
        tabela0.registros = itemArray38;
        tabela0.n = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        int int19 = tabela13.n;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela13.n = (byte) 1;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela13.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int27 = tabela0.n;
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tabela0.binaria(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        tabela8.n = '#';
        int int14 = tabela8.n;
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.binaria(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        int int13 = tabela0.n;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
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
        ds.Item item19 = null;
        tabela0.insere(item19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        tabela0.insere(item17);
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = '#';
        int int10 = tabela0.n;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        tabela11.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        int int18 = tabela16.binaria(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        int int20 = tabela16.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        tabela16.registros = itemArray24;
        ds.Item[] itemArray26 = tabela16.registros;
        ds.Item item27 = null;
        int int28 = tabela16.binaria(item27);
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        int int31 = tabela29.binaria(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        tabela29.n = '#';
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        int int37 = tabela35.binaria(item36);
        ds.Item[] itemArray38 = tabela35.registros;
        ds.Item[] itemArray39 = tabela35.registros;
        tabela29.registros = itemArray39;
        tabela16.registros = itemArray39;
        tabela11.registros = itemArray39;
        tabela0.registros = itemArray39;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        tabela0.n = (-1);
        tabela0.n = (byte) 1;
        int int12 = tabela0.n;
        tabela0.n = (short) -1;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Item item16 = null;
        tabela0.insere(item16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        ds.Item[] itemArray50 = tabela47.registros;
        ds.Item item51 = null;
        int int52 = tabela47.binaria(item51);
        ds.Item item53 = null;
        int int54 = tabela47.binaria(item53);
        ds.Item[] itemArray55 = tabela47.registros;
        tabela0.registros = itemArray55;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Item[] itemArray60 = tabela57.registros;
        ds.Item item61 = null;
        tabela57.insere(item61);
        tabela57.n = (-1);
        ds.Tabela tabela65 = new ds.Tabela();
        ds.Item item66 = null;
        int int67 = tabela65.binaria(item66);
        ds.Item[] itemArray68 = tabela65.registros;
        ds.Item[] itemArray69 = tabela65.registros;
        tabela57.registros = itemArray69;
        tabela0.registros = itemArray69;
        ds.Item item72 = null;
        tabela0.insere(item72);
        java.lang.Class<?> wildcardClass74 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = (byte) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
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
        tabela0.n = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (byte) -1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (byte) 1;
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
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
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        tabela18.n = '#';
        int int24 = tabela18.n;
        int int25 = tabela18.n;
        ds.Item[] itemArray26 = tabela18.registros;
        tabela0.registros = itemArray26;
        java.lang.Class<?> wildcardClass28 = itemArray26.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
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
        ds.Item item24 = null;
        tabela0.insere(item24);
        tabela0.n = '4';
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        int int10 = tabela0.n;
        ds.Item item11 = null;
        tabela0.insere(item11);
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        int int47 = tabela0.n;
        java.lang.Class<?> wildcardClass48 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item[] itemArray16 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.pesquisa(item19);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
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
        int int17 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        int int14 = tabela9.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela15.n = '#';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        tabela15.registros = itemArray24;
        tabela9.registros = itemArray24;
        int int27 = tabela9.n;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        int int32 = tabela28.n;
        ds.Item item33 = null;
        int int34 = tabela28.binaria(item33);
        tabela28.n = 100;
        tabela28.n = (byte) 10;
        ds.Item[] itemArray39 = tabela28.registros;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        int int42 = tabela40.binaria(item41);
        ds.Item[] itemArray43 = tabela40.registros;
        tabela40.n = '#';
        int int46 = tabela40.n;
        int int47 = tabela40.n;
        ds.Item[] itemArray48 = tabela40.registros;
        tabela28.registros = itemArray48;
        ds.Item[] itemArray50 = tabela28.registros;
        tabela9.registros = itemArray50;
        tabela0.registros = itemArray50;
        int int53 = tabela0.n;
        ds.Item item54 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
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
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = tabela0.registros;
        int int17 = tabela0.n;
        java.lang.Class<?> wildcardClass18 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        tabela9.insere(item13);
        int int15 = tabela9.n;
        ds.Item[] itemArray16 = tabela9.registros;
        tabela9.n = (byte) 1;
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        tabela9.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray23 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        ds.Item[] itemArray50 = tabela47.registros;
        ds.Item item51 = null;
        int int52 = tabela47.binaria(item51);
        ds.Item item53 = null;
        int int54 = tabela47.binaria(item53);
        ds.Item[] itemArray55 = tabela47.registros;
        tabela0.registros = itemArray55;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Item[] itemArray60 = tabela57.registros;
        ds.Item item61 = null;
        tabela57.insere(item61);
        tabela57.n = (-1);
        ds.Tabela tabela65 = new ds.Tabela();
        ds.Item item66 = null;
        int int67 = tabela65.binaria(item66);
        ds.Item[] itemArray68 = tabela65.registros;
        ds.Item[] itemArray69 = tabela65.registros;
        tabela57.registros = itemArray69;
        tabela0.registros = itemArray69;
        ds.Tabela tabela72 = new ds.Tabela();
        ds.Item item73 = null;
        tabela72.insere(item73);
        tabela72.n = (short) 10;
        ds.Item[] itemArray77 = tabela72.registros;
        tabela0.registros = itemArray77;
        java.lang.Class<?> wildcardClass79 = itemArray77.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
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
        int int15 = tabela0.n;
        ds.Item item16 = null;
        tabela0.insere(item16);
        java.lang.Class<?> wildcardClass18 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        int int13 = tabela8.binaria(item12);
        ds.Item[] itemArray14 = tabela8.registros;
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
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
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.pesquisa(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
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
        ds.Item item11 = null;
        tabela7.insere(item11);
        tabela7.n = (-1);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item[] itemArray19 = tabela15.registros;
        tabela7.registros = itemArray19;
        ds.Item[] itemArray21 = tabela7.registros;
        ds.Item[] itemArray22 = tabela7.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        tabela24.insere(item28);
        int int30 = tabela24.n;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        ds.Item[] itemArray34 = tabela31.registros;
        tabela24.registros = itemArray34;
        tabela24.n = 0;
        tabela24.n = (-1);
        ds.Item[] itemArray40 = tabela24.registros;
        tabela0.registros = itemArray40;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
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
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item[] itemArray14 = tabela0.registros;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
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
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        int int9 = tabela5.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Item[] itemArray13 = tabela10.registros;
        tabela5.registros = itemArray13;
        ds.Item[] itemArray15 = tabela5.registros;
        ds.Item item16 = null;
        int int17 = tabela5.binaria(item16);
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        tabela18.n = '#';
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item[] itemArray28 = tabela24.registros;
        tabela18.registros = itemArray28;
        tabela5.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item[] itemArray35 = tabela32.registros;
        int int36 = tabela32.n;
        ds.Item item37 = null;
        int int38 = tabela32.binaria(item37);
        tabela32.n = 100;
        tabela32.n = (byte) 10;
        ds.Item[] itemArray43 = tabela32.registros;
        tabela0.registros = itemArray43;
        java.lang.Class<?> wildcardClass45 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        tabela0.insere(item12);
        int int14 = tabela0.n;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = null;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(itemArray14);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        ds.Item item42 = null;
        tabela0.insere(item42);
        tabela0.n = '#';
        ds.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int47 = tabela0.binaria(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = '#';
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
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
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item item24 = null;
        int int25 = tabela20.binaria(item24);
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        int int28 = tabela26.binaria(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela26.n = '#';
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item[] itemArray35 = tabela32.registros;
        tabela26.registros = itemArray35;
        tabela20.registros = itemArray35;
        int int38 = tabela20.n;
        int int39 = tabela20.n;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        int int42 = tabela40.binaria(item41);
        ds.Item[] itemArray43 = tabela40.registros;
        ds.Item[] itemArray44 = tabela40.registros;
        tabela20.registros = itemArray44;
        tabela0.registros = itemArray44;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = '#';
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
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
        ds.Item[] itemArray12 = tabela0.registros;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        int int14 = tabela9.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela15.n = '#';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        tabela15.registros = itemArray24;
        tabela9.registros = itemArray24;
        int int27 = tabela9.n;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        int int32 = tabela28.n;
        ds.Item item33 = null;
        int int34 = tabela28.binaria(item33);
        tabela28.n = 100;
        tabela28.n = (byte) 10;
        ds.Item[] itemArray39 = tabela28.registros;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        int int42 = tabela40.binaria(item41);
        ds.Item[] itemArray43 = tabela40.registros;
        tabela40.n = '#';
        int int46 = tabela40.n;
        int int47 = tabela40.n;
        ds.Item[] itemArray48 = tabela40.registros;
        tabela28.registros = itemArray48;
        ds.Item[] itemArray50 = tabela28.registros;
        tabela9.registros = itemArray50;
        tabela0.registros = itemArray50;
        int int53 = tabela0.n;
        ds.Item item54 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int55 = tabela0.pesquisa(item54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
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
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.binaria(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        ds.Item item42 = null;
        tabela0.insere(item42);
        tabela0.n = 35;
        ds.Item[] itemArray46 = tabela0.registros;
        ds.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int48 = tabela0.binaria(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
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
        ds.Item[] itemArray56 = tabela0.registros;
        ds.Item item57 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int58 = tabela0.pesquisa(item57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        int int24 = tabela20.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        tabela20.registros = itemArray28;
        tabela0.registros = itemArray28;
        java.lang.Class<?> wildcardClass31 = itemArray28.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
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
        ds.Item[] itemArray12 = tabela0.registros;
        int int13 = tabela0.n;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
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
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Item[] itemArray20 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
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
        ds.Item[] itemArray21 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        tabela0.n = (byte) 0;
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
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
        tabela0.n = 10;
        int int30 = tabela0.n;
        ds.Item[] itemArray31 = tabela0.registros;
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = tabela0.binaria(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = '#';
        int int18 = tabela12.n;
        int int19 = tabela12.n;
        ds.Item[] itemArray20 = tabela12.registros;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray22 = tabela0.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        int int25 = tabela23.binaria(item24);
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        int int28 = tabela26.binaria(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela26.n = '#';
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item[] itemArray35 = tabela32.registros;
        tabela26.registros = itemArray35;
        int int37 = tabela26.n;
        ds.Item[] itemArray38 = tabela26.registros;
        tabela23.registros = itemArray38;
        tabela0.registros = itemArray38;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
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
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.binaria(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = (byte) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        tabela0.insere(item17);
        tabela0.n = 35;
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        int int24 = tabela20.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        tabela20.registros = itemArray28;
        tabela0.registros = itemArray28;
        tabela0.n = (byte) 100;
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = tabela0.pesquisa(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        int int9 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 100;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        tabela0.n = 97;
        ds.Item[] itemArray19 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
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
        ds.Item[] itemArray43 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
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
        ds.Item item16 = null;
        tabela0.insere(item16);
        ds.Item item18 = null;
        tabela0.insere(item18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
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
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
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
        tabela0.n = (byte) 100;
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
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        int int12 = tabela0.n;
        tabela0.n = (short) 100;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        int int19 = tabela13.n;
        tabela13.n = (byte) -1;
        ds.Item item22 = null;
        tabela13.insere(item22);
        ds.Item[] itemArray24 = tabela13.registros;
        tabela0.registros = itemArray24;
        int int26 = tabela0.n;
        ds.Item[] itemArray27 = tabela0.registros;
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tabela0.binaria(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela0.registros = itemArray14;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Item[] itemArray6 = tabela3.registros;
        tabela3.n = '#';
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        tabela3.registros = itemArray12;
        int int14 = tabela3.n;
        ds.Item[] itemArray15 = tabela3.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.pesquisa(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item[] itemArray23 = tabela19.registros;
        tabela13.registros = itemArray23;
        tabela0.registros = itemArray23;
        ds.Item item26 = null;
        tabela0.insere(item26);
        tabela0.n = (short) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        tabela0.n = (short) 10;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela0.registros = itemArray18;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.binaria(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        java.lang.Class<?> wildcardClass18 = itemArray15.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        tabela0.n = 97;
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.binaria(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = tabela0.pesquisa(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        int int18 = tabela13.binaria(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        tabela19.n = '#';
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        tabela19.registros = itemArray28;
        tabela13.registros = itemArray28;
        ds.Item[] itemArray31 = tabela13.registros;
        tabela13.n = (byte) 1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        int int36 = tabela34.binaria(item35);
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        tabela13.registros = itemArray38;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        int int42 = tabela40.binaria(item41);
        int int43 = tabela40.n;
        ds.Item[] itemArray44 = tabela40.registros;
        tabela13.registros = itemArray44;
        tabela0.registros = itemArray44;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = (byte) 100;
        tabela0.n = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = 0;
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        tabela0.n = (short) 10;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        tabela15.n = (short) 10;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item item24 = null;
        tabela20.insere(item24);
        int int26 = tabela20.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        ds.Item item31 = null;
        tabela27.insere(item31);
        tabela27.n = (-1);
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        int int37 = tabela35.binaria(item36);
        ds.Item[] itemArray38 = tabela35.registros;
        ds.Item[] itemArray39 = tabela35.registros;
        tabela27.registros = itemArray39;
        ds.Item[] itemArray41 = tabela27.registros;
        ds.Item[] itemArray42 = tabela27.registros;
        tabela20.registros = itemArray42;
        tabela15.registros = itemArray42;
        ds.Item[] itemArray45 = tabela15.registros;
        tabela0.registros = itemArray45;
        ds.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int48 = tabela0.pesquisa(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
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
        tabela0.n = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
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
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
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
        tabela0.n = 10;
        tabela0.n = 1;
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
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        tabela9.insere(item13);
        int int15 = tabela9.n;
        ds.Item[] itemArray16 = tabela9.registros;
        tabela9.n = (byte) 1;
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        tabela9.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
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
        ds.Item[] itemArray19 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.binaria(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        tabela0.n = 'a';
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        int int16 = tabela14.binaria(item15);
        ds.Item[] itemArray17 = tabela14.registros;
        ds.Item item18 = null;
        tabela14.insere(item18);
        tabela14.n = (-1);
        ds.Item item22 = null;
        tabela14.insere(item22);
        ds.Item[] itemArray24 = tabela14.registros;
        tabela0.registros = itemArray24;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        int int28 = tabela26.binaria(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        ds.Item item30 = null;
        tabela26.insere(item30);
        int int32 = tabela26.n;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela26.registros = itemArray36;
        tabela26.n = 1;
        ds.Item[] itemArray40 = tabela26.registros;
        tabela0.registros = itemArray40;
        java.lang.Class<?> wildcardClass42 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (short) -1;
        int int11 = tabela0.n;
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.binaria(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
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
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        int int26 = tabela22.n;
        ds.Item item27 = null;
        int int28 = tabela22.binaria(item27);
        tabela22.n = 100;
        ds.Item[] itemArray31 = tabela22.registros;
        tabela0.registros = itemArray31;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item14 = null;
        tabela0.insere(item14);
        int int16 = tabela0.n;
        int int17 = tabela0.n;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.binaria(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        tabela0.n = 'a';
        ds.Item[] itemArray16 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
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
        int int12 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Item[] itemArray27 = tabela21.registros;
        tabela0.registros = itemArray27;
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = tabela0.pesquisa(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
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
        java.lang.Class<?> wildcardClass16 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
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
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
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
        tabela0.n = 100;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        java.lang.Class<?> wildcardClass11 = itemArray10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
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
        tabela0.n = 10;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        ds.Item item34 = null;
        int int35 = tabela30.binaria(item34);
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela36.n = '#';
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        int int44 = tabela42.binaria(item43);
        ds.Item[] itemArray45 = tabela42.registros;
        tabela36.registros = itemArray45;
        tabela30.registros = itemArray45;
        int int48 = tabela30.n;
        int int49 = tabela30.n;
        ds.Item[] itemArray50 = tabela30.registros;
        int int51 = tabela30.n;
        ds.Item[] itemArray52 = tabela30.registros;
        tabela0.registros = itemArray52;
        java.lang.Class<?> wildcardClass54 = itemArray52.getClass();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
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
        tabela0.n = 1;
        ds.Item[] itemArray18 = tabela0.registros;
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela0.registros = itemArray24;
        int int26 = tabela0.n;
        ds.Item[] itemArray27 = tabela0.registros;
        int int28 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
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
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
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
        tabela0.n = 100;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        tabela0.n = 32;
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = tabela0.pesquisa(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        tabela8.n = '#';
        int int14 = tabela8.n;
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
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
        ds.Item[] itemArray19 = tabela0.registros;
        tabela0.n = 1;
        java.lang.Class<?> wildcardClass22 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        int int13 = tabela8.binaria(item12);
        ds.Item[] itemArray14 = tabela8.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        tabela0.n = 'a';
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        int int16 = tabela14.binaria(item15);
        ds.Item[] itemArray17 = tabela14.registros;
        ds.Item item18 = null;
        tabela14.insere(item18);
        tabela14.n = (-1);
        ds.Item item22 = null;
        tabela14.insere(item22);
        ds.Item[] itemArray24 = tabela14.registros;
        tabela0.registros = itemArray24;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        int int28 = tabela26.binaria(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        ds.Item item30 = null;
        tabela26.insere(item30);
        int int32 = tabela26.n;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela26.registros = itemArray36;
        tabela26.n = 1;
        ds.Item[] itemArray40 = tabela26.registros;
        tabela0.registros = itemArray40;
        tabela0.n = (short) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        int int47 = tabela0.n;
        tabela0.n = 0;
        ds.Item item50 = null;
        int int51 = tabela0.binaria(item50);
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = tabela0.pesquisa(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        int int11 = tabela0.n;
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Item[] itemArray27 = tabela21.registros;
        tabela0.registros = itemArray27;
        tabela0.n = (short) 100;
        ds.Item[] itemArray31 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
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
        int int15 = tabela0.n;
        ds.Item item16 = null;
        tabela0.insere(item16);
        ds.Item[] itemArray18 = null;
        tabela0.registros = itemArray18;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item item10 = null;
        int int11 = tabela6.binaria(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = '#';
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        tabela12.registros = itemArray21;
        tabela6.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.pesquisa(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = 3;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item item16 = null;
        tabela12.insere(item16);
        tabela12.n = (-1);
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela12.registros = itemArray24;
        ds.Item[] itemArray26 = tabela12.registros;
        ds.Item[] itemArray27 = tabela12.registros;
        tabela0.registros = itemArray27;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = 2;
        java.lang.Class<?> wildcardClass16 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = '#';
        int int18 = tabela12.n;
        int int19 = tabela12.n;
        ds.Item[] itemArray20 = tabela12.registros;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray22 = tabela0.registros;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = 100;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
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
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        int int26 = tabela22.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela22.registros = itemArray30;
        ds.Item[] itemArray32 = tabela22.registros;
        ds.Item item33 = null;
        int int34 = tabela22.binaria(item33);
        ds.Item[] itemArray35 = tabela22.registros;
        ds.Item item36 = null;
        int int37 = tabela22.binaria(item36);
        ds.Item[] itemArray38 = tabela22.registros;
        tabela0.registros = itemArray38;
        tabela0.n = 3;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.pesquisa(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
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
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = tabela0.registros;
        int int17 = tabela0.n;
        ds.Item item18 = null;
        tabela0.insere(item18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        int int47 = tabela0.n;
        tabela0.n = 0;
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = tabela0.pesquisa(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Item[] itemArray6 = tabela3.registros;
        tabela3.n = '#';
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        tabela3.registros = itemArray12;
        int int14 = tabela3.n;
        ds.Item[] itemArray15 = tabela3.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        ds.Item item19 = null;
        tabela0.insere(item19);
        int int21 = tabela0.n;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.binaria(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
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
        tabela0.n = 1;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        tabela19.n = (short) 10;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        int int28 = tabela24.n;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        int int31 = tabela29.binaria(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        tabela24.registros = itemArray32;
        ds.Item[] itemArray34 = tabela24.registros;
        ds.Item item35 = null;
        int int36 = tabela24.binaria(item35);
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        int int39 = tabela37.binaria(item38);
        ds.Item[] itemArray40 = tabela37.registros;
        tabela37.n = '#';
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        int int45 = tabela43.binaria(item44);
        ds.Item[] itemArray46 = tabela43.registros;
        ds.Item[] itemArray47 = tabela43.registros;
        tabela37.registros = itemArray47;
        tabela24.registros = itemArray47;
        tabela19.registros = itemArray47;
        tabela0.registros = itemArray47;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
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
        ds.Item item20 = null;
        int int21 = tabela0.binaria(item20);
        int int22 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
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
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item21 = null;
        tabela0.insere(item21);
        ds.Item item23 = null;
        tabela0.insere(item23);
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = (byte) 100;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        int int13 = tabela9.n;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        int int16 = tabela14.binaria(item15);
        ds.Item[] itemArray17 = tabela14.registros;
        tabela9.registros = itemArray17;
        ds.Item[] itemArray19 = tabela9.registros;
        ds.Item item20 = null;
        int int21 = tabela9.binaria(item20);
        ds.Item[] itemArray22 = tabela9.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        int int28 = tabela24.n;
        ds.Item item29 = null;
        int int30 = tabela24.binaria(item29);
        tabela24.n = 100;
        ds.Item[] itemArray33 = tabela24.registros;
        tabela0.registros = itemArray33;
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.pesquisa(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        tabela8.n = '#';
        int int14 = tabela8.n;
        ds.Item[] itemArray15 = tabela8.registros;
        ds.Item[] itemArray16 = tabela8.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        int int19 = tabela17.binaria(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        ds.Item item21 = null;
        int int22 = tabela17.binaria(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        int int25 = tabela23.binaria(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        tabela23.n = '#';
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        int int31 = tabela29.binaria(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        tabela23.registros = itemArray32;
        tabela17.registros = itemArray32;
        int int35 = tabela17.n;
        ds.Item[] itemArray36 = tabela17.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        ds.Item[] itemArray40 = tabela37.registros;
        ds.Item[] itemArray41 = tabela37.registros;
        tabela17.registros = itemArray41;
        tabela8.registros = itemArray41;
        ds.Item[] itemArray44 = tabela8.registros;
        tabela0.registros = itemArray44;
        ds.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
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
        int int14 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        int int14 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        tabela0.n = (byte) 10;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item[] itemArray21 = tabela15.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        ds.Item item26 = null;
        int int27 = tabela22.binaria(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        tabela28.n = '#';
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        int int36 = tabela34.binaria(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        tabela28.registros = itemArray37;
        tabela22.registros = itemArray37;
        int int40 = tabela22.n;
        ds.Item[] itemArray41 = tabela22.registros;
        tabela15.registros = itemArray41;
        tabela0.registros = itemArray41;
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.binaria(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        int int7 = tabela0.n;
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        ds.Item item42 = null;
        tabela0.insere(item42);
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.binaria(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 3;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
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
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 1;
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
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
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
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela0.registros = itemArray24;
        java.lang.Class<?> wildcardClass26 = itemArray24.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        ds.Item[] itemArray50 = tabela47.registros;
        ds.Item item51 = null;
        int int52 = tabela47.binaria(item51);
        ds.Item item53 = null;
        int int54 = tabela47.binaria(item53);
        ds.Item[] itemArray55 = tabela47.registros;
        tabela0.registros = itemArray55;
        int int57 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
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
        int int15 = tabela0.n;
        tabela0.n = 0;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        tabela11.n = (-1);
        ds.Item[] itemArray19 = tabela11.registros;
        tabela0.registros = itemArray19;
        tabela0.n = (short) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = 0;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
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
        int int21 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        ds.Item item22 = null;
        tabela18.insere(item22);
        int int24 = tabela18.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        tabela18.registros = itemArray28;
        tabela18.n = 1;
        ds.Item[] itemArray32 = tabela18.registros;
        tabela0.registros = itemArray32;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        int int36 = tabela34.binaria(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        ds.Item item38 = null;
        tabela34.insere(item38);
        tabela34.n = (-1);
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        int int44 = tabela42.binaria(item43);
        ds.Item[] itemArray45 = tabela42.registros;
        ds.Item[] itemArray46 = tabela42.registros;
        tabela34.registros = itemArray46;
        ds.Item[] itemArray48 = tabela34.registros;
        ds.Item[] itemArray49 = tabela34.registros;
        tabela0.registros = itemArray49;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
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
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.pesquisa(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
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
        ds.Item[] itemArray22 = tabela0.registros;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.binaria(item23);
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
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        tabela0.n = (-1);
        tabela0.n = (byte) 1;
        int int12 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item[] itemArray15 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        tabela0.n = (-1);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        tabela0.n = (-1);
        tabela0.n = (byte) 1;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item item16 = null;
        tabela12.insere(item16);
        tabela12.n = '4';
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item item24 = null;
        int int25 = tabela20.binaria(item24);
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        int int28 = tabela26.binaria(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela26.n = '#';
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item[] itemArray35 = tabela32.registros;
        tabela26.registros = itemArray35;
        tabela20.registros = itemArray35;
        ds.Item[] itemArray38 = tabela20.registros;
        tabela12.registros = itemArray38;
        tabela12.n = 10;
        int int42 = tabela12.n;
        ds.Item[] itemArray43 = tabela12.registros;
        tabela0.registros = itemArray43;
        ds.Item[] itemArray45 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.binaria(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        ds.Item item13 = null;
        int int14 = tabela9.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela15.n = '#';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        tabela15.registros = itemArray24;
        tabela9.registros = itemArray24;
        int int27 = tabela9.n;
        int int28 = tabela9.n;
        ds.Item[] itemArray29 = tabela9.registros;
        tabela0.registros = itemArray29;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        int int19 = tabela13.n;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela13.n = (byte) 1;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela13.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tabela0.pesquisa(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item[] itemArray10 = tabela6.registros;
        tabela0.registros = itemArray10;
        int int12 = tabela0.n;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.binaria(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        ds.Item[] itemArray50 = tabela47.registros;
        ds.Item item51 = null;
        int int52 = tabela47.binaria(item51);
        ds.Item item53 = null;
        int int54 = tabela47.binaria(item53);
        ds.Item[] itemArray55 = tabela47.registros;
        tabela0.registros = itemArray55;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Item[] itemArray60 = tabela57.registros;
        ds.Item item61 = null;
        tabela57.insere(item61);
        tabela57.n = (-1);
        ds.Tabela tabela65 = new ds.Tabela();
        ds.Item item66 = null;
        int int67 = tabela65.binaria(item66);
        ds.Item[] itemArray68 = tabela65.registros;
        ds.Item[] itemArray69 = tabela65.registros;
        tabela57.registros = itemArray69;
        tabela0.registros = itemArray69;
        ds.Tabela tabela72 = new ds.Tabela();
        ds.Item item73 = null;
        tabela72.insere(item73);
        tabela72.n = (short) 10;
        ds.Item[] itemArray77 = tabela72.registros;
        tabela0.registros = itemArray77;
        ds.Item item79 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int80 = tabela0.binaria(item79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = '#';
        tabela0.n = 35;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = (byte) 100;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
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
        tabela0.n = 10;
        ds.Item[] itemArray30 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
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
        ds.Item item26 = null;
        tabela0.insere(item26);
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
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
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
        int int21 = tabela0.n;
        ds.Item item22 = null;
        int int23 = tabela0.binaria(item22);
        ds.Item[] itemArray24 = tabela0.registros;
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        java.lang.Class<?> wildcardClass2 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (short) -1;
        tabela0.n = '4';
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        int int16 = tabela11.binaria(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        int int19 = tabela17.binaria(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        tabela17.n = '#';
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        int int25 = tabela23.binaria(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        tabela17.registros = itemArray26;
        tabela11.registros = itemArray26;
        int int29 = tabela11.n;
        int int30 = tabela11.n;
        ds.Item[] itemArray31 = tabela11.registros;
        ds.Item item32 = null;
        tabela11.insere(item32);
        int int34 = tabela11.n;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        int int37 = tabela35.binaria(item36);
        ds.Item item38 = null;
        int int39 = tabela35.binaria(item38);
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        int int42 = tabela40.binaria(item41);
        ds.Item[] itemArray43 = tabela40.registros;
        ds.Item item44 = null;
        int int45 = tabela40.binaria(item44);
        ds.Item[] itemArray46 = tabela40.registros;
        ds.Item[] itemArray47 = tabela40.registros;
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item item49 = null;
        int int50 = tabela48.binaria(item49);
        ds.Item[] itemArray51 = tabela48.registros;
        ds.Item item52 = null;
        int int53 = tabela48.binaria(item52);
        ds.Item[] itemArray54 = tabela48.registros;
        ds.Item[] itemArray55 = tabela48.registros;
        tabela40.registros = itemArray55;
        tabela35.registros = itemArray55;
        tabela11.registros = itemArray55;
        ds.Item[] itemArray59 = tabela11.registros;
        tabela0.registros = itemArray59;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Item[] itemArray6 = tabela3.registros;
        tabela3.n = '#';
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        int int11 = tabela9.binaria(item10);
        ds.Item[] itemArray12 = tabela9.registros;
        tabela3.registros = itemArray12;
        int int14 = tabela3.n;
        ds.Item[] itemArray15 = tabela3.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item item22 = null;
        tabela0.insere(item22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
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
        tabela0.n = (short) 100;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = ' ';
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
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
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        int int24 = tabela21.n;
        ds.Item[] itemArray25 = tabela21.registros;
        tabela0.registros = itemArray25;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        int int30 = tabela27.n;
        ds.Item[] itemArray31 = tabela27.registros;
        tabela0.registros = itemArray31;
        ds.Item item33 = null;
        tabela0.insere(item33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
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
        ds.Item item20 = null;
        int int21 = tabela0.binaria(item20);
        ds.Item item22 = null;
        tabela0.insere(item22);
        tabela0.n = 10;
        ds.Item[] itemArray26 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
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
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        int int18 = tabela16.binaria(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item item20 = null;
        tabela16.insere(item20);
        int int22 = tabela16.n;
        ds.Item[] itemArray23 = tabela16.registros;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Item[] itemArray30 = tabela24.registros;
        tabela16.registros = itemArray30;
        tabela0.registros = itemArray30;
        java.lang.Class<?> wildcardClass33 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
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
        java.lang.Class<?> wildcardClass14 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 10;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item item9 = null;
        tabela5.insere(item9);
        int int11 = tabela5.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item item16 = null;
        tabela12.insere(item16);
        tabela12.n = (-1);
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela12.registros = itemArray24;
        ds.Item[] itemArray26 = tabela12.registros;
        ds.Item[] itemArray27 = tabela12.registros;
        tabela5.registros = itemArray27;
        tabela0.registros = itemArray27;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = tabela0.pesquisa(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
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
        ds.Item item24 = null;
        tabela0.insere(item24);
        ds.Item item26 = null;
        tabela0.insere(item26);
        ds.Item item28 = null;
        tabela0.insere(item28);
        tabela0.n = 0;
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
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item14 = null;
        tabela0.insere(item14);
        int int16 = tabela0.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        int int19 = tabela17.binaria(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        ds.Item item21 = null;
        tabela17.insere(item21);
        int int23 = tabela17.n;
        ds.Item[] itemArray24 = tabela17.registros;
        tabela17.n = (byte) 1;
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        tabela17.registros = itemArray28;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        int int36 = tabela30.n;
        tabela30.n = (byte) -1;
        ds.Item item39 = null;
        tabela30.insere(item39);
        ds.Item[] itemArray41 = tabela30.registros;
        tabela17.registros = itemArray41;
        int int43 = tabela17.n;
        ds.Item[] itemArray44 = tabela17.registros;
        tabela0.registros = itemArray44;
        ds.Item item46 = null;
        tabela0.insere(item46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
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
        int int23 = tabela0.n;
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
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
        ds.Item[] itemArray56 = tabela0.registros;
        ds.Item[] itemArray57 = tabela0.registros;
        ds.Item[] itemArray58 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
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
        int int12 = tabela0.n;
        ds.Item item13 = null;
        tabela0.insere(item13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
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
        ds.Item[] itemArray19 = tabela0.registros;
        tabela0.n = 1;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        tabela22.n = '#';
        int int28 = tabela22.n;
        int int29 = tabela22.n;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        int int34 = tabela30.n;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        int int37 = tabela35.binaria(item36);
        ds.Item[] itemArray38 = tabela35.registros;
        tabela30.registros = itemArray38;
        tabela22.registros = itemArray38;
        ds.Item[] itemArray41 = tabela22.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        int int44 = tabela42.binaria(item43);
        ds.Item[] itemArray45 = tabela42.registros;
        int int46 = tabela42.n;
        ds.Item item47 = null;
        tabela42.insere(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        int int51 = tabela49.binaria(item50);
        ds.Item[] itemArray52 = tabela49.registros;
        int int53 = tabela49.n;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        int int56 = tabela54.binaria(item55);
        ds.Item[] itemArray57 = tabela54.registros;
        tabela49.registros = itemArray57;
        tabela42.registros = itemArray57;
        ds.Tabela tabela60 = new ds.Tabela();
        ds.Item item61 = null;
        int int62 = tabela60.binaria(item61);
        ds.Item[] itemArray63 = tabela60.registros;
        ds.Item item64 = null;
        tabela60.insere(item64);
        int int66 = tabela60.n;
        ds.Tabela tabela67 = new ds.Tabela();
        ds.Item item68 = null;
        int int69 = tabela67.binaria(item68);
        ds.Item[] itemArray70 = tabela67.registros;
        tabela60.registros = itemArray70;
        tabela60.n = 1;
        ds.Item[] itemArray74 = tabela60.registros;
        tabela42.registros = itemArray74;
        ds.Tabela tabela76 = new ds.Tabela();
        ds.Item item77 = null;
        int int78 = tabela76.binaria(item77);
        ds.Item[] itemArray79 = tabela76.registros;
        ds.Item item80 = null;
        tabela76.insere(item80);
        int int82 = tabela76.n;
        ds.Item[] itemArray83 = tabela76.registros;
        tabela42.registros = itemArray83;
        tabela22.registros = itemArray83;
        tabela0.registros = itemArray83;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(itemArray83);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        tabela22.n = '#';
        int int28 = tabela22.n;
        int int29 = tabela22.n;
        ds.Item[] itemArray30 = tabela22.registros;
        tabela22.n = (short) -1;
        int int33 = tabela22.n;
        ds.Item[] itemArray34 = tabela22.registros;
        tabela0.registros = itemArray34;
        int int36 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Item item20 = null;
        tabela0.insere(item20);
        tabela0.n = '#';
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tabela0.binaria(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item14 = null;
        tabela0.insere(item14);
        int int16 = tabela0.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        int int19 = tabela17.binaria(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        ds.Item item21 = null;
        tabela17.insere(item21);
        int int23 = tabela17.n;
        ds.Item[] itemArray24 = tabela17.registros;
        tabela17.n = (byte) 1;
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        tabela17.registros = itemArray28;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        int int36 = tabela30.n;
        tabela30.n = (byte) -1;
        ds.Item item39 = null;
        tabela30.insere(item39);
        ds.Item[] itemArray41 = tabela30.registros;
        tabela17.registros = itemArray41;
        int int43 = tabela17.n;
        ds.Item[] itemArray44 = tabela17.registros;
        tabela0.registros = itemArray44;
        ds.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int47 = tabela0.binaria(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        int int47 = tabela0.n;
        tabela0.n = 0;
        ds.Item item50 = null;
        int int51 = tabela0.binaria(item50);
        ds.Item item52 = null;
        int int53 = tabela0.binaria(item52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item item21 = null;
        int int22 = tabela0.binaria(item21);
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
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
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Item[] itemArray16 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
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
        ds.Item item20 = null;
        tabela0.insere(item20);
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        int int26 = tabela22.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela22.registros = itemArray30;
        ds.Item[] itemArray32 = tabela22.registros;
        ds.Item item33 = null;
        int int34 = tabela22.binaria(item33);
        ds.Item[] itemArray35 = tabela22.registros;
        ds.Item item36 = null;
        int int37 = tabela22.binaria(item36);
        ds.Item[] itemArray38 = tabela22.registros;
        tabela0.registros = itemArray38;
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = tabela0.pesquisa(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        tabela0.insere(item5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
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
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        tabela0.n = (-1);
        tabela0.n = (byte) 1;
        ds.Item item12 = null;
        tabela0.insere(item12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        tabela0.n = 1;
        tabela0.n = 35;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        ds.Item item26 = null;
        tabela22.insere(item26);
        int int28 = tabela22.n;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        int int31 = tabela29.binaria(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        tabela22.registros = itemArray32;
        tabela22.n = 0;
        tabela22.n = (-1);
        ds.Item[] itemArray38 = tabela22.registros;
        tabela0.registros = itemArray38;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        tabela0.insere(item12);
        int int14 = tabela0.n;
        int int15 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        int int16 = tabela0.n;
        ds.Item item17 = null;
        tabela0.insere(item17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item item11 = null;
        int int12 = tabela7.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        tabela13.registros = itemArray22;
        tabela7.registros = itemArray22;
        int int25 = tabela7.n;
        ds.Item[] itemArray26 = tabela7.registros;
        tabela0.registros = itemArray26;
        tabela0.n = (short) 10;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = 2;
        ds.Item[] itemArray16 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = '#';
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
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
        int int14 = tabela0.n;
        tabela0.n = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Item[] itemArray8 = tabela4.registros;
        ds.Item item9 = null;
        tabela4.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela11.n = '#';
        int int17 = tabela11.n;
        tabela11.n = (byte) -1;
        ds.Item item20 = null;
        tabela11.insere(item20);
        ds.Item[] itemArray22 = tabela11.registros;
        tabela4.registros = itemArray22;
        tabela0.registros = itemArray22;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = 3;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
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
        int int15 = tabela0.n;
        tabela0.n = 0;
        int int18 = tabela0.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        int int23 = tabela19.n;
        ds.Item item24 = null;
        int int25 = tabela19.binaria(item24);
        tabela19.n = 100;
        ds.Item[] itemArray28 = tabela19.registros;
        tabela0.registros = itemArray28;
        ds.Item item30 = null;
        int int31 = tabela0.binaria(item30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
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
        ds.Item[] itemArray21 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
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
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item item16 = null;
        int int17 = tabela12.binaria(item16);
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        tabela18.n = '#';
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        tabela18.registros = itemArray27;
        tabela12.registros = itemArray27;
        int int30 = tabela12.n;
        int int31 = tabela12.n;
        ds.Item[] itemArray32 = tabela12.registros;
        ds.Item item33 = null;
        tabela12.insere(item33);
        int int35 = tabela12.n;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item item39 = null;
        int int40 = tabela36.binaria(item39);
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item item42 = null;
        int int43 = tabela41.binaria(item42);
        ds.Item[] itemArray44 = tabela41.registros;
        ds.Item item45 = null;
        int int46 = tabela41.binaria(item45);
        ds.Item[] itemArray47 = tabela41.registros;
        ds.Item[] itemArray48 = tabela41.registros;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        int int51 = tabela49.binaria(item50);
        ds.Item[] itemArray52 = tabela49.registros;
        ds.Item item53 = null;
        int int54 = tabela49.binaria(item53);
        ds.Item[] itemArray55 = tabela49.registros;
        ds.Item[] itemArray56 = tabela49.registros;
        tabela41.registros = itemArray56;
        tabela36.registros = itemArray56;
        tabela12.registros = itemArray56;
        tabela0.registros = itemArray56;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        tabela0.insere(item12);
        int int14 = tabela0.n;
        tabela0.n = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        int int19 = tabela13.n;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela13.n = (byte) 1;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela13.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Item[] itemArray27 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
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
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item item19 = null;
        tabela15.insere(item19);
        ds.Item[] itemArray21 = tabela15.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        ds.Item item26 = null;
        int int27 = tabela22.binaria(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        tabela28.n = '#';
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        int int36 = tabela34.binaria(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        tabela28.registros = itemArray37;
        tabela22.registros = itemArray37;
        int int40 = tabela22.n;
        ds.Item[] itemArray41 = tabela22.registros;
        tabela15.registros = itemArray41;
        tabela0.registros = itemArray41;
        int int44 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        int int7 = tabela5.binaria(item6);
        ds.Item[] itemArray8 = tabela5.registros;
        ds.Item item9 = null;
        tabela5.insere(item9);
        tabela5.n = (-1);
        tabela5.n = (-1);
        tabela5.n = (byte) 1;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        int int19 = tabela17.binaria(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        ds.Item item21 = null;
        tabela17.insere(item21);
        tabela17.n = '4';
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        ds.Item item29 = null;
        int int30 = tabela25.binaria(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        ds.Item[] itemArray34 = tabela31.registros;
        tabela31.n = '#';
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        int int39 = tabela37.binaria(item38);
        ds.Item[] itemArray40 = tabela37.registros;
        tabela31.registros = itemArray40;
        tabela25.registros = itemArray40;
        ds.Item[] itemArray43 = tabela25.registros;
        tabela17.registros = itemArray43;
        tabela17.n = 10;
        int int47 = tabela17.n;
        ds.Item[] itemArray48 = tabela17.registros;
        tabela5.registros = itemArray48;
        tabela0.registros = itemArray48;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item14 = null;
        tabela0.insere(item14);
        int int16 = tabela0.n;
        int int17 = tabela0.n;
        int int18 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
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
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        tabela15.n = '#';
        int int21 = tabela15.n;
        int int22 = tabela15.n;
        ds.Item[] itemArray23 = tabela15.registros;
        tabela15.n = (short) -1;
        int int26 = tabela15.n;
        ds.Item[] itemArray27 = tabela15.registros;
        tabela14.registros = itemArray27;
        tabela0.registros = itemArray27;
        ds.Item item30 = null;
        int int31 = tabela0.binaria(item30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
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
        ds.Item item24 = null;
        tabela0.insere(item24);
        int int26 = tabela0.n;
        tabela0.n = 3;
        ds.Item item29 = null;
        tabela0.insere(item29);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        ds.Item item22 = null;
        tabela18.insere(item22);
        int int24 = tabela18.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        tabela18.registros = itemArray28;
        tabela18.n = 1;
        ds.Item[] itemArray32 = tabela18.registros;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray34 = tabela0.registros;
        ds.Item item35 = null;
        tabela0.insere(item35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
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
        int int15 = tabela0.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        int int18 = tabela16.binaria(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        ds.Item item20 = null;
        tabela16.insere(item20);
        tabela16.n = (-1);
        ds.Item item24 = null;
        tabela16.insere(item24);
        ds.Item[] itemArray26 = tabela16.registros;
        tabela0.registros = itemArray26;
        ds.Item[] itemArray28 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
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
        ds.Item item20 = null;
        int int21 = tabela0.binaria(item20);
        ds.Item item22 = null;
        tabela0.insere(item22);
        tabela0.n = 10;
        int int26 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela0.registros = itemArray24;
        ds.Item item26 = null;
        int int27 = tabela0.binaria(item26);
        tabela0.n = 35;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        int int36 = tabela30.n;
        ds.Item[] itemArray37 = tabela30.registros;
        ds.Item[] itemArray38 = tabela30.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        int int41 = tabela39.binaria(item40);
        ds.Item[] itemArray42 = tabela39.registros;
        tabela39.n = '#';
        int int45 = tabela39.n;
        ds.Item[] itemArray46 = tabela39.registros;
        tabela39.n = '#';
        int int49 = tabela39.n;
        ds.Item[] itemArray50 = tabela39.registros;
        tabela30.registros = itemArray50;
        tabela0.registros = itemArray50;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Item[] itemArray27 = tabela21.registros;
        tabela0.registros = itemArray27;
        ds.Item item29 = null;
        int int30 = tabela0.binaria(item29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
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
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        tabela0.n = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        tabela0.n = 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        tabela0.n = 97;
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.pesquisa(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        int int18 = tabela16.binaria(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        tabela16.n = '#';
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        tabela16.registros = itemArray25;
        int int27 = tabela16.n;
        tabela16.n = 32;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela16.registros = itemArray33;
        tabela0.registros = itemArray33;
        ds.Item[] itemArray36 = tabela0.registros;
        java.lang.Class<?> wildcardClass37 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        java.lang.Class<?> wildcardClass42 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
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
        tabela0.n = (byte) 1;
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
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (short) -1;
        int int11 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray14 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
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
        tabela13.insere(item14);
        tabela13.n = (short) 10;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        ds.Item item22 = null;
        tabela18.insere(item22);
        int int24 = tabela18.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        ds.Item item29 = null;
        tabela25.insere(item29);
        tabela25.n = (-1);
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        ds.Item[] itemArray37 = tabela33.registros;
        tabela25.registros = itemArray37;
        ds.Item[] itemArray39 = tabela25.registros;
        ds.Item[] itemArray40 = tabela25.registros;
        tabela18.registros = itemArray40;
        tabela13.registros = itemArray40;
        tabela0.registros = itemArray40;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = '#';
        int int18 = tabela12.n;
        int int19 = tabela12.n;
        ds.Item[] itemArray20 = tabela12.registros;
        tabela0.registros = itemArray20;
        java.lang.Class<?> wildcardClass22 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
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
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        tabela0.n = (short) 0;
        int int14 = tabela0.n;
        ds.Item item15 = null;
        int int16 = tabela0.binaria(item15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (short) 1;
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
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
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item[] itemArray24 = tabela20.registros;
        tabela0.registros = itemArray24;
        ds.Item item26 = null;
        int int27 = tabela0.binaria(item26);
        tabela0.n = 35;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
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
        tabela0.n = (short) 100;
        ds.Item[] itemArray19 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Item[] itemArray27 = tabela21.registros;
        tabela0.registros = itemArray27;
        ds.Item item29 = null;
        tabela0.insere(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        ds.Item[] itemArray34 = tabela31.registros;
        tabela31.n = '#';
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        int int39 = tabela37.binaria(item38);
        ds.Item[] itemArray40 = tabela37.registros;
        ds.Item[] itemArray41 = tabela37.registros;
        tabela31.registros = itemArray41;
        tabela31.n = 'a';
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item item46 = null;
        int int47 = tabela45.binaria(item46);
        ds.Item[] itemArray48 = tabela45.registros;
        ds.Item item49 = null;
        tabela45.insere(item49);
        tabela45.n = (-1);
        ds.Item item53 = null;
        tabela45.insere(item53);
        ds.Item[] itemArray55 = tabela45.registros;
        tabela31.registros = itemArray55;
        tabela0.registros = itemArray55;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (byte) -1;
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
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
        tabela8.n = '#';
        int int14 = tabela8.n;
        int int15 = tabela8.n;
        ds.Item[] itemArray16 = tabela8.registros;
        tabela0.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        tabela18.n = (short) 10;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        int int25 = tabela23.binaria(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        int int27 = tabela23.n;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        tabela23.registros = itemArray31;
        ds.Item[] itemArray33 = tabela23.registros;
        ds.Item item34 = null;
        int int35 = tabela23.binaria(item34);
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela36.n = '#';
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        int int44 = tabela42.binaria(item43);
        ds.Item[] itemArray45 = tabela42.registros;
        ds.Item[] itemArray46 = tabela42.registros;
        tabela36.registros = itemArray46;
        tabela23.registros = itemArray46;
        tabela18.registros = itemArray46;
        tabela0.registros = itemArray46;
        ds.Item[] itemArray51 = tabela0.registros;
        ds.Item[] itemArray52 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        tabela0.n = '4';
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.binaria(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
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
        tabela0.n = 100;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        ds.Item[] itemArray16 = tabela12.registros;
        tabela0.registros = itemArray16;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        tabela0.insere(item12);
        ds.Item item14 = null;
        tabela0.insere(item14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
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
        tabela0.n = 32;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item[] itemArray7 = tabela0.registros;
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = '#';
        int int18 = tabela12.n;
        int int19 = tabela12.n;
        ds.Item[] itemArray20 = tabela12.registros;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray22 = tabela0.registros;
        tabela0.n = (byte) 10;
        tabela0.n = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        int int8 = tabela6.binaria(item7);
        ds.Item[] itemArray9 = tabela6.registros;
        ds.Item item10 = null;
        int int11 = tabela6.binaria(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = '#';
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        tabela12.registros = itemArray21;
        tabela6.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.binaria(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        ds.Item item15 = null;
        tabela11.insere(item15);
        int int17 = tabela11.n;
        tabela11.n = 1;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        tabela20.n = (short) 10;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        int int29 = tabela25.n;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela25.registros = itemArray33;
        ds.Item[] itemArray35 = tabela25.registros;
        ds.Item item36 = null;
        int int37 = tabela25.binaria(item36);
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        int int40 = tabela38.binaria(item39);
        ds.Item[] itemArray41 = tabela38.registros;
        tabela38.n = '#';
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        int int46 = tabela44.binaria(item45);
        ds.Item[] itemArray47 = tabela44.registros;
        ds.Item[] itemArray48 = tabela44.registros;
        tabela38.registros = itemArray48;
        tabela25.registros = itemArray48;
        tabela20.registros = itemArray48;
        ds.Tabela tabela52 = new ds.Tabela();
        ds.Item item53 = null;
        int int54 = tabela52.binaria(item53);
        ds.Item[] itemArray55 = tabela52.registros;
        int int56 = tabela52.n;
        ds.Item item57 = null;
        int int58 = tabela52.binaria(item57);
        tabela52.n = 100;
        tabela52.n = (byte) 10;
        ds.Item[] itemArray63 = tabela52.registros;
        tabela20.registros = itemArray63;
        tabela11.registros = itemArray63;
        ds.Item[] itemArray66 = tabela11.registros;
        tabela0.registros = itemArray66;
        ds.Item item68 = null;
        tabela0.insere(item68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
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
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        int int20 = tabela0.n;
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        int int24 = tabela22.binaria(item23);
        ds.Item[] itemArray25 = tabela22.registros;
        ds.Item item26 = null;
        tabela22.insere(item26);
        tabela22.n = (-1);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        ds.Item[] itemArray34 = tabela30.registros;
        tabela22.registros = itemArray34;
        ds.Item[] itemArray36 = tabela22.registros;
        tabela0.registros = itemArray36;
        tabela0.n = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
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
        ds.Item[] itemArray56 = tabela0.registros;
        ds.Item[] itemArray57 = tabela0.registros;
        ds.Item item58 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int59 = tabela0.binaria(item58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
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
        ds.Item item43 = null;
        int int44 = tabela0.binaria(item43);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
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
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.binaria(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        tabela0.n = (short) 10;
        tabela0.n = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        int int19 = tabela13.n;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela13.n = (byte) 1;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela13.registros = itemArray24;
        tabela0.registros = itemArray24;
        tabela0.n = 35;
        java.lang.Class<?> wildcardClass29 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
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
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        tabela13.registros = itemArray22;
        int int24 = tabela13.n;
        ds.Item[] itemArray25 = tabela13.registros;
        tabela10.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item[] itemArray28 = tabela0.registros;
        ds.Item item29 = null;
        tabela0.insere(item29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (byte) -1;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        ds.Item item13 = null;
        int int14 = tabela0.binaria(item13);
        ds.Item item15 = null;
        tabela0.insere(item15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = null;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        tabela0.registros = itemArray14;
        ds.Item[] itemArray16 = tabela0.registros;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray19 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        ds.Item item2 = null;
        int int3 = tabela1.binaria(item2);
        ds.Item[] itemArray4 = tabela1.registros;
        tabela1.n = '#';
        int int7 = tabela1.n;
        int int8 = tabela1.n;
        ds.Item[] itemArray9 = tabela1.registros;
        tabela1.n = (short) -1;
        int int12 = tabela1.n;
        ds.Item[] itemArray13 = tabela1.registros;
        tabela0.registros = itemArray13;
        tabela0.n = 3;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
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
        tabela0.n = 1;
        ds.Item[] itemArray30 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        tabela8.insere(item12);
        tabela8.n = (-1);
        tabela8.n = (-1);
        tabela8.n = (byte) 1;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        ds.Item item24 = null;
        tabela20.insere(item24);
        tabela20.n = '4';
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        ds.Item item32 = null;
        int int33 = tabela28.binaria(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        int int36 = tabela34.binaria(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        tabela34.n = '#';
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        int int42 = tabela40.binaria(item41);
        ds.Item[] itemArray43 = tabela40.registros;
        tabela34.registros = itemArray43;
        tabela28.registros = itemArray43;
        ds.Item[] itemArray46 = tabela28.registros;
        tabela20.registros = itemArray46;
        tabela20.n = 10;
        int int50 = tabela20.n;
        ds.Item[] itemArray51 = tabela20.registros;
        tabela8.registros = itemArray51;
        tabela0.registros = itemArray51;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        tabela0.n = (byte) 1;
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.pesquisa(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        int int19 = tabela13.n;
        ds.Item[] itemArray20 = tabela13.registros;
        int int21 = tabela13.n;
        ds.Item[] itemArray22 = tabela13.registros;
        tabela0.registros = itemArray22;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 100;
        tabela0.n = (byte) 10;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela12.n = '#';
        int int18 = tabela12.n;
        int int19 = tabela12.n;
        ds.Item[] itemArray20 = tabela12.registros;
        tabela0.registros = itemArray20;
        java.lang.Class<?> wildcardClass22 = itemArray20.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
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
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        int int57 = tabela55.binaria(item56);
        ds.Tabela tabela58 = new ds.Tabela();
        ds.Item item59 = null;
        int int60 = tabela58.binaria(item59);
        ds.Item[] itemArray61 = tabela58.registros;
        tabela58.n = '#';
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item item65 = null;
        int int66 = tabela64.binaria(item65);
        ds.Item[] itemArray67 = tabela64.registros;
        tabela58.registros = itemArray67;
        int int69 = tabela58.n;
        ds.Item[] itemArray70 = tabela58.registros;
        tabela55.registros = itemArray70;
        tabela0.registros = itemArray70;
        ds.Item item73 = null;
        tabela0.insere(item73);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 35 + "'", int69 == 35);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
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
        int int15 = tabela0.n;
        tabela0.n = 0;
        tabela0.n = (short) 0;
        ds.Item[] itemArray20 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        tabela0.n = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
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
        int int12 = tabela0.n;
        tabela0.n = (byte) 100;
        tabela0.n = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        ds.Item[] itemArray13 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
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
        ds.Item[] itemArray19 = tabela0.registros;
        int int20 = tabela0.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        tabela21.insere(item25);
        tabela21.n = (-1);
        tabela21.n = (short) 0;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        ds.Item[] itemArray34 = tabela31.registros;
        tabela31.n = '#';
        int int37 = tabela31.n;
        ds.Item[] itemArray38 = tabela31.registros;
        tabela21.registros = itemArray38;
        tabela0.registros = itemArray38;
        int int41 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        int int13 = tabela8.binaria(item12);
        ds.Item[] itemArray14 = tabela8.registros;
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        int int19 = tabela17.binaria(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        tabela17.n = (short) 100;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        int int25 = tabela23.binaria(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        ds.Item item27 = null;
        int int28 = tabela23.binaria(item27);
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        int int31 = tabela29.binaria(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        tabela29.n = '#';
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        int int37 = tabela35.binaria(item36);
        ds.Item[] itemArray38 = tabela35.registros;
        tabela29.registros = itemArray38;
        tabela23.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        tabela0.n = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
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
        tabela0.n = 1;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        int int19 = tabela13.n;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela13.n = (byte) 1;
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela13.registros = itemArray24;
        tabela0.registros = itemArray24;
        tabela0.n = 35;
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = tabela0.pesquisa(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = null;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Item item16 = null;
        int int17 = tabela0.binaria(item16);
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(itemArray14);
        org.junit.Assert.assertNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        tabela0.insere(item12);
        int int14 = tabela0.n;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
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
        tabela0.n = (byte) 1;
        int int23 = tabela0.n;
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 32;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
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
        ds.Item[] itemArray15 = tabela0.registros;
        tabela0.n = ' ';
        tabela0.n = (short) 100;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        int int8 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        tabela0.n = (short) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        ds.Item item42 = null;
        tabela0.insere(item42);
        tabela0.n = '#';
        ds.Item[] itemArray46 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
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
        tabela0.n = 1;
        tabela0.n = ' ';
        int int16 = tabela0.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        int int19 = tabela17.binaria(item18);
        ds.Item[] itemArray20 = tabela17.registros;
        tabela17.n = '#';
        int int23 = tabela17.n;
        tabela17.n = (byte) -1;
        ds.Item item26 = null;
        tabela17.insere(item26);
        int int28 = tabela17.n;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        int int31 = tabela29.binaria(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        ds.Item item33 = null;
        int int34 = tabela29.binaria(item33);
        ds.Item[] itemArray35 = tabela29.registros;
        ds.Item[] itemArray36 = tabela29.registros;
        tabela17.registros = itemArray36;
        tabela0.registros = itemArray36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
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
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        int int12 = tabela10.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        tabela13.registros = itemArray22;
        int int24 = tabela13.n;
        ds.Item[] itemArray25 = tabela13.registros;
        tabela10.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        int int30 = tabela28.binaria(item29);
        ds.Item[] itemArray31 = tabela28.registros;
        ds.Item item32 = null;
        tabela28.insere(item32);
        tabela28.n = (-1);
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        ds.Item[] itemArray40 = tabela36.registros;
        tabela28.registros = itemArray40;
        ds.Item[] itemArray42 = tabela28.registros;
        tabela0.registros = itemArray42;
        ds.Item item44 = null;
        tabela0.insere(item44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        tabela0.n = 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item[] itemArray14 = tabela11.registros;
        int int15 = tabela11.n;
        ds.Item item16 = null;
        int int17 = tabela11.binaria(item16);
        tabela11.n = 100;
        tabela11.n = (byte) 10;
        ds.Item[] itemArray22 = tabela11.registros;
        tabela0.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        int int26 = tabela24.binaria(item25);
        ds.Item[] itemArray27 = tabela24.registros;
        ds.Item item28 = null;
        int int29 = tabela24.binaria(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Item[] itemArray33 = tabela30.registros;
        tabela30.n = '#';
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        tabela30.registros = itemArray39;
        tabela24.registros = itemArray39;
        int int42 = tabela24.n;
        ds.Item item43 = null;
        int int44 = tabela24.binaria(item43);
        ds.Item[] itemArray45 = tabela24.registros;
        tabela0.registros = itemArray45;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        int int49 = tabela47.binaria(item48);
        ds.Item[] itemArray50 = tabela47.registros;
        ds.Item item51 = null;
        int int52 = tabela47.binaria(item51);
        ds.Item item53 = null;
        int int54 = tabela47.binaria(item53);
        ds.Item[] itemArray55 = tabela47.registros;
        tabela0.registros = itemArray55;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Item[] itemArray60 = tabela57.registros;
        ds.Item item61 = null;
        tabela57.insere(item61);
        tabela57.n = (-1);
        ds.Tabela tabela65 = new ds.Tabela();
        ds.Item item66 = null;
        int int67 = tabela65.binaria(item66);
        ds.Item[] itemArray68 = tabela65.registros;
        ds.Item[] itemArray69 = tabela65.registros;
        tabela57.registros = itemArray69;
        tabela0.registros = itemArray69;
        ds.Item item72 = null;
        tabela0.insere(item72);
        ds.Item item74 = null;
        tabela0.insere(item74);
        ds.Item item76 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int77 = tabela0.pesquisa(item76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
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
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        int int21 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        tabela13.n = '4';
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        ds.Item[] itemArray39 = tabela21.registros;
        tabela13.registros = itemArray39;
        tabela0.registros = itemArray39;
        ds.Item item42 = null;
        tabela0.insere(item42);
        tabela0.n = 35;
        ds.Item[] itemArray46 = tabela0.registros;
        tabela0.n = 100;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        tabela49.insere(item50);
        ds.Item[] itemArray52 = tabela49.registros;
        ds.Item[] itemArray53 = tabela49.registros;
        ds.Item item54 = null;
        tabela49.insere(item54);
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item item57 = null;
        int int58 = tabela56.binaria(item57);
        ds.Item[] itemArray59 = tabela56.registros;
        tabela56.n = '#';
        int int62 = tabela56.n;
        tabela56.n = (byte) -1;
        ds.Item item65 = null;
        tabela56.insere(item65);
        ds.Item[] itemArray67 = tabela56.registros;
        tabela49.registros = itemArray67;
        ds.Item item69 = null;
        tabela49.insere(item69);
        ds.Item[] itemArray71 = tabela49.registros;
        tabela0.registros = itemArray71;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
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
        ds.Item item20 = null;
        int int21 = tabela0.binaria(item20);
        ds.Item item22 = null;
        tabela0.insere(item22);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tabela0.pesquisa(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
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
        ds.Item item16 = null;
        tabela0.insere(item16);
        int int18 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
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
        tabela0.n = 1;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.binaria(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
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
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Item[] itemArray27 = tabela21.registros;
        tabela0.registros = itemArray27;
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = '#';
        int int10 = tabela0.n;
        tabela0.n = '#';
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        ds.Item item17 = null;
        tabela13.insere(item17);
        int int19 = tabela13.n;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        int int22 = tabela20.binaria(item21);
        ds.Item[] itemArray23 = tabela20.registros;
        tabela13.registros = itemArray23;
        tabela13.n = 1;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        int int33 = tabela27.n;
        tabela27.n = (byte) -1;
        ds.Item item36 = null;
        tabela27.insere(item36);
        int int38 = tabela27.n;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        int int41 = tabela39.binaria(item40);
        ds.Item[] itemArray42 = tabela39.registros;
        ds.Item item43 = null;
        int int44 = tabela39.binaria(item43);
        ds.Item[] itemArray45 = tabela39.registros;
        ds.Item[] itemArray46 = tabela39.registros;
        tabela27.registros = itemArray46;
        tabela13.registros = itemArray46;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        int int51 = tabela49.binaria(item50);
        ds.Item[] itemArray52 = tabela49.registros;
        ds.Item item53 = null;
        tabela49.insere(item53);
        tabela49.n = (-1);
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        int int59 = tabela57.binaria(item58);
        ds.Item[] itemArray60 = tabela57.registros;
        ds.Item[] itemArray61 = tabela57.registros;
        tabela49.registros = itemArray61;
        tabela13.registros = itemArray61;
        tabela0.registros = itemArray61;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
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
        tabela0.n = 2;
        int int13 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = '#';
        int int8 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        tabela0.n = '4';
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.pesquisa(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
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
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tabela0.binaria(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        tabela0.registros = itemArray11;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        int int19 = tabela13.n;
        tabela13.n = (byte) -1;
        ds.Item item22 = null;
        tabela13.insere(item22);
        ds.Item[] itemArray24 = tabela13.registros;
        tabela0.registros = itemArray24;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        int int28 = tabela26.binaria(item27);
        ds.Item[] itemArray29 = tabela26.registros;
        tabela26.n = '#';
        int int32 = tabela26.n;
        ds.Item[] itemArray33 = tabela26.registros;
        tabela26.n = '#';
        int int36 = tabela26.n;
        ds.Item[] itemArray37 = tabela26.registros;
        tabela0.registros = itemArray37;
        int int39 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
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
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        int int24 = tabela21.n;
        ds.Item[] itemArray25 = tabela21.registros;
        tabela0.registros = itemArray25;
        int int27 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (byte) -1;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        tabela0.n = '4';
        ds.Item[] itemArray20 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        int int26 = tabela21.binaria(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        int int29 = tabela27.binaria(item28);
        ds.Item[] itemArray30 = tabela27.registros;
        tabela27.n = '#';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        tabela27.registros = itemArray36;
        tabela21.registros = itemArray36;
        int int39 = tabela21.n;
        ds.Item item40 = null;
        int int41 = tabela21.binaria(item40);
        ds.Item[] itemArray42 = tabela21.registros;
        tabela0.registros = itemArray42;
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.pesquisa(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        int int10 = tabela0.n;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        ds.Item item22 = null;
        tabela18.insere(item22);
        int int24 = tabela18.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item item26 = null;
        int int27 = tabela25.binaria(item26);
        ds.Item[] itemArray28 = tabela25.registros;
        tabela18.registros = itemArray28;
        tabela18.n = 1;
        ds.Item[] itemArray32 = tabela18.registros;
        tabela0.registros = itemArray32;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        int int36 = tabela34.binaria(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        ds.Item item38 = null;
        tabela34.insere(item38);
        int int40 = tabela34.n;
        ds.Item[] itemArray41 = tabela34.registros;
        tabela0.registros = itemArray41;
        ds.Item item43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = tabela0.binaria(item43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
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
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        int int24 = tabela21.n;
        ds.Item[] itemArray25 = tabela21.registros;
        tabela0.registros = itemArray25;
        ds.Item[] itemArray27 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        tabela0.registros = itemArray9;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        int int13 = tabela8.binaria(item12);
        ds.Item[] itemArray14 = tabela8.registros;
        tabela0.registros = itemArray14;
        tabela0.n = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
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
        ds.Item item11 = null;
        tabela7.insere(item11);
        tabela7.n = (-1);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Item[] itemArray19 = tabela15.registros;
        tabela7.registros = itemArray19;
        ds.Item[] itemArray21 = tabela7.registros;
        ds.Item[] itemArray22 = tabela7.registros;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray24 = tabela0.registros;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.binaria(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        ds.Item item11 = null;
        int int12 = tabela7.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        int int15 = tabela13.binaria(item14);
        ds.Item[] itemArray16 = tabela13.registros;
        tabela13.n = '#';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        tabela13.registros = itemArray22;
        tabela7.registros = itemArray22;
        int int25 = tabela7.n;
        ds.Item[] itemArray26 = tabela7.registros;
        tabela0.registros = itemArray26;
        tabela0.n = (short) 10;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = tabela0.pesquisa(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
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
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        int int20 = tabela18.binaria(item19);
        ds.Item[] itemArray21 = tabela18.registros;
        tabela18.n = '#';
        int int24 = tabela18.n;
        int int25 = tabela18.n;
        ds.Item[] itemArray26 = tabela18.registros;
        tabela0.registros = itemArray26;
        ds.Item item28 = null;
        int int29 = tabela0.binaria(item28);
        int int30 = tabela0.n;
        ds.Item[] itemArray31 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
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
        tabela0.n = 97;
        tabela0.n = 32;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        int int9 = tabela7.binaria(item8);
        ds.Item[] itemArray10 = tabela7.registros;
        int int11 = tabela7.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        int int14 = tabela12.binaria(item13);
        ds.Item[] itemArray15 = tabela12.registros;
        tabela7.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.binaria(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Item item12 = null;
        int int13 = tabela8.binaria(item12);
        ds.Item[] itemArray14 = tabela8.registros;
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        int int21 = tabela19.binaria(item20);
        ds.Item[] itemArray22 = tabela19.registros;
        ds.Item item23 = null;
        tabela19.insere(item23);
        int int25 = tabela19.n;
        ds.Item[] itemArray26 = tabela19.registros;
        tabela19.n = (byte) 1;
        ds.Item item29 = null;
        tabela19.insere(item29);
        ds.Item item31 = null;
        tabela19.insere(item31);
        int int33 = tabela19.n;
        ds.Item item34 = null;
        tabela19.insere(item34);
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Item[] itemArray39 = tabela36.registros;
        ds.Item item40 = null;
        int int41 = tabela36.binaria(item40);
        ds.Item[] itemArray42 = tabela36.registros;
        ds.Item[] itemArray43 = tabela36.registros;
        ds.Item[] itemArray44 = tabela36.registros;
        tabela19.registros = itemArray44;
        tabela0.registros = itemArray44;
        int int47 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
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
        ds.Item[] itemArray19 = tabela0.registros;
        int int20 = tabela0.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Item item25 = null;
        tabela21.insere(item25);
        tabela21.n = (-1);
        tabela21.n = (short) 0;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        ds.Item[] itemArray34 = tabela31.registros;
        tabela31.n = '#';
        int int37 = tabela31.n;
        ds.Item[] itemArray38 = tabela31.registros;
        tabela21.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Item[] itemArray41 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

